package com.sujk2k.springmasterclass.firstSpringDemo;

import org.springframework.stereotype.Component;

// By below annotation, we tell spring framework that below is bean we want spring to manage
@Component
public class BubbleSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers){
        // Bubble sort logic

        return numbers;
    }
}