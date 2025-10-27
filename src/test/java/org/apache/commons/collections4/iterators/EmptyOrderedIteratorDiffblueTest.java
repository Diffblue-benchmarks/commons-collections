package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.OrderedIterator;
import org.junit.Test;

public class EmptyOrderedIteratorDiffblueTest {
  /**
   * Method under test: {@link EmptyOrderedIterator#emptyOrderedIterator()}
   */
  @Test
  public void testEmptyOrderedIterator() {
    // Arrange and Act
    OrderedIterator<Object> actualEmptyOrderedIteratorResult = EmptyOrderedIterator.emptyOrderedIterator();

    // Assert
    assertTrue(actualEmptyOrderedIteratorResult instanceof EmptyOrderedIterator);
    assertFalse(actualEmptyOrderedIteratorResult.hasNext());
  }

  /**
   * Method under test: default or parameterless constructor of
   * {@link EmptyOrderedIterator}
   */
  @Test
  public void testNewEmptyOrderedIterator() {
    // Arrange and Act
    EmptyOrderedIterator<Object> actualEmptyOrderedIterator = new EmptyOrderedIterator<>();

    // Assert
    assertFalse(actualEmptyOrderedIterator.hasNext());
  }
}
