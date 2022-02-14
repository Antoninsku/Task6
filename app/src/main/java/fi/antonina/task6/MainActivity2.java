package fi.antonina.task6;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private static final String TAG = "MainActivity2";
    TextView t1, t2, t3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        t1 = findViewById(R.id.textView7);

        String incomingName1 = getIntent().getStringExtra("name");
        t1.setText(incomingName1);


        t2 = findViewById(R.id.textView8);

        String incomingName2 = getIntent().getStringExtra("date");
        t2.setText(incomingName2);


        t3 = findViewById(R.id.textView9);


        String incomingName3 = getIntent().getStringExtra("freeText");
        t3.setText(incomingName3);

    }
}