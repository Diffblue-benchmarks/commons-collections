package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ListIterator;
import org.apache.commons.collections4.ResettableListIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EmptyListIteratorDiffblueTest {
  /**
   * Test {@link EmptyListIterator#emptyListIterator()}.
   *
   * <p>Method under test: {@link EmptyListIterator#emptyListIterator()}
   */
  @Test
  @DisplayName("Test emptyListIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ListIterator EmptyListIterator.emptyListIterator()"})
  void testEmptyListIterator() {
    // Arrange and Act
    ListIterator<Object> actualEmptyListIteratorResult = EmptyListIterator.emptyListIterator();

    // Assert
    assertTrue(actualEmptyListIteratorResult instanceof EmptyListIterator);
    assertFalse(actualEmptyListIteratorResult.hasNext());
  }

  /**
   * Test {@link EmptyListIterator#resettableEmptyListIterator()}.
   *
   * <p>Method under test: {@link EmptyListIterator#resettableEmptyListIterator()}
   */
  @Test
  @DisplayName("Test resettableEmptyListIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResettableListIterator EmptyListIterator.resettableEmptyListIterator()"})
  void testResettableEmptyListIterator() {
    // Arrange and Act
    ResettableListIterator<Object> actualResettableEmptyListIteratorResult =
        EmptyListIterator.resettableEmptyListIterator();

    // Assert
    assertTrue(actualResettableEmptyListIteratorResult instanceof EmptyListIterator);
    assertFalse(actualResettableEmptyListIteratorResult.hasNext());
  }

  /**
   * Test {@link EmptyListIterator#EmptyListIterator()}.
   *
   * <p>Method under test: default or parameterless constructor of {@link EmptyListIterator}
   */
  @Test
  @DisplayName("Test new EmptyListIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EmptyListIterator.<init>()"})
  void testNewEmptyListIterator() {
    // Arrange and Act
    EmptyListIterator<Object> actualEmptyListIterator = new EmptyListIterator<>();

    // Assert
    assertFalse(actualEmptyListIterator.hasNext());
  }
}
