package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.StringTokenizer;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class EnumerationIteratorDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link EnumerationIterator#EnumerationIterator()}
   *   <li>{@link EnumerationIterator#setEnumeration(Enumeration)}
   *   <li>{@link EnumerationIterator#getEnumeration()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EnumerationIterator.<init>()", "void EnumerationIterator.<init>(Enumeration)",
      "void EnumerationIterator.<init>(Enumeration, Collection)", "Enumeration EnumerationIterator.getEnumeration()",
      "void EnumerationIterator.setEnumeration(Enumeration)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    EnumerationIterator<Object> actualEnumerationIterator = new EnumerationIterator<>();
    StringTokenizer enumeration = new StringTokenizer("foo");
    actualEnumerationIterator.setEnumeration(enumeration);

    // Assert
    assertSame(enumeration, actualEnumerationIterator.getEnumeration());
  }

  /**
   * Test getters and setters.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link EnumerationIterator#EnumerationIterator(Enumeration, Collection)}
   *   <li>{@link EnumerationIterator#setEnumeration(Enumeration)}
   *   <li>{@link EnumerationIterator#getEnumeration()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EnumerationIterator.<init>()", "void EnumerationIterator.<init>(Enumeration)",
      "void EnumerationIterator.<init>(Enumeration, Collection)", "Enumeration EnumerationIterator.getEnumeration()",
      "void EnumerationIterator.setEnumeration(Enumeration)"})
  public void testGettersAndSetters_whenArrayList() {
    // Arrange
    StringTokenizer enumeration = new StringTokenizer("foo");

    // Act
    EnumerationIterator<Object> actualEnumerationIterator = new EnumerationIterator<>(enumeration, new ArrayList<>());
    StringTokenizer enumeration2 = new StringTokenizer("foo");
    actualEnumerationIterator.setEnumeration(enumeration2);

    // Assert
    assertSame(enumeration2, actualEnumerationIterator.getEnumeration());
  }

  /**
   * Test getters and setters.
   * <ul>
   *   <li>When {@link StringTokenizer#StringTokenizer(String)} with {@code foo}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link EnumerationIterator#EnumerationIterator(Enumeration)}
   *   <li>{@link EnumerationIterator#setEnumeration(Enumeration)}
   *   <li>{@link EnumerationIterator#getEnumeration()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EnumerationIterator.<init>()", "void EnumerationIterator.<init>(Enumeration)",
      "void EnumerationIterator.<init>(Enumeration, Collection)", "Enumeration EnumerationIterator.getEnumeration()",
      "void EnumerationIterator.setEnumeration(Enumeration)"})
  public void testGettersAndSetters_whenStringTokenizerWithFoo() {
    // Arrange and Act
    EnumerationIterator<Object> actualEnumerationIterator = new EnumerationIterator<>(new StringTokenizer("foo"));
    StringTokenizer enumeration = new StringTokenizer("foo");
    actualEnumerationIterator.setEnumeration(enumeration);

    // Assert
    assertSame(enumeration, actualEnumerationIterator.getEnumeration());
  }

  /**
   * Test {@link EnumerationIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EnumerationIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean EnumerationIterator.hasNext()"})
  public void testHasNext_thenReturnFalse() {
    // Arrange
    EnumerationIterator<Object> enumerationIterator = new EnumerationIterator<>();
    enumerationIterator.setEnumeration(new StringTokenizer(""));

    // Act and Assert
    assertFalse(enumerationIterator.hasNext());
  }

  /**
   * Test {@link EnumerationIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EnumerationIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean EnumerationIterator.hasNext()"})
  public void testHasNext_thenReturnTrue() {
    // Arrange
    EnumerationIterator<Object> enumerationIterator = new EnumerationIterator<>();
    enumerationIterator.setEnumeration(new StringTokenizer("foo"));

    // Act and Assert
    assertTrue(enumerationIterator.hasNext());
  }

  /**
   * Test {@link EnumerationIterator#next()}.
   * <ul>
   *   <li>Then return {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EnumerationIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object EnumerationIterator.next()"})
  public void testNext_thenReturnFoo() {
    // Arrange
    EnumerationIterator<Object> enumerationIterator = new EnumerationIterator<>();
    enumerationIterator.setEnumeration(new StringTokenizer("foo"));

    // Act and Assert
    assertEquals("foo", enumerationIterator.next());
    assertFalse(enumerationIterator.hasNext());
  }

  /**
   * Test {@link EnumerationIterator#remove()}.
   * <ul>
   *   <li>Given {@link EnumerationIterator#EnumerationIterator()}.</li>
   *   <li>Then throw {@link UnsupportedOperationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EnumerationIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EnumerationIterator.remove()"})
  public void testRemove_givenEnumerationIterator_thenThrowUnsupportedOperationException() {
    // Arrange
    EnumerationIterator<Object> enumerationIterator = new EnumerationIterator<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> enumerationIterator.remove());
  }

  /**
   * Test {@link EnumerationIterator#remove()}.
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EnumerationIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EnumerationIterator.remove()"})
  public void testRemove_thenThrowIllegalStateException() {
    // Arrange
    StringTokenizer enumeration = new StringTokenizer("No Collection associated with this Iterator");
    EnumerationIterator<Object> enumerationIterator = new EnumerationIterator<>(enumeration, new ArrayList<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> enumerationIterator.remove());
  }
}
