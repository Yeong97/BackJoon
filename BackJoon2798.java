import java.util.Scanner;
import java.io.*;
class B2798 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int M_card;
    int Max;
    int temp=0;
    int sum;
    int result=0;
    M_card = scan.nextInt();
    Max = scan.nextInt();
    
    int[] card = new int[M_card];
    for(int i=0; i<M_card; i++)
      card[i] = scan.nextInt();
    
    temp = Max;
    
    for(int i=0; i<M_card; i++) {
      for(int j=1; j<M_card; j++) {
        if(i>=j) continue;
        for(int k=2; k<M_card; k++) {
          if(j>=k) continue;
          sum = card[i] + card[j] + card[k];
          if(Max>=sum && Max-sum<temp) {
            temp = Max-sum;
            result = sum;
          }
        }
      }
    }
    System.out.println(result);
  }
}