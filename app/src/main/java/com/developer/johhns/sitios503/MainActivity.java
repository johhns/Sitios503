package com.developer.johhns.sitios503;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnSitio1 , btnSitio2, btnSitio3, btnSitio4 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnSitio1 = findViewById( R.id.btnSitio1 ) ;
        btnSitio2 = findViewById( R.id.btnSitio2 ) ;
        btnSitio3 = findViewById( R.id.btnSitio3 ) ;
        btnSitio4 = findViewById( R.id.btnSitio4 ) ;

        btnSitio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( view.getContext() , MisSitios.class ) ;
                i.putExtra("LAT",13.697860792479318) ;
                i.putExtra("LON",-89.19102162122728) ;
                i.putExtra("NOMBRE","Catedral") ;
                startActivity(i);
            }
        });

        btnSitio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( view.getContext() , MisSitios.class ) ;
                i.putExtra("LAT",13.49341600856144) ;
                i.putExtra("LON",-89.38424259424212) ;
                i.putExtra("NOMBRE","El Tunco") ;
                startActivity(i);
            }
        });


        btnSitio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( view.getContext() , MisSitios.class ) ;
                i.putExtra("LAT",13.738843149919061 ) ;
                i.putExtra("LON",-89.28303480148317 ) ;
                i.putExtra("NOMBRE","El Voqueron") ;
                startActivity(i);
            }
        });

        btnSitio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( view.getContext() , MisSitios.class ) ;
                i.putExtra("LAT",13.936790198287447 ) ;
                i.putExtra("LON",-89.0268436074257 ) ;
                i.putExtra("NOMBRE","Suchitoto") ;
                startActivity(i);
            }
        });


    }
}