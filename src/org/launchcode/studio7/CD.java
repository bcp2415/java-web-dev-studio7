package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(String name, int storageCapacity, String type, int spinRate, boolean doubleSided) {
        super(name, storageCapacity, type, spinRate, doubleSided);
    }

    // TODO: Implement your custom interface.
    @Override
    public void spinDisc() {
        System.out.println("Disc spinning at " + getSpinRate() + " rpm.");
    }

    public void storeData() {
        System.out.println("");
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
