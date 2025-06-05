package org.apache.commons.collections4.bag;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.SortedBag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CollectionSortedBagDiffblueTest {
  /**
   * Test {@link CollectionSortedBag#collectionSortedBag(SortedBag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionSortedBag#collectionSortedBag(SortedBag)}
   */
  @Test
  @DisplayName("Test collectionSortedBag(SortedBag); given 'Object'; when TreeBag() add 'Object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedBag CollectionSortedBag.collectionSortedBag(SortedBag)"})
  void testCollectionSortedBag_givenObject_whenTreeBagAddObject() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act
    SortedBag<Object> actualCollectionSortedBagResult = CollectionSortedBag.collectionSortedBag(bag);

    // Assert
    assertEquals(bag, actualCollectionSortedBagResult);
  }

  /**
   * Test {@link CollectionSortedBag#collectionSortedBag(SortedBag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionSortedBag#collectionSortedBag(SortedBag)}
   */
  @Test
  @DisplayName("Test collectionSortedBag(SortedBag); given 'Object'; when TreeBag() add 'Object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedBag CollectionSortedBag.collectionSortedBag(SortedBag)"})
  void testCollectionSortedBag_givenObject_whenTreeBagAddObject2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    SortedBag<Object> actualCollectionSortedBagResult = CollectionSortedBag.collectionSortedBag(bag);

    // Assert
    assertEquals(bag, actualCollectionSortedBagResult);
  }

  /**
   * Test {@link CollectionSortedBag#collectionSortedBag(SortedBag)}.
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionSortedBag#collectionSortedBag(SortedBag)}
   */
  @Test
  @DisplayName("Test collectionSortedBag(SortedBag); when TreeBag()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedBag CollectionSortedBag.collectionSortedBag(SortedBag)"})
  void testCollectionSortedBag_whenTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    SortedBag<Object> actualCollectionSortedBagResult = CollectionSortedBag.collectionSortedBag(bag);

    // Assert
    assertEquals(bag, actualCollectionSortedBagResult);
  }

  /**
   * Test {@link CollectionSortedBag#CollectionSortedBag(SortedBag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionSortedBag#CollectionSortedBag(SortedBag)}
   */
  @Test
  @DisplayName("Test new CollectionSortedBag(SortedBag); given 'Object'; when TreeBag() add 'Object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CollectionSortedBag.<init>(SortedBag)"})
  void testNewCollectionSortedBag_givenObject_whenTreeBagAddObject() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act and Assert
    assertEquals(bag, new CollectionSortedBag<>(bag));
  }

  /**
   * Test {@link CollectionSortedBag#CollectionSortedBag(SortedBag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionSortedBag#CollectionSortedBag(SortedBag)}
   */
  @Test
  @DisplayName("Test new CollectionSortedBag(SortedBag); given 'Object'; when TreeBag() add 'Object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CollectionSortedBag.<init>(SortedBag)"})
  void testNewCollectionSortedBag_givenObject_whenTreeBagAddObject2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act and Assert
    assertEquals(bag, new CollectionSortedBag<>(bag));
  }

  /**
   * Test {@link CollectionSortedBag#CollectionSortedBag(SortedBag)}.
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionSortedBag#CollectionSortedBag(SortedBag)}
   */
  @Test
  @DisplayName("Test new CollectionSortedBag(SortedBag); when TreeBag()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CollectionSortedBag.<init>(SortedBag)"})
  void testNewCollectionSortedBag_whenTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act and Assert
    assertEquals(bag, new CollectionSortedBag<>(bag));
  }
}
