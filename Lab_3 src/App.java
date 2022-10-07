import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
public double[] earnedPoint=new double[8];
public double[] totalPoint=new double[8];
public double[] assPercent=new double[8];
public Double weight;
public String grade;

public void setEarned(double[] e){ //set earned point
    this.earnedPoint=e;
}

public void setTotal(double[] t){ //set total point
    this.totalPoint=t;
}

public void setPercent(double[] p){ // set assignment percent
    this.assPercent=p;
}

public double calculate(){ // set calculate function
    for(int i=0;i<8;){
    
        weight=earnedPoint[i]/totalPoint[i]*assPercent[i];
        i=i+1;
        weight++;
    }
    return weight;
}



    
}
