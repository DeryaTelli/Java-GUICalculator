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
    private JButton fifth;
    private JButton comma;
    private JButton nine;
    private JButton three;
    private JButton six;
    private JButton multiplication;
    private JButton divide;
    private JButton extraction;
    private JButton collection;
    private JTextField textNumber1;
    private JTextField textNumber2;
    private JLabel number1;
    private JLabel number2;
    private JTextField textField3;
    private JLabel result;

    public Calculator(){
        add(panel1);
        setSize(500,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        extraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=Double.parseDouble(textNumber1.getText());
                double b=Double.parseDouble(textNumber2.getText());
                textField3.setText(String.valueOf(a-b));
            }
        });
        collection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=Double.parseDouble(textNumber1.getText());
                double b=Double.parseDouble(textNumber2.getText());
                textField3.setText(String.valueOf(a+b));
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=Double.parseDouble(textNumber1.getText());
                double b=Double.parseDouble(textNumber2.getText());
                textField3.setText(String.valueOf(a/b));
            }
        });
        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=Double.parseDouble(textNumber1.getText());
                double b=Double.parseDouble(textNumber2.getText());
                textField3.setText(String.valueOf(a*b));
            }
        });
    }
}
