package com.helb.noziv.weather48;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;





public class MainActivity extends AppCompatActivity {

    private RecyclerViewAdapter adapter;
    private RecyclerView recyclerView;
    double latitude;
    double longitude;
    public String coordonnees;
    public static Model modelMain = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);



        final LocationListener locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                Location mlocation = location;
                Log.d("Location Changes", location.toString());
                latitude = location.getLatitude();
                longitude = location.getLongitude();
                System.out.println("longitude "+ longitude);
                System.out.println("latitude "+ latitude);

                coordonnees = latitude+"/"+longitude;
                System.out.println("coordonnees "+ coordonnees);
            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {
                Log.d("Status Changed", String.valueOf(status));
            }

            @Override
            public void onProviderEnabled(String provider) {
                Log.d("Provider Enabled", provider);
            }

            @Override
            public void onProviderDisabled(String provider) {
                Log.d("Provider Disabled", provider);
            }
        };

        Criteria criteria = new Criteria();
        criteria.setAccuracy(Criteria.ACCURACY_COARSE);
        criteria.setPowerRequirement(Criteria.POWER_LOW);
        criteria.setAltitudeRequired(false);
        criteria.setBearingRequired(false);
        criteria.setSpeedRequired(false);
        criteria.setCostAllowed(true);
        criteria.setHorizontalAccuracy(Criteria.ACCURACY_HIGH);
        criteria.setVerticalAccuracy(Criteria.ACCURACY_HIGH);

        final LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        final Looper looper = null;


        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions

            return;
        }
        locationManager.requestSingleUpdate(criteria, locationListener, looper);



        populateUi process = new populateUi();
        process.execute();




}
    class populateUi extends AsyncTask<Void, Void, Model> {


        private List<Forecast> imageModelArrayList;

        @SuppressLint("WrongThread")
        protected Model doInBackground(Void... voids) {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Model model  =null;
            Gson gson = new Gson();
            fetchData fetcher = new fetchData();

            model = gson.fromJson(fetcher.getHTTPData(coordonnees), Model.class);
            //  mNames = model;
            //mForecast = model.getForecasts();
            System.out.println("coordonnees2222 "+ coordonnees);
            if (model != null) {
                for (Forecast f : model.getForecasts()) {
                     System.out.println(f.getTemp() + " - " + f.getPhrase32char());
                }
            }
            else System.out.println("c'est null");

            //MainActivity.initRecyclerView(model.getForecasts());





            return model;}

        @Override
        protected void onPostExecute( Model model) {
            super.onPostExecute(model);
            initRecyclerView(model.getForecasts());

        }

    }

    public  void initRecyclerView(List<Forecast> imageModelArrayList){

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        adapter = new RecyclerViewAdapter(this, imageModelArrayList);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }



}

