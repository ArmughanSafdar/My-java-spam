public class Arrays{

    public static void main(String[] args) {
        
        // int[] arr = new int [10];

        // arr[0] = 10;
        // arr[1] = 20;

        // System.out.println(arr.length);

        // System.out.printf("Index 0 and index 1 respectives are: %d,%d", arr[0],arr[1]);


        int[] age = {10,20,30,40};
        
        // for (int i = 0; i < age.length ; i++) {
        //     System.out.println(age[i]);
        // }

        for (int i : age) {
            System.out.println(i);
        }
    }
}