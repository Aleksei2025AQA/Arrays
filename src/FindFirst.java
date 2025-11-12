public class FindFirst {

    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
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
        System.out.println("Результат: " + findFirst(arr, x));

        int[] test2 = {1, 2, 3, 4, 5};
        System.out.println("findFirst([1,2,3,4,5], 10) = " + findFirst(test2, 10));

        int[] test3 = {};
        System.out.println("findFirst([], 5) = " + findFirst(test3, 5));
    }
}