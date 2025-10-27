package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.junit.Test;

public class IteratorChainDiffblueTest {
  /**
   * Method under test: {@link IteratorChain#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    IteratorChain<Object> iteratorChain = new IteratorChain<>();

    // Act and Assert
    assertFalse(iteratorChain.hasNext());
  }

  /**
   * Method under test: {@link IteratorChain#hasNext()}
   */
  @Test
  public void testHasNext2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    IteratorChain<Object> iteratorChain = new IteratorChain<>(objectList.iterator());

    // Act and Assert
    assertFalse(iteratorChain.hasNext());
  }

  /**
   * Method under test: {@link IteratorChain#hasNext()}
   */
  @Test
  public void testHasNext3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    IteratorChain<Object> iteratorChain = new IteratorChain<>(objectList.iterator());

    // Act and Assert
    assertTrue(iteratorChain.hasNext());
  }

  /**
   * Method under test: {@link IteratorChain#hasNext()}
   */
  @Test
  public void testHasNext4() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iteratorResult = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    IteratorChain<Object> iteratorChain = new IteratorChain<>(iteratorResult, objectList2.iterator());

    // Act and Assert
    assertFalse(iteratorChain.hasNext());
  }

  /**
   * Method under test: {@link IteratorChain#next()}
   */
  @Test
  public void testNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    IteratorChain<Object> iteratorChain = new IteratorChain<>(objectList.iterator());

    // Act and Assert
    assertEquals("42", iteratorChain.next());
    assertFalse(iteratorChain.hasNext());
  }

  /**
   * Method under test: {@link IteratorChain#size()}
   */
  @Test
  public void testSize() {
    // Arrange
    IteratorChain<Object> iteratorChain = new IteratorChain<>();

    // Act and Assert
    assertEquals(0, iteratorChain.size());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link IteratorChain#IteratorChain()}
   *   <li>{@link IteratorChain#isLocked()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    IteratorChain<Object> actualIteratorChain = new IteratorChain<>();

    // Assert
    assertFalse(actualIteratorChain.isLocked());
  }

  /**
   * Method under test: {@link IteratorChain#IteratorChain(Collection)}
   */
  @Test
  public void testNewIteratorChain() {
    // Arrange and Act
    IteratorChain<Object> actualIteratorChain = new IteratorChain<>(new ArrayList<>());

    // Assert
    assertFalse(actualIteratorChain.hasNext());
  }

  /**
   * Method under test: {@link IteratorChain#IteratorChain(Collection)}
   */
  @Test
  public void testNewIteratorChain2() {
    // Arrange
    ArrayList<Iterator<?>> iteratorQueue = new ArrayList<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iteratorQueue.add(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iteratorQueue.add(objectList2.iterator());

    // Act
    IteratorChain<Object> actualIteratorChain = new IteratorChain<>(iteratorQueue);

    // Assert
    assertFalse(actualIteratorChain.hasNext());
  }

  /**
   * Method under test: {@link IteratorChain#IteratorChain(Iterator)}
   */
  @Test
  public void testNewIteratorChain3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    IteratorChain<Object> actualIteratorChain = new IteratorChain<>(objectList.iterator());

    // Assert
    assertFalse(actualIteratorChain.hasNext());
  }

  /**
   * Method under test: {@link IteratorChain#IteratorChain(Iterator, Iterator)}
   */
  @Test
  public void testNewIteratorChain4() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> first = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    IteratorChain<Object> actualIteratorChain = new IteratorChain<>(first, objectList2.iterator());

    // Assert
    assertFalse(actualIteratorChain.hasNext());
  }

  /**
   * Method under test: {@link IteratorChain#IteratorChain(Iterator[])}
   */
  @Test
  public void testNewIteratorChain5() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    IteratorChain<Object> actualIteratorChain = new IteratorChain<>(objectList.iterator());

    // Assert
    assertFalse(actualIteratorChain.hasNext());
  }
}
