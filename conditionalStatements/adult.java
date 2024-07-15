public class adult{
    public static void main(String[] args) {
        int age=13;

        if(age>=18){
            System.out.println("user can vote");
        }
        else if(age>=13 && age<18){
            System.out.println("user is in the teenage");
        }
        else{
            System.out.println("user cant vote");
        }
    }
}