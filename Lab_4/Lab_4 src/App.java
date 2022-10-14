import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class App {
public LinkedList<Double> earnedPoint=new LinkedList<>();
public LinkedList<Double> totalPoint=new LinkedList<>();
public LinkedList<Double> assPercent=new LinkedList<>();
public Double weight=0.00;
public String grade;
public Double checkPercent=0.00;

public void setEarned(LinkedList e){ //set earned point
    this.earnedPoint=e;
}

public void setTotal(LinkedList t){ //set total point
    this.totalPoint=t;
}

public void setPercent(LinkedList p){ // set assignment percent
    this.assPercent=p;
}

public void checkWeight(Double c){//check the total weight
    this.checkPercent=c;

    for(int size=this.assPercent.size(),i=0;i<size;i++){
        checkPercent+=assPercent.get(i);
    }


    if(checkPercent==100){
        System.out.println("Your total weights is 100");
    }
}
public double calculate(){ // set calculate function
    for(int size=this.assPercent.size(),i=0;i<size;i++){
    
        weight+=earnedPoint.get(i)/totalPoint.get(i)*assPercent.get(i)/100;
    }
    return weight;
  
}



    
}
