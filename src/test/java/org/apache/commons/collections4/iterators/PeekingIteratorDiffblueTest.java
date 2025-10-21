package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class PeekingIteratorDiffblueTest {
  /**
   * Test {@link PeekingIterator#peekingIterator(Iterator)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link PeekingIterator#peekingIterator(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PeekingIterator PeekingIterator.peekingIterator(Iterator)"})
  public void testPeekingIterator_whenArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    PeekingIterator<Object> actualPeekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Assert
    assertFalse(actualPeekingIteratorResult.hasNext());
  }

  /**
   * Test {@link PeekingIterator#peekingIterator(Iterator)}.
   * <ul>
   *   <li>When peekingIterator {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link PeekingIterator#peekingIterator(Iterator)}
   *   <li>{@link PeekingIterator#peekingIterator(Iterator)}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PeekingIterator PeekingIterator.peekingIterator(Iterator)"})
  public void testPeekingIterator_whenPeekingIteratorArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PeekingIterator<?> iterator = PeekingIterator.peekingIterator(objectList.iterator());

    // Act
    PeekingIterator<Object> actualPeekingIteratorResult = PeekingIterator.peekingIterator(iterator);

    // Assert
    assertFalse(actualPeekingIteratorResult.hasNext());
  }

  /**
   * Test {@link PeekingIterator#PeekingIterator(Iterator)}.
   * <p>
   * Method under test: {@link PeekingIterator#PeekingIterator(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PeekingIterator.<init>(Iterator)"})
  public void testNewPeekingIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    PeekingIterator<Object> actualPeekingIterator = new PeekingIterator<>(objectList.iterator());

    // Assert
    assertFalse(actualPeekingIterator.hasNext());
  }

  /**
   * Test {@link PeekingIterator#element()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PeekingIterator#element()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object PeekingIterator.element()"})
  public void testElement_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertEquals("42", peekingIteratorResult.element());
  }

  /**
   * Test {@link PeekingIterator#element()}.
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PeekingIterator#element()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object PeekingIterator.element()"})
  public void testElement_thenThrowNoSuchElementException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> peekingIteratorResult.element());
  }

  /**
   * Test {@link PeekingIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PeekingIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean PeekingIterator.hasNext()"})
  public void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertTrue(peekingIteratorResult.hasNext());
  }

  /**
   * Test {@link PeekingIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PeekingIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean PeekingIterator.hasNext()"})
  public void testHasNext_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertFalse(peekingIteratorResult.hasNext());
  }

  /**
   * Test {@link PeekingIterator#next()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PeekingIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object PeekingIterator.next()"})
  public void testNext_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertEquals("42", peekingIteratorResult.next());
    assertFalse(peekingIteratorResult.hasNext());
  }

  /**
   * Test {@link PeekingIterator#next()}.
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PeekingIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object PeekingIterator.next()"})
  public void testNext_thenThrowNoSuchElementException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> peekingIteratorResult.next());
  }

  /**
   * Test {@link PeekingIterator#peek()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PeekingIterator#peek()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object PeekingIterator.peek()"})
  public void testPeek_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertEquals("42", peekingIteratorResult.peek());
  }

  /**
   * Test {@link PeekingIterator#peek()}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PeekingIterator#peek()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object PeekingIterator.peek()"})
  public void testPeek_thenReturnNull() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertNull(peekingIteratorResult.peek());
  }
}
