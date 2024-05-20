package com.example.rewa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class telpon extends AppCompatActivity implements View.OnClickListener {
    private ImageView ivgambar,ivstatus,ivchat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telpon);

        ivchat = findViewById(R.id.ivchat);
        ivstatus = findViewById(R.id.ivstatus);
        ivgambar = findViewById(R.id.ivgambar);


        ivgambar.setOnClickListener(this);
        ivstatus.setOnClickListener(this);
        ivchat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.ivgambar){
            Intent gambar = new Intent(telpon.this, statuss.class);
            startActivity(gambar);
        } else if (v.getId()== R.id.ivstatus) {
            Intent status = new Intent(telpon.this, pembaruan.class);
            startActivity(status);
        } else if (v.getId()== R.id.ivchat) {
            Intent chat = new Intent(telpon.this, beranda.class);
            startActivity(chat);
        }

    }
}