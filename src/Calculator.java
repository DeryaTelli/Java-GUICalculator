import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JPanel panel1;
    private JButton four;
    private JButton seven;
    private JButton one;
    private JButton zero;
    private JButton eight;
    private JButton two;
    private JButton five;
    private JButton equal;
    private JButton nine;
    private JButton three;
    private JButton six;
    private JButton cbutton;
    private JButton divide;
    private JButton multi;
    private JButton extraction;
    private JTextField textNumber1;
    private JButton collection;
    private JLabel label;
    private double answer ,number;
    int operation;

    public void calculate(){
        switch (operation){
            case 1:
                answer=number+Double.parseDouble(textNumber1.getText());
                textNumber1.setText(Double.toString(answer));
                break;
            case 2:
                answer=number-Double.parseDouble(textNumber1.getText());
                textNumber1.setText(Double.toString(answer));
                break;
            case 3:
                answer=number/Double.parseDouble(textNumber1.getText());
                textNumber1.setText(Double.toString(answer));
                break;
            case 4:
                answer=number*Double.parseDouble(textNumber1.getText());
                textNumber1.setText(Double.toString(answer));
                break;
        }
    }

    public void getValue(ActionEvent e){
        textNumber1.setText(textNumber1.getText()+e.getActionCommand());
        
    }
    public Calculator() {
        add(panel1);
        setTitle("Calculator");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               getValue(e);
            }
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getValue(e);
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getValue(e);
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getValue(e);
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getValue(e);
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getValue(e);
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getValue(e);
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getValue(e);
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getValue(e);
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getValue(e);
            }
        });
        cbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textNumber1.setText("");
            }
        });
        collection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        collection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number=Double.parseDouble(textNumber1.getText());
                operation=1;
                textNumber1.setText("");
                label.setText(number+e.getActionCommand());

            }
        });
        extraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number=Double.parseDouble(textNumber1.getText());
                operation=2;
                textNumber1.setText("");
                label.setText(number+e.getActionCommand());
            }
        });
        multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number=Double.parseDouble(textNumber1.getText());
                operation=4;
                textNumber1.setText("");
                label.setText(number+e.getActionCommand());
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number=Double.parseDouble(textNumber1.getText());
                operation=3;
                textNumber1.setText("");
                label.setText(number+e.getActionCommand());
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
                label.setText("");
            }
        });
    }

}

