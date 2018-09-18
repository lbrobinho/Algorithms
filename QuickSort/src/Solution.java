import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int array[] = new int[] {2, 2, 2, 2, 6, 2, 5, 2, 3, 2};
        Solution solution = new Solution();

        solution.quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    private void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int left, int right) {
        if(left >= right) {
            return;
        }

        int pivot = array[left + (right - left) / 2];
        int index = partition(array, left, right, pivot);
        quickSort(array, left, index - 1);
        quickSort(array, index, right);
        System.out.println(Arrays.toString(array));
    }

    private int partition(int[] array, int left, int right, int pivot) {

        while (left < right) {
            while (array[left] < pivot) {
                left++;
            }

            while (array[right] > pivot) {
                right--;
            }

            if(left <= right) {
                swap(array, left++, right--);
            }
        }
        return left;
    }
    private  void swap(int[] array, int left, int right) {
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }
}
