package com.example.jeanp.pste_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class pariactivity extends AppCompatActivity {
    private ImageView tribut;
    private ImageView compte;
    private ImageView commu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pariactivity);
        this.tribut= (ImageView) findViewById(R.id.tribut);
        this.compte= (ImageView) findViewById(R.id.compte);
        this.commu= (ImageView) findViewById(R.id.commu);
        tribut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otheractivity = new Intent(getApplicationContext(), tributactivity.class);
                startActivity(otheractivity);
                finish();
            }
        });
        compte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otheractivity= new Intent(getApplicationContext(), compteactivity.class);
                startActivity(otheractivity);
                finish();
            }
        });
        commu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otheractivity = new Intent(getApplicationContext(), commuactivity.class);
                startActivity(otheractivity);
                finish();
            }
        });
    }
}
