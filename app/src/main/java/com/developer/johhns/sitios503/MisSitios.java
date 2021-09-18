package com.developer.johhns.sitios503;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.developer.johhns.sitios503.databinding.ActivityMisSitiosBinding;

public class MisSitios extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMisSitiosBinding binding;
    private double latitud, longitud ;
    private Bundle extras ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMisSitiosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        extras = getIntent().getExtras();

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        double latitud  = extras.getDouble("LAT") ;
        double longitud = extras.getDouble("LON") ;
        String nombre   = extras.getString("NOMBRE");

        // Add a marker in Sydney and move the camera
        LatLng sitio = new LatLng(latitud, longitud);
        mMap.addMarker(new MarkerOptions().position(sitio).title(nombre));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sitio));
        mMap.animateCamera( CameraUpdateFactory.zoomTo( 11.0f ) );

    }
}