package org.apache.commons.collections4.set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TransformedSetDiffblueTest {
  /**
   * Test {@link TransformedSet#transformedSet(Set, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSet#transformedSet(Set, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedSet(Set, Transformer); given '42'; when HashSet() add '42'; then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set TransformedSet.transformedSet(Set, Transformer)"})
  void testTransformedSet_given42_whenHashSetAdd42_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Set<Object> actualTransformedSetResult = TransformedSet.transformedSet(set, transformer);

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals(set, actualTransformedSetResult);
  }

  /**
   * Test {@link TransformedSet#transformedSet(Set, Transformer)}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSet#transformedSet(Set, Transformer)}
   */
  @Test
  @DisplayName("Test transformedSet(Set, Transformer); when HashSet(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set TransformedSet.transformedSet(Set, Transformer)"})
  void testTransformedSet_whenHashSet_thenReturnEmpty() {
    // Arrange and Act
    Set<Object> actualTransformedSetResult =
        TransformedSet.transformedSet(new HashSet<>(), mock(Transformer.class));

    // Assert
    assertTrue(actualTransformedSetResult.isEmpty());
  }

  /**
   * Test {@link TransformedSet#transformingSet(Set, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSet#transformingSet(Set, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingSet(Set, Transformer); given '42'; when HashSet() add '42'; then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TransformedSet TransformedSet.transformingSet(Set, Transformer)"})
  void testTransformingSet_given42_whenHashSetAdd42_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    TransformedSet<Object> actualTransformingSetResult =
        TransformedSet.transformingSet(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformingSetResult);
  }

  /**
   * Test {@link TransformedSet#transformingSet(Set, Transformer)}.
   *
   * <ul>
   *   <li>Given two.
   *   <li>When {@link HashSet#HashSet()} add two.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSet#transformingSet(Set, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingSet(Set, Transformer); given two; when HashSet() add two; then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TransformedSet TransformedSet.transformingSet(Set, Transformer)"})
  void testTransformingSet_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    TransformedSet<Object> actualTransformingSetResult =
        TransformedSet.transformingSet(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformingSetResult);
  }

  /**
   * Test {@link TransformedSet#transformingSet(Set, Transformer)}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSet#transformingSet(Set, Transformer)}
   */
  @Test
  @DisplayName("Test transformingSet(Set, Transformer); when HashSet(); then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TransformedSet TransformedSet.transformingSet(Set, Transformer)"})
  void testTransformingSet_whenHashSet_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    // Act
    TransformedSet<Object> actualTransformingSetResult =
        TransformedSet.transformingSet(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformingSetResult);
  }

  /**
   * Test {@link TransformedSet#TransformedSet(Set, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSet#TransformedSet(Set, Transformer)}
   */
  @Test
  @DisplayName(
      "Test new TransformedSet(Set, Transformer); given '42'; when HashSet() add '42'; then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransformedSet.<init>(Set, Transformer)"})
  void testNewTransformedSet_given42_whenHashSetAdd42_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    TransformedSet<Object> actualObjectSet = new TransformedSet<>(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualObjectSet);
  }

  /**
   * Test {@link TransformedSet#TransformedSet(Set, Transformer)}.
   *
   * <ul>
   *   <li>Given two.
   *   <li>When {@link HashSet#HashSet()} add two.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSet#TransformedSet(Set, Transformer)}
   */
  @Test
  @DisplayName(
      "Test new TransformedSet(Set, Transformer); given two; when HashSet() add two; then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransformedSet.<init>(Set, Transformer)"})
  void testNewTransformedSet_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    TransformedSet<Object> actualObjectSet = new TransformedSet<>(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualObjectSet);
  }

  /**
   * Test {@link TransformedSet#TransformedSet(Set, Transformer)}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSet#TransformedSet(Set, Transformer)}
   */
  @Test
  @DisplayName("Test new TransformedSet(Set, Transformer); when HashSet(); then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransformedSet.<init>(Set, Transformer)"})
  void testNewTransformedSet_whenHashSet_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    // Act
    TransformedSet<Object> actualObjectSet = new TransformedSet<>(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualObjectSet);
  }
}
