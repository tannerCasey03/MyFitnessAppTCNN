package org.pattersonclippers.myfitnessapptcnn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button upperBTN,lowerBTN,cardBTN,addBTN,resetBTN;
    TextView totalCalTV;
    EditText calorieET;
    int total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        upperBTN = (Button) findViewById(R.id.upperBTN);
        lowerBTN = (Button) findViewById(R.id.lowerBTN);
        cardBTN = (Button) findViewById(R.id.cardBTN);
        addBTN = (Button) findViewById(R.id.addBTN);
        resetBTN = (Button) findViewById(R.id.resetBTN);
        totalCalTV = (TextView) findViewById(R.id.totalCalTV);
        calorieET = (EditText) findViewById(R.id.calorieET);

        total = 0;




        upperBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, upperBodyActivity.class);
                startActivity(myIntent);
            }


        });


        lowerBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, lowerBodyActivity.class);
                startActivity(myIntent);
            }


        });


        cardBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, cardAndBackActivity.class);
                startActivity(myIntent);
            }


        });


        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numsFromET = Integer.parseInt(String.valueOf(calorieET.getText()));
                total += numsFromET;
                totalCalTV.setText(total + "");
            }
        });


        resetBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total = 0;
                totalCalTV.setText(total + "");
            }
        });

    }
}