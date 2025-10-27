package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import org.apache.commons.collections4.MapIterator;
import org.junit.Test;

public class AbstractMapIteratorDecoratorDiffblueTest {
  /**
   * Method under test: {@link AbstractMapIteratorDecorator#getMapIterator()}
   */
  @Test
  public void testGetMapIterator() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> iterator = new AbstractOrderedMapIteratorDecorator<>(
        new EmptyOrderedMapIterator<>());
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator = new AbstractMapIteratorDecorator<>(
        iterator);

    // Act
    MapIterator<Object, Object> actualMapIterator = abstractMapIteratorDecorator.getMapIterator();

    // Assert
    assertTrue(actualMapIterator instanceof AbstractOrderedMapIteratorDecorator);
    assertSame(iterator, actualMapIterator);
  }

  /**
   * Method under test: {@link AbstractMapIteratorDecorator#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator = new AbstractMapIteratorDecorator<>(
        new AbstractOrderedMapIteratorDecorator<>(new EmptyOrderedMapIterator<>()));

    // Act and Assert
    assertFalse(abstractMapIteratorDecorator.hasNext());
  }

  /**
   * Method under test: {@link AbstractMapIteratorDecorator#hasNext()}
   */
  @Test
  public void testHasNext2() {
    // Arrange
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator = new AbstractMapIteratorDecorator<>(
        new AbstractMapIteratorDecorator<>(new AbstractOrderedMapIteratorDecorator<>(new EmptyOrderedMapIterator<>())));

    // Act and Assert
    assertFalse(abstractMapIteratorDecorator.hasNext());
  }

  /**
   * Method under test: {@link AbstractMapIteratorDecorator#hasNext()}
   */
  @Test
  public void testHasNext3() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator = new AbstractMapIteratorDecorator<>(
        new EntrySetMapIterator<>(map));

    // Act and Assert
    assertTrue(abstractMapIteratorDecorator.hasNext());
  }

  /**
   * Method under test: {@link AbstractMapIteratorDecorator#next()}
   */
  @Test
  public void testNext() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator = new AbstractMapIteratorDecorator<>(
        new EntrySetMapIterator<>(map));

    // Act and Assert
    assertEquals("42", abstractMapIteratorDecorator.next());
  }

  /**
   * Method under test: {@link AbstractMapIteratorDecorator#next()}
   */
  @Test
  public void testNext2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator = new AbstractMapIteratorDecorator<>(
        new AbstractMapIteratorDecorator<>(new EntrySetMapIterator<>(map)));

    // Act and Assert
    assertEquals("42", abstractMapIteratorDecorator.next());
  }

  /**
   * Method under test:
   * {@link AbstractMapIteratorDecorator#AbstractMapIteratorDecorator(MapIterator)}
   */
  @Test
  public void testNewAbstractMapIteratorDecorator() {
    // Arrange and Act
    AbstractMapIteratorDecorator<Object, Object> actualAbstractMapIteratorDecorator = new AbstractMapIteratorDecorator<>(
        new AbstractOrderedMapIteratorDecorator<>(new EmptyOrderedMapIterator<>()));

    // Assert
    assertFalse(actualAbstractMapIteratorDecorator.hasNext());
  }
}
