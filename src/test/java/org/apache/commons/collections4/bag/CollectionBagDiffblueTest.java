package org.apache.commons.collections4.bag;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Bag;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CollectionBagDiffblueTest {
  /**
   * Test {@link CollectionBag#collectionBag(Bag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionBag#collectionBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag CollectionBag.collectionBag(Bag)"})
  public void testCollectionBag_givenObject_whenHashBagAddObject() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    Bag<Object> actualCollectionBagResult = CollectionBag.collectionBag(bag);

    // Assert
    assertEquals(bag, actualCollectionBagResult);
  }

  /**
   * Test {@link CollectionBag#collectionBag(Bag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionBag#collectionBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag CollectionBag.collectionBag(Bag)"})
  public void testCollectionBag_givenObject_whenHashBagAddObject2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    Bag<Object> actualCollectionBagResult = CollectionBag.collectionBag(bag);

    // Assert
    assertEquals(bag, actualCollectionBagResult);
  }

  /**
   * Test {@link CollectionBag#collectionBag(Bag)}.
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionBag#collectionBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag CollectionBag.collectionBag(Bag)"})
  public void testCollectionBag_whenHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualCollectionBagResult = CollectionBag.collectionBag(bag);

    // Assert
    assertEquals(bag, actualCollectionBagResult);
  }

  /**
   * Test {@link CollectionBag#CollectionBag(Bag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionBag#CollectionBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CollectionBag.<init>(Bag)"})
  public void testNewCollectionBag_givenObject_whenHashBagAddObject() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act and Assert
    assertEquals(bag, new CollectionBag<>(bag));
  }

  /**
   * Test {@link CollectionBag#CollectionBag(Bag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionBag#CollectionBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CollectionBag.<init>(Bag)"})
  public void testNewCollectionBag_givenObject_whenHashBagAddObject2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act and Assert
    assertEquals(bag, new CollectionBag<>(bag));
  }

  /**
   * Test {@link CollectionBag#CollectionBag(Bag)}.
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionBag#CollectionBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CollectionBag.<init>(Bag)"})
  public void testNewCollectionBag_whenHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act and Assert
    assertEquals(bag, new CollectionBag<>(bag));
  }
}
