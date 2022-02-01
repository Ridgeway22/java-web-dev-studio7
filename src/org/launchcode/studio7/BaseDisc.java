package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {
    private String name;
    private int storageCapacity;
    private  int remainingCapacity;
    private int capacityUsed;
    private String diskType;
    private ArrayList<String> contents;

    public BaseDisc(String name, int storageCapacity, int capacityUsedapacity, String diskType) {
        this.name = name;
        this.storageCapacity = spaceLeft();
        this.capacityUsed = remainingCapacity;
        this.diskType = diskType;
    }

    private int checkCapacity( int dataWritten){
        if(storageCapacity <dataWritten){
            return storageCapacity;
        }
        return dataWritten;
    }

    private int spaceLeft() {
        return storageCapacity - capacityUsed;
    }

    public String writingDate(int dataSize){
     if(dataSize > remainingCapacity){
         return "not enough storage";
     }
     capacityUsed += dataSize;
     remainingCapacity -= dataSize;
     return "data sucessfully writtento disc" + remainingCapacity;
    }

    public String diskInfo(int dataSize){
        String output = String.format("\n Disk name: %s\nMax Capacity: %d" + "\n Space used: %d" + "\n Available space:%d\n", name,storageCapacity,capacityUsed,remainingCapacity);
    return output;
    }

}
