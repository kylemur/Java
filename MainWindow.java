import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame implements ActionListener {
    // GUI menu setup
    JMenuBar menuBar;
    JMenu toolsMenu;
    JMenu colorsMenu;
    JMenu backgroundColor;

    JMenuItem brushTool;
    JMenuItem rectangleTool;
    JMenuItem ovalTool;
    JMenuItem triangleTool;
    JMenuItem tubeTool;
    JMenuItem eraserTool;

    JMenuItem redColor;
    JMenuItem greenColor;
    JMenuItem blueColor;
    JMenuItem yellowColor;
    JMenuItem blackColor;
    JMenuItem whiteColor;

    JMenuItem blackBG;
    JMenuItem blueBG;
    JMenuItem greenBG;
    JMenuItem redBG;
    JMenuItem whiteBG;
    JMenuItem yellowBG;

    DrawingPanel drawingPanel; // drawing functionality setup

    public MainWindow() { // constructor for MainWindow class
        super("Paint"); // adds title to the JFrame GUI

        // Menu
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        toolsMenu = new JMenu("Tools");
        menuBar.add(toolsMenu);

        colorsMenu = new JMenu("Colors");
        menuBar.add(colorsMenu);

        backgroundColor = new JMenu("Background Color");
        menuBar.add(backgroundColor);

        // Tools
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

        tubeTool = new JMenuItem("Tube Tool");
        toolsMenu.add(tubeTool);
        tubeTool.addActionListener(this);

        eraserTool = new JMenuItem("Eraser");
        toolsMenu.add(eraserTool);
        eraserTool.addActionListener(this);

        // Colors
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

        // Background Colors
        blackBG = new JMenuItem("Black");
        backgroundColor.add(blackBG);
        blackBG.addActionListener(this);

        blueBG = new JMenuItem("Blue");
        backgroundColor.add(blueBG);
        blueBG.addActionListener(this);

        greenBG = new JMenuItem("Green");
        backgroundColor.add(greenBG);
        greenBG.addActionListener(this);

        redBG = new JMenuItem("Red");
        backgroundColor.add(redBG);
        redBG.addActionListener(this);

        whiteBG = new JMenuItem("White");
        backgroundColor.add(whiteBG);
        whiteBG.addActionListener(this);

        yellowBG = new JMenuItem("Yellow");
        backgroundColor.add(yellowBG);
        yellowBG.addActionListener(this);

        // Drawing Panel
        drawingPanel = new DrawingPanel();
        add(drawingPanel, BorderLayout.CENTER);

        // Main Window Setup
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) { // menu button clicks event handling
        if (e.getSource() == brushTool) { // Tools
            drawingPanel.setTool("Brush"); 
        } else if (e.getSource() == rectangleTool) {
            drawingPanel.setTool("Rectangle");
        } else if (e.getSource() == ovalTool) {
            drawingPanel.setTool("Oval");
        } else if (e.getSource() == triangleTool) {
            drawingPanel.setTool("Triangle");
        } else if (e.getSource() == eraserTool) {
            drawingPanel.setTool("Eraser");
        } else if (e.getSource() == tubeTool) {
            drawingPanel.setTool("Tube");
        } else if (e.getSource() == redColor) { // Colors
            drawingPanel.setColor(Color.RED);
        } else if (e.getSource() == greenColor) {
            drawingPanel.setColor(Color.GREEN);
        } else if (e.getSource() == blueColor) {
            drawingPanel.setColor(Color.BLUE);
        } else if (e.getSource() == yellowColor) {
            drawingPanel.setColor(Color.YELLOW);
        } else if (e.getSource() == blackColor) {
            drawingPanel.setColor(Color.BLACK);
        } else if (e.getSource() == whiteColor) {
            drawingPanel.setColor(Color.WHITE);
        } else if (e.getSource() == blackBG) { // Background Colors
            drawingPanel.setBackground(Color.BLACK);
        } else if (e.getSource() == blueBG) {
            drawingPanel.setBackground(Color.BLUE);
        } else if (e.getSource() == greenBG) {
            drawingPanel.setBackground(Color.GREEN);
        } else if (e.getSource() == redBG) {
            drawingPanel.setBackground(Color.RED);
        } else if (e.getSource() == whiteBG) {
            drawingPanel.setBackground(Color.WHITE);
        } else if (e.getSource() == yellowBG) {
            drawingPanel.setBackground(Color.YELLOW);
        }
    }

    public static void main(String[] args) {
        new MainWindow(); // instantiates MainWindow and runs the code in the constructor
    }
}

class DrawingPanel extends JPanel { // controls tools and colors
    private int prevX, prevY; // starting mouse click coordinates
    private boolean dragging;
    private Graphics2D g2d;
    private String tool = "Brush"; // default tool is brush
    private Color color = Color.BLACK; // default color is black


    public DrawingPanel() { 
        setBackground(Color.WHITE); // default background is white

        addMouseListener(new MouseAdapter() { 
            public void mousePressed(MouseEvent e) { // mouse clicked event handling
                prevX = e.getX(); 
                prevY = e.getY(); 
                dragging = true; 
                g2d = (Graphics2D) getGraphics(); 
                g2d.setColor(color); 
            } 

            public void mouseReleased(MouseEvent e) { // mouse released event handling
                dragging = false; 
                g2d.dispose(); 
            } 
        }); 

        addMouseMotionListener(new MouseMotionAdapter() { 
            public void mouseDragged(MouseEvent e) {  // mouse clicked and dragged event handling
                if (dragging) { 
                    int x = e.getX(); 
                    int y = e.getY(); 
                    if (tool.equals("Brush")) { 
                        g2d.drawLine(prevX, prevY, x, y); 
                    } else if (tool.equals("Eraser")) { 
                        g2d.setColor(getBackground()); 
                        g2d.fillRect(x - 5, y - 5, 10, 10); 
                        g2d.setColor(color); // Reset color to current drawing color 
                    } else if (tool.equals("Rectangle")) { 
                        g2d.drawRect(Math.min(prevX, x), Math.min(prevY, y), Math.abs(prevX - x), Math.abs(prevY - y)); 
                    } else if (tool.equals("Oval")) { 
                        g2d.drawOval(prevX, prevY, Math.abs(x - prevX), Math.abs(y - prevY)); 
                    } else if (tool.equals("Triangle")) { 
                        int[] xPoints = { prevX, (prevX + x) / 2, x }; 
                        int[] yPoints = { prevY, y, prevY }; 
                        g2d.drawPolygon(xPoints, yPoints, 3); 
                    } else if (tool.equals("Tube")) { 
                        g2d.drawOval(prevX, prevY, Math.abs(x + prevX), Math.abs(y + prevY)); 
                    }
                    prevX = x; 
                    prevY = y; 
                } 
            } 
        });
    }

    public void setTool(String t) { // sets tool type
        this.tool = t;
    }

    public void setColor(Color c) { // sets tool output color
        this.color = c;
        if (g2d != null) {
            g2d.setColor(c);
        }
    }
}