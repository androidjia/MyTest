package com.mingnuo.mytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    LinearLayout linearLayout_zhixun;
    LinearLayout linearLayout_jaoyi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    private void initListener() {
        linearLayout_zhixun.setOnClickListener(this);
        linearLayout_jaoyi.setOnClickListener(this);
    }

    private void initView() {
        linearLayout_jaoyi = (LinearLayout) findViewById(R.id.linear_jiaoyi);
        linearLayout_zhixun = (LinearLayout) findViewById(R.id.linear_zhixun);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.linear_jiaoyi:
                Intent in = new Intent(MainActivity.this,TransactionActivity.class);
                startActivity(in);
                break;

            case R.id.linear_zhixun:

                break;
        }
    }
}
