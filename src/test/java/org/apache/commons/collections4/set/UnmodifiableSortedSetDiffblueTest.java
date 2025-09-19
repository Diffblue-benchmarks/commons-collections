package org.apache.commons.collections4.set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.SortedSet;
import java.util.TreeSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnmodifiableSortedSetDiffblueTest {
  /**
   * Test {@link UnmodifiableSortedSet#unmodifiableSortedSet(SortedSet)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link TreeSet#TreeSet()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableSortedSet#unmodifiableSortedSet(SortedSet)}
   */
  @Test
  @DisplayName("Test unmodifiableSortedSet(SortedSet); given '42'; when TreeSet() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedSet UnmodifiableSortedSet.unmodifiableSortedSet(SortedSet)"})
  void testUnmodifiableSortedSet_given42_whenTreeSetAdd42() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    // Act
    SortedSet<Object> actualUnmodifiableSortedSetResult =
        UnmodifiableSortedSet.unmodifiableSortedSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableSortedSetResult);
  }

  /**
   * Test {@link UnmodifiableSortedSet#unmodifiableSortedSet(SortedSet)}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link TreeSet#TreeSet()} add {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableSortedSet#unmodifiableSortedSet(SortedSet)}
   */
  @Test
  @DisplayName("Test unmodifiableSortedSet(SortedSet); given 'foo'; when TreeSet() add 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedSet UnmodifiableSortedSet.unmodifiableSortedSet(SortedSet)"})
  void testUnmodifiableSortedSet_givenFoo_whenTreeSetAddFoo() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("foo");
    set.add("42");

    // Act
    SortedSet<Object> actualUnmodifiableSortedSetResult =
        UnmodifiableSortedSet.unmodifiableSortedSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableSortedSetResult);
  }

  /**
   * Test {@link UnmodifiableSortedSet#unmodifiableSortedSet(SortedSet)}.
   *
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableSortedSet#unmodifiableSortedSet(SortedSet)}
   */
  @Test
  @DisplayName("Test unmodifiableSortedSet(SortedSet); when TreeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedSet UnmodifiableSortedSet.unmodifiableSortedSet(SortedSet)"})
  void testUnmodifiableSortedSet_whenTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    SortedSet<Object> actualUnmodifiableSortedSetResult =
        UnmodifiableSortedSet.unmodifiableSortedSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableSortedSetResult);
  }
}
