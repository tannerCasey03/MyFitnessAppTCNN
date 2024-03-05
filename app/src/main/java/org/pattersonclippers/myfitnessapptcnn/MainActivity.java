package org.pattersonclippers.myfitnessapptcnn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button upperBTN,lowerBTN,cardBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        upperBTN = (Button) findViewById(R.id.upperBTN);
        lowerBTN = (Button) findViewById(R.id.lowerBTN);
        cardBTN = (Button) findViewById(R.id.cardBTN);
    }
}