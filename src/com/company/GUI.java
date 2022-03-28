package com.company;
import  javax.swing.JFrame;
import  javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI {
    private JFrame frame;
    private int width;
    private int height;
    private JButton SaveButton;
    private JButton ClearButton;
    private JTextField input;
    private  JLabel label;

    //construtor
    GUI(int w, int h){
        frame = new JFrame();
        width = w ;
        height = h ;
        SaveButton = new JButton("Save");
        ClearButton = new JButton("Clear");
        input= new JTextField(15);
        label = new JLabel("Input some text");
    }

    public void setGUI(){
        frame.setSize(width,height);
        frame.setTitle("My GUI");

        Container pane= frame.getContentPane();
        /* flowLayout*/
        FlowLayout flowLayout =new FlowLayout();
        pane.setLayout(flowLayout);

        pane.add(label);
        pane.add(input);
        pane.add(SaveButton);
        pane.add(ClearButton);

        /*gridLayout
        GridLayout gridLayout =new GridLayout(1,4);
        pane.setLayout(gridLayout);

        pane.add(label);
        pane.add(input);
        pane.add(SaveButton);
        pane.add(ClearButton);*/

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);//sempre no final
    }
    public void setUpButtonListeners(){
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object eventSource=e.getSource();
                if (eventSource==SaveButton){
                    System.out.println(input.getText());
                }else if (eventSource==ClearButton){
                    input.setText("");
                }

            }
        };
        SaveButton.addActionListener(buttonListener);
        ClearButton.addActionListener(buttonListener);
    }

}
