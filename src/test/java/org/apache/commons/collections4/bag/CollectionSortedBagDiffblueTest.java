package org.apache.commons.collections4.bag;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.SortedBag;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CollectionSortedBagDiffblueTest {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedBag CollectionSortedBag.collectionSortedBag(SortedBag)"})
  public void testCollectionSortedBag_givenObject_whenTreeBagAddObject() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedBag CollectionSortedBag.collectionSortedBag(SortedBag)"})
  public void testCollectionSortedBag_givenObject_whenTreeBagAddObject2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedBag CollectionSortedBag.collectionSortedBag(SortedBag)"})
  public void testCollectionSortedBag_whenTreeBag() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CollectionSortedBag.<init>(SortedBag)"})
  public void testNewCollectionSortedBag_givenObject_whenTreeBagAddObject() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CollectionSortedBag.<init>(SortedBag)"})
  public void testNewCollectionSortedBag_givenObject_whenTreeBagAddObject2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CollectionSortedBag.<init>(SortedBag)"})
  public void testNewCollectionSortedBag_whenTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act and Assert
    assertEquals(bag, new CollectionSortedBag<>(bag));
  }
}
