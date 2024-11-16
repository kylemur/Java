// package javaPaint;


import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// class Addition extends JFrame implements ActionListener
class Tool extends JFrame implements ActionListener 
{
    JLabel label1;
    JToolBar toolBar;
    JButton brushButton;
    JButton eraserButton;
    JButton shapeButton;
    JButton backButton;


    // public Addition()
    public Tool() 
    {
        label1 = new JLabel("Tools"); 
        add(label1);

        toolBar = new JToolBar();
        add(toolBar);
        
        brushButton = new JButton("Brush"); 
        add(brushButton);

        eraserButton = new JButton("Eraser"); 
        add(eraserButton);

        shapeButton = new JButton("Shape Tool"); 
        add(shapeButton);

        backButton = new JButton("Back"); 
        add(backButton);


        brushButton.addActionListener(this); // ActionListener is an Interface
        eraserButton.addActionListener(this);
        shapeButton.addActionListener(this);
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
        if (e.getSource() == brushButton)
        {
            
        }
        else if (e.getSource() == eraserButton)
        {
            
        }
        else if (e.getSource() == shapeButton)
        {
            Shape shape1 = new Shape();
        }
        else if (e.getSource() == backButton)
        {
            MainWindow mainW1 = new MainWindow();
        }
    }
}










/*
 * 
 * // package javaPaint; // swingdemo


import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// public class AddGUI
public class MainCode 
{
    public static void main(String[] args) 
    {
        // Addition obj = new Addition();
        MainWindow mainW1 = new MainWindow();
    }
}



class MainWindow extends JFrame implements ActionListener 
{
    JMenuBar menuBar;

    JMenu toolsMenu;
    JMenu colorsMenu;

    JMenuItem brushTool;
    JMenuItem rectangleTool;
    JMenuItem ovalTool;
    JMenuItem triangleTool;
    JMenuItem eraserTool;

    JMenuItem redColor;
    JMenuItem greenColor;
    JMenuItem blueColor;
    JMenuItem yellowColor;
    JMenuItem blackColor;
    JMenuItem whiteColor;

    public MainWindow() 
    {
        setTitle("Paint");

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        toolsMenu = new JMenu("Tools");
        menuBar.add(toolsMenu);

        colorsMenu = new JMenu("Colors");
        menuBar.add(colorsMenu);


        brushTool = new JMenuItem("Brush");
        toolsMenu.add(brushTool);
        brushTool.addActionListener(this);

        rectangleTool = new JMenuItem("Rectangle Tool");
        toolsMenu.add(rectangleTool);
        rectangleTool.addActionListener(this);

        ovalTool = new JMenuItem("Oval Tool");
        toolsMenu.add(ovalTool);
        ovalTool.addActionListener(this);

        triangleTool = new JMenuItem("Triangle Tool");
        toolsMenu.add(triangleTool);
        triangleTool.addActionListener(this);

        eraserTool = new JMenuItem("Eraser");
        toolsMenu.add(eraserTool);
        eraserTool.addActionListener(this);



        redColor = new JMenuItem("Red");
        colorsMenu.add(redColor);
        redColor.addActionListener(this);

        greenColor = new JMenuItem("Green");
        colorsMenu.add(greenColor);
        greenColor.addActionListener(this);

        blueColor = new JMenuItem("Blue");
        colorsMenu.add(blueColor);
        blueColor.addActionListener(this);

        yellowColor = new JMenuItem("Yellow");
        colorsMenu.add(yellowColor);
        yellowColor.addActionListener(this);

        blackColor = new JMenuItem("Black");
        colorsMenu.add(blackColor);
        blackColor.addActionListener(this);

        whiteColor = new JMenuItem("White");
        colorsMenu.add(whiteColor);
        whiteColor.addActionListener(this);



        setLayout(new FlowLayout());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == brushTool)
        {
            Tool tool1 = new Tool();
        }
        else if (e.getSource() == redColor)
        {
            ColorPicker color1 = new ColorPicker();
        }
    }
}


 */