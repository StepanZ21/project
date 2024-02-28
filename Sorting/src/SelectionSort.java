public class SelectionSort {

    public static void main(String[] args) {
        int [] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            System.out.println(arrayToString(array));
            int minIndex = min(array, i, array.length);

            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }

        System.out.println(arrayToString(array));
        System.out.println("min value index: " + min(array, 0, array.length));
    }

    private static int min(int[] array, int start, int end) {
        int minIndex = start;
        int minValue = array[start];
        for (int i = start + 1; i < end; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}