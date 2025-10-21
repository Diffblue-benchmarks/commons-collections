package org.apache.commons.collections4.bag;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class HashBagDiffblueTest {
  /**
   * Test {@link HashBag#HashBag()}.
   * <p>
   * Method under test: {@link HashBag#HashBag()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void HashBag.<init>()"})
  public void testNewHashBag() {
    // Arrange and Act
    HashBag<Object> actualHashBag = new HashBag<>();

    // Assert
    assertTrue(actualHashBag.isEmpty());
  }

  /**
   * Test {@link HashBag#HashBag(Iterable)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashBag#HashBag(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void HashBag.<init>(Iterable)"})
  public void testNewHashBag_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act
    HashBag<Object> actualHashBag = new HashBag<>((Iterable<?>) iterable);

    // Assert
    assertEquals(1, actualHashBag.size());
  }

  /**
   * Test {@link HashBag#HashBag(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashBag#HashBag(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void HashBag.<init>(Collection)"})
  public void testNewHashBag_given42_whenArrayListAdd42_thenReturnSizeIsOne2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    HashBag<Object> actualHashBag = new HashBag<>(collection);

    // Assert
    assertEquals(1, actualHashBag.size());
  }

  /**
   * Test {@link HashBag#HashBag(Iterable)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashBag#HashBag(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void HashBag.<init>(Iterable)"})
  public void testNewHashBag_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    // Act
    HashBag<Object> actualHashBag = new HashBag<>((Iterable<?>) iterable);

    // Assert
    assertEquals(2, actualHashBag.size());
  }

  /**
   * Test {@link HashBag#HashBag(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashBag#HashBag(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void HashBag.<init>(Collection)"})
  public void testNewHashBag_given42_whenArrayListAdd42_thenReturnSizeIsTwo2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    HashBag<Object> actualHashBag = new HashBag<>(collection);

    // Assert
    assertEquals(2, actualHashBag.size());
  }

  /**
   * Test {@link HashBag#HashBag(Iterable)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashBag#HashBag(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void HashBag.<init>(Iterable)"})
  public void testNewHashBag_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    HashBag<Object> actualHashBag = new HashBag<>((Iterable<?>) new ArrayList<>());

    // Assert
    assertTrue(actualHashBag.isEmpty());
  }

  /**
   * Test {@link HashBag#HashBag(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashBag#HashBag(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void HashBag.<init>(Collection)"})
  public void testNewHashBag_whenArrayList_thenReturnEmpty2() {
    // Arrange and Act
    HashBag<Object> actualHashBag = new HashBag<>(new ArrayList<>());

    // Assert
    assertTrue(actualHashBag.isEmpty());
  }
}
