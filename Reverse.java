import java.util.Scanner;

class revNum{
    int n;
    int numberRev(int n){
        int sum = 0;
        while(n!=0){
            int last = n%10;
            sum = sum * 10 + last;
            n = n/10;
        }
        return sum;
    }
}
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        revNum ob = new revNum();
        int ans = ob.numberRev(n);
        System.out.println(ans);
    }
}
