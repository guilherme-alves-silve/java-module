package packt.sortutil; 

import java.util.*;

public class SortUtil { 

    private final BubbleSortUtil sorter;

    public SortUtil() {
        this.sorter = new BubbleSortUtil();
    }

    public <T extends Comparable<T>> List<T> sortList(List<T> list) { 
        return sorter.sortList(list);
    }
}
