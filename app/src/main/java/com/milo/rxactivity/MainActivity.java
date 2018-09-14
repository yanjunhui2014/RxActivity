package com.milo.rxactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.milo.rxactivitylib.ActivityOnResult;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTvContent;

    private ActivityOnResult mActivityOnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(getClass().getSimpleName());

        mActivityOnResult = new ActivityOnResult(this);
        findViewById(R.id.mBtnJump).setOnClickListener(this);
        mTvContent = findViewById(R.id.mTvContent);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mBtnJump:
                mActivityOnResult.startForResult(TargetActivity.class, 1, new ActivityOnResult.Callback() {
                    @Override
                    public void onActivityResult(int requestCode, int resultCode, Intent data) {
                        if (resultCode == RESULT_OK) {
                            String extra = data.getStringExtra("extra");
                            mTvContent.setText(extra);
                        }
                    }
                });
                break;
        }
    }

}
