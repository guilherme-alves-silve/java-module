package packt.sortutil;

import java.util.List;
import java.util.ServiceLoader;

public interface SortUtil { 

    public <T extends Comparable<T>> List<T> sortList(final List<T> list);

    public int getIdealMaxInputLength();

    public static Iterable<SortUtil> getAllProviders() {
        return ServiceLoader.load(SortUtil.class);
    }

    public static SortUtil getProviderInstance(final int listSize) {
        final var sortUtilList = getAllProviders();
        if (!sortUtilList.iterator().hasNext()) {
            throw new IllegalStateException("No implementation was provided to the interface SortUtil!");
        }

        SortUtil defaultSortUtil = null;
        for (final var sortUtil : sortUtilList) {
            defaultSortUtil = sortUtil;
            if (listSize <= sortUtil.getIdealMaxInputLength()) {
                break;
            }
        }

        return defaultSortUtil;
    }
}
