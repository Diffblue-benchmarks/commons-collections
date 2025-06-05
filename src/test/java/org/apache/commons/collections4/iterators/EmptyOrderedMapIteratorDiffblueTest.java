package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.OrderedMapIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EmptyOrderedMapIteratorDiffblueTest {
  /**
   * Test {@link EmptyOrderedMapIterator#emptyOrderedMapIterator()}.
   * <p>
   * Method under test: {@link EmptyOrderedMapIterator#emptyOrderedMapIterator()}
   */
  @Test
  @DisplayName("Test emptyOrderedMapIterator()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"OrderedMapIterator EmptyOrderedMapIterator.emptyOrderedMapIterator()"})
  void testEmptyOrderedMapIterator() {
    // Arrange and Act
    OrderedMapIterator<Object, Object> actualEmptyOrderedMapIteratorResult = EmptyOrderedMapIterator
        .emptyOrderedMapIterator();

    // Assert
    assertTrue(actualEmptyOrderedMapIteratorResult instanceof EmptyOrderedMapIterator);
    assertFalse(actualEmptyOrderedMapIteratorResult.hasNext());
  }

  /**
   * Test {@link EmptyOrderedMapIterator#EmptyOrderedMapIterator()}.
   * <p>
   * Method under test: default or parameterless constructor of {@link EmptyOrderedMapIterator}
   */
  @Test
  @DisplayName("Test new EmptyOrderedMapIterator()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EmptyOrderedMapIterator.<init>()"})
  void testNewEmptyOrderedMapIterator() {
    // Arrange and Act
    EmptyOrderedMapIterator<Object, Object> actualEmptyOrderedMapIterator = new EmptyOrderedMapIterator<>();

    // Assert
    assertFalse(actualEmptyOrderedMapIterator.hasNext());
  }
}
