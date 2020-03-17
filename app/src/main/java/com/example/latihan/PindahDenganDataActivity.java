package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PindahDenganDataActivity extends AppCompatActivity {
    public static final String NAMA = "nama_user";
    public static final String USIA = "usia_user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah_dengan_data);

        TextView vTerimaData = findViewById(R.id.v_td);

        String nama = getIntent().getStringExtra(NAMA);
        int usia = getIntent().getIntExtra(USIA, 0);

        String hasil = "Nama : " + nama + "\nUsia : " + usia;
        vTerimaData.setText(hasil);
    }
}
