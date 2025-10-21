package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class LoopingIteratorDiffblueTest {
  /**
   * Test {@link LoopingIterator#LoopingIterator(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return next is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingIterator#LoopingIterator(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LoopingIterator.<init>(Collection)"})
  public void testNewLoopingIterator_given42_whenArrayListAdd42_thenReturnNextIs42() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    LoopingIterator<Object> actualLoopingIterator = new LoopingIterator<>(collection);

    // Assert
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertTrue(actualLoopingIterator.hasNext());
  }

  /**
   * Test {@link LoopingIterator#LoopingIterator(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return next is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingIterator#LoopingIterator(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LoopingIterator.<init>(Collection)"})
  public void testNewLoopingIterator_given42_whenArrayListAdd42_thenReturnNextIs422() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    LoopingIterator<Object> actualLoopingIterator = new LoopingIterator<>(collection);

    // Assert
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertTrue(actualLoopingIterator.hasNext());
  }

  /**
   * Test {@link LoopingIterator#LoopingIterator(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingIterator#LoopingIterator(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LoopingIterator.<init>(Collection)"})
  public void testNewLoopingIterator_whenArrayList_thenReturnNotHasNext() {
    // Arrange and Act
    LoopingIterator<Object> actualLoopingIterator = new LoopingIterator<>(new ArrayList<>());

    // Assert
    assertFalse(actualLoopingIterator.hasNext());
  }

  /**
   * Test {@link LoopingIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LoopingIterator.hasNext()"})
  public void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    LoopingIterator<Object> loopingIterator = new LoopingIterator<>(collection);

    // Act and Assert
    assertTrue(loopingIterator.hasNext());
  }

  /**
   * Test {@link LoopingIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LoopingIterator.hasNext()"})
  public void testHasNext_thenReturnFalse() {
    // Arrange
    LoopingIterator<Object> loopingIterator = new LoopingIterator<>(new ArrayList<>());

    // Act and Assert
    assertFalse(loopingIterator.hasNext());
  }

  /**
   * Test {@link LoopingIterator#next()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LoopingIterator.next()"})
  public void testNext_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    LoopingIterator<Object> loopingIterator = new LoopingIterator<>(collection);

    // Act and Assert
    assertEquals("42", loopingIterator.next());
  }

  /**
   * Test {@link LoopingIterator#next()}.
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LoopingIterator.next()"})
  public void testNext_thenThrowNoSuchElementException() {
    // Arrange
    LoopingIterator<Object> loopingIterator = new LoopingIterator<>(new ArrayList<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> loopingIterator.next());
  }

  /**
   * Test {@link LoopingIterator#size()}.
   * <p>
   * Method under test: {@link LoopingIterator#size()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int LoopingIterator.size()"})
  public void testSize() {
    // Arrange
    LoopingIterator<Object> loopingIterator = new LoopingIterator<>(new ArrayList<>());

    // Act and Assert
    assertEquals(0, loopingIterator.size());
  }
}
