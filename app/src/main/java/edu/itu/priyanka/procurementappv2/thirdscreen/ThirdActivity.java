package edu.itu.priyanka.procurementappv2.thirdscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import edu.itu.priyanka.procurementappv2.R;
import edu.itu.priyanka.procurementappv2.fifthscreen.FifthActivity;
import edu.itu.priyanka.procurementappv2.fourthscreen.ReceiptItemModel;
import edu.itu.priyanka.procurementappv2.secondscreen.ApprovalItemModel;

public class ThirdActivity extends AppCompatActivity {

    private ApprovalItemModel approvalItem;

    private TextView idTextView, amountTextView, dateTextView, title;

    private ReceiptItemModel receiptItem;

    private Button approveButton, rejectButton, manageReceiptButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        idTextView = findViewById(R.id.idTextView);
        amountTextView = findViewById(R.id.amountTextView);
        dateTextView = findViewById(R.id.dateTextView);
        title = findViewById(R.id.textView);
        approveButton = findViewById(R.id.button2);
        rejectButton = findViewById(R.id.button3);
        manageReceiptButton = findViewById(R.id.button4);

        approvalItem = getIntent().getParcelableExtra("ApprovalModel");

        if (approvalItem != null) {
            idTextView.setText(approvalItem.getApprovalId());
            amountTextView.setText(approvalItem.getApprovalAmount());
            dateTextView.setText(approvalItem.getApprovalDate());
            title.setText("PR Approval");
            manageReceiptButton.setVisibility(View.GONE);
        }

        receiptItem = getIntent().getParcelableExtra("ReceiptModel");

        if (receiptItem != null) {
            idTextView.setText(receiptItem.getReceiptId());
            amountTextView.setText(receiptItem.getReceiptAmount());
            dateTextView.setText(receiptItem.getReceiptDate());
            title.setText("PR Receipts");
            manageReceiptButton.setVisibility(View.VISIBLE);
            manageReceiptButton.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Intent manageReceiptIntent = new Intent(ThirdActivity.this, FifthActivity.class);
                    startActivity(manageReceiptIntent);
                }
            });
            approveButton.setVisibility(View.GONE);
            rejectButton.setVisibility(View.GONE);
        }


    }
}
