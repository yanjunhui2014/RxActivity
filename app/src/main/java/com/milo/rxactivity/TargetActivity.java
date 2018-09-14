package com.milo.rxactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

/**
 * 标题：
 * 功能：
 * 备注：
 * <p>
 * Created by Milo
 * E-Mail : 303767416@qq.com
 * 2018/9/14 10:22
 */
public class TargetActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTvValue;

    private String mValue;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
        setTitle(getClass().getSimpleName());

        findViewById(R.id.mBtnBack).setOnClickListener(this);
        mTvValue = findViewById(R.id.mTvValue);
        mValue = String.valueOf(new Random().nextInt(100));
        mTvValue.setText(mValue);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mBtnBack:
                Intent intent = new Intent();
                intent.putExtra("extra", mValue);
                setResult(RESULT_OK, intent);
                finish();
                break;
        }
    }

}
