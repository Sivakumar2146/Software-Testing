package studyopedia;

import java.util.Scanner;

public class Getinput_user {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Enter the firstnumber : ");
     int firstnumber= scanner.nextInt();
     
     System.out.println("Enter the secondnumber : ");
     int sceondnumber = scanner.nextInt();
     
     int sum = firstnumber + sceondnumber ;
     System.out.println("Enter the Two add number" +"  " + sum);
     
     
    
    }
}
