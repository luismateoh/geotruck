package co.edu.udea.geotruck.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class UbicacionService {

    public UbicacionService() {

    }

    public static List<String> ubicacion(Long id) {
        String latitud = "";
        String longitud = "";

        try {
            URL url = new URL("https://api.3geonames.org/?randomland=CO&json=1");
            BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream()));
            int bandera = 0;

            while (bandera == 0) {
                latitud = bf.readLine();
                String cadenaDondeBuscar = latitud;
                String loQueQuieroBuscar = ("\"latt\"");

                if (cadenaDondeBuscar.contains(loQueQuieroBuscar)) {
                    String[] parts1 = latitud.split("\"latt\" : \"");
                    latitud = parts1[1];
                    parts1 = latitud.split("\"");
                    latitud = parts1[0];
                    longitud = bf.readLine();
                    String[] parts2 = longitud.split("\"longt\" : \"");
                    longitud = parts2[1];
                    parts2 = longitud.split("\"");
                    longitud = parts2[0];
                    bandera = 1;

                }
            }

        } catch (Exception e) {
        }
        List<String> geo = new ArrayList<>();
        geo.add(latitud);
        geo.add(longitud);

        return geo;
    }


}
