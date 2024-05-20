package com.example.rewa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class beranda extends AppCompatActivity implements View.OnClickListener {
    private ImageView ivpengaturan, ivstatus, ivpanggilan,ivchat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        ivpanggilan = findViewById(R.id.ivpanggilan);
        ivpengaturan = findViewById(R.id.ivpengaturan);
        ivstatus = findViewById(R.id.ivstatus);
        ivchat = findViewById(R.id.ivchat);


        ivstatus.setOnClickListener(this);
        ivpanggilan.setOnClickListener(this);
        ivpengaturan.setOnClickListener(this);
        ivchat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.ivpanggilan){
            Intent panggilan = new Intent(beranda.this, telpon.class);
            startActivity(panggilan);
        } else if (v.getId()== R.id.ivstatus) {
            Intent status = new Intent(beranda.this, pembaruan.class);
            startActivity(status);
        } else if (v.getId() == R.id.ivpengaturan) {
            Intent pengaturan = new Intent(beranda.this, MainActivity.class);
            startActivity(pengaturan);
        } else if (v.getId() == R.id.ivchat) {
            Intent chat = new Intent(beranda.this, statuss.class);
            startActivity(chat);
        }
    }
}