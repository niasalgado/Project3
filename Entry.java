/*******************************************************
 *  @Author : Ali Azhari   
 *  Created On : Wed Apr 01 2024
 *  @File : Entry.java
 *  Description: An abstract base class to 
 * assist implementations of the PriorityQueue interface
 *******************************************************/

/** Interface for a key-value pair. */
public interface Entry<K,V> { 
    K getKey( ); // returns the key stored in this entry
    V getValue( ); // returns the value stored in this entry
}