import java.util.regex.Pattern;  
import java.util.Scanner;  
import java.util.regex.Matcher;  

class InvalidRegNoException extends Exception {  
    public InvalidRegNoException(String message) {  
        super(message);  
    }  
}  

public class checkValidRegno {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the registration number: ");  
        
        String input = sc.nextLine();  
        String regex = "\\d{2}[a-zA-Z]{3}\\d{4,5}";  

        try {  
            Pattern pattern = Pattern.compile(regex);  
            Matcher matcher = pattern.matcher(input);  

            if (matcher.matches()) {  
                System.out.println("succesful:");  
            } else {  
                throw new InvalidRegNoException("enter a valid regno: ");  
            }  
        } catch (InvalidRegNoException e) {  
            System.out.println(e.getMessage());  
        } finally {  
            sc.close();  
        }  
    }  
}