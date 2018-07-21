package edu.itu.priyanka.procurementappv2.secondscreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import edu.itu.priyanka.procurementappv2.R;


public class SecondActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        listView = findViewById(R.id.actionListView);
        ApprovalListAdapter mainItemAdapter = new ApprovalListAdapter(this);
        listView.setAdapter(mainItemAdapter);

    }
}
