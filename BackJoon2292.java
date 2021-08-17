import java.util.Scanner;
import java.io.*;
class B2292 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int bee= scan.nextInt();
    int result;
    int wall=8;
    if(bee==1) result=1;
    else {
      result=2;
      for(int i=2; i<=bee;i++) {
        if(i==wall) {
          wall = wall + result * 6;
          result++;
        }
      }
    }
    System.out.println(result);
  }
}