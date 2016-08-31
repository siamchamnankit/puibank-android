package com.example.rockroku.somkiatbankmobilebanking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.rockroku.somkiatbankmobilebanking.common.BaseActivity;

public class TransferResultActivity extends BaseActivity implements View.OnClickListener {
    private Button mBtBackToHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_result);

        bindView();
        setViewListener();
    }

    private void bindView() {
        mBtBackToHome = (Button) findViewById(R.id.bt_back_to_home);
    }

    private void setViewListener() {
        mBtBackToHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == mBtBackToHome) {
            Log.v("TransferResultActivity", "onClick mBtBackToHome");
            openActivity(MainActivity.class);
        }
    }
}

