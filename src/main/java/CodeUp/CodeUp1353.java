package CodeUp;

import java.util.Scanner;

public class CodeUp1353 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

    for (int i = 1; i <= input; i++) {
      for (int j = 0; j < i; j++) {
        System.out.printf("*");
      }
      System.out.println("");

    }
  }
}
