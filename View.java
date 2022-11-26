package Calculator; 
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class View {

    // Everything that needs to be "accessed" by the controller will be attrubutes
    // Frame
    private JFrame mainFrame;

    // Button attributes
    private JButton addButton;
    private JButton subButton;
    private JButton mulButton;
    private JButton divButton;
    private JButton resetButton;
    private JButton exitButton;

    // Text boxes
    private JTextArea leftText;
    private JTextArea rightText;

    // Labels
    private JLabel result;
    private JLabel operator;

    // Sliders
    private JSlider leftSlider;
    private JSlider rightSlider;

    // Create constructor
    public View() {
        mainFrame = new JFrame("Calculator"); // Name
        mainFrame.getContentPane().setLayout(new BorderLayout()); // Layout definition
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Default close operation
        mainFrame.setSize(600, 600); // Set initial size
        mainFrame.setVisible(true); // Making frame visible (ex. if pop-up change visibility false - true)

        JPanel mainTopPanel = new JPanel(new FlowLayout());

        // Initialize left slider
        leftSlider = new JSlider(SwingConstants.HORIZONTAL, 1, 100, 1);
        leftSlider.setMajorTickSpacing(50);
        leftSlider.setPaintTicks(true);

        // Initialize left text
        leftText = new JTextArea("1");
        leftText.setEditable(false);

        // Left slider panel
        JPanel leftSliderPanel = new JPanel(new BorderLayout());
        leftSliderPanel.add(leftText, BorderLayout.NORTH);
        leftSliderPanel.add(leftSlider, "South");
        leftSliderPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        // Initialize right slider
        rightSlider = new JSlider(SwingConstants.HORIZONTAL, 1, 101, 1);
        rightSlider.setMajorTickSpacing(50);
        rightSlider.setPaintTicks(true);

        // Initialize right text
        rightText = new JTextArea("1");
        rightText.setEditable(false);

        // Default operator
        operator = new JLabel("---");

        // Right slider pane;
        JPanel rightSliderPanel = new JPanel(new BorderLayout());
        rightSliderPanel.add(rightText, BorderLayout.NORTH);

        rightSliderPanel.add(rightSlider, "South");
        rightSliderPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        // Initialize result
        result = new JLabel("2");
        // result.setBorder(new EmptyBorder(10, 10, 10, 10));
        JPanel resultPanel = new JPanel(new FlowLayout());
        resultPanel.add(result);
        result.setBorder(BorderFactory.createLineBorder(Color.black));

        // Adding to main top panel
        mainTopPanel.add(leftSliderPanel);
        mainTopPanel.add(operator);
        mainTopPanel.add(rightSliderPanel);
        mainTopPanel.add(new JLabel("..."));
        mainTopPanel.add(resultPanel);
        mainTopPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        mainFrame.getContentPane().add(mainTopPanel, "North");

        // -----------------------------------------------------------------------------------------------
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        resetButton = new JButton("Reset"); 
        exitButton = new JButton("Exit"); 
        exitButton.setBackground(Color.RED);
        

        JPanel mainMiddlePanel = new JPanel(new FlowLayout());
        mainMiddlePanel.add(addButton); 
        mainMiddlePanel.add(subButton); 
        mainMiddlePanel.add(mulButton); 
        mainMiddlePanel.add(divButton); 
        mainMiddlePanel.add(resetButton);   
        mainMiddlePanel.add(exitButton);

        mainFrame.getContentPane().add(mainMiddlePanel);
    }

    //Add getters for everything that has action 
    public JButton getAddButton(){
        return addButton; 
    } 

    public JButton getSubButton(){
        return subButton;
    }

    public JButton getMulButton(){
        return mulButton;
    }
    
    public JButton getDivButton(){
        return divButton; 
    }

    public JButton getResetButton(){
        return resetButton;
    }
    
    public JButton getExitButton(){
        return exitButton; 
    }

    public JTextArea getLeftText(){
        return leftText; 
    }

    public JTextArea getRightText() {
        return rightText;
    }

    public JLabel getOperator() {
        return operator;
    }

    public JLabel getResult() {
        return result;
    }
    
    public JSlider getLeftSlider() {
        return leftSlider;
    }
    
    public JSlider getRightSlider() {
        return rightSlider;
    }
}
