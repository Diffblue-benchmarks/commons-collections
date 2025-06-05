package org.apache.commons.collections4.multiset;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.multiset.SynchronizedMultiSet.SynchronizedSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SynchronizedMultiSetDiffblueTest {
  /**
   * Test {@link SynchronizedMultiSet#synchronizedMultiSet(MultiSet)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedMultiSet#synchronizedMultiSet(MultiSet)}
   */
  @Test
  @DisplayName("Test synchronizedMultiSet(MultiSet); given 'Object'; when HashMultiSet() add 'Object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SynchronizedMultiSet SynchronizedMultiSet.synchronizedMultiSet(MultiSet)"})
  void testSynchronizedMultiSet_givenObject_whenHashMultiSetAddObject() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");

    // Act
    SynchronizedMultiSet<Object> actualSynchronizedMultiSetResult = SynchronizedMultiSet.synchronizedMultiSet(multiset);

    // Assert
    assertEquals(multiset, actualSynchronizedMultiSetResult);
  }

  /**
   * Test {@link SynchronizedMultiSet#synchronizedMultiSet(MultiSet)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedMultiSet#synchronizedMultiSet(MultiSet)}
   */
  @Test
  @DisplayName("Test synchronizedMultiSet(MultiSet); given 'Object'; when HashMultiSet() add 'Object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SynchronizedMultiSet SynchronizedMultiSet.synchronizedMultiSet(MultiSet)"})
  void testSynchronizedMultiSet_givenObject_whenHashMultiSetAddObject2() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");
    multiset.add("Object");

    // Act
    SynchronizedMultiSet<Object> actualSynchronizedMultiSetResult = SynchronizedMultiSet.synchronizedMultiSet(multiset);

    // Assert
    assertEquals(multiset, actualSynchronizedMultiSetResult);
  }

  /**
   * Test {@link SynchronizedMultiSet#synchronizedMultiSet(MultiSet)}.
   * <ul>
   *   <li>When {@link HashMultiSet#HashMultiSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedMultiSet#synchronizedMultiSet(MultiSet)}
   */
  @Test
  @DisplayName("Test synchronizedMultiSet(MultiSet); when HashMultiSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SynchronizedMultiSet SynchronizedMultiSet.synchronizedMultiSet(MultiSet)"})
  void testSynchronizedMultiSet_whenHashMultiSet() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();

    // Act
    SynchronizedMultiSet<Object> actualSynchronizedMultiSetResult = SynchronizedMultiSet.synchronizedMultiSet(multiset);

    // Assert
    assertEquals(multiset, actualSynchronizedMultiSetResult);
  }

  /**
   * Test {@link SynchronizedMultiSet#SynchronizedMultiSet(MultiSet)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedMultiSet#SynchronizedMultiSet(MultiSet)}
   */
  @Test
  @DisplayName("Test new SynchronizedMultiSet(MultiSet); given 'Object'; when HashMultiSet() add 'Object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedMultiSet.<init>(MultiSet)"})
  void testNewSynchronizedMultiSet_givenObject_whenHashMultiSetAddObject() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");

    // Act and Assert
    assertEquals(multiset, new SynchronizedMultiSet<>(multiset));
  }

  /**
   * Test {@link SynchronizedMultiSet#SynchronizedMultiSet(MultiSet)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedMultiSet#SynchronizedMultiSet(MultiSet)}
   */
  @Test
  @DisplayName("Test new SynchronizedMultiSet(MultiSet); given 'Object'; when HashMultiSet() add 'Object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedMultiSet.<init>(MultiSet)"})
  void testNewSynchronizedMultiSet_givenObject_whenHashMultiSetAddObject2() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");
    multiset.add("Object");

    // Act and Assert
    assertEquals(multiset, new SynchronizedMultiSet<>(multiset));
  }

  /**
   * Test {@link SynchronizedMultiSet#SynchronizedMultiSet(MultiSet, Object)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedMultiSet#SynchronizedMultiSet(MultiSet, Object)}
   */
  @Test
  @DisplayName("Test new SynchronizedMultiSet(MultiSet, Object); given 'Object'; when HashMultiSet() add 'Object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedMultiSet.<init>(MultiSet, Object)"})
  void testNewSynchronizedMultiSet_givenObject_whenHashMultiSetAddObject3() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");

    // Act and Assert
    assertEquals(multiset, new SynchronizedMultiSet<>(multiset, "Lock"));
  }

  /**
   * Test {@link SynchronizedMultiSet#SynchronizedMultiSet(MultiSet, Object)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedMultiSet#SynchronizedMultiSet(MultiSet, Object)}
   */
  @Test
  @DisplayName("Test new SynchronizedMultiSet(MultiSet, Object); given 'Object'; when HashMultiSet() add 'Object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedMultiSet.<init>(MultiSet, Object)"})
  void testNewSynchronizedMultiSet_givenObject_whenHashMultiSetAddObject4() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");
    multiset.add("Object");

    // Act and Assert
    assertEquals(multiset, new SynchronizedMultiSet<>(multiset, "Lock"));
  }

  /**
   * Test {@link SynchronizedMultiSet#SynchronizedMultiSet(MultiSet)}.
   * <ul>
   *   <li>When {@link HashMultiSet#HashMultiSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedMultiSet#SynchronizedMultiSet(MultiSet)}
   */
  @Test
  @DisplayName("Test new SynchronizedMultiSet(MultiSet); when HashMultiSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedMultiSet.<init>(MultiSet)"})
  void testNewSynchronizedMultiSet_whenHashMultiSet() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();

    // Act and Assert
    assertEquals(multiset, new SynchronizedMultiSet<>(multiset));
  }

  /**
   * Test {@link SynchronizedMultiSet#SynchronizedMultiSet(MultiSet, Object)}.
   * <ul>
   *   <li>When {@link HashMultiSet#HashMultiSet()}.</li>
   *   <li>Then return {@link HashMultiSet#HashMultiSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedMultiSet#SynchronizedMultiSet(MultiSet, Object)}
   */
  @Test
  @DisplayName("Test new SynchronizedMultiSet(MultiSet, Object); when HashMultiSet(); then return HashMultiSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedMultiSet.<init>(MultiSet, Object)"})
  void testNewSynchronizedMultiSet_whenHashMultiSet_thenReturnHashMultiSet() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();

    // Act and Assert
    assertEquals(multiset, new SynchronizedMultiSet<>(multiset, "Lock"));
  }

  /**
   * Test SynchronizedSet {@link SynchronizedSet#SynchronizedSet(Set, Object)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedSet#SynchronizedSet(Set, Object)}
   */
  @Test
  @DisplayName("Test SynchronizedSet new SynchronizedSet(Set, Object); given '42'; when HashSet() add '42'; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedSet.<init>(Set, Object)"})
  void testSynchronizedSetNewSynchronizedSet_given42_whenHashSetAdd42_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act and Assert
    assertEquals(set, new SynchronizedSet<>(set, "Lock"));
  }

  /**
   * Test SynchronizedSet {@link SynchronizedSet#SynchronizedSet(Set, Object)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedSet#SynchronizedSet(Set, Object)}
   */
  @Test
  @DisplayName("Test SynchronizedSet new SynchronizedSet(Set, Object); given two; when HashSet() add two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedSet.<init>(Set, Object)"})
  void testSynchronizedSetNewSynchronizedSet_givenTwo_whenHashSetAddTwo() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act and Assert
    assertEquals(set, new SynchronizedSet<>(set, "Lock"));
  }

  /**
   * Test SynchronizedSet {@link SynchronizedSet#SynchronizedSet(Set, Object)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedSet#SynchronizedSet(Set, Object)}
   */
  @Test
  @DisplayName("Test SynchronizedSet new SynchronizedSet(Set, Object); when HashSet(); then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedSet.<init>(Set, Object)"})
  void testSynchronizedSetNewSynchronizedSet_whenHashSet_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    // Act and Assert
    assertEquals(set, new SynchronizedSet<>(set, "Lock"));
  }
}
