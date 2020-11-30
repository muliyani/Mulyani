package com.example.katalogleptop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btnAcer,btnALenovo,btntoshiba;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnAcer = findViewById(R.id.btn_buka_acer);
        btnALenovo = findViewById(R.id.btn_buka_lenovo);
        btntoshiba = findViewById(R.id.btn_buka_toshiba);
        btnAcer.setOnClickListener(view -> bukaGaleri("Acer"));
        btnALenovo.setOnClickListener(view -> bukaGaleri("Lenovo"));
        btntoshiba.setOnClickListener(view -> bukaGaleri("Toshiba"));

    }


    private void bukaGaleri(String jenisLeptop) {
        Log.d("MAIN","Buka activity Acer");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisLeptop);
        startActivity(intent);
    }

}
