package sg.edu.rp.c346.intentdatapassingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvAns = findViewById(R.id.textView2);
        Intent intentReceived = getIntent();
        char value1 = intentReceived.getCharExtra("value",'a');
        tvAns.setText("Character value received is: " + value1);

    }
}
