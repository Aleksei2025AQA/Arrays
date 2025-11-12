public class DeleteNegative {

    public static int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, -2, 2, -5};

        System.out.println("Пример:");
        System.out.println("arr=[1,2,-3,4,-2,2,-5]");
        System.out.print("результат: [");
        int[] result = deleteNegative(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
