package com.mingnuo.mytest;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.mingnuo.mytest.bean.RecordBean;

import java.util.List;

/**
 * Created by Administrator on 2017/4/16.
 */

public class TransactionAdapter extends BaseAdapter {
    Context context;
    List<RecordBean> data;

    public TransactionAdapter(Context context, List<RecordBean> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.transaction_adapter_item,null);
            holder = new ViewHolder();
            holder.tv_monery = (TextView) view.findViewById(R.id.monery_text);
            holder.tv_number = (TextView) view.findViewById(R.id.number_text);
            holder.tv_ordernumber = (TextView) view.findViewById(R.id.ordernumber);
            holder.tv_status = (TextView) view.findViewById(R.id.status_text);
            holder.tv_time = (TextView) view.findViewById(R.id.time_text);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        holder.tv_time.setText(data.get(i).getTime());
        holder.tv_status.setText(data.get(i).getState());
        holder.tv_ordernumber.setText(data.get(i).getOrdernumber());
        holder.tv_number.setText(data.get(i).getNumber());
        holder.tv_monery.setText("￥"+data.get(i).getMoney());
        return view;
    }
    class ViewHolder{
        TextView tv_status;
        TextView tv_ordernumber;
        TextView tv_monery;
        TextView tv_time;
        TextView tv_number;
    }
}
