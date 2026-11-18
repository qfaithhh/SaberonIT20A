
package sortingalgorithms;

import java.util.Arrays;

public class SortingAlgorithms {

    //BUBBLE SORT
    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    //SELECTION SORT
    public static void selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }

    //INSERTION SORT
    public static void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;

            }

            arr[j + 1] = key;

        }
    }

    public static void main(String[] args) {

        int[] originalArray = {
            78, 13, 88, 2, 99, 56, 40, 1, 5, 70
        };

       
        int[] bubbleArray = originalArray.clone();
        int[] selectionArray = originalArray.clone();
        int[] insertionArray = originalArray.clone();

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(originalArray));

        // Bubble Sort
        bubbleSort(bubbleArray);
        System.out.println("\nBubble Sort:");
        System.out.println(Arrays.toString(bubbleArray));

        // Selection Sort
        selectionSort(selectionArray);
        System.out.println("\nSelection Sort:");
        System.out.println(Arrays.toString(selectionArray));

        // Insertion Sort
        insertionSort(insertionArray);
        System.out.println("\nInsertion Sort:");
        System.out.println(Arrays.toString(insertionArray));

    }
}

    
    

