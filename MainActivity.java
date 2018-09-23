package com.example.lab08.gridlayout;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {


    public CheckBox tiyatroC,futbolC,yuzmeC;
    public Button gosterB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tiyatroC=findViewById(R.id.tiyatro);
        futbolC=findViewById(R.id.futbol);
        yuzmeC=findViewById(R.id.yuzme);



        /* Başlangıç - Tiyatro seçeneği seçildiğinde çalışan kod */
        tiyatroC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                Toast.makeText(MainActivity.this, "Güzel Tercih !!!", Toast.LENGTH_SHORT).show();
            }
        });

        /* Bitiş - Tiyatro seçeneği seçildiğinde çalışan kod */



        /* Butona tıklanıldıktan sonra seçilenleri toast ta ekranda gösteriyoruz */
        gosterB=findViewById(R.id.goster);

        gosterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tiyatroC.isChecked()){
                    Toast.makeText(MainActivity.this, "Tiyatro Seçildi.", Toast.LENGTH_SHORT).show();
                }

                if(futbolC.isChecked()){
                    Toast.makeText(MainActivity.this, "Futbol Seçildi.", Toast.LENGTH_SHORT).show();
                }

                if(yuzmeC.isChecked()){
                    Toast.makeText(MainActivity.this, "Yüzme Seçildi.", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }



}

