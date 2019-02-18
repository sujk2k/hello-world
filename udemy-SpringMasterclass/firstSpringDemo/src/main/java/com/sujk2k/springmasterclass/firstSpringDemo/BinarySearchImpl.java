package com.sujk2k.springmasterclass.firstSpringDemo;

public class BinarySearchImpl {

    SortAlgorithm sortAlgorithm;

    public BinarySearchImpl (SortAlgorithm sortAlgorithm){
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int bimarySearch(int[] arrayToSort, int numberToSearch){
        // Sort array
        int[] sortedNumbers = sortAlgorithm.sort(arrayToSort);
        System.out.println(sortAlgorithm);

        // Search array

        // Return result
        return 3;
    }
}
