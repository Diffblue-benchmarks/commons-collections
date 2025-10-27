package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import org.apache.commons.collections4.functors.ChainedTransformer;
import org.junit.Test;

public class ObjectGraphIteratorDiffblueTest {
  /**
   * Method under test: {@link ObjectGraphIterator#findNext(Object)}
   */
  @Test
  public void testFindNext() {
    // Arrange
    ObjectGraphIterator<Object> objectGraphIterator = new ObjectGraphIterator<>("Root", new ChainedTransformer<>(null));

    // Act
    objectGraphIterator.findNext(
        new AbstractMapIteratorDecorator<>(new AbstractOrderedMapIteratorDecorator<>(new EmptyOrderedMapIterator<>())));

    // Assert
    assertFalse(objectGraphIterator.hasNext());
  }

  /**
   * Method under test: {@link ObjectGraphIterator#findNext(Object)}
   */
  @Test
  public void testFindNext2() {
    // Arrange
    ObjectGraphIterator<Object> objectGraphIterator = new ObjectGraphIterator<>("Root", new ChainedTransformer<>());
    Scanner scanner = new Scanner("foo");

    // Act
    objectGraphIterator.findNext(scanner);

    // Assert
    assertFalse(scanner.hasNext());
  }

  /**
   * Method under test: {@link ObjectGraphIterator#findNext(Object)}
   */
  @Test
  public void testFindNext3() {
    // Arrange
    ObjectGraphIterator<Object> objectGraphIterator = new ObjectGraphIterator<>("Root", null);
    Scanner scanner = new Scanner("foo");

    // Act
    objectGraphIterator.findNext(scanner);

    // Assert
    assertEquals("foo", objectGraphIterator.next());
    assertFalse(scanner.hasNext());
    assertFalse(objectGraphIterator.hasNext());
  }

  /**
   * Method under test: {@link ObjectGraphIterator#findNext(Object)}
   */
  @Test
  public void testFindNext4() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ObjectGraphIterator<Object> objectGraphIterator = new ObjectGraphIterator<>(objectList.iterator());
    Scanner scanner = new Scanner("foo");

    // Act
    objectGraphIterator.findNext(scanner);

    // Assert
    assertEquals("foo", objectGraphIterator.next());
    assertFalse(scanner.hasNext());
    assertFalse(objectGraphIterator.hasNext());
  }

  /**
   * Method under test: {@link ObjectGraphIterator#findNextByIterator(Iterator)}
   */
  @Test
  public void testFindNextByIterator() {
    // Arrange
    ObjectGraphIterator<Object> objectGraphIterator = new ObjectGraphIterator<>("Root", new ChainedTransformer<>(null));

    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    objectGraphIterator.findNextByIterator(iterator);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(objectGraphIterator.hasNext());
  }

  /**
   * Method under test: {@link ObjectGraphIterator#findNextByIterator(Iterator)}
   */
  @Test
  public void testFindNextByIterator2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ObjectGraphIterator<Object> objectGraphIterator = new ObjectGraphIterator<>(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    Iterator<Object> iterator = objectList2.iterator();

    // Act
    objectGraphIterator.findNextByIterator(iterator);

    // Assert
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link ObjectGraphIterator#findNextByIterator(Iterator)}
   */
  @Test
  public void testFindNextByIterator3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    ObjectGraphIterator<Object> objectGraphIterator = new ObjectGraphIterator<>(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    Iterator<Object> iterator = objectList2.iterator();

    // Act
    objectGraphIterator.findNextByIterator(iterator);

    // Assert
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link ObjectGraphIterator#findNextByIterator(Iterator)}
   */
  @Test
  public void testFindNextByIterator4() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    ObjectGraphIterator<Object> objectGraphIterator = new ObjectGraphIterator<>(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    Iterator<Object> iterator = objectList2.iterator();

    // Act
    objectGraphIterator.findNextByIterator(iterator);

    // Assert
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link ObjectGraphIterator#findNextByIterator(Iterator)}
   */
  @Test
  public void testFindNextByIterator5() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add(new Scanner("foo"));
    ObjectGraphIterator<Object> objectGraphIterator = new ObjectGraphIterator<>(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    Iterator<Object> iterator = objectList2.iterator();

    // Act
    objectGraphIterator.findNextByIterator(iterator);

    // Assert
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link ObjectGraphIterator#findNextByIterator(Iterator)}
   */
  @Test
  public void testFindNextByIterator6() {
    // Arrange
    ObjectGraphIterator<Object> objectGraphIterator = new ObjectGraphIterator<>("Root", new ChainedTransformer<>());

    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act
    objectGraphIterator.findNextByIterator(iterator);

    // Assert
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link ObjectGraphIterator#remove()}
   */
  @Test
  public void testRemove() {
    // Arrange
    ObjectGraphIterator<Object> objectGraphIterator = new ObjectGraphIterator<>("Root", new ChainedTransformer<>(null));

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> objectGraphIterator.remove());
  }

  /**
   * Method under test: {@link ObjectGraphIterator#ObjectGraphIterator(Iterator)}
   */
  @Test
  public void testNewObjectGraphIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    ObjectGraphIterator<Object> actualObjectGraphIterator = new ObjectGraphIterator<>(objectList.iterator());

    // Assert
    assertFalse(actualObjectGraphIterator.hasNext());
  }
}
