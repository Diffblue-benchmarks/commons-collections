package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.OrderedMapIterator;
import org.junit.Test;

public class UnmodifiableOrderedMapIteratorDiffblueTest {
  /**
   * Method under test:
   * {@link UnmodifiableOrderedMapIterator#unmodifiableOrderedMapIterator(OrderedMapIterator)}
   */
  @Test
  public void testUnmodifiableOrderedMapIterator() {
    // Arrange and Act
    OrderedMapIterator<Object, Object> actualUnmodifiableOrderedMapIteratorResult = UnmodifiableOrderedMapIterator
        .unmodifiableOrderedMapIterator(new AbstractOrderedMapIteratorDecorator<>(new EmptyOrderedMapIterator<>()));

    // Assert
    assertTrue(actualUnmodifiableOrderedMapIteratorResult instanceof UnmodifiableOrderedMapIterator);
    assertFalse(actualUnmodifiableOrderedMapIteratorResult.hasNext());
  }
}
