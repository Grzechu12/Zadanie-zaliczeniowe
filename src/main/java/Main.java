//napisz program który zlicza sumę elementów macierzy, program powinien wczytać macierz liczb całkowitych wprowadzoną przez użytkownika.
public class Main {
  public static void main(final String[] args) {
final int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int sum=0;
    for (int i=0; i<matrix.length; i++)
    {
      for (int j=0; j<matrix[i].length; j++){
        sum+=matrix[i][j];
      }
System.out.print(sum);

    }


  }


}