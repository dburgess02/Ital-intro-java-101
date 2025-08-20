import java.util.Scanner; 

public class ife { 

    public static void main(String[] args) { 

        String weekDay = ""; 
        int dayNo = 0; 


        Scanner keyboard = new Scanner(System.in); 

        System.out.println("Please enter a number between 1-7"); 
        dayNo = keyboard.nextInt(); 
        /* 
        if (dayNo == 1) {
            weekDay = "Monday"; 
            System.out.println(weekDay); 
        } else if (dayNo == 2) {
            weekDay = "Tuesday"; 
            System.out.println(weekDay); 
        } else if (dayNo == 3) {
            weekDay = "Wednesday"; 
            System.out.println(weekDay); 
        } else if (dayNo == 4) {
            weekDay = "Thursday"; 
            System.out.println(weekDay); 
        } else if (dayNo == 5) {
            weekDay = "Friday"; 
            System.out.println(weekDay); 
        } else if (dayNo == 6) {
            weekDay = "Saturday"; 
            System.out.println(weekDay); 
        } else if (dayNo == 7) {
            weekDay = "Sunday"; 
            System.out.println(weekDay); 
        } else 
        System.out.println("invalid weekday!"); 
      */ 

        switch (dayNo) {

            case 1: 
               weekDay = "Monday"; 
               break; 
            case 2: 
               weekDay = "Tuesday"; 
               break; 
            case 3: 
               weekDay = "Wednesday"; 
               break; 
            case 4: 
               weekDay = "Thursday"; 
               break; 
            case 5:
               weekDay = "Friday"; 
               break; 
            case 6: 
               weekDay = "Saturday"; 
               break; 
            case 7: 
               weekDay = "Sunday"; 
               break; 
            default:
               weekDay = "invalid day"; 
        }
         System.out.println(weekDay); 

        keyboard.close();   
    }
    
    
        }
        
        
    
    

