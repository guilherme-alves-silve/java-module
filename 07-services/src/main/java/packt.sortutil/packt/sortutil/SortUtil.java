package packt.sortutil;

import java.util.List;

public interface SortUtil { 

    public <T extends Comparable<T>> List<T> sortList(final List<T> list);
}
