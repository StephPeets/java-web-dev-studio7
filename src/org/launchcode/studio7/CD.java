package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    final String format = "mp3";
    private int minRpm = 200;
    private int maxRpm = 500;

    public CD(String title) {
        super(title);
    }

    public String getFormat() {
        return format;
    }


    public int getMinRpm() {
        return minRpm;
    }

    public void setMinRpm(int minRpm) {
        this.minRpm = minRpm;
    }

    public int getMaxRpm() {
        return maxRpm;
    }

    public void setMaxRpm(int maxRpm) {
        this.maxRpm = maxRpm;
    }

    @Override
    public String toString() {
        return  simpleClassName() + "\n" +
                "Title: " + getTitle() + '\n' +
                "Format: " + getFormat() + '\n' +
                "Minimum Disc Speed: " + getMinRpm() + "rpm\n" +
                "Maximum Disc Speed: " + getMaxRpm() + "rpm\n";
    }

    @Override
    public void spin() {
        System.out.println(simpleClassName() + " is spinning at " + getMinRpm() +
                " - " + getMaxRpm() + " rpm\n");
    }
}
