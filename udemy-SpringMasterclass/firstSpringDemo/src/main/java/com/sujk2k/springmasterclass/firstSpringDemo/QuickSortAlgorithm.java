package com.sujk2k.springmasterclass.firstSpringDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers){
        // Quick sort algorithm logic

        return numbers;
    }
}
