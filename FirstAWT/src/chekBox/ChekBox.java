/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chekBox;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author HP
 */

class chekBoxframe extends Frame implements ItemListener
{
    Label l ;
    Checkbox c1 , c2 , c3 ;
    
    public chekBoxframe()
    {
        super("Chek Box Demo");
        
        l = new Label("   Nothing Is Selected         ");
        c1 = new Checkbox("Java");
        c2 = new Checkbox("C#");
        c3 = new Checkbox("C++");
        
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        
        setLayout(new FlowLayout());
        
        add(l);
        add(c1);
        add(c2);
        add(c3); 
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str = "";
        if(c1.getState())
        {
            str = str+" "+c1.getLabel();
        }
        if(c2.getState())
        {
            str = str+" "+c2.getLabel();
        }
        if(c3.getState())
        {
            str = str+" "+c3.getLabel();
        }
        if(str.isEmpty())
        {
            str = "Nothing Is Selected";
        }
        
        l.setText(str);
        
    }
    
}

public class ChekBox {
    public static void main(String[] args) {
        chekBoxframe frame1 = new chekBoxframe();
        frame1.setSize(600, 400);
        frame1.setVisible(true);
    }
}
