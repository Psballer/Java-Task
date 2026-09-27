import java.util.Scanner;
    public class Downloop{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        for(int count = number ; count >= 1; count--){
            System.out.print(count + " ");
        }
 }
} 
