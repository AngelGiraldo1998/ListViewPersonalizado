package com.example.myapplicationlistview_personalizado.Modelo;

public class Noticias
{



    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.Subtitulo = subtitulo;
    }

    String Titulo;

    public Noticias(String titulo, String subtitulo) {
        this.Titulo = titulo;
        this.Subtitulo = subtitulo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getSubtitulo() {
        return Subtitulo;
    }

    String Subtitulo;

}
