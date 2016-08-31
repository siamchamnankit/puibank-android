package com.example.rockroku.somkiatbankmobilebanking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEtName;
    private EditText mEtBalance;
    private Button mBtTransfer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindView();

    }

    private void bindView() {
        mEtName = (EditText) findViewById(R.id.et_name);
        mEtBalance  = (EditText) findViewById(R.id.et_balance);
        mBtTransfer = (Button) findViewById(R.id.bt_transfer);
    }


    @Override
    public void onClick(View view) {
        if(view == mBtTransfer) {
            //goto next transfer page
        }
    }
}
