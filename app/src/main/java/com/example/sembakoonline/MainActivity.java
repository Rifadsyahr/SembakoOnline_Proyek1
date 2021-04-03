package com.example.sembakoonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void produk(View view) {
        Intent produK_inten = new Intent(MainActivity.this, Produk.class);
        startActivity(produK_inten);
    }

    public void view_about(View view) {
        Intent about = new Intent(MainActivity.this, About.class);
        startActivity(about);

    }

    public void pesanan(View view) {
        Intent Pesanan = new Intent(MainActivity.this, Pesanan.class);
        startActivity(Pesanan);


    }

    public void lacak (View view) {
        Intent lacak = new Intent(MainActivity.this, Lacak.class);
        startActivity(lacak);


    }
}
