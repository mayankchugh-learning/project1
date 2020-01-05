package dyna.prog;

class PractTestOne
{
    public static void main(String args[])
    {

        int matrix[][];
        matrix = new int[4][4];

        int i,j;

        /* Updating first column */
        for (i = 0; i < matrix.length; i++) {
            matrix[i][0] = i;
        }

        /* Updating first row */
        for (j=0; j< matrix[0].length; j++) {
            matrix[0][j] = j;
        }

      	/* Write your loop here to update the above matrix such that
      	each cell is max of its neighbouring cell.
      	Store your results in the matrix itself*/

        for (i = 0; i < matrix.length; i++){
            for (j = 0; j < matrix.length; j++){
                if(matrix[i][j]  < i ){
                    if(j  < i ){
                        matrix[i][j]  = i;
                    }else{
                        matrix[i][j]  = j;
                    }
                }
            }
        }

        /* Printing 2D matrix. Don't change the code below*/
        for (i = 0; i < matrix.length; i++){
            for (j = 0; j < matrix[0].length; j++)
                System.out.print(matrix[i][j]);
            System.out.print('\n');
        }
    }
}
