import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String txt = scan.nextLine();
        String firstLetter = String.valueOf(txt.charAt(0));
        String secondLetter = String.valueOf(txt.charAt(1));
        String penultimateLetter = String.valueOf(txt.charAt(txt.length()-2));
        String lastLetter = String.valueOf(txt.charAt(txt.length()-1));
        if((firstLetter.equalsIgnoreCase(lastLetter)&&(secondLetter.equalsIgnoreCase(penultimateLetter)))){
            System.out.println("Starts and ends with "+firstLetter.toLowerCase()+secondLetter.toLowerCase());
        }else if(firstLetter.equalsIgnoreCase(lastLetter)) {
            System.out.println("Starts and ends with "+firstLetter.toLowerCase(Locale.ROOT));
        } else{
            System.out.println("No mirrored part!");
        }
    }
}

