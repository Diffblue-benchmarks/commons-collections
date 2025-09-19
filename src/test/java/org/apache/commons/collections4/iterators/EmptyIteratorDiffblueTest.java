package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Iterator;
import org.apache.commons.collections4.ResettableIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EmptyIteratorDiffblueTest {
  /**
   * Test {@link EmptyIterator#emptyIterator()}.
   *
   * <p>Method under test: {@link EmptyIterator#emptyIterator()}
   */
  @Test
  @DisplayName("Test emptyIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator EmptyIterator.emptyIterator()"})
  void testEmptyIterator() {
    // Arrange and Act
    Iterator<Object> actualEmptyIteratorResult = EmptyIterator.emptyIterator();

    // Assert
    assertTrue(actualEmptyIteratorResult instanceof EmptyIterator);
    assertFalse(actualEmptyIteratorResult.hasNext());
  }

  /**
   * Test {@link EmptyIterator#resettableEmptyIterator()}.
   *
   * <p>Method under test: {@link EmptyIterator#resettableEmptyIterator()}
   */
  @Test
  @DisplayName("Test resettableEmptyIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResettableIterator EmptyIterator.resettableEmptyIterator()"})
  void testResettableEmptyIterator() {
    // Arrange and Act
    ResettableIterator<Object> actualResettableEmptyIteratorResult =
        EmptyIterator.resettableEmptyIterator();

    // Assert
    assertTrue(actualResettableEmptyIteratorResult instanceof EmptyIterator);
    assertFalse(actualResettableEmptyIteratorResult.hasNext());
  }

  /**
   * Test {@link EmptyIterator#EmptyIterator()}.
   *
   * <p>Method under test: default or parameterless constructor of {@link EmptyIterator}
   */
  @Test
  @DisplayName("Test new EmptyIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EmptyIterator.<init>()"})
  void testNewEmptyIterator() {
    // Arrange and Act
    EmptyIterator<Object> actualEmptyIterator = new EmptyIterator<>();

    // Assert
    assertFalse(actualEmptyIterator.hasNext());
  }
}
