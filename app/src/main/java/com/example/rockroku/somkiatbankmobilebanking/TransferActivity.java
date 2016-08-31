package com.example.rockroku.somkiatbankmobilebanking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.rockroku.somkiatbankmobilebanking.common.BaseActivity;

public class TransferActivity extends BaseActivity implements View.OnClickListener {

    private Button mBtTransfer;
    private Spinner mSpinnerAccountName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        bindView();
        setViewListener();
        //initAccountNameSpiner();
    }

    private void bindView() {
        mBtTransfer = (Button) findViewById(R.id.bt_transfer_transfer_activity);

       // Spinner spinner = (Spinner) findViewById(R.id.spinner_account_name);
    }

    private void setViewListener() {
        mBtTransfer.setOnClickListener(this);
    }

    private void initAccountNameSpiner() {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.account_name_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        mSpinnerAccountName.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        if (view == mBtTransfer) {
            // open confirm page
            openActivity(ConfirmActivity.class);
        }
    }
}
