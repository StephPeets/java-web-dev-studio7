package org.launchcode.studio7;

public interface OpticalDisc {

    void spin();

    default String simpleClassName() {
        return getClass().getSimpleName();
    }
}


