package app;

import javax.swing.*;

import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;

public class App {
    private static void append(String text, JTextArea textArea, JTextField textField) { // function to append text to
                                                                                        // textArea
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        if (!text.isBlank()) { // if not empty
            Date date = new Date();

            textArea.append(dateFormat.format(date) + ": " + text + "\n");
            textField.setText("");
        } else {
            textArea.append("ERROR: textField shouldn't be empty" + "\n");
        }
    }

    public static void main(String[] args) throws Exception {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); // use windows UI

        Font font = new Font("Roboto", Font.PLAIN, 20);

        JFrame frame = new JFrame("title");

        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close process when window closes

        JButton button = new JButton("Add message");

        //button.setPreferredSize(new Dimension(300, 80)); don't need because subPanel has preferredSize

        button.setBackground(Color.decode("#4385f5"));
        button.setForeground(Color.WHITE); // text color
        button.setBorder(null); // no ugly white border
        button.setFocusPainted(false); // remove dotted-border on click
        button.setFont(font);

        JButton button2 = new JButton("Clear");

        //button2.setPreferredSize(new Dimension(300, 80)); don't need because subPanel has preferredSize

        button2.setBackground(Color.decode("#f58543"));
        button2.setForeground(Color.WHITE); // text color
        button2.setBorder(null); // no ugly white border
        button2.setFocusPainted(false); // remove dotted-border on click
        button2.setFont(font);

        JPanel subPanel = new JPanel(); // create subPanel to fit 2 elements in one space (BorderLayout.SOUTH) since you
                                        // can only have 1 element at one border

        subPanel.setLayout(new GridLayout()); //makes the 2 buttons each have 50% of the screen width
        subPanel.add(button);
        subPanel.add(button2);
        subPanel.setBorder(null);
        subPanel.setBackground(Color.decode("#333333"));
        subPanel.setPreferredSize(new Dimension(600, 80));

        final JTextArea textArea = new JTextArea();
       

        textArea.setEditable(false);
        textArea.setBackground(Color.decode("#333333"));
        textArea.setForeground(Color.WHITE);
        textArea.setFont(font.deriveFont(14f));

        JTextField textField = new JTextField(20); //this would be better as textPromt for placeholder text but w/e
        

        textField.setBackground(Color.decode("#222222"));
        textField.setForeground(Color.decode("#eeeeee")); 
        textField.setBorder(null); 
        textField.setPreferredSize(new Dimension(500, 60)); //width 500, height 60
        textField.setMargin( new Insets(10,10,10,10) ); //should be margin: 10,10,10,10; doesn't work
        textField.setCaretColor(Color.decode("#eeeeee"));
        textField.setFont(font);
        button.addActionListener(new ActionListener(){ //button onClick
            public void actionPerformed(ActionEvent evt){
                
	
                String text = textField.getText();
                append(text, textArea, textField);
            }

        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                textArea.setText("");
            }
        });

        Action clickBtn = new AbstractAction() { //click button programatically
            public void actionPerformed(ActionEvent e) {
                button.doClick();
            }
        };

        textField.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), //click button programatically
            clickBtn);

        Container c = frame.getContentPane();

        c.add(textField, BorderLayout.NORTH);
        c.add(textArea, BorderLayout.CENTER);
        c.add(subPanel, BorderLayout.SOUTH);
        // c.add(button, BorderLayout.SOUTH);
        // c.add(button2, BorderLayout.SOUTH);
        
        frame.setVisible(true); //show window
    }
}