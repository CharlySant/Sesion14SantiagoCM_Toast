package com.example.sesion14santiagocm_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity { //inicia clase

    Button btnPrimero, btnSegundo, btnTercero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//inica metodo onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPrimero=findViewById(R.id.btnPrimero);
        btnSegundo=findViewById(R.id.btnSegundo);
        btnTercero=findViewById(R.id.btnTercero);
    }//termina metodo onCreate

    public void primerToast(View view){//inicia metodo
        Context context= getApplicationContext();
        CharSequence mensaje="Mensaje TOAST \nJuan Carlos \n CM";
        int duration= Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context,mensaje,duration);

        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.show();

        //toats integrado
        Toast.makeText(this, "Ventana emergente 2", Toast.LENGTH_LONG).show();
    }//termina metodo

    public void segundoToast(View view){//inicia metodo
        Context context= getApplicationContext();
        CharSequence mensaje="Mensaje dos TOAST \nSantiago \n CM";
        int duration= Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context,mensaje,duration);

        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.show();

        //toats integrado
        Toast.makeText(this, "Ventana emergente 3", Toast.LENGTH_LONG).show();
    }//termina metodo

    public void tercerToast(View view){//inicia metodo
        Context context= getApplicationContext();
        CharSequence mensaje="Mensaje tres TOAST \nDomingo \n CM";
        int duration= Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context,mensaje,duration);

        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.show();

        //toats integrado
        Toast.makeText(this, "Ventana emergente 4", Toast.LENGTH_LONG).show();
    }//termina metodo

    //Toast personalizado con XML
    public void toastPersonalizadoXML1(View view){

        //Inflater ->Ejecución, visualización, desplegado de una vista
        LayoutInflater inflater =getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast2, null);

        Toast toastXML =new Toast(getApplicationContext());
        toastXML.setGravity(Gravity.CENTER_VERTICAL, 8,8);
        toastXML.setDuration(Toast.LENGTH_LONG);
        //Integración de los elementos
        toastXML.setView(layout);
        toastXML.show();

    }//termina metodo


}//termina clase