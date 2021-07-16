package com.metanit.zadaniya;
import com.metanit.zadaniya.CustomSorting.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import static org.junit.jupiter.api.Assertions.*;

public class CustomSortingTest2 {

    @Test
    void сортировкаНесколькихЗначений(){
        List<String> words = Arrays.asList("Яблоко","Апельсин","Apple","Orange");

        Comparator<String> comp = CustomSorting.customStringCmp();

        words.sort(comp);

        assertEquals(Arrays.asList("Апельсин","Яблоко","Apple","Orange"),words);
    }

    @Test
    void сортировкаСмешанныхЗначений(){
        List<String> words = Arrays.asList("Яd","Яблоко","Яroslavl","Ясли","Apple");

        Comparator<String> comp = CustomSorting.customStringCmp();

        words.sort(comp);

        assertEquals(Arrays.asList("Яd","Яroslavl","Яблоко","Ясли","Apple"),words);
    }
}
