package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class detallemesa extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detallemesa);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageView10:
                Intent intent = new Intent(this, usuario_cliente_catalogo.class);
                startActivity(intent);
                break;

        }
    }
}