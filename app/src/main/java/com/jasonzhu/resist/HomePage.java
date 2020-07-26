package com.jasonzhu.resist;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMap;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
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

        LatLng home = new LatLng(42.757870, -71.463951);
        LatLng blmProtest = new LatLng(43.209572, -71.537292);
        LatLng saveTheEarth  = new LatLng(42.334660, -71.069000);
        mMap.addMarker(new MarkerOptions().position(home).title("You are here"));
        mMap.addMarker(new MarkerOptions().position(saveTheEarth).title("Save the Earth 2020"));
        mMap.addMarker(new MarkerOptions().position(blmProtest).title("BLM Protest in Concord"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(home));
    }

    public void profile(View view){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}
