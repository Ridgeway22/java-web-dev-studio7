package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(String name, int storageCapacity, int capacityUsedapacity, String diskType) {
        super(name, storageCapacity, capacityUsedapacity, diskType);
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    @Override
public void spinDisc(){
        System.out.println(" a cd at tge rate of 200-500 rpm");
}

    public void readDisc(){
        System.out.println("Wow this is my jam");
}
}
