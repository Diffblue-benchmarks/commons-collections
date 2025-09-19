package org.apache.commons.collections4.bag;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Bag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SynchronizedBagDiffblueTest {
  /**
   * Test {@link SynchronizedBag#synchronizedBag(Bag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link SynchronizedBag#synchronizedBag(Bag)}
   */
  @Test
  @DisplayName("Test synchronizedBag(Bag); given 'Object'; when HashBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SynchronizedBag SynchronizedBag.synchronizedBag(Bag)"})
  void testSynchronizedBag_givenObject_whenHashBagAddObject() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    SynchronizedBag<Object> actualSynchronizedBagResult = SynchronizedBag.synchronizedBag(bag);

    // Assert
    assertEquals(bag, actualSynchronizedBagResult);
  }

  /**
   * Test {@link SynchronizedBag#synchronizedBag(Bag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link SynchronizedBag#synchronizedBag(Bag)}
   */
  @Test
  @DisplayName("Test synchronizedBag(Bag); given 'Object'; when HashBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SynchronizedBag SynchronizedBag.synchronizedBag(Bag)"})
  void testSynchronizedBag_givenObject_whenHashBagAddObject2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    SynchronizedBag<Object> actualSynchronizedBagResult = SynchronizedBag.synchronizedBag(bag);

    // Assert
    assertEquals(bag, actualSynchronizedBagResult);
  }

  /**
   * Test {@link SynchronizedBag#synchronizedBag(Bag)}.
   *
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link SynchronizedBag#synchronizedBag(Bag)}
   */
  @Test
  @DisplayName("Test synchronizedBag(Bag); when HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SynchronizedBag SynchronizedBag.synchronizedBag(Bag)"})
  void testSynchronizedBag_whenHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    SynchronizedBag<Object> actualSynchronizedBagResult = SynchronizedBag.synchronizedBag(bag);

    // Assert
    assertEquals(bag, actualSynchronizedBagResult);
  }

  /**
   * Test {@link SynchronizedBag#SynchronizedBag(Bag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link SynchronizedBag#SynchronizedBag(Bag)}
   */
  @Test
  @DisplayName("Test new SynchronizedBag(Bag); given 'Object'; when HashBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SynchronizedBag.<init>(Bag)"})
  void testNewSynchronizedBag_givenObject_whenHashBagAddObject() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    SynchronizedBag<Object> actualSynchronizedBag = new SynchronizedBag<>(bag);

    // Assert
    assertEquals(bag, actualSynchronizedBag);
  }

  /**
   * Test {@link SynchronizedBag#SynchronizedBag(Bag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link SynchronizedBag#SynchronizedBag(Bag)}
   */
  @Test
  @DisplayName("Test new SynchronizedBag(Bag); given 'Object'; when HashBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SynchronizedBag.<init>(Bag)"})
  void testNewSynchronizedBag_givenObject_whenHashBagAddObject2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    SynchronizedBag<Object> actualSynchronizedBag = new SynchronizedBag<>(bag);

    // Assert
    assertEquals(bag, actualSynchronizedBag);
  }

  /**
   * Test {@link SynchronizedBag#SynchronizedBag(Bag, Object)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link SynchronizedBag#SynchronizedBag(Bag, Object)}
   */
  @Test
  @DisplayName(
      "Test new SynchronizedBag(Bag, Object); given 'Object'; when HashBag() add 'Object'; then return HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SynchronizedBag.<init>(Bag, Object)"})
  void testNewSynchronizedBag_givenObject_whenHashBagAddObject_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    SynchronizedBag<Object> actualSynchronizedBag = new SynchronizedBag<>(bag, "Lock");

    // Assert
    assertEquals(bag, actualSynchronizedBag);
  }

  /**
   * Test {@link SynchronizedBag#SynchronizedBag(Bag, Object)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link SynchronizedBag#SynchronizedBag(Bag, Object)}
   */
  @Test
  @DisplayName(
      "Test new SynchronizedBag(Bag, Object); given 'Object'; when HashBag() add 'Object'; then return HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SynchronizedBag.<init>(Bag, Object)"})
  void testNewSynchronizedBag_givenObject_whenHashBagAddObject_thenReturnHashBag2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    SynchronizedBag<Object> actualSynchronizedBag = new SynchronizedBag<>(bag, "Lock");

    // Assert
    assertEquals(bag, actualSynchronizedBag);
  }

  /**
   * Test {@link SynchronizedBag#SynchronizedBag(Bag)}.
   *
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link SynchronizedBag#SynchronizedBag(Bag)}
   */
  @Test
  @DisplayName("Test new SynchronizedBag(Bag); when HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SynchronizedBag.<init>(Bag)"})
  void testNewSynchronizedBag_whenHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    SynchronizedBag<Object> actualSynchronizedBag = new SynchronizedBag<>(bag);

    // Assert
    assertEquals(bag, actualSynchronizedBag);
  }

  /**
   * Test {@link SynchronizedBag#SynchronizedBag(Bag, Object)}.
   *
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.
   *   <li>Then return {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link SynchronizedBag#SynchronizedBag(Bag, Object)}
   */
  @Test
  @DisplayName("Test new SynchronizedBag(Bag, Object); when HashBag(); then return HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SynchronizedBag.<init>(Bag, Object)"})
  void testNewSynchronizedBag_whenHashBag_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    SynchronizedBag<Object> actualSynchronizedBag = new SynchronizedBag<>(bag, "Lock");

    // Assert
    assertEquals(bag, actualSynchronizedBag);
  }
}
