import java.util.Scanner;

class B4673 {
  public static void main(String[] args) {
    int[] num = new int[10001];
    int temp;
    int sum;
    for(int i=0; i<10001; i++) {
      num[i] = i;
    }
    for(int i=1; i<10001; i++) {
      sum=i;
      temp=i;
      for(;;) {
        if(temp/10==0)
        {
          sum = sum + temp%10;
          break;
        }
        sum = sum + temp%10;
        temp = temp/10;
      }
      if(sum <= 10000)
      num[sum] = 0;
    }
    
    for(int i=0; i<10001; i++) {
      if(num[i] != 0)
      System.out.println(num[i]);
    }
  }
}