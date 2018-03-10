import java.util.Scanner;
class lesson2{
  public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);
    System.out.print("A:");
    int A= scanner.nextInt();
    System.out.print("B:");
    int B= scanner.nextInt();
    System.out.print("N:");
    int N= scanner.nextInt();

    System.out.println("ans"+solver(A,B,N)%100007);
  }

  static int solver(int A, int B, int N){
    if(N==0){
      return A;
    }else if(N==1){
      return B;
    }else if(N==2){
      return A+B;
    }else{
      return solver(A,B,N-1)+solver(A,B,N-2);
    }
  }
}
