package org.apache.commons.collections4.bag;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Bag;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UnmodifiableBagDiffblueTest {
  /**
   * Test {@link UnmodifiableBag#unmodifiableBag(Bag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableBag#unmodifiableBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag UnmodifiableBag.unmodifiableBag(Bag)"})
  public void testUnmodifiableBag_givenObject_whenHashBagAddObject() {
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
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableBag#unmodifiableBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag UnmodifiableBag.unmodifiableBag(Bag)"})
  public void testUnmodifiableBag_givenObject_whenHashBagAddObject2() {
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
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableBag#unmodifiableBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag UnmodifiableBag.unmodifiableBag(Bag)"})
  public void testUnmodifiableBag_whenHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualUnmodifiableBagResult = UnmodifiableBag.unmodifiableBag(bag);

    // Assert
    assertEquals(bag, actualUnmodifiableBagResult);
  }
}
