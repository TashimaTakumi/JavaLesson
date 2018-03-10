import java.util.Scanner;
import java.util.Random;

class lesson1{
  public static void main(String[] args){
    // int x;
    // System.out.println(x);
    Random rand = new Random();
    //
    Scanner stdIn = new Scanner(System.in);
    // Scanner stdIn=new Scanner("0\n");
    // System.out.print("xの値:");
    // int x = stdIn.nextInt();
    int x=0;
    boolean flg=true;
      Outer:
      for(;flg==true;){
        System.out.println("this is Outer program");

        Innear:
        for(;flg==true;){
          System.out.println("this is Innear program");
          System.out.print("xの値:");
          x=stdIn.nextInt();
          if(x==0){
            break Innear;
          }else if(x==1){
            break Outer;
          }else if(x==2){
            continue Innear;
          }else if(x==3){
            continue Outer;
          }else{
            flg=false;
          }
        }
      }

    System.out.println("\nTest Mode Start!");

    A:{
      System.out.println("Program A was Started");
      if(x==4) break A;
      System.out.println("Program A was Stopped");
    }


    double y=rand.nextDouble();

    int yy=(int)y;

    System.out.println("x="+x);
    System.out.println("rand="+yy);
  }
}
