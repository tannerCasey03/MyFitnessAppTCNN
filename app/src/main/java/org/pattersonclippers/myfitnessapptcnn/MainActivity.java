package org.pattersonclippers.myfitnessapptcnn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button upperBTN,lowerBTN,cardBTN,addBTN,resetBTN;
    TextView totalCalTV;
    EditText calorieET;
    int total, calCount;
    private SharedPreferences mySharedPreferences;
    SharedPreferences.Editor preferencesEditor;
    private final String COUNT_KEY = "count";
    private String spFilename = "org.pattersonclippers.myfitnessapptcnn.fitness";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySharedPreferences = getSharedPreferences(spFilename, MODE_PRIVATE);
        preferencesEditor = mySharedPreferences.edit();
        calCount = mySharedPreferences.getInt(COUNT_KEY, 0);

        upperBTN = (Button) findViewById(R.id.upperBTN);
        lowerBTN = (Button) findViewById(R.id.lowerBTN);
        cardBTN = (Button) findViewById(R.id.cardBTN);
        addBTN = (Button) findViewById(R.id.addBTN);
        resetBTN = (Button) findViewById(R.id.resetBTN);
        totalCalTV = (TextView) findViewById(R.id.totalCalTV);
        calorieET = (EditText) findViewById(R.id.calorieET);

        total = calCount;

        totalCalTV.setText(total + "");

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
                preferencesEditor.putInt(COUNT_KEY, total);
                preferencesEditor.apply();
            }
        });


        resetBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total = 0;
                totalCalTV.setText(total + "");
                preferencesEditor.putInt(COUNT_KEY, total);
                preferencesEditor.apply();
            }
        });

    }
}