package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BoundedIteratorDiffblueTest {
  /**
   * Test {@link BoundedIterator#BoundedIterator(Iterator, long, long)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoundedIterator#BoundedIterator(Iterator, long, long)}
   */
  @Test
  @DisplayName("Test new BoundedIterator(Iterator, long, long); given '42'; when ArrayList() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BoundedIterator.<init>(Iterator, long, long)"})
  void testNewBoundedIterator_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act
    BoundedIterator<Object> actualBoundedIterator = new BoundedIterator<>(iterator, 1L, 1L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualBoundedIterator.hasNext());
  }

  /**
   * Test {@link BoundedIterator#BoundedIterator(Iterator, long, long)}.
   * <ul>
   *   <li>When minus one.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoundedIterator#BoundedIterator(Iterator, long, long)}
   */
  @Test
  @DisplayName("Test new BoundedIterator(Iterator, long, long); when minus one; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BoundedIterator.<init>(Iterator, long, long)"})
  void testNewBoundedIterator_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new BoundedIterator<>(objectList.iterator(), 0L, -1L));

  }

  /**
   * Test {@link BoundedIterator#BoundedIterator(Iterator, long, long)}.
   * <ul>
   *   <li>When minus one.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoundedIterator#BoundedIterator(Iterator, long, long)}
   */
  @Test
  @DisplayName("Test new BoundedIterator(Iterator, long, long); when minus one; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BoundedIterator.<init>(Iterator, long, long)"})
  void testNewBoundedIterator_whenMinusOne_thenThrowIllegalArgumentException2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new BoundedIterator<>(objectList.iterator(), -1L, 0L));

  }

  /**
   * Test {@link BoundedIterator#BoundedIterator(Iterator, long, long)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoundedIterator#BoundedIterator(Iterator, long, long)}
   */
  @Test
  @DisplayName("Test new BoundedIterator(Iterator, long, long); when one; then not ArrayList() iterator hasNext")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BoundedIterator.<init>(Iterator, long, long)"})
  void testNewBoundedIterator_whenOne_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    BoundedIterator<Object> actualBoundedIterator = new BoundedIterator<>(iterator, 1L, 1L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualBoundedIterator.hasNext());
  }

  /**
   * Test {@link BoundedIterator#BoundedIterator(Iterator, long, long)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoundedIterator#BoundedIterator(Iterator, long, long)}
   */
  @Test
  @DisplayName("Test new BoundedIterator(Iterator, long, long); when zero; then not ArrayList() iterator hasNext")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BoundedIterator.<init>(Iterator, long, long)"})
  void testNewBoundedIterator_whenZero_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    BoundedIterator<Object> actualBoundedIterator = new BoundedIterator<>(iterator, 0L, 0L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualBoundedIterator.hasNext());
  }

  /**
   * Test {@link BoundedIterator#hasNext()}.
   * <p>
   * Method under test: {@link BoundedIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BoundedIterator.hasNext()"})
  void testHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    BoundedIterator<Object> boundedIterator = new BoundedIterator<>(objectList.iterator(), 1L, 0L);

    // Act and Assert
    assertFalse(boundedIterator.hasNext());
  }

  /**
   * Test {@link BoundedIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoundedIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given ArrayList() add '42'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BoundedIterator.hasNext()"})
  void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    BoundedIterator<Object> boundedIterator = new BoundedIterator<>(objectList.iterator(), 1L, 1L);

    // Act and Assert
    assertTrue(boundedIterator.hasNext());
  }

  /**
   * Test {@link BoundedIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoundedIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BoundedIterator.hasNext()"})
  void testHasNext_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    BoundedIterator<Object> boundedIterator = new BoundedIterator<>(objectList.iterator(), 1L, 1L);

    // Act and Assert
    assertFalse(boundedIterator.hasNext());
  }

  /**
   * Test {@link BoundedIterator#next()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoundedIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given ArrayList() add '42'; then return '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object BoundedIterator.next()"})
  void testNext_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    BoundedIterator<Object> boundedIterator = new BoundedIterator<>(objectList.iterator(), 1L, 1L);

    // Act and Assert
    assertEquals("42", boundedIterator.next());
    assertFalse(boundedIterator.hasNext());
  }

  /**
   * Test {@link BoundedIterator#next()}.
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoundedIterator#next()}
   */
  @Test
  @DisplayName("Test next(); then throw NoSuchElementException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object BoundedIterator.next()"})
  void testNext_thenThrowNoSuchElementException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    BoundedIterator<Object> boundedIterator = new BoundedIterator<>(objectList.iterator(), 1L, 0L);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> boundedIterator.next());
  }

  /**
   * Test {@link BoundedIterator#remove()}.
   * <p>
   * Method under test: {@link BoundedIterator#remove()}
   */
  @Test
  @DisplayName("Test remove()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BoundedIterator.remove()"})
  void testRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    BoundedIterator<Object> boundedIterator = new BoundedIterator<>(objectList.iterator(), 1L, 1L);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> boundedIterator.remove());
  }
}
