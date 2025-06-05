package org.apache.commons.collections4.set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnmodifiableSetDiffblueTest {
  /**
   * Test {@link UnmodifiableSet#unmodifiableSet(Set)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableSet#unmodifiableSet(Set)}
   */
  @Test
  @DisplayName("Test unmodifiableSet(Set); given '42'; when HashSet() add '42'; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set UnmodifiableSet.unmodifiableSet(Set)"})
  void testUnmodifiableSet_given42_whenHashSetAdd42_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    Set<Object> actualUnmodifiableSetResult = UnmodifiableSet.unmodifiableSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableSetResult);
  }

  /**
   * Test {@link UnmodifiableSet#unmodifiableSet(Set)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableSet#unmodifiableSet(Set)}
   */
  @Test
  @DisplayName("Test unmodifiableSet(Set); given two; when HashSet() add two; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set UnmodifiableSet.unmodifiableSet(Set)"})
  void testUnmodifiableSet_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    Set<Object> actualUnmodifiableSetResult = UnmodifiableSet.unmodifiableSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableSetResult);
  }

  /**
   * Test {@link UnmodifiableSet#unmodifiableSet(Set)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableSet#unmodifiableSet(Set)}
   */
  @Test
  @DisplayName("Test unmodifiableSet(Set); when HashSet(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set UnmodifiableSet.unmodifiableSet(Set)"})
  void testUnmodifiableSet_whenHashSet_thenReturnEmpty() {
    // Arrange and Act
    Set<Object> actualUnmodifiableSetResult = UnmodifiableSet.unmodifiableSet(new HashSet<>());

    // Assert
    assertTrue(actualUnmodifiableSetResult.isEmpty());
  }
}
