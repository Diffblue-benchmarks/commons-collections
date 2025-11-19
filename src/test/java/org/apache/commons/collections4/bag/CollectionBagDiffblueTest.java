package org.apache.commons.collections4.bag;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.collections4.Bag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CollectionBagDiffblueTest {
  /**
   * Test {@link CollectionBag#collectionBag(Bag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionBag#collectionBag(Bag)}
   */
  @Test
  @DisplayName("Test collectionBag(Bag); given 'Object'; when HashBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag CollectionBag.collectionBag(Bag)"})
  void testCollectionBag_givenObject_whenHashBagAddObject() {
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
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionBag#collectionBag(Bag)}
   */
  @Test
  @DisplayName("Test collectionBag(Bag); given 'Object'; when HashBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag CollectionBag.collectionBag(Bag)"})
  void testCollectionBag_givenObject_whenHashBagAddObject2() {
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
   *
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionBag#collectionBag(Bag)}
   */
  @Test
  @DisplayName("Test collectionBag(Bag); when HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag CollectionBag.collectionBag(Bag)"})
  void testCollectionBag_whenHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualCollectionBagResult = CollectionBag.collectionBag(bag);

    // Assert
    assertEquals(bag, actualCollectionBagResult);
  }

  /**
   * Test {@link CollectionBag#CollectionBag(Bag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionBag#CollectionBag(Bag)}
   */
  @Test
  @DisplayName("Test new CollectionBag(Bag); given 'Object'; when HashBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CollectionBag.<init>(Bag)"})
  void testNewCollectionBag_givenObject_whenHashBagAddObject() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    CollectionBag<Object> actualCollectionBag = new CollectionBag<>(bag);

    // Assert
    assertEquals(bag, actualCollectionBag);
  }

  /**
   * Test {@link CollectionBag#CollectionBag(Bag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionBag#CollectionBag(Bag)}
   */
  @Test
  @DisplayName("Test new CollectionBag(Bag); given 'Object'; when HashBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CollectionBag.<init>(Bag)"})
  void testNewCollectionBag_givenObject_whenHashBagAddObject2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    CollectionBag<Object> actualCollectionBag = new CollectionBag<>(bag);

    // Assert
    assertEquals(bag, actualCollectionBag);
  }

  /**
   * Test {@link CollectionBag#CollectionBag(Bag)}.
   *
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionBag#CollectionBag(Bag)}
   */
  @Test
  @DisplayName("Test new CollectionBag(Bag); when HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CollectionBag.<init>(Bag)"})
  void testNewCollectionBag_whenHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    CollectionBag<Object> actualCollectionBag = new CollectionBag<>(bag);

    // Assert
    assertEquals(bag, actualCollectionBag);
  }

  /**
   * Test {@link CollectionBag#containsAll(Collection)}.
   *
   * <p>Method under test: {@link CollectionBag#containsAll(Collection)}
   */
  @Test
  @DisplayName("Test containsAll(Collection)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionBag.containsAll(Collection)"})
  void testContainsAll() {
    // Arrange
    CollectionBag<Object> collectionBag = new CollectionBag<>(new HashBag<>());

    // Act and Assert
    assertTrue(collectionBag.containsAll(new ArrayList<>()));
  }
}
