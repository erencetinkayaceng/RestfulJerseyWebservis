package com.ekkod.web.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by cruz on 26.11.2016.
 */
@Entity
@Table(name="IPUCU")
public class Ipucu implements Serializable {
	private static final long serialVersionUID = 1L;
    int id;
    String metin;
    
    public Ipucu() {
	}
    
	public Ipucu(int id, String metin) {
		this.id = id;
		this.metin = metin;
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
	public String getMetin() {
		return metin;
	}

	public void setMetin(String metin) {
		this.metin = metin;
	}
	
	
    
    
}
