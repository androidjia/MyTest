package com.mingnuo.mytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.mingnuo.mytest.bean.RecordBean;

import java.util.ArrayList;
import java.util.List;

public class TransactionActivity extends AppCompatActivity {
    private ListView listView;
    private List<RecordBean> data;
    private TransactionAdapter adapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);
        data = new ArrayList<>();
        initView();
        initData();
    }

    private void initData() {
        for (int i=0;i<10;i++){
            RecordBean bean = new RecordBean();
            bean.setMoney("100"+i);
            bean.setTime("2017/4/16 19:5"+i);
            bean.setOrdernumber("1561541564451156156"+i);
            bean.setNumber(i+"");
            if (i%2==0){
                bean.setState("已完成");
            }else {
                bean.setState("未完成");
            }
            data.add(bean);
        }
         adapter = new TransactionAdapter(this,data);
        listView.setAdapter(adapter);
    }

    private void initView() {
        listView = (ListView) findViewById(R.id.transaction_lv);
    }
}
