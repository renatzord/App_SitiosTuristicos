package com.example.appsitiosturisticos;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;

import com.example.appsitiosturisticos.databinding.ActivityDetalleBinding;
import com.example.appsitiosturisticos.databinding.ActivityMainBinding;

public class ActivityDetalle extends AppCompatActivity {
        public static final String SITIO_TURISTICO_KEY = "Sit ioTuristico";
        public static final String BITMAP_KEY ="bitmap";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetalleBinding binding = ActivityDetalleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();
        SitioTuristico sitio = extras.getParcelable(SITIO_TURISTICO_KEY);
        binding.setSitioTuristico(sitio);
        Bitmap bitmap = extras.getParcelable(BITMAP_KEY);

        if(bitmap!=null){
            binding.imgPerfil.setImageBitmap(bitmap);
        }


       /* String nombre = extras.getString("nombre");
        String ubicacion = extras.getString("ubicacion");
        String informacion = extras.getString("informacion");
        float valoracion = extras.getFloat("valoracion");*/

       // binding.txtNombre.setText(sitio.getNombre());
        binding.txtUbicacion.setText(sitio.getUbicacion());
        binding.txtInformacion.setText(sitio.getInformacion());
        binding.valoracion.setRating(sitio.getValoracion());

    }
}