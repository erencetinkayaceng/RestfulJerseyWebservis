package com.ekkod.web.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by cruz on 18.11.2016.
 */
@Entity
@Table(name="KATEGORI")
public class Kategori implements Serializable{
	private static final long serialVersionUID = 1L;
    int id;
    String kategoriAdi;

    public Kategori() {
    }

    public Kategori(int id, String kategoriAdi) {
        this.id = id;
        this.kategoriAdi = kategoriAdi;
    }
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    @Column
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column
    public String getKategoriAdi() {
        return kategoriAdi;
    }

    public void setKategoriAdi(String kategoriAdi) {
        this.kategoriAdi = kategoriAdi;
    }
}
