package com.iesvirgendelcarmen.dam.fragment05;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fragment05 extends AppCompatActivity {
    private Button btnMostrarPreferencias;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment05);

        btnMostrarPreferencias=(Button)findViewById(R.id.boton);
        btnMostrarPreferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();

                Fragmento1 preferencias=new Fragmento1();
                ft.replace(android.R.id.content,preferencias);
                ft.commit();
            }
        });


    }
}
