package com.helb.noziv.weather48;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import com.google.gson.Gson;

public class fetchData {

    static BufferedReader bufferedReader = null;

    public fetchData(){}

    public BufferedReader getHTTPData(String coord){
    try {

        //String coord="50.668495/4.1806857";
        String addresse = "https://twcservice.eu-gb.mybluemix.net/api/weather/v1/geocode/"+coord+"/forecast/hourly/48hour.json?language=fr-FR&units=m";
        System.out.println("addresse "+ addresse);
        URL url = new URL(addresse);

        HttpURLConnection myURLConnection = (HttpURLConnection) url.openConnection();
        String userCredentials = "dca30076-a833-44e2-995f-6b12ed0f7c43:TaIb7K2Zq9";
        String basicAuth = "Basic " + new String(android.util.Base64.encode(userCredentials.getBytes(), android.util.Base64.DEFAULT));

        myURLConnection.setRequestProperty ("Authorization", basicAuth);
        Gson gson = new Gson();

        InputStream myInputStream = myURLConnection.getInputStream( );
        bufferedReader = new BufferedReader(new InputStreamReader(myInputStream));

    }catch (MalformedURLException e) {
            e.printStackTrace();
    }catch (IOException e) {
            e.printStackTrace();
            }
        return bufferedReader;
    }
}

