import java.util.Scanner; 
import java.util.Random;


public class scramble2 {

    public static void main(String[] args) {
         
        int b = 0; // this is going to hold the random values
        int max = 126; 
        int min = 97; 
        
        Random Rand = new Random();
        
     for (int x = 0; x < 1; x++) {
        System.out.println(); 


     
        for (int y = 97; y < 126; y++) {
            char character = (char) y; // y has a value of 97,
                                       // y than gives the value of 97 to the data type (char)
                                       // (char) than converts the value of 97 to a ascii key value which is lower case a .
            System.out.print(character); 
         if (y == 102 || y== 107 || y==112 || y==117 || y==122) {
            System.out.println(); 
         }


        }

    

    }

}     
}     

