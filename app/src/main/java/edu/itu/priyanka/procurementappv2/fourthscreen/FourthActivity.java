package edu.itu.priyanka.procurementappv2.fourthscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import edu.itu.priyanka.procurementappv2.R;

public class FourthActivity extends AppCompatActivity {
    private ListView receiptListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        receiptListView = findViewById(R.id.receiptListView);
        ReceiptListAdapter adapter = new ReceiptListAdapter(this);
        receiptListView.setAdapter(adapter);
    }
}
