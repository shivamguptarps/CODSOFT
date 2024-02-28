import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number of Subjects ");
        int numOfSubjects=sc.nextInt();

        float subjectArray[]= new float[numOfSubjects];
        float obtainedMarksSum=0;

        System.out.println("Enter the marks of Subject (marks out of 100) !!");

        for(int i=0;i<numOfSubjects;i++){
            System.out.print("Enter the "+(i+1)+"st/nd/rd/th subject mark ");
            subjectArray[i]=sc.nextFloat();
            obtainedMarksSum+=subjectArray[i];
        }
        System.out.println();

        float avgPercent=obtainedMarksSum/numOfSubjects;

        System.out.println("The total Obtained Marks is "+obtainedMarksSum);
        System.out.println("The Percentage Obtained is "+avgPercent +"%");

        if(avgPercent>=85){
            System.out.println("The Grade is [A]");
        }
        else if(avgPercent>=75){
            System.out.println("The Grade is [B]");
        }
        else if(avgPercent>=65){
            System.out.println("The Grade is [C]");
        }
        else if(avgPercent>=50){
            System.out.println("The Grade is [D]");
        }
        else{
            System.out.println("The Grade is [F]");
        }

    }
}
