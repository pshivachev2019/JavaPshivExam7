public class Main {

    public static void main(String[] args) {
        int [][] matrix = { {0,-1,-5,1}, {1,0,-3,2}, {0,1,-7,3}, {-5,0,-8,4} };
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        int [] result = new int [matrix.length];

        for (int i=0; i<matrix.length; i++) {
            int MAX = matrix[i][0];
            for (int j=1; j<matrix[i].length; j++) {
                if (MAX < matrix[i][j]) {
                    MAX = matrix[i][j];
                }
            }
            result[i] = MAX;
        }
        System.out.println();
        for (int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
