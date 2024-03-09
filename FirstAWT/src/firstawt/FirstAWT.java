/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstawt;
import java.awt.*; 
/**
 *
 * @author HP
 */
/*
class MyFrame extends Frame 
{
    Label l ;
    TextField tf ;
    Button b ;
    
    public MyFrame()
    {
        super("My AWT App");
        setLayout(new FlowLayout());
        
        l = new Label();
        tf = new TextField(20);
        b = new Button("Submit");
        
        add(l);
        add(tf);
        add(b);
    }
}
*/
public class FirstAWT extends Frame {

    /**
     * @param args the command line arguments
     */
    Label l ;
    TextField tf ;
    Button b ;
    
    public FirstAWT()
    {
        super("My AWT App");
        setLayout(new FlowLayout());
        
        l = new Label();
        tf = new TextField(20);
        b = new Button("Submit");
        
        add(l);
        add(tf);
        add(b);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        FirstAWT f = new FirstAWT();
        f.setSize(600, 400);
        f.setVisible(true);
        
        //MyFrame f = new MyFrame();
       // f.setSize(600, 400);
       // f.setVisible(true);
        
        
    }
    
}
