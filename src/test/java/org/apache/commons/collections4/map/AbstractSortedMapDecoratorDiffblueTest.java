package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.collections4.map.AbstractSortedMapDecorator.SortedMapIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractSortedMapDecoratorDiffblueTest {
  /**
   * Test SortedMapIterator {@link SortedMapIterator#hasPrevious()}.
   *
   * <p>Method under test: {@link SortedMapIterator#hasPrevious()}
   */
  @Test
  @DisplayName("Test SortedMapIterator hasPrevious()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SortedMapIterator.hasPrevious()"})
  void testSortedMapIteratorHasPrevious() {
    // Arrange
    SortedMapIterator<Object, Object> sortedMapIterator = new SortedMapIterator<>(new HashSet<>());

    // Act and Assert
    assertFalse(sortedMapIterator.hasPrevious());
  }

  /**
   * Test SortedMapIterator {@link SortedMapIterator#SortedMapIterator(Set)}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link SortedMapIterator#SortedMapIterator(Set)}
   */
  @Test
  @DisplayName("Test SortedMapIterator new SortedMapIterator(Set); when HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SortedMapIterator.<init>(Set)"})
  void testSortedMapIteratorNewSortedMapIterator_whenHashSet() {
    // Arrange and Act
    SortedMapIterator<Object, Object> actualSortedMapIterator =
        new SortedMapIterator<>(new HashSet<>());

    // Assert
    assertFalse(actualSortedMapIterator.hasNext());
  }
}
