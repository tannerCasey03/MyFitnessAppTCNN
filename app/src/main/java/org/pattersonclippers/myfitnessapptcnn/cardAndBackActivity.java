package org.pattersonclippers.myfitnessapptcnn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class cardAndBackActivity extends AppCompatActivity {

    Button plankBTN,bentBTN,raiseBTN,kneesBTN,jacksBTN,shuffleBTN;

    ImageView pic;

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
       pic = (ImageView)  findViewById(R.id.pic);

        plankBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { pic.setImageResource(R.drawable.sideplank); }
        });

        bentBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {pic.setImageResource(R.drawable.bent); }
        });

        raiseBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {pic.setImageResource(R.drawable.raises); }
        });

        kneesBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { pic.setImageResource(R.drawable.knees); }
        });

        jacksBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {pic.setImageResource(R.drawable.jacks); }
        });

        shuffleBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {pic.setImageResource(R.drawable.shuffle); }
        });
    }
}