/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actionButton;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author HP
 */
class Frame_2 extends Frame implements ActionListener
{
    int count = 0 ;
    Label l ;
    Button b ;
    
    public Frame_2()
    {
        super("Action Button");
        l = new Label("    "+count);
        b = new Button("Click");
        b.addActionListener(this);
        
        setLayout(new FlowLayout());
        
        add(l);
        add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       count++;
       l.setText("  "+count);
       
    }
}
public class ActionButton {
    public static void main(String[] args) {
        Frame_2 f1 = new Frame_2();
        f1.setSize(600, 400);
        f1.setVisible(true);
    }
}
