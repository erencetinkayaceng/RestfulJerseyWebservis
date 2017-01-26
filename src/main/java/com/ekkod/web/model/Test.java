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
@Table(name="TEST")
public class Test implements Serializable{
	private static final long serialVersionUID = 1L;
    int id;
    int kategoriId;
    String testAdi;
    int dogruSayisi;
    int yanlisSayisi;
    int bosSayisi;
    int cozuldu;

    public Test() {
    }

    public Test(int id,String testAdi, int kategoriId, int dogruSayisi, int yanlisSayisi, int bosSayisi, int cozuldu) {
        this.id = id;
        this.kategoriId = kategoriId;
        this.testAdi=testAdi;
        this.dogruSayisi = dogruSayisi;
        this.yanlisSayisi = yanlisSayisi;
        this.bosSayisi = bosSayisi;
        this.cozuldu = cozuldu;
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
    public int getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(int kategoriId) {
        this.kategoriId = kategoriId;
    }
    @Column
    public String getTestAdi() {
        return testAdi;
    }

    public void setTestAdi(String testAdi) {
        this.testAdi = testAdi;
    }
    @Column
    public int getDogruSayisi() {
        return dogruSayisi;
    }

    public void setDogruSayisi(int dogruSayisi) {
        this.dogruSayisi = dogruSayisi;
    }
    @Column
    public int getYanlisSayisi() {
        return yanlisSayisi;
    }

    public void setYanlisSayisi(int yanlisSayisi) {
        this.yanlisSayisi = yanlisSayisi;
    }
    @Column
    public int getBosSayisi() {
        return bosSayisi;
    }

    public void setBosSayisi(int bosSayisi) {
        this.bosSayisi = bosSayisi;
    }
    @Column
    public int getCozuldu() {
        return cozuldu;
    }

    public void setCozuldu(int cozuldu) {
        this.cozuldu = cozuldu;
    }
}
