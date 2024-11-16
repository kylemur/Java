import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MainCode {
    public static void main(String[] args) {
        new MainWindow();
    }
}

class MainWindow extends JFrame implements ActionListener {
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
    DrawingPanel drawingPanel;

    public MainWindow() {
        super("Paint"); // sets JFrame title

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

        drawingPanel = new DrawingPanel();
        add(drawingPanel, BorderLayout.CENTER);

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == brushTool) {
            drawingPanel.setTool("Brush");
        } else if (e.getSource() == rectangleTool) {
            drawingPanel.setTool("Rectangle");
        } else if (e.getSource() == ovalTool) {
            drawingPanel.setTool("Oval");
        } else if (e.getSource() == triangleTool) {
            drawingPanel.setTool("Triangle");
        } else if (e.getSource() == eraserTool) {
            drawingPanel.setTool("Eraser");
        } else if (e.getSource() == redColor) {
            drawingPanel.setColor(Color.RED);
        } else if (e.getSource() == greenColor) {
            drawingPanel.setColor(Color.GREEN);
        } else if (e.getSource() == blueColor) {
            drawingPanel.setColor(Color.BLUE);
        } else if (e.getSource() == yellowColor) {
            drawingPanel.setColor(Color.YELLOW);
        } else if (e.getSource() == blackColor) {
            drawingPanel.setColor(Color.BLACK);
        }
    }
}

class DrawingPanel extends JPanel {
    private int prevX, prevY;
    private boolean dragging;
    private Graphics2D g2d;
    private String tool = "Brush";
    private Color color = Color.BLACK;

    public DrawingPanel() {
        setBackground(Color.WHITE);

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                prevX = e.getX();
                prevY = e.getY();
                dragging = true;
                g2d = (Graphics2D) getGraphics();
                g2d.setColor(color);
            }

            public void mouseReleased(MouseEvent e) {
                dragging = false;
                g2d.dispose();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                if (dragging) {
                    int x = e.getX();
                    int y = e.getY();
                    if (tool.equals("Brush")) {
                        g2d.drawLine(prevX, prevY, x, y);
                    }
                    prevX = x;
                    prevY = y;
                }
            }
        });
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
