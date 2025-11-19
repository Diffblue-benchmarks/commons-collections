package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractEmptyMapIteratorDiffblueTest {
  /**
   * Test {@link AbstractEmptyMapIterator#getKey()}.
   *
   * <p>Method under test: {@link AbstractEmptyMapIterator#getKey()}
   */
  @Test
  @DisplayName("Test getKey()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractEmptyMapIterator.getKey()"})
  void testGetKey() {
    // Arrange
    EmptyMapIterator<Object, Object> emptyMapIterator = new EmptyMapIterator<>();

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> emptyMapIterator.getKey());
  }

  /**
   * Test {@link AbstractEmptyMapIterator#getValue()}.
   *
   * <p>Method under test: {@link AbstractEmptyMapIterator#getValue()}
   */
  @Test
  @DisplayName("Test getValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractEmptyMapIterator.getValue()"})
  void testGetValue() {
    // Arrange
    EmptyMapIterator<Object, Object> emptyMapIterator = new EmptyMapIterator<>();

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> emptyMapIterator.getValue());
  }

  /**
   * Test {@link AbstractEmptyMapIterator#setValue(Object)}.
   *
   * <p>Method under test: {@link AbstractEmptyMapIterator#setValue(Object)}
   */
  @Test
  @DisplayName("Test setValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractEmptyMapIterator.setValue(Object)"})
  void testSetValue() {
    // Arrange
    EmptyMapIterator<Object, Object> emptyMapIterator = new EmptyMapIterator<>();

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> emptyMapIterator.setValue("Ignored"));
  }
}
