package javaprep;

import javax.swing.*;
import java.io.*;
import javax.swing.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prepare extends JFrame implements ActionListener {

    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton add, sub, mul, div, eq, clr;

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    Prepare() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setLayout(null);

        textField = new JTextField();
        textField.setBounds(30, 20, 220, 40);
        add(textField);

        // Number buttons
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        // Operators
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        eq = new JButton("=");
        clr = new JButton("C");

        JButton[] operators = {add, sub, mul, div, eq, clr};

        for (JButton btn : operators) {
            btn.addActionListener(this);
        }

        // Set positions
        int x = 30, y = 80;
        int count = 1;

        for (int i = 1; i <= 9; i++) {
            numberButtons[i].setBounds(x, y, 50, 40);
            add(numberButtons[i]);

            x += 60;
            if (i % 3 == 0) {
                x = 30;
                y += 50;
            }
        }

        numberButtons[0].setBounds(30, y, 50, 40);
        add(numberButtons[0]);

        add.setBounds(210, 80, 50, 40);
        sub.setBounds(210, 130, 50, 40);
        mul.setBounds(210, 180, 50, 40);
        div.setBounds(210, 230, 50, 40);
        eq.setBounds(90, y, 110, 40);
        clr.setBounds(210, 280, 50, 40);

        add(add); add(sub); add(mul); add(div); add(eq); add(clr);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        // Numbers
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText() + i);
            }
        }

        // Operators
        if (e.getSource() == add) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }

        if (e.getSource() == sub) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }

        if (e.getSource() == mul) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }

        if (e.getSource() == div) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }

        if (e.getSource() == eq) {
            num2 = Double.parseDouble(textField.getText());

            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }

            textField.setText(String.valueOf(result));
        }

        if (e.getSource() == clr) {
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        new Prepare();
    }
}


