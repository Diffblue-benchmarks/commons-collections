package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.junit.Test;

public class CartesianProductIteratorDiffblueTest {
  /**
   * Method under test: {@link CartesianProductIterator#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    CartesianProductIterator<Object> cartesianProductIterator = new CartesianProductIterator<>(new ArrayList<>());

    // Act and Assert
    assertFalse(cartesianProductIterator.hasNext());
  }

  /**
   * Method under test: {@link CartesianProductIterator#hasNext()}
   */
  @Test
  public void testHasNext2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    CartesianProductIterator<Object> cartesianProductIterator = new CartesianProductIterator<>(objectList);

    // Act and Assert
    assertTrue(cartesianProductIterator.hasNext());
  }

  /**
   * Method under test: {@link CartesianProductIterator#next()}
   */
  @Test
  public void testNext() {
    // Arrange
    CartesianProductIterator<Object> cartesianProductIterator = new CartesianProductIterator<>(new ArrayList<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> cartesianProductIterator.next());
  }

  /**
   * Method under test: {@link CartesianProductIterator#next()}
   */
  @Test
  public void testNext2() {
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
   * Method under test: {@link CartesianProductIterator#remove()}
   */
  @Test
  public void testRemove() {
    // Arrange
    CartesianProductIterator<Object> cartesianProductIterator = new CartesianProductIterator<>(new ArrayList<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> cartesianProductIterator.remove());
  }

  /**
   * Method under test:
   * {@link CartesianProductIterator#CartesianProductIterator(Iterable[])}
   */
  @Test
  public void testNewCartesianProductIterator() {
    // Arrange and Act
    CartesianProductIterator<Object> actualCartesianProductIterator = new CartesianProductIterator<>(new ArrayList<>());

    // Assert
    assertFalse(actualCartesianProductIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link CartesianProductIterator#CartesianProductIterator(Iterable[])}
   */
  @Test
  public void testNewCartesianProductIterator2() {
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
}
