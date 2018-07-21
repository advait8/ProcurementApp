package edu.itu.priyanka.procurementappv2.thirdscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import edu.itu.priyanka.procurementappv2.R;
import edu.itu.priyanka.procurementappv2.secondscreen.ApprovalItemModel;

public class ThirdActivity extends AppCompatActivity {

    private ApprovalItemModel approvalItem;

    private TextView idTextView, amountTextView, dateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        idTextView = findViewById(R.id.idTextView);
        amountTextView = findViewById(R.id.amountTextView);
        dateTextView = findViewById(R.id.dateTextView);

        approvalItem = getIntent().getParcelableExtra("ApprovalModel");

        if (approvalItem != null) {
            idTextView.setText(approvalItem.getApprovalId());
            amountTextView.setText(approvalItem.getApprovalAmount());
            dateTextView.setText(approvalItem.getApprovalDate());
        }
    }
}
