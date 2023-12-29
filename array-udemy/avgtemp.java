import java.util.*;
public class avgtemp {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many days u wnat to calculate the temperature = ");
        int numdays = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= numdays ; i++){
            System.out.println(i + "st day temperature = ");
            int next = sc.nextInt();
            sum = sum + next;
        }
        
        double average = sum/numdays;
        System.out.println("avarage temperature = " + average);
    }
}
