
package repaso;
import java.util.*;

public class Repaso {

    public static void main(String[] args) {
      //Random entrada=new Random();
      //int a, b, c;+
      /* a=entrada.nextInt(10);
       b=entrada.nextInt(10);
       c=entrada.nextInt(10);
        System.out.println("Los num aleatorios son:" + a +" , " + b + " , " + c);*/
        Scanner entrada= new Scanner(System.in);
       
        int a=10;
        int b=10;
       System.out.println("Introduce la posicion" );
        a=entrada.nextInt();
       System.out.println("Introduce la posicion");
        b=entrada.nextInt();
        int[][] arr = new int[a][b];
        //Random r = new Random();
        for(int i = 0; i < a-1; i++){
            //int row = 0;
            //int col = 0;
            for(int j = 0; j < b-1; j++){
                arr[i][j] = entrada.nextInt(10);
                arr[j][i] = entrada.nextInt(10);
                
                //System.out.print(arr[i][j] + "\t");
            }
           // System.out.println();
        }
    /*row += arr[i][j];
                col += arr[j][i];
            }
            arr[i][b - 1] = row;
            arr[b - 1][i] = col;
        }
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){*/
    
    }
}


