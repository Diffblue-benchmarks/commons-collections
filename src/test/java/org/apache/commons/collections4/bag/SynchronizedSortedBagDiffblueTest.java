package org.apache.commons.collections4.bag;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.SortedBag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SynchronizedSortedBagDiffblueTest {
  /**
   * Test {@link SynchronizedSortedBag#synchronizedSortedBag(SortedBag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link SynchronizedSortedBag#synchronizedSortedBag(SortedBag)}
   */
  @Test
  @DisplayName("Test synchronizedSortedBag(SortedBag); given 'Object'; when TreeBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SynchronizedSortedBag SynchronizedSortedBag.synchronizedSortedBag(SortedBag)"
  })
  void testSynchronizedSortedBag_givenObject_whenTreeBagAddObject() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act
    SynchronizedSortedBag<Object> actualSynchronizedSortedBagResult =
        SynchronizedSortedBag.synchronizedSortedBag(bag);

    // Assert
    assertEquals(bag, actualSynchronizedSortedBagResult);
  }

  /**
   * Test {@link SynchronizedSortedBag#synchronizedSortedBag(SortedBag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link SynchronizedSortedBag#synchronizedSortedBag(SortedBag)}
   */
  @Test
  @DisplayName("Test synchronizedSortedBag(SortedBag); given 'Object'; when TreeBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SynchronizedSortedBag SynchronizedSortedBag.synchronizedSortedBag(SortedBag)"
  })
  void testSynchronizedSortedBag_givenObject_whenTreeBagAddObject2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    SynchronizedSortedBag<Object> actualSynchronizedSortedBagResult =
        SynchronizedSortedBag.synchronizedSortedBag(bag);

    // Assert
    assertEquals(bag, actualSynchronizedSortedBagResult);
  }

  /**
   * Test {@link SynchronizedSortedBag#synchronizedSortedBag(SortedBag)}.
   *
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.
   * </ul>
   *
   * <p>Method under test: {@link SynchronizedSortedBag#synchronizedSortedBag(SortedBag)}
   */
  @Test
  @DisplayName("Test synchronizedSortedBag(SortedBag); when TreeBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SynchronizedSortedBag SynchronizedSortedBag.synchronizedSortedBag(SortedBag)"
  })
  void testSynchronizedSortedBag_whenTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    SynchronizedSortedBag<Object> actualSynchronizedSortedBagResult =
        SynchronizedSortedBag.synchronizedSortedBag(bag);

    // Assert
    assertEquals(bag, actualSynchronizedSortedBagResult);
  }

  /**
   * Test {@link SynchronizedSortedBag#SynchronizedSortedBag(Bag, Object)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link SynchronizedSortedBag#SynchronizedSortedBag(Bag, Object)}
   */
  @Test
  @DisplayName(
      "Test new SynchronizedSortedBag(Bag, Object); given 'Object'; when HashBag() add 'Object'; then return HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SynchronizedSortedBag.<init>(Bag, Object)"})
  void testNewSynchronizedSortedBag_givenObject_whenHashBagAddObject_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    SynchronizedSortedBag<Object> actualSynchronizedSortedBag =
        new SynchronizedSortedBag<>(bag, "Lock");

    // Assert
    assertEquals(bag, actualSynchronizedSortedBag);
  }

  /**
   * Test {@link SynchronizedSortedBag#SynchronizedSortedBag(Bag, Object)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link SynchronizedSortedBag#SynchronizedSortedBag(Bag, Object)}
   */
  @Test
  @DisplayName(
      "Test new SynchronizedSortedBag(Bag, Object); given 'Object'; when HashBag() add 'Object'; then return HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SynchronizedSortedBag.<init>(Bag, Object)"})
  void testNewSynchronizedSortedBag_givenObject_whenHashBagAddObject_thenReturnHashBag2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    SynchronizedSortedBag<Object> actualSynchronizedSortedBag =
        new SynchronizedSortedBag<>(bag, "Lock");

    // Assert
    assertEquals(bag, actualSynchronizedSortedBag);
  }

  /**
   * Test {@link SynchronizedSortedBag#SynchronizedSortedBag(SortedBag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link SynchronizedSortedBag#SynchronizedSortedBag(SortedBag)}
   */
  @Test
  @DisplayName(
      "Test new SynchronizedSortedBag(SortedBag); given 'Object'; when TreeBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SynchronizedSortedBag.<init>(SortedBag)"})
  void testNewSynchronizedSortedBag_givenObject_whenTreeBagAddObject() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act
    SynchronizedSortedBag<Object> actualSynchronizedSortedBag = new SynchronizedSortedBag<>(bag);

    // Assert
    assertEquals(bag, actualSynchronizedSortedBag);
  }

  /**
   * Test {@link SynchronizedSortedBag#SynchronizedSortedBag(SortedBag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link SynchronizedSortedBag#SynchronizedSortedBag(SortedBag)}
   */
  @Test
  @DisplayName(
      "Test new SynchronizedSortedBag(SortedBag); given 'Object'; when TreeBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SynchronizedSortedBag.<init>(SortedBag)"})
  void testNewSynchronizedSortedBag_givenObject_whenTreeBagAddObject2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    SynchronizedSortedBag<Object> actualSynchronizedSortedBag = new SynchronizedSortedBag<>(bag);

    // Assert
    assertEquals(bag, actualSynchronizedSortedBag);
  }

  /**
   * Test {@link SynchronizedSortedBag#SynchronizedSortedBag(Bag, Object)}.
   *
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.
   *   <li>Then return {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link SynchronizedSortedBag#SynchronizedSortedBag(Bag, Object)}
   */
  @Test
  @DisplayName("Test new SynchronizedSortedBag(Bag, Object); when HashBag(); then return HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SynchronizedSortedBag.<init>(Bag, Object)"})
  void testNewSynchronizedSortedBag_whenHashBag_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    SynchronizedSortedBag<Object> actualSynchronizedSortedBag =
        new SynchronizedSortedBag<>(bag, "Lock");

    // Assert
    assertEquals(bag, actualSynchronizedSortedBag);
  }

  /**
   * Test {@link SynchronizedSortedBag#SynchronizedSortedBag(SortedBag)}.
   *
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.
   * </ul>
   *
   * <p>Method under test: {@link SynchronizedSortedBag#SynchronizedSortedBag(SortedBag)}
   */
  @Test
  @DisplayName("Test new SynchronizedSortedBag(SortedBag); when TreeBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SynchronizedSortedBag.<init>(SortedBag)"})
  void testNewSynchronizedSortedBag_whenTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    SynchronizedSortedBag<Object> actualSynchronizedSortedBag = new SynchronizedSortedBag<>(bag);

    // Assert
    assertEquals(bag, actualSynchronizedSortedBag);
  }
}
