package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    public DVD(String name, int storageCapacity, String type, int spinRate, boolean doubleSided) {
        super(name, storageCapacity, type, spinRate, doubleSided);
    }

    // TODO: Implement your custom interface.
    @Override
    public void spinDisc() {
        //some code
    }

    public void storeData() {
        // some code
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
