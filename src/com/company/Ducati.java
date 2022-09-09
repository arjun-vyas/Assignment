package com.company;

public class Ducati extends vehicle{
    public Ducati(){
        super.fuel="petrol";
        super.isImported=true;
        super.isNew=false;

    }
    @Override
    public String getFuel() {
        return this.fuel;
    }

    @Override
    public boolean getIsImported() {
        return this.isImported;
    }

    @Override
    public boolean getIsNew() {
        return this.isNew;
    }
}
