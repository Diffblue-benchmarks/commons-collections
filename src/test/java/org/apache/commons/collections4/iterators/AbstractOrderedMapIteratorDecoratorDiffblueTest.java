package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.OrderedMapIterator;
import org.junit.Test;

public class AbstractOrderedMapIteratorDecoratorDiffblueTest {
  /**
   * Method under test:
   * {@link AbstractOrderedMapIteratorDecorator#getOrderedMapIterator()}
   */
  @Test
  public void testGetOrderedMapIterator() {
    // Arrange
    EmptyOrderedMapIterator<Object, Object> iterator = new EmptyOrderedMapIterator<>();
    AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        iterator);

    // Act
    OrderedMapIterator<Object, Object> actualOrderedMapIterator = abstractOrderedMapIteratorDecorator
        .getOrderedMapIterator();

    // Assert
    assertTrue(actualOrderedMapIterator instanceof EmptyOrderedMapIterator);
    assertSame(iterator, actualOrderedMapIterator);
  }

  /**
   * Method under test: {@link AbstractOrderedMapIteratorDecorator#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        new EmptyOrderedMapIterator<>());

    // Act and Assert
    assertFalse(abstractOrderedMapIteratorDecorator.hasNext());
  }

  /**
   * Method under test: {@link AbstractOrderedMapIteratorDecorator#hasNext()}
   */
  @Test
  public void testHasNext2() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        new AbstractOrderedMapIteratorDecorator<>(new EmptyOrderedMapIterator<>()));

    // Act and Assert
    assertFalse(abstractOrderedMapIteratorDecorator.hasNext());
  }

  /**
   * Method under test: {@link AbstractOrderedMapIteratorDecorator#hasPrevious()}
   */
  @Test
  public void testHasPrevious() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        new EmptyOrderedMapIterator<>());

    // Act and Assert
    assertFalse(abstractOrderedMapIteratorDecorator.hasPrevious());
  }

  /**
   * Method under test: {@link AbstractOrderedMapIteratorDecorator#hasPrevious()}
   */
  @Test
  public void testHasPrevious2() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        new AbstractOrderedMapIteratorDecorator<>(new EmptyOrderedMapIterator<>()));

    // Act and Assert
    assertFalse(abstractOrderedMapIteratorDecorator.hasPrevious());
  }

  /**
   * Method under test:
   * {@link AbstractOrderedMapIteratorDecorator#AbstractOrderedMapIteratorDecorator(OrderedMapIterator)}
   */
  @Test
  public void testNewAbstractOrderedMapIteratorDecorator() {
    // Arrange and Act
    AbstractOrderedMapIteratorDecorator<Object, Object> actualAbstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        new EmptyOrderedMapIterator<>());

    // Assert
    assertFalse(actualAbstractOrderedMapIteratorDecorator.hasNext());
  }
}
