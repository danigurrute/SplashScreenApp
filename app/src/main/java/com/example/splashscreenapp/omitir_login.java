package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class omitir_login extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omitir_login);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageView1:
                Intent intent=new Intent( this, usuario_cliente_sin_login.class );
                startActivity(intent);
                break;
            case R.id.admin2:
                Intent intent1=new Intent( this, MainActivity.class );
                startActivity(intent1);
                break;
        }
    }


}
