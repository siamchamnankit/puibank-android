package com.example.rockroku.somkiatbankmobilebanking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.rockroku.somkiatbankmobilebanking.common.BaseActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private TextView mTvName;
    private TextView mTvAccountNo;
    private TextView mTvBalance;
    private Button mBtTransfer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindView();
        setViewListener();

    }

    private void bindView() {
        mTvName = (TextView) findViewById(R.id.tv_name);
        mTvAccountNo  = (TextView) findViewById(R.id.tv_account_no);
        mTvBalance = (TextView) findViewById(R.id.tv_balance);
        mBtTransfer = (Button) findViewById(R.id.bt_transfer);
    }

    private void setViewListener() {
        mBtTransfer.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(view == mBtTransfer) {
            //goto next transfer page
            openActivity(TransferActivity.class);
        }
    }
}
