package org.apache.commons.collections4.bag;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Bag;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SynchronizedBagDiffblueTest {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SynchronizedBag SynchronizedBag.synchronizedBag(Bag)"})
  public void testSynchronizedBag_givenObject_whenHashBagAddObject() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SynchronizedBag SynchronizedBag.synchronizedBag(Bag)"})
  public void testSynchronizedBag_givenObject_whenHashBagAddObject2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SynchronizedBag SynchronizedBag.synchronizedBag(Bag)"})
  public void testSynchronizedBag_whenHashBag() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedBag.<init>(Bag)"})
  public void testNewSynchronizedBag_givenObject_whenHashBagAddObject() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedBag.<init>(Bag)"})
  public void testNewSynchronizedBag_givenObject_whenHashBagAddObject2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedBag.<init>(Bag, Object)"})
  public void testNewSynchronizedBag_givenObject_whenHashBagAddObject_thenReturnHashBag() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedBag.<init>(Bag, Object)"})
  public void testNewSynchronizedBag_givenObject_whenHashBagAddObject_thenReturnHashBag2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedBag.<init>(Bag)"})
  public void testNewSynchronizedBag_whenHashBag() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedBag.<init>(Bag, Object)"})
  public void testNewSynchronizedBag_whenHashBag_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act and Assert
    assertEquals(bag, new SynchronizedBag<>(bag, "Lock"));
  }
}
