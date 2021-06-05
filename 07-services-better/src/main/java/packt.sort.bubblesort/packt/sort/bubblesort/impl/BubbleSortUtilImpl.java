package packt.sort.bubblesort.impl; 

import java.util.*;
import packt.sortutil.SortUtil;

public class BubbleSortUtilImpl implements SortUtil { 

    public <T extends Comparable<T>> List<T> sortList(final List<T> list) { 
        for (int outer = 0; outer < list.size() - 1; outer++) {         
            for (int inner = 0; inner < list.size() - outer - 1; inner++) {
                if (list.get(inner).compareTo(list.get(inner + 1)) > 0) {  
                    swap(list, inner); 
                } 
            } 
        }

        return list; 
    } 

    public int getIdealMaxInputLength() {
        return 4;
    }
    
    private <T> void swap(List<T> list, int inner) { 
        T temp = list.get(inner); 
        list.set(inner, list.get(inner + 1)); 
        list.set(inner + 1, temp); 
    } 
}
