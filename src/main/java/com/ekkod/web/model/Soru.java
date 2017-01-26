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
@Table(name="SORU")
public class Soru implements Serializable {
	private static final long serialVersionUID = 1L;
    int id;
    int testId;
    String sorumetni;
    String secenekA;
    String secenekB;
    String secenekC;
    String secenekD;
    String secenekE;
    String dogruCevap;
    String kullaniciCevap;

    public Soru() {
    }

    public Soru(int id, int testId, String sorumetni, String secenekA, String secenekB, String secenekC, String secenekD, String secenekE, String dogruCevap, String kullaniciCevap) {
        this.id = id;
        this.testId = testId;
        this.sorumetni = sorumetni;
        this.secenekA = secenekA;
        this.secenekB = secenekB;
        this.secenekC = secenekC;
        this.secenekD = secenekD;
        this.secenekE = secenekE;
        this.dogruCevap = dogruCevap;
        this.kullaniciCevap = kullaniciCevap;
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
    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }
    @Column
    public String getSorumetni() {
        return sorumetni;
    }

    public void setSorumetni(String sorumetni) {
        this.sorumetni = sorumetni;
    }
    @Column
    public String getSecenekA() {
        return secenekA;
    }

    public void setSecenekA(String secenekA) {
        this.secenekA = secenekA;
    }
    @Column
    public String getSecenekB() {
        return secenekB;
    }

    public void setSecenekB(String secenekB) {
        this.secenekB = secenekB;
    }
    @Column
    public String getSecenekC() {
        return secenekC;
    }

    public void setSecenekC(String secenekC) {
        this.secenekC = secenekC;
    }
    @Column
    public String getSecenekE() {
        return secenekE;
    }

    public void setSecenekE(String secenekE) {
        this.secenekE = secenekE;
    }
    @Column
    public String getSecenekD() {
        return secenekD;
    }

    public void setSecenekD(String secenekD) {
        this.secenekD = secenekD;
    }
    @Column
    public String getDogruCevap() {
        return dogruCevap;
    }

    public void setDogruCevap(String dogruCevap) {
        this.dogruCevap = dogruCevap;
    }
    @Column
    public String getKullaniciCevap() {
        return kullaniciCevap;
    }

    public void setKullaniciCevap(String kullaniciCevap) {
        this.kullaniciCevap = kullaniciCevap;
    }
}
