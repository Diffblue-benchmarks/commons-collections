package org.apache.commons.collections4.bag;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.collections4.SortedBag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CollectionSortedBagDiffblueTest {
  /**
   * Test {@link CollectionSortedBag#collectionSortedBag(SortedBag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionSortedBag#collectionSortedBag(SortedBag)}
   */
  @Test
  @DisplayName("Test collectionSortedBag(SortedBag); given 'Object'; when TreeBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedBag CollectionSortedBag.collectionSortedBag(SortedBag)"})
  void testCollectionSortedBag_givenObject_whenTreeBagAddObject() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act
    SortedBag<Object> actualCollectionSortedBagResult =
        CollectionSortedBag.collectionSortedBag(bag);

    // Assert
    assertEquals(bag, actualCollectionSortedBagResult);
  }

  /**
   * Test {@link CollectionSortedBag#collectionSortedBag(SortedBag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionSortedBag#collectionSortedBag(SortedBag)}
   */
  @Test
  @DisplayName("Test collectionSortedBag(SortedBag); given 'Object'; when TreeBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedBag CollectionSortedBag.collectionSortedBag(SortedBag)"})
  void testCollectionSortedBag_givenObject_whenTreeBagAddObject2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    SortedBag<Object> actualCollectionSortedBagResult =
        CollectionSortedBag.collectionSortedBag(bag);

    // Assert
    assertEquals(bag, actualCollectionSortedBagResult);
  }

  /**
   * Test {@link CollectionSortedBag#collectionSortedBag(SortedBag)}.
   *
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionSortedBag#collectionSortedBag(SortedBag)}
   */
  @Test
  @DisplayName("Test collectionSortedBag(SortedBag); when TreeBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedBag CollectionSortedBag.collectionSortedBag(SortedBag)"})
  void testCollectionSortedBag_whenTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    SortedBag<Object> actualCollectionSortedBagResult =
        CollectionSortedBag.collectionSortedBag(bag);

    // Assert
    assertEquals(bag, actualCollectionSortedBagResult);
  }

  /**
   * Test {@link CollectionSortedBag#CollectionSortedBag(SortedBag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionSortedBag#CollectionSortedBag(SortedBag)}
   */
  @Test
  @DisplayName(
      "Test new CollectionSortedBag(SortedBag); given 'Object'; when TreeBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CollectionSortedBag.<init>(SortedBag)"})
  void testNewCollectionSortedBag_givenObject_whenTreeBagAddObject() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act
    CollectionSortedBag<Object> actualCollectionSortedBag = new CollectionSortedBag<>(bag);

    // Assert
    assertEquals(bag, actualCollectionSortedBag);
  }

  /**
   * Test {@link CollectionSortedBag#CollectionSortedBag(SortedBag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionSortedBag#CollectionSortedBag(SortedBag)}
   */
  @Test
  @DisplayName(
      "Test new CollectionSortedBag(SortedBag); given 'Object'; when TreeBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CollectionSortedBag.<init>(SortedBag)"})
  void testNewCollectionSortedBag_givenObject_whenTreeBagAddObject2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    CollectionSortedBag<Object> actualCollectionSortedBag = new CollectionSortedBag<>(bag);

    // Assert
    assertEquals(bag, actualCollectionSortedBag);
  }

  /**
   * Test {@link CollectionSortedBag#CollectionSortedBag(SortedBag)}.
   *
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionSortedBag#CollectionSortedBag(SortedBag)}
   */
  @Test
  @DisplayName("Test new CollectionSortedBag(SortedBag); when TreeBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CollectionSortedBag.<init>(SortedBag)"})
  void testNewCollectionSortedBag_whenTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    CollectionSortedBag<Object> actualCollectionSortedBag = new CollectionSortedBag<>(bag);

    // Assert
    assertEquals(bag, actualCollectionSortedBag);
  }

  /**
   * Test {@link CollectionSortedBag#containsAll(Collection)}.
   *
   * <p>Method under test: {@link CollectionSortedBag#containsAll(Collection)}
   */
  @Test
  @DisplayName("Test containsAll(Collection)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionSortedBag.containsAll(Collection)"})
  void testContainsAll() {
    // Arrange
    CollectionSortedBag<Object> collectionSortedBag = new CollectionSortedBag<>(new TreeBag<>());

    // Act and Assert
    assertTrue(collectionSortedBag.containsAll(new ArrayList<>()));
  }
}
