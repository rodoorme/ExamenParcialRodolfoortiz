package com.example.t_10a.examenparcial;

import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//3
        Button boton = (Button) findViewById(R.id.botonvibrar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(3000);}


//8,6,7
            protected void onCreate(Bundle savedInstanceState) {

                setContentView(R.layout.activity_main);
                Button b = (Button) findViewById(R.id.botonvibrar);
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Evaluacion evaluacion = new Evaluacion();
                        EditText editcalif = (EditText) findViewById(R.id.DOS);
                        int calif = Integer.parseInt(editcalif.getText().toString());
                        evaluacion.setCalificacion(3);
                        evaluacion.setCalificacion(calif);
                        EditText editnombre = (EditText) findViewById(R.id.UNO);
                        String nombre = editnombre.getText().toString();
                        evaluacion.setNombre_materia("mate");evaluacion.setNombre_materia(nombre);
                        try {
                            Modelo modelo = new Modelo();
                            modelo.guardar(evaluacion, getApplicationContext());
                            Toast.makeText(getApplicationContext(), "tarjeta guardada con exito ", Toast.LENGTH_LONG).show();
                        } catch (Exception e) {

                        }
                    }
                });
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
