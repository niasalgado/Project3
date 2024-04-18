
/*******************************************************
 *  @Author : Ali Azhari   
 *  Created On : Wed Apr 01 2024
 *  @File : DefaultComparator.java
 * 
 *  Description: For convenience, we also allow a default 
 *  priority queue to instead rely on the natural ordering 
 *  for the given keys (assuming those keys come from a 
 *  comparable class). In that case, we build our own instance 
 *  of a DefaultComparator class,
 *******************************************************/

import java.util.Comparator;

@SuppressWarnings("unchecked")
public class DefaultComparator<E> implements Comparator<E> {

    public int compare(E a, E b) throws ClassCastException {
        return ((Comparable<E>) a).compareTo(b);

    }
}
