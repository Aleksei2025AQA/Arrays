public class FindLast {

    public static int findLast(int[] arr, int x) {

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 2, 5};
        int x = 2;

        System.out.println("Пример:");
        System.out.println("arr = [1, 2, 3, 4, 2, 2, 5]");
        System.out.println("x = " + x);
        System.out.println("Результат: " + findLast(arr, x));
    }
}
