package org.pattersonclippers.myfitnessapptcnn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class upperBodyActivity extends AppCompatActivity {

    Button pushBTN,burpBTN,extendBTN;
    ImageView picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upper_body);

        picture = (ImageView) findViewById(R.id.picture);
        pushBTN = (Button) findViewById(R.id.pushBTN);
        burpBTN = (Button) findViewById(R.id.burpBTN);
        extendBTN = (Button) findViewById(R.id.extendBTN);

        pushBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                picture.setImageResource(R.drawable.pushups);
            }
        });

        burpBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                picture.setImageResource(R.drawable.burp);
            }
        });

        extendBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                picture.setImageResource(R.drawable.overhead);
            }
        });
    }
}