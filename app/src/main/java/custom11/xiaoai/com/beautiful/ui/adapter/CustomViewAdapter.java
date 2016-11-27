package custom11.xiaoai.com.beautiful.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.LayoutInflaterFactory;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import custom11.xiaoai.com.beautiful.R;
import custom11.xiaoai.com.beautiful.ui.BaseActivity;
import custom11.xiaoai.com.beautiful.ui.activity.CellViewActivity;
import custom11.xiaoai.com.beautiful.ui.activity.EasyCustomActivity;

public class CustomViewAdapter extends BaseAdapter {


    private Context mContext;

    private List<String> mList = new ArrayList<String>();
    private List<Class> mActivitys = new ArrayList<>();

    public CustomViewAdapter(Context mContext) {
        this.mContext = mContext;
        initData();
        initActivity();
    }

    private void initActivity() {
        mActivitys.add(EasyCustomActivity.class);

        mActivitys.add(CellViewActivity.class);
    }

    private void initData() {
        mList.add("PEN CustomView");
        mList.add("CELL CustomView");

    }



    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(mContext).inflate(R.layout.item_custom_view,parent,false);
        CustomViewHolder holder = new CustomViewHolder(v);
        return holder;

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        CustomViewHolder holder1 = (CustomViewHolder) holder;
        holder1.mName_tv.setText(mList.get(position));
        ((CustomViewHolder) holder).mName_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = null;
                i = new Intent(mContext, mActivitys.get(position));
                mContext.startActivity(i);



            }
        });

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


    class CustomViewHolder extends RecyclerView.ViewHolder {

        private TextView mName_tv;

        public CustomViewHolder(View itemView) {
            super(itemView);
            mName_tv = (TextView) itemView.findViewById(R.id.item_custom_view_name_tv);
        }
    }

}
