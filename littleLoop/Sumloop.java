import java.util.Scanner;
    public class Userloop{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
            int sum = 0;
            for(int count = 1; count <= number; count++){
                sum = sum + count;
                System.out.print(sum + " ");
            }
        }
    }
