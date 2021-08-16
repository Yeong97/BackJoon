import java.util.Scanner;
import java.io.*;
class B2908 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String num1,num2;
    String su1 = "";
    String su2 = "";
    String result;
    num1 = scan.next();
    num2 = scan.next();
    
    for(int i=num1.length(); i>0; i--) {
      su1 += num1.charAt(i-1);
    }
    
    for(int i=num2.length(); i>0; i--) {
      su2 += num2.charAt(i-1);
    }
    
    if(Integer.parseInt(su1) <= Integer.parseInt(su2)) result = su2;
    else result = su1;
    System.out.println(result);
  }
}