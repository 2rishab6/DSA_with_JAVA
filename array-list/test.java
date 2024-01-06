import java.util.*;
public class test {

    public static void main(String[] args) {
        
        ArrayList<String> carlover = new ArrayList<String>();
        carlover.add("scorpio");
        carlover.add("xuv 700");
        carlover.add("Thar");
        carlover.add(2,"Lamborgini");
        carlover.add("5");
        System.out.println(carlover);
        // System.out.println(gol.get(0));
        // for (int i = 0 ; i < carlover.size() ; i++){
        //     System.out.println(carlover.get(i) + " index no = " + i); using for loop
        // // }

        // foreach loop

        // for ( String letter : carlover){
        //     System.out.println(letter);
        // }

        // Search an element

        carlover.remove("5");
        System.out.println(carlover);

        for ( int i = 0 ; i < carlover.size() ; i++)
        {
            if(carlover.get(i) == "Lamborgini"){
                System.out.println("element found at = " + i + " th position");
                return;
            }
        }System.out.println("not found");

        
    }
}
