package algorithms.sorts.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i; //min index starts at index 0
            for (int j = i + 1; j < array.length; j++) { // j is one index higher than minIndex
                if (array[j] < array[minIndex]) { // if j < minIndex, minIndex pointer reassigned to point as same value as j
                    minIndex = j;
                    // then the for loop repeats so j= i + 1 is incremented by 1, which moves it up an index such that it
                    // is now ahead of minIndex again and will continue reassigning/checking to reassign minIndex until
                    // the nested loop is done and minIndex points to the index with the lowest value
                }
            }
            if (i != minIndex) { // if 'i' is not = to minIndex, it means we've reassigned it to equal j, meaning a swap is needed\
                // if not, value is already in the correct place and no changes needed
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
                // values swapped
            }
            // back up to eencompassing for loop and second loop will start at index 1, since the lowest value is in the
            // lowest index and no longer needs to be checked. inner loop runs again, then outer such that the inner loop
            // will run once for every item in the array -1 since last item won't be compared to anything and it already sorted
        }
    }
}