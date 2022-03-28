package com.company;
import  javax.swing.JFrame;
import  javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JFrame frame;
    private int width;
    private int height;
    private JButton botao;

    //construtor
    GUI(int w, int h){
        frame = new JFrame();
        width = w ;
        height = h ;
        botao = new JButton("My Button");
    }

    public void setGUI(){
        frame.setSize(width,height);
        frame.setTitle("My GUI");
        frame.add(botao);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);//sempre no final
    }
    public void setUpButtonListeners(){
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            System.out.println("I Was Clicked!");
            }
        };
        botao.addActionListener(buttonListener);// adicionar o evento ao botao expecifico
    }

}
