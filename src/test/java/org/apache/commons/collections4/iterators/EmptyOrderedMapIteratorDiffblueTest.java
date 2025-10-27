package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.OrderedMapIterator;
import org.junit.Test;

public class EmptyOrderedMapIteratorDiffblueTest {
  /**
   * Method under test: {@link EmptyOrderedMapIterator#emptyOrderedMapIterator()}
   */
  @Test
  public void testEmptyOrderedMapIterator() {
    // Arrange and Act
    OrderedMapIterator<Object, Object> actualEmptyOrderedMapIteratorResult = EmptyOrderedMapIterator
        .emptyOrderedMapIterator();

    // Assert
    assertTrue(actualEmptyOrderedMapIteratorResult instanceof EmptyOrderedMapIterator);
    assertFalse(actualEmptyOrderedMapIteratorResult.hasNext());
  }

  /**
   * Method under test: default or parameterless constructor of
   * {@link EmptyOrderedMapIterator}
   */
  @Test
  public void testNewEmptyOrderedMapIterator() {
    // Arrange and Act
    EmptyOrderedMapIterator<Object, Object> actualEmptyOrderedMapIterator = new EmptyOrderedMapIterator<>();

    // Assert
    assertFalse(actualEmptyOrderedMapIterator.hasNext());
  }
}
