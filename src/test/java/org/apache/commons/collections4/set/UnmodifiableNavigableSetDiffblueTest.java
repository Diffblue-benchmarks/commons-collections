package org.apache.commons.collections4.set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.NavigableSet;
import java.util.TreeSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnmodifiableNavigableSetDiffblueTest {
  /**
   * Test {@link UnmodifiableNavigableSet#unmodifiableNavigableSet(NavigableSet)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link TreeSet#TreeSet()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableNavigableSet#unmodifiableNavigableSet(NavigableSet)}
   */
  @Test
  @DisplayName("Test unmodifiableNavigableSet(NavigableSet); given '42'; when TreeSet() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "NavigableSet UnmodifiableNavigableSet.unmodifiableNavigableSet(NavigableSet)"
  })
  void testUnmodifiableNavigableSet_given42_whenTreeSetAdd42() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    // Act
    NavigableSet<Object> actualUnmodifiableNavigableSetResult =
        UnmodifiableNavigableSet.unmodifiableNavigableSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableNavigableSetResult);
  }

  /**
   * Test {@link UnmodifiableNavigableSet#unmodifiableNavigableSet(NavigableSet)}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link TreeSet#TreeSet()} add {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableNavigableSet#unmodifiableNavigableSet(NavigableSet)}
   */
  @Test
  @DisplayName("Test unmodifiableNavigableSet(NavigableSet); given 'foo'; when TreeSet() add 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "NavigableSet UnmodifiableNavigableSet.unmodifiableNavigableSet(NavigableSet)"
  })
  void testUnmodifiableNavigableSet_givenFoo_whenTreeSetAddFoo() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("foo");
    set.add("42");

    // Act
    NavigableSet<Object> actualUnmodifiableNavigableSetResult =
        UnmodifiableNavigableSet.unmodifiableNavigableSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableNavigableSetResult);
  }

  /**
   * Test {@link UnmodifiableNavigableSet#unmodifiableNavigableSet(NavigableSet)}.
   *
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableNavigableSet#unmodifiableNavigableSet(NavigableSet)}
   */
  @Test
  @DisplayName("Test unmodifiableNavigableSet(NavigableSet); when TreeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "NavigableSet UnmodifiableNavigableSet.unmodifiableNavigableSet(NavigableSet)"
  })
  void testUnmodifiableNavigableSet_whenTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    NavigableSet<Object> actualUnmodifiableNavigableSetResult =
        UnmodifiableNavigableSet.unmodifiableNavigableSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableNavigableSetResult);
  }
}
