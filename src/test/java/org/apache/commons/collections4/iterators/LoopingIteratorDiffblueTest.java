package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LoopingIteratorDiffblueTest {
  /**
   * Test {@link LoopingIterator#LoopingIterator(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return next is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link LoopingIterator#LoopingIterator(Collection)}
   */
  @Test
  @DisplayName(
      "Test new LoopingIterator(Collection); given '42'; when ArrayList() add '42'; then return next is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LoopingIterator.<init>(Collection)"})
  void testNewLoopingIterator_given42_whenArrayListAdd42_thenReturnNextIs42() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return next is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link LoopingIterator#LoopingIterator(Collection)}
   */
  @Test
  @DisplayName(
      "Test new LoopingIterator(Collection); given '42'; when ArrayList() add '42'; then return next is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LoopingIterator.<init>(Collection)"})
  void testNewLoopingIterator_given42_whenArrayListAdd42_thenReturnNextIs422() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link LoopingIterator#LoopingIterator(Collection)}
   */
  @Test
  @DisplayName("Test new LoopingIterator(Collection); when ArrayList(); then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LoopingIterator.<init>(Collection)"})
  void testNewLoopingIterator_whenArrayList_thenReturnNotHasNext() {
    // Arrange and Act
    LoopingIterator<Object> actualLoopingIterator = new LoopingIterator<>(new ArrayList<>());

    // Assert
    assertFalse(actualLoopingIterator.hasNext());
  }

  /**
   * Test {@link LoopingIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link LoopingIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LoopingIterator.hasNext()"})
  void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    LoopingIterator<Object> loopingIterator = new LoopingIterator<>(collection);

    // Act and Assert
    assertTrue(loopingIterator.hasNext());
  }

  /**
   * Test {@link LoopingIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link LoopingIterator#LoopingIterator(Collection)} with collection is {@link
   *       ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link LoopingIterator#hasNext()}
   */
  @Test
  @DisplayName(
      "Test hasNext(); given LoopingIterator(Collection) with collection is ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LoopingIterator.hasNext()"})
  void testHasNext_givenLoopingIteratorWithCollectionIsArrayList_thenReturnFalse() {
    // Arrange
    LoopingIterator<Object> loopingIterator = new LoopingIterator<>(new ArrayList<>());

    // Act and Assert
    assertFalse(loopingIterator.hasNext());
  }

  /**
   * Test {@link LoopingIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link LoopingIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object LoopingIterator.next()"})
  void testNext_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    LoopingIterator<Object> loopingIterator = new LoopingIterator<>(collection);

    // Act and Assert
    assertEquals("42", loopingIterator.next());
  }

  /**
   * Test {@link LoopingIterator#next()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link LoopingIterator#next()}
   */
  @Test
  @DisplayName("Test next(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object LoopingIterator.next()"})
  void testNext_thenThrowNoSuchElementException() {
    // Arrange
    LoopingIterator<Object> loopingIterator = new LoopingIterator<>(new ArrayList<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> loopingIterator.next());
  }

  /**
   * Test {@link LoopingIterator#size()}.
   *
   * <ul>
   *   <li>Given {@link LoopingIterator#LoopingIterator(Collection)} with collection is {@link
   *       ArrayList#ArrayList()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link LoopingIterator#size()}
   */
  @Test
  @DisplayName(
      "Test size(); given LoopingIterator(Collection) with collection is ArrayList(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LoopingIterator.size()"})
  void testSize_givenLoopingIteratorWithCollectionIsArrayList_thenReturnZero() {
    // Arrange
    LoopingIterator<Object> loopingIterator = new LoopingIterator<>(new ArrayList<>());

    // Act and Assert
    assertEquals(0, loopingIterator.size());
  }
}
