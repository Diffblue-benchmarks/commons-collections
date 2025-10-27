package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Iterator;
import org.apache.commons.collections4.ResettableIterator;
import org.junit.Test;

public class EmptyIteratorDiffblueTest {
  /**
   * Method under test: {@link EmptyIterator#emptyIterator()}
   */
  @Test
  public void testEmptyIterator() {
    // Arrange and Act
    Iterator<Object> actualEmptyIteratorResult = EmptyIterator.emptyIterator();

    // Assert
    assertTrue(actualEmptyIteratorResult instanceof EmptyIterator);
    assertFalse(actualEmptyIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link EmptyIterator#resettableEmptyIterator()}
   */
  @Test
  public void testResettableEmptyIterator() {
    // Arrange and Act
    ResettableIterator<Object> actualResettableEmptyIteratorResult = EmptyIterator.resettableEmptyIterator();

    // Assert
    assertTrue(actualResettableEmptyIteratorResult instanceof EmptyIterator);
    assertFalse(actualResettableEmptyIteratorResult.hasNext());
  }

  /**
   * Method under test: default or parameterless constructor of
   * {@link EmptyIterator}
   */
  @Test
  public void testNewEmptyIterator() {
    // Arrange and Act
    EmptyIterator<Object> actualEmptyIterator = new EmptyIterator<>();

    // Assert
    assertFalse(actualEmptyIterator.hasNext());
  }
}
