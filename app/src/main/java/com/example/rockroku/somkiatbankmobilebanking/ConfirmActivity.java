package com.example.rockroku.somkiatbankmobilebanking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rockroku.somkiatbankmobilebanking.common.BaseActivity;

public class ConfirmActivity extends BaseActivity implements View.OnClickListener {

    private Button mBtConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        bindView();

        setViewListener();
    }

    private void bindView() {
        mBtConfirm = (Button) findViewById(R.id.btn_confirm);
    }

    private void setViewListener() {
        mBtConfirm.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == mBtConfirm) {
            openActivity(TransferResultActivity.class);
        }
    }
}
