public class Concat {

    public static int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {7, 8, 9};

        System.out.println("Пример:");
        System.out.println("arr1 = [1, 2, 3]");
        System.out.print("arr2 = [7, 8, 9]");

        System.out.println(" ");

        int[] result = concat(arr1, arr2);

        System.out.print("Результат concat: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
