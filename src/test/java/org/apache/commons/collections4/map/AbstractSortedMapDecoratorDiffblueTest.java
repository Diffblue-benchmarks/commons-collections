package org.apache.commons.collections4.map;

import static org.junit.Assert.assertFalse;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

public class AbstractSortedMapDecoratorDiffblueTest {
  /**
   * Method under test:
   * {@link AbstractSortedMapDecorator.SortedMapIterator#hasPrevious()}
   */
  @Test
  public void testSortedMapIteratorHasPrevious() {
    // Arrange
    AbstractSortedMapDecorator.SortedMapIterator<Object, Object> sortedMapIterator = new AbstractSortedMapDecorator.SortedMapIterator<>(
        new HashSet<>());

    // Act and Assert
    assertFalse(sortedMapIterator.hasPrevious());
  }

  /**
   * Method under test:
   * {@link AbstractSortedMapDecorator.SortedMapIterator#SortedMapIterator(Set)}
   */
  @Test
  public void testSortedMapIteratorNewSortedMapIterator() {
    // Arrange and Act
    AbstractSortedMapDecorator.SortedMapIterator<Object, Object> actualSortedMapIterator = new AbstractSortedMapDecorator.SortedMapIterator<>(
        new HashSet<>());

    // Assert
    assertFalse(actualSortedMapIterator.hasNext());
  }
}
