package custom11.xiaoai.com.beautiful.ui.custom;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;

import custom11.xiaoai.com.beautiful.R;
import custom11.xiaoai.com.beautiful.utils.L;

/**
 * Created by wangC on 2016/11/24.
 */

public class CheckMarkView extends BaseView {

    private Bitmap bitmap;

    public CheckMarkView(Context context) {
        super(context,null);
    }

    public CheckMarkView(Context context, AttributeSet attrs ) {
        super(context, attrs);
        bitmap= BitmapFactory.decodeResource(context.getResources(), R.drawable.checkmark);


    }


   private  int i=0;

    private Rect srcf;

    private Rect tof=new Rect(-200,-200,200,200);

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(getWidth()/2,getHeight()/2);
        p.setStyle(Paint.Style.FILL);
        canvas.drawCircle(0,0,250,p);

        srcf= new Rect(i*100,0,(i+1 )*100,100);


        canvas.drawBitmap(bitmap,srcf,tof,null
        );

      /*  try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(i<10 ){
            i++;
            L.e("i=" +i);
            invalidate();
        }*/



    }
}
