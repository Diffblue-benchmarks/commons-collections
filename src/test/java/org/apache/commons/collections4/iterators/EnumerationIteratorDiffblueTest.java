package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.StringTokenizer;
import org.junit.Test;

public class EnumerationIteratorDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link EnumerationIterator#EnumerationIterator()}
   *   <li>{@link EnumerationIterator#setEnumeration(Enumeration)}
   *   <li>{@link EnumerationIterator#getEnumeration()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    EnumerationIterator<Object> actualEnumerationIterator = new EnumerationIterator<>();
    StringTokenizer enumeration = new StringTokenizer("foo");
    actualEnumerationIterator.setEnumeration(enumeration);

    // Assert that nothing has changed
    assertSame(enumeration, actualEnumerationIterator.getEnumeration());
  }

  /**
   * Method under test: {@link EnumerationIterator#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    EnumerationIterator<Object> enumerationIterator = new EnumerationIterator<>();
    enumerationIterator.setEnumeration(new StringTokenizer("foo"));

    // Act and Assert
    assertTrue(enumerationIterator.hasNext());
  }

  /**
   * Method under test: {@link EnumerationIterator#hasNext()}
   */
  @Test
  public void testHasNext2() {
    // Arrange
    EnumerationIterator<Object> enumerationIterator = new EnumerationIterator<>();
    enumerationIterator.setEnumeration(new StringTokenizer(""));

    // Act and Assert
    assertFalse(enumerationIterator.hasNext());
  }

  /**
   * Method under test: {@link EnumerationIterator#next()}
   */
  @Test
  public void testNext() {
    // Arrange
    EnumerationIterator<Object> enumerationIterator = new EnumerationIterator<>();
    enumerationIterator.setEnumeration(new StringTokenizer("foo"));

    // Act and Assert
    assertEquals("foo", enumerationIterator.next());
    assertFalse(enumerationIterator.hasNext());
  }

  /**
   * Method under test: {@link EnumerationIterator#remove()}
   */
  @Test
  public void testRemove() {
    // Arrange
    EnumerationIterator<Object> enumerationIterator = new EnumerationIterator<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> enumerationIterator.remove());
  }

  /**
   * Method under test: {@link EnumerationIterator#remove()}
   */
  @Test
  public void testRemove2() {
    // Arrange
    StringTokenizer enumeration = new StringTokenizer("No Collection associated with this Iterator");
    EnumerationIterator<Object> enumerationIterator = new EnumerationIterator<>(enumeration, new ArrayList<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> enumerationIterator.remove());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link EnumerationIterator#EnumerationIterator(Enumeration)}
   *   <li>{@link EnumerationIterator#setEnumeration(Enumeration)}
   *   <li>{@link EnumerationIterator#getEnumeration()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters2() {
    // Arrange and Act
    EnumerationIterator<Object> actualEnumerationIterator = new EnumerationIterator<>(new StringTokenizer("foo"));
    StringTokenizer enumeration = new StringTokenizer("foo");
    actualEnumerationIterator.setEnumeration(enumeration);

    // Assert that nothing has changed
    assertSame(enumeration, actualEnumerationIterator.getEnumeration());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link EnumerationIterator#EnumerationIterator(Enumeration, Collection)}
   *   <li>{@link EnumerationIterator#setEnumeration(Enumeration)}
   *   <li>{@link EnumerationIterator#getEnumeration()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters3() {
    // Arrange
    StringTokenizer enumeration = new StringTokenizer("foo");

    // Act
    EnumerationIterator<Object> actualEnumerationIterator = new EnumerationIterator<>(enumeration, new ArrayList<>());
    StringTokenizer enumeration2 = new StringTokenizer("foo");
    actualEnumerationIterator.setEnumeration(enumeration2);

    // Assert that nothing has changed
    assertSame(enumeration2, actualEnumerationIterator.getEnumeration());
  }
}
