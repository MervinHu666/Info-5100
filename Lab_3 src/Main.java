import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        App app=new App();
        
      for(int i=0;i<8;){ // set attribute
          System.out.println("Please input your earned point");
          Scanner ep=new Scanner(System.in);
          app.earnedPoint[i]=ep.nextDouble();
          System.out.println("Please input your total point");
          Scanner tp=new Scanner(System.in);
          app.totalPoint[i]=tp.nextDouble();
          System.out.println("Please input your assignment percent");
          Scanner ap=new Scanner(System.in);
          app.assPercent[i]=ap.nextDouble();
          i=i+1;
      }
      app.calculate(); //set grade
      System.out.println(app.weight);
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
