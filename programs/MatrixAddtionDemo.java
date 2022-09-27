public class MatrixAddtionDemo{
public static void main(String args[]){
//two matrices are created here
int a[][]={{1,1,1},{2,2,2}};
int b[][]={{1,1,1},{2,2,2}};
//another matrix is created here for storing the multiplication of the two above matrices
int c[][]=new int[2][2]; //3 columns and 3 rows
//multiplication and printing of 2 matrices
for(int i=0;i<2;i++){
for(int j=0;j<2;j++){
c[i][j]+=a[i][j]+b[i][j];// 
}// loop ends
System.out.print(c[i][j]+" "); //print the matrix element
}//j loop ends
System.out.println();//new line
}
}