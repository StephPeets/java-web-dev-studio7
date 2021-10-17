package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc {
    private String title;

    public BaseDisc(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
