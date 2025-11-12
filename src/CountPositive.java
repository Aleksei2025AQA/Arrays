public class CountPositive {

    public static int countPositive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, -7, 4, 2, 2, 5};

        System.out.println("Пример:");
        System.out.println("arr = [1, -2, -7, 4, 2, 2, 5]");
        System.out.println("Результат: " + countPositive(arr));
    }
}
