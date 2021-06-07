package packt.sort.javasort.impl; 

import java.util.*;
import packt.sortutil.SortUtil;

public class JavaSortUtilImpl implements SortUtil { 

    public <T extends Comparable<T>> List<T> sortList(final List<T> list) { 
        Collections.sort(list); 
        return list; 
    }

    public int getIdealMaxInputLength() { 
        return Integer.MAX_VALUE; 
    }
}
