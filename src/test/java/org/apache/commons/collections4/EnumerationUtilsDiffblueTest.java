package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import org.apache.commons.collections4.iterators.IteratorIterable;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EnumerationUtilsDiffblueTest {
  /**
   * Test {@link EnumerationUtils#asIterable(Enumeration)}.
   * <p>
   * Method under test: {@link EnumerationUtils#asIterable(Enumeration)}
   */
  @Test
  @DisplayName("Test asIterable(Enumeration)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Iterable EnumerationUtils.asIterable(Enumeration)"})
  void testAsIterable() {
    // Arrange and Act
    Iterable<Object> actualAsIterableResult = EnumerationUtils.asIterable(new StringTokenizer("foo"));
    Iterator<Object> actualIteratorResult = actualAsIterableResult.iterator();

    // Assert
    assertTrue(actualAsIterableResult instanceof IteratorIterable);
    Iterator<Object> iteratorResult = actualAsIterableResult.iterator();
    assertEquals("foo", iteratorResult.next());
    assertFalse(iteratorResult.hasNext());
    assertSame(iteratorResult, actualIteratorResult);
  }

  /**
   * Test {@link EnumerationUtils#get(Enumeration, int)}.
   * <ul>
   *   <li>When {@link StringTokenizer#StringTokenizer(String)} with {@code Entry does not exist:}.</li>
   *   <li>Then return {@code does}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EnumerationUtils#get(Enumeration, int)}
   */
  @Test
  @DisplayName("Test get(Enumeration, int); when StringTokenizer(String) with 'Entry does not exist:'; then return 'does'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object EnumerationUtils.get(Enumeration, int)"})
  void testGet_whenStringTokenizerWithEntryDoesNotExist_thenReturnDoes() {
    // Arrange
    StringTokenizer e = new StringTokenizer("Entry does not exist: ");

    // Act and Assert
    assertEquals("does", EnumerationUtils.get(e, 1));
    assertTrue(e.hasMoreElements());
  }

  /**
   * Test {@link EnumerationUtils#get(Enumeration, int)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then return {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EnumerationUtils#get(Enumeration, int)}
   */
  @Test
  @DisplayName("Test get(Enumeration, int); when zero; then return 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object EnumerationUtils.get(Enumeration, int)"})
  void testGet_whenZero_thenReturnFoo() {
    // Arrange
    StringTokenizer e = new StringTokenizer("foo");

    // Act and Assert
    assertEquals("foo", EnumerationUtils.get(e, 0));
    assertFalse(e.hasMoreElements());
  }

  /**
   * Test {@link EnumerationUtils#toList(StringTokenizer)} with {@code stringTokenizer}.
   * <ul>
   *   <li>When {@link StringTokenizer#StringTokenizer(String)} with {@code foo}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link EnumerationUtils#toList(StringTokenizer)}
   */
  @Test
  @DisplayName("Test toList(StringTokenizer) with 'stringTokenizer'; when StringTokenizer(String) with 'foo'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List EnumerationUtils.toList(StringTokenizer)"})
  void testToListWithStringTokenizer_whenStringTokenizerWithFoo_thenReturnSizeIsOne() {
    // Arrange
    StringTokenizer stringTokenizer = new StringTokenizer("foo");

    // Act
    List<String> actualToListResult = EnumerationUtils.toList(stringTokenizer);

    // Assert
    assertEquals(1, actualToListResult.size());
    assertEquals("foo", actualToListResult.get(0));
    assertFalse(stringTokenizer.hasMoreElements());
  }

  /**
   * Test {@link EnumerationUtils#toSet(Enumeration)}.
   * <ul>
   *   <li>When {@link StringTokenizer#StringTokenizer(String)} with {@code foo}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link EnumerationUtils#toSet(Enumeration)}
   */
  @Test
  @DisplayName("Test toSet(Enumeration); when StringTokenizer(String) with 'foo'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set EnumerationUtils.toSet(Enumeration)"})
  void testToSet_whenStringTokenizerWithFoo_thenReturnSizeIsOne() {
    // Arrange
    StringTokenizer enumeration = new StringTokenizer("foo");

    // Act
    Set<Object> actualToSetResult = EnumerationUtils.toSet(enumeration);

    // Assert
    assertEquals(1, actualToSetResult.size());
    assertFalse(enumeration.hasMoreElements());
  }
}
