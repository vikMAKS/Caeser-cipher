//created by Codinger
import java.util.Scanner;

public class Program
{
   
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int e = get.nextInt();
        int d = get.nextInt();
        String str = get.nextLine();
        System.out.println("--- Created by Codinger ---");
        System.out.println("");
        System.out.println("Entered string: "+str);
        System.out.println("Encode for "+e);
        System.out.println("Decode for "+d);
        System.out.println("");
        System.out.print("Encoded string is: ");
        for(int s=0; s<str.length(); s++) {
            char z = str.charAt(s);
            if(z == ' ') {
                System.out.print(z);
            } else {
                System.out.print(z+=e);
            }
        }
        System.out.println("");
        System.out.print("Decoded string is: ");
        for(int i=0; i<str.length(); i++) {
            char b = str.charAt(i);
            if(b == ' ') {
                System.out.print(b);
            } else {
                System.out.print(b-=d);
            }
        }
    }
}
