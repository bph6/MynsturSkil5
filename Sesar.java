/*
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z

Dæmi um inntak: 
java Sesar "W" "A" "T" "C" "H" "Y" "O" "U" "R" "S" "T" "E" "P"

Úttak;
[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z] 
A: [21, 9, 23, 11, 25, 13, 1, 15, 3, 17, 5, 19, 7] 
B: [1, -6, -13, -20, -1, -8, -15, -22, -3, -10, -17, -24, -5] 
> 
*/
import java.util.Arrays;
public class Sesar {
  public static void main(String[] args) {
    int n = args.length;
    String[] inputLETTERS = new String[n];
    for (int m = 0; m<n ; m++){
      inputLETTERS[m] = (args[m]);
    }

    String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    System.out.println(Arrays.toString(alphabet));
    
    int[] inputNUM= new int[n];
    int[] outputA = new int[n];
    int[] outputB = new int[n];
    //int[] outputC = new int[n];...

    for (int k = 0; k<n ; k++) {
      for (int l = 0; l<alphabet.length; l++)
        if (k == l){
        inputNUM[k] = l;
      }
    }

    for (int i = 0; i<n ; i++) {
      outputA[i] = ((14*inputNUM[i])+21)%alphabet.length;
    }
    System.out.println("A: "+Arrays.toString(outputA));

    for (int j = 0; j<n ; j++) {
      outputB[j] = ((-7*inputNUM[j])+1)%alphabet.length;
    }
    System.out.println("B: "+Arrays.toString(outputB));

  }
}
