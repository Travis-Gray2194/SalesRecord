import java.util.Scanner;

public class PairProcess {
    public static void main( String[] args ) {

        int num1,num2;
        String toAdd="";
        int sum;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("First Number?:");
        num1 = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Second Number?:");
        num2 = keyboard.nextInt();
        keyboard.nextLine();

        sum = num1+num2;

        if(sum>200)
            toAdd+="+";

        if(sum<1000)
            toAdd+="~";

        System.out.println("The sum is:"+sum+toAdd);


    }

}

