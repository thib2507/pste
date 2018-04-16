package com.example.jeanp.pste_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class tributactivity extends AppCompatActivity {
    private ImageView pari;
    private ImageView compte;
    private ImageView commu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tributactivity);
        this.pari = (ImageView) findViewById(R.id.pari);
        this.compte= (ImageView) findViewById(R.id.compte);
        this.commu= (ImageView) findViewById(R.id.commu);
        pari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otheractivity = new Intent(getApplicationContext(), pariactivity.class);
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
        compte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otheractivity= new Intent(getApplicationContext(), compteactivity.class);
                startActivity(otheractivity);
                finish();
            }
        });
    }
}
