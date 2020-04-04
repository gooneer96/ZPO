package com.company;

import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;
import java.util.List;
import javax.swing.*;

class PolEngExam extends JFrame implements ActionListener
{
    private ParserJ parser;
    private Levensthein lev;
    private JLabel l,l1;
    private JButton b1,b2;
    private JTextField answer;
    private int current=0;
    private double count=0;
    private HashMap<String, ArrayList<String>> json;
    private List<String> keys;
    private ArrayList<String> values;
    private double start,end;
    private QueAnsPair[] outputs;

    PolEngExam(String s) throws FileNotFoundException
    {
        super(s);
        l = new JLabel();
        add(l);
        b1 = new JButton("Next");
        b2 = new JButton("Result");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b2.setEnabled(false);
        add(b1);
        add(b2);
        l1 = new JLabel();
        answer = new JTextField();
        add(l1);add(answer);
        parser = new ParserJ();
        json = parser.parseFileToJavaObject();
        lev = new Levensthein();
        keys = new ArrayList<String>(json.keySet());
        Collections.shuffle(keys);
        outputs = new QueAnsPair[5];
        set();
        start = System.currentTimeMillis();
        l.setBounds(30, 40, 450, 20);
        l1.setBounds(50, 80, 100, 20);
        l1.setText("Answer:");
        answer.setBounds(110, 80, 100, 20);
        b1.setBounds(100, 240, 100, 30);
        b2.setBounds(270, 240, 100, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(600, 350);
    }

    public void actionPerformed(ActionEvent e)
    {
        outputs[current] = new QueAnsPair(l.getText(),answer.getText());
        if(e.getSource()==b1)
        {
            if(check()==1)
                count=count+1;
            else if (check()==0.5)
                count=count+0.5;
            current++;
            set();
            if(current==4)
            {
                b1.setEnabled(false);
                b2.setEnabled(true);
            }
        }
        if(e.getActionCommand().equals("Result"))
        {
            if(check()==1)
                count=count+1;
            else if (check()==0.5)
                count=count+0.5;
            current++;
            end = System.currentTimeMillis();
            DecimalFormat numberFormat = new DecimalFormat("#.00");
            JOptionPane.showMessageDialog(this,"Correct answers="+count+"\nYour test take that amount of time: "+ numberFormat.format(((end -start)/1000))+"s");
            try {
                parser.parseObjectToFile(outputs);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            System.exit(0);
        }
    }
    void set()
    {


        l.setText("Question"+ (current+1) +". Please translate word " + keys.get(current) + " into English");
        l.setBounds(30,40,450,20);
        answer.setText("");

    }
    double check()
    {

        values = (json.get(keys.get(current)));
        double result =0;
        for (int i=0;i<values.size();i++)
        {
           result = lev.Lev(answer.getText(),values.get(i));
            if(result==0)
                return 1;
            else if(result==1)
                return 0.5;
        }
        return 0;
    }

}