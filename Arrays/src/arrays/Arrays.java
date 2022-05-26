package arrays;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row,column;
        int matrix[][];
        System.out.println("Enter the number of rows and columns");
        row = input.nextInt();
        column =input.nextInt();
        matrix= new int[row][column];
        System.out.println("Enter " + matrix.length + " rows and " +
         matrix[0].length + " columns: ");
        for ( row = 0; row < matrix.length; row++) {
        for (column = 0; column < matrix[row].length; column++) {
         matrix[row][column] = input.nextInt();
         }
    }
        mult(matrix);
    }
 public static void mult(int[][]m){
 int total = 1;
        for (int[] m1 : m) {
            for (int column = 0; column < m1.length; column++) {
                total *= m1[column];
                System.out.println(total+"\t");
            }
        }
 
 }}
