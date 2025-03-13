public class Main {
    public static void main (String[] args) {

        int[] arr1 = {1,2,3,4,5,6};


        int[] arr = filterEvenIndex0ddValue(arr1);

    }

    public static int[] filterEvenIndex0ddValue(int[] array){
        for (int i = 0; i < array.length; i++){
            if (i % 2 == 0){
                if (array[i] % 2 != 0){
                    System.out.println(array[i]);
                    System.out.println(" ");
                }
            }
        }
        return array;
    }

}
