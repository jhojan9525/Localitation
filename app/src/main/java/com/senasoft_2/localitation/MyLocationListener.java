package com.senasoft_2.localitation;

import android.location.Location;
import android.location.LocationListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MyLocationListener implements LocationListener {

    MainActivity mainActivity;
    private Toast messageTextView;
    private ReciclerActivity ReciclerActivity;

    public MainActivity getMainActivity() {
        return mainActivity;
    }

    public void setMainActivity(ReciclerActivity mainActivity) {
        this.ReciclerActivity = mainActivity;
    }

    @Override
    public void onLocationChanged(Location location) {

        // Este metodo se ejecuta cada vez que el GPS recibe nuevas coordenadas
        // debido a la detecci—n de un cambio de ubicacion
        location.getLatitude();
        location.getLongitude();
        String Text = "Mi ubicaci—n actual es: " + "\n Lat = "
                + location.getLatitude() + "\n Long = " + location.getLongitude();
        messageTextView.setText(Text);
        this.mainActivity.setLocation(location);

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

        // Este metodo se ejecuta cuando el GPS es activado
        messageTextView.setText("GPS Activado");
    }

    @Override
    public void onProviderDisabled(String provider) {

        // Este metodo se ejecuta cuando el GPS es desactivado
        messageTextView.setText("GPS Desactivado");

    }
}
