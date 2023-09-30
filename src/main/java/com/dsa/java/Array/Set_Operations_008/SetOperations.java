package com.dsa.java.Array.Set_Operations_008;

import java.util.Arrays;

public class SetOperations {
    int[] array1 = new int[]{3, 5, 10, 4, 6};
    int[] array2 = new int[]{12, 4, 7, 2, 5};

    int[] unionArray1;
    int[] unionArray2;

    int[] intersectionArray1;
    int[] intersectionArray2;

    int[] differenceArray1;
    int[] differenceArray2;

    void unionRandom() {
        unionArray1 = new int[array1.length + array2.length];

        for(int i=0; i<array1.length; i++) {
            unionArray1[i] = array1[i];
        }
        int filled = array1.length;

        for (int k : array2) {
            boolean present = false;
            for (int i : array1) {
                if (i == k) {
                    present = true;
                    break;
                }
            }
            if (!present) {
                unionArray1[filled] = k;
                filled++;
            }
        }
    }

    void unionSorted() {
        unionArray2 = new int[array1.length + array2.length];

        int i=0, j=0;
        int idx = 0;

        while (i!=array1.length && j!=array2.length) {
            if(array1[i] == array2[j]) {
                unionArray2[idx] = array1[i];
                i++;
                j++;
            }
            else if(array1[i] < array2[j]) {
                unionArray2[idx] = array1[i];
                i++;
            } else {
                unionArray2[idx] = array2[j];
                j++;
            }
            idx++;
        }

        while(i<array1.length) {
            unionArray2[idx] = array1[i];
            idx++; i++;
        }

        while(j<array2.length) {
            unionArray2[idx] = array2[j];
            idx++; j++;
        }
    }

    void intersectionUnsorted() {
        intersectionArray1 = new int[array1.length + array2.length];
        int idx = 0;
        for (int k : array1) {
            for (int i : array2) {
                if (k == i) {
                    intersectionArray1[idx] = k;
                    idx++;
                }
            }
        }
    }

    void intersectionSorted() {
        intersectionArray2 = new int[array1.length + array2.length];

        int i=0, j=0;
        int idx = 0;

        while (i!=array1.length && j!=array2.length) {
            if(array1[i] == array2[j]) {
                intersectionArray2[idx] = array1[i];
                i++;
                j++;
                idx++;
            }
            else if(array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }
    }

    void array1Differencearray2Unsorted() {
        differenceArray1 = new int[array1.length];
        int idx=0;
        for (int k : array1) {
            boolean present = false;
            for (int i : array2) {
                if (k == i) {
                    present = true;
                    break;
                }
            }
            if (!present) {
                differenceArray1[idx] = k;
                idx++;
            }
        }
    }

    void array1DifferenceArray2Sorted() {
        differenceArray2 = new int[array1.length];
        int i=0, j=0;
        int idx = 0;

        while (i!=array1.length && j!=array2.length) {
            if(array1[i] == array2[j]) {
                i++;
                j++;
            } else if (array2[j] < array1[i]) {
                j++;
            } else {
                differenceArray2[idx] = array1[i];
                idx++;
                i++;
            }
        }

        while(i<array1.length) {
            differenceArray2[idx] = array1[i];
            idx++;
            i++;
        }
    }

    public static void main(String[] args) {
        SetOperations setOperations = new SetOperations();

        System.out.println(Arrays.toString(setOperations.array1));
        System.out.println(Arrays.toString(setOperations.array2));
        setOperations.unionRandom();
        System.out.println(Arrays.toString(setOperations.unionArray1));
        setOperations.intersectionUnsorted();
        System.out.println(Arrays.toString(setOperations.intersectionArray1));
        setOperations.array1Differencearray2Unsorted();
        System.out.println(Arrays.toString(setOperations.differenceArray1));

        System.out.println("\n");

        Arrays.sort(setOperations.array1);
        Arrays.sort(setOperations.array2);
        System.out.println(Arrays.toString(setOperations.array1));
        System.out.println(Arrays.toString(setOperations.array2));
        setOperations.unionSorted();
        System.out.println(Arrays.toString(setOperations.unionArray2));
        setOperations.intersectionSorted();
        System.out.println(Arrays.toString(setOperations.intersectionArray2));
        setOperations.array1DifferenceArray2Sorted();
        System.out.println(Arrays.toString(setOperations.differenceArray2));
    }
}
