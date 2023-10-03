package com.example;

public class Charging {
    public String checkCharging(double p) {
        String res;
        if (p < 0 ) {
            res = "Input khong hop le";
        } else if(p>= 0 && p <60 ) {
            res =  "Sac nhanh";
        } else if (p >= 60 && p < 100) {
            res =  "Sac thuong";
        } else if( p == 100){
            res = "Tu dong ngat sac";
        } else {
            res = "Input khong hop le";
        }
        return res;
    }
}
