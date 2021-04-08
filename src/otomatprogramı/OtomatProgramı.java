/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otomatprogramı;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author fgedi
 */
public class OtomatProgramı extends JFrame implements ActionListener {

   JRadioButton elliRadio= new JRadioButton("0.50 Krş", false); 
   JRadioButton birRadio= new JRadioButton("1 TL", false);
   JRadioButton besRadio= new JRadioButton("5 TL", false);
   JRadioButton onRadio= new JRadioButton("10 TL", false);
   ButtonGroup paraGroup = new ButtonGroup();
   JButton btnSubmit = new JButton("Para Ekle");
   
   
   JPanel panel = new JPanel();
   JLabel paraText = new JLabel("< Bakiye 0.00 TL >");
    
    OtomatProgramı(int width, int height){
        paraGroup.add(elliRadio);
        paraGroup.add(birRadio);
        paraGroup.add(besRadio);
        paraGroup.add(onRadio);
        
        setSize(width,height);
        setTitle("İçecek Otomatı");
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel.setLayout(new GridLayout(0,1));
        panel.setPreferredSize(new Dimension(150,250));
        panel.add(elliRadio);
        panel.add(birRadio);
        panel.add(besRadio);
        panel.add(onRadio);
        
        paraText.setFont(new Font("Tahoma", Font.BOLD, 20));
   
        add(panel);
        add(btnSubmit);        
        add (paraText);
        setVisible(true);
        
        btnSubmit.addActionListener(this);
        
    }
    
 float bakiye = 0;
 
    @Override
    public void actionPerformed(ActionEvent e) {
        
       
        
        if(elliRadio.isSelected()){
           bakiye = (float) (bakiye + 0.50);
           paraText.setForeground(Color.BLUE);
           paraText.setText(Float.toString(bakiye)+ " TL");
          
        }
        if(birRadio.isSelected()){
           bakiye = (float) (bakiye + 1);
           paraText.setForeground(Color.BLUE);
           paraText.setText(Float.toString(bakiye)+ " TL");
        }
        if(besRadio.isSelected()){
           bakiye = (float) (bakiye + 5);
           paraText.setForeground(Color.BLUE);
           paraText.setText(Float.toString(bakiye) + " TL");
        }
        if(onRadio.isSelected()){
           bakiye = (float) (bakiye + 10);
           paraText.setForeground(Color.BLUE);
           paraText.setText(Float.toString(bakiye)+ " TL");
           
        }
        
    }
    public static void main(String[] args) {
       new OtomatProgramı(1000,500);
    }
}
