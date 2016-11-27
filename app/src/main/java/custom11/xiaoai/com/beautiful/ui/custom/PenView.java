package custom11.xiaoai.com.beautiful.ui.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import java.util.List;

import static custom11.xiaoai.com.beautiful.R.string.view;

/**
 * Created by wangC on 2016/11/23.
 */

public class PenView extends View {

    private Paint paint;

    // 颜色表 (注意: 此处定义颜色使用的是ARGB，带Alpha通道的)
    private int[] mColors = {0xFFCCFF00, 0xFF6495ED, 0xFFE32636, 0xFF800000, 0xFF808000, 0xFFFF8C69, 0xFF808080,
            0xFFE6B800, 0xFF7CFC00};

    private float mStartAngle=-90;//开始的角度

    public void setArrays(List<Float> arrays) {
        this.arrays = arrays;
    }

    private List<Float > arrays;

    // 宽高
    private int mWidth, mHeight;

    private void initPaint(){
        paint=new Paint();
        paint.setColor(Color.parseColor("#123123"));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(1f);
    }

    public PenView(Context context) {
        super(context, null);

    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
    }
    public PenView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaint();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(null==arrays){
            return;
        }
        canvas.translate(mWidth/2,mHeight/2);

        float r= (float) (Math.min(mHeight,mWidth)/2*0.8);//确定半径

        RectF rectF=new RectF(-r,-r,r,r);//画图范围

        for(int  i=0;i<arrays.size();i++){
            paint.setColor(mColors[i]);
            canvas.drawArc(rectF,mStartAngle,360f*arrays.get(i),true,paint);
            mStartAngle+=360f*arrays.get(i);
        }

    }
}
