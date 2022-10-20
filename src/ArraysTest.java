import java.util.Scanner;

public class ArraysTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to showcase the arrays? \'Y\' or \'N\'");
        String c = sc.next();
        if (c.toLowerCase().equals("y")){
            ArrayPractice aP = new ArrayPractice();
            aP.arrayMaking();
        } else if (c.toLowerCase().equals("n")){
            System.out.println("Okay, goodbye");
        } else {
            System.out.println("Invalid answer");
        }
    }
}
