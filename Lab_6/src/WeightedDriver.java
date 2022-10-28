import javax.swing.*;
import java.awt.*;

public class WeightedDriver {
    public static void main(String[] args) throws Exception {
        JFrame jf = new JFrame("Grade Calculator");//set frame and container
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = jf.getContentPane();
        contentPane.setLayout(new BorderLayout());

        JPanel jp=new JPanel();
        JLabel num1=new JLabel("EarnedPoint");//set earned point
        jp.add(num1);
        JTextField jtf1=new JTextField(10);
        jp.add(jtf1);
        contentPane.add(jp);

        JLabel num2=new JLabel("TotalPoint");//set total point
        jp.add(num2);
        JTextField jtf2=new JTextField(10);
        jp.add(jtf2);
        contentPane.add(jp);

        JLabel num3=new JLabel("Percentage of Class");//set percentage of class
        jp.add(num3);
        JTextField jtf3=new JTextField(10);
        jp.add(jtf3);
        contentPane.add(jp);
        JButton c=new JButton("Calculate");
        jp.add(c);
        contentPane.add(jp);
        jf.setSize(700, 700);
        jf.setVisible(true);
        c.addActionListener(event->{
            String s1=jtf1.getText();//transfer the input from string to double
            double d1=Double.parseDouble(s1);
            String s2=jtf2.getText();
            double d2=Double.parseDouble(s2);
            String s3=jtf3.getText();
            double d3=Double.parseDouble(s3);

            App app=new App();
            app.setEarnedPoint(d1);
            app.setPointTotal(d2);
            app.setAssPercet(d3);
            JLabel gradeJL=new JLabel("Weighted: "+app.calculate());//set calculate fnction
            jp.add(gradeJL);
            jf.validate();
        });


    }

}

