import java.util.Scanner;
public class App {
    private double pointTotal;
    private double earnedPoint;
    private double assPercent;
    public double weight;
public App(){

}
public void setPointTotal(double p){
    pointTotal=p;
}
public void setEarnedPoint(double e){
    earnedPoint=e;
}
public void setAssPercet(double a){
    assPercent=a;
}

public double calculate(){
    weight=earnedPoint/pointTotal*assPercent;
    return weight;

}
}
    
