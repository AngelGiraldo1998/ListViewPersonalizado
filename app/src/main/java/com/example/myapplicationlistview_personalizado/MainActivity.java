package com.example.myapplicationlistview_personalizado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myapplicationlistview_personalizado.Modelo.Adaptador;
import com.example.myapplicationlistview_personalizado.Modelo.Noticias;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener
{
    public Noticias [] noticias;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        noticias= new Noticias[]
                {
                        new Noticias("Noticia 1", "SubNoticia Contenido Contenido Contenido Contenido 1"),
                        new Noticias("Noticia 2", "SubNoticia Contenido Contenido Contenido Contenido 2"),
                        new Noticias("Noticia 3", "SubNoticia Contenido Contenido Contenido Contenido 3"),
                        new Noticias("Noticia 4", "SubNoticia Contenido Contenido Contenido Contenido 4"),
                        new Noticias("Noticia 5", "SubNoticia Contenido Contenido Contenido Contenido 5"),
                };
        Adaptador adaptadornoticias = new Adaptador(this,noticias);
        ListView lstOpciones =(ListView) findViewById(R.id.lstListadeNoticias);
        View header =getLayoutInflater().inflate(R.layout.lyheder, null);
        lstOpciones.addHeaderView(header);
        lstOpciones.setAdapter(adaptadornoticias);
        lstOpciones.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,((Noticias)parent.getItemAtPosition(position)).getTitulo(),
                Toast.LENGTH_LONG).show();

    }
}