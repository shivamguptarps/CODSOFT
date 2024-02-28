import java.util.Scanner;
import java.util.Random;
public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int n=100;
        int num = random.nextInt(n);
        num+=1;

        boolean flag=false;
        int userPrompt;

        while (!flag) { 
            
            System.out.println(  "Guess a number between 1 and 100: "); 
                
                userPrompt=sc.nextInt();
 
            if (userPrompt > num) { 
                System.out.println("Too high, try again"); 
            } 

            else if (userPrompt < num) { 
                System.out.println("Too low, try again"); 
            } 
            else { 
                System.out.println("Yes, you guessed the number. The number was "+num); 
                flag = true; 
            } 
        } 

    }
}
