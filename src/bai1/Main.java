package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.print("nhap canh a: ");
            int a=scanner.nextInt();
            System.out.print("nhap canh b: ");
            int  b=scanner.nextInt();
            System.out.print("nhap canh c: ");
            int c=scanner.nextInt();
            triangle(a,b,c);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void triangle(double a,double b,double c){

            if(a<=0 || b<=0|| c<=0){
                throw new IllegalArgumentException("3 canh phai lon hon >0 )");
            } else if ( a+b<c || b+c<a || c+a<b) {
                throw new IllegalArgumentException("canh khong hop le");
            }
    }
}
