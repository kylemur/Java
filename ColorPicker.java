// package javaPaint;


import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ColorPicker extends JFrame implements ActionListener 
{
    JLabel label1;
    JButton redButton;
    JButton greenButton;
    JButton blueButton;
    JButton yellowButton;
    JButton blackButton;
    JButton whiteButton;
    JButton backButton;


    public ColorPicker() 
    {
        label1 = new JLabel("Colors"); 
        add(label1);
        
        redButton = new JButton("Red"); 
        add(redButton);

        greenButton = new JButton("Green"); 
        add(greenButton);

        blueButton = new JButton("Blue"); 
        add(blueButton);

        yellowButton = new JButton("Yellow"); 
        add(yellowButton);

        blackButton = new JButton("Black"); 
        add(blackButton);

        whiteButton = new JButton("White"); 
        add(whiteButton);

        backButton = new JButton("Back"); 
        add(backButton);


        redButton.addActionListener(this); // ActionListener is an Interface
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);
        yellowButton.addActionListener(this);
        blackButton.addActionListener(this);
        whiteButton.addActionListener(this);
        backButton.addActionListener(this);



        setLayout(new FlowLayout());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setVisible(true);
    }

    // @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == redButton)
        {
            
        }
        else if (e.getSource() == greenButton)
        {
            
        }
        else if (e.getSource() == blueButton)
        {
            
        }
        else if (e.getSource() == yellowButton)
        {
            
        }
        else if (e.getSource() == blackButton)
        {
            
        }
        else if (e.getSource() == whiteButton)
        {
            
        }
        else if (e.getSource() == backButton)
        {
            Tool tool1 = new Tool();
        }
    }
}