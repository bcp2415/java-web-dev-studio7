package org.launchcode.studio7;

public class BaseDisc {
    private final String name;
    private int storageCapacity;
    private String type;
    private int spinRate;
    private boolean doubleSided;

    public BaseDisc(String name, int storageCapacity, String type, int spinRate, boolean doubleSided) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.type = type;
        this.spinRate = spinRate;
        this.doubleSided = doubleSided;
    }

    public void storeData(int someData) {
        // code to store Data
    }

    public String writeData(int someData) {
        return "We wrote " + someData + " MB of data.";
    }

    public int readData() {
        int data;
        data = 1;
        // code to read from disc
        return data;
    }

    public String diskInfo() {
        return "I am a cd / dvd.  That's all about me.";
    }

    public void loadDisc() {
        // code to load disc
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getSpinRate() {
        return spinRate;
    }

    public void setSpinRate(int spinRate) {
        this.spinRate = spinRate;
    }

    public boolean isDoubleSided() {
        return doubleSided;
    }

    public void setDoubleSided(boolean doubleSided) {
        this.doubleSided = doubleSided;
    }
}
