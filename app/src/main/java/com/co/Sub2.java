package com.co;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Sub2 extends AppCompatActivity implements Producto.OnFragmentInteractionListener,Proveedor.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);
        final byte opc = getIntent().getByteExtra("opc",(byte)0);
        if(opc==3){
            getSupportActionBar().setTitle("Nuevo registro");//HARD CODE jaja
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_sub2,new Proveedor()).commit();
        }else if(opc==4){
            getSupportActionBar().setTitle("Nuevo registro");
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_sub2,new Producto()).commit();
        }
    }
    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
