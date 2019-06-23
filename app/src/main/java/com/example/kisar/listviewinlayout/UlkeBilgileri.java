package com.example.kisar.listviewinlayout;

import android.util.Log;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kisar on 22.06.2019.
 */

public class UlkeBilgileri implements Serializable {
    private int ulkeId;
    private int ulkeBayrakId;
    private String ulkeAdi;
    private int ulkeNufus;
    private int ulkeHakkinda;




    public UlkeBilgileri() {


    }

    public UlkeBilgileri(int ulkeId, int ulkeBayrakId, String ulkeAdi, int ulkeNufus, int ulkeHakkinda) {
        this.setUlkeId(ulkeId);
        this.setUlkeBayrakId(ulkeBayrakId);
        this.setUlkeAdi(ulkeAdi);
        this.setUlkeNufus(ulkeNufus);
        this.setUlkeHakkinda(ulkeHakkinda);
    }

    public int getUlkeId() {
        return ulkeId;
    }

    public void setUlkeId(int ulkeId) {
        this.ulkeId = ulkeId;
    }

    public int getUlkeBayrakId() {
        return ulkeBayrakId;
    }

    public void setUlkeBayrakId(int ulkeBayrakId) {
        this.ulkeBayrakId = ulkeBayrakId;
    }

    public String getUlkeAdi() {
        return ulkeAdi;
    }

    public void setUlkeAdi(String ulkeAdi) {
        this.ulkeAdi = ulkeAdi;
    }

    public int getUlkeNufus() {
        return ulkeNufus;
    }

    public void setUlkeNufus(int ulkeNufus) {
        this.ulkeNufus = ulkeNufus;
    }

    public int getUlkeHakkinda() {
        return ulkeHakkinda;
    }

    public void setUlkeHakkinda(int ulkeHakkinda) {
        this.ulkeHakkinda = ulkeHakkinda;
    }


}
