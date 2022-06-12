import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scan.nextInt();
        int [] arr = new int[n];
        int n1=0;
        int n2=1;
        int n3;
        arr[0]=0;
        arr[1]=1;
        for(int i=2; i<n; i++){
            n3=n1+n2;
            arr[i]=n3;
            n1=n2;
            n2=n3;
        }
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
