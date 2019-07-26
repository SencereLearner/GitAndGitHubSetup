import java.util.Scanner;

public class RandomFunctions {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);




while (true){
  System.out.println("Please enter a number");
  int pass = input.nextInt();

  if(pass !=108){
    System.out.println("Please enter another number");
    pass = input.nextInt();
}
  else {
      System.out.println("The number is correct, you won the game!");

    switch (pass) {

      case 0:
        System.out.println("Wrong Number");
        break;
      case 1:
        System.out.println("Wrong Number");
        break;
      case 108:
        System.out.println("Access Allowed");
        break;

      case 3:
        System.out.println("Wrong Number");
        break;
      case 4:
        System.out.println("Wrong Number");
        break;

      default:
        System.out.println("Out of combinations");

    }
    }
    }



  }


}
