package ru.panizaandrey.dz1;

import java.util.ArrayList;
import java.util.Arrays;

class Task1 {

    static <T> void swapObj(T[] array, int firstIndex, int secondIndex) {
        T oneVal = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = oneVal;
    }

    static <T> ArrayList<T> convertToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}