package Proxy;

import java.util.List;
import java.util.ArrayList;
public class Main {
    /**
     * Test method
     */
    public static void main(final String[] arguments) {
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        ArrayList<Image> images = new ArrayList<Image>();
        images.add(image1);
        images.add(image2);
        for (Image image : images) {
            image.showData();
    }

System.out.println("___________________________");

        for (Image image : images) {
            image.displayImage();
        }
        System.out.println("___________________________");
        for (Image image : images) {
            image.displayImage();
        }
    }


}




