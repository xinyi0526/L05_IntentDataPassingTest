package sg.edu.rp.c346.intentdatapassingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvAns1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvAns1 = findViewById(R.id.textView4);
        Intent intentReceived = getIntent();
        double value2 = intentReceived.getDoubleExtra("value",99.99);
        tvAns1.setText("Double value received is: " + value2);
    }
}
