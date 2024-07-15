import java.util.Scanner;

public class posOrNeg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente the number");
        int num=sc.nextInt();

        if(num>=0){
            System.out.println("Number is positive");
        }
        else{
            System.err.println("Number is negative");
        }
    }
}
