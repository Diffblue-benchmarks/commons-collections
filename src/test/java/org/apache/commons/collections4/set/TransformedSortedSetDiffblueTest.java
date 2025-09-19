package org.apache.commons.collections4.set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.SortedSet;
import java.util.TreeSet;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TransformedSortedSetDiffblueTest {
  /**
   * Test {@link TransformedSortedSet#transformedSortedSet(SortedSet, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then calls {@link Transformer#apply(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSortedSet#transformedSortedSet(SortedSet, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedSortedSet(SortedSet, Transformer); given 'Apply'; then calls apply(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedSortedSet TransformedSortedSet.transformedSortedSet(SortedSet, Transformer)"
  })
  void testTransformedSortedSet_givenApply_thenCallsApply() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    TransformedSortedSet<Object> actualTransformedSortedSetResult =
        TransformedSortedSet.transformedSortedSet(set, transformer);

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals(set, actualTransformedSortedSetResult);
  }

  /**
   * Test {@link TransformedSortedSet#transformedSortedSet(SortedSet, Transformer)}.
   *
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.
   *   <li>Then return {@link TreeSet#TreeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSortedSet#transformedSortedSet(SortedSet, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedSortedSet(SortedSet, Transformer); when TreeSet(); then return TreeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedSortedSet TransformedSortedSet.transformedSortedSet(SortedSet, Transformer)"
  })
  void testTransformedSortedSet_whenTreeSet_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    TransformedSortedSet<Object> actualTransformedSortedSetResult =
        TransformedSortedSet.transformedSortedSet(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformedSortedSetResult);
  }

  /**
   * Test {@link TransformedSortedSet#transformingSortedSet(SortedSet, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link TreeSet#TreeSet()} add {@code 42}.
   *   <li>Then return {@link TreeSet#TreeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSortedSet#transformingSortedSet(SortedSet,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingSortedSet(SortedSet, Transformer); given '42'; when TreeSet() add '42'; then return TreeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedSortedSet TransformedSortedSet.transformingSortedSet(SortedSet, Transformer)"
  })
  void testTransformingSortedSet_given42_whenTreeSetAdd42_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    // Act
    TransformedSortedSet<Object> actualTransformingSortedSetResult =
        TransformedSortedSet.transformingSortedSet(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformingSortedSetResult);
  }

  /**
   * Test {@link TransformedSortedSet#transformingSortedSet(SortedSet, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link TreeSet#TreeSet()} add {@code foo}.
   *   <li>Then return {@link TreeSet#TreeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSortedSet#transformingSortedSet(SortedSet,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingSortedSet(SortedSet, Transformer); given 'foo'; when TreeSet() add 'foo'; then return TreeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedSortedSet TransformedSortedSet.transformingSortedSet(SortedSet, Transformer)"
  })
  void testTransformingSortedSet_givenFoo_whenTreeSetAddFoo_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("foo");
    set.add("42");

    // Act
    TransformedSortedSet<Object> actualTransformingSortedSetResult =
        TransformedSortedSet.transformingSortedSet(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformingSortedSetResult);
  }

  /**
   * Test {@link TransformedSortedSet#transformingSortedSet(SortedSet, Transformer)}.
   *
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.
   *   <li>Then return {@link TreeSet#TreeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSortedSet#transformingSortedSet(SortedSet,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingSortedSet(SortedSet, Transformer); when TreeSet(); then return TreeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedSortedSet TransformedSortedSet.transformingSortedSet(SortedSet, Transformer)"
  })
  void testTransformingSortedSet_whenTreeSet_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    TransformedSortedSet<Object> actualTransformingSortedSetResult =
        TransformedSortedSet.transformingSortedSet(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformingSortedSetResult);
  }

  /**
   * Test {@link TransformedSortedSet#TransformedSortedSet(SortedSet, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link TreeSet#TreeSet()} add {@code 42}.
   *   <li>Then return {@link TreeSet#TreeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSortedSet#TransformedSortedSet(SortedSet, Transformer)}
   */
  @Test
  @DisplayName(
      "Test new TransformedSortedSet(SortedSet, Transformer); given '42'; when TreeSet() add '42'; then return TreeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransformedSortedSet.<init>(SortedSet, Transformer)"})
  void testNewTransformedSortedSet_given42_whenTreeSetAdd42_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    // Act
    TransformedSortedSet<Object> actualObjectSet =
        new TransformedSortedSet<>(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualObjectSet);
  }

  /**
   * Test {@link TransformedSortedSet#TransformedSortedSet(SortedSet, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link TreeSet#TreeSet()} add {@code foo}.
   *   <li>Then return {@link TreeSet#TreeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSortedSet#TransformedSortedSet(SortedSet, Transformer)}
   */
  @Test
  @DisplayName(
      "Test new TransformedSortedSet(SortedSet, Transformer); given 'foo'; when TreeSet() add 'foo'; then return TreeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransformedSortedSet.<init>(SortedSet, Transformer)"})
  void testNewTransformedSortedSet_givenFoo_whenTreeSetAddFoo_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("foo");
    set.add("42");

    // Act
    TransformedSortedSet<Object> actualObjectSet =
        new TransformedSortedSet<>(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualObjectSet);
  }

  /**
   * Test {@link TransformedSortedSet#TransformedSortedSet(SortedSet, Transformer)}.
   *
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.
   *   <li>Then return {@link TreeSet#TreeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSortedSet#TransformedSortedSet(SortedSet, Transformer)}
   */
  @Test
  @DisplayName(
      "Test new TransformedSortedSet(SortedSet, Transformer); when TreeSet(); then return TreeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransformedSortedSet.<init>(SortedSet, Transformer)"})
  void testNewTransformedSortedSet_whenTreeSet_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    TransformedSortedSet<Object> actualObjectSet =
        new TransformedSortedSet<>(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualObjectSet);
  }
}
