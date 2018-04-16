package com.example.jeanp.pste_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class commuactivity extends AppCompatActivity {
    private ImageView compte;
    private ImageView pari;
    private ImageView tribut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commuactivity);
        this.compte=(ImageView) findViewById(R.id.compte);
        this.tribut= (ImageView) findViewById(R.id.tribut);
        this.pari = (ImageView) findViewById(R.id.pari);

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
