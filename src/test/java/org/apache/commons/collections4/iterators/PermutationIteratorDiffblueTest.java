package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class PermutationIteratorDiffblueTest {
  /**
   * Test {@link PermutationIterator#PermutationIterator(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return next is {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PermutationIterator#PermutationIterator(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PermutationIterator.<init>(Collection)"})
  public void testNewPermutationIterator_given42_whenArrayListAdd42_thenReturnNextIsArrayList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    PermutationIterator<Object> actualPermutationIterator = new PermutationIterator<>(collection);

    // Assert
    List<Object> actualNextResult = actualPermutationIterator.next();
    assertFalse(actualPermutationIterator.hasNext());
    assertEquals(collection, actualNextResult);
  }

  /**
   * Test {@link PermutationIterator#PermutationIterator(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return next is {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PermutationIterator#PermutationIterator(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PermutationIterator.<init>(Collection)"})
  public void testNewPermutationIterator_given42_whenArrayListAdd42_thenReturnNextIsArrayList2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    PermutationIterator<Object> actualPermutationIterator = new PermutationIterator<>(collection);

    // Assert
    List<Object> actualNextResult = actualPermutationIterator.next();
    List<Object> actualNextResult2 = actualPermutationIterator.next();
    assertFalse(actualPermutationIterator.hasNext());
    assertEquals(collection, actualNextResult);
    assertEquals(collection, actualNextResult2);
  }

  /**
   * Test {@link PermutationIterator#PermutationIterator(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return next Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link PermutationIterator#PermutationIterator(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PermutationIterator.<init>(Collection)"})
  public void testNewPermutationIterator_whenArrayList_thenReturnNextEmpty() {
    // Arrange and Act
    PermutationIterator<Object> actualPermutationIterator = new PermutationIterator<>(new ArrayList<>());

    // Assert
    List<Object> nextResult = actualPermutationIterator.next();
    assertFalse(actualPermutationIterator.hasNext());
    assertTrue(nextResult.isEmpty());
  }

  /**
   * Test {@link PermutationIterator#hasNext()}.
   * <p>
   * Method under test: {@link PermutationIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean PermutationIterator.hasNext()"})
  public void testHasNext() {
    // Arrange
    PermutationIterator<Object> permutationIterator = new PermutationIterator<>(new ArrayList<>());

    // Act and Assert
    assertTrue(permutationIterator.hasNext());
  }

  /**
   * Test {@link PermutationIterator#next()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link PermutationIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List PermutationIterator.next()"})
  public void testNext_givenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    PermutationIterator<Object> permutationIterator = new PermutationIterator<>(collection);

    // Act
    List<Object> actualNextResult = permutationIterator.next();

    // Assert
    assertEquals(1, actualNextResult.size());
    assertEquals("42", actualNextResult.get(0));
  }

  /**
   * Test {@link PermutationIterator#next()}.
   * <ul>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link PermutationIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List PermutationIterator.next()"})
  public void testNext_thenReturnEmpty() {
    // Arrange
    PermutationIterator<Object> permutationIterator = new PermutationIterator<>(new ArrayList<>());

    // Act
    List<Object> actualNextResult = permutationIterator.next();

    // Assert
    assertFalse(permutationIterator.hasNext());
    assertTrue(actualNextResult.isEmpty());
  }

  /**
   * Test {@link PermutationIterator#remove()}.
   * <p>
   * Method under test: {@link PermutationIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PermutationIterator.remove()"})
  public void testRemove() {
    // Arrange
    PermutationIterator<Object> permutationIterator = new PermutationIterator<>(new ArrayList<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> permutationIterator.remove());
  }
}
