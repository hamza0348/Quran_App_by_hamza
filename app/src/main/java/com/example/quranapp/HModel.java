package com.example.quranapp;

public class HModel {

    String para;
    String number;
    String paraBtn;

    public HModel(String para, String number, String paraBtn) {
        this.para = para;
        this.number = number;
        this.paraBtn = paraBtn;
    }


    public String getPara() {
        return para;
    }

    public String getNumber() {
        return number;
    }

    public String getParaBtn() {
        return paraBtn;
    }
}
