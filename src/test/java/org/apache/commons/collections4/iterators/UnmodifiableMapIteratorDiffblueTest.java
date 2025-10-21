package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.MapIterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UnmodifiableMapIteratorDiffblueTest {
  /**
   * Test {@link UnmodifiableMapIterator#unmodifiableMapIterator(MapIterator)}.
   * <ul>
   *   <li>Then return {@link UnmodifiableMapIterator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableMapIterator#unmodifiableMapIterator(MapIterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MapIterator UnmodifiableMapIterator.unmodifiableMapIterator(MapIterator)"})
  public void testUnmodifiableMapIterator_thenReturnUnmodifiableMapIterator() {
    // Arrange and Act
    MapIterator<Object, Object> actualUnmodifiableMapIteratorResult = UnmodifiableMapIterator.unmodifiableMapIterator(
        new AbstractMapIteratorDecorator<>(new AbstractOrderedMapIteratorDecorator<>(new EmptyOrderedMapIterator<>())));

    // Assert
    assertTrue(actualUnmodifiableMapIteratorResult instanceof UnmodifiableMapIterator);
    assertFalse(actualUnmodifiableMapIteratorResult.hasNext());
  }
}
