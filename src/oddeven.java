import java.util.Scanner;

public class oddeven {

    public static void main(String[] args) {

        int x;
        System.out.println("Enter any number");
        Scanner r = new Scanner(System.in);
        x = r.nextInt();

        if(x%2==0){
            System.out.println("Even number");
        }

        else{
            System.out.println("Odd number");
        }
    }
}
