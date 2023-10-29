public class CloudvandanaSuffleArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        shuffleArray(arr);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static void shuffleArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int randomIndex = i + (int) (Math.random() * (n - i));
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
    }
}
