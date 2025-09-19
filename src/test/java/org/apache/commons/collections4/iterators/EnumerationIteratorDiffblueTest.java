package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.StringTokenizer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EnumerationIteratorDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link EnumerationIterator#EnumerationIterator()}
   *   <li>{@link EnumerationIterator#setEnumeration(Enumeration)}
   *   <li>{@link EnumerationIterator#getEnumeration()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void EnumerationIterator.<init>()",
    "void EnumerationIterator.<init>(Enumeration)",
    "void EnumerationIterator.<init>(Enumeration, Collection)",
    "Enumeration EnumerationIterator.getEnumeration()",
    "void EnumerationIterator.setEnumeration(Enumeration)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    EnumerationIterator<Object> actualEnumerationIterator = new EnumerationIterator<>();
    StringTokenizer enumeration = new StringTokenizer("foo");
    actualEnumerationIterator.setEnumeration(enumeration);

    // Assert
    assertSame(enumeration, actualEnumerationIterator.getEnumeration());
  }

  /**
   * Test getters and setters.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link EnumerationIterator#EnumerationIterator(Enumeration, Collection)}
   *   <li>{@link EnumerationIterator#setEnumeration(Enumeration)}
   *   <li>{@link EnumerationIterator#getEnumeration()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters; when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void EnumerationIterator.<init>()",
    "void EnumerationIterator.<init>(Enumeration)",
    "void EnumerationIterator.<init>(Enumeration, Collection)",
    "Enumeration EnumerationIterator.getEnumeration()",
    "void EnumerationIterator.setEnumeration(Enumeration)"
  })
  void testGettersAndSetters_whenArrayList() {
    // Arrange
    StringTokenizer enumeration = new StringTokenizer("foo");

    // Act
    EnumerationIterator<Object> actualEnumerationIterator =
        new EnumerationIterator<>(enumeration, new ArrayList<>());
    StringTokenizer enumeration2 = new StringTokenizer("foo");
    actualEnumerationIterator.setEnumeration(enumeration2);

    // Assert
    assertSame(enumeration2, actualEnumerationIterator.getEnumeration());
  }

  /**
   * Test getters and setters.
   *
   * <ul>
   *   <li>When {@link StringTokenizer#StringTokenizer(String)} with {@code foo}.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link EnumerationIterator#EnumerationIterator(Enumeration)}
   *   <li>{@link EnumerationIterator#setEnumeration(Enumeration)}
   *   <li>{@link EnumerationIterator#getEnumeration()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters; when StringTokenizer(String) with 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void EnumerationIterator.<init>()",
    "void EnumerationIterator.<init>(Enumeration)",
    "void EnumerationIterator.<init>(Enumeration, Collection)",
    "Enumeration EnumerationIterator.getEnumeration()",
    "void EnumerationIterator.setEnumeration(Enumeration)"
  })
  void testGettersAndSetters_whenStringTokenizerWithFoo() {
    // Arrange and Act
    EnumerationIterator<Object> actualEnumerationIterator =
        new EnumerationIterator<>(new StringTokenizer("foo"));
    StringTokenizer enumeration = new StringTokenizer("foo");
    actualEnumerationIterator.setEnumeration(enumeration);

    // Assert
    assertSame(enumeration, actualEnumerationIterator.getEnumeration());
  }

  /**
   * Test {@link EnumerationIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link EnumerationIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean EnumerationIterator.hasNext()"})
  void testHasNext_thenReturnFalse() {
    // Arrange
    EnumerationIterator<Object> enumerationIterator = new EnumerationIterator<>();
    enumerationIterator.setEnumeration(new StringTokenizer("foo", "foo"));

    // Act and Assert
    assertFalse(enumerationIterator.hasNext());
  }

  /**
   * Test {@link EnumerationIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link EnumerationIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean EnumerationIterator.hasNext()"})
  void testHasNext_thenReturnTrue() {
    // Arrange
    EnumerationIterator<Object> enumerationIterator = new EnumerationIterator<>();
    enumerationIterator.setEnumeration(new StringTokenizer("foo"));

    // Act and Assert
    assertTrue(enumerationIterator.hasNext());
  }

  /**
   * Test {@link EnumerationIterator#next()}.
   *
   * <ul>
   *   <li>Then return {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link EnumerationIterator#next()}
   */
  @Test
  @DisplayName("Test next(); then return 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object EnumerationIterator.next()"})
  void testNext_thenReturnFoo() {
    // Arrange
    EnumerationIterator<Object> enumerationIterator = new EnumerationIterator<>();
    enumerationIterator.setEnumeration(new StringTokenizer("foo"));

    // Act and Assert
    assertEquals("foo", enumerationIterator.next());
    assertFalse(enumerationIterator.hasNext());
  }

  /**
   * Test {@link EnumerationIterator#remove()}.
   *
   * <ul>
   *   <li>Given {@link EnumerationIterator#EnumerationIterator()}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link EnumerationIterator#remove()}
   */
  @Test
  @DisplayName(
      "Test remove(); given EnumerationIterator(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EnumerationIterator.remove()"})
  void testRemove_givenEnumerationIterator_thenThrowUnsupportedOperationException() {
    // Arrange
    EnumerationIterator<Object> enumerationIterator = new EnumerationIterator<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> enumerationIterator.remove());
  }

  /**
   * Test {@link EnumerationIterator#remove()}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link EnumerationIterator#remove()}
   */
  @Test
  @DisplayName("Test remove(); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EnumerationIterator.remove()"})
  void testRemove_thenThrowIllegalStateException() {
    // Arrange
    StringTokenizer enumeration =
        new StringTokenizer("No Collection associated with this Iterator");
    EnumerationIterator<Object> enumerationIterator =
        new EnumerationIterator<>(enumeration, new ArrayList<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> enumerationIterator.remove());
  }
}
