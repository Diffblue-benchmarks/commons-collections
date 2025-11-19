package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SingletonIteratorDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <ul>
   *   <li>When {@code Object}.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SingletonIterator#SingletonIterator(Object)}
   *   <li>{@link SingletonIterator#reset()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters; when 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SingletonIterator.<init>(Object)",
    "void SingletonIterator.<init>(Object, boolean)",
    "void SingletonIterator.reset()"
  })
  void testGettersAndSetters_whenObject() {
    // Arrange and Act
    SingletonIterator<Object> actualSingletonIterator = new SingletonIterator<>("Object");
    actualSingletonIterator.reset();

    // Assert
    assertEquals("Object", actualSingletonIterator.next());
    assertFalse(actualSingletonIterator.hasNext());
  }

  /**
   * Test getters and setters.
   *
   * <ul>
   *   <li>When {@code true}.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SingletonIterator#SingletonIterator(Object, boolean)}
   *   <li>{@link SingletonIterator#reset()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters; when 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SingletonIterator.<init>(Object)",
    "void SingletonIterator.<init>(Object, boolean)",
    "void SingletonIterator.reset()"
  })
  void testGettersAndSetters_whenTrue() {
    // Arrange and Act
    SingletonIterator<Object> actualSingletonIterator = new SingletonIterator<>("Object", true);
    actualSingletonIterator.reset();

    // Assert
    assertEquals("Object", actualSingletonIterator.next());
    assertFalse(actualSingletonIterator.hasNext());
  }

  /**
   * Test {@link SingletonIterator#hasNext()}.
   *
   * <p>Method under test: {@link SingletonIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SingletonIterator.hasNext()"})
  void testHasNext() {
    // Arrange
    SingletonIterator<Object> singletonIterator = new SingletonIterator<>("Object", true);

    // Act and Assert
    assertTrue(singletonIterator.hasNext());
  }

  /**
   * Test {@link SingletonIterator#next()}.
   *
   * <p>Method under test: {@link SingletonIterator#next()}
   */
  @Test
  @DisplayName("Test next()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object SingletonIterator.next()"})
  void testNext() {
    // Arrange
    SingletonIterator<Object> singletonIterator = new SingletonIterator<>("Object", true);

    // Act and Assert
    assertEquals("Object", singletonIterator.next());
    assertFalse(singletonIterator.hasNext());
  }

  /**
   * Test {@link SingletonIterator#remove()}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link SingletonIterator#remove()}
   */
  @Test
  @DisplayName("Test remove(); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SingletonIterator.remove()"})
  void testRemove_thenThrowIllegalStateException() {
    // Arrange
    SingletonIterator<Object> singletonIterator = new SingletonIterator<>("Object", true);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> singletonIterator.remove());
  }

  /**
   * Test {@link SingletonIterator#remove()}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link SingletonIterator#remove()}
   */
  @Test
  @DisplayName("Test remove(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SingletonIterator.remove()"})
  void testRemove_thenThrowUnsupportedOperationException() {
    // Arrange
    SingletonIterator<Object> singletonIterator = new SingletonIterator<>("Object", false);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> singletonIterator.remove());
  }
}
