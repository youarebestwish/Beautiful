package custom11.xiaoai.com.beautiful.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public  abstract class BaseActivity  extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();

    }


    protected abstract  void initView() ;


}
