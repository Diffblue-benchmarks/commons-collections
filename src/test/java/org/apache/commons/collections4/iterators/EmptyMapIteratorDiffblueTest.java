package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.MapIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EmptyMapIteratorDiffblueTest {
  /**
   * Test {@link EmptyMapIterator#emptyMapIterator()}.
   *
   * <p>Method under test: {@link EmptyMapIterator#emptyMapIterator()}
   */
  @Test
  @DisplayName("Test emptyMapIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MapIterator EmptyMapIterator.emptyMapIterator()"})
  void testEmptyMapIterator() {
    // Arrange and Act
    MapIterator<Object, Object> actualEmptyMapIteratorResult = EmptyMapIterator.emptyMapIterator();

    // Assert
    assertTrue(actualEmptyMapIteratorResult instanceof EmptyMapIterator);
    assertFalse(actualEmptyMapIteratorResult.hasNext());
  }

  /**
   * Test {@link EmptyMapIterator#EmptyMapIterator()}.
   *
   * <p>Method under test: default or parameterless constructor of {@link EmptyMapIterator}
   */
  @Test
  @DisplayName("Test new EmptyMapIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EmptyMapIterator.<init>()"})
  void testNewEmptyMapIterator() {
    // Arrange and Act
    EmptyMapIterator<Object, Object> actualEmptyMapIterator = new EmptyMapIterator<>();

    // Assert
    assertFalse(actualEmptyMapIterator.hasNext());
  }
}
