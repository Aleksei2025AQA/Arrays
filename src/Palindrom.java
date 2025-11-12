public class Palindrom {

    public static boolean palindrom(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, -2, -7, 4, 2, 2, 5};
        int[] arr2 = {1, -2, -7, 4, -7, -2, 1};

        System.out.println("Пример 1:");
        System.out.println("arr = [1, -2, -7, 4, 2, 2, 5]");
        System.out.println("Результат: " + palindrom(arr1));

        System.out.println("\nПример 2:");
        System.out.println("arr = [1, -2, -7, 4, -7, -2, 1]");
        System.out.println("Результат: " + palindrom(arr2));
    }
}
