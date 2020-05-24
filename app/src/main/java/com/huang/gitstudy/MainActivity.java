package com.huang.gitstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv_msg);
        textView.setText("第一个分支");

        //我是第二个分支

        //第一个分支修改
        textView.setText("第一个分支修改");
    }

    private void initView(){

    }

    //fhjjjfjjfdasfkds

}
