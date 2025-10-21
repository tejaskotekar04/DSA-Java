package arrays;
import java.util.*;
class Average {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("How many days temperature?");
        int numDays=sc.nextInt();
      
        int sum=0;
        for(int i=1; i<=numDays; i++){
            System.out.println("Day" + i + "'s high temp:");
            int next=sc.nextInt();
            sum=sum+next;
        }
        double Average=sum/numDays;
        System.out.println();
        System.out.println("Average Temp=" + Average);
    }
}

