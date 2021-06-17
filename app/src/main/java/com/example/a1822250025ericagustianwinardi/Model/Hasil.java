package com.example.a1822250025ericagustianwinardi.Model;
//eric agustian winardi 1822250025
public class Hasil {
    private final int id;
    private final String nama_batik;
    private final String daerah_batik;
    private final String makna_batik;
    private final int harga_rendah;
    private final int harga_tinggi;

    public Hasil(int id, String nama_batik, String daerah_batik, String makna_batik, int harga_rendah, int harga_tinggi) {
        this.id = id;
        this.nama_batik = nama_batik;
        this.daerah_batik = daerah_batik;
        this.makna_batik = makna_batik;
        this.harga_rendah = harga_rendah;
        this.harga_tinggi = harga_tinggi;
    }

    public int getId() {
        return id;
    }

    public String getNama_batik() {
        return nama_batik;
    }

    public String getDaerah_batik() {
        return daerah_batik;
    }

    public String getMakna_batik() {
        return makna_batik;
    }

    public int getHarga_rendah() {
        return harga_rendah;
    }

    public int getHarga_tinggi() {
        return harga_tinggi;
    }
}