import java.util.*;
public class Task1Additional {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int n=100;
        int num = rand.nextInt(n);
        num+=1;

        int fixedAttempt=8;

        int round=1;
        int score=0;
        int totalRound=0;

        int userPrompt;
        
        do{
            boolean check=false;
            int attempt=fixedAttempt;
            while (!check && attempt>0) {             
                
                System.out.println( 
                    "Guess a number between 1 and 100: "); 
                    
                    userPrompt=sc.nextInt();
     
                if (userPrompt > num) { 
                    System.out.println("Too high, try again"); 
                } 
    
                else if (userPrompt < num) { 
                    System.out.println("Too low, try again"); 
                } 
    
                else { 
      
                    System.out.println("Yes, you guessed the number. The number was "+num); 
                    check = true;
                    score++;
                } 
                attempt--;
            }
            if(attempt==0 && check==false){
                System.out.println("Attempt Limit Reached");
            }
            totalRound++;
            System.out.println("Do you want to continue playing if Yes -> input 1 else input -> 0 !!");
            round=sc.nextInt();

        }while(round!=0);

        System.out.println("You won "+score+" rounds out of "+totalRound+" rounds");


    }
}
