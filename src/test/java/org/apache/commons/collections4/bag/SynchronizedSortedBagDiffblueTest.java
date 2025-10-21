package org.apache.commons.collections4.bag;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.SortedBag;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SynchronizedSortedBagDiffblueTest {
  /**
   * Test {@link SynchronizedSortedBag#synchronizedSortedBag(SortedBag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedSortedBag#synchronizedSortedBag(SortedBag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SynchronizedSortedBag SynchronizedSortedBag.synchronizedSortedBag(SortedBag)"})
  public void testSynchronizedSortedBag_givenObject_whenTreeBagAddObject() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act
    SynchronizedSortedBag<Object> actualSynchronizedSortedBagResult = SynchronizedSortedBag.synchronizedSortedBag(bag);

    // Assert
    assertEquals(bag, actualSynchronizedSortedBagResult);
  }

  /**
   * Test {@link SynchronizedSortedBag#synchronizedSortedBag(SortedBag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedSortedBag#synchronizedSortedBag(SortedBag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SynchronizedSortedBag SynchronizedSortedBag.synchronizedSortedBag(SortedBag)"})
  public void testSynchronizedSortedBag_givenObject_whenTreeBagAddObject2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    SynchronizedSortedBag<Object> actualSynchronizedSortedBagResult = SynchronizedSortedBag.synchronizedSortedBag(bag);

    // Assert
    assertEquals(bag, actualSynchronizedSortedBagResult);
  }

  /**
   * Test {@link SynchronizedSortedBag#synchronizedSortedBag(SortedBag)}.
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedSortedBag#synchronizedSortedBag(SortedBag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SynchronizedSortedBag SynchronizedSortedBag.synchronizedSortedBag(SortedBag)"})
  public void testSynchronizedSortedBag_whenTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    SynchronizedSortedBag<Object> actualSynchronizedSortedBagResult = SynchronizedSortedBag.synchronizedSortedBag(bag);

    // Assert
    assertEquals(bag, actualSynchronizedSortedBagResult);
  }

  /**
   * Test {@link SynchronizedSortedBag#SynchronizedSortedBag(Bag, Object)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then return {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedSortedBag#SynchronizedSortedBag(Bag, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedSortedBag.<init>(Bag, Object)"})
  public void testNewSynchronizedSortedBag_givenObject_whenHashBagAddObject_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act and Assert
    assertEquals(bag, new SynchronizedSortedBag<>(bag, "Lock"));
  }

  /**
   * Test {@link SynchronizedSortedBag#SynchronizedSortedBag(Bag, Object)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then return {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedSortedBag#SynchronizedSortedBag(Bag, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedSortedBag.<init>(Bag, Object)"})
  public void testNewSynchronizedSortedBag_givenObject_whenHashBagAddObject_thenReturnHashBag2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act and Assert
    assertEquals(bag, new SynchronizedSortedBag<>(bag, "Lock"));
  }

  /**
   * Test {@link SynchronizedSortedBag#SynchronizedSortedBag(SortedBag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedSortedBag#SynchronizedSortedBag(SortedBag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedSortedBag.<init>(SortedBag)"})
  public void testNewSynchronizedSortedBag_givenObject_whenTreeBagAddObject() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act and Assert
    assertEquals(bag, new SynchronizedSortedBag<>(bag));
  }

  /**
   * Test {@link SynchronizedSortedBag#SynchronizedSortedBag(SortedBag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedSortedBag#SynchronizedSortedBag(SortedBag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedSortedBag.<init>(SortedBag)"})
  public void testNewSynchronizedSortedBag_givenObject_whenTreeBagAddObject2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act and Assert
    assertEquals(bag, new SynchronizedSortedBag<>(bag));
  }

  /**
   * Test {@link SynchronizedSortedBag#SynchronizedSortedBag(Bag, Object)}.
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.</li>
   *   <li>Then return {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedSortedBag#SynchronizedSortedBag(Bag, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedSortedBag.<init>(Bag, Object)"})
  public void testNewSynchronizedSortedBag_whenHashBag_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act and Assert
    assertEquals(bag, new SynchronizedSortedBag<>(bag, "Lock"));
  }

  /**
   * Test {@link SynchronizedSortedBag#SynchronizedSortedBag(SortedBag)}.
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedSortedBag#SynchronizedSortedBag(SortedBag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedSortedBag.<init>(SortedBag)"})
  public void testNewSynchronizedSortedBag_whenTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act and Assert
    assertEquals(bag, new SynchronizedSortedBag<>(bag));
  }
}
