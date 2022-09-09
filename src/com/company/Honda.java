package com.company;

public class Honda extends vehicle{
    public Honda(){
        super.fuel="diesel";
        super.isImported=false;
        super.isNew=true;
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
