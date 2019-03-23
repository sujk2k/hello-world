package com.sujk2k.springmasterclass.firstSpringDemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Primary annotation tells spring to give preference to this bean since more than one Sortalgorithm 
// implementation beans are present in this spring context
@Component

// If no @Primary tag, then spring will issue an error in case of multiple components registered for a type
// In that case, we can use auto-wiring by Name instead of auto-wiring by Type
//@Primary

// Other option is to use @Qualifier option for multiple componenets case
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers){
        // Quick sort algorithm logic

        return numbers;
    }
}