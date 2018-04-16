package com.example.jeanp.pste_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class compteactivity extends AppCompatActivity {
    private ImageView pari;
    private ImageView tribut;
    private ImageView commu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compteactivity);
        this.pari = (ImageView) findViewById(R.id.pari);
        this.commu=(ImageView) findViewById(R.id.commu);
        this.tribut= (ImageView) findViewById(R.id.tribut);
        pari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otheractivity = new Intent(getApplicationContext(), pariactivity.class);
                startActivity(otheractivity);
                finish();
            }

        });

        tribut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otheractivity = new Intent(getApplicationContext(), tributactivity.class);
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
