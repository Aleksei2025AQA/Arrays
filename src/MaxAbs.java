public class MaxAbs {

    public static int maxAbs(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(max)) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, -7, 4, 2, 2, 5};

        System.out.println("Пример:");
        System.out.println("arr = [1, -2, -7, 4, 2, 2, 5]");
        System.out.println("Результат: " + maxAbs(arr));
    }
}
