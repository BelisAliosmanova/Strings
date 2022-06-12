import java.util.Scanner;

public class еx5 {
    public static void printGlasses(int n){
        int i=0;
        String firstAndLastRow = "*".repeat(2 * n) + " ".repeat(n) + "*".repeat(2 * n);
        System.out.println(firstAndLastRow);
        for(i=0; i<n-2; i++){
            if(i==((n-2)/2)){
                System.out.println("*"+"/".repeat(2*n-2)+"*"+"|".repeat(n)+"*"+"/".repeat(2*n-2)+"*");
            } else {
                System.out.println("*" + "/".repeat(2 * n - 2) + "*" + " ".repeat(n) + "*" + "/".repeat(2 * n - 2) + "*");
            }
        }
        System.out.println(firstAndLastRow);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scan.nextInt();
        printGlasses(n);
    }
}


