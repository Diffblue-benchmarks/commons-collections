package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ListIterator;
import org.apache.commons.collections4.ResettableListIterator;
import org.junit.Test;

public class EmptyListIteratorDiffblueTest {
  /**
   * Method under test: {@link EmptyListIterator#emptyListIterator()}
   */
  @Test
  public void testEmptyListIterator() {
    // Arrange and Act
    ListIterator<Object> actualEmptyListIteratorResult = EmptyListIterator.emptyListIterator();

    // Assert
    assertTrue(actualEmptyListIteratorResult instanceof EmptyListIterator);
    assertFalse(actualEmptyListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link EmptyListIterator#resettableEmptyListIterator()}
   */
  @Test
  public void testResettableEmptyListIterator() {
    // Arrange and Act
    ResettableListIterator<Object> actualResettableEmptyListIteratorResult = EmptyListIterator
        .resettableEmptyListIterator();

    // Assert
    assertTrue(actualResettableEmptyListIteratorResult instanceof EmptyListIterator);
    assertFalse(actualResettableEmptyListIteratorResult.hasNext());
  }

  /**
   * Method under test: default or parameterless constructor of
   * {@link EmptyListIterator}
   */
  @Test
  public void testNewEmptyListIterator() {
    // Arrange and Act
    EmptyListIterator<Object> actualEmptyListIterator = new EmptyListIterator<>();

    // Assert
    assertFalse(actualEmptyListIterator.hasNext());
  }
}
