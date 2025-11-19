package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PermutationIteratorDiffblueTest {
  /**
   * Test {@link PermutationIterator#PermutationIterator(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return next is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link PermutationIterator#PermutationIterator(Collection)}
   */
  @Test
  @DisplayName(
      "Test new PermutationIterator(Collection); given '42'; when ArrayList() add '42'; then return next is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PermutationIterator.<init>(Collection)"})
  void testNewPermutationIterator_given42_whenArrayListAdd42_thenReturnNextIsArrayList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    PermutationIterator<Object> actualPermutationIterator = new PermutationIterator<>(collection);

    // Assert
    List<Object> actualNextResult = actualPermutationIterator.next();
    assertFalse(actualPermutationIterator.hasNext());
    assertEquals(collection, actualNextResult);
  }

  /**
   * Test {@link PermutationIterator#PermutationIterator(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return next is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link PermutationIterator#PermutationIterator(Collection)}
   */
  @Test
  @DisplayName(
      "Test new PermutationIterator(Collection); given '42'; when ArrayList() add '42'; then return next is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PermutationIterator.<init>(Collection)"})
  void testNewPermutationIterator_given42_whenArrayListAdd42_thenReturnNextIsArrayList2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    PermutationIterator<Object> actualPermutationIterator = new PermutationIterator<>(collection);

    // Assert
    List<Object> actualNextResult = actualPermutationIterator.next();
    List<Object> actualNextResult2 = actualPermutationIterator.next();
    assertFalse(actualPermutationIterator.hasNext());
    assertEquals(collection, actualNextResult);
    assertEquals(collection, actualNextResult2);
  }

  /**
   * Test {@link PermutationIterator#PermutationIterator(Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return next Empty.
   * </ul>
   *
   * <p>Method under test: {@link PermutationIterator#PermutationIterator(Collection)}
   */
  @Test
  @DisplayName("Test new PermutationIterator(Collection); when ArrayList(); then return next Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PermutationIterator.<init>(Collection)"})
  void testNewPermutationIterator_whenArrayList_thenReturnNextEmpty() {
    // Arrange and Act
    PermutationIterator<Object> actualPermutationIterator =
        new PermutationIterator<>(new ArrayList<>());

    // Assert
    List<Object> nextResult = actualPermutationIterator.next();
    assertFalse(actualPermutationIterator.hasNext());
    assertTrue(nextResult.isEmpty());
  }

  /**
   * Test {@link PermutationIterator#hasNext()}.
   *
   * <p>Method under test: {@link PermutationIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PermutationIterator.hasNext()"})
  void testHasNext() {
    // Arrange
    PermutationIterator<Object> permutationIterator = new PermutationIterator<>(new ArrayList<>());

    // Act and Assert
    assertTrue(permutationIterator.hasNext());
  }

  /**
   * Test {@link PermutationIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link PermutationIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List PermutationIterator.next()"})
  void testNext_givenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    PermutationIterator<Object> permutationIterator = new PermutationIterator<>(collection);

    // Act
    List<Object> actualNextResult = permutationIterator.next();

    // Assert
    assertEquals(1, actualNextResult.size());
    assertEquals("42", actualNextResult.get(0));
  }

  /**
   * Test {@link PermutationIterator#next()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link PermutationIterator#next()}
   */
  @Test
  @DisplayName("Test next(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List PermutationIterator.next()"})
  void testNext_thenReturnEmpty() {
    // Arrange
    PermutationIterator<Object> permutationIterator = new PermutationIterator<>(new ArrayList<>());

    // Act
    List<Object> actualNextResult = permutationIterator.next();

    // Assert
    assertFalse(permutationIterator.hasNext());
    assertTrue(actualNextResult.isEmpty());
  }

  /**
   * Test {@link PermutationIterator#remove()}.
   *
   * <p>Method under test: {@link PermutationIterator#remove()}
   */
  @Test
  @DisplayName("Test remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PermutationIterator.remove()"})
  void testRemove() {
    // Arrange
    PermutationIterator<Object> permutationIterator = new PermutationIterator<>(new ArrayList<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> permutationIterator.remove());
  }
}
