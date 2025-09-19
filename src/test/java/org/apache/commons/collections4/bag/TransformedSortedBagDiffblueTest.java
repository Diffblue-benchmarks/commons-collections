package org.apache.commons.collections4.bag;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.SortedBag;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TransformedSortedBagDiffblueTest {
  /**
   * Test {@link TransformedSortedBag#transformedSortedBag(SortedBag, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then calls {@link Transformer#apply(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSortedBag#transformedSortedBag(SortedBag, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedSortedBag(SortedBag, Transformer); given 'Apply'; then calls apply(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedSortedBag TransformedSortedBag.transformedSortedBag(SortedBag, Transformer)"
  })
  void testTransformedSortedBag_givenApply_thenCallsApply() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    TransformedSortedBag<Object> actualTransformedSortedBagResult =
        TransformedSortedBag.transformedSortedBag(bag, transformer);

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals(bag, actualTransformedSortedBagResult);
  }

  /**
   * Test {@link TransformedSortedBag#transformedSortedBag(SortedBag, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then calls {@link Transformer#apply(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSortedBag#transformedSortedBag(SortedBag, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedSortedBag(SortedBag, Transformer); given 'Apply'; then calls apply(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedSortedBag TransformedSortedBag.transformedSortedBag(SortedBag, Transformer)"
  })
  void testTransformedSortedBag_givenApply_thenCallsApply2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    TransformedSortedBag<Object> actualTransformedSortedBagResult =
        TransformedSortedBag.transformedSortedBag(bag, transformer);

    // Assert
    verify(transformer, atLeast(1)).apply(isA(Object.class));
    assertEquals(bag, actualTransformedSortedBagResult);
  }

  /**
   * Test {@link TransformedSortedBag#transformedSortedBag(SortedBag, Transformer)}.
   *
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.
   *   <li>Then return {@link TreeBag#TreeBag()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSortedBag#transformedSortedBag(SortedBag, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedSortedBag(SortedBag, Transformer); when TreeBag(); then return TreeBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedSortedBag TransformedSortedBag.transformedSortedBag(SortedBag, Transformer)"
  })
  void testTransformedSortedBag_whenTreeBag_thenReturnTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    TransformedSortedBag<Object> actualTransformedSortedBagResult =
        TransformedSortedBag.transformedSortedBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformedSortedBagResult);
  }

  /**
   * Test {@link TransformedSortedBag#transformingSortedBag(SortedBag, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.
   *   <li>Then return {@link TreeBag#TreeBag()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSortedBag#transformingSortedBag(SortedBag,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingSortedBag(SortedBag, Transformer); given 'Object'; when TreeBag() add 'Object'; then return TreeBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedSortedBag TransformedSortedBag.transformingSortedBag(SortedBag, Transformer)"
  })
  void testTransformingSortedBag_givenObject_whenTreeBagAddObject_thenReturnTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act
    TransformedSortedBag<Object> actualTransformingSortedBagResult =
        TransformedSortedBag.transformingSortedBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingSortedBagResult);
  }

  /**
   * Test {@link TransformedSortedBag#transformingSortedBag(SortedBag, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.
   *   <li>Then return {@link TreeBag#TreeBag()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSortedBag#transformingSortedBag(SortedBag,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingSortedBag(SortedBag, Transformer); given 'Object'; when TreeBag() add 'Object'; then return TreeBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedSortedBag TransformedSortedBag.transformingSortedBag(SortedBag, Transformer)"
  })
  void testTransformingSortedBag_givenObject_whenTreeBagAddObject_thenReturnTreeBag2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    TransformedSortedBag<Object> actualTransformingSortedBagResult =
        TransformedSortedBag.transformingSortedBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingSortedBagResult);
  }

  /**
   * Test {@link TransformedSortedBag#transformingSortedBag(SortedBag, Transformer)}.
   *
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.
   *   <li>Then return {@link TreeBag#TreeBag()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSortedBag#transformingSortedBag(SortedBag,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingSortedBag(SortedBag, Transformer); when TreeBag(); then return TreeBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedSortedBag TransformedSortedBag.transformingSortedBag(SortedBag, Transformer)"
  })
  void testTransformingSortedBag_whenTreeBag_thenReturnTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    TransformedSortedBag<Object> actualTransformingSortedBagResult =
        TransformedSortedBag.transformingSortedBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingSortedBagResult);
  }

  /**
   * Test {@link TransformedSortedBag#TransformedSortedBag(SortedBag, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.
   *   <li>Then return {@link TreeBag#TreeBag()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSortedBag#TransformedSortedBag(SortedBag, Transformer)}
   */
  @Test
  @DisplayName(
      "Test new TransformedSortedBag(SortedBag, Transformer); given 'Object'; when TreeBag() add 'Object'; then return TreeBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransformedSortedBag.<init>(SortedBag, Transformer)"})
  void testNewTransformedSortedBag_givenObject_whenTreeBagAddObject_thenReturnTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act
    TransformedSortedBag<Object> actualTransformedSortedBag =
        new TransformedSortedBag<>(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformedSortedBag);
  }

  /**
   * Test {@link TransformedSortedBag#TransformedSortedBag(SortedBag, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.
   *   <li>Then return {@link TreeBag#TreeBag()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSortedBag#TransformedSortedBag(SortedBag, Transformer)}
   */
  @Test
  @DisplayName(
      "Test new TransformedSortedBag(SortedBag, Transformer); given 'Object'; when TreeBag() add 'Object'; then return TreeBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransformedSortedBag.<init>(SortedBag, Transformer)"})
  void testNewTransformedSortedBag_givenObject_whenTreeBagAddObject_thenReturnTreeBag2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    TransformedSortedBag<Object> actualTransformedSortedBag =
        new TransformedSortedBag<>(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformedSortedBag);
  }

  /**
   * Test {@link TransformedSortedBag#TransformedSortedBag(SortedBag, Transformer)}.
   *
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.
   *   <li>Then return {@link TreeBag#TreeBag()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSortedBag#TransformedSortedBag(SortedBag, Transformer)}
   */
  @Test
  @DisplayName(
      "Test new TransformedSortedBag(SortedBag, Transformer); when TreeBag(); then return TreeBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransformedSortedBag.<init>(SortedBag, Transformer)"})
  void testNewTransformedSortedBag_whenTreeBag_thenReturnTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    TransformedSortedBag<Object> actualTransformedSortedBag =
        new TransformedSortedBag<>(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformedSortedBag);
  }
}
