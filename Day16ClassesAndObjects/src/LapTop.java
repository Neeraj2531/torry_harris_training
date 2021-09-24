public class LapTop {
    private int RAM;
    private int HDD;
    String processor;
    double ScreenSize;
    public void initialize(int R,int H,String p,double S)
    {
        RAM=R;
        HDD=H;
        processor=p;
        ScreenSize=S;
    }
    public void display(){
        System.out.println("RAM= "+RAM+""+"GB");
        System.out.println("HDD= "+HDD+""+"GB");
        System.out.println("Processor= "+processor);
        System.out.println("Screen size= "+ScreenSize);
    }


}
