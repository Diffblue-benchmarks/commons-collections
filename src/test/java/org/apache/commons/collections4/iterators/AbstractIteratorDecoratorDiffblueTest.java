package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

public class AbstractIteratorDecoratorDiffblueTest {
  /**
   * Method under test: {@link AbstractIteratorDecorator#next()}
   */
  @Test
  public void testNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    SkippingIterator<Object> skippingIterator = new SkippingIterator<>(objectList.iterator(), 1L);

    // Act and Assert
    assertEquals("42", skippingIterator.next());
  }
}
