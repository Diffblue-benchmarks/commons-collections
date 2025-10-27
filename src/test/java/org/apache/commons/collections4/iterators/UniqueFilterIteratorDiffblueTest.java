package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.Test;

public class UniqueFilterIteratorDiffblueTest {
  /**
   * Method under test:
   * {@link UniqueFilterIterator#UniqueFilterIterator(Iterator)}
   */
  @Test
  public void testNewUniqueFilterIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    UniqueFilterIterator<Object> actualUniqueFilterIterator = new UniqueFilterIterator<>(objectList.iterator());

    // Assert
    assertFalse(actualUniqueFilterIterator.hasNext());
  }
}
