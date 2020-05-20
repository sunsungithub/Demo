package chapter06.timer;

import javax.swing.*;
import java.awt.event.ActionListener;


public class TimerTest  {

    public static void main(String[] args) {
        ActionListener actionListener=new TimePrinter();
        //construct a timer that calls the listener
        //once every 10 seconds
        Timer t=new Timer(1000, actionListener);
        t.start();

        JOptionPane.showConfirmDialog(null,"Quit program?");
        System.exit(0);

    }
}
