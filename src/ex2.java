import java.util.Locale;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String txt = scan.nextLine();
        txt = txt.toLowerCase(Locale.ROOT);
        System.out.println(txt);
        int br=0;
        int i=0;
        while(i<txt.length()){
            if(((txt.charAt(i)=='y') || (txt.charAt(i) == 'z'))&&(txt.charAt(i+1)==' ')){
                br++;
            }
            i++;
        }
        System.out.println("Thw words ending with Y or Z are: "+br);
    }
}
