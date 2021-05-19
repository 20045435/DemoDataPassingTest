package sg.edu.rp.c346.id20045435.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswer = findViewById(R.id.textView);

        Intent intentReceived = getIntent();
        int value = intentReceived.getIntExtra("value", 0);
        char cValue = intentReceived.getCharExtra("value", 'z');
        double dValue = intentReceived.getDoubleExtra("value", 0.0);
        tvAnswer.setText("Integer value received is: " + value + "\nCharacter value received is: " + cValue + "\nDouble value recieved is: " + dValue);
    }
}