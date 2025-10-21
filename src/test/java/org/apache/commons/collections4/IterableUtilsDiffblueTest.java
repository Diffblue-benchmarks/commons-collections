package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.collections4.functors.DefaultEquator;
import org.apache.commons.collections4.iterators.BoundedIterator;
import org.apache.commons.collections4.iterators.CollatingIterator;
import org.apache.commons.collections4.iterators.FilterIterator;
import org.apache.commons.collections4.iterators.ReverseListIterator;
import org.apache.commons.collections4.iterators.SkippingIterator;
import org.apache.commons.collections4.iterators.TransformIterator;
import org.apache.commons.collections4.iterators.UniqueFilterIterator;
import org.apache.commons.collections4.iterators.UnmodifiableIterator;
import org.apache.commons.collections4.iterators.ZippingIterator;
import org.apache.commons.collections4.set.CompositeSet;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class IterableUtilsDiffblueTest {
  /**
   * Test {@link IterableUtils#boundedIterable(Iterable, long)}.
   * <p>
   * Method under test: {@link IterableUtils#boundedIterable(Iterable, long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable IterableUtils.boundedIterable(Iterable, long)"})
  public void testBoundedIterable() {
    // Arrange and Act
    Iterable<Object> actualBoundedIterableResult = IterableUtils.boundedIterable(new ArrayList<>(), 3L);
    Iterator<Object> actualIteratorResult = actualBoundedIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof BoundedIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#chainedIterable(Iterable, Iterable)} with {@code a}, {@code b}.
   * <p>
   * Method under test: {@link IterableUtils#chainedIterable(Iterable, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable IterableUtils.chainedIterable(Iterable, Iterable)"})
  public void testChainedIterableWithAB() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Iterable<Object> actualChainedIterableResult = IterableUtils.chainedIterable(a, new ArrayList<>());

    // Assert
    assertFalse(actualChainedIterableResult.iterator().hasNext());
  }

  /**
   * Test {@link IterableUtils#chainedIterable(Iterable, Iterable, Iterable)} with {@code a}, {@code b}, {@code c}.
   * <p>
   * Method under test: {@link IterableUtils#chainedIterable(Iterable, Iterable, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable IterableUtils.chainedIterable(Iterable, Iterable, Iterable)"})
  public void testChainedIterableWithABC() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    ArrayList<Object> b = new ArrayList<>();

    // Act
    Iterable<Object> actualChainedIterableResult = IterableUtils.chainedIterable(a, b, new ArrayList<>());

    // Assert
    assertFalse(actualChainedIterableResult.iterator().hasNext());
  }

  /**
   * Test {@link IterableUtils#chainedIterable(Iterable, Iterable, Iterable, Iterable)} with {@code a}, {@code b}, {@code c}, {@code d}.
   * <p>
   * Method under test: {@link IterableUtils#chainedIterable(Iterable, Iterable, Iterable, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable IterableUtils.chainedIterable(Iterable, Iterable, Iterable, Iterable)"})
  public void testChainedIterableWithABCD() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    ArrayList<Object> b = new ArrayList<>();
    ArrayList<Object> c = new ArrayList<>();

    // Act
    Iterable<Object> actualChainedIterableResult = IterableUtils.chainedIterable(a, b, c, new ArrayList<>());

    // Assert
    assertFalse(actualChainedIterableResult.iterator().hasNext());
  }

  /**
   * Test {@link IterableUtils#chainedIterable(Iterable[])} with {@code iterables}.
   * <p>
   * Method under test: {@link IterableUtils#chainedIterable(Iterable[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable IterableUtils.chainedIterable(Iterable[])"})
  public void testChainedIterableWithIterables() {
    // Arrange and Act
    Iterable<Object> actualChainedIterableResult = IterableUtils.chainedIterable(new ArrayList<>());

    // Assert
    assertFalse(actualChainedIterableResult.iterator().hasNext());
  }

  /**
   * Test {@link IterableUtils#collatedIterable(Iterable, Iterable)} with {@code a}, {@code b}.
   * <p>
   * Method under test: {@link IterableUtils#collatedIterable(Iterable, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable IterableUtils.collatedIterable(Iterable, Iterable)"})
  public void testCollatedIterableWithAB() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Iterable<Object> actualCollatedIterableResult = IterableUtils.collatedIterable(a, new ArrayList<>());
    Iterator<Object> actualIteratorResult = actualCollatedIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof CollatingIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object, Equator)} with {@code iterable}, {@code object}, {@code equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#contains(Iterable, Object, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object, Equator)"})
  public void testContainsWithIterableObjectEquator_given42_when42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertTrue(IterableUtils.contains(iterable, "42", equator));
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object, Equator)} with {@code iterable}, {@code object}, {@code equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#contains(Iterable, Object, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object, Equator)"})
  public void testContainsWithIterableObjectEquator_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertFalse(IterableUtils.contains(iterable, "Object", equator));
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object, Equator)} with {@code iterable}, {@code object}, {@code equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#contains(Iterable, Object, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object, Equator)"})
  public void testContainsWithIterableObjectEquator_given42_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertFalse(IterableUtils.contains(iterable, null, equator));
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object, Equator)} with {@code iterable}, {@code object}, {@code equator}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#contains(Iterable, Object, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object, Equator)"})
  public void testContainsWithIterableObjectEquator_givenNull_whenArrayListAddNull() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add(null);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertTrue(IterableUtils.contains(iterable, null, equator));
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object, Equator)} with {@code iterable}, {@code object}, {@code equator}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#contains(Iterable, Object, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object, Equator)"})
  public void testContainsWithIterableObjectEquator_whenArrayList_thenReturnFalse() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertFalse(IterableUtils.contains(iterable, "Object", equator));
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object, Equator)} with {@code iterable}, {@code object}, {@code equator}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#contains(Iterable, Object, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object, Equator)"})
  public void testContainsWithIterableObjectEquator_whenNull_thenReturnFalse() {
    // Arrange
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertFalse(IterableUtils.contains(null, null, equator));
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object)} with {@code iterable}, {@code object}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then calls {@link Iterable#iterator()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#contains(Iterable, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object)"})
  public void testContainsWithIterableObject_givenArrayListAdd42_thenCallsIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(objectList.iterator());

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, null);

    // Assert
    verify(iterable).iterator();
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object)} with {@code iterable}, {@code object}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#contains(Iterable, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object)"})
  public void testContainsWithIterableObject_givenArrayListAdd42_when42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(objectList.iterator());

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, "42");

    // Assert
    verify(iterable).iterator();
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object)} with {@code iterable}, {@code object}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>When one.</li>
   *   <li>Then calls {@link Iterable#iterator()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#contains(Iterable, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object)"})
  public void testContainsWithIterableObject_givenArrayListAdd42_whenOne_thenCallsIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(objectList.iterator());

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, 1);

    // Assert
    verify(iterable).iterator();
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object)} with {@code iterable}, {@code object}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} iterator.</li>
   *   <li>Then calls {@link Iterable#iterator()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#contains(Iterable, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object)"})
  public void testContainsWithIterableObject_givenArrayListIterator_thenCallsIterator() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);

    ArrayList<Object> objectList = new ArrayList<>();
    when(iterable.iterator()).thenReturn(objectList.iterator());

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, null);

    // Assert
    verify(iterable).iterator();
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object)} with {@code iterable}, {@code object}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#contains(Iterable, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object)"})
  public void testContainsWithIterableObject_whenArrayList_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(IterableUtils.contains(new ArrayList<>(), "Object"));
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object)} with {@code iterable}, {@code object}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#contains(Iterable, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object)"})
  public void testContainsWithIterableObject_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(IterableUtils.contains(null, null));
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object)} with {@code iterable}, {@code object}.
   * <ul>
   *   <li>When {@code Object}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#contains(Iterable, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object)"})
  public void testContainsWithIterableObject_whenObject_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(IterableUtils.contains(null, "Object"));
  }

  /**
   * Test {@link IterableUtils#countMatches(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#countMatches(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"long IterableUtils.countMatches(Iterable, Predicate)"})
  public void testCountMatches_givenFalse_whenPredicateTestReturnFalse_thenReturnZero() {
    // Arrange
    ArrayList<Object> input = new ArrayList<>();
    input.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    long actualCountMatchesResult = IterableUtils.countMatches(input, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(0L, actualCountMatchesResult);
  }

  /**
   * Test {@link IterableUtils#countMatches(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#countMatches(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"long IterableUtils.countMatches(Iterable, Predicate)"})
  public void testCountMatches_givenTrue_whenPredicateTestReturnTrue_thenReturnOne() {
    // Arrange
    ArrayList<Object> input = new ArrayList<>();
    input.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    long actualCountMatchesResult = IterableUtils.countMatches(input, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(1L, actualCountMatchesResult);
  }

  /**
   * Test {@link IterableUtils#countMatches(Iterable, Predicate)}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#countMatches(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"long IterableUtils.countMatches(Iterable, Predicate)"})
  public void testCountMatches_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> input = new ArrayList<>();
    input.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("predicate"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> IterableUtils.countMatches(input, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#countMatches(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#countMatches(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"long IterableUtils.countMatches(Iterable, Predicate)"})
  public void testCountMatches_whenArrayList_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0L, IterableUtils.countMatches(new ArrayList<>(), mock(Predicate.class)));
  }

  /**
   * Test {@link IterableUtils#countMatches(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#countMatches(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"long IterableUtils.countMatches(Iterable, Predicate)"})
  public void testCountMatches_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0L, IterableUtils.countMatches(null, mock(Predicate.class)));
  }

  /**
   * Test {@link IterableUtils#duplicateList(Iterable)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#duplicateList(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IterableUtils.duplicateList(Iterable)"})
  public void testDuplicateList_given42_whenArrayListAdd42_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act
    List<Object> actualDuplicateListResult = IterableUtils.duplicateList(iterable);

    // Assert
    assertTrue(actualDuplicateListResult.isEmpty());
  }

  /**
   * Test {@link IterableUtils#duplicateList(Iterable)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#duplicateList(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IterableUtils.duplicateList(Iterable)"})
  public void testDuplicateList_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    // Act
    List<Object> actualDuplicateListResult = IterableUtils.duplicateList(iterable);

    // Assert
    assertEquals(1, actualDuplicateListResult.size());
    assertEquals("42", actualDuplicateListResult.get(0));
  }

  /**
   * Test {@link IterableUtils#duplicateList(Iterable)}.
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@link CompositeSet#CompositeSet()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#duplicateList(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IterableUtils.duplicateList(Iterable)"})
  public void testDuplicateList_givenCompositeSet_whenArrayListAddCompositeSet_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add(new CompositeSet<>());

    // Act
    List<Object> actualDuplicateListResult = IterableUtils.duplicateList(iterable);

    // Assert
    assertTrue(actualDuplicateListResult.isEmpty());
  }

  /**
   * Test {@link IterableUtils#duplicateList(Iterable)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#duplicateList(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IterableUtils.duplicateList(Iterable)"})
  public void testDuplicateList_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    List<Object> actualDuplicateListResult = IterableUtils.duplicateList(new ArrayList<>());

    // Assert
    assertTrue(actualDuplicateListResult.isEmpty());
  }

  /**
   * Test {@link IterableUtils#duplicateSequencedSet(Iterable)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#duplicateSequencedSet(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set IterableUtils.duplicateSequencedSet(Iterable)"})
  public void testDuplicateSequencedSet_given42_whenArrayListAdd42_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act
    Set<Object> actualDuplicateSequencedSetResult = IterableUtils.duplicateSequencedSet(iterable);

    // Assert
    assertTrue(actualDuplicateSequencedSetResult.isEmpty());
  }

  /**
   * Test {@link IterableUtils#duplicateSequencedSet(Iterable)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#duplicateSequencedSet(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set IterableUtils.duplicateSequencedSet(Iterable)"})
  public void testDuplicateSequencedSet_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    // Act
    Set<Object> actualDuplicateSequencedSetResult = IterableUtils.duplicateSequencedSet(iterable);

    // Assert
    assertEquals(1, actualDuplicateSequencedSetResult.size());
  }

  /**
   * Test {@link IterableUtils#duplicateSequencedSet(Iterable)}.
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@link CompositeSet#CompositeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#duplicateSequencedSet(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set IterableUtils.duplicateSequencedSet(Iterable)"})
  public void testDuplicateSequencedSet_givenCompositeSet_whenArrayListAddCompositeSet() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add(new CompositeSet<>());

    // Act
    Set<Object> actualDuplicateSequencedSetResult = IterableUtils.duplicateSequencedSet(iterable);

    // Assert
    assertTrue(actualDuplicateSequencedSetResult.isEmpty());
  }

  /**
   * Test {@link IterableUtils#duplicateSequencedSet(Iterable)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#duplicateSequencedSet(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set IterableUtils.duplicateSequencedSet(Iterable)"})
  public void testDuplicateSequencedSet_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    Set<Object> actualDuplicateSequencedSetResult = IterableUtils.duplicateSequencedSet(new ArrayList<>());

    // Assert
    assertTrue(actualDuplicateSequencedSetResult.isEmpty());
  }

  /**
   * Test {@link IterableUtils#duplicateSet(Iterable, Collection)} with {@code iterable}, {@code duplicates}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#duplicateSet(Iterable, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection IterableUtils.duplicateSet(Iterable, Collection)"})
  public void testDuplicateSetWithIterableDuplicates_given42_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act
    Collection<Object> actualDuplicateSetResult = IterableUtils.duplicateSet(iterable, new ArrayList<>());

    // Assert
    assertTrue(actualDuplicateSetResult instanceof List);
    assertTrue(actualDuplicateSetResult.isEmpty());
  }

  /**
   * Test {@link IterableUtils#duplicateSet(Iterable, Collection)} with {@code iterable}, {@code duplicates}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#duplicateSet(Iterable, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection IterableUtils.duplicateSet(Iterable, Collection)"})
  public void testDuplicateSetWithIterableDuplicates_given42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    // Act
    Collection<Object> actualDuplicateSetResult = IterableUtils.duplicateSet(iterable, new ArrayList<>());

    // Assert
    assertTrue(actualDuplicateSetResult instanceof List);
    assertEquals(1, actualDuplicateSetResult.size());
    assertEquals("42", ((List<Object>) actualDuplicateSetResult).get(0));
  }

  /**
   * Test {@link IterableUtils#duplicateSet(Iterable, Collection)} with {@code iterable}, {@code duplicates}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#duplicateSet(Iterable, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection IterableUtils.duplicateSet(Iterable, Collection)"})
  public void testDuplicateSetWithIterableDuplicates_given42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");
    iterable.add("42");

    // Act
    Collection<Object> actualDuplicateSetResult = IterableUtils.duplicateSet(iterable, new ArrayList<>());

    // Assert
    assertTrue(actualDuplicateSetResult instanceof List);
    assertEquals(2, actualDuplicateSetResult.size());
    assertEquals("42", ((List<Object>) actualDuplicateSetResult).get(0));
    assertEquals("42", ((List<Object>) actualDuplicateSetResult).get(1));
  }

  /**
   * Test {@link IterableUtils#duplicateSet(Iterable, Collection)} with {@code iterable}, {@code duplicates}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#duplicateSet(Iterable, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection IterableUtils.duplicateSet(Iterable, Collection)"})
  public void testDuplicateSetWithIterableDuplicates_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();

    // Act
    Collection<Object> actualDuplicateSetResult = IterableUtils.duplicateSet(iterable, new ArrayList<>());

    // Assert
    assertEquals(iterable, actualDuplicateSetResult);
  }

  /**
   * Test {@link IterableUtils#duplicateSet(Iterable)} with {@code iterable}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#duplicateSet(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set IterableUtils.duplicateSet(Iterable)"})
  public void testDuplicateSetWithIterable_given42_whenArrayListAdd42_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act
    Set<Object> actualDuplicateSetResult = IterableUtils.duplicateSet(iterable);

    // Assert
    assertTrue(actualDuplicateSetResult.isEmpty());
  }

  /**
   * Test {@link IterableUtils#duplicateSet(Iterable)} with {@code iterable}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#duplicateSet(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set IterableUtils.duplicateSet(Iterable)"})
  public void testDuplicateSetWithIterable_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    // Act
    Set<Object> actualDuplicateSetResult = IterableUtils.duplicateSet(iterable);

    // Assert
    assertEquals(1, actualDuplicateSetResult.size());
  }

  /**
   * Test {@link IterableUtils#duplicateSet(Iterable)} with {@code iterable}.
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@link CompositeSet#CompositeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#duplicateSet(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set IterableUtils.duplicateSet(Iterable)"})
  public void testDuplicateSetWithIterable_givenCompositeSet_whenArrayListAddCompositeSet() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add(new CompositeSet<>());

    // Act
    Set<Object> actualDuplicateSetResult = IterableUtils.duplicateSet(iterable);

    // Assert
    assertTrue(actualDuplicateSetResult.isEmpty());
  }

  /**
   * Test {@link IterableUtils#duplicateSet(Iterable)} with {@code iterable}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#duplicateSet(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set IterableUtils.duplicateSet(Iterable)"})
  public void testDuplicateSetWithIterable_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    Set<Object> actualDuplicateSetResult = IterableUtils.duplicateSet(new ArrayList<>());

    // Assert
    assertTrue(actualDuplicateSetResult.isEmpty());
  }

  /**
   * Test {@link IterableUtils#emptyIfNull(Iterable)}.
   * <ul>
   *   <li>Then return {@link FluentIterable}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#emptyIfNull(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable IterableUtils.emptyIfNull(Iterable)"})
  public void testEmptyIfNull_thenReturnFluentIterable() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act
    Iterable<Object> actualEmptyIfNullResult = IterableUtils.emptyIfNull(iterable);

    // Assert
    assertTrue(actualEmptyIfNullResult instanceof FluentIterable);
    assertFalse(actualEmptyIfNullResult.iterator().hasNext());
    assertTrue(((FluentIterable<Object>) actualEmptyIfNullResult).toList().isEmpty());
  }

  /**
   * Test {@link IterableUtils#emptyIfNull(Iterable)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link List}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#emptyIfNull(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable IterableUtils.emptyIfNull(Iterable)"})
  public void testEmptyIfNull_whenArrayList_thenReturnList() {
    // Arrange and Act
    Iterable<Object> actualEmptyIfNullResult = IterableUtils.emptyIfNull(new ArrayList<>());

    // Assert
    assertTrue(actualEmptyIfNullResult instanceof List);
    assertFalse(actualEmptyIfNullResult.iterator().hasNext());
    assertTrue(((List<Object>) actualEmptyIfNullResult).isEmpty());
  }

  /**
   * Test {@link IterableUtils#filteredIterable(Iterable, Predicate)}.
   * <p>
   * Method under test: {@link IterableUtils#filteredIterable(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable IterableUtils.filteredIterable(Iterable, Predicate)"})
  public void testFilteredIterable() {
    // Arrange and Act
    Iterable<Object> actualFilteredIterableResult = IterableUtils.filteredIterable(new ArrayList<>(),
        mock(Predicate.class));
    Iterator<Object> actualIteratorResult = actualFilteredIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof FilterIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#find(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#find(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IterableUtils.find(Iterable, Predicate)"})
  public void testFind_givenFalse_whenPredicateTestReturnFalse_thenReturnNull() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Object actualFindResult = IterableUtils.find(iterable, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertNull(actualFindResult);
  }

  /**
   * Test {@link IterableUtils#find(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#find(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IterableUtils.find(Iterable, Predicate)"})
  public void testFind_givenTrue_whenPredicateTestReturnTrue_thenReturn42() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Object actualFindResult = IterableUtils.find(iterable, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals("42", actualFindResult);
  }

  /**
   * Test {@link IterableUtils#find(Iterable, Predicate)}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#find(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IterableUtils.find(Iterable, Predicate)"})
  public void testFind_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("predicate"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> IterableUtils.find(iterable, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#find(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#find(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IterableUtils.find(Iterable, Predicate)"})
  public void testFind_whenArrayList_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(IterableUtils.find(new ArrayList<>(), mock(Predicate.class)));
  }

  /**
   * Test {@link IterableUtils#find(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#find(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IterableUtils.find(Iterable, Predicate)"})
  public void testFind_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(IterableUtils.find(null, mock(Predicate.class)));
  }

  /**
   * Test {@link IterableUtils#first(Iterable)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#first(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IterableUtils.first(Iterable)"})
  public void testFirst_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act and Assert
    assertEquals("42", IterableUtils.first(iterable));
  }

  /**
   * Test {@link IterableUtils#first(Iterable)}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then calls {@link Iterable#iterator()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#first(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IterableUtils.first(Iterable)"})
  public void testFirst_givenArrayListAdd42_thenCallsIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(objectList.iterator());

    // Act
    Object actualFirstResult = IterableUtils.first(iterable);

    // Assert
    verify(iterable).iterator();
    assertEquals("42", actualFirstResult);
  }

  /**
   * Test {@link IterableUtils#forEach(Iterable, Closure)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link Closure} {@link Closure#accept(Object)} does nothing.</li>
   *   <li>Then calls {@link Closure#accept(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#forEach(Iterable, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void IterableUtils.forEach(Iterable, Closure)"})
  public void testForEach_given42_whenClosureAcceptDoesNothing_thenCallsAccept() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    // Act
    IterableUtils.forEach(iterable, closure);

    // Assert
    verify(closure).accept(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#forEach(Iterable, Closure)}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#forEach(Iterable, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void IterableUtils.forEach(Iterable, Closure)"})
  public void testForEach_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Closure<Object> closure = mock(Closure.class);
    doThrow(new IllegalArgumentException("closure")).when(closure).accept(Mockito.<Object>any());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> IterableUtils.forEach(iterable, closure));
    verify(closure).accept(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#forEachButLast(Iterable, Closure)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#forEachButLast(Iterable, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IterableUtils.forEachButLast(Iterable, Closure)"})
  public void testForEachButLast_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act and Assert
    assertEquals("42", IterableUtils.forEachButLast(iterable, mock(Closure.class)));
  }

  /**
   * Test {@link IterableUtils#forEachButLast(Iterable, Closure)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link Closure} {@link Closure#accept(Object)} does nothing.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#forEachButLast(Iterable, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IterableUtils.forEachButLast(Iterable, Closure)"})
  public void testForEachButLast_given42_whenClosureAcceptDoesNothing_thenReturn42() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    // Act
    Object actualForEachButLastResult = IterableUtils.forEachButLast(iterable, closure);

    // Assert
    verify(closure).accept(isA(Object.class));
    assertEquals("42", actualForEachButLastResult);
  }

  /**
   * Test {@link IterableUtils#forEachButLast(Iterable, Closure)}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#forEachButLast(Iterable, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IterableUtils.forEachButLast(Iterable, Closure)"})
  public void testForEachButLast_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");
    Closure<Object> closure = mock(Closure.class);
    doThrow(new IllegalArgumentException("closure")).when(closure).accept(Mockito.<Object>any());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> IterableUtils.forEachButLast(iterable, closure));
    verify(closure).accept(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#forEachButLast(Iterable, Closure)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#forEachButLast(Iterable, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IterableUtils.forEachButLast(Iterable, Closure)"})
  public void testForEachButLast_whenArrayList_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(IterableUtils.forEachButLast(new ArrayList<>(), mock(Closure.class)));
  }

  /**
   * Test {@link IterableUtils#forEachButLast(Iterable, Closure)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#forEachButLast(Iterable, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IterableUtils.forEachButLast(Iterable, Closure)"})
  public void testForEachButLast_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(IterableUtils.forEachButLast(null, mock(Closure.class)));
  }

  /**
   * Test {@link IterableUtils#frequency(Iterable, Object)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#frequency(Iterable, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IterableUtils.frequency(Iterable, Object)"})
  public void testFrequency_given42_whenArrayListAdd42_thenReturnZero() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act and Assert
    assertEquals(0, IterableUtils.frequency(iterable, "Obj"));
  }

  /**
   * Test {@link IterableUtils#frequency(Iterable, Object)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#frequency(Iterable, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IterableUtils.frequency(Iterable, Object)"})
  public void testFrequency_given42_whenArrayListAdd42_thenReturnZero2() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act and Assert
    assertEquals(0, IterableUtils.frequency(iterable, null));
  }

  /**
   * Test {@link IterableUtils#frequency(Iterable, Object)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code null}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#frequency(Iterable, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IterableUtils.frequency(Iterable, Object)"})
  public void testFrequency_givenNull_whenArrayListAddNull_thenReturnOne() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add(null);

    // Act and Assert
    assertEquals(1, IterableUtils.frequency(iterable, null));
  }

  /**
   * Test {@link IterableUtils#frequency(Iterable, Object)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#frequency(Iterable, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IterableUtils.frequency(Iterable, Object)"})
  public void testFrequency_whenArrayList_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, IterableUtils.frequency(new ArrayList<>(), "Obj"));
  }

  /**
   * Test {@link IterableUtils#frequency(Iterable, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#frequency(Iterable, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IterableUtils.frequency(Iterable, Object)"})
  public void testFrequency_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, IterableUtils.frequency(null, null));
  }

  /**
   * Test {@link IterableUtils#get(Iterable, int)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#get(Iterable, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IterableUtils.get(Iterable, int)"})
  public void testGet_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    // Act and Assert
    assertEquals("42", IterableUtils.get(iterable, 1));
  }

  /**
   * Test {@link IterableUtils#get(Iterable, int)}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then calls {@link Iterable#iterator()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#get(Iterable, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IterableUtils.get(Iterable, int)"})
  public void testGet_givenArrayListAdd42_thenCallsIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(objectList.iterator());

    // Act
    Object actualGetResult = IterableUtils.get(iterable, 0);

    // Assert
    verify(iterable).iterator();
    assertEquals("42", actualGetResult);
  }

  /**
   * Test {@link IterableUtils#indexOf(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@link CollectionUtils#INDEX_NOT_FOUND}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#indexOf(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IterableUtils.indexOf(Iterable, Predicate)"})
  public void testIndexOf_givenFalse_whenPredicateTestReturnFalse_thenReturnIndex_not_found() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    int actualIndexOfResult = IterableUtils.indexOf(iterable, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualIndexOfResult);
  }

  /**
   * Test {@link IterableUtils#indexOf(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#indexOf(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IterableUtils.indexOf(Iterable, Predicate)"})
  public void testIndexOf_givenTrue_whenPredicateTestReturnTrue_thenReturnZero() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    int actualIndexOfResult = IterableUtils.indexOf(iterable, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(0, actualIndexOfResult);
  }

  /**
   * Test {@link IterableUtils#indexOf(Iterable, Predicate)}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#indexOf(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IterableUtils.indexOf(Iterable, Predicate)"})
  public void testIndexOf_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("predicate"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> IterableUtils.indexOf(iterable, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#indexOf(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link CollectionUtils#INDEX_NOT_FOUND}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#indexOf(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IterableUtils.indexOf(Iterable, Predicate)"})
  public void testIndexOf_whenArrayList_thenReturnIndex_not_found() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, IterableUtils.indexOf(new ArrayList<>(), mock(Predicate.class)));
  }

  /**
   * Test {@link IterableUtils#indexOf(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link CollectionUtils#INDEX_NOT_FOUND}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#indexOf(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IterableUtils.indexOf(Iterable, Predicate)"})
  public void testIndexOf_whenNull_thenReturnIndex_not_found() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, IterableUtils.indexOf(null, mock(Predicate.class)));
  }

  /**
   * Test {@link IterableUtils#isEmpty(Iterable)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#isEmpty(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.isEmpty(Iterable)"})
  public void testIsEmpty_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act and Assert
    assertFalse(IterableUtils.isEmpty(iterable));
  }

  /**
   * Test {@link IterableUtils#isEmpty(Iterable)}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#isEmpty(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.isEmpty(Iterable)"})
  public void testIsEmpty_givenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(objectList.iterator());

    // Act
    boolean actualIsEmptyResult = IterableUtils.isEmpty(iterable);

    // Assert
    verify(iterable).iterator();
    assertFalse(actualIsEmptyResult);
  }

  /**
   * Test {@link IterableUtils#isEmpty(Iterable)}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} iterator.</li>
   *   <li>Then calls {@link Iterable#iterator()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#isEmpty(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.isEmpty(Iterable)"})
  public void testIsEmpty_givenArrayListIterator_thenCallsIterator() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);

    ArrayList<Object> objectList = new ArrayList<>();
    when(iterable.iterator()).thenReturn(objectList.iterator());

    // Act
    boolean actualIsEmptyResult = IterableUtils.isEmpty(iterable);

    // Assert
    verify(iterable).iterator();
    assertTrue(actualIsEmptyResult);
  }

  /**
   * Test {@link IterableUtils#isEmpty(Iterable)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#isEmpty(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.isEmpty(Iterable)"})
  public void testIsEmpty_whenArrayList_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(IterableUtils.isEmpty(new ArrayList<>()));
  }

  /**
   * Test {@link IterableUtils#isEmpty(Iterable)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#isEmpty(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.isEmpty(Iterable)"})
  public void testIsEmpty_whenNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(IterableUtils.isEmpty(null));
  }

  /**
   * Test {@link IterableUtils#loopingIterable(Iterable)}.
   * <p>
   * Method under test: {@link IterableUtils#loopingIterable(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable IterableUtils.loopingIterable(Iterable)"})
  public void testLoopingIterable() {
    // Arrange and Act
    Iterable<Object> actualLoopingIterableResult = IterableUtils.loopingIterable(new ArrayList<>());

    // Assert
    assertFalse(actualLoopingIterableResult.iterator().hasNext());
  }

  /**
   * Test {@link IterableUtils#matchesAll(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.matchesAll(Iterable, Predicate)"})
  public void testMatchesAll_givenFalse_whenPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualMatchesAllResult = IterableUtils.matchesAll(iterable, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualMatchesAllResult);
  }

  /**
   * Test {@link IterableUtils#matchesAll(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.matchesAll(Iterable, Predicate)"})
  public void testMatchesAll_givenTrue_whenPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualMatchesAllResult = IterableUtils.matchesAll(iterable, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualMatchesAllResult);
  }

  /**
   * Test {@link IterableUtils#matchesAll(Iterable, Predicate)}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.matchesAll(Iterable, Predicate)"})
  public void testMatchesAll_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("predicate"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> IterableUtils.matchesAll(iterable, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#matchesAll(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.matchesAll(Iterable, Predicate)"})
  public void testMatchesAll_whenArrayList_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(IterableUtils.matchesAll(new ArrayList<>(), mock(Predicate.class)));
  }

  /**
   * Test {@link IterableUtils#matchesAll(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.matchesAll(Iterable, Predicate)"})
  public void testMatchesAll_whenNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(IterableUtils.matchesAll(null, mock(Predicate.class)));
  }

  /**
   * Test {@link IterableUtils#matchesAny(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#matchesAny(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.matchesAny(Iterable, Predicate)"})
  public void testMatchesAny_givenFalse_whenPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualMatchesAnyResult = IterableUtils.matchesAny(iterable, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualMatchesAnyResult);
  }

  /**
   * Test {@link IterableUtils#matchesAny(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#matchesAny(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.matchesAny(Iterable, Predicate)"})
  public void testMatchesAny_givenTrue_whenPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualMatchesAnyResult = IterableUtils.matchesAny(iterable, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualMatchesAnyResult);
  }

  /**
   * Test {@link IterableUtils#matchesAny(Iterable, Predicate)}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#matchesAny(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.matchesAny(Iterable, Predicate)"})
  public void testMatchesAny_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("predicate"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> IterableUtils.matchesAny(iterable, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#matchesAny(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#matchesAny(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.matchesAny(Iterable, Predicate)"})
  public void testMatchesAny_whenArrayList_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(IterableUtils.matchesAny(new ArrayList<>(), mock(Predicate.class)));
  }

  /**
   * Test {@link IterableUtils#matchesAny(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#matchesAny(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IterableUtils.matchesAny(Iterable, Predicate)"})
  public void testMatchesAny_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(IterableUtils.matchesAny(null, mock(Predicate.class)));
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Factory, Predicate[])} with {@code iterable}, {@code partitionFactory}, {@code predicates}.
   * <p>
   * Method under test: {@link IterableUtils#partition(Iterable, Factory, Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Factory, Predicate[])"})
  public void testPartitionWithIterablePartitionFactoryPredicates() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Factory<Collection<Object>> partitionFactory = mock(Factory.class);
    when(partitionFactory.get()).thenReturn(new ArrayList<>());
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("predicates"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> IterableUtils.partition(iterable, partitionFactory, predicate, mock(Predicate.class)));
    verify(partitionFactory, atLeast(1)).get();
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Factory, Predicate[])} with {@code iterable}, {@code partitionFactory}, {@code predicates}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#partition(Iterable, Factory, Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Factory, Predicate[])"})
  public void testPartitionWithIterablePartitionFactoryPredicates_given42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Factory<Collection<Object>> partitionFactory = mock(Factory.class);
    ArrayList<Object> objectList = new ArrayList<>();
    when(partitionFactory.get()).thenReturn(objectList);

    // Act
    List<Collection<Object>> actualPartitionResult = IterableUtils.partition(iterable, partitionFactory);

    // Assert
    verify(partitionFactory).get();
    assertEquals(1, actualPartitionResult.size());
    assertSame(objectList, actualPartitionResult.get(0));
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Factory, Predicate[])} with {@code iterable}, {@code partitionFactory}, {@code predicates}.
   * <ul>
   *   <li>Given {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#partition(Iterable, Factory, Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Factory, Predicate[])"})
  public void testPartitionWithIterablePartitionFactoryPredicates_givenFalse() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Factory<Collection<Object>> partitionFactory = mock(Factory.class);
    ArrayList<Object> objectList = new ArrayList<>();
    when(partitionFactory.get()).thenReturn(objectList);
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    List<Collection<Object>> actualPartitionResult = IterableUtils.partition(iterable, partitionFactory, predicate);

    // Assert
    verify(partitionFactory, atLeast(1)).get();
    verify(predicate).test(isA(Object.class));
    assertEquals(2, actualPartitionResult.size());
    assertSame(objectList, actualPartitionResult.get(0));
    assertSame(objectList, actualPartitionResult.get(1));
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Factory, Predicate[])} with {@code iterable}, {@code partitionFactory}, {@code predicates}.
   * <ul>
   *   <li>Given {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#partition(Iterable, Factory, Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Factory, Predicate[])"})
  public void testPartitionWithIterablePartitionFactoryPredicates_givenTrue() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Factory<Collection<Object>> partitionFactory = mock(Factory.class);
    ArrayList<Object> objectList = new ArrayList<>();
    when(partitionFactory.get()).thenReturn(objectList);
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    List<Collection<Object>> actualPartitionResult = IterableUtils.partition(iterable, partitionFactory, predicate);

    // Assert
    verify(partitionFactory, atLeast(1)).get();
    verify(predicate).test(isA(Object.class));
    assertEquals(2, actualPartitionResult.size());
    assertSame(objectList, actualPartitionResult.get(0));
    assertSame(objectList, actualPartitionResult.get(1));
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Factory, Predicate[])} with {@code iterable}, {@code partitionFactory}, {@code predicates}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#partition(Iterable, Factory, Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Factory, Predicate[])"})
  public void testPartitionWithIterablePartitionFactoryPredicates_whenArrayList() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    Factory<Collection<Object>> partitionFactory = mock(Factory.class);
    ArrayList<Object> objectList = new ArrayList<>();
    when(partitionFactory.get()).thenReturn(objectList);

    // Act
    List<Collection<Object>> actualPartitionResult = IterableUtils.partition(iterable, partitionFactory,
        mock(Predicate.class));

    // Assert
    verify(partitionFactory, atLeast(1)).get();
    assertEquals(2, actualPartitionResult.size());
    assertSame(objectList, actualPartitionResult.get(0));
    assertSame(objectList, actualPartitionResult.get(1));
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Predicate)} with {@code iterable}, {@code predicate}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return second is {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#partition(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Predicate)"})
  public void testPartitionWithIterablePredicate_givenFalse_thenReturnSecondIsArrayList() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    List<List<Object>> actualPartitionResult = IterableUtils.partition(iterable, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(2, actualPartitionResult.size());
    assertTrue(actualPartitionResult.get(0).isEmpty());
    assertEquals(iterable, actualPartitionResult.get(1));
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Predicate)} with {@code iterable}, {@code predicate}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return first is {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#partition(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Predicate)"})
  public void testPartitionWithIterablePredicate_givenTrue_thenReturnFirstIsArrayList() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    List<List<Object>> actualPartitionResult = IterableUtils.partition(iterable, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(2, actualPartitionResult.size());
    assertTrue(actualPartitionResult.get(1).isEmpty());
    assertEquals(iterable, actualPartitionResult.get(0));
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Predicate)} with {@code iterable}, {@code predicate}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#partition(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Predicate)"})
  public void testPartitionWithIterablePredicate_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("predicate"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> IterableUtils.partition(iterable, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Predicate)} with {@code iterable}, {@code predicate}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return first Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#partition(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Predicate)"})
  public void testPartitionWithIterablePredicate_whenArrayList_thenReturnFirstEmpty() {
    // Arrange and Act
    List<List<Object>> actualPartitionResult = IterableUtils.partition(new ArrayList<>(), mock(Predicate.class));

    // Assert
    assertEquals(2, actualPartitionResult.size());
    assertTrue(actualPartitionResult.get(0).isEmpty());
    assertTrue(actualPartitionResult.get(1).isEmpty());
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Predicate)} with {@code iterable}, {@code predicate}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return first Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#partition(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Predicate)"})
  public void testPartitionWithIterablePredicate_whenNull_thenReturnFirstEmpty() {
    // Arrange and Act
    List<List<Object>> actualPartitionResult = IterableUtils.partition(null, mock(Predicate.class));

    // Assert
    assertEquals(2, actualPartitionResult.size());
    assertTrue(actualPartitionResult.get(0).isEmpty());
    assertTrue(actualPartitionResult.get(1).isEmpty());
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Predicate[])} with {@code iterable}, {@code predicates}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#partition(Iterable, Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Predicate[])"})
  public void testPartitionWithIterablePredicates_given42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act
    List<List<Object>> actualPartitionResult = IterableUtils.partition(iterable);

    // Assert
    assertEquals(1, actualPartitionResult.size());
    assertEquals(iterable, actualPartitionResult.get(0));
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Predicate[])} with {@code iterable}, {@code predicates}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return second is {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#partition(Iterable, Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Predicate[])"})
  public void testPartitionWithIterablePredicates_givenFalse_thenReturnSecondIsArrayList() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    List<List<Object>> actualPartitionResult = IterableUtils.partition(iterable, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(2, actualPartitionResult.size());
    assertTrue(actualPartitionResult.get(0).isEmpty());
    assertEquals(iterable, actualPartitionResult.get(1));
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Predicate[])} with {@code iterable}, {@code predicates}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#partition(Iterable, Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Predicate[])"})
  public void testPartitionWithIterablePredicates_givenTrue_whenPredicateTestReturnTrue() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    List<List<Object>> actualPartitionResult = IterableUtils.partition(iterable, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(2, actualPartitionResult.size());
    assertTrue(actualPartitionResult.get(1).isEmpty());
    assertEquals(iterable, actualPartitionResult.get(0));
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Predicate[])} with {@code iterable}, {@code predicates}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#partition(Iterable, Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Predicate[])"})
  public void testPartitionWithIterablePredicates_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("classToInstantiate"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> IterableUtils.partition(iterable, predicate, mock(Predicate.class)));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Predicate[])} with {@code iterable}, {@code predicates}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return first Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#partition(Iterable, Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Predicate[])"})
  public void testPartitionWithIterablePredicates_whenArrayList_thenReturnFirstEmpty() {
    // Arrange and Act
    List<List<Object>> actualPartitionResult = IterableUtils.partition(new ArrayList<>(), mock(Predicate.class));

    // Assert
    assertEquals(2, actualPartitionResult.size());
    assertTrue(actualPartitionResult.get(0).isEmpty());
    assertTrue(actualPartitionResult.get(1).isEmpty());
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Predicate[])} with {@code iterable}, {@code predicates}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return first Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#partition(Iterable, Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Predicate[])"})
  public void testPartitionWithIterablePredicates_whenNull_thenReturnFirstEmpty() {
    // Arrange and Act
    List<List<Object>> actualPartitionResult = IterableUtils.partition(null, mock(Predicate.class));

    // Assert
    assertEquals(2, actualPartitionResult.size());
    assertTrue(actualPartitionResult.get(0).isEmpty());
    assertTrue(actualPartitionResult.get(1).isEmpty());
  }

  /**
   * Test {@link IterableUtils#reversedIterable(Iterable)}.
   * <p>
   * Method under test: {@link IterableUtils#reversedIterable(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable IterableUtils.reversedIterable(Iterable)"})
  public void testReversedIterable() {
    // Arrange and Act
    Iterable<Object> actualReversedIterableResult = IterableUtils.reversedIterable(new ArrayList<>());
    Iterator<Object> actualIteratorResult = actualReversedIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof ReverseListIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#skippingIterable(Iterable, long)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#skippingIterable(Iterable, long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable IterableUtils.skippingIterable(Iterable, long)"})
  public void testSkippingIterable_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act
    Iterable<Object> actualSkippingIterableResult = IterableUtils.skippingIterable(iterable, 1L);
    Iterator<Object> actualIteratorResult = actualSkippingIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof SkippingIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#skippingIterable(Iterable, long)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#skippingIterable(Iterable, long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable IterableUtils.skippingIterable(Iterable, long)"})
  public void testSkippingIterable_whenArrayList() {
    // Arrange and Act
    Iterable<Object> actualSkippingIterableResult = IterableUtils.skippingIterable(new ArrayList<>(), 1L);
    Iterator<Object> actualIteratorResult = actualSkippingIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof SkippingIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#skippingIterable(Iterable, long)}.
   * <ul>
   *   <li>When zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#skippingIterable(Iterable, long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable IterableUtils.skippingIterable(Iterable, long)"})
  public void testSkippingIterable_whenZero() {
    // Arrange and Act
    Iterable<Object> actualSkippingIterableResult = IterableUtils.skippingIterable(new ArrayList<>(), 0L);
    Iterator<Object> actualIteratorResult = actualSkippingIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof SkippingIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#toList(Iterable)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#toList(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IterableUtils.toList(Iterable)"})
  public void testToList_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act
    List<Object> actualToListResult = IterableUtils.toList(iterable);

    // Assert
    assertEquals(iterable, actualToListResult);
  }

  /**
   * Test {@link IterableUtils#toList(Iterable)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#toList(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IterableUtils.toList(Iterable)"})
  public void testToList_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    List<Object> actualToListResult = IterableUtils.toList(new ArrayList<>());

    // Assert
    assertTrue(actualToListResult.isEmpty());
  }

  /**
   * Test {@link IterableUtils#toList(Iterable)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#toList(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IterableUtils.toList(Iterable)"})
  public void testToList_whenNull_thenReturnEmpty() {
    // Arrange and Act
    List<Object> actualToListResult = IterableUtils.toList(null);

    // Assert
    assertTrue(actualToListResult.isEmpty());
  }

  /**
   * Test {@link IterableUtils#toString(Iterable, Transformer, String, String, String)} with {@code iterable}, {@code transformer}, {@code delimiter}, {@code prefix}, {@code suffix}.
   * <p>
   * Method under test: {@link IterableUtils#toString(Iterable, Transformer, String, String, String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IterableUtils.toString(Iterable, Transformer, String, String, String)"})
  public void testToStringWithIterableTransformerDelimiterPrefixSuffix() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Transformer<Object, String> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    String actualToStringResult = IterableUtils.toString(iterable, transformer, "Delimiter", "Prefix", "Suffix");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals("PrefixApplySuffix", actualToStringResult);
  }

  /**
   * Test {@link IterableUtils#toString(Iterable, Transformer, String, String, String)} with {@code iterable}, {@code transformer}, {@code delimiter}, {@code prefix}, {@code suffix}.
   * <p>
   * Method under test: {@link IterableUtils#toString(Iterable, Transformer, String, String, String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IterableUtils.toString(Iterable, Transformer, String, String, String)"})
  public void testToStringWithIterableTransformerDelimiterPrefixSuffix2() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Transformer<Object, String> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("transformer"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> IterableUtils.toString(iterable, transformer, "Delimiter", "Prefix", "Suffix"));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#toString(Iterable, Transformer, String, String, String)} with {@code iterable}, {@code transformer}, {@code delimiter}, {@code prefix}, {@code suffix}.
   * <ul>
   *   <li>Then return {@code PrefixSuffix}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#toString(Iterable, Transformer, String, String, String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IterableUtils.toString(Iterable, Transformer, String, String, String)"})
  public void testToStringWithIterableTransformerDelimiterPrefixSuffix_thenReturnPrefixSuffix() {
    // Arrange, Act and Assert
    assertEquals("PrefixSuffix",
        IterableUtils.toString(null, mock(Transformer.class), "Delimiter", "Prefix", "Suffix"));
  }

  /**
   * Test {@link IterableUtils#toString(Iterable, Transformer, String, String, String)} with {@code iterable}, {@code transformer}, {@code delimiter}, {@code prefix}, {@code suffix}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#toString(Iterable, Transformer, String, String, String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IterableUtils.toString(Iterable, Transformer, String, String, String)"})
  public void testToStringWithIterableTransformerDelimiterPrefixSuffix_whenArrayList() {
    // Arrange, Act and Assert
    assertEquals("PrefixSuffix",
        IterableUtils.toString(new ArrayList<>(), mock(Transformer.class), "Delimiter", "Prefix", "Suffix"));
  }

  /**
   * Test {@link IterableUtils#toString(Iterable, Transformer)} with {@code iterable}, {@code transformer}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>Then return {@code [Apply]}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#toString(Iterable, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IterableUtils.toString(Iterable, Transformer)"})
  public void testToStringWithIterableTransformer_givenApply_thenReturnApply() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Transformer<Object, String> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    String actualToStringResult = IterableUtils.toString(iterable, transformer);

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals("[Apply]", actualToStringResult);
  }

  /**
   * Test {@link IterableUtils#toString(Iterable, Transformer)} with {@code iterable}, {@code transformer}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#toString(Iterable, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IterableUtils.toString(Iterable, Transformer)"})
  public void testToStringWithIterableTransformer_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Transformer<Object, String> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("transformer"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> IterableUtils.toString(iterable, transformer));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#toString(Iterable, Transformer)} with {@code iterable}, {@code transformer}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#toString(Iterable, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IterableUtils.toString(Iterable, Transformer)"})
  public void testToStringWithIterableTransformer_whenArrayList() {
    // Arrange, Act and Assert
    assertEquals("[]", IterableUtils.toString(new ArrayList<>(), mock(Transformer.class)));
  }

  /**
   * Test {@link IterableUtils#toString(Iterable, Transformer)} with {@code iterable}, {@code transformer}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#toString(Iterable, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IterableUtils.toString(Iterable, Transformer)"})
  public void testToStringWithIterableTransformer_whenNull() {
    // Arrange, Act and Assert
    assertEquals("[]", IterableUtils.toString(null, mock(Transformer.class)));
  }

  /**
   * Test {@link IterableUtils#toString(Iterable)} with {@code iterable}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code [42]}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#toString(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IterableUtils.toString(Iterable)"})
  public void testToStringWithIterable_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act and Assert
    assertEquals("[42]", IterableUtils.toString(iterable));
  }

  /**
   * Test {@link IterableUtils#toString(Iterable)} with {@code iterable}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#toString(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IterableUtils.toString(Iterable)"})
  public void testToStringWithIterable_whenArrayList() {
    // Arrange, Act and Assert
    assertEquals("[]", IterableUtils.toString(new ArrayList<>()));
  }

  /**
   * Test {@link IterableUtils#toString(Iterable)} with {@code iterable}.
   * <ul>
   *   <li>When empty.</li>
   *   <li>Then return {@code []}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#toString(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IterableUtils.toString(Iterable)"})
  public void testToStringWithIterable_whenEmpty_thenReturnLeftSquareBracketRightSquareBracket() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.empty();

    // Act and Assert
    assertEquals("[]", IterableUtils.toString(iterable));
  }

  /**
   * Test {@link IterableUtils#toString(Iterable)} with {@code iterable}.
   * <ul>
   *   <li>When {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#toString(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IterableUtils.toString(Iterable)"})
  public void testToStringWithIterable_whenFluentIterableWithIterableIsArrayList() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertEquals("[]", IterableUtils.toString(iterable));
  }

  /**
   * Test {@link IterableUtils#toString(Iterable)} with {@code iterable}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code []}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#toString(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IterableUtils.toString(Iterable)"})
  public void testToStringWithIterable_whenNull_thenReturnLeftSquareBracketRightSquareBracket() {
    // Arrange, Act and Assert
    assertEquals("[]", IterableUtils.toString(null));
  }

  /**
   * Test {@link IterableUtils#transformedIterable(Iterable, Transformer)}.
   * <p>
   * Method under test: {@link IterableUtils#transformedIterable(Iterable, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable IterableUtils.transformedIterable(Iterable, Transformer)"})
  public void testTransformedIterable() {
    // Arrange and Act
    Iterable<Object> actualTransformedIterableResult = IterableUtils
        .<Object, Object>transformedIterable(new ArrayList<>(), mock(Transformer.class));
    Iterator<Object> actualIteratorResult = actualTransformedIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof TransformIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#uniqueIterable(Iterable)}.
   * <p>
   * Method under test: {@link IterableUtils#uniqueIterable(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable IterableUtils.uniqueIterable(Iterable)"})
  public void testUniqueIterable() {
    // Arrange and Act
    Iterable<Object> actualUniqueIterableResult = IterableUtils.uniqueIterable(new ArrayList<>());
    Iterator<Object> actualIteratorResult = actualUniqueIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof UniqueFilterIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#unmodifiableIterable(Iterable)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then iterator return {@link UnmodifiableIterator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#unmodifiableIterable(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable IterableUtils.unmodifiableIterable(Iterable)"})
  public void testUnmodifiableIterable_whenArrayList_thenIteratorReturnUnmodifiableIterator() {
    // Arrange and Act
    Iterable<Object> actualUnmodifiableIterableResult = IterableUtils.unmodifiableIterable(new ArrayList<>());
    Iterator<Object> actualIteratorResult = actualUnmodifiableIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof UnmodifiableIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#unmodifiableIterable(Iterable)}.
   * <ul>
   *   <li>When empty.</li>
   *   <li>Then iterator return {@link UnmodifiableIterator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#unmodifiableIterable(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable IterableUtils.unmodifiableIterable(Iterable)"})
  public void testUnmodifiableIterable_whenEmpty_thenIteratorReturnUnmodifiableIterator() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.empty();

    // Act
    Iterable<Object> actualUnmodifiableIterableResult = IterableUtils.unmodifiableIterable(iterable);
    Iterator<Object> actualIteratorResult = actualUnmodifiableIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof UnmodifiableIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#unmodifiableIterable(Iterable)}.
   * <ul>
   *   <li>When {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()} append {@code Elements}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IterableUtils#unmodifiableIterable(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable IterableUtils.unmodifiableIterable(Iterable)"})
  public void testUnmodifiableIterable_whenFluentIterableWithIterableIsArrayListAppendElements() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.of((Iterable<Object>) new ArrayList<>());
    iterable.append("Elements");

    // Act
    Iterable<Object> actualUnmodifiableIterableResult = IterableUtils.unmodifiableIterable(iterable);
    Iterator<Object> actualIteratorResult = actualUnmodifiableIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof UnmodifiableIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#zippingIterable(Iterable, Iterable)} with {@code a}, {@code b}.
   * <p>
   * Method under test: {@link IterableUtils#zippingIterable(Iterable, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable IterableUtils.zippingIterable(Iterable, Iterable)"})
  public void testZippingIterableWithAB() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Iterable<Object> actualZippingIterableResult = IterableUtils.zippingIterable(a, new ArrayList<>());
    Iterator<Object> actualIteratorResult = actualZippingIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof ZippingIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#zippingIterable(Iterable, Iterable[])} with {@code first}, {@code others}.
   * <p>
   * Method under test: {@link IterableUtils#zippingIterable(Iterable, Iterable[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable IterableUtils.zippingIterable(Iterable, Iterable[])"})
  public void testZippingIterableWithFirstOthers() {
    // Arrange
    ArrayList<Object> first = new ArrayList<>();

    // Act
    Iterable<Object> actualZippingIterableResult = IterableUtils.zippingIterable(first, new ArrayList<>());
    Iterator<Object> actualIteratorResult = actualZippingIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof ZippingIterator);
    assertFalse(actualIteratorResult.hasNext());
  }
}
