import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        if(num%2==0){
            System.err.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
