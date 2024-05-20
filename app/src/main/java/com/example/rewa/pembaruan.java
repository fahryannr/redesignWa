package com.example.rewa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class pembaruan extends AppCompatActivity implements View.OnClickListener {
    private ImageView ivchat, ivtelpon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembaruan);

        ivchat = findViewById(R.id.ivchat);
        ivtelpon = findViewById(R.id.ivtelpon);

        ivtelpon.setOnClickListener(this);
        ivchat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.ivchat){
            Intent chat = new Intent(pembaruan.this, beranda.class);
            startActivity(chat);
        } else if (v.getId()== R.id.ivtelpon) {
            Intent call = new Intent(pembaruan.this, telpon.class);
            startActivity(call);

        }
    }
}