package com.example.katalogleptop;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.katalogleptop.Model.Leptop;

import java.util.List;

public class GaleriActivity extends AppCompatActivity {
    List<Leptop> leptops;
    int indeksTampil = 0;
    String jenisLeptop;
    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txTipe,txDeskripsi,txJudul;
    ImageView ivFotoLeptop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        Intent intent = getIntent();
        jenisLeptop = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        leptops = DataProvider.getLeptopsByTipe(this,jenisLeptop);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> Pertama());
        btnTerakhir.setOnClickListener(view -> Terakhir());
        btnSebelumnya.setOnClickListener(view -> Sebelumnya());
        btnBerikutnya.setOnClickListener(view -> Berikutnya());

        txTipe = findViewById(R.id.txTipe);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoLeptop = findViewById(R.id.gambarLeptop);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText(""+jenisLeptop);
        txTipe = findViewById(R.id.txTipe);
        txTipe.setText(""+txTipe);

    }
    @SuppressLint("NewApi")
    private void tampilkanProfil() {
        Leptop k = leptops.get(indeksTampil);
        Log.d("Acer","Menampilkan Acer "+k.getJenis());
        txTipe.setText(k.getTipe());
        txDeskripsi.setText(k.getDeskripsi());
        ivFotoLeptop.setImageDrawable(this.getDrawable(k.getDrawableRes()));
    }

    private void Pertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void Terakhir() {
        int posAkhir = leptops.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }

    private void Berikutnya() {
        if (indeksTampil == leptops.size() - 1) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void Sebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }
}