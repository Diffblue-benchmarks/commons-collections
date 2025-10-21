package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CartesianProductIteratorDiffblueTest {
  /**
   * Test {@link CartesianProductIterator#CartesianProductIterator(Iterable[])}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return next size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CartesianProductIterator#CartesianProductIterator(Iterable[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CartesianProductIterator.<init>(Iterable[])"})
  public void testNewCartesianProductIterator_given42_thenReturnNextSizeIsOne() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    // Act
    CartesianProductIterator<Object> actualCartesianProductIterator = new CartesianProductIterator<>(objectList);

    // Assert
    List<Object> nextResult = actualCartesianProductIterator.next();
    assertEquals(1, nextResult.size());
    assertEquals("42", nextResult.get(0));
    assertFalse(actualCartesianProductIterator.hasNext());
  }

  /**
   * Test {@link CartesianProductIterator#CartesianProductIterator(Iterable[])}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CartesianProductIterator#CartesianProductIterator(Iterable[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CartesianProductIterator.<init>(Iterable[])"})
  public void testNewCartesianProductIterator_whenArrayList() {
    // Arrange and Act
    CartesianProductIterator<Object> actualCartesianProductIterator = new CartesianProductIterator<>(new ArrayList<>());

    // Assert
    assertFalse(actualCartesianProductIterator.hasNext());
  }

  /**
   * Test {@link CartesianProductIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CartesianProductIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CartesianProductIterator.hasNext()"})
  public void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    CartesianProductIterator<Object> cartesianProductIterator = new CartesianProductIterator<>(objectList);

    // Act and Assert
    assertTrue(cartesianProductIterator.hasNext());
  }

  /**
   * Test {@link CartesianProductIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CartesianProductIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CartesianProductIterator.hasNext()"})
  public void testHasNext_thenReturnFalse() {
    // Arrange
    CartesianProductIterator<Object> cartesianProductIterator = new CartesianProductIterator<>(new ArrayList<>());

    // Act and Assert
    assertFalse(cartesianProductIterator.hasNext());
  }

  /**
   * Test {@link CartesianProductIterator#next()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CartesianProductIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List CartesianProductIterator.next()"})
  public void testNext_givenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    CartesianProductIterator<Object> cartesianProductIterator = new CartesianProductIterator<>(objectList);

    // Act
    List<Object> actualNextResult = cartesianProductIterator.next();

    // Assert
    assertEquals(1, actualNextResult.size());
    assertEquals("42", actualNextResult.get(0));
    assertFalse(cartesianProductIterator.hasNext());
  }

  /**
   * Test {@link CartesianProductIterator#next()}.
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CartesianProductIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List CartesianProductIterator.next()"})
  public void testNext_thenThrowNoSuchElementException() {
    // Arrange
    CartesianProductIterator<Object> cartesianProductIterator = new CartesianProductIterator<>(new ArrayList<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> cartesianProductIterator.next());
  }

  /**
   * Test {@link CartesianProductIterator#remove()}.
   * <p>
   * Method under test: {@link CartesianProductIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CartesianProductIterator.remove()"})
  public void testRemove() {
    // Arrange
    CartesianProductIterator<Object> cartesianProductIterator = new CartesianProductIterator<>(new ArrayList<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> cartesianProductIterator.remove());
  }
}
