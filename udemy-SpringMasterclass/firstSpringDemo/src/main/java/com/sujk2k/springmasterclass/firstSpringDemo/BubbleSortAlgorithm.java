package com.sujk2k.springmasterclass.firstSpringDemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// By below annotation, we tell spring framework that below is bean we want spring to manage
@Component

// Other option is to use @Qualifier option for multiple componenets case
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers){
        // Bubble sort logic

        return numbers;
    }
}