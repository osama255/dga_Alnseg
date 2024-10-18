package utilities;

import org.testng.annotations.Test;

import java.util.Random;

public class Improvements {


    // method platform not work without thread >> Done
    //run in xml file >> Done
    //json files >>Done
    // method Screenshoot not working>> Done
    //upload button >>Done
    //Generic method to upload button
    //popup ok, replace thread sleep with method



    @Test
    public void print(){
        Random random=new Random();
        int randomInt=random.nextInt();
        System.out.print(randomInt+".sa");


    }

}
