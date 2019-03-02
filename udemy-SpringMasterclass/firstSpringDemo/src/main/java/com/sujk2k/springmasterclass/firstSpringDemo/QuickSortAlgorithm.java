package com.sujk2k.springmasterclass.firstSpringDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Primary annotation tells spring to give preference to this bean since more than one Sortalgorithm 
// implementation beans are present in this spring context
@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers){
        // Quick sort algorithm logic

        return numbers;
    }
}