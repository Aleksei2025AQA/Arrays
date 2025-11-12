public class ReverseBack {

    public static int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversed = reverseBack(arr);

        System.out.println("Пример:");
        System.out.println("arr = [1, 2, 3, 4, 5]");
        System.out.print("Новый массив после reverseBack: [");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i]);
            if (i < reversed.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}