public class MusicSystem {
    private String name;
    private int noOfSpeakers;
    private boolean subWoofer;
    private int LCDScreenSize;

    public MusicSystem(String name, int noOfSpeakers, boolean subWoofer, int LCDScreenSize) {
        this.name = name;
        this.noOfSpeakers = noOfSpeakers;
        this.subWoofer = subWoofer;
        this.LCDScreenSize = LCDScreenSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfSpeakers() {
        return noOfSpeakers;
    }

    public void setNoOfSpeakers(int noOfSpeakers) {
        this.noOfSpeakers = noOfSpeakers;
    }

    public boolean isSubWoofer() {
        return subWoofer;
    }

    public void setSubWoofer(boolean subWoofer) {
        this.subWoofer = subWoofer;
    }

    public int getLCDScreenSize() {
        return LCDScreenSize;
    }

    public void setLCDScreenSize(int LCDScreenSize) {
        this.LCDScreenSize = LCDScreenSize;
    }
}
