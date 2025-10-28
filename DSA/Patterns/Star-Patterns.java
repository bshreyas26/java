// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public class Main {
  public static void main(String[] args) {
      int N = 3;

      //--------------------------------------------//
      /*
      Pattern - 1
       ***
       ***
       ***
       */
      System.out.println("Pattern - 1");
      for(int i=1;i<=N;i++){
        for(int j=1;j<=N;j++){
          System.out.print("*");
        }
        System.out.println();
      }
      //--------------------------------------------//

      /*
      Pattern - 2
      *
      **
      ***
      */
      System.out.println("Pattern - 2");
      for(int i=1;i<=N;i++){
        for(int j=1;j<=i;j++){
          System.out.print("*");
        }
        System.out.println();
      }

      //----------------------------------------//
      /*
      Pattern - 3
      ***
      **
      *
      */
      System.out.println("Pattern - 3");
      for(int i=1;i<=N;i++){
        for(int j=1;j<=N-i+1;j++){
          System.out.print("*");
        }
        System.out.println();
      }

      //----------------------------------------//
      /*
      Pattern - 4
        *
       **
      ***  
      */
      System.out.println("Pattern - 4");
      for(int i=1;i<=N;i++){
        for(int j=1;j<=N-i;j++){
          System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
          System.out.print("*");
        }
        System.out.println();
      }

      //----------------------------------------//
      /*
      Pattern - 5
      ***
       **
        *
      */
      System.out.println("Pattern - 5");
      for(int i =1;i<=N;i++){

        for(int k=1;k<i;k++){
          System.out.print(" ");
        }

        for(int j=1;j<=N-i+1;j++){
          System.out.print("*");
        }
        System.out.println();
      }

      //----------------------------------------//
      /*
      Pattern - 6
        *
       ***
      ***** 
      */

      System.out.println("Pattern - 6");
      for(int i=1;i<=N;i++){
        for(int j=1;j<=N-i;j++){
          System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
          System.out.print("*");
        }

        for(int z=1;z<i;z++){
          System.out.print("*");
        }
        System.out.println();
      }

      //----------------------------------------//
      /*
      *****
       ***
        *
      */
      System.out.println("Pattern - 7");
      for(int i =1;i<=N;i++){

        for(int k=1;k<i;k++){
          System.out.print(" ");
        }

        for(int j=1;j<=N-i+1;j++){
          System.out.print("*");
        }

        for(int B=i;B<N;B++){
          System.out.print("*");
        }
        System.out.println();
      }

      //--------------------------------------//
      /*
      Pattern - 8
        *
       ***   
      *****
       ***
        *
      */
      System.out.println("Pattern - 8");
      for(int i=1;i<=N;i++){
        for(int j=1;j<=N-i;j++){
          System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
          System.out.print("*");
        }

        for(int z=1;z<i;z++){
          System.out.print("*");
        }
        System.out.println();
      }

      for(int i =1;i<N;i++){
        
        for(int k=1;k<=i;k++){
          System.out.print(" ");
        }

        for(int j=i;j<=N-i+1;j++){
          System.out.print("*");
        }

         for(int k=1;k<=i;k++){
          System.out.print(" ");
        }
        System.out.println();
      }
  }
}