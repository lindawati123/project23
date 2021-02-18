package contoh2;

import java.awt.*;

public class tesframelagi {
    private Frame f;
    public tesframelagi(){
        f= new Frame("tes frame 2");
        f.setSize(200,100);
        f.setVisible(true);

    }
    public static void main (String[]args){
        tesframelagi tf = new tesframelagi();
    }
}
