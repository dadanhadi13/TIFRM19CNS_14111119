package com.dadanhadi.tifrm19cns_14111119;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Toast;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private String pesan = "Red Box";
    private String pesan1 = "Green Box";
    private String pesan2 = "Blue Box";
    private Button klik, klik1, klik2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.activity_actionbarlayout);

        klik = findViewById(R.id.button);
        klik1 = findViewById(R.id.button1);
        klik2 = findViewById(R.id.button2);

        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), pesan, Toast.LENGTH_SHORT).show();
            }
        });

        klik1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), pesan1, Toast.LENGTH_SHORT).show();
            }
        });

        klik2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), pesan2, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
