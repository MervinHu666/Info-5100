package neu.info5100.frame;

import java.awt.*;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import javax.swing.*;

public class Pratice2 extends JFrame {
    public Pratice2() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization
        panel5 = new JPanel();
        panel4 = new JPanel();
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        fillBtn1 = new JButton();
        label4 = new JLabel();
        fillBtn2 = new JButton();
        panel8 = new JPanel();
        labelField2 = new JLabel();
        panel9 = new JPanel();
        label5 = new JLabel();
        fillBtn3 = new JButton();
        panel2 = new JPanel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        panel3 = new JPanel();
        scrollPane2 = new JScrollPane();
        textArea3 = new JTextArea();
        panel6 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        panel10 = new JPanel();
        scrollPane3 = new JScrollPane();
        textArea2 = new JTextArea();
        panel7 = new JPanel();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();

        //font format
        Font x = new Font("Serif", 0, 20);
        Color green = new Color(0, 255, 0);
        Color blue = new Color(0, 0, 255);
        //font format
        Font textAreaFont = new Font("Serif", 0, 20);
        Dimension prefSize = new Dimension(60, 40);

        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(2, 2));

        //======== panel5 ========
        {
            panel5.setLayout(new GridLayout(1, 2));

            //======== panel4 ========
            {
                panel4.setLayout(null);
                panel4.setPreferredSize(new Dimension(600,200));

                //======== panel1 ========
                {
                    label1.setFont(x);
                    //---- label1 ----
                    label1.setText("Poke");
                    label1.setBounds(20,20,50,50);
                    panel4.add(label1);

                    fillBtn1.setPreferredSize(prefSize);
                    fillBtn1.setBackground(blue);
                    panel1.add(fillBtn1);
                    fillBtn1.addActionListener(e -> {
                        fillBtn1.setBackground(green);
                        if(currentClickBtn!=null&&currentClickBtn!=fillBtn1){
                            currentClickBtn.setBackground(blue);
                        }
                        currentClickBtn = fillBtn1;
                    });
                    fillBtn1.setBounds(160,20,70,50);
                    panel4.add(fillBtn1);

                    //---- label4 ----
                    panel1.add(label4);
                    fillBtn2.setPreferredSize(prefSize);
                    fillBtn2.setBackground(blue);
                    fillBtn2.addActionListener(e -> {
                        fillBtn2.setBackground(green);
                        if(currentClickBtn!=null&&currentClickBtn!=fillBtn2){
                            currentClickBtn.setBackground(blue);
                        }
                        currentClickBtn = fillBtn2;

                    });
                    fillBtn2.setBounds(20,80,70,50);
                    panel4.add(fillBtn2);
                    //---- label4 ----
                    label4.setFont(x);
                    label4.setText("of");
                    label4.setBounds(90,80,70,50);
                    panel4.add(label4);

                    //---- textField2 ----
                    labelField2.setText("My");
                    labelField2.setFont(x);
                    labelField2.setBounds(160,80,50,50);
                    panel4.add(labelField2);

                    //---- label2 ----
                    label2.setText("City");
                    label2.setFont(x);
                    label2.setBounds(230,80,70,50);
                    panel4.add(label2);

                    fillBtn3.setPreferredSize(prefSize);
                    fillBtn3.setBackground(blue);
                    fillBtn3.setBounds(90,130,70,50);
                    fillBtn3.addActionListener(e->{
                        fillBtn3.setBackground(green);
                        if(currentClickBtn!=null&&currentClickBtn!=fillBtn3){
                            currentClickBtn.setBackground(blue);
                        }
                        currentClickBtn = fillBtn3;
                    });
                    panel4.add(fillBtn3);
                    fillBtn4.setPreferredSize(prefSize);
                    fillBtn4.setBackground(blue);
                    fillBtn4.setBounds(160,130,70,50);
                    fillBtn4.addActionListener(e->{
                        fillBtn4.setBackground(green);
                        if(currentClickBtn!=null&&currentClickBtn!=fillBtn4){
                            currentClickBtn.setBackground(blue);
                        }
                        currentClickBtn = fillBtn4;
                    });
                    panel4.add(fillBtn4);
                }

                //======== panel9 ========
                {
                    panel9.setLayout(new FlowLayout(FlowLayout.RIGHT));

                    //---- label5 ----
                    label5.setText("Sweet");
                    label5.setFont(x);
                    panel9.add(label5);
                }
                panel4.add(panel9);
            }
            panel5.add(panel4);

            //======== panel2 ========
            {
                panel2.setLayout(new CardLayout());

                //======== scrollPane1 ========
                {

                    textArea1.setLineWrap(true);
                    textArea1.setFont(textAreaFont);
                    //---- textArea1 ----
                    textArea1.setText("Rules\n" +
                            "1. Fill in the blank to guess the name of song, some word might exist in different songs\n" +
                            "2. Click the text field then click the word in box to fill in the word.\n" +
                            "3. Click the check button to check the answer.\n" +
                            "\n" +
                            "\n" +
                            "\n ");
                    scrollPane1.setViewportView(textArea1);
                }
                panel2.add(scrollPane1, "card1");
            }
            panel5.add(panel2);
        }
        contentPane.add(panel5);

        //======== panel3 ========
        {
            panel3.setLayout(new GridLayout(1, 4));

            //======== scrollPane2 ========
            {

                textArea3.setFont(textAreaFont);
                textArea3.setLineWrap(true);
                //---- textArea3 ----
                textArea3.setText("Tip\n" +
                        "1. Lady Gaga’s famous song\n" +
                        "2. Recorded in the album of Jack Harlow’s<That’s what they all say>\n" +
                        "3. Bon Jovi ‘s famous rock\n" +
                        "4. Recorded by G-Eazy and Kehlani taken from the soundtrack for The Fate of the Furious\n");
                scrollPane2.setViewportView(textArea3);
            }
            panel3.add(scrollPane2);

            //======== panel6 ========
            {
                panel6.setLayout(new GridLayout(4, 0));

                //---- button1 ----
                button1.setText("Next Level");
                button1.addActionListener(e->{

                });

                //---- button2 ----
                button2.setText("Undo");
                button2.addActionListener(e->{
                    if(operateDeq.size()>0){
                        List<JButton> pop = operateDeq.pop();
                        pop.get(0).setText("");
                        pop.get(1).setVisible(true);
                    }
                });
                panel6.add(button2);

                //---- button3 ----
                button3.setText("GiveUp");
                panel6.add(button3);
                button3.addActionListener(e->{
                    setVisible(false);
                    scoreFrame.setScore(Util.getScore(fillBtn1.getText(),fillBtn2.getText(),fillBtn3.getText(),fillBtn4.getText()));
                    scoreFrame.setVisible(true);
                });

                //---- button4 ----
                button4.setText("Check");
                button4.addActionListener(e->{
                    if((currentClickBtn==fillBtn1&&currentClickBtn.getText().equals("It's"))||
                            (currentClickBtn==fillBtn2&&currentClickBtn.getText().equals("Face"))||
                            (currentClickBtn==fillBtn3&&currentClickBtn.getText().equals("Good"))||
                            (currentClickBtn==fillBtn4&&currentClickBtn.getText().equals("Life"))
                    ){
                        textArea2.setText("\t    Result \n correct");
                    }else {
                        textArea2.setText("\t    Result \n incorrect");
                    }
                });
                panel6.add(button4);
            }
            panel3.add(panel6);

            //======== panel10 ========
            {
                panel10.setLayout(new GridLayout(1, 1));

                //======== scrollPane3 ========
                {

                    //---- textArea2 ----
                    textArea2.setText("\t    Result");
                    scrollPane3.setViewportView(textArea2);
                }
                panel10.add(scrollPane3);
            }
            panel3.add(panel10);

            //======== panel7 ========
            {
                panel7.setLayout(new GridLayout(4, 0));

                //---- button5 ----
                button5.setText("It's");
                button5.addActionListener(e->{
                    if(currentClickBtn!=null){
                        Util.addActionListener(currentClickBtn,button5,operateDeq);
                    }
                });
                panel7.add(button5);
                //---- button6 ----
                button6.setText("Good");
                button6.addActionListener(e->{
                    if(currentClickBtn!=null){
                        Util.addActionListener(currentClickBtn,button6,operateDeq);
                    }
                });
                panel7.add(button6);

                //---- button7 ----
                button7.setText("Life");
                button7.addActionListener(e->{
                    if(currentClickBtn!=null){
                        Util.addActionListener(currentClickBtn,button7,operateDeq);
                    }
                });
                panel7.add(button7);

                //---- button8 ----
                button8.setText("Face");
                button8.addActionListener(e->{
                    if(currentClickBtn!=null){
                        Util.addActionListener(currentClickBtn,button8,operateDeq);
                    }
                });
                panel7.add(button8);
            }
            panel3.add(panel7);
        }
        contentPane.add(panel3);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization
    }

    // JFormDesigner - Variables declaration 
    private JPanel panel5;
    private JPanel panel4;
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JButton fillBtn1;
    private JLabel label4;
    private JButton fillBtn2;
    private JPanel panel8;
    private JLabel labelField2;
    private JPanel panel9;
    private JLabel label5;
    private JButton fillBtn3;

    private JButton fillBtn4 = new JButton();
    private JPanel panel2;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JPanel panel3;
    private JScrollPane scrollPane2;
    private JTextArea textArea3;
    private JPanel panel6;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JPanel panel10;
    private JScrollPane scrollPane3;
    private JTextArea textArea2;
    private JPanel panel7;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8 = new JButton();

    private JButton currentClickBtn;

    private ScoreFrame scoreFrame = new ScoreFrame("1. Poker Face\n" +
            "2. Face of my city\n" +
            "3. It’s my life\n" +
            "4. Good life\n",this);


    private Deque<List<JButton>> operateDeq = new LinkedBlockingDeque<>();
    // JFormDesigner - End of variables declaration 
}
