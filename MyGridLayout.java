import java.awt.*;    
import javax.swing.*;    
import java.util.HashMap;
public class MyGridLayout{    

HashMap<Integer, String> gridBorder = new HashMap<Integer, String>();


JFrame f;    
MyGridLayout(){    

    gridBorder.put(1, "A");
    gridBorder.put(2, "B");
    gridBorder.put(3, "C");
    gridBorder.put(4, "D");
    gridBorder.put(5, "E");
    gridBorder.put(6, "F");
    gridBorder.put(7, "G");
    gridBorder.put(8, "H");
    gridBorder.put(9, "I");
    gridBorder.put(10, "J");


    f=new JFrame("Battleship");    
    JButton b1=new JButton("1");    
    JButton b2=new JButton("2");    
    JButton b3=new JButton("3");    
    JButton b4=new JButton("4");    
    JButton b5=new JButton("5");    
    JButton b6=new JButton("6");    
    JButton b7=new JButton("7");    
    JButton b8=new JButton("8");    
    JButton b9=new JButton("9");
    
     // adding buttons to the frame       
    f.add(b1); f.add(b2); f.add(b3);  
    f.add(b4); f.add(b5); f.add(b6);  
    f.add(b7); f.add(b8); f.add(b9);    
  
    // for (int i = 0; i < 10; i++){
    //     buttons[i] = new JButton([i], f);
    // }s

    // setting grid layout of 3 rows and 3 columns    
    f.setLayout(new GridLayout(0, gridBorder.Length /2, 10, 10));
    f.setSize(300,300);    
    f.setVisible(true);    
}    
public static void main(String[] args) {    
    new MyGridLayout();    
}    
}    
