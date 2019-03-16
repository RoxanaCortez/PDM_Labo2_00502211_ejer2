package com.roxyapps.roxana.laboratorio21;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Ejercicio2 extends AppCompatActivity {

    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;
    private ImageView img5;
    private ImageView img6;
    private ImageView img7;
    private ImageView img8;
    private ImageView img9;

    private int[] imagenes = new int[]{R.drawable.poke1, R.drawable.poke2, R.drawable.poke3, R.drawable.poke4, R.drawable.poke5, R.drawable.poke6, R.drawable.poke7, R.drawable.poke8};

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.imagen: img1.setImageResource(imagenes[(int) (Math.random()*imagenes.length)]);
                break;
                case R.id.imagen2: img2.setImageResource(imagenes[(int) (Math.random()*imagenes.length)]);
                break;
                case R.id.imagen3: img3.setImageResource(imagenes[(int) (Math.random()*imagenes.length)]);
                break;
                case R.id.imagen4: img4.setImageResource(imagenes[(int) (Math.random()*imagenes.length)]);
                break;
                case R.id.imagen5: img5.setImageResource(imagenes[(int) (Math.random()*imagenes.length)]);
                break;
                case R.id.imagen6: img6.setImageResource(imagenes[(int) (Math.random()*imagenes.length)]);
                break;
                case R.id.imagen7: img7.setImageResource(imagenes[(int) (Math.random()*imagenes.length)]);
                break;
                case R.id.imagen8: img8.setImageResource(imagenes[(int) (Math.random()*imagenes.length)]);
                break;
                case R.id.imagen9: img9.setImageResource(imagenes[(int) (Math.random()*imagenes.length)]);
                break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        img1 = findViewById(R.id.imagen);
        img1.setOnClickListener(clickListener);

        img2 = findViewById(R.id.imagen2);
        img2.setOnClickListener(clickListener);

        img3 = findViewById(R.id.imagen3);
        img3.setOnClickListener(clickListener);

        img4 = findViewById(R.id.imagen4);
        img4.setOnClickListener(clickListener);

        img5 = findViewById(R.id.imagen5);
        img5.setOnClickListener(clickListener);

        img6 = findViewById(R.id.imagen6);
        img6.setOnClickListener(clickListener);

        img7 = findViewById(R.id.imagen7);
        img7.setOnClickListener(clickListener);

        img8 = findViewById(R.id.imagen8);
        img8.setOnClickListener(clickListener);

        img9 = findViewById(R.id.imagen9);
        img9.setOnClickListener(clickListener);

    }

}
