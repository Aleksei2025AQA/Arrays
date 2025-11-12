public class AddArray {

    public static int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];

        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }

        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }

        for (int i = pos; i < arr.length; i++) {
            result[ins.length + i] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ins = {7, 8, 9};
        int pos = 3;

        System.out.println("Пример:");
        System.out.println("arr=[1,2,3,4,5]");
        System.out.println("ins=[7,8,9]");
        System.out.println("pos=3");
        System.out.print("результат: [");
        int[] result = add(arr, ins, pos);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
