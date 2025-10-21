package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.OrderedMapIterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UnmodifiableOrderedMapIteratorDiffblueTest {
  /**
   * Test {@link UnmodifiableOrderedMapIterator#unmodifiableOrderedMapIterator(OrderedMapIterator)}.
   * <ul>
   *   <li>Then return {@link UnmodifiableOrderedMapIterator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableOrderedMapIterator#unmodifiableOrderedMapIterator(OrderedMapIterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({
      "OrderedMapIterator UnmodifiableOrderedMapIterator.unmodifiableOrderedMapIterator(OrderedMapIterator)"})
  public void testUnmodifiableOrderedMapIterator_thenReturnUnmodifiableOrderedMapIterator() {
    // Arrange and Act
    OrderedMapIterator<Object, Object> actualUnmodifiableOrderedMapIteratorResult = UnmodifiableOrderedMapIterator
        .unmodifiableOrderedMapIterator(new AbstractOrderedMapIteratorDecorator<>(new EmptyOrderedMapIterator<>()));

    // Assert
    assertTrue(actualUnmodifiableOrderedMapIteratorResult instanceof UnmodifiableOrderedMapIterator);
    assertFalse(actualUnmodifiableOrderedMapIteratorResult.hasNext());
  }
}
