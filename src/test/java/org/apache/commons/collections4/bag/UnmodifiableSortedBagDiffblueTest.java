package org.apache.commons.collections4.bag;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.SortedBag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnmodifiableSortedBagDiffblueTest {
  /**
   * Test {@link UnmodifiableSortedBag#unmodifiableSortedBag(SortedBag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableSortedBag#unmodifiableSortedBag(SortedBag)}
   */
  @Test
  @DisplayName("Test unmodifiableSortedBag(SortedBag); given 'Object'; when TreeBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedBag UnmodifiableSortedBag.unmodifiableSortedBag(SortedBag)"})
  void testUnmodifiableSortedBag_givenObject_whenTreeBagAddObject() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act
    SortedBag<Object> actualUnmodifiableSortedBagResult =
        UnmodifiableSortedBag.unmodifiableSortedBag(bag);

    // Assert
    assertEquals(bag, actualUnmodifiableSortedBagResult);
  }

  /**
   * Test {@link UnmodifiableSortedBag#unmodifiableSortedBag(SortedBag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableSortedBag#unmodifiableSortedBag(SortedBag)}
   */
  @Test
  @DisplayName("Test unmodifiableSortedBag(SortedBag); given 'Object'; when TreeBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedBag UnmodifiableSortedBag.unmodifiableSortedBag(SortedBag)"})
  void testUnmodifiableSortedBag_givenObject_whenTreeBagAddObject2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    SortedBag<Object> actualUnmodifiableSortedBagResult =
        UnmodifiableSortedBag.unmodifiableSortedBag(bag);

    // Assert
    assertEquals(bag, actualUnmodifiableSortedBagResult);
  }

  /**
   * Test {@link UnmodifiableSortedBag#unmodifiableSortedBag(SortedBag)}.
   *
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableSortedBag#unmodifiableSortedBag(SortedBag)}
   */
  @Test
  @DisplayName("Test unmodifiableSortedBag(SortedBag); when TreeBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedBag UnmodifiableSortedBag.unmodifiableSortedBag(SortedBag)"})
  void testUnmodifiableSortedBag_whenTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    SortedBag<Object> actualUnmodifiableSortedBagResult =
        UnmodifiableSortedBag.unmodifiableSortedBag(bag);

    // Assert
    assertEquals(bag, actualUnmodifiableSortedBagResult);
  }
}
