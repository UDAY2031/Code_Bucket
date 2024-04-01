import java.awt.Color;

import javax.swing.*;
public class applet extends JFrame{
    JFrame j;
    applet(){
        JButton b = new JButton("Click");
        b.setBounds(130,100,100,40);
        add(b);
        setSize(400,500);
        b.setBackground(Color.ORANGE);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new applet();
    }
}