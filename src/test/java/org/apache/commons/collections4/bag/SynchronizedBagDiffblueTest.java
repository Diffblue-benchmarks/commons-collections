package org.apache.commons.collections4.bag;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.SynchronizedBag.SynchronizedBagSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SynchronizedBagDiffblueTest {
  /**
   * Test SynchronizedBagSet {@link SynchronizedBagSet#SynchronizedBagSet(SynchronizedBag, Set, Object)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedBagSet#SynchronizedBagSet(SynchronizedBag, Set, Object)}
   */
  @Test
  @DisplayName("Test SynchronizedBagSet new SynchronizedBagSet(SynchronizedBag, Set, Object); given '42'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedBagSet.<init>(SynchronizedBag, Set, Object)"})
  void testSynchronizedBagSetNewSynchronizedBagSet_given42_thenReturnSizeIsOne() {
    // Arrange
    SynchronizedBag synchronizedBag = mock(SynchronizedBag.class);

    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act and Assert
    assertEquals(1, (synchronizedBag.new SynchronizedBagSet(set, "Lock")).size());
  }

  /**
   * Test SynchronizedBagSet {@link SynchronizedBagSet#SynchronizedBagSet(SynchronizedBag, Set, Object)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedBagSet#SynchronizedBagSet(SynchronizedBag, Set, Object)}
   */
  @Test
  @DisplayName("Test SynchronizedBagSet new SynchronizedBagSet(SynchronizedBag, Set, Object); given two; when HashSet() add two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedBagSet.<init>(SynchronizedBag, Set, Object)"})
  void testSynchronizedBagSetNewSynchronizedBagSet_givenTwo_whenHashSetAddTwo() {
    // Arrange
    SynchronizedBag synchronizedBag = mock(SynchronizedBag.class);

    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act and Assert
    assertEquals(set, synchronizedBag.new SynchronizedBagSet(set, "Lock"));
  }

  /**
   * Test SynchronizedBagSet {@link SynchronizedBagSet#SynchronizedBagSet(SynchronizedBag, Set, Object)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedBagSet#SynchronizedBagSet(SynchronizedBag, Set, Object)}
   */
  @Test
  @DisplayName("Test SynchronizedBagSet new SynchronizedBagSet(SynchronizedBag, Set, Object); when HashSet(); then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedBagSet.<init>(SynchronizedBag, Set, Object)"})
  void testSynchronizedBagSetNewSynchronizedBagSet_whenHashSet_thenReturnHashSet() {
    // Arrange
    SynchronizedBag synchronizedBag = mock(SynchronizedBag.class);
    HashSet<Object> set = new HashSet<>();

    // Act and Assert
    assertEquals(set, synchronizedBag.new SynchronizedBagSet(set, "Lock"));
  }

  /**
   * Test {@link SynchronizedBag#synchronizedBag(Bag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedBag#synchronizedBag(Bag)}
   */
  @Test
  @DisplayName("Test synchronizedBag(Bag); given 'Object'; when HashBag() add 'Object'")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedBag#synchronizedBag(Bag)}
   */
  @Test
  @DisplayName("Test synchronizedBag(Bag); given 'Object'; when HashBag() add 'Object'")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedBag#synchronizedBag(Bag)}
   */
  @Test
  @DisplayName("Test synchronizedBag(Bag); when HashBag()")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedBag#SynchronizedBag(Bag)}
   */
  @Test
  @DisplayName("Test new SynchronizedBag(Bag); given 'Object'; when HashBag() add 'Object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedBag.<init>(Bag)"})
  void testNewSynchronizedBag_givenObject_whenHashBagAddObject() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act and Assert
    assertEquals(bag, new SynchronizedBag<>(bag));
  }

  /**
   * Test {@link SynchronizedBag#SynchronizedBag(Bag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedBag#SynchronizedBag(Bag)}
   */
  @Test
  @DisplayName("Test new SynchronizedBag(Bag); given 'Object'; when HashBag() add 'Object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedBag.<init>(Bag)"})
  void testNewSynchronizedBag_givenObject_whenHashBagAddObject2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act and Assert
    assertEquals(bag, new SynchronizedBag<>(bag));
  }

  /**
   * Test {@link SynchronizedBag#SynchronizedBag(Bag, Object)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then return {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedBag#SynchronizedBag(Bag, Object)}
   */
  @Test
  @DisplayName("Test new SynchronizedBag(Bag, Object); given 'Object'; when HashBag() add 'Object'; then return HashBag()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedBag.<init>(Bag, Object)"})
  void testNewSynchronizedBag_givenObject_whenHashBagAddObject_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act and Assert
    assertEquals(bag, new SynchronizedBag<>(bag, "Lock"));
  }

  /**
   * Test {@link SynchronizedBag#SynchronizedBag(Bag, Object)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then return {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedBag#SynchronizedBag(Bag, Object)}
   */
  @Test
  @DisplayName("Test new SynchronizedBag(Bag, Object); given 'Object'; when HashBag() add 'Object'; then return HashBag()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedBag.<init>(Bag, Object)"})
  void testNewSynchronizedBag_givenObject_whenHashBagAddObject_thenReturnHashBag2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act and Assert
    assertEquals(bag, new SynchronizedBag<>(bag, "Lock"));
  }

  /**
   * Test {@link SynchronizedBag#SynchronizedBag(Bag)}.
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedBag#SynchronizedBag(Bag)}
   */
  @Test
  @DisplayName("Test new SynchronizedBag(Bag); when HashBag()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedBag.<init>(Bag)"})
  void testNewSynchronizedBag_whenHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act and Assert
    assertEquals(bag, new SynchronizedBag<>(bag));
  }

  /**
   * Test {@link SynchronizedBag#SynchronizedBag(Bag, Object)}.
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.</li>
   *   <li>Then return {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedBag#SynchronizedBag(Bag, Object)}
   */
  @Test
  @DisplayName("Test new SynchronizedBag(Bag, Object); when HashBag(); then return HashBag()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedBag.<init>(Bag, Object)"})
  void testNewSynchronizedBag_whenHashBag_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act and Assert
    assertEquals(bag, new SynchronizedBag<>(bag, "Lock"));
  }
}
