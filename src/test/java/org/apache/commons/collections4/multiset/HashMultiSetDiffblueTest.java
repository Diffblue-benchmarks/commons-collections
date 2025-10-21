package org.apache.commons.collections4.multiset;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class HashMultiSetDiffblueTest {
  /**
   * Test {@link HashMultiSet#HashMultiSet()}.
   * <p>
   * Method under test: {@link HashMultiSet#HashMultiSet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void HashMultiSet.<init>()"})
  public void testNewHashMultiSet() {
    // Arrange and Act
    HashMultiSet<Object> actualHashMultiSet = new HashMultiSet<>();

    // Assert
    assertTrue(actualHashMultiSet.isEmpty());
  }

  /**
   * Test {@link HashMultiSet#HashMultiSet(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashMultiSet#HashMultiSet(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void HashMultiSet.<init>(Collection)"})
  public void testNewHashMultiSet_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    HashMultiSet<Object> actualHashMultiSet = new HashMultiSet<>(coll);

    // Assert
    assertEquals(1, actualHashMultiSet.size());
  }

  /**
   * Test {@link HashMultiSet#HashMultiSet(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashMultiSet#HashMultiSet(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void HashMultiSet.<init>(Collection)"})
  public void testNewHashMultiSet_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    HashMultiSet<Object> actualHashMultiSet = new HashMultiSet<>(coll);

    // Assert
    assertEquals(2, actualHashMultiSet.size());
  }

  /**
   * Test {@link HashMultiSet#HashMultiSet(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashMultiSet#HashMultiSet(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void HashMultiSet.<init>(Collection)"})
  public void testNewHashMultiSet_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    HashMultiSet<Object> actualHashMultiSet = new HashMultiSet<>(new ArrayList<>());

    // Assert
    assertTrue(actualHashMultiSet.isEmpty());
  }
}
