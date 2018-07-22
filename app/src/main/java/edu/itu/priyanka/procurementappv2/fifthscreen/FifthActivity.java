package edu.itu.priyanka.procurementappv2.fifthscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import edu.itu.priyanka.procurementappv2.R;
import edu.itu.priyanka.procurementappv2.firstscreen.MainActivity;

public class FifthActivity extends AppCompatActivity {
    private TextView quantity, price;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        quantity = findViewById(R.id.editText);
        price = findViewById(R.id.editText2);
        submitButton = findViewById(R.id.button5);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(quantity.getText()) && !TextUtils.isEmpty(price.getText())) {
                    Intent homescreenIntent = new Intent(FifthActivity.this, MainActivity.class);
                    startActivity(homescreenIntent);
                    finish();
                }
            }
        });

    }
}
