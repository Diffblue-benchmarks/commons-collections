package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IteratorChainDiffblueTest {
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
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void IteratorChain.<init>()", "boolean IteratorChain.isLocked()"})
  void testGettersAndSetters() {
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
  @DisplayName("Test new IteratorChain(Iterator)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void IteratorChain.<init>(Iterator)"})
  void testNewIteratorChain() {
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
  @DisplayName("Test new IteratorChain(Iterator, Iterator)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void IteratorChain.<init>(Iterator, Iterator)"})
  void testNewIteratorChain2() {
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
  @DisplayName("Test new IteratorChain(Iterator[])")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void IteratorChain.<init>(Iterator[])"})
  void testNewIteratorChain3() {
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
  @DisplayName("Test new IteratorChain(Collection); given ArrayList() iterator; when ArrayList() add ArrayList() iterator")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void IteratorChain.<init>(Collection)"})
  void testNewIteratorChain_givenArrayListIterator_whenArrayListAddArrayListIterator() {
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
  @DisplayName("Test new IteratorChain(Collection); when ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void IteratorChain.<init>(Collection)"})
  void testNewIteratorChain_whenArrayList() {
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
  @DisplayName("Test hasNext()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean IteratorChain.hasNext()"})
  void testHasNext() {
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
  @DisplayName("Test hasNext(); given ArrayList() add '42'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean IteratorChain.hasNext()"})
  void testHasNext_givenArrayListAdd42_thenReturnTrue() {
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
  @DisplayName("Test hasNext(); given IteratorChain(Iterator[]) with iteratorQueue is ArrayList() iterator")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean IteratorChain.hasNext()"})
  void testHasNext_givenIteratorChainWithIteratorQueueIsArrayListIterator() {
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
  @DisplayName("Test hasNext(); given IteratorChain(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean IteratorChain.hasNext()"})
  void testHasNext_givenIteratorChain_thenReturnFalse() {
    // Arrange
    IteratorChain<Object> iteratorChain = new IteratorChain<>();

    // Act and Assert
    assertFalse(iteratorChain.hasNext());
  }

  /**
   * Test {@link IteratorChain#next()}.
   * <p>
   * Method under test: {@link IteratorChain#next()}
   */
  @Test
  @DisplayName("Test next()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object IteratorChain.next()"})
  void testNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iteratorResult = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    IteratorChain<Object> iteratorChain = new IteratorChain<>(objectList2.iterator(), iteratorResult);

    // Act and Assert
    assertEquals("42", iteratorChain.next());
    assertFalse(iteratorChain.hasNext());
  }

  /**
   * Test {@link IteratorChain#next()}.
   * <ul>
   *   <li>Then not {@link IteratorChain#IteratorChain(Iterator[])} with iteratorQueue is {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorChain#next()}
   */
  @Test
  @DisplayName("Test next(); then not IteratorChain(Iterator[]) with iteratorQueue is ArrayList() iterator hasNext")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object IteratorChain.next()"})
  void testNext_thenNotIteratorChainWithIteratorQueueIsArrayListIteratorHasNext() {
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
  @DisplayName("Test size()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int IteratorChain.size()"})
  void testSize() {
    // Arrange
    IteratorChain<Object> iteratorChain = new IteratorChain<>();

    // Act and Assert
    assertEquals(0, iteratorChain.size());
  }
}
