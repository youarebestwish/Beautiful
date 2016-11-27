package custom11.xiaoai.com.beautiful.ui.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by wangC on 2016/11/24.
 */

public class BaseView extends View {
    public Paint p;


    private void initPaint(){
        p=new Paint();
        p.setColor(Color.RED);
        p.setStyle(Paint.Style.STROKE);
        p.setAntiAlias(true);
        p.setStrokeWidth(1);

    }

    public BaseView(Context context) {
        super(context,null);

    }

    public BaseView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for(int x=0;x<getWidth();x+=50){
            canvas.drawLine(x,0,x,getHeight(),p);

        }
        p.setColor(Color.BLUE);
        for(int j=0;j<getHeight();j+=50){
            canvas.drawLine(0,j,getWidth(),j,p);
        }
    }
}
