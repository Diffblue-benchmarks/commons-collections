package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.MapIterator;
import org.junit.Test;

public class EmptyMapIteratorDiffblueTest {
  /**
   * Method under test: {@link EmptyMapIterator#emptyMapIterator()}
   */
  @Test
  public void testEmptyMapIterator() {
    // Arrange and Act
    MapIterator<Object, Object> actualEmptyMapIteratorResult = EmptyMapIterator.emptyMapIterator();

    // Assert
    assertTrue(actualEmptyMapIteratorResult instanceof EmptyMapIterator);
    assertFalse(actualEmptyMapIteratorResult.hasNext());
  }

  /**
   * Method under test: default or parameterless constructor of
   * {@link EmptyMapIterator}
   */
  @Test
  public void testNewEmptyMapIterator() {
    // Arrange and Act
    EmptyMapIterator<Object, Object> actualEmptyMapIterator = new EmptyMapIterator<>();

    // Assert
    assertFalse(actualEmptyMapIterator.hasNext());
  }
}
