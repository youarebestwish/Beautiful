package custom11.xiaoai.com.beautiful.ui.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import custom11.xiaoai.com.beautiful.ui.BaseActivity;

/**
 * Created by wangC on 2016/11/24.
 */

public class CellView extends BaseView {


    public CellView(Context context) {
        super(context,null);
    }

    public CellView(Context context, AttributeSet attrs ) {
        super(context, attrs);

    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        p.setColor(Color.YELLOW);


        p.setStrokeWidth(10);
        p.setStyle(Paint.Style.FILL);
        // 将坐标系原点移动到画布正中心
        canvas.translate(getWidth() / 2, getHeight() / 2);

        RectF rect = new RectF(0,-400,400,0);   // 矩形区域

        p.setColor(Color.BLACK);           // 绘制黑色矩形
        for(int i=0;i<20;i++){
            canvas.drawRect(rect,p);
            canvas.scale(0.9f,0.9f );
        }






















    }
}
