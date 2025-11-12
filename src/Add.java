public class Add {

    public static int[] add(int[] arr, int x, int pos) {
        int[] result = new int[arr.length + 1];

        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }

        result[pos] = x;

        for (int i = pos; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 9;
        int pos = 3;

        System.out.println("Пример:");
        System.out.println("arr=[1,2,3,4,5]");
        System.out.println("x=9");
        System.out.println("pos=3");
        System.out.print("результат: [");
        int[] result = add(arr, x, pos);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}