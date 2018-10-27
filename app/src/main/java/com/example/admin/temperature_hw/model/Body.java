package com.example.admin.temperature_hw.model;

public class Body {
    private int temp;
    public Body(int temp){

        this.temp = temp;
    }
    public float CtoF(){
        float F = (float) ((1.8 * temp) + 33);
        return F;
    }
    public float FtoC(){
        float C = (float) ((float) (temp - 32) * (0.556));
        return C;

    }
}
