package org.apache.commons.collections4.set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.NavigableSet;
import java.util.TreeSet;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TransformedNavigableSetDiffblueTest {
  /**
   * Test {@link TransformedNavigableSet#transformedNavigableSet(NavigableSet, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then calls {@link Transformer#apply(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedNavigableSet#transformedNavigableSet(NavigableSet,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedNavigableSet(NavigableSet, Transformer); given 'Apply'; then calls apply(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedNavigableSet TransformedNavigableSet.transformedNavigableSet(NavigableSet, Transformer)"
  })
  void testTransformedNavigableSet_givenApply_thenCallsApply() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    TransformedNavigableSet<Object> actualTransformedNavigableSetResult =
        TransformedNavigableSet.transformedNavigableSet(set, transformer);

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals(set, actualTransformedNavigableSetResult);
  }

  /**
   * Test {@link TransformedNavigableSet#transformedNavigableSet(NavigableSet, Transformer)}.
   *
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.
   *   <li>Then return {@link TreeSet#TreeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedNavigableSet#transformedNavigableSet(NavigableSet,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedNavigableSet(NavigableSet, Transformer); when TreeSet(); then return TreeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedNavigableSet TransformedNavigableSet.transformedNavigableSet(NavigableSet, Transformer)"
  })
  void testTransformedNavigableSet_whenTreeSet_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    TransformedNavigableSet<Object> actualTransformedNavigableSetResult =
        TransformedNavigableSet.transformedNavigableSet(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformedNavigableSetResult);
  }

  /**
   * Test {@link TransformedNavigableSet#transformingNavigableSet(NavigableSet, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link TreeSet#TreeSet()} add {@code 42}.
   *   <li>Then return {@link TreeSet#TreeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedNavigableSet#transformingNavigableSet(NavigableSet,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingNavigableSet(NavigableSet, Transformer); given '42'; when TreeSet() add '42'; then return TreeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedNavigableSet TransformedNavigableSet.transformingNavigableSet(NavigableSet, Transformer)"
  })
  void testTransformingNavigableSet_given42_whenTreeSetAdd42_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    // Act
    TransformedNavigableSet<Object> actualTransformingNavigableSetResult =
        TransformedNavigableSet.transformingNavigableSet(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformingNavigableSetResult);
  }

  /**
   * Test {@link TransformedNavigableSet#transformingNavigableSet(NavigableSet, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link TreeSet#TreeSet()} add {@code foo}.
   *   <li>Then return {@link TreeSet#TreeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedNavigableSet#transformingNavigableSet(NavigableSet,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingNavigableSet(NavigableSet, Transformer); given 'foo'; when TreeSet() add 'foo'; then return TreeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedNavigableSet TransformedNavigableSet.transformingNavigableSet(NavigableSet, Transformer)"
  })
  void testTransformingNavigableSet_givenFoo_whenTreeSetAddFoo_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("foo");
    set.add("42");

    // Act
    TransformedNavigableSet<Object> actualTransformingNavigableSetResult =
        TransformedNavigableSet.transformingNavigableSet(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformingNavigableSetResult);
  }

  /**
   * Test {@link TransformedNavigableSet#transformingNavigableSet(NavigableSet, Transformer)}.
   *
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.
   *   <li>Then return {@link TreeSet#TreeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedNavigableSet#transformingNavigableSet(NavigableSet,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingNavigableSet(NavigableSet, Transformer); when TreeSet(); then return TreeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedNavigableSet TransformedNavigableSet.transformingNavigableSet(NavigableSet, Transformer)"
  })
  void testTransformingNavigableSet_whenTreeSet_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    TransformedNavigableSet<Object> actualTransformingNavigableSetResult =
        TransformedNavigableSet.transformingNavigableSet(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformingNavigableSetResult);
  }

  /**
   * Test {@link TransformedNavigableSet#TransformedNavigableSet(NavigableSet, Transformer)}.
   *
   * <p>Method under test: {@link TransformedNavigableSet#TransformedNavigableSet(NavigableSet,
   * Transformer)}
   */
  @Test
  @DisplayName("Test new TransformedNavigableSet(NavigableSet, Transformer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransformedNavigableSet.<init>(NavigableSet, Transformer)"})
  void testNewTransformedNavigableSet() {
    // Arrange and Act
    TransformedNavigableSet<Object> actualObjectSet =
        new TransformedNavigableSet<>(new TreeSet<>(), mock(Transformer.class));

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }
}
