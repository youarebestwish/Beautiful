package custom11.xiaoai.com.beautiful;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import custom11.xiaoai.com.beautiful.ui.BaseActivity;
import custom11.xiaoai.com.beautiful.ui.adapter.CustomViewAdapter;

public class MainActivity extends BaseActivity {

    private Button mCustom_bt;

    private RecyclerView  mCustom_cy;

    private RecyclerView.LayoutManager  mLayoutManager;

    private CustomViewAdapter mCustomViewAdapter;





    @Override
    protected void initView() {
       setContentView(R.layout.activity_main);
        mCustom_cy=(RecyclerView)findViewById(R.id.ac_custom_list_cy);
        mLayoutManager=new LinearLayoutManager(this);
        mCustom_cy.setLayoutManager(mLayoutManager);
        mCustomViewAdapter=new CustomViewAdapter(this);
        mCustom_cy.setAdapter(mCustomViewAdapter);


    }
}
