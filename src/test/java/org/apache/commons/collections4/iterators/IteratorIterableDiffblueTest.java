package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IteratorIterableDiffblueTest {
  /**
   * Test {@link IteratorIterable#IteratorIterable(Iterator)}.
   *
   * <p>Method under test: {@link IteratorIterable#IteratorIterable(Iterator)}
   */
  @Test
  @DisplayName("Test new IteratorIterable(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IteratorIterable.<init>(Iterator)"})
  void testNewIteratorIterable() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    IteratorIterable<Object> actualIteratorIterable = new IteratorIterable<>(objectList.iterator());
    Iterator<Object> actualIteratorResult = actualIteratorIterable.iterator();

    // Assert
    assertEquals(-1L, actualIteratorIterable.spliterator().getExactSizeIfKnown());
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorIterable#IteratorIterable(Iterator, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorIterable#IteratorIterable(Iterator, boolean)}
   */
  @Test
  @DisplayName("Test new IteratorIterable(Iterator, boolean); when 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IteratorIterable.<init>(Iterator, boolean)"})
  void testNewIteratorIterable_whenFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    IteratorIterable<Object> actualIteratorIterable =
        new IteratorIterable<>(objectList.iterator(), false);
    Iterator<Object> actualIteratorResult = actualIteratorIterable.iterator();

    // Assert
    assertEquals(-1L, actualIteratorIterable.spliterator().getExactSizeIfKnown());
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorIterable#IteratorIterable(Iterator, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorIterable#IteratorIterable(Iterator, boolean)}
   */
  @Test
  @DisplayName("Test new IteratorIterable(Iterator, boolean); when 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IteratorIterable.<init>(Iterator, boolean)"})
  void testNewIteratorIterable_whenTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    IteratorIterable<Object> actualIteratorIterable =
        new IteratorIterable<>(objectList.iterator(), true);
    Iterator<Object> actualIteratorResult = actualIteratorIterable.iterator();

    // Assert
    assertEquals(-1L, actualIteratorIterable.spliterator().getExactSizeIfKnown());
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorIterable#iterator()}.
   *
   * <p>Method under test: {@link IteratorIterable#iterator()}
   */
  @Test
  @DisplayName("Test iterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorIterable.iterator()"})
  void testIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    IteratorIterable<Object> iteratorIterable = new IteratorIterable<>(objectList.iterator(), true);

    // Act and Assert
    assertFalse(iteratorIterable.iterator().hasNext());
  }

  /**
   * Test {@link IteratorIterable#iterator()}.
   *
   * <ul>
   *   <li>Given {@link IteratorIterable#IteratorIterable(Iterator)} with iterator is {@link
   *       ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link IteratorIterable#iterator()}
   */
  @Test
  @DisplayName(
      "Test iterator(); given IteratorIterable(Iterator) with iterator is ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorIterable.iterator()"})
  void testIterator_givenIteratorIterableWithIteratorIsArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    IteratorIterable<Object> iteratorIterable = new IteratorIterable<>(objectList.iterator());

    // Act and Assert
    assertFalse(iteratorIterable.iterator().hasNext());
  }
}
