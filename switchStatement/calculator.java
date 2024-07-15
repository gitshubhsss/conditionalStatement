import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choise\n:1 addtion \n:2subtraction \n3:multiplication\n4:division");
        int ch=sc.nextInt();

        switch(ch){
            case 1:
            System.out.println("Enter two numbers");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum=a+b;
            System.out.println("Addition of two number is "+sum);
            break;

            case 2:
            System.out.println("Enter two numbers");
            int c=sc.nextInt();
            int d=sc.nextInt();
            int sub=c-d;
            System.out.println("Addition of two number is "+sub);
            break;

            case 3:
            System.out.println("Enter two numbers");
            int e=sc.nextInt();
            int f=sc.nextInt();
            int mul=e*f;
            System.out.println("Addition of two number is "+mul);
            break;

            case 4:
            System.out.println("Enter two numbers");
            int g=sc.nextInt();
            int h=sc.nextInt();
            double div=g/h;
            System.out.println("Addition of two number is "+div);
            break;

            default:
            System.out.println("invalid choise");
            break;
        }

        
    }
}
