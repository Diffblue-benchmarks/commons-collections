package org.apache.commons.collections4.bag;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Bag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnmodifiableBagDiffblueTest {
  /**
   * Test {@link UnmodifiableBag#unmodifiableBag(Bag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableBag#unmodifiableBag(Bag)}
   */
  @Test
  @DisplayName("Test unmodifiableBag(Bag); given 'Object'; when HashBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag UnmodifiableBag.unmodifiableBag(Bag)"})
  void testUnmodifiableBag_givenObject_whenHashBagAddObject() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    Bag<Object> actualUnmodifiableBagResult = UnmodifiableBag.unmodifiableBag(bag);

    // Assert
    assertEquals(bag, actualUnmodifiableBagResult);
  }

  /**
   * Test {@link UnmodifiableBag#unmodifiableBag(Bag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableBag#unmodifiableBag(Bag)}
   */
  @Test
  @DisplayName("Test unmodifiableBag(Bag); given 'Object'; when HashBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag UnmodifiableBag.unmodifiableBag(Bag)"})
  void testUnmodifiableBag_givenObject_whenHashBagAddObject2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    Bag<Object> actualUnmodifiableBagResult = UnmodifiableBag.unmodifiableBag(bag);

    // Assert
    assertEquals(bag, actualUnmodifiableBagResult);
  }

  /**
   * Test {@link UnmodifiableBag#unmodifiableBag(Bag)}.
   *
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableBag#unmodifiableBag(Bag)}
   */
  @Test
  @DisplayName("Test unmodifiableBag(Bag); when HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag UnmodifiableBag.unmodifiableBag(Bag)"})
  void testUnmodifiableBag_whenHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualUnmodifiableBagResult = UnmodifiableBag.unmodifiableBag(bag);

    // Assert
    assertEquals(bag, actualUnmodifiableBagResult);
  }
}
