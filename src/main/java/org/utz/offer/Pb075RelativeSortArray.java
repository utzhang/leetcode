package org.utz.offer;

import java.util.Arrays;

public class Pb075RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];

        for (int k : arr1) {
            count[k]++;
        }

        int pos = 0;
        for (int j : arr2) {
            while (count[j] > 0) {
                arr1[pos++] = j;
                count[j]--;
            }
        }

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr1[pos++] = i;
                count[i]--;
            }
        }
        return arr1;
    }

}
