package com.company;

public abstract class vehicle {
    protected String fuel;
    protected boolean isImported;
    protected boolean isNew;

    public abstract String getFuel();
    public abstract boolean getIsImported();
    public abstract boolean getIsNew();

}
