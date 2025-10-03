package com.pluralsight;

public class Vehicle {
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    public Vehicle(){
        vehicleId = 100L;
        makeModel = "";
        color = "";
        odometerReading = 0;
        price = 234.8f;
    }
    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, float price){
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
    }

    public long getVehicleId(){
        return this.vehicleId;
    }
    public void setVehicleId(long vehicleId){
        this.vehicleId = vehicleId;
    }

    public String getMakeModel(){
        return this.makeModel;
    }
    public void setMakeModel(String makeModel){
        this.makeModel = makeModel;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public int getOdometerReading(){
        return this.odometerReading;
    }
    public void setOdometerReading(int odometerReading){
        this.odometerReading = odometerReading;
    }

    public float getPrice(){
        return this.price;
    }
    public void setPrice(float price){
        this.price = price;
    }

}
