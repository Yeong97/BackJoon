import java.util.Scanner;

class B8958 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int test_case;
    String[] OX_case;
    int[] result;
    int add;
    
    test_case = scan.nextInt();
    
    OX_case = new String[test_case];
    result = new int[test_case];
    
    for(int i=0; i<test_case; i++) {
      OX_case[i] = scan.next();
    }
    
    for(int i=0; i<test_case; i++) {
      add=0;
      for(int j=0; j<OX_case[i].length(); j++) {
        if(OX_case[i].charAt(j) == 'O') {
          add++;
          result[i] = result[i] + add;
        }
        else if(OX_case[i].charAt(j) == 'X') {
          add=0;
        }
      }
    }
    
    for(int i=0; i<test_case; i++)
      System.out.println(result[i]);
  }
}