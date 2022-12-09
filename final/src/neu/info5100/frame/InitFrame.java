package neu.info5100.frame;
import java.awt.*;
import javax.swing.*;

public class InitFrame extends JFrame {
    public InitFrame() {
        initComponents();
    }

    private void initComponents() {

        button1 = new JButton();
        button1.setPreferredSize(new Dimension(100,50));
        button2 = new JButton();
        button2.setPreferredSize(new Dimension(100,50));
        ImageIcon background = new ImageIcon("img.png");//background image
        label1 = new JLabel(background);
        ImageIcon background2 = new ImageIcon("img_1.png");//background image
        label2 = new JLabel(background2);
        ImageIcon background3 = new ImageIcon("img_2.png");//background image
        label3 = new JLabel(background3);

        Container contentPane = getContentPane();
        contentPane.setPreferredSize(new Dimension(500,500));
        contentPane.setBackground(new Color(255,255,255));
        contentPane.setLayout(null);

        //---- label1 ----;
        contentPane.add(label1);
        label1.setBounds(235, 30, background.getIconWidth(), background.getIconHeight());

        //---- button1 ----
        button1.setText("Start");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(350, 285), button1.getPreferredSize()));

        //use lambda function to set action linstener
        button1.addActionListener(e->{
            this.setVisible(false);
            pratice1.setVisible(true);
        });

        //---- button2 ----
        button2.setText("Close");
        contentPane.add(button2);
        button2.setBounds(new Rectangle(new Point(350, 460), button2.getPreferredSize()));
        button2.addActionListener(e->{
            this.dispose();
            System.exit(0);
        });

        JLabel blankJLabel = new JLabel();
        blankJLabel.setBounds(600,0,1,1);
        contentPane.add(blankJLabel);

        //---- label2 ----
        contentPane.add(label2);
        label2.setBounds(140, 260, background2.getIconWidth(), background2.getIconHeight());

        //---- label3 ----
        contentPane.add(label3);
        label3.setBounds(140, 435, background3.getIconWidth(), background3.getIconHeight());

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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // JFormDesigner - End of component initialization  
    }

    // JFormDesigner - Variables declaration 
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JLabel label2;
    private JLabel label3;
    private Pratice1 pratice1 = new Pratice1();
    // JFormDesigner - End of variables declaration  
}
