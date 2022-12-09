package neu.info5100.frame;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Deque;

public class Util {

    public static void addActionListener(JButton currentClickBtn, JButton textBtn, Deque deque){
        if(currentClickBtn.getText()!=null&&!currentClickBtn.getText().equals("")){
            System.out.println("this btn has text");
            return;
        }
        currentClickBtn.setText(textBtn.getText());
        textBtn.setVisible(false);
        ArrayList<JButton> jButtons = new ArrayList<>();
        jButtons.add(currentClickBtn);
        jButtons.add(textBtn);
        deque.add(jButtons);
    }

    public static int getScore(String text1,String text2,String text3){
        int score = 0;
        if(text1.equals("out")){
            score++;
        }
        if(text2.equals("all")){
            score++;
        }
        if(text3.equals("nothing")){
            score++;
        }
        return score;
    }

    public static int getScore(String text1,String text2,String text3,String text4){
        int score = 0;
        if(text1.equals("It's")){
            score++;
        }
        if(text2.equals("Face")){
            score++;
        }
        if(text3.equals("Good")){
            score++;
        }
        if(text4.equals("Life")){
            score++;
        }
        return score;
    }
}
