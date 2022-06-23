public class MutliArray {
    public static void main(String[] args) {
        

        // declare 2d array
        // int[][] myarr = new int[3][4];

                            //rows = 3; cols = 4;


        // double[][] matrix = {
        //                     {1.2, 4.3, 4.0},
        //                     {4.1, -1.1}
        //                     };

        // System.out.println(matrix[1][1]);
        // System.out.println(matrix[0][0]);

        
        int[][] a = {
            {1, 2, 3}, 
            {4, 5, 6, 9}, 
            {7}, 
        
        };

        // get the length of each row of a 2d array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].length);
        }
        
    }
}
