package org.pattersonclippers.myfitnessapptcnn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class cardAndBackActivity extends AppCompatActivity {

    Button plankBTN,bentBTN,raiseBTN,kneesBTN,jacksBTN,shuffleBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_and_back);
        plankBTN = (Button) findViewById(R.id.plankBTN);
        bentBTN = (Button) findViewById(R.id.bentBTN);
        raiseBTN = (Button) findViewById(R.id.raiseBTN);
        kneesBTN = (Button) findViewById(R.id.kneesBTN);
       jacksBTN = (Button) findViewById(R.id.jacksBTN);
       shuffleBTN = (Button) findViewById(R.id.shuffleBTN);
    }
}