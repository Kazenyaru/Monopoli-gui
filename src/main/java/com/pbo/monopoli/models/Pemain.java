package com.pbo.monopoli.models;

import java.awt.Color;
import java.util.HashMap;

public class Pemain {
  private String id;
  private String nama;
  private Double uang = 200000.00;
  private Double hutang = 0.00;
  private int posisi = 0;
  private String status = "main";
  private boolean hasPassesStart = false;
  private HashMap<String, Integer> aset = new HashMap<String, Integer>();
  public Color color; 

  public Pemain(String id, String nama) {
    this.setId(id);
    this.nama = nama;
    this.color = Color.BLUE;
  }
  
  public Color getColor() {
	  return color;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public boolean isHasPassesStart() {
    return hasPassesStart;
  }

  public void setHasPassesStart(boolean hasPassesStart) {
    this.hasPassesStart = hasPassesStart;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public int getPosisi() {
    return posisi;
  }

  public void setPosisi(int posisi) {
    if (this.posisi < 10) {
      this.posisi += posisi;
      if (this.posisi >= 10) {
        System.out.println("Lewat dari kotak 10");
        this.posisi += 1;
      }
    } else {
      this.posisi += posisi;
      if (this.posisi >= 40) {
        this.posisi -= 40;
        if (this.posisi > 0) {
          this.setHasPassesStart(true);
        }
      }
    }

  }

  public void setPosisiAbsolute(int posisiAbsolute) {
    this.posisi = posisiAbsolute;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Double getUang() {
    return uang;
  }

  public void setUang(Double uang) {
    this.uang += uang;
  }

  public HashMap<String, Integer> getAset() {
    return aset;
  }

  public void setAset(String jenis, int jumlah) {
    this.aset.put(jenis, jumlah);
  }

  public Double getHutang() {
    return hutang;
  }

  public void setHutang(Double hutang) {
    this.hutang += hutang;
  }
}