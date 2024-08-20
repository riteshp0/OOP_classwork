package models;

public class Measurement {

    public Integer value;

    public Measurement(Integer value) {
        this.value = value;
    }
    public float getCm(){
        return value * 100;
    }
    public float getKm(){
        return value / 1000;
    }
    public float getMm(){
        return value * 1000;
    }
    public float getDm(){
       return value * 10;
    }
}
