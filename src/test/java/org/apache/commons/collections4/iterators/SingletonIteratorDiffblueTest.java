package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SingletonIteratorDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link SingletonIterator#SingletonIterator(Object)}
   *   <li>{@link SingletonIterator#reset()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    SingletonIterator<Object> actualSingletonIterator = new SingletonIterator<>("Object");
    actualSingletonIterator.reset();

    // Assert
    assertEquals("Object", actualSingletonIterator.next());
    assertFalse(actualSingletonIterator.hasNext());
  }

  /**
   * Method under test: {@link SingletonIterator#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    SingletonIterator<Object> singletonIterator = new SingletonIterator<>("Object", true);

    // Act and Assert
    assertTrue(singletonIterator.hasNext());
  }

  /**
   * Method under test: {@link SingletonIterator#next()}
   */
  @Test
  public void testNext() {
    // Arrange
    SingletonIterator<Object> singletonIterator = new SingletonIterator<>("Object", true);

    // Act and Assert
    assertEquals("Object", singletonIterator.next());
    assertFalse(singletonIterator.hasNext());
  }

  /**
   * Method under test: {@link SingletonIterator#remove()}
   */
  @Test
  public void testRemove() {
    // Arrange
    SingletonIterator<Object> singletonIterator = new SingletonIterator<>("Object", true);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> singletonIterator.remove());
  }

  /**
   * Method under test: {@link SingletonIterator#remove()}
   */
  @Test
  public void testRemove2() {
    // Arrange
    SingletonIterator<Object> singletonIterator = new SingletonIterator<>("Object", false);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> singletonIterator.remove());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link SingletonIterator#SingletonIterator(Object, boolean)}
   *   <li>{@link SingletonIterator#reset()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters2() {
    // Arrange and Act
    SingletonIterator<Object> actualSingletonIterator = new SingletonIterator<>("Object", true);
    actualSingletonIterator.reset();

    // Assert
    assertEquals("Object", actualSingletonIterator.next());
    assertFalse(actualSingletonIterator.hasNext());
  }
}
