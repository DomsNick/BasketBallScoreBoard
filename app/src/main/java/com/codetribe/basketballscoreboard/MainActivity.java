package com.codetribe.basketballscoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView txthome,txtVistor;
    private Button btnHome,btnAway,btnReset;
    private int  countA=0;
    private  int countB=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txthome=(TextView)findViewById(R.id.txtScoreA);
        txtVistor=(TextView)findViewById(R.id.txtscoreB);

        btnHome=(Button)findViewById(R.id.btnteamA);
        btnAway=(Button)findViewById(R.id.btnteamB);
        btnReset=(Button)findViewById(R.id.btnreset);


        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                countA++;

                txthome.setText(String.valueOf(countA));
            }
        });

        btnAway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                countB++;

                txtVistor.setText(String.valueOf(countB));

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                countA=0;
                countB=0;

                txthome.setText(String.valueOf(countA));
                txtVistor.setText(String.valueOf(countB));
            }
        });

    }
}
