package chapter06.innerClass;

import javax.swing.*;
import java.util.Queue;

public class InnerClassTest {

    public static void main(String[] args) {
        TalkingClock talkingClock=new TalkingClock(1000,true);
        talkingClock.start();

        //keep program running until user selects "OK"
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
        Queue q ;
    }


}
