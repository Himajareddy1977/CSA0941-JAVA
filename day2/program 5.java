import java.util.Arrays;

class ArrayRemoval {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int indexToRemove = 2;

        for (int i = indexToRemove; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr = Arrays.copyOf(arr, arr.length - 1);

        System.out.println("Array after removal: " + Arrays.toString(arr));
    }
}