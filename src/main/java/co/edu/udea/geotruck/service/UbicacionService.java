package co.edu.udea.geotruck.service;

import java.net.HttpURLConnection;
import java.net.URL;


public class UbicacionService {

    public String getUbicacion() throws Exception {
        String latLon = "";
        URL url = new URL("http://api.3geonames.org/?randomland=CO&json=1");
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestProperty("Accept", "application/json");

        String foo;
        System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
        http.disconnect();
        return latLon;
    }

}
