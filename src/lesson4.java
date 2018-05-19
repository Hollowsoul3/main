/**
 * Created by User on 19.05.2018.
 */
public class lesson4 {
    public static void main(String[] args){
        System.out.println(ploshad(1,2));
        System.out.println(ploshad(7,8));
        System.out.println(ploshad(9,10));
        System.out.println(f2(5));
        System.out.println(f2(-2));
        System.out.println(f2(19));
        System.out.println(f3(Math.toRadians(45)));
        System.out.println(f4(3,4,90));
        System.out.println(f4(12,5,90));
        System.out.println(f4(15,16,180));

    }
    public static int symma2(int a,int b){
        int c=a+b;
        return c;
    }
    public static double f(double x){
        double y=x*x-1;
        return y;
    }
    public static double ploshad(double a, double b){
        double y=a*b;
        return y;
    }
    public static double f2(double x){
        double y=Math.pow(x,3)+x*x+1;
        return y;
    }
    public static double f3(double x){
        double y=2*Math.sin(2*x);
        return y;
    }
    public static double f4(double a, double b, double c){
        double y=Math.sqrt(a*a+b*b-2*a*b*Math.cos(Math.toRadians(c)));
        return y;
    }

}
