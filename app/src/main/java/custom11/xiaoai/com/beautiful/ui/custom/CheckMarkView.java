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

    private  int bitmapWidth;

    private int bitmapHeight;



    public CheckMarkView(Context context) {
        super(context,null);
    }

    public CheckMarkView(Context context, AttributeSet attrs ) {
        super(context, attrs);
        bitmap= BitmapFactory.decodeResource(context.getResources(), R.drawable.checkmark);
        bitmapWidth=bitmap.getWidth()/10;
        bitmapHeight=bitmap.getHeight();

    }


    private  int page=0;



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(getWidth()/2,getHeight()/2);
        p.setStyle(Paint.Style.FILL);
        canvas.drawCircle(0,0,bitmapWidth/2*1.1f,p);


        Rect tof=new Rect(-bitmapWidth/2,-bitmapHeight/2,bitmapWidth/2,bitmapHeight/2);

        Rect srcf=  new Rect(page*bitmapWidth,0,(page+1 )*bitmapWidth,bitmapHeight);


        canvas.drawBitmap(bitmap,srcf,tof,null
        );

       try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(page<9 ){
            page++;
            L.e("page=" +page);
            invalidate();
        }



    }
}
