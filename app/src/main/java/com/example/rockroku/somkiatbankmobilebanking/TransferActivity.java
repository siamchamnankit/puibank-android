package com.example.rockroku.somkiatbankmobilebanking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rockroku.somkiatbankmobilebanking.common.BaseActivity;

public class TransferActivity extends BaseActivity implements View.OnClickListener {

    private Button mBtTransfer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        bindView();
        setViewListener();
    }

    private void bindView() {
        mBtTransfer = (Button) findViewById(R.id.bt_transfer_transfer_activity);
    }

    private void setViewListener() {
        mBtTransfer.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == mBtTransfer) {
            // open confirm page
            openActivity(ConfirmActivity.class);
        }
    }
}
