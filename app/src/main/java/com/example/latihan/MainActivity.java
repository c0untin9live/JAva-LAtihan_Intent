package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPindahActivity = findViewById(R.id.btn_pidah_activity);
        btnPindahActivity.setOnClickListener(this);

        Button btnPindahDenganData = findViewById(R.id.btn_pidah_activity_data);
        btnPindahDenganData.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btn_pidah_activity:
                Intent pindahIntent = new Intent(MainActivity.this, PindahActivity.class);
                startActivity(pindahIntent);
                break;

            case R.id.btn_pidah_activity_data:
                Intent pindahDenganDataIntent = new Intent(MainActivity.this, PindahDenganDataActivity.class);
                pindahDenganDataIntent.putExtra(PindahDenganDataActivity.NAMA, "Yoga Putra Pratama");
                pindahDenganDataIntent.putExtra(PindahDenganDataActivity.USIA, 18);
                startActivity(pindahDenganDataIntent);
                break;
        }
    }
}
