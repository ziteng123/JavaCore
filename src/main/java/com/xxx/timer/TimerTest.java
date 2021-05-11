package com.xxx.timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.util.Date;


public class TimerTest {
    public static void main(String[] args) {
//        TimerPrinter listener = new TimerPrinter();
//        Timer timer = new Timer(1000,listener);
        Timer timer = new Timer(1000,event -> {
            System.out.println("The time is "+new Date());
            Toolkit.getDefaultToolkit().beep();
        });
        timer.start();
        // 当用户选择ok时关闭程序
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}

class TimerPrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone, the time is "+ Instant.ofEpochMilli(e.getWhen()));
        Toolkit.getDefaultToolkit().beep(); // getDefaultToolkit获取默认的工具箱，工具箱包含有关GUI环境的信息
        // beep发出一声铃声
    }
}
