package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import org.apache.commons.collections4.iterators.IteratorIterable;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class EnumerationUtilsDiffblueTest {
  /**
   * Test {@link EnumerationUtils#asIterable(Enumeration)}.
   * <p>
   * Method under test: {@link EnumerationUtils#asIterable(Enumeration)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable EnumerationUtils.asIterable(Enumeration)"})
  public void testAsIterable() {
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
   *   <li>When zero.</li>
   *   <li>Then return {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EnumerationUtils#get(Enumeration, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object EnumerationUtils.get(Enumeration, int)"})
  public void testGet_whenZero_thenReturnFoo() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List EnumerationUtils.toList(StringTokenizer)"})
  public void testToListWithStringTokenizer_whenStringTokenizerWithFoo_thenReturnSizeIsOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set EnumerationUtils.toSet(Enumeration)"})
  public void testToSet_whenStringTokenizerWithFoo_thenReturnSizeIsOne() {
    // Arrange
    StringTokenizer enumeration = new StringTokenizer("foo");

    // Act
    Set<Object> actualToSetResult = EnumerationUtils.toSet(enumeration);

    // Assert
    assertEquals(1, actualToSetResult.size());
    assertFalse(enumeration.hasMoreElements());
  }
}
