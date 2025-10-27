package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class AbstractEmptyMapIteratorDiffblueTest {
  /**
   * Method under test: {@link AbstractEmptyMapIterator#getKey()}
   */
  @Test
  public void testGetKey() {
    // Arrange
    EmptyMapIterator<Object, Object> emptyMapIterator = new EmptyMapIterator<>();

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> emptyMapIterator.getKey());
  }

  /**
   * Method under test: {@link AbstractEmptyMapIterator#getValue()}
   */
  @Test
  public void testGetValue() {
    // Arrange
    EmptyMapIterator<Object, Object> emptyMapIterator = new EmptyMapIterator<>();

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> emptyMapIterator.getValue());
  }

  /**
   * Method under test: {@link AbstractEmptyMapIterator#setValue(Object)}
   */
  @Test
  public void testSetValue() {
    // Arrange
    EmptyMapIterator<Object, Object> emptyMapIterator = new EmptyMapIterator<>();

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> emptyMapIterator.setValue("Ignored"));
  }
}
