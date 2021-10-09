package co.edu.udea.geotruck.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class UbicacionService {

    public UbicacionService() {

    }

    public List<String> ubicacion(Long id) {
        String latitud = "";
        String longitud = "";

        try {
            URL url = new URL("https://api.3geonames.org/?randomland=CO&json=1");
            BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream()));

            for (int i = 1; i <= 13; i++) {
                System.out.println(i);
                if (i == 12) {
                    latitud = bf.readLine();
                    longitud = bf.readLine();
                }
                bf.readLine();

            }

            StringBuilder lat = new StringBuilder();
            StringBuilder lon = new StringBuilder();
            for (int i = 16; i < 24; i++) {
                lat.append(latitud.charAt(i));
                lon.append(longitud.charAt(i + 1));
            }
            latitud = lat.toString();
            longitud = lon.toString();


        } catch (Exception e) {
        }
        List<String> geo = new ArrayList<>();
        geo.add(latitud);
        geo.add(longitud);
        return geo;
    }

}
