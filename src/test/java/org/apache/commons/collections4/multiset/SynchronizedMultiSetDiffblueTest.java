package org.apache.commons.collections4.multiset;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.multiset.SynchronizedMultiSet.SynchronizedSet;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SynchronizedMultiSetDiffblueTest {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SynchronizedMultiSet SynchronizedMultiSet.synchronizedMultiSet(MultiSet)"})
  public void testSynchronizedMultiSet_givenObject_whenHashMultiSetAddObject() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SynchronizedMultiSet SynchronizedMultiSet.synchronizedMultiSet(MultiSet)"})
  public void testSynchronizedMultiSet_givenObject_whenHashMultiSetAddObject2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SynchronizedMultiSet SynchronizedMultiSet.synchronizedMultiSet(MultiSet)"})
  public void testSynchronizedMultiSet_whenHashMultiSet() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedMultiSet.<init>(MultiSet)"})
  public void testNewSynchronizedMultiSet_givenObject_whenHashMultiSetAddObject() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedMultiSet.<init>(MultiSet)"})
  public void testNewSynchronizedMultiSet_givenObject_whenHashMultiSetAddObject2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedMultiSet.<init>(MultiSet, Object)"})
  public void testNewSynchronizedMultiSet_givenObject_whenHashMultiSetAddObject3() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedMultiSet.<init>(MultiSet, Object)"})
  public void testNewSynchronizedMultiSet_givenObject_whenHashMultiSetAddObject4() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedMultiSet.<init>(MultiSet)"})
  public void testNewSynchronizedMultiSet_whenHashMultiSet() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedMultiSet.<init>(MultiSet, Object)"})
  public void testNewSynchronizedMultiSet_whenHashMultiSet_thenReturnHashMultiSet() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedSet.<init>(Set, Object)"})
  public void testSynchronizedSetNewSynchronizedSet_given42_whenHashSetAdd42_thenReturnHashSet() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedSet.<init>(Set, Object)"})
  public void testSynchronizedSetNewSynchronizedSet_givenTwo_whenHashSetAddTwo() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedSet.<init>(Set, Object)"})
  public void testSynchronizedSetNewSynchronizedSet_whenHashSet_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    // Act and Assert
    assertEquals(set, new SynchronizedSet<>(set, "Lock"));
  }
}
