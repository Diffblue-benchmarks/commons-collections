package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ListIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnmodifiableListIteratorDiffblueTest {
  /**
   * Test {@link UnmodifiableListIterator#umodifiableListIterator(ListIterator)}.
   *
   * <ul>
   *   <li>Then return {@link UnmodifiableListIterator}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableListIterator#umodifiableListIterator(ListIterator)}
   */
  @Test
  @DisplayName("Test umodifiableListIterator(ListIterator); then return UnmodifiableListIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ListIterator UnmodifiableListIterator.umodifiableListIterator(ListIterator)"})
  void testUmodifiableListIterator_thenReturnUnmodifiableListIterator() {
    // Arrange and Act
    ListIterator<Object> actualUmodifiableListIteratorResult =
        UnmodifiableListIterator.umodifiableListIterator(
            new AbstractListIteratorDecorator<>(new EmptyListIterator<>()));

    // Assert
    assertTrue(actualUmodifiableListIteratorResult instanceof UnmodifiableListIterator);
    assertFalse(actualUmodifiableListIteratorResult.hasNext());
  }

  /**
   * Test {@link UnmodifiableListIterator#unmodifiableListIterator(ListIterator)}.
   *
   * <ul>
   *   <li>Then return {@link UnmodifiableListIterator}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableListIterator#unmodifiableListIterator(ListIterator)}
   */
  @Test
  @DisplayName("Test unmodifiableListIterator(ListIterator); then return UnmodifiableListIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ListIterator UnmodifiableListIterator.unmodifiableListIterator(ListIterator)"
  })
  void testUnmodifiableListIterator_thenReturnUnmodifiableListIterator() {
    // Arrange and Act
    ListIterator<Object> actualUnmodifiableListIteratorResult =
        UnmodifiableListIterator.unmodifiableListIterator(
            new AbstractListIteratorDecorator<>(new EmptyListIterator<>()));

    // Assert
    assertTrue(actualUnmodifiableListIteratorResult instanceof UnmodifiableListIterator);
    assertFalse(actualUnmodifiableListIteratorResult.hasNext());
  }
}
