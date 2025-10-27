package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;

public class AbstractUntypedIteratorDecoratorDiffblueTest {
  /**
   * Method under test: {@link AbstractUntypedIteratorDecorator#getIterator()}
   */
  @Test
  public void testGetIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    SkippingIterator<Object> skippingIterator = new SkippingIterator<>(objectList.iterator(), 1L);

    // Act and Assert
    assertFalse(skippingIterator.getIterator().hasNext());
  }

  /**
   * Method under test: {@link AbstractUntypedIteratorDecorator#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    SkippingIterator<Object> skippingIterator = new SkippingIterator<>(objectList.iterator(), 1L);

    // Act and Assert
    assertFalse(skippingIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractUntypedIteratorDecorator#hasNext()}
   */
  @Test
  public void testHasNext2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    SkippingIterator<Object> skippingIterator = new SkippingIterator<>(objectList.iterator(), 1L);

    // Act and Assert
    assertTrue(skippingIterator.hasNext());
  }
}
