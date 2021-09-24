import java.util.*;
public class BoxDemo {
    public static void main(String[] args) {
        Box b1=new Box(100,50,200);
        b1.display();
        System.out.println("Volume is "+b1.getVolume());
        b1.setLength(b1.getLength()*110/100);
        b1.setWidth(b1.getWidth()*120/100);
        b1.setHeight(b1.getHeight()*108/100);
        b1.display();
        System.out.println("updated Volume of Box1 is "+b1.getVolume());
    }
}
