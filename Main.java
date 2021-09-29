import java.util.Scanner;

/**
 * Main
 */
public class Main {
 public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

   System.out.println("Enter your age");
   System.out.println("My age is :" + scanner.next());
   scanner.close();
 }
}