package com.torryharris.driver;

import com.torryharris.model.HatchBack;
import com.torryharris.model.MusicSystem;
import com.torryharris.model.Sedan;
import com.torryharris.model.Tyre;

public class CarTypeDemo {
    public static void main(String[] args) {
        MusicSystem harman=new MusicSystem("Harman",3,false,70);
        Tyre mrf=new Tyre("MRF",17);
        HatchBack swift=new HatchBack("Swift","Petrol",50,40.6f,6,
                mrf,harman,"Power");
        swift.displayHatchBackFeatures();
        Sedan dzire=new Sedan("Dzire","Petrol",40,
                40.4f,6,mrf,harman,30);
        dzire.displaySedanFeatures();


    }
}
