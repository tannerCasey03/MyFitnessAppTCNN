package org.pattersonclippers.myfitnessapptcnn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class lowerBodyActivity extends AppCompatActivity {

    Button lungBTN,squatBTN,calfBTN;

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lower_body);
        lungBTN= (Button) findViewById(R.id.lungBTN);
        squatBTN = (Button) findViewById(R.id.squatBTN);
        calfBTN = (Button) findViewById(R.id.calfBTN);

        /*
        lungBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.lunges);
            }
        });

        squatBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.squat);
            }
        });

        calfBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.calf);
            }
        });*/
    }
}