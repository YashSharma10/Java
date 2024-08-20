import java.util.Scanner;

class Complex{
    int real;
    int img;

    Complex(int i,int n){
        this.real=i;
        this.img=r;
    }
    public int realsum(int i1,int i2){
        return i1+i2;
    }
    public int imgsum(int r1,int r2){
        return r1+r2;
    }
    public int realdiff(int i1,int i2){
        return i1-i2;
    }
    public int imgdiff(int r1,int r2){
        return r1-r2;
    }
    public int realprod(int i1,int i2){
        return i1*i2;
    }
    public int imgprod(int r1,int r2){
        return r1*r2;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int r1 = sc.nextInt();
        int i2 = sc.nextInt();
        int r2 = sc.nextInt();

        Complex obj = new Complex();
        System.out.println("sum is :" + obj.realsum(i1 , i2) + "+" + obj.imgsum(r1 , r2) + "i");
        System.out.println("diff is :" + obj.realdiff(i1 , i2) + "+" + obj.imgdiff(r1 , r2) + "i");
        System.out.println("product is :" + obj.realprod(i1 , i2) + "+" + obj.imgprod(r1 , r2) + "i");
    }
}