package com.example.t_10a.examenparcial;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Created by T-10A on 04/07/2015.
 */
public class Modelo {
//5
    public static  void  guardar(Evaluacion evaluacion,Context ctx)throws  Exception{
        FileOutputStream file =ctx.openFileOutput("base-evaluaciones",Context.MODE_PRIVATE);
        ObjectOutputStream outputStream=new ObjectOutputStream(file);
        outputStream.writeObject(evaluacion);




    }
    public Evaluacion leer(Context ctx)throws  Exception{

        FileInputStream fis= ctx.openFileInput("base-evaluaciones");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Evaluacion t=new Evaluacion();
        t=(Evaluacion)ois.readObject();
        return t;

    }
    ArrayList<Evaluacion> eva= new ArrayList<Evaluacion>();

    public void setEva(ArrayList<Evaluacion> eva) {
        this.eva = eva;
    }

    public ArrayList<Evaluacion> getEva() {
        return eva;
    }
}
