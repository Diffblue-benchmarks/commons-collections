package org.apache.commons.collections4.multiset;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.MultiSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnmodifiableMultiSetDiffblueTest {
  /**
   * Test {@link UnmodifiableMultiSet#unmodifiableMultiSet(MultiSet)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashMultiSet#HashMultiSet()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableMultiSet#unmodifiableMultiSet(MultiSet)}
   */
  @Test
  @DisplayName(
      "Test unmodifiableMultiSet(MultiSet); given 'Object'; when HashMultiSet() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiSet UnmodifiableMultiSet.unmodifiableMultiSet(MultiSet)"})
  void testUnmodifiableMultiSet_givenObject_whenHashMultiSetAddObject() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");

    // Act
    MultiSet<Object> actualUnmodifiableMultiSetResult =
        UnmodifiableMultiSet.unmodifiableMultiSet(multiset);

    // Assert
    assertEquals(multiset, actualUnmodifiableMultiSetResult);
  }

  /**
   * Test {@link UnmodifiableMultiSet#unmodifiableMultiSet(MultiSet)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashMultiSet#HashMultiSet()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableMultiSet#unmodifiableMultiSet(MultiSet)}
   */
  @Test
  @DisplayName(
      "Test unmodifiableMultiSet(MultiSet); given 'Object'; when HashMultiSet() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiSet UnmodifiableMultiSet.unmodifiableMultiSet(MultiSet)"})
  void testUnmodifiableMultiSet_givenObject_whenHashMultiSetAddObject2() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");
    multiset.add("Object");

    // Act
    MultiSet<Object> actualUnmodifiableMultiSetResult =
        UnmodifiableMultiSet.unmodifiableMultiSet(multiset);

    // Assert
    assertEquals(multiset, actualUnmodifiableMultiSetResult);
  }

  /**
   * Test {@link UnmodifiableMultiSet#unmodifiableMultiSet(MultiSet)}.
   *
   * <ul>
   *   <li>When {@link HashMultiSet#HashMultiSet()}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableMultiSet#unmodifiableMultiSet(MultiSet)}
   */
  @Test
  @DisplayName("Test unmodifiableMultiSet(MultiSet); when HashMultiSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiSet UnmodifiableMultiSet.unmodifiableMultiSet(MultiSet)"})
  void testUnmodifiableMultiSet_whenHashMultiSet() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();

    // Act
    MultiSet<Object> actualUnmodifiableMultiSetResult =
        UnmodifiableMultiSet.unmodifiableMultiSet(multiset);

    // Assert
    assertEquals(multiset, actualUnmodifiableMultiSetResult);
  }
}
