package chapter06.innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TalkingClock {
    private int interval;
    private boolean beep;

    public TalkingClock(int n,boolean b){
        this.interval=n;
        beep=b;
    }

    public void start(){
        ActionListener listener=new TimePrinter();
        Timer timer=new Timer(interval,listener);
        timer.start();
    }

    public class TimePrinter implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Date date=new Date();
            System.out.println("At the tone, the time is "+date);
            if(beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}
