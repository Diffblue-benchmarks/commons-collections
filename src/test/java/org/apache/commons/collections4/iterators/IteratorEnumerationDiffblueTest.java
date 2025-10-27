package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.Test;

public class IteratorEnumerationDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link IteratorEnumeration#IteratorEnumeration()}
   *   <li>{@link IteratorEnumeration#setIterator(Iterator)}
   *   <li>{@link IteratorEnumeration#getIterator()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    IteratorEnumeration<Object> actualIteratorEnumeration = new IteratorEnumeration<>();
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();
    actualIteratorEnumeration.setIterator(iterator);
    Iterator<?> actualIterator = actualIteratorEnumeration.getIterator();

    // Assert that nothing has changed
    assertFalse(actualIterator.hasNext());
    assertSame(iterator, actualIterator);
  }

  /**
   * Method under test: {@link IteratorEnumeration#hasMoreElements()}
   */
  @Test
  public void testHasMoreElements() {
    // Arrange
    IteratorEnumeration<Object> iteratorEnumeration = new IteratorEnumeration<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iteratorEnumeration.setIterator(objectList.iterator());

    // Act and Assert
    assertFalse(iteratorEnumeration.hasMoreElements());
  }

  /**
   * Method under test: {@link IteratorEnumeration#hasMoreElements()}
   */
  @Test
  public void testHasMoreElements2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    IteratorEnumeration<Object> iteratorEnumeration = new IteratorEnumeration<>();
    iteratorEnumeration.setIterator(iterator);

    // Act and Assert
    assertTrue(iteratorEnumeration.hasMoreElements());
  }

  /**
   * Method under test: {@link IteratorEnumeration#nextElement()}
   */
  @Test
  public void testNextElement() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    IteratorEnumeration<Object> iteratorEnumeration = new IteratorEnumeration<>();
    iteratorEnumeration.setIterator(iterator);

    // Act and Assert
    assertEquals("42", iteratorEnumeration.nextElement());
    assertFalse(iteratorEnumeration.getIterator().hasNext());
    assertFalse(iteratorEnumeration.hasMoreElements());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link IteratorEnumeration#IteratorEnumeration(Iterator)}
   *   <li>{@link IteratorEnumeration#setIterator(Iterator)}
   *   <li>{@link IteratorEnumeration#getIterator()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    IteratorEnumeration<Object> actualIteratorEnumeration = new IteratorEnumeration<>(objectList.iterator());
    ArrayList<Object> objectList2 = new ArrayList<>();
    Iterator<Object> iterator = objectList2.iterator();
    actualIteratorEnumeration.setIterator(iterator);
    Iterator<?> actualIterator = actualIteratorEnumeration.getIterator();

    // Assert that nothing has changed
    assertFalse(actualIterator.hasNext());
    assertSame(iterator, actualIterator);
  }
}
