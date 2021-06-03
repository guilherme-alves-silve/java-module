module packt.sort.javasort {
    requires packt.sortutil;
    provides packt.sortutil.SortUtil with packt.sort.javasort.impl.JavaSortUtilImpl;
}
