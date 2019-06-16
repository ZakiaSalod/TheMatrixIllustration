package org.krisp.thematrixillustration.module;
public class MatrixPatternAlgorithm {
    private int matrixSize;
    private int halfOfmatrixSize = matrixSize/2;
    int[] [] matrix = new int[matrixSize][matrixSize];

    public MatrixPatternAlgorithm(int matrixSize){
        this.matrixSize = matrixSize;
    }//end MatrixPatternAlgorithm()

    public void setMatrixSize(int matrixSize){
        this.matrixSize = matrixSize;
    }//end setMatrixSize()

    public int getMatrixSize(){
        return matrixSize;
    }//end getMatrixSize()

    public void setHalfOfMatrixSize(int matrixSize){
        this.matrixSize = matrixSize/2;
    }//end setHalfOfMatrixSize()

    public int getHalfOfMatrixSize(){
        return halfOfmatrixSize;
    }//end getHalfOfMatrixSize()

    public void setMatrix(int [][]matrix){
        this.matrix = matrix;
    }//end setMatrix()

    public int[][] getMatrix(){
        return matrix;
    }//end getMatrix()

    public void displayFullMatrixPatternAlgorithm(){
        //print the matrix/array - original - matrixSize array
        System.out.println("Matrix illustration " + matrixSize + "x" + matrixSize + ".");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }//end for
            System.out.println();
        }//end for
        System.out.println();
        //
    }//end displayFullMatrixPatternAlgorithm()

    public void displayMatrixPatternAlgorithm_A(){
        //print the matrix/array - a)
        System.out.println("a)");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(i==j) {
                    System.out.print(matrix[i][j] + " ");
                }//end if
                else{
                    System.out.print(" ");
                }//end else
            }//end for
            System.out.println();
        }//end for
        System.out.println();
        //
    }//end displayMatrixPatternAlgorithm_A()

    public void displayMatrixPatternAlgorithm_B(){
        //print the matrix/array - b)
        System.out.println("b)");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(j<=i) {
                    System.out.print(matrix[i][j] + " ");
                }//end if
                else{
                    System.out.print(" ");
                }//end else
            }//end for
            System.out.println();
        }//end for
        System.out.println();
        //
    }//end displayMatrixPatternAlgorithm_B()

    public void displayMatrixPatternAlgorithm_C(){
        //print the matrix/array - c)
        System.out.println("c)");
        int index = (matrixSize - 2);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(j<=index) {
                    System.out.print(" ");
                }//end if
                else{
                    System.out.print(matrix[i][j] + " ");
                }//end else
            }//end for
            System.out.println();
            index--; //decrement the index
        }//end for
        System.out.println();
        //
    }//end displayMatrixPatternAlgorithm_C()

    public void displayMatrixPatternAlgorithm_D(){
        //print the matrix/array - d)
        System.out.println("d)");
        for(int i=0; i<=halfOfmatrixSize; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(i<=halfOfmatrixSize && j<=i){
                    System.out.print(matrix[i][j] + " ");
                }//end if
            }//end for
            System.out.println(" ");
        }//end for

        for(int i=(halfOfmatrixSize+1); i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(i<=((matrixSize-j)-1) && j<=i){
                    System.out.print(matrix[i][j] + " ");
                }
            }//end for
            System.out.println();
        }//end for
        System.out.println();
        //
    }//end displayMatrixPatternAlgorithm_D()

    public void displayMatrixPatternAlgorithm_E(int matrixSize){
        this.matrixSize = matrixSize;
        this.halfOfmatrixSize = matrixSize/2;
        //print the matrix/array - e)
        System.out.println("e)");
        int index2 = (matrixSize - 2);
        for(int i=0; i<=halfOfmatrixSize; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(j<=index2) {
                    System.out.print(" ");
                }//end if
                else{
                    System.out.print(matrix[i][j] + " ");
                }//end else
            }//end for
            System.out.println();
            index2--; //decrement the index
        }//end for
        //

        for(int i=(halfOfmatrixSize+1); i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(j>=i){
                    System.out.print(matrix[i][j] + " ");
                }//end if
                else{
                    System.out.print(" ");
                }//end else
            }//end for
            System.out.println();
        }//end for
        System.out.println();
        //
    }//end displayMatrixPatternAlgorithm_E()

    public void displayMatrixPatternAlgorithm_F(){
        //print the matrix/array - f)
        System.out.println("f)");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if((i==0 || i%2==0) && j%2==0) {
                    System.out.print(matrix[i][j] + " ");
                }//end if
                else if ((i%2==1) && j%2==1){
                    System.out.print(matrix[i][j] + " ");
                }//end else if
                else{
                    System.out.print(" ");
                }//end else
            }//end for
            System.out.println();
        }//end for
        System.out.println();
        //
    }//end displayMatrixPatternAlgorithm_F()

    public void displayMatrixPatternAlgorithm_G(int matrixSize){
        this.matrixSize = matrixSize;
        this.halfOfmatrixSize = matrixSize/2;
        //print the matrix/array - g)
        System.out.println("g)");
        int startPosLeft = 0;
        int startPosRight = matrixSize-1;
        int counter = matrixSize;
        for(int i=0; i<=halfOfmatrixSize; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(j<=startPosLeft){
                    System.out.print(matrix[i][j] + " ");
                }//end if
                else if(j>=startPosRight){
                    System.out.print(counter + " ");
                }//end else if
                else{
                    System.out.print(" ");
                }//end else
            }//end for
            System.out.println(" ");
            startPosLeft++;
            startPosRight--;
            counter--;
        }//end for
        startPosLeft-=2;
        startPosRight+=2;
        counter=halfOfmatrixSize;

        for(int i=(halfOfmatrixSize+1); i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(j<=startPosLeft){
                    System.out.print(matrix[i][j] + " ");
                }//end if
                else if(j>=startPosRight){
                    System.out.print(counter + " ");
                }//end else if
                else{
                    System.out.print(" ");
                }//end else
            }//end for
            System.out.println(" ");
            startPosLeft--;
            startPosRight++;
            counter--;
        }//end for
        System.out.println();
        //
    }//end displayMatrixPatternAlgorithm_G()

    public void displayMatrixPatternAlgorithm_H(int matrixSize){
        this.matrixSize = matrixSize;
        this.halfOfmatrixSize = matrixSize/2;
        //print the matrix/array - h)
        System.out.println("h)");
        int columnStart = 0;
        int columnEnd = matrixSize-1;
        for(int i=0; i<=halfOfmatrixSize; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(j>=columnStart && j<=columnEnd ){
                    System.out.print(matrix[i][j] + " ");
                }//end if
                else{
                    System.out.print(" ");
                }//end else
            }//end for
            System.out.println(" ");
            columnStart++;
            columnEnd--;
        }//end for

        //reset variables for next for loop
        columnStart-=2;
        columnEnd+=2;

        for(int i=(halfOfmatrixSize+1); i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(j>=columnStart && j<=columnEnd ){
                    System.out.print(matrix[i][j] + " ");
                }//end if
                else{
                    System.out.print(" ");
                }//end else
            }//end for
            System.out.println(" ");
            columnStart--;
            columnEnd++;
        }//end for
        System.out.println();
        //
    }//end displayMatrixPatternAlgorithm_H()

    public void displayMatrixPatternAlgorithm_I(int matrixSize){
        this.matrixSize = matrixSize;
        this.halfOfmatrixSize = matrixSize/2;
        //print the matrix/array - i)
        System.out.println("i)");
        int columnStart2 = halfOfmatrixSize;
        int columnEnd2 = halfOfmatrixSize;
        for(int i=0; i<=halfOfmatrixSize; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(j>=columnStart2 && j<=columnEnd2 ){
                    System.out.print(matrix[i][j] + " ");
                }//end if
                else{
                    System.out.print(" ");
                }//end else
            }//end for
            System.out.println(" ");
            columnStart2--;
            columnEnd2++;
        }//end for

        columnStart2+=2;
        columnEnd2-=2;

        for(int i=(halfOfmatrixSize+1); i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(j>=columnStart2 && j<=columnEnd2 ){
                    System.out.print(matrix[i][j] + " ");
                }//end if
                else{
                    System.out.print(" ");
                }//end else
            }//end for
            System.out.println(" ");
            columnStart2++;
            columnEnd2--;
        }//end for
    }//end displayMatrixPatternAlgorithm_I()
}//end MatrixPatternAlgorithm()
