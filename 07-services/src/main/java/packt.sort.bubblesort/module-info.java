module packt.sort.bubblesort {
    requires packt.sortutil;
    provides packt.sortutil.SortUtil with packt.sort.bubblesort.impl.BubbleSortUtilImpl;
}
