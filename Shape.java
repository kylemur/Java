// // package javaPaint;


// import javax.swing.*;
// import java.awt.FlowLayout;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// class Shape extends JFrame implements ActionListener 
// {
//     JLabel label1;
//     JButton rectangleButton;
//     JButton ovalButton;
//     JButton triangleButton;
//     JButton backButton;

//     public Shape() 
//     {
//         label1 = new JLabel("Shapes"); 
//         add(label1);
        
//         rectangleButton = new JButton("Rectangle"); 
//         add(rectangleButton);

//         ovalButton = new JButton("Oval"); 
//         add(ovalButton);

//         triangleButton = new JButton("Triangle"); 
//         add(triangleButton);

//         backButton = new JButton("Back");
//         add(backButton);

//         rectangleButton.addActionListener(this); // ActionListener is an Interface
//         ovalButton.addActionListener(this);
//         triangleButton.addActionListener(this);
//         backButton.addActionListener(this);



//         setLayout(new FlowLayout());
//         setSize(400, 400);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLocationRelativeTo(null);

//         setVisible(true);
//     }

//     // @Override
//     public void actionPerformed(ActionEvent e) 
//     {
//         if (e.getSource() == rectangleButton)
//         {
            
//         }
//         else if (e.getSource() == ovalButton)
//         {
            
//         }
//         else if (e.getSource() == triangleButton)
//         {
            
//         }
//         else if (e.getSource() == backButton)
//         {
//             Tool tool1 = new Tool();
//         }
//     }
// }


// // class RectangleShape extends Shape {
    
// // }

// // class OvalShape extends Shape {
    
// // }

// // class TriangleShape extends Shape {
    
// // }