package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class IteratorChainDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link IteratorChain#IteratorChain()}
   *   <li>{@link IteratorChain#isLocked()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void IteratorChain.<init>()", "boolean IteratorChain.isLocked()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    IteratorChain<Object> actualIteratorChain = new IteratorChain<>();

    // Assert
    assertFalse(actualIteratorChain.isLocked());
  }

  /**
   * Test {@link IteratorChain#IteratorChain(Iterator)}.
   * <p>
   * Method under test: {@link IteratorChain#IteratorChain(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void IteratorChain.<init>(Iterator)"})
  public void testNewIteratorChain() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    IteratorChain<Object> actualIteratorChain = new IteratorChain<>(objectList.iterator());

    // Assert
    assertFalse(actualIteratorChain.hasNext());
  }

  /**
   * Test {@link IteratorChain#IteratorChain(Iterator, Iterator)}.
   * <p>
   * Method under test: {@link IteratorChain#IteratorChain(Iterator, Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void IteratorChain.<init>(Iterator, Iterator)"})
  public void testNewIteratorChain2() {
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
   * Test {@link IteratorChain#IteratorChain(Iterator[])}.
   * <p>
   * Method under test: {@link IteratorChain#IteratorChain(Iterator[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void IteratorChain.<init>(Iterator[])"})
  public void testNewIteratorChain3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    IteratorChain<Object> actualIteratorChain = new IteratorChain<>(objectList.iterator());

    // Assert
    assertFalse(actualIteratorChain.hasNext());
  }

  /**
   * Test {@link IteratorChain#IteratorChain(Collection)}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} iterator.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorChain#IteratorChain(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void IteratorChain.<init>(Collection)"})
  public void testNewIteratorChain_givenArrayListIterator_whenArrayListAddArrayListIterator() {
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
   * Test {@link IteratorChain#IteratorChain(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorChain#IteratorChain(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void IteratorChain.<init>(Collection)"})
  public void testNewIteratorChain_whenArrayList() {
    // Arrange and Act
    IteratorChain<Object> actualIteratorChain = new IteratorChain<>(new ArrayList<>());

    // Assert
    assertFalse(actualIteratorChain.hasNext());
  }

  /**
   * Test {@link IteratorChain#hasNext()}.
   * <p>
   * Method under test: {@link IteratorChain#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorChain.hasNext()"})
  public void testHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iteratorResult = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    IteratorChain<Object> iteratorChain = new IteratorChain<>(iteratorResult, objectList2.iterator());

    // Act and Assert
    assertFalse(iteratorChain.hasNext());
  }

  /**
   * Test {@link IteratorChain#hasNext()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorChain#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorChain.hasNext()"})
  public void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    IteratorChain<Object> iteratorChain = new IteratorChain<>(objectList.iterator());

    // Act and Assert
    assertTrue(iteratorChain.hasNext());
  }

  /**
   * Test {@link IteratorChain#hasNext()}.
   * <ul>
   *   <li>Given {@link IteratorChain#IteratorChain(Iterator[])} with iteratorQueue is {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorChain#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorChain.hasNext()"})
  public void testHasNext_givenIteratorChainWithIteratorQueueIsArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    IteratorChain<Object> iteratorChain = new IteratorChain<>(objectList.iterator());

    // Act and Assert
    assertFalse(iteratorChain.hasNext());
  }

  /**
   * Test {@link IteratorChain#hasNext()}.
   * <ul>
   *   <li>Given {@link IteratorChain#IteratorChain()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorChain#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorChain.hasNext()"})
  public void testHasNext_givenIteratorChain_thenReturnFalse() {
    // Arrange
    IteratorChain<Object> iteratorChain = new IteratorChain<>();

    // Act and Assert
    assertFalse(iteratorChain.hasNext());
  }

  /**
   * Test {@link IteratorChain#next()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorChain#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IteratorChain.next()"})
  public void testNext_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    IteratorChain<Object> iteratorChain = new IteratorChain<>(objectList.iterator());

    // Act and Assert
    assertEquals("42", iteratorChain.next());
    assertFalse(iteratorChain.hasNext());
  }

  /**
   * Test {@link IteratorChain#size()}.
   * <p>
   * Method under test: {@link IteratorChain#size()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IteratorChain.size()"})
  public void testSize() {
    // Arrange
    IteratorChain<Object> iteratorChain = new IteratorChain<>();

    // Act and Assert
    assertEquals(0, iteratorChain.size());
  }
}
