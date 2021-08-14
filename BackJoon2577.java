import java.util.Scanner;

class B2577 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] result = new int[10];
    int n0, n1, n2, n3;
    int temp;
    int temp1=0;
    n1 = scan.nextInt();
    n2 = scan.nextInt();
    n3 = scan.nextInt();
    n0 = n1 * n2 * n3;
    
    for(int i=0; i<10; i++) {
        temp = n0%10;
        if(temp==0) temp1++;
        else temp1=0;
        n0 = (n0 - temp) / 10;
        result[temp]++;
    }
    result[0] = result[0] - temp1;
    for(int i=0; i<10; i++) {
      System.out.println(result[i]);
    }
  }
}