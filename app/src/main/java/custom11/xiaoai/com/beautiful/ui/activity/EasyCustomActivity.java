package custom11.xiaoai.com.beautiful.ui.activity;

import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import java.util.ArrayList;

import custom11.xiaoai.com.beautiful.R;
import custom11.xiaoai.com.beautiful.ui.BaseActivity;
import custom11.xiaoai.com.beautiful.ui.custom.PenView;

public class EasyCustomActivity extends BaseActivity {

    private PenView mPenview;


    @Override
    protected void initView() {
       setContentView(R.layout.ac_easycustom);
        mPenview= (PenView) findViewById(R.id.ac_pen_view);
        ArrayList<Float> integers=new ArrayList<Float>();
        integers.add( 0.1f);
        integers.add( 0.2f);
        integers.add( 0.3f);
        integers.add( 0.1f);
        integers.add( 0.3f);

        mPenview.setArrays(integers);
    }
}
