import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scan.nextInt();
        for(int i=0; i<=n; i++){
            if(i==0){
                System.out.println("?"+"-".repeat(n-2)+"?");
            }
        }
        for(int j=0; j<n-2; j++) {
            System.out.println("|" + "-".repeat(n - 2) + "|");
            if(j==n-3){
                System.out.println("?"+"-".repeat(n-2)+"?");
            }
        }
    }
}
