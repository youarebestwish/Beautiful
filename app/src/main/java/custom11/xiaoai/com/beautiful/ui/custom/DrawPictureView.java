package custom11.xiaoai.com.beautiful.ui.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import custom11.xiaoai.com.beautiful.utils.L;

/**
 * Created by wangC on 2016/11/22.
 */

public class DrawPictureView extends BaseView {


    private Picture mPicture=new Picture();

    private void recording(){
        // 开始录制 (接收返回值Canvas)
        Canvas canvas = mPicture.beginRecording(500, 500);
        // 创建一个画笔
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);

        L.e("recording");
        // 在Canvas中具体操作
        // 位移
        canvas.translate(250,250);
        // 绘制一个圆
        canvas.drawCircle(0,0,100,paint);

        mPicture.endRecording();

    }


    public DrawPictureView(Context context, AttributeSet attrs  ) {
        super(context, attrs);
        recording();
        L.e("DrawPictureView");

    }

    public DrawPictureView(Context context) {
        super(context,null);

    }






    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = new RectF(200, 200, 500,600);
        canvas.drawRect(rectF,p);
       L.e(mPicture.getHeight()+" "+mPicture.getWidth());
        canvas.drawPicture(mPicture, rectF );



    }
}
