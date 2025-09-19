package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CartesianProductIteratorDiffblueTest {
  /**
   * Test {@link CartesianProductIterator#CartesianProductIterator(Iterable[])}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return next size is one.
   * </ul>
   *
   * <p>Method under test: {@link CartesianProductIterator#CartesianProductIterator(Iterable[])}
   */
  @Test
  @DisplayName(
      "Test new CartesianProductIterator(Iterable[]); given '42'; then return next size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CartesianProductIterator.<init>(Iterable[])"})
  void testNewCartesianProductIterator_given42_thenReturnNextSizeIsOne() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    // Act
    CartesianProductIterator<Object> actualCartesianProductIterator =
        new CartesianProductIterator<>(objectList);

    // Assert
    List<Object> nextResult = actualCartesianProductIterator.next();
    assertEquals(1, nextResult.size());
    assertEquals("42", nextResult.get(0));
    assertFalse(actualCartesianProductIterator.hasNext());
  }

  /**
   * Test {@link CartesianProductIterator#CartesianProductIterator(Iterable[])}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CartesianProductIterator#CartesianProductIterator(Iterable[])}
   */
  @Test
  @DisplayName("Test new CartesianProductIterator(Iterable[]); when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CartesianProductIterator.<init>(Iterable[])"})
  void testNewCartesianProductIterator_whenArrayList() {
    // Arrange and Act
    CartesianProductIterator<Object> actualCartesianProductIterator =
        new CartesianProductIterator<>(new ArrayList<>());

    // Assert
    assertFalse(actualCartesianProductIterator.hasNext());
  }

  /**
   * Test {@link CartesianProductIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CartesianProductIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CartesianProductIterator.hasNext()"})
  void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    CartesianProductIterator<Object> cartesianProductIterator =
        new CartesianProductIterator<>(objectList);

    // Act and Assert
    assertTrue(cartesianProductIterator.hasNext());
  }

  /**
   * Test {@link CartesianProductIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CartesianProductIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CartesianProductIterator.hasNext()"})
  void testHasNext_thenReturnFalse() {
    // Arrange
    CartesianProductIterator<Object> cartesianProductIterator =
        new CartesianProductIterator<>(new ArrayList<>());

    // Act and Assert
    assertFalse(cartesianProductIterator.hasNext());
  }

  /**
   * Test {@link CartesianProductIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CartesianProductIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List CartesianProductIterator.next()"})
  void testNext_givenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    CartesianProductIterator<Object> cartesianProductIterator =
        new CartesianProductIterator<>(objectList);

    // Act
    List<Object> actualNextResult = cartesianProductIterator.next();

    // Assert
    assertEquals(1, actualNextResult.size());
    assertEquals("42", actualNextResult.get(0));
    assertFalse(cartesianProductIterator.hasNext());
  }

  /**
   * Test {@link CartesianProductIterator#next()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link CartesianProductIterator#next()}
   */
  @Test
  @DisplayName("Test next(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List CartesianProductIterator.next()"})
  void testNext_thenThrowNoSuchElementException() {
    // Arrange
    CartesianProductIterator<Object> cartesianProductIterator =
        new CartesianProductIterator<>(new ArrayList<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> cartesianProductIterator.next());
  }

  /**
   * Test {@link CartesianProductIterator#remove()}.
   *
   * <p>Method under test: {@link CartesianProductIterator#remove()}
   */
  @Test
  @DisplayName("Test remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CartesianProductIterator.remove()"})
  void testRemove() {
    // Arrange
    CartesianProductIterator<Object> cartesianProductIterator =
        new CartesianProductIterator<>(new ArrayList<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> cartesianProductIterator.remove());
  }
}
