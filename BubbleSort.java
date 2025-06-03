public class BubbleSort {

    public static void main(String[] args) {
        int[] MyArray = { 12, 65, 34, 78, 23, 98 };
        
        for (int i = 0; i <= MyArray.length - 1; i++) {
            for (int j = 0; j < MyArray.length - i - 1; j++) {
                if (MyArray[j] > MyArray[j + 1]) {
                    int swap = MyArray[j];
                    MyArray[j] = MyArray[j + 1];
                    MyArray[j + 1] = swap;
                }
            }
        }

        for (int num : MyArray) {
            System.out.print(num + " ");
        }
    }
}
