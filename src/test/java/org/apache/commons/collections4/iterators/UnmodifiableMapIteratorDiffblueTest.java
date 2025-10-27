package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.MapIterator;
import org.junit.Test;

public class UnmodifiableMapIteratorDiffblueTest {
  /**
   * Method under test:
   * {@link UnmodifiableMapIterator#unmodifiableMapIterator(MapIterator)}
   */
  @Test
  public void testUnmodifiableMapIterator() {
    // Arrange and Act
    MapIterator<Object, Object> actualUnmodifiableMapIteratorResult = UnmodifiableMapIterator.unmodifiableMapIterator(
        new AbstractMapIteratorDecorator<>(new AbstractOrderedMapIteratorDecorator<>(new EmptyOrderedMapIterator<>())));

    // Assert
    assertTrue(actualUnmodifiableMapIteratorResult instanceof UnmodifiableMapIterator);
    assertFalse(actualUnmodifiableMapIteratorResult.hasNext());
  }
}
