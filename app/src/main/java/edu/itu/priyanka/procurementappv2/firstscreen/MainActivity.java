package edu.itu.priyanka.procurementappv2.firstscreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import edu.itu.priyanka.procurementappv2.R;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.actionListView);
        MainItemAdapter mainItemAdapter = new MainItemAdapter(this);
        listView.setAdapter(mainItemAdapter);

    }
}






