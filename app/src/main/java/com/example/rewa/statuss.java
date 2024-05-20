package com.example.rewa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class statuss extends AppCompatActivity implements View.OnClickListener {
    private ImageView ivkembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statuss);

        ivkembali = findViewById(R.id.ivKembali);

        ivkembali.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.ivKembali){
            Intent kembali = new Intent(statuss.this, beranda.class);
            startActivity(kembali);
        }
    }
}