package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PushbackIteratorDiffblueTest {
  /**
   * Test {@link PushbackIterator#pushbackIterator(Iterator)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link PushbackIterator#pushbackIterator(Iterator)}
   */
  @Test
  @DisplayName("Test pushbackIterator(Iterator); when ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PushbackIterator PushbackIterator.pushbackIterator(Iterator)"})
  void testPushbackIterator_whenArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    PushbackIterator<Object> actualPushbackIteratorResult =
        PushbackIterator.pushbackIterator(objectList.iterator());

    // Assert
    assertFalse(actualPushbackIteratorResult.hasNext());
  }

  /**
   * Test {@link PushbackIterator#pushbackIterator(Iterator)}.
   *
   * <ul>
   *   <li>When pushbackIterator {@link ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PushbackIterator#pushbackIterator(Iterator)}
   *   <li>{@link PushbackIterator#pushbackIterator(Iterator)}
   * </ul>
   */
  @Test
  @DisplayName("Test pushbackIterator(Iterator); when pushbackIterator ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PushbackIterator PushbackIterator.pushbackIterator(Iterator)"})
  void testPushbackIterator_whenPushbackIteratorArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PushbackIterator<?> iterator = PushbackIterator.pushbackIterator(objectList.iterator());

    // Act
    PushbackIterator<Object> actualPushbackIteratorResult =
        PushbackIterator.pushbackIterator(iterator);

    // Assert
    assertFalse(actualPushbackIteratorResult.hasNext());
  }

  /**
   * Test {@link PushbackIterator#PushbackIterator(Iterator)}.
   *
   * <p>Method under test: {@link PushbackIterator#PushbackIterator(Iterator)}
   */
  @Test
  @DisplayName("Test new PushbackIterator(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PushbackIterator.<init>(Iterator)"})
  void testNewPushbackIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    PushbackIterator<Object> actualPushbackIterator = new PushbackIterator<>(objectList.iterator());

    // Assert
    assertFalse(actualPushbackIterator.hasNext());
  }

  /**
   * Test {@link PushbackIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link PushbackIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PushbackIterator.hasNext()"})
  void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    PushbackIterator<Object> pushbackIteratorResult =
        PushbackIterator.pushbackIterator(objectList.iterator());

    // Act and Assert
    assertTrue(pushbackIteratorResult.hasNext());
  }

  /**
   * Test {@link PushbackIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PushbackIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PushbackIterator.hasNext()"})
  void testHasNext_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PushbackIterator<Object> pushbackIteratorResult =
        PushbackIterator.pushbackIterator(objectList.iterator());

    // Act and Assert
    assertFalse(pushbackIteratorResult.hasNext());
  }

  /**
   * Test {@link PushbackIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PushbackIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object PushbackIterator.next()"})
  void testNext_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    PushbackIterator<Object> pushbackIteratorResult =
        PushbackIterator.pushbackIterator(objectList.iterator());

    // Act and Assert
    assertEquals("42", pushbackIteratorResult.next());
    assertFalse(pushbackIteratorResult.hasNext());
  }

  /**
   * Test {@link PushbackIterator#pushback(Object)}.
   *
   * <p>Method under test: {@link PushbackIterator#pushback(Object)}
   */
  @Test
  @DisplayName("Test pushback(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PushbackIterator.pushback(Object)"})
  void testPushback() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PushbackIterator<Object> pushbackIteratorResult =
        PushbackIterator.pushbackIterator(objectList.iterator());

    // Act
    pushbackIteratorResult.pushback("Item");

    // Assert
    assertEquals("Item", pushbackIteratorResult.next());
    assertFalse(pushbackIteratorResult.hasNext());
  }

  /**
   * Test {@link PushbackIterator#remove()}.
   *
   * <p>Method under test: {@link PushbackIterator#remove()}
   */
  @Test
  @DisplayName("Test remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PushbackIterator.remove()"})
  void testRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PushbackIterator<Object> pushbackIteratorResult =
        PushbackIterator.pushbackIterator(objectList.iterator());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> pushbackIteratorResult.remove());
  }
}
