package custom11.xiaoai.com.beautiful.ui.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import java.awt.font.NumericShaper;

import custom11.xiaoai.com.beautiful.R;

/**
 * Created by wangC on 2016/11/22.
 */

public class EasyView extends View {


    private Paint p=new Paint();


    public EasyView(Context context, AttributeSet attrs  ) {
        super(context, attrs);
        initPaint();
    }

    public EasyView(Context context) {
        super(context,null);

    }




    private void initPaint(){
        p.setColor(Color.BLACK);
        p.setStyle(Paint.Style.STROKE);//填充模式
        p.setStrokeWidth(10f) ;
        p.setAntiAlias(true);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        p.setStyle(Paint.Style.STROKE);

        //画一个 高度为 800.宽度为300 ，角度为 Rx 10，Ry 20
         RectF rectF=new RectF(100,20,800,720);

         canvas.drawCircle(450,370,350,p);

        p.setStyle(Paint.Style.FILL);

        canvas.drawArc(rectF,-90,210,true,p);


        p.setColor(Color.WHITE);

        canvas.drawArc(rectF,-90+210,100,true,p);

        p.setColor(Color.RED);

        canvas.drawArc(rectF,-90+210+100,40,true,p);



        p.setColor(Color.parseColor("#6f599c"));
        canvas.drawArc(rectF,-90+210+100+40,10,true,p);




    }
}
