package org.krisp.thematrixillustration.module;
import java.util.*;

public class Main {
    static int matrixSize =0;
    public static void main (String [] args){
        System.out.println("=========================================================================");
        System.out.println("~~~ Welcome to the KRISP Matrix Illustration Program ~~~");
        //get user input - the size of the matrix
        Scanner reader = new Scanner(System.in);
        boolean validInput = false;
        //validation for user input
        do{
            System.out.println("Please enter the size of the Matrix. (The size must be an odd number) >>> ");
            if(reader.hasNextInt()){
                matrixSize = reader.nextInt();
                if(matrixSize != 0 && matrixSize%2==1){
                    validInput = true;
                }//end if
            }//end if
            else{//non-int value entered by user
                System.out.println("You have entered incorrect input.");
                reader.nextLine();
            }//end else
        }//end do while
        while(validInput==false);

        reader.close();
        System.out.println();
        //

        //create the matrix/array - with size as matrixSize
        int[] [] matrix = new int[matrixSize][matrixSize];
        //

        //Set the values of / initialize the matrix/array
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j] = i+1;
            }//end for
        }//end for
        //

        MatrixPatternAlgorithm matrixPatternAlgorithm = new MatrixPatternAlgorithm(matrixSize);
        matrixPatternAlgorithm.setMatrixSize(matrixSize);
        matrixPatternAlgorithm.setMatrix(matrix);
        matrixPatternAlgorithm.displayFullMatrixPatternAlgorithm();
        matrixPatternAlgorithm.displayMatrixPatternAlgorithm_A();
        matrixPatternAlgorithm.displayMatrixPatternAlgorithm_B();
        matrixPatternAlgorithm.displayMatrixPatternAlgorithm_C();
        matrixPatternAlgorithm.displayMatrixPatternAlgorithm_D();
        matrixPatternAlgorithm.displayMatrixPatternAlgorithm_E(matrixSize);
        matrixPatternAlgorithm.displayMatrixPatternAlgorithm_F();
        matrixPatternAlgorithm.displayMatrixPatternAlgorithm_G(matrixSize);
        matrixPatternAlgorithm.displayMatrixPatternAlgorithm_H(matrixSize);
        matrixPatternAlgorithm.displayMatrixPatternAlgorithm_I(matrixSize);

        System.out.println("\n~~~ End of the KRISP Matrix Illustration Program ~~~");
        System.out.println("=========================================================================");

    }//end main()
}//end Main()

