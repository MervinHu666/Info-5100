import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
   
    public static void main(String[] args) throws Exception {
        App app=new App();
        
          System.out.println("Please input your earned point, if you finshed, input f");//attribute the earned point
          Scanner ep=new Scanner(System.in);
          while (ep.hasNextDouble()){
          app.earnedPoint.add(ep.nextDouble());}
          System.out.println("Your earned point is"+app.earnedPoint);
          System.out.println("Please input your total point, if you finshed, input f");//attribute the total point
          Scanner tp=new Scanner(System.in);
          while (tp.hasNextDouble()){
          app.totalPoint.add(tp.nextDouble());}
          System.out.println("Your total point is"+app.totalPoint);
          System.out.println("Please input your assignment percent in integer such as 20 ,30, if you finshed, input f");//attribute the assignment percentage
          Scanner ap=new Scanner(System.in);
          while (ap.hasNextDouble()){
          app.assPercent.add(ap.nextDouble());}
          System.out.println("Your assignment percent is"+app.assPercent);
          app.checkWeight(app.checkPercent);//check the total weight
     
      app.calculate(); //calculate the grade
      System.out.println("Your total grade of total percent is "+app.weight);
      if (app.weight>0.9){
          System.out.println("Your grade is A");}
          if (app.weight>0.8&app.weight<0.9){
              System.out.println("Your grade is B");}
              if (app.weight>0.7&app.weight<0.8){
                  System.out.println("Your grade is C");}
                  if (app.weight>0.6&app.weight<0.7){
                      System.out.println("Your grade is D");}
                      if (app.weight<0.6){
                          System.out.println("Your grade is F");}
      
  }
}
