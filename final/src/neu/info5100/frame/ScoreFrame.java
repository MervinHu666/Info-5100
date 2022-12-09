package neu.info5100.frame;

import java.awt.*;
import javax.swing.*;


public class ScoreFrame extends JFrame {
    public ScoreFrame(String text,JFrame jFrame) {
        initComponents(text,jFrame);
    }

    public void setScore(Integer score){
        textArea.setText("       "+score.toString());
    }

    private void initComponents(String text,JFrame jFrame) {
        // JFormDesigner - Component initialization 
        label1 = new JLabel();
        label2 = new JLabel();
        textArea = new JTextArea();
        textArea1 = new JTextArea();
        button1 = new JButton();
        button2 = new JButton();
        
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Score");
        contentPane.add(label1);
        label1.setBounds(215, 15, 80, 40);

        //---- label2 ----
        label2.setText("Answer");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(220, 105), label2.getPreferredSize()));

        //---- label3 ----
        textArea.setText("");
        Font x = new Font("Serif", 0, 20);
        textArea.setFont(x);
        contentPane.add(textArea);
        textArea.setPreferredSize(new Dimension(90,35));
        textArea.setBounds(190, 65, 90, 35);
        textArea.setEnabled(false);
        textArea.setBackground(new Color(255,192,0));

        //---- textArea1 ----
        textArea1.setText(text);
        textArea1.setLineWrap(true);
        contentPane.add(textArea1);
        textArea1.setBounds(160, 130, 180, 90);

        //---- button1 ----
        button1.setText("Close");
        contentPane.add(button1);
        button1.addActionListener(e->{
            this.dispose();
            System.exit(0);
        });

        //---- button2 ----
        button2.setText("Continue");
        contentPane.add(button2);
        button1.setBounds(new Rectangle(new Point(200, 240), button2.getPreferredSize()));
        button2.setBounds(new Rectangle(new Point(200, 290), button2.getPreferredSize()));
        JLabel blank = new JLabel();
        blank.setBounds(500,400,0,0);
        contentPane.add(blank);
        button2.addActionListener(e->{
            this.dispose();
            jFrame.setVisible(true);
        });

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization 
    }

    // JFormDesigner - Variables declaration 
    private JLabel label1;
    private JLabel label2;
    private JTextArea textArea;
    private JTextArea textArea1;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration 
}
