package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import org.apache.commons.collections4.iterators.IteratorIterable;
import org.junit.Test;

public class EnumerationUtilsDiffblueTest {
  /**
   * Method under test: {@link EnumerationUtils#asIterable(Enumeration)}
   */
  @Test
  public void testAsIterable() {
    // Arrange and Act
    Iterable<Object> actualAsIterableResult = EnumerationUtils.asIterable(new StringTokenizer("foo"));
    Iterator<Object> actualIteratorResult = actualAsIterableResult.iterator();

    // Assert
    assertTrue(actualAsIterableResult instanceof IteratorIterable);
    Iterator<Object> iteratorResult = actualAsIterableResult.iterator();
    assertEquals("foo", iteratorResult.next());
    assertFalse(iteratorResult.hasNext());
    assertSame(iteratorResult, actualIteratorResult);
  }

  /**
   * Method under test: {@link EnumerationUtils#get(Enumeration, int)}
   */
  @Test
  public void testGet() {
    // Arrange
    StringTokenizer e = new StringTokenizer("foo");

    // Act and Assert
    assertEquals("foo", EnumerationUtils.get(e, 0));
    assertFalse(e.hasMoreElements());
  }

  /**
   * Method under test: {@link EnumerationUtils#toList(StringTokenizer)}
   */
  @Test
  public void testToList() {
    // Arrange
    StringTokenizer stringTokenizer = new StringTokenizer("foo");

    // Act
    List<String> actualToListResult = EnumerationUtils.toList(stringTokenizer);

    // Assert
    assertEquals(1, actualToListResult.size());
    assertEquals("foo", actualToListResult.get(0));
    assertFalse(stringTokenizer.hasMoreElements());
  }

  /**
   * Method under test: {@link EnumerationUtils#toSet(Enumeration)}
   */
  @Test
  public void testToSet() {
    // Arrange
    StringTokenizer enumeration = new StringTokenizer("foo");

    // Act
    Set<Object> actualToSetResult = EnumerationUtils.toSet(enumeration);

    // Assert
    assertEquals(1, actualToSetResult.size());
    assertFalse(enumeration.hasMoreElements());
  }
}
