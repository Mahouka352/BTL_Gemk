package com.example.phongo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
public class CanHo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String maCH;

    private String tenCH;

    //true ddang co ng o false chua co ai o
    private boolean trangthai;

    private float dientich;

    private int tang;

    @ManyToOne
    private DichVu dichVu;

    @ManyToOne
    private ChungCu chungCu;

    private float gia;


    public CanHo(long id, String maCH, String tenCH, boolean trangthai, float dientich, int tang, DichVu dichVu, ChungCu chungCu, float gia) {
        this.id = id;
        this.maCH = maCH;
        this.tenCH = tenCH;
        this.trangthai = trangthai;
        this.dientich = dientich;
        this.tang = tang;
        this.dichVu = dichVu;
        this.chungCu = chungCu;
        this.gia = gia;
    }

    public CanHo(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaCH() {
        return maCH;
    }

    public void setMaCH(String maCH) {
        this.maCH = maCH;
    }

    public String getTenCH() {
        return tenCH;
    }

    public void setTenCH(String tenCH) {
        this.tenCH = tenCH;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    public ChungCu getChungCu() {
        return chungCu;
    }

    public void setChungCu(ChungCu chungCu) {
        this.chungCu = chungCu;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }

    public float getDientich() {
        return dientich;
    }

    public void setDientich(float dientich) {
        this.dientich = dientich;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }
}
