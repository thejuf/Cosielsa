package com.co;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Sub extends AppCompatActivity implements Producto.OnFragmentInteractionListener,ProductoList.OnFragmentInteractionListener,Proveedor.OnFragmentInteractionListener,ProveedorList.OnFragmentInteractionListener{
    private FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        fab = findViewById(R.id.fab_add);
        fab.hide();
        final byte opc = getIntent().getByteExtra("opc",(byte)0);
        switch (opc){
            case 0:
                break;
            case 1:
                getSupportActionBar().setTitle("Nuevo Registro");
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_sub,new Producto()).commit();
                break;
            case 2:
                getSupportActionBar().setTitle("Nuevo Registro");
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_sub,new Proveedor()).commit();
                break;
            case 3:
                fab.show();
                getSupportActionBar().setTitle("Proveedores");
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_sub,new ProveedorList()).commit();
                break;
            case 4:
                fab.show();
                getSupportActionBar().setTitle("Inventario");
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_sub,new ProductoList()).commit();
                break;
            case 5:
                getSupportActionBar().setTitle("Proveedores");
                //getSupportFragmentManager().beginTransaction().replace(R.id.fl_sub,new ProveedorList()).commit();
                break;
            case 6:
                getSupportActionBar().setTitle("Inventario");
                //getSupportFragmentManager().beginTransaction().replace(R.id.fl_sub,new ProductoList()).commit();
                break;
        }
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sub.this,Sub2.class).putExtra("opc",opc));
            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
