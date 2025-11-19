package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.OrderedIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EmptyOrderedIteratorDiffblueTest {
  /**
   * Test {@link EmptyOrderedIterator#emptyOrderedIterator()}.
   *
   * <p>Method under test: {@link EmptyOrderedIterator#emptyOrderedIterator()}
   */
  @Test
  @DisplayName("Test emptyOrderedIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OrderedIterator EmptyOrderedIterator.emptyOrderedIterator()"})
  void testEmptyOrderedIterator() {
    // Arrange and Act
    OrderedIterator<Object> actualEmptyOrderedIteratorResult =
        EmptyOrderedIterator.emptyOrderedIterator();

    // Assert
    assertTrue(actualEmptyOrderedIteratorResult instanceof EmptyOrderedIterator);
    assertFalse(actualEmptyOrderedIteratorResult.hasNext());
  }

  /**
   * Test {@link EmptyOrderedIterator#EmptyOrderedIterator()}.
   *
   * <p>Method under test: default or parameterless constructor of {@link EmptyOrderedIterator}
   */
  @Test
  @DisplayName("Test new EmptyOrderedIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EmptyOrderedIterator.<init>()"})
  void testNewEmptyOrderedIterator() {
    // Arrange and Act
    EmptyOrderedIterator<Object> actualEmptyOrderedIterator = new EmptyOrderedIterator<>();

    // Assert
    assertFalse(actualEmptyOrderedIterator.hasNext());
  }
}
