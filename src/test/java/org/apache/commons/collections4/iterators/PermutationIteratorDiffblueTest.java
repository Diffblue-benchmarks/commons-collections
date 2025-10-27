package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.Test;

public class PermutationIteratorDiffblueTest {
  /**
   * Method under test: {@link PermutationIterator#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    PermutationIterator<Object> permutationIterator = new PermutationIterator<>(new ArrayList<>());

    // Act and Assert
    assertTrue(permutationIterator.hasNext());
  }

  /**
   * Method under test: {@link PermutationIterator#next()}
   */
  @Test
  public void testNext() {
    // Arrange
    PermutationIterator<Object> permutationIterator = new PermutationIterator<>(new ArrayList<>());

    // Act
    List<Object> actualNextResult = permutationIterator.next();

    // Assert
    assertFalse(permutationIterator.hasNext());
    assertTrue(actualNextResult.isEmpty());
  }

  /**
   * Method under test: {@link PermutationIterator#next()}
   */
  @Test
  public void testNext2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    PermutationIterator<Object> permutationIterator = new PermutationIterator<>(collection);

    // Act
    List<Object> actualNextResult = permutationIterator.next();

    // Assert
    assertEquals(1, actualNextResult.size());
    assertEquals("42", actualNextResult.get(0));
    assertFalse(permutationIterator.hasNext());
  }

  /**
   * Method under test: {@link PermutationIterator#remove()}
   */
  @Test
  public void testRemove() {
    // Arrange
    PermutationIterator<Object> permutationIterator = new PermutationIterator<>(new ArrayList<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> permutationIterator.remove());
  }

  /**
   * Method under test:
   * {@link PermutationIterator#PermutationIterator(Collection)}
   */
  @Test
  public void testNewPermutationIterator() {
    // Arrange and Act
    PermutationIterator<Object> actualPermutationIterator = new PermutationIterator<>(new ArrayList<>());

    // Assert
    List<Object> nextResult = actualPermutationIterator.next();
    assertFalse(actualPermutationIterator.hasNext());
    assertTrue(nextResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link PermutationIterator#PermutationIterator(Collection)}
   */
  @Test
  public void testNewPermutationIterator2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    PermutationIterator<Object> actualPermutationIterator = new PermutationIterator<>(collection);

    // Assert
    List<Object> nextResult = actualPermutationIterator.next();
    assertEquals(1, nextResult.size());
    assertEquals("42", nextResult.get(0));
    assertFalse(actualPermutationIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link PermutationIterator#PermutationIterator(Collection)}
   */
  @Test
  public void testNewPermutationIterator3() {
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
}
