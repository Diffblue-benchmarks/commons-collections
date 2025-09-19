package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.functors.DefaultEquator;
import org.apache.commons.collections4.iterators.AbstractMapIteratorDecorator;
import org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorDecorator;
import org.apache.commons.collections4.iterators.BoundedIterator;
import org.apache.commons.collections4.iterators.CollatingIterator;
import org.apache.commons.collections4.iterators.EmptyIterator;
import org.apache.commons.collections4.iterators.EnumerationIterator;
import org.apache.commons.collections4.iterators.FilterIterator;
import org.apache.commons.collections4.iterators.IteratorChain;
import org.apache.commons.collections4.iterators.ReverseListIterator;
import org.apache.commons.collections4.iterators.SkippingIterator;
import org.apache.commons.collections4.iterators.TransformIterator;
import org.apache.commons.collections4.iterators.UniqueFilterIterator;
import org.apache.commons.collections4.iterators.UnmodifiableIterator;
import org.apache.commons.collections4.iterators.ZippingIterator;
import org.apache.commons.collections4.set.CompositeSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class IterableUtilsDiffblueTest {
  /**
   * Test {@link IterableUtils#boundedIterable(Iterable, long)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then iterator return {@link BoundedIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#boundedIterable(Iterable, long)}
   */
  @Test
  @DisplayName(
      "Test boundedIterable(Iterable, long); when three; then iterator return BoundedIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.boundedIterable(Iterable, long)"})
  void testBoundedIterable_whenThree_thenIteratorReturnBoundedIterator() {
    // Arrange and Act
    Iterable<Object> actualBoundedIterableResult =
        IterableUtils.boundedIterable(new ArrayList<>(), 3L);
    Iterator<Object> actualIteratorResult = actualBoundedIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof BoundedIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#chainedIterable(Iterable, Iterable)} with {@code a}, {@code b}.
   *
   * <p>Method under test: {@link IterableUtils#chainedIterable(Iterable, Iterable)}
   */
  @Test
  @DisplayName("Test chainedIterable(Iterable, Iterable) with 'a', 'b'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.chainedIterable(Iterable, Iterable)"})
  void testChainedIterableWithAB() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Iterable<Object> actualChainedIterableResult =
        IterableUtils.chainedIterable(a, new ArrayList<>());

    // Assert
    assertFalse(actualChainedIterableResult.iterator().hasNext());
  }

  /**
   * Test {@link IterableUtils#chainedIterable(Iterable, Iterable, Iterable)} with {@code a}, {@code
   * b}, {@code c}.
   *
   * <p>Method under test: {@link IterableUtils#chainedIterable(Iterable, Iterable, Iterable)}
   */
  @Test
  @DisplayName("Test chainedIterable(Iterable, Iterable, Iterable) with 'a', 'b', 'c'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.chainedIterable(Iterable, Iterable, Iterable)"})
  void testChainedIterableWithABC() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    ArrayList<Object> b = new ArrayList<>();

    // Act
    Iterable<Object> actualChainedIterableResult =
        IterableUtils.chainedIterable(a, b, new ArrayList<>());

    // Assert
    assertFalse(actualChainedIterableResult.iterator().hasNext());
  }

  /**
   * Test {@link IterableUtils#chainedIterable(Iterable, Iterable, Iterable, Iterable)} with {@code
   * a}, {@code b}, {@code c}, {@code d}.
   *
   * <p>Method under test: {@link IterableUtils#chainedIterable(Iterable, Iterable, Iterable,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test chainedIterable(Iterable, Iterable, Iterable, Iterable) with 'a', 'b', 'c', 'd'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Iterable IterableUtils.chainedIterable(Iterable, Iterable, Iterable, Iterable)"
  })
  void testChainedIterableWithABCD() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    ArrayList<Object> b = new ArrayList<>();
    ArrayList<Object> c = new ArrayList<>();

    // Act
    Iterable<Object> actualChainedIterableResult =
        IterableUtils.chainedIterable(a, b, c, new ArrayList<>());

    // Assert
    assertFalse(actualChainedIterableResult.iterator().hasNext());
  }

  /**
   * Test {@link IterableUtils#chainedIterable(Iterable[])} with {@code iterables}.
   *
   * <p>Method under test: {@link IterableUtils#chainedIterable(Iterable[])}
   */
  @Test
  @DisplayName("Test chainedIterable(Iterable[]) with 'iterables'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.chainedIterable(Iterable[])"})
  void testChainedIterableWithIterables() {
    // Arrange and Act
    Iterable<Object> actualChainedIterableResult = IterableUtils.chainedIterable(new ArrayList<>());

    // Assert
    assertFalse(actualChainedIterableResult.iterator().hasNext());
  }

  /**
   * Test {@link IterableUtils#collatedIterable(Iterable, Iterable)} with {@code a}, {@code b}.
   *
   * <p>Method under test: {@link IterableUtils#collatedIterable(Iterable, Iterable)}
   */
  @Test
  @DisplayName("Test collatedIterable(Iterable, Iterable) with 'a', 'b'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.collatedIterable(Iterable, Iterable)"})
  void testCollatedIterableWithAB() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Iterable<Object> actualCollatedIterableResult =
        IterableUtils.collatedIterable(a, new ArrayList<>());
    Iterator<Object> actualIteratorResult = actualCollatedIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof CollatingIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#collatedIterable(Comparator, Iterable, Iterable)} with {@code
   * comparator}, {@code a}, {@code b}.
   *
   * <ul>
   *   <li>When {@link Comparator}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#collatedIterable(Comparator, Iterable, Iterable)}
   */
  @Test
  @DisplayName(
      "Test collatedIterable(Comparator, Iterable, Iterable) with 'comparator', 'a', 'b'; when Comparator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.collatedIterable(Comparator, Iterable, Iterable)"})
  void testCollatedIterableWithComparatorAB_whenComparator() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Iterable<Object> actualCollatedIterableResult =
        IterableUtils.collatedIterable(comparator, a, new ArrayList<>());
    Iterator<Object> actualIteratorResult = actualCollatedIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof CollatingIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#collatedIterable(Comparator, Iterable, Iterable)} with {@code
   * comparator}, {@code a}, {@code b}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#collatedIterable(Comparator, Iterable, Iterable)}
   */
  @Test
  @DisplayName(
      "Test collatedIterable(Comparator, Iterable, Iterable) with 'comparator', 'a', 'b'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.collatedIterable(Comparator, Iterable, Iterable)"})
  void testCollatedIterableWithComparatorAB_whenNull() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Iterable<Object> actualCollatedIterableResult =
        IterableUtils.collatedIterable(null, a, new ArrayList<>());
    Iterator<Object> actualIteratorResult = actualCollatedIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof CollatingIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object)} with {@code iterable}, {@code object}.
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object)}
   */
  @Test
  @DisplayName("Test contains(Iterable, Object) with 'iterable', 'object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object)"})
  void testContainsWithIterableObject() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);

    ArrayList<Object> objectList = new ArrayList<>();
    BoundedIterator<Object> boundedIteratorResult =
        IteratorUtils.boundedIterator(objectList.iterator(), 1L, 1L);
    when(iterable.iterator()).thenReturn(boundedIteratorResult);

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, null);

    // Assert
    verify(iterable).iterator();
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object, Equator)} with {@code iterable}, {@code
   * object}, {@code equator}.
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object, Equator)}
   */
  @Test
  @DisplayName("Test contains(Iterable, Object, Equator) with 'iterable', 'object', 'equator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object, Equator)"})
  void testContainsWithIterableObjectEquator() {
    // Arrange
    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    ArrayList<Object> objectList = new ArrayList<>();
    collatingIterator.addIterator(objectList.iterator());

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(collatingIterator);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, null, equator);

    // Assert
    verify(iterable).iterator();
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object, Equator)} with {@code iterable}, {@code
   * object}, {@code equator}.
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object, Equator)}
   */
  @Test
  @DisplayName("Test contains(Iterable, Object, Equator) with 'iterable', 'object', 'equator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object, Equator)"})
  void testContainsWithIterableObjectEquator2() {
    // Arrange
    IteratorChain<Object> iteratorChain = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iteratorChain.addIterator(objectList.iterator());

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(iteratorChain);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, null, equator);

    // Assert
    verify(iterable).iterator();
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object, Equator)} with {@code iterable}, {@code
   * object}, {@code equator}.
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object, Equator)}
   */
  @Test
  @DisplayName("Test contains(Iterable, Object, Equator) with 'iterable', 'object', 'equator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object, Equator)"})
  void testContainsWithIterableObjectEquator3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    IteratorChain<Object> iteratorChain = new IteratorChain<>(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iteratorChain.addIterator(objectList2.iterator());

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(iteratorChain);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, null, equator);

    // Assert
    verify(iterable).iterator();
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object, Equator)} with {@code iterable}, {@code
   * object}, {@code equator}.
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object, Equator)}
   */
  @Test
  @DisplayName("Test contains(Iterable, Object, Equator) with 'iterable', 'object', 'equator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object, Equator)"})
  void testContainsWithIterableObjectEquator4() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();
    collatingIterator.addIterator(iterator);

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(collatingIterator);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, null, equator);

    // Assert
    verify(iterable).iterator();
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object, Equator)} with {@code iterable}, {@code
   * object}, {@code equator}.
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object, Equator)}
   */
  @Test
  @DisplayName("Test contains(Iterable, Object, Equator) with 'iterable', 'object', 'equator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object, Equator)"})
  void testContainsWithIterableObjectEquator5() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    ArrayList<Object> objectList2 = new ArrayList<>();
    collatingIterator.addIterator(objectList2.iterator());
    collatingIterator.addIterator(iterator);

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(collatingIterator);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, null, equator);

    // Assert
    verify(iterable).iterator();
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object, Equator)} with {@code iterable}, {@code
   * object}, {@code equator}.
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object, Equator)}
   */
  @Test
  @DisplayName("Test contains(Iterable, Object, Equator) with 'iterable', 'object', 'equator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object, Equator)"})
  void testContainsWithIterableObjectEquator6() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    IteratorChain<Object> iteratorChain = new IteratorChain<>();
    iteratorChain.addIterator(iterator);

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(iteratorChain);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, null, equator);

    // Assert
    verify(iterable).iterator();
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object, Equator)} with {@code iterable}, {@code
   * object}, {@code equator}.
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object, Equator)}
   */
  @Test
  @DisplayName("Test contains(Iterable, Object, Equator) with 'iterable', 'object', 'equator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object, Equator)"})
  void testContainsWithIterableObjectEquator7() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    objectList2.add("42");
    Iterator<Object> iterator2 = objectList2.iterator();

    Comparator<Object> comp = mock(Comparator.class);
    when(comp.compare(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenReturn(CollectionUtils.INDEX_NOT_FOUND);

    CollatingIterator<Object> collatingIterator = new CollatingIterator<>(comp);
    collatingIterator.addIterator(iterator2);
    collatingIterator.addIterator(iterator);

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(collatingIterator);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, null, equator);

    // Assert
    verify(iterable).iterator();
    verify(comp).compare(isA(Object.class), isA(Object.class));
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object, Equator)} with {@code iterable}, {@code
   * object}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object, Equator)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterable, Object, Equator) with 'iterable', 'object', 'equator'; given '42'; when '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object, Equator)"})
  void testContainsWithIterableObjectEquator_given42_when42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, "42", equator);

    // Assert
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object, Equator)} with {@code iterable}, {@code
   * object}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object, Equator)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterable, Object, Equator) with 'iterable', 'object', 'equator'; given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object, Equator)"})
  void testContainsWithIterableObjectEquator_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, "Object", equator);

    // Assert
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object, Equator)} with {@code iterable}, {@code
   * object}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object, Equator)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterable, Object, Equator) with 'iterable', 'object', 'equator'; given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object, Equator)"})
  void testContainsWithIterableObjectEquator_given42_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, null, equator);

    // Assert
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object, Equator)} with {@code iterable}, {@code
   * object}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@link CollatingIterator#CollatingIterator()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object, Equator)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterable, Object, Equator) with 'iterable', 'object', 'equator'; given CollatingIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object, Equator)"})
  void testContainsWithIterableObjectEquator_givenCollatingIterator() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(new CollatingIterator<>());
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, null, equator);

    // Assert
    verify(iterable).iterator();
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object, Equator)} with {@code iterable}, {@code
   * object}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return one.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object, Equator)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterable, Object, Equator) with 'iterable', 'object', 'equator'; given Comparator compare(Object, Object) return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object, Equator)"})
  void testContainsWithIterableObjectEquator_givenComparatorCompareReturnOne() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    objectList2.add("42");
    Iterator<Object> iterator2 = objectList2.iterator();

    Comparator<Object> comp = mock(Comparator.class);
    when(comp.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    CollatingIterator<Object> collatingIterator = new CollatingIterator<>(comp);
    collatingIterator.addIterator(iterator2);
    collatingIterator.addIterator(iterator);

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(collatingIterator);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, null, equator);

    // Assert
    verify(iterable).iterator();
    verify(comp).compare(isA(Object.class), isA(Object.class));
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object, Equator)} with {@code iterable}, {@code
   * object}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@link IteratorChain#IteratorChain()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object, Equator)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterable, Object, Equator) with 'iterable', 'object', 'equator'; given IteratorChain()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object, Equator)"})
  void testContainsWithIterableObjectEquator_givenIteratorChain() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(new IteratorChain<>());
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, null, equator);

    // Assert
    verify(iterable).iterator();
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object, Equator)} with {@code iterable}, {@code
   * object}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link Iterable} {@link Iterable#iterator()} return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object, Equator)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterable, Object, Equator) with 'iterable', 'object', 'equator'; given 'null'; when Iterable iterator() return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object, Equator)"})
  void testContainsWithIterableObjectEquator_givenNull_whenIterableIteratorReturnNull() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(null);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, null, equator);

    // Assert
    verify(iterable).iterator();
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object, Equator)} with {@code iterable}, {@code
   * object}, {@code equator}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} add {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object, Equator)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterable, Object, Equator) with 'iterable', 'object', 'equator'; when ArrayList() add 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object, Equator)"})
  void testContainsWithIterableObjectEquator_whenArrayListAddNull_thenReturnTrue() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add(null);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, null, equator);

    // Assert
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object, Equator)} with {@code iterable}, {@code
   * object}, {@code equator}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object, Equator)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterable, Object, Equator) with 'iterable', 'object', 'equator'; when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object, Equator)"})
  void testContainsWithIterableObjectEquator_whenArrayList_thenReturnFalse() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, "Object", equator);

    // Assert
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object, Equator)} with {@code iterable}, {@code
   * object}, {@code equator}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object, Equator)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterable, Object, Equator) with 'iterable', 'object', 'equator'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object, Equator)"})
  void testContainsWithIterableObjectEquator_whenNull_thenReturnFalse() {
    // Arrange
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualContainsResult = IterableUtils.contains(null, null, equator);

    // Assert
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object)} with {@code iterable}, {@code object}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterable, Object) with 'iterable', 'object'; given ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object)"})
  void testContainsWithIterableObject_givenArrayListIterator() {
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
   *
   * <ul>
   *   <li>Given {@link CollatingIterator#CollatingIterator()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterable, Object) with 'iterable', 'object'; given CollatingIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object)"})
  void testContainsWithIterableObject_givenCollatingIterator() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(new CollatingIterator<>());

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, null);

    // Assert
    verify(iterable).iterator();
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object)} with {@code iterable}, {@code object}.
   *
   * <ul>
   *   <li>Given {@link IteratorChain#IteratorChain()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object)}
   */
  @Test
  @DisplayName("Test contains(Iterable, Object) with 'iterable', 'object'; given IteratorChain()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object)"})
  void testContainsWithIterableObject_givenIteratorChain() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(new IteratorChain<>());

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, null);

    // Assert
    verify(iterable).iterator();
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object)} with {@code iterable}, {@code object}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link Iterable} {@link Iterable#iterator()} return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterable, Object) with 'iterable', 'object'; given 'null'; when Iterable iterator() return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object)"})
  void testContainsWithIterableObject_givenNull_whenIterableIteratorReturnNull() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(null);

    // Act
    boolean actualContainsResult = IterableUtils.contains(iterable, null);

    // Assert
    verify(iterable).iterator();
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object)} with {@code iterable}, {@code object}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterable, Object) with 'iterable', 'object'; when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object)"})
  void testContainsWithIterableObject_whenArrayList_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(IterableUtils.contains(new ArrayList<>(), "Object"));
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object)} with {@code iterable}, {@code object}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterable, Object) with 'iterable', 'object'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object)"})
  void testContainsWithIterableObject_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(IterableUtils.contains(null, null));
  }

  /**
   * Test {@link IterableUtils#contains(Iterable, Object)} with {@code iterable}, {@code object}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#contains(Iterable, Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterable, Object) with 'iterable', 'object'; when 'Object'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.contains(Iterable, Object)"})
  void testContainsWithIterableObject_whenObject_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(IterableUtils.contains(null, "Object"));
  }

  /**
   * Test {@link IterableUtils#countMatches(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#countMatches(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test countMatches(Iterable, Predicate); given 'false'; when Predicate test(Object) return 'false'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long IterableUtils.countMatches(Iterable, Predicate)"})
  void testCountMatches_givenFalse_whenPredicateTestReturnFalse_thenReturnZero() {
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
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#countMatches(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test countMatches(Iterable, Predicate); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long IterableUtils.countMatches(Iterable, Predicate)"})
  void testCountMatches_givenIllegalArgumentException_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> input = new ArrayList<>();
    input.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> IterableUtils.countMatches(input, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#countMatches(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#countMatches(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test countMatches(Iterable, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long IterableUtils.countMatches(Iterable, Predicate)"})
  void testCountMatches_givenTrue_whenPredicateTestReturnTrue_thenReturnOne() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#countMatches(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test countMatches(Iterable, Predicate); when ArrayList(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long IterableUtils.countMatches(Iterable, Predicate)"})
  void testCountMatches_whenArrayList_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0L, IterableUtils.countMatches(new ArrayList<>(), mock(Predicate.class)));
  }

  /**
   * Test {@link IterableUtils#countMatches(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#countMatches(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test countMatches(Iterable, Predicate); when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long IterableUtils.countMatches(Iterable, Predicate)"})
  void testCountMatches_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0L, IterableUtils.countMatches(null, mock(Predicate.class)));
  }

  /**
   * Test {@link IterableUtils#duplicateList(Iterable)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#duplicateList(Iterable)}
   */
  @Test
  @DisplayName(
      "Test duplicateList(Iterable); given '42'; when ArrayList() add '42'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.duplicateList(Iterable)"})
  void testDuplicateList_given42_whenArrayListAdd42_thenReturnEmpty() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#duplicateList(Iterable)}
   */
  @Test
  @DisplayName(
      "Test duplicateList(Iterable); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.duplicateList(Iterable)"})
  void testDuplicateList_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
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
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.
   *   <li>When {@link ArrayList#ArrayList()} add {@link CompositeSet#CompositeSet()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#duplicateList(Iterable)}
   */
  @Test
  @DisplayName(
      "Test duplicateList(Iterable); given CompositeSet(); when ArrayList() add CompositeSet(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.duplicateList(Iterable)"})
  void testDuplicateList_givenCompositeSet_whenArrayListAddCompositeSet_thenReturnEmpty() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#duplicateList(Iterable)}
   */
  @Test
  @DisplayName("Test duplicateList(Iterable); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.duplicateList(Iterable)"})
  void testDuplicateList_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    List<Object> actualDuplicateListResult = IterableUtils.duplicateList(new ArrayList<>());

    // Assert
    assertTrue(actualDuplicateListResult.isEmpty());
  }

  /**
   * Test {@link IterableUtils#duplicateSequencedSet(Iterable)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#duplicateSequencedSet(Iterable)}
   */
  @Test
  @DisplayName(
      "Test duplicateSequencedSet(Iterable); given '42'; when ArrayList() add '42'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IterableUtils.duplicateSequencedSet(Iterable)"})
  void testDuplicateSequencedSet_given42_whenArrayListAdd42_thenReturnEmpty() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#duplicateSequencedSet(Iterable)}
   */
  @Test
  @DisplayName(
      "Test duplicateSequencedSet(Iterable); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IterableUtils.duplicateSequencedSet(Iterable)"})
  void testDuplicateSequencedSet_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
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
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.
   *   <li>When {@link ArrayList#ArrayList()} add {@link CompositeSet#CompositeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#duplicateSequencedSet(Iterable)}
   */
  @Test
  @DisplayName(
      "Test duplicateSequencedSet(Iterable); given CompositeSet(); when ArrayList() add CompositeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IterableUtils.duplicateSequencedSet(Iterable)"})
  void testDuplicateSequencedSet_givenCompositeSet_whenArrayListAddCompositeSet() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#duplicateSequencedSet(Iterable)}
   */
  @Test
  @DisplayName("Test duplicateSequencedSet(Iterable); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IterableUtils.duplicateSequencedSet(Iterable)"})
  void testDuplicateSequencedSet_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    Set<Object> actualDuplicateSequencedSetResult =
        IterableUtils.duplicateSequencedSet(new ArrayList<>());

    // Assert
    assertTrue(actualDuplicateSequencedSetResult.isEmpty());
  }

  /**
   * Test {@link IterableUtils#duplicateSet(Iterable, Collection)} with {@code iterable}, {@code
   * duplicates}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#duplicateSet(Iterable, Collection)}
   */
  @Test
  @DisplayName(
      "Test duplicateSet(Iterable, Collection) with 'iterable', 'duplicates'; given '42'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection IterableUtils.duplicateSet(Iterable, Collection)"})
  void testDuplicateSetWithIterableDuplicates_given42_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act
    Collection<Object> actualDuplicateSetResult =
        IterableUtils.duplicateSet(iterable, new ArrayList<>());

    // Assert
    assertTrue(actualDuplicateSetResult instanceof List);
    assertTrue(actualDuplicateSetResult.isEmpty());
  }

  /**
   * Test {@link IterableUtils#duplicateSet(Iterable, Collection)} with {@code iterable}, {@code
   * duplicates}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#duplicateSet(Iterable, Collection)}
   */
  @Test
  @DisplayName(
      "Test duplicateSet(Iterable, Collection) with 'iterable', 'duplicates'; given '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection IterableUtils.duplicateSet(Iterable, Collection)"})
  void testDuplicateSetWithIterableDuplicates_given42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    // Act
    Collection<Object> actualDuplicateSetResult =
        IterableUtils.duplicateSet(iterable, new ArrayList<>());

    // Assert
    assertTrue(actualDuplicateSetResult instanceof List);
    assertEquals(1, actualDuplicateSetResult.size());
    assertEquals("42", ((List<Object>) actualDuplicateSetResult).get(0));
  }

  /**
   * Test {@link IterableUtils#duplicateSet(Iterable, Collection)} with {@code iterable}, {@code
   * duplicates}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#duplicateSet(Iterable, Collection)}
   */
  @Test
  @DisplayName(
      "Test duplicateSet(Iterable, Collection) with 'iterable', 'duplicates'; given '42'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection IterableUtils.duplicateSet(Iterable, Collection)"})
  void testDuplicateSetWithIterableDuplicates_given42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");
    iterable.add("42");

    // Act
    Collection<Object> actualDuplicateSetResult =
        IterableUtils.duplicateSet(iterable, new ArrayList<>());

    // Assert
    assertTrue(actualDuplicateSetResult instanceof List);
    assertEquals(2, actualDuplicateSetResult.size());
    assertEquals("42", ((List<Object>) actualDuplicateSetResult).get(0));
    assertEquals("42", ((List<Object>) actualDuplicateSetResult).get(1));
  }

  /**
   * Test {@link IterableUtils#duplicateSet(Iterable, Collection)} with {@code iterable}, {@code
   * duplicates}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#duplicateSet(Iterable, Collection)}
   */
  @Test
  @DisplayName(
      "Test duplicateSet(Iterable, Collection) with 'iterable', 'duplicates'; when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection IterableUtils.duplicateSet(Iterable, Collection)"})
  void testDuplicateSetWithIterableDuplicates_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();

    // Act
    Collection<Object> actualDuplicateSetResult =
        IterableUtils.duplicateSet(iterable, new ArrayList<>());

    // Assert
    assertEquals(iterable, actualDuplicateSetResult);
  }

  /**
   * Test {@link IterableUtils#duplicateSet(Iterable)} with {@code iterable}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#duplicateSet(Iterable)}
   */
  @Test
  @DisplayName(
      "Test duplicateSet(Iterable) with 'iterable'; given '42'; when ArrayList() add '42'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IterableUtils.duplicateSet(Iterable)"})
  void testDuplicateSetWithIterable_given42_whenArrayListAdd42_thenReturnEmpty() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#duplicateSet(Iterable)}
   */
  @Test
  @DisplayName(
      "Test duplicateSet(Iterable) with 'iterable'; given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IterableUtils.duplicateSet(Iterable)"})
  void testDuplicateSetWithIterable_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
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
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.
   *   <li>When {@link ArrayList#ArrayList()} add {@link CompositeSet#CompositeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#duplicateSet(Iterable)}
   */
  @Test
  @DisplayName(
      "Test duplicateSet(Iterable) with 'iterable'; given CompositeSet(); when ArrayList() add CompositeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IterableUtils.duplicateSet(Iterable)"})
  void testDuplicateSetWithIterable_givenCompositeSet_whenArrayListAddCompositeSet() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#duplicateSet(Iterable)}
   */
  @Test
  @DisplayName("Test duplicateSet(Iterable) with 'iterable'; when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IterableUtils.duplicateSet(Iterable)"})
  void testDuplicateSetWithIterable_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    Set<Object> actualDuplicateSetResult = IterableUtils.duplicateSet(new ArrayList<>());

    // Assert
    assertTrue(actualDuplicateSetResult.isEmpty());
  }

  /**
   * Test {@link IterableUtils#emptyIfNull(Iterable)}.
   *
   * <ul>
   *   <li>Given array of {@link Object} with {@code Elements}.
   *   <li>Then return {@link FluentIterable}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#emptyIfNull(Iterable)}
   */
  @Test
  @DisplayName(
      "Test emptyIfNull(Iterable); given array of Object with 'Elements'; then return FluentIterable")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.emptyIfNull(Iterable)"})
  void testEmptyIfNull_givenArrayOfObjectWithElements_thenReturnFluentIterable() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.of((Iterable<Object>) new ArrayList<>());
    iterable.append("Elements");

    // Act
    Iterable<Object> actualEmptyIfNullResult = IterableUtils.emptyIfNull(iterable);
    Iterator<Object> actualIteratorResult = actualEmptyIfNullResult.iterator();

    // Assert
    assertTrue(actualEmptyIfNullResult instanceof FluentIterable);
    assertFalse(actualIteratorResult.hasNext());
    assertTrue(((FluentIterable<Object>) actualEmptyIfNullResult).toList().isEmpty());
  }

  /**
   * Test {@link IterableUtils#emptyIfNull(Iterable)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#emptyIfNull(Iterable)}
   */
  @Test
  @DisplayName("Test emptyIfNull(Iterable); when ArrayList(); then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.emptyIfNull(Iterable)"})
  void testEmptyIfNull_whenArrayList_thenReturnList() {
    // Arrange and Act
    Iterable<Object> actualEmptyIfNullResult = IterableUtils.emptyIfNull(new ArrayList<>());
    Iterator<Object> actualIteratorResult = actualEmptyIfNullResult.iterator();

    // Assert
    assertTrue(actualEmptyIfNullResult instanceof List);
    assertFalse(actualIteratorResult.hasNext());
    assertTrue(((List<Object>) actualEmptyIfNullResult).isEmpty());
  }

  /**
   * Test {@link IterableUtils#emptyIfNull(Iterable)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then iterator return {@link EmptyIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#emptyIfNull(Iterable)}
   */
  @Test
  @DisplayName("Test emptyIfNull(Iterable); when 'null'; then iterator return EmptyIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.emptyIfNull(Iterable)"})
  void testEmptyIfNull_whenNull_thenIteratorReturnEmptyIterator() {
    // Arrange and Act
    Iterable<Object> actualEmptyIfNullResult = IterableUtils.emptyIfNull(null);
    Iterator<Object> actualIteratorResult = actualEmptyIfNullResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof EmptyIterator);
    assertFalse(actualIteratorResult.hasNext());
    assertSame(((EmptyIterator) actualIteratorResult).RESETTABLE_INSTANCE, actualIteratorResult);
  }

  /**
   * Test {@link IterableUtils#emptyIterable()}.
   *
   * <p>Method under test: {@link IterableUtils#emptyIterable()}
   */
  @Test
  @DisplayName("Test emptyIterable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.emptyIterable()"})
  void testEmptyIterable() {
    // Arrange and Act
    Iterable<Object> actualEmptyIterableResult = IterableUtils.emptyIterable();
    Iterator<Object> actualIteratorResult = actualEmptyIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof EmptyIterator);
    assertFalse(actualIteratorResult.hasNext());
    assertSame(((EmptyIterator) actualIteratorResult).RESETTABLE_INSTANCE, actualIteratorResult);
  }

  /**
   * Test {@link IterableUtils#filteredIterable(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then iterator return {@link FilterIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#filteredIterable(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test filteredIterable(Iterable, Predicate); when Predicate; then iterator return FilterIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.filteredIterable(Iterable, Predicate)"})
  void testFilteredIterable_whenPredicate_thenIteratorReturnFilterIterator() {
    // Arrange and Act
    Iterable<Object> actualFilteredIterableResult =
        IterableUtils.filteredIterable(new ArrayList<>(), mock(Predicate.class));
    Iterator<Object> actualIteratorResult = actualFilteredIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof FilterIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#find(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#find(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test find(Iterable, Predicate); given 'false'; when Predicate test(Object) return 'false'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IterableUtils.find(Iterable, Predicate)"})
  void testFind_givenFalse_whenPredicateTestReturnFalse_thenReturnNull() {
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
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#find(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test find(Iterable, Predicate); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IterableUtils.find(Iterable, Predicate)"})
  void testFind_givenIllegalArgumentException_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> IterableUtils.find(iterable, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#find(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#find(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test find(Iterable, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IterableUtils.find(Iterable, Predicate)"})
  void testFind_givenTrue_whenPredicateTestReturnTrue_thenReturn42() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#find(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test find(Iterable, Predicate); when ArrayList(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IterableUtils.find(Iterable, Predicate)"})
  void testFind_whenArrayList_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(IterableUtils.find(new ArrayList<>(), mock(Predicate.class)));
  }

  /**
   * Test {@link IterableUtils#find(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#find(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test find(Iterable, Predicate); when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IterableUtils.find(Iterable, Predicate)"})
  void testFind_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(IterableUtils.find(null, mock(Predicate.class)));
  }

  /**
   * Test {@link IterableUtils#first(Iterable)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#first(Iterable)}
   */
  @Test
  @DisplayName("Test first(Iterable); given '42'; when ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IterableUtils.first(Iterable)"})
  void testFirst_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act and Assert
    assertEquals("42", IterableUtils.first(iterable));
  }

  /**
   * Test {@link IterableUtils#first(Iterable)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#first(Iterable)}
   */
  @Test
  @DisplayName("Test first(Iterable); given ArrayList() add '42'; then calls iterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IterableUtils.first(Iterable)"})
  void testFirst_givenArrayListAdd42_thenCallsIterator() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link Closure} {@link Closure#accept(Object)} does nothing.
   *   <li>Then calls {@link Closure#accept(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#forEach(Iterable, Closure)}
   */
  @Test
  @DisplayName(
      "Test forEach(Iterable, Closure); given '42'; when Closure accept(Object) does nothing; then calls accept(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IterableUtils.forEach(Iterable, Closure)"})
  void testForEach_given42_whenClosureAcceptDoesNothing_thenCallsAccept() {
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
   *
   * <ul>
   *   <li>Given {@link CollatingIterator#CollatingIterator()}.
   *   <li>When {@link Iterable} {@link Iterable#iterator()} return {@link
   *       CollatingIterator#CollatingIterator()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#forEach(Iterable, Closure)}
   */
  @Test
  @DisplayName(
      "Test forEach(Iterable, Closure); given CollatingIterator(); when Iterable iterator() return CollatingIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IterableUtils.forEach(Iterable, Closure)"})
  void testForEach_givenCollatingIterator_whenIterableIteratorReturnCollatingIterator() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(new CollatingIterator<>());

    // Act
    IterableUtils.forEach(iterable, mock(Closure.class));

    // Assert
    verify(iterable).iterator();
  }

  /**
   * Test {@link IterableUtils#forEach(Iterable, Closure)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link Iterable} {@link Iterable#iterator()} return {@code null}.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#forEach(Iterable, Closure)}
   */
  @Test
  @DisplayName(
      "Test forEach(Iterable, Closure); given 'null'; when Iterable iterator() return 'null'; then calls iterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IterableUtils.forEach(Iterable, Closure)"})
  void testForEach_givenNull_whenIterableIteratorReturnNull_thenCallsIterator() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(null);

    // Act
    IterableUtils.forEach(iterable, mock(Closure.class));

    // Assert
    verify(iterable).iterator();
  }

  /**
   * Test {@link IterableUtils#forEach(Iterable, Closure)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#forEach(Iterable, Closure)}
   */
  @Test
  @DisplayName("Test forEach(Iterable, Closure); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IterableUtils.forEach(Iterable, Closure)"})
  void testForEach_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    Closure<Object> closure = mock(Closure.class);
    doThrow(new IllegalArgumentException()).when(closure).accept(Mockito.<Object>any());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> IterableUtils.forEach(iterable, closure));
    verify(closure).accept(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#forEachButLast(Iterable, Closure)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#forEachButLast(Iterable, Closure)}
   */
  @Test
  @DisplayName(
      "Test forEachButLast(Iterable, Closure); given '42'; when ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IterableUtils.forEachButLast(Iterable, Closure)"})
  void testForEachButLast_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act and Assert
    assertEquals("42", IterableUtils.forEachButLast(iterable, mock(Closure.class)));
  }

  /**
   * Test {@link IterableUtils#forEachButLast(Iterable, Closure)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link Closure} {@link Closure#accept(Object)} does nothing.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#forEachButLast(Iterable, Closure)}
   */
  @Test
  @DisplayName(
      "Test forEachButLast(Iterable, Closure); given '42'; when Closure accept(Object) does nothing; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IterableUtils.forEachButLast(Iterable, Closure)"})
  void testForEachButLast_given42_whenClosureAcceptDoesNothing_thenReturn42() {
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
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#forEachButLast(Iterable, Closure)}
   */
  @Test
  @DisplayName("Test forEachButLast(Iterable, Closure); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IterableUtils.forEachButLast(Iterable, Closure)"})
  void testForEachButLast_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    Closure<Object> closure = mock(Closure.class);
    doThrow(new IllegalArgumentException()).when(closure).accept(Mockito.<Object>any());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> IterableUtils.forEachButLast(iterable, closure));
    verify(closure).accept(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#forEachButLast(Iterable, Closure)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#forEachButLast(Iterable, Closure)}
   */
  @Test
  @DisplayName("Test forEachButLast(Iterable, Closure); when ArrayList(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IterableUtils.forEachButLast(Iterable, Closure)"})
  void testForEachButLast_whenArrayList_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(IterableUtils.forEachButLast(new ArrayList<>(), mock(Closure.class)));
  }

  /**
   * Test {@link IterableUtils#forEachButLast(Iterable, Closure)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#forEachButLast(Iterable, Closure)}
   */
  @Test
  @DisplayName("Test forEachButLast(Iterable, Closure); when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IterableUtils.forEachButLast(Iterable, Closure)"})
  void testForEachButLast_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(IterableUtils.forEachButLast(null, mock(Closure.class)));
  }

  /**
   * Test {@link IterableUtils#frequency(Iterable, Object)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@code 42}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#frequency(Iterable, Object)}
   */
  @Test
  @DisplayName("Test frequency(Iterable, Object); given '42'; when '42'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.frequency(Iterable, Object)"})
  void testFrequency_given42_when42_thenReturnOne() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act and Assert
    assertEquals(1, IterableUtils.frequency(iterable, "42"));
  }

  /**
   * Test {@link IterableUtils#frequency(Iterable, Object)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#frequency(Iterable, Object)}
   */
  @Test
  @DisplayName(
      "Test frequency(Iterable, Object); given '42'; when ArrayList() add '42'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.frequency(Iterable, Object)"})
  void testFrequency_given42_whenArrayListAdd42_thenReturnZero() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act and Assert
    assertEquals(0, IterableUtils.frequency(iterable, null));
  }

  /**
   * Test {@link IterableUtils#frequency(Iterable, Object)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#frequency(Iterable, Object)}
   */
  @Test
  @DisplayName(
      "Test frequency(Iterable, Object); given '42'; when HashSet() add '42'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.frequency(Iterable, Object)"})
  void testFrequency_given42_whenHashSetAdd42_thenReturnOne() {
    // Arrange
    HashSet<Object> iterable = new HashSet<>();
    iterable.add("42");

    // Act and Assert
    assertEquals(1, IterableUtils.frequency(iterable, "42"));
  }

  /**
   * Test {@link IterableUtils#frequency(Iterable, Object)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@code Obj}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#frequency(Iterable, Object)}
   */
  @Test
  @DisplayName("Test frequency(Iterable, Object); given '42'; when 'Obj'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.frequency(Iterable, Object)"})
  void testFrequency_given42_whenObj_thenReturnZero() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act and Assert
    assertEquals(0, IterableUtils.frequency(iterable, "Obj"));
  }

  /**
   * Test {@link IterableUtils#frequency(Iterable, Object)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code null}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#frequency(Iterable, Object)}
   */
  @Test
  @DisplayName(
      "Test frequency(Iterable, Object); given 'null'; when ArrayList() add 'null'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.frequency(Iterable, Object)"})
  void testFrequency_givenNull_whenArrayListAddNull_thenReturnOne() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add(null);

    // Act and Assert
    assertEquals(1, IterableUtils.frequency(iterable, null));
  }

  /**
   * Test {@link IterableUtils#frequency(Iterable, Object)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#frequency(Iterable, Object)}
   */
  @Test
  @DisplayName("Test frequency(Iterable, Object); when ArrayList(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.frequency(Iterable, Object)"})
  void testFrequency_whenArrayList_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, IterableUtils.frequency(new ArrayList<>(), "Obj"));
  }

  /**
   * Test {@link IterableUtils#frequency(Iterable, Object)}.
   *
   * <ul>
   *   <li>When {@link CompositeSet#CompositeSet()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#frequency(Iterable, Object)}
   */
  @Test
  @DisplayName("Test frequency(Iterable, Object); when CompositeSet(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.frequency(Iterable, Object)"})
  void testFrequency_whenCompositeSet_thenReturnZero() {
    // Arrange
    HashSet<Object> iterable = new HashSet<>();

    // Act and Assert
    assertEquals(0, IterableUtils.frequency(iterable, new CompositeSet<>()));
  }

  /**
   * Test {@link IterableUtils#frequency(Iterable, Object)}.
   *
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#frequency(Iterable, Object)}
   */
  @Test
  @DisplayName("Test frequency(Iterable, Object); when HashBag(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.frequency(Iterable, Object)"})
  void testFrequency_whenHashBag_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, IterableUtils.frequency(new HashBag<>(), null));
  }

  /**
   * Test {@link IterableUtils#frequency(Iterable, Object)}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#frequency(Iterable, Object)}
   */
  @Test
  @DisplayName("Test frequency(Iterable, Object); when HashSet(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.frequency(Iterable, Object)"})
  void testFrequency_whenHashSet_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, IterableUtils.frequency(new HashSet<>(), null));
  }

  /**
   * Test {@link IterableUtils#frequency(Iterable, Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#frequency(Iterable, Object)}
   */
  @Test
  @DisplayName("Test frequency(Iterable, Object); when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.frequency(Iterable, Object)"})
  void testFrequency_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, IterableUtils.frequency(null, null));
  }

  /**
   * Test {@link IterableUtils#get(Iterable, int)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#get(Iterable, int)}
   */
  @Test
  @DisplayName("Test get(Iterable, int); given '42'; when ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IterableUtils.get(Iterable, int)"})
  void testGet_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    // Act and Assert
    assertEquals("42", IterableUtils.get(iterable, 1));
  }

  /**
   * Test {@link IterableUtils#get(Iterable, int)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#get(Iterable, int)}
   */
  @Test
  @DisplayName("Test get(Iterable, int); given '42'; when ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IterableUtils.get(Iterable, int)"})
  void testGet_given42_whenArrayListAdd42_thenReturn422() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    FluentIterable<Object> iterable2 = FluentIterable.of((Iterable<Object>) iterable);
    iterable2.append("Elements");

    // Act and Assert
    assertEquals("42", IterableUtils.get(iterable2, 1));
  }

  /**
   * Test {@link IterableUtils#get(Iterable, int)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#get(Iterable, int)}
   */
  @Test
  @DisplayName("Test get(Iterable, int); given ArrayList() add '42'; then calls iterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IterableUtils.get(Iterable, int)"})
  void testGet_givenArrayListAdd42_thenCallsIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(objectList.iterator());

    // Act
    Object actualGetResult = IterableUtils.get(iterable, 1);

    // Assert
    verify(iterable).iterator();
    assertEquals("42", actualGetResult);
  }

  /**
   * Test {@link IterableUtils#get(Iterable, int)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>When zero.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#get(Iterable, int)}
   */
  @Test
  @DisplayName(
      "Test get(Iterable, int); given ArrayList() add '42'; when zero; then calls iterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IterableUtils.get(Iterable, int)"})
  void testGet_givenArrayListAdd42_whenZero_thenCallsIterator() {
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
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return {@link CollectionUtils#INDEX_NOT_FOUND}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#indexOf(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test indexOf(Iterable, Predicate); given 'false'; when Predicate test(Object) return 'false'; then return INDEX_NOT_FOUND")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.indexOf(Iterable, Predicate)"})
  void testIndexOf_givenFalse_whenPredicateTestReturnFalse_thenReturnIndex_not_found() {
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
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#indexOf(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test indexOf(Iterable, Predicate); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.indexOf(Iterable, Predicate)"})
  void testIndexOf_givenIllegalArgumentException_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> IterableUtils.indexOf(iterable, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#indexOf(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#indexOf(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test indexOf(Iterable, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.indexOf(Iterable, Predicate)"})
  void testIndexOf_givenTrue_whenPredicateTestReturnTrue_thenReturnZero() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link CollectionUtils#INDEX_NOT_FOUND}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#indexOf(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test indexOf(Iterable, Predicate); when ArrayList(); then return INDEX_NOT_FOUND")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.indexOf(Iterable, Predicate)"})
  void testIndexOf_whenArrayList_thenReturnIndex_not_found() {
    // Arrange, Act and Assert
    assertEquals(
        CollectionUtils.INDEX_NOT_FOUND,
        IterableUtils.indexOf(new ArrayList<>(), mock(Predicate.class)));
  }

  /**
   * Test {@link IterableUtils#indexOf(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link CollectionUtils#INDEX_NOT_FOUND}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#indexOf(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test indexOf(Iterable, Predicate); when 'null'; then return INDEX_NOT_FOUND")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.indexOf(Iterable, Predicate)"})
  void testIndexOf_whenNull_thenReturnIndex_not_found() {
    // Arrange, Act and Assert
    assertEquals(
        CollectionUtils.INDEX_NOT_FOUND, IterableUtils.indexOf(null, mock(Predicate.class)));
  }

  /**
   * Test {@link IterableUtils#isEmpty(Iterable)}.
   *
   * <p>Method under test: {@link IterableUtils#isEmpty(Iterable)}
   */
  @Test
  @DisplayName("Test isEmpty(Iterable)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.isEmpty(Iterable)"})
  void testIsEmpty() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    IteratorChain<Object> iteratorChain = new IteratorChain<>(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iteratorChain.addIterator(objectList2.iterator());

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(iteratorChain);

    // Act
    boolean actualIsEmptyResult = IterableUtils.isEmpty(iterable);

    // Assert
    verify(iterable).iterator();
    assertTrue(actualIsEmptyResult);
  }

  /**
   * Test {@link IterableUtils#isEmpty(Iterable)}.
   *
   * <p>Method under test: {@link IterableUtils#isEmpty(Iterable)}
   */
  @Test
  @DisplayName("Test isEmpty(Iterable)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.isEmpty(Iterable)"})
  void testIsEmpty2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    FilterIterator<Object> filterIterator =
        new FilterIterator<>(objectList.iterator(), mock(Predicate.class));
    filterIterator.addTo(new ArrayList<>());

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(filterIterator);

    // Act
    boolean actualIsEmptyResult = IterableUtils.isEmpty(iterable);

    // Assert
    verify(iterable).iterator();
    assertTrue(actualIsEmptyResult);
  }

  /**
   * Test {@link IterableUtils#isEmpty(Iterable)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#isEmpty(Iterable)}
   */
  @Test
  @DisplayName("Test isEmpty(Iterable); given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.isEmpty(Iterable)"})
  void testIsEmpty_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act and Assert
    assertFalse(IterableUtils.isEmpty(iterable));
  }

  /**
   * Test {@link IterableUtils#isEmpty(Iterable)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#isEmpty(Iterable)}
   */
  @Test
  @DisplayName("Test isEmpty(Iterable); given ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.isEmpty(Iterable)"})
  void testIsEmpty_givenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    IteratorChain<Object> iteratorChain = new IteratorChain<>();
    iteratorChain.addIterator(iterator);

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(iteratorChain);

    // Act
    boolean actualIsEmptyResult = IterableUtils.isEmpty(iterable);

    // Assert
    verify(iterable).iterator();
    assertFalse(actualIsEmptyResult);
  }

  /**
   * Test {@link IterableUtils#isEmpty(Iterable)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} iterator.
   *   <li>When {@link Iterable} {@link Iterable#iterator()} return {@link ArrayList#ArrayList()}
   *       iterator.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#isEmpty(Iterable)}
   */
  @Test
  @DisplayName(
      "Test isEmpty(Iterable); given ArrayList() iterator; when Iterable iterator() return ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.isEmpty(Iterable)"})
  void testIsEmpty_givenArrayListIterator_whenIterableIteratorReturnArrayListIterator() {
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
   *
   * <ul>
   *   <li>Given {@link CollatingIterator#CollatingIterator()}.
   *   <li>When {@link Iterable} {@link Iterable#iterator()} return {@link
   *       CollatingIterator#CollatingIterator()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#isEmpty(Iterable)}
   */
  @Test
  @DisplayName(
      "Test isEmpty(Iterable); given CollatingIterator(); when Iterable iterator() return CollatingIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.isEmpty(Iterable)"})
  void testIsEmpty_givenCollatingIterator_whenIterableIteratorReturnCollatingIterator() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(new CollatingIterator<>());

    // Act
    boolean actualIsEmptyResult = IterableUtils.isEmpty(iterable);

    // Assert
    verify(iterable).iterator();
    assertTrue(actualIsEmptyResult);
  }

  /**
   * Test {@link IterableUtils#isEmpty(Iterable)}.
   *
   * <ul>
   *   <li>Given {@link IteratorChain#IteratorChain()} addIterator {@link ArrayList#ArrayList()}
   *       iterator.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#isEmpty(Iterable)}
   */
  @Test
  @DisplayName("Test isEmpty(Iterable); given IteratorChain() addIterator ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.isEmpty(Iterable)"})
  void testIsEmpty_givenIteratorChainAddIteratorArrayListIterator() {
    // Arrange
    IteratorChain<Object> iteratorChain = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iteratorChain.addIterator(objectList.iterator());

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(iteratorChain);

    // Act
    boolean actualIsEmptyResult = IterableUtils.isEmpty(iterable);

    // Assert
    verify(iterable).iterator();
    assertTrue(actualIsEmptyResult);
  }

  /**
   * Test {@link IterableUtils#isEmpty(Iterable)}.
   *
   * <ul>
   *   <li>Given {@link IteratorChain#IteratorChain()}.
   *   <li>When {@link Iterable} {@link Iterable#iterator()} return {@link
   *       IteratorChain#IteratorChain()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#isEmpty(Iterable)}
   */
  @Test
  @DisplayName(
      "Test isEmpty(Iterable); given IteratorChain(); when Iterable iterator() return IteratorChain()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.isEmpty(Iterable)"})
  void testIsEmpty_givenIteratorChain_whenIterableIteratorReturnIteratorChain() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(new IteratorChain<>());

    // Act
    boolean actualIsEmptyResult = IterableUtils.isEmpty(iterable);

    // Assert
    verify(iterable).iterator();
    assertTrue(actualIsEmptyResult);
  }

  /**
   * Test {@link IterableUtils#isEmpty(Iterable)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link Iterable} {@link Iterable#iterator()} return {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#isEmpty(Iterable)}
   */
  @Test
  @DisplayName(
      "Test isEmpty(Iterable); given 'null'; when Iterable iterator() return 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.isEmpty(Iterable)"})
  void testIsEmpty_givenNull_whenIterableIteratorReturnNull_thenReturnTrue() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(null);

    // Act
    boolean actualIsEmptyResult = IterableUtils.isEmpty(iterable);

    // Assert
    verify(iterable).iterator();
    assertTrue(actualIsEmptyResult);
  }

  /**
   * Test {@link IterableUtils#isEmpty(Iterable)}.
   *
   * <ul>
   *   <li>Given {@link OrderedMapIterator} {@link OrderedMapIterator#hasNext()} return {@code
   *       true}.
   *   <li>Then calls {@link OrderedMapIterator#hasNext()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#isEmpty(Iterable)}
   */
  @Test
  @DisplayName(
      "Test isEmpty(Iterable); given OrderedMapIterator hasNext() return 'true'; then calls hasNext()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.isEmpty(Iterable)"})
  void testIsEmpty_givenOrderedMapIteratorHasNextReturnTrue_thenCallsHasNext() {
    // Arrange
    OrderedMapIterator<Object, Object> iterator = mock(OrderedMapIterator.class);
    when(iterator.hasNext()).thenReturn(true);
    AbstractOrderedMapIteratorDecorator<Object, Object> iterator2 =
        new AbstractOrderedMapIteratorDecorator<>(iterator);

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(new AbstractMapIteratorDecorator<>(iterator2));

    // Act
    boolean actualIsEmptyResult = IterableUtils.isEmpty(iterable);

    // Assert
    verify(iterable).iterator();
    verify(iterator).hasNext();
    assertFalse(actualIsEmptyResult);
  }

  /**
   * Test {@link IterableUtils#isEmpty(Iterable)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#isEmpty(Iterable)}
   */
  @Test
  @DisplayName("Test isEmpty(Iterable); when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.isEmpty(Iterable)"})
  void testIsEmpty_whenArrayList_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(IterableUtils.isEmpty(new ArrayList<>()));
  }

  /**
   * Test {@link IterableUtils#isEmpty(Iterable)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#isEmpty(Iterable)}
   */
  @Test
  @DisplayName("Test isEmpty(Iterable); when 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.isEmpty(Iterable)"})
  void testIsEmpty_whenNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(IterableUtils.isEmpty(null));
  }

  /**
   * Test {@link IterableUtils#loopingIterable(Iterable)}.
   *
   * <p>Method under test: {@link IterableUtils#loopingIterable(Iterable)}
   */
  @Test
  @DisplayName("Test loopingIterable(Iterable)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.loopingIterable(Iterable)"})
  void testLoopingIterable() {
    // Arrange and Act
    Iterable<Object> actualLoopingIterableResult = IterableUtils.loopingIterable(new ArrayList<>());

    // Assert
    assertFalse(actualLoopingIterableResult.iterator().hasNext());
  }

  /**
   * Test {@link IterableUtils#matchesAll(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAll(Iterable, Predicate); given 'false'; when Predicate test(Object) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.matchesAll(Iterable, Predicate)"})
  void testMatchesAll_givenFalse_whenPredicateTestReturnFalse_thenReturnFalse() {
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
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAll(Iterable, Predicate); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.matchesAll(Iterable, Predicate)"})
  void testMatchesAll_givenIllegalArgumentException_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> IterableUtils.matchesAll(iterable, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#matchesAll(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAll(Iterable, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.matchesAll(Iterable, Predicate)"})
  void testMatchesAll_givenTrue_whenPredicateTestReturnTrue_thenReturnTrue() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test matchesAll(Iterable, Predicate); when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.matchesAll(Iterable, Predicate)"})
  void testMatchesAll_whenArrayList_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(IterableUtils.matchesAll(new ArrayList<>(), mock(Predicate.class)));
  }

  /**
   * Test {@link IterableUtils#matchesAll(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test matchesAll(Iterable, Predicate); when 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.matchesAll(Iterable, Predicate)"})
  void testMatchesAll_whenNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(IterableUtils.matchesAll(null, mock(Predicate.class)));
  }

  /**
   * Test {@link IterableUtils#matchesAny(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#matchesAny(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAny(Iterable, Predicate); given 'false'; when Predicate test(Object) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.matchesAny(Iterable, Predicate)"})
  void testMatchesAny_givenFalse_whenPredicateTestReturnFalse_thenReturnFalse() {
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
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#matchesAny(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAny(Iterable, Predicate); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.matchesAny(Iterable, Predicate)"})
  void testMatchesAny_givenIllegalArgumentException_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> IterableUtils.matchesAny(iterable, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#matchesAny(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#matchesAny(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAny(Iterable, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.matchesAny(Iterable, Predicate)"})
  void testMatchesAny_givenTrue_whenPredicateTestReturnTrue_thenReturnTrue() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#matchesAny(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test matchesAny(Iterable, Predicate); when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.matchesAny(Iterable, Predicate)"})
  void testMatchesAny_whenArrayList_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(IterableUtils.matchesAny(new ArrayList<>(), mock(Predicate.class)));
  }

  /**
   * Test {@link IterableUtils#matchesAny(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#matchesAny(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test matchesAny(Iterable, Predicate); when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IterableUtils.matchesAny(Iterable, Predicate)"})
  void testMatchesAny_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(IterableUtils.matchesAny(null, mock(Predicate.class)));
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Factory, Predicate[])} with {@code iterable},
   * {@code partitionFactory}, {@code predicates}.
   *
   * <p>Method under test: {@link IterableUtils#partition(Iterable, Factory, Predicate[])}
   */
  @Test
  @DisplayName(
      "Test partition(Iterable, Factory, Predicate[]) with 'iterable', 'partitionFactory', 'predicates'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Factory, Predicate[])"})
  void testPartitionWithIterablePartitionFactoryPredicates() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();

    Factory<Collection<Object>> partitionFactory = mock(Factory.class);
    when(partitionFactory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> IterableUtils.partition(iterable, partitionFactory, mock(Predicate.class)));
    verify(partitionFactory).get();
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Factory, Predicate[])} with {@code iterable},
   * {@code partitionFactory}, {@code predicates}.
   *
   * <p>Method under test: {@link IterableUtils#partition(Iterable, Factory, Predicate[])}
   */
  @Test
  @DisplayName(
      "Test partition(Iterable, Factory, Predicate[]) with 'iterable', 'partitionFactory', 'predicates'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Factory, Predicate[])"})
  void testPartitionWithIterablePartitionFactoryPredicates2() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    Factory<Collection<Object>> partitionFactory = mock(Factory.class);
    when(partitionFactory.get()).thenReturn(new ArrayList<>());

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> IterableUtils.partition(iterable, partitionFactory, predicate));
    verify(partitionFactory, atLeast(1)).get();
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Factory, Predicate[])} with {@code iterable},
   * {@code partitionFactory}, {@code predicates}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#partition(Iterable, Factory, Predicate[])}
   */
  @Test
  @DisplayName(
      "Test partition(Iterable, Factory, Predicate[]) with 'iterable', 'partitionFactory', 'predicates'; given '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Factory, Predicate[])"})
  void testPartitionWithIterablePartitionFactoryPredicates_given42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    Factory<Collection<Object>> partitionFactory = mock(Factory.class);
    ArrayList<Object> objectList = new ArrayList<>();
    when(partitionFactory.get()).thenReturn(objectList);

    // Act
    List<Collection<Object>> actualPartitionResult =
        IterableUtils.partition(iterable, partitionFactory);

    // Assert
    verify(partitionFactory).get();
    assertEquals(1, actualPartitionResult.size());
    assertSame(objectList, actualPartitionResult.get(0));
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Factory, Predicate[])} with {@code iterable},
   * {@code partitionFactory}, {@code predicates}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#partition(Iterable, Factory, Predicate[])}
   */
  @Test
  @DisplayName(
      "Test partition(Iterable, Factory, Predicate[]) with 'iterable', 'partitionFactory', 'predicates'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Factory, Predicate[])"})
  void testPartitionWithIterablePartitionFactoryPredicates_givenFalse() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    Factory<Collection<Object>> partitionFactory = mock(Factory.class);
    ArrayList<Object> objectList = new ArrayList<>();
    when(partitionFactory.get()).thenReturn(objectList);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    List<Collection<Object>> actualPartitionResult =
        IterableUtils.partition(iterable, partitionFactory, predicate);

    // Assert
    verify(partitionFactory, atLeast(1)).get();
    verify(predicate).test(isA(Object.class));
    assertEquals(2, actualPartitionResult.size());
    assertSame(objectList, actualPartitionResult.get(0));
    assertSame(objectList, actualPartitionResult.get(1));
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Factory, Predicate[])} with {@code iterable},
   * {@code partitionFactory}, {@code predicates}.
   *
   * <ul>
   *   <li>Given {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#partition(Iterable, Factory, Predicate[])}
   */
  @Test
  @DisplayName(
      "Test partition(Iterable, Factory, Predicate[]) with 'iterable', 'partitionFactory', 'predicates'; given 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Factory, Predicate[])"})
  void testPartitionWithIterablePartitionFactoryPredicates_givenTrue() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    Factory<Collection<Object>> partitionFactory = mock(Factory.class);
    ArrayList<Object> objectList = new ArrayList<>();
    when(partitionFactory.get()).thenReturn(objectList);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    List<Collection<Object>> actualPartitionResult =
        IterableUtils.partition(iterable, partitionFactory, predicate);

    // Assert
    verify(partitionFactory, atLeast(1)).get();
    verify(predicate).test(isA(Object.class));
    assertEquals(2, actualPartitionResult.size());
    assertSame(objectList, actualPartitionResult.get(0));
    assertSame(objectList, actualPartitionResult.get(1));
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Factory, Predicate[])} with {@code iterable},
   * {@code partitionFactory}, {@code predicates}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#partition(Iterable, Factory, Predicate[])}
   */
  @Test
  @DisplayName(
      "Test partition(Iterable, Factory, Predicate[]) with 'iterable', 'partitionFactory', 'predicates'; when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Factory, Predicate[])"})
  void testPartitionWithIterablePartitionFactoryPredicates_whenArrayList() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();

    Factory<Collection<Object>> partitionFactory = mock(Factory.class);
    ArrayList<Object> objectList = new ArrayList<>();
    when(partitionFactory.get()).thenReturn(objectList);

    // Act
    List<Collection<Object>> actualPartitionResult =
        IterableUtils.partition(iterable, partitionFactory, mock(Predicate.class));

    // Assert
    verify(partitionFactory, atLeast(1)).get();
    assertEquals(2, actualPartitionResult.size());
    assertSame(objectList, actualPartitionResult.get(0));
    assertSame(objectList, actualPartitionResult.get(1));
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Predicate)} with {@code iterable}, {@code
   * predicate}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return second is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#partition(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test partition(Iterable, Predicate) with 'iterable', 'predicate'; given 'false'; then return second is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Predicate)"})
  void testPartitionWithIterablePredicate_givenFalse_thenReturnSecondIsArrayList() {
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
   * Test {@link IterableUtils#partition(Iterable, Predicate)} with {@code iterable}, {@code
   * predicate}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return first is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#partition(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test partition(Iterable, Predicate) with 'iterable', 'predicate'; given 'true'; then return first is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Predicate)"})
  void testPartitionWithIterablePredicate_givenTrue_thenReturnFirstIsArrayList() {
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
   * Test {@link IterableUtils#partition(Iterable, Predicate)} with {@code iterable}, {@code
   * predicate}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#partition(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test partition(Iterable, Predicate) with 'iterable', 'predicate'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Predicate)"})
  void testPartitionWithIterablePredicate_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> IterableUtils.partition(iterable, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Predicate)} with {@code iterable}, {@code
   * predicate}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return first Empty.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#partition(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test partition(Iterable, Predicate) with 'iterable', 'predicate'; when ArrayList(); then return first Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Predicate)"})
  void testPartitionWithIterablePredicate_whenArrayList_thenReturnFirstEmpty() {
    // Arrange and Act
    List<List<Object>> actualPartitionResult =
        IterableUtils.partition(new ArrayList<>(), mock(Predicate.class));

    // Assert
    assertEquals(2, actualPartitionResult.size());
    assertTrue(actualPartitionResult.get(0).isEmpty());
    assertTrue(actualPartitionResult.get(1).isEmpty());
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Predicate)} with {@code iterable}, {@code
   * predicate}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return first Empty.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#partition(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test partition(Iterable, Predicate) with 'iterable', 'predicate'; when 'null'; then return first Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Predicate)"})
  void testPartitionWithIterablePredicate_whenNull_thenReturnFirstEmpty() {
    // Arrange and Act
    List<List<Object>> actualPartitionResult = IterableUtils.partition(null, mock(Predicate.class));

    // Assert
    assertEquals(2, actualPartitionResult.size());
    assertTrue(actualPartitionResult.get(0).isEmpty());
    assertTrue(actualPartitionResult.get(1).isEmpty());
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Predicate[])} with {@code iterable}, {@code
   * predicates}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#partition(Iterable, Predicate[])}
   */
  @Test
  @DisplayName(
      "Test partition(Iterable, Predicate[]) with 'iterable', 'predicates'; given '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Predicate[])"})
  void testPartitionWithIterablePredicates_given42_thenReturnSizeIsOne() {
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
   * Test {@link IterableUtils#partition(Iterable, Predicate[])} with {@code iterable}, {@code
   * predicates}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return second is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#partition(Iterable, Predicate[])}
   */
  @Test
  @DisplayName(
      "Test partition(Iterable, Predicate[]) with 'iterable', 'predicates'; given 'false'; then return second is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Predicate[])"})
  void testPartitionWithIterablePredicates_givenFalse_thenReturnSecondIsArrayList() {
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
   * Test {@link IterableUtils#partition(Iterable, Predicate[])} with {@code iterable}, {@code
   * predicates}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#partition(Iterable, Predicate[])}
   */
  @Test
  @DisplayName(
      "Test partition(Iterable, Predicate[]) with 'iterable', 'predicates'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Predicate[])"})
  void testPartitionWithIterablePredicates_givenTrue_whenPredicateTestReturnTrue() {
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
   * Test {@link IterableUtils#partition(Iterable, Predicate[])} with {@code iterable}, {@code
   * predicates}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#partition(Iterable, Predicate[])}
   */
  @Test
  @DisplayName(
      "Test partition(Iterable, Predicate[]) with 'iterable', 'predicates'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Predicate[])"})
  void testPartitionWithIterablePredicates_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> IterableUtils.partition(iterable, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Predicate[])} with {@code iterable}, {@code
   * predicates}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return first Empty.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#partition(Iterable, Predicate[])}
   */
  @Test
  @DisplayName(
      "Test partition(Iterable, Predicate[]) with 'iterable', 'predicates'; when ArrayList(); then return first Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Predicate[])"})
  void testPartitionWithIterablePredicates_whenArrayList_thenReturnFirstEmpty() {
    // Arrange and Act
    List<List<Object>> actualPartitionResult =
        IterableUtils.partition(new ArrayList<>(), mock(Predicate.class));

    // Assert
    assertEquals(2, actualPartitionResult.size());
    assertTrue(actualPartitionResult.get(0).isEmpty());
    assertTrue(actualPartitionResult.get(1).isEmpty());
  }

  /**
   * Test {@link IterableUtils#partition(Iterable, Predicate[])} with {@code iterable}, {@code
   * predicates}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return first Empty.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#partition(Iterable, Predicate[])}
   */
  @Test
  @DisplayName(
      "Test partition(Iterable, Predicate[]) with 'iterable', 'predicates'; when 'null'; then return first Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.partition(Iterable, Predicate[])"})
  void testPartitionWithIterablePredicates_whenNull_thenReturnFirstEmpty() {
    // Arrange and Act
    List<List<Object>> actualPartitionResult = IterableUtils.partition(null, mock(Predicate.class));

    // Assert
    assertEquals(2, actualPartitionResult.size());
    assertTrue(actualPartitionResult.get(0).isEmpty());
    assertTrue(actualPartitionResult.get(1).isEmpty());
  }

  /**
   * Test {@link IterableUtils#reversedIterable(Iterable)}.
   *
   * <p>Method under test: {@link IterableUtils#reversedIterable(Iterable)}
   */
  @Test
  @DisplayName("Test reversedIterable(Iterable)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.reversedIterable(Iterable)"})
  void testReversedIterable() {
    // Arrange and Act
    Iterable<Object> actualReversedIterableResult =
        IterableUtils.reversedIterable(new ArrayList<>());
    Iterator<Object> actualIteratorResult = actualReversedIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof ReverseListIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#size(Iterable)}.
   *
   * <p>Method under test: {@link IterableUtils#size(Iterable)}
   */
  @Test
  @DisplayName("Test size(Iterable)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.size(Iterable)"})
  void testSize() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);

    ArrayList<Object> objectList = new ArrayList<>();
    BoundedIterator<Object> boundedIteratorResult =
        IteratorUtils.boundedIterator(objectList.iterator(), 1L, 1L);
    when(iterable.iterator()).thenReturn(boundedIteratorResult);

    // Act
    int actualSizeResult = IterableUtils.size(iterable);

    // Assert
    verify(iterable).iterator();
    assertEquals(0, actualSizeResult);
  }

  /**
   * Test {@link IterableUtils#size(Iterable)}.
   *
   * <p>Method under test: {@link IterableUtils#size(Iterable)}
   */
  @Test
  @DisplayName("Test size(Iterable)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.size(Iterable)"})
  void testSize2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    IteratorChain<Object> iteratorChain = new IteratorChain<>(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iteratorChain.addIterator(objectList2.iterator());

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(iteratorChain);

    // Act
    int actualSizeResult = IterableUtils.size(iterable);

    // Assert
    verify(iterable).iterator();
    assertEquals(0, actualSizeResult);
  }

  /**
   * Test {@link IterableUtils#size(Iterable)}.
   *
   * <p>Method under test: {@link IterableUtils#size(Iterable)}
   */
  @Test
  @DisplayName("Test size(Iterable)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.size(Iterable)"})
  void testSize3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    FilterIterator<Object> filterIterator =
        new FilterIterator<>(objectList.iterator(), mock(Predicate.class));
    filterIterator.addTo(new ArrayList<>());

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(filterIterator);

    // Act
    int actualSizeResult = IterableUtils.size(iterable);

    // Assert
    verify(iterable).iterator();
    assertEquals(0, actualSizeResult);
  }

  /**
   * Test {@link IterableUtils#size(Iterable)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#size(Iterable)}
   */
  @Test
  @DisplayName("Test size(Iterable); given ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.size(Iterable)"})
  void testSize_givenArrayListAdd42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    BoundedIterator<Object> boundedIteratorResult =
        IteratorUtils.boundedIterator(objectList.iterator(), 1L, 1L);

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(boundedIteratorResult);

    // Act
    int actualSizeResult = IterableUtils.size(iterable);

    // Assert
    verify(iterable).iterator();
    assertEquals(1, actualSizeResult);
  }

  /**
   * Test {@link IterableUtils#size(Iterable)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#size(Iterable)}
   */
  @Test
  @DisplayName("Test size(Iterable); given ArrayList() add '42'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.size(Iterable)"})
  void testSize_givenArrayListAdd42_thenReturnOne() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    IteratorChain<Object> iteratorChain = new IteratorChain<>();
    iteratorChain.addIterator(iterator);

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(iteratorChain);

    // Act
    int actualSizeResult = IterableUtils.size(iterable);

    // Assert
    verify(iterable).iterator();
    assertEquals(1, actualSizeResult);
  }

  /**
   * Test {@link IterableUtils#size(Iterable)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} iterator.
   *   <li>When {@link Iterable} {@link Iterable#iterator()} return {@link ArrayList#ArrayList()}
   *       iterator.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#size(Iterable)}
   */
  @Test
  @DisplayName(
      "Test size(Iterable); given ArrayList() iterator; when Iterable iterator() return ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.size(Iterable)"})
  void testSize_givenArrayListIterator_whenIterableIteratorReturnArrayListIterator() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);

    ArrayList<Object> objectList = new ArrayList<>();
    when(iterable.iterator()).thenReturn(objectList.iterator());

    // Act
    int actualSizeResult = IterableUtils.size(iterable);

    // Assert
    verify(iterable).iterator();
    assertEquals(0, actualSizeResult);
  }

  /**
   * Test {@link IterableUtils#size(Iterable)}.
   *
   * <ul>
   *   <li>Given {@link CollatingIterator#CollatingIterator()}.
   *   <li>When {@link Iterable} {@link Iterable#iterator()} return {@link
   *       CollatingIterator#CollatingIterator()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#size(Iterable)}
   */
  @Test
  @DisplayName(
      "Test size(Iterable); given CollatingIterator(); when Iterable iterator() return CollatingIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.size(Iterable)"})
  void testSize_givenCollatingIterator_whenIterableIteratorReturnCollatingIterator() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(new CollatingIterator<>());

    // Act
    int actualSizeResult = IterableUtils.size(iterable);

    // Assert
    verify(iterable).iterator();
    assertEquals(0, actualSizeResult);
  }

  /**
   * Test {@link IterableUtils#size(Iterable)}.
   *
   * <ul>
   *   <li>Given {@link EnumerationIterator#EnumerationIterator()} Enumeration is {@link
   *       StringTokenizer#StringTokenizer(String)} with {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#size(Iterable)}
   */
  @Test
  @DisplayName(
      "Test size(Iterable); given EnumerationIterator() Enumeration is StringTokenizer(String) with 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.size(Iterable)"})
  void testSize_givenEnumerationIteratorEnumerationIsStringTokenizerWithFoo() {
    // Arrange
    EnumerationIterator<Object> enumerationIterator = new EnumerationIterator<>();
    enumerationIterator.setEnumeration(new StringTokenizer("foo"));

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(enumerationIterator);

    // Act
    int actualSizeResult = IterableUtils.size(iterable);

    // Assert
    verify(iterable).iterator();
    assertEquals(1, actualSizeResult);
  }

  /**
   * Test {@link IterableUtils#size(Iterable)}.
   *
   * <ul>
   *   <li>Given {@link IteratorChain#IteratorChain()} addIterator {@link ArrayList#ArrayList()}
   *       iterator.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#size(Iterable)}
   */
  @Test
  @DisplayName("Test size(Iterable); given IteratorChain() addIterator ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.size(Iterable)"})
  void testSize_givenIteratorChainAddIteratorArrayListIterator() {
    // Arrange
    IteratorChain<Object> iteratorChain = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iteratorChain.addIterator(objectList.iterator());

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(iteratorChain);

    // Act
    int actualSizeResult = IterableUtils.size(iterable);

    // Assert
    verify(iterable).iterator();
    assertEquals(0, actualSizeResult);
  }

  /**
   * Test {@link IterableUtils#size(Iterable)}.
   *
   * <ul>
   *   <li>Given {@link IteratorChain#IteratorChain()}.
   *   <li>When {@link Iterable} {@link Iterable#iterator()} return {@link
   *       IteratorChain#IteratorChain()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#size(Iterable)}
   */
  @Test
  @DisplayName(
      "Test size(Iterable); given IteratorChain(); when Iterable iterator() return IteratorChain()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.size(Iterable)"})
  void testSize_givenIteratorChain_whenIterableIteratorReturnIteratorChain() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(new IteratorChain<>());

    // Act
    int actualSizeResult = IterableUtils.size(iterable);

    // Assert
    verify(iterable).iterator();
    assertEquals(0, actualSizeResult);
  }

  /**
   * Test {@link IterableUtils#size(Iterable)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link Iterable} {@link Iterable#iterator()} return {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#size(Iterable)}
   */
  @Test
  @DisplayName(
      "Test size(Iterable); given 'null'; when Iterable iterator() return 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.size(Iterable)"})
  void testSize_givenNull_whenIterableIteratorReturnNull_thenReturnZero() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(null);

    // Act
    int actualSizeResult = IterableUtils.size(iterable);

    // Assert
    verify(iterable).iterator();
    assertEquals(0, actualSizeResult);
  }

  /**
   * Test {@link IterableUtils#size(Iterable)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#size(Iterable)}
   */
  @Test
  @DisplayName("Test size(Iterable); when ArrayList(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.size(Iterable)"})
  void testSize_whenArrayList_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, IterableUtils.size(new ArrayList<>()));
  }

  /**
   * Test {@link IterableUtils#size(Iterable)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#size(Iterable)}
   */
  @Test
  @DisplayName("Test size(Iterable); when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IterableUtils.size(Iterable)"})
  void testSize_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, IterableUtils.size(null));
  }

  /**
   * Test {@link IterableUtils#skippingIterable(Iterable, long)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#skippingIterable(Iterable, long)}
   */
  @Test
  @DisplayName("Test skippingIterable(Iterable, long); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.skippingIterable(Iterable, long)"})
  void testSkippingIterable_given42_whenArrayListAdd42() {
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
   *
   * <ul>
   *   <li>When one.
   *   <li>Then iterator return {@link SkippingIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#skippingIterable(Iterable, long)}
   */
  @Test
  @DisplayName(
      "Test skippingIterable(Iterable, long); when one; then iterator return SkippingIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.skippingIterable(Iterable, long)"})
  void testSkippingIterable_whenOne_thenIteratorReturnSkippingIterator() {
    // Arrange and Act
    Iterable<Object> actualSkippingIterableResult =
        IterableUtils.skippingIterable(new ArrayList<>(), 1L);
    Iterator<Object> actualIteratorResult = actualSkippingIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof SkippingIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#skippingIterable(Iterable, long)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then iterator return {@link SkippingIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#skippingIterable(Iterable, long)}
   */
  @Test
  @DisplayName(
      "Test skippingIterable(Iterable, long); when zero; then iterator return SkippingIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.skippingIterable(Iterable, long)"})
  void testSkippingIterable_whenZero_thenIteratorReturnSkippingIterator() {
    // Arrange and Act
    Iterable<Object> actualSkippingIterableResult =
        IterableUtils.skippingIterable(new ArrayList<>(), 0L);
    Iterator<Object> actualIteratorResult = actualSkippingIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof SkippingIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#toList(Iterable)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#toList(Iterable)}
   */
  @Test
  @DisplayName(
      "Test toList(Iterable); given '42'; when ArrayList() add '42'; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.toList(Iterable)"})
  void testToList_given42_whenArrayListAdd42_thenReturnArrayList() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#toList(Iterable)}
   */
  @Test
  @DisplayName("Test toList(Iterable); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.toList(Iterable)"})
  void testToList_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    List<Object> actualToListResult = IterableUtils.toList(new ArrayList<>());

    // Assert
    assertTrue(actualToListResult.isEmpty());
  }

  /**
   * Test {@link IterableUtils#toList(Iterable)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#toList(Iterable)}
   */
  @Test
  @DisplayName("Test toList(Iterable); when 'null'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IterableUtils.toList(Iterable)"})
  void testToList_whenNull_thenReturnEmpty() {
    // Arrange and Act
    List<Object> actualToListResult = IterableUtils.toList(null);

    // Assert
    assertTrue(actualToListResult.isEmpty());
  }

  /**
   * Test {@link IterableUtils#toString(Iterable)} with {@code iterable}.
   *
   * <p>Method under test: {@link IterableUtils#toString(Iterable)}
   */
  @Test
  @DisplayName("Test toString(Iterable) with 'iterable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IterableUtils.toString(Iterable)"})
  void testToStringWithIterable() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);

    ArrayList<Object> objectList = new ArrayList<>();
    BoundedIterator<Object> boundedIteratorResult =
        IteratorUtils.boundedIterator(objectList.iterator(), 1L, 1L);
    when(iterable.iterator()).thenReturn(boundedIteratorResult);

    // Act
    String actualToStringResult = IterableUtils.toString(iterable);

    // Assert
    verify(iterable).iterator();
    assertEquals("[]", actualToStringResult);
  }

  /**
   * Test {@link IterableUtils#toString(Iterable)} with {@code iterable}.
   *
   * <p>Method under test: {@link IterableUtils#toString(Iterable)}
   */
  @Test
  @DisplayName("Test toString(Iterable) with 'iterable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IterableUtils.toString(Iterable)"})
  void testToStringWithIterable2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    IteratorChain<Object> iteratorChain = new IteratorChain<>(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iteratorChain.addIterator(objectList2.iterator());

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(iteratorChain);

    // Act
    String actualToStringResult = IterableUtils.toString(iterable);

    // Assert
    verify(iterable).iterator();
    assertEquals("[]", actualToStringResult);
  }

  /**
   * Test {@link IterableUtils#toString(Iterable)} with {@code iterable}.
   *
   * <p>Method under test: {@link IterableUtils#toString(Iterable)}
   */
  @Test
  @DisplayName("Test toString(Iterable) with 'iterable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IterableUtils.toString(Iterable)"})
  void testToStringWithIterable3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    FilterIterator<Object> filterIterator =
        new FilterIterator<>(objectList.iterator(), mock(Predicate.class));
    filterIterator.addTo(new ArrayList<>());

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(filterIterator);

    // Act
    String actualToStringResult = IterableUtils.toString(iterable);

    // Assert
    verify(iterable).iterator();
    assertEquals("[]", actualToStringResult);
  }

  /**
   * Test {@link IterableUtils#toString(Iterable, Transformer, String, String, String)} with {@code
   * iterable}, {@code transformer}, {@code delimiter}, {@code prefix}, {@code suffix}.
   *
   * <p>Method under test: {@link IterableUtils#toString(Iterable, Transformer, String, String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test toString(Iterable, Transformer, String, String, String) with 'iterable', 'transformer', 'delimiter', 'prefix', 'suffix'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String IterableUtils.toString(Iterable, Transformer, String, String, String)"
  })
  void testToStringWithIterableTransformerDelimiterPrefixSuffix() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    Transformer<Object, String> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    String actualToStringResult =
        IterableUtils.toString(iterable, transformer, "Delimiter", "Prefix", "Suffix");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals("PrefixApplySuffix", actualToStringResult);
  }

  /**
   * Test {@link IterableUtils#toString(Iterable, Transformer, String, String, String)} with {@code
   * iterable}, {@code transformer}, {@code delimiter}, {@code prefix}, {@code suffix}.
   *
   * <p>Method under test: {@link IterableUtils#toString(Iterable, Transformer, String, String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test toString(Iterable, Transformer, String, String, String) with 'iterable', 'transformer', 'delimiter', 'prefix', 'suffix'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String IterableUtils.toString(Iterable, Transformer, String, String, String)"
  })
  void testToStringWithIterableTransformerDelimiterPrefixSuffix2() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    Transformer<Object, String> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> IterableUtils.toString(iterable, transformer, "Delimiter", "Prefix", "Suffix"));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#toString(Iterable, Transformer, String, String, String)} with {@code
   * iterable}, {@code transformer}, {@code delimiter}, {@code prefix}, {@code suffix}.
   *
   * <ul>
   *   <li>Then return {@code PrefixSuffix}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#toString(Iterable, Transformer, String, String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test toString(Iterable, Transformer, String, String, String) with 'iterable', 'transformer', 'delimiter', 'prefix', 'suffix'; then return 'PrefixSuffix'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String IterableUtils.toString(Iterable, Transformer, String, String, String)"
  })
  void testToStringWithIterableTransformerDelimiterPrefixSuffix_thenReturnPrefixSuffix() {
    // Arrange and Act
    String actualToStringResult =
        IterableUtils.toString(null, mock(Transformer.class), "Delimiter", "Prefix", "Suffix");

    // Assert
    assertEquals("PrefixSuffix", actualToStringResult);
  }

  /**
   * Test {@link IterableUtils#toString(Iterable, Transformer, String, String, String)} with {@code
   * iterable}, {@code transformer}, {@code delimiter}, {@code prefix}, {@code suffix}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#toString(Iterable, Transformer, String, String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test toString(Iterable, Transformer, String, String, String) with 'iterable', 'transformer', 'delimiter', 'prefix', 'suffix'; when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String IterableUtils.toString(Iterable, Transformer, String, String, String)"
  })
  void testToStringWithIterableTransformerDelimiterPrefixSuffix_whenArrayList() {
    // Arrange and Act
    String actualToStringResult =
        IterableUtils.toString(
            new ArrayList<>(), mock(Transformer.class), "Delimiter", "Prefix", "Suffix");

    // Assert
    assertEquals("PrefixSuffix", actualToStringResult);
  }

  /**
   * Test {@link IterableUtils#toString(Iterable, Transformer)} with {@code iterable}, {@code
   * transformer}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then return {@code [Apply]}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#toString(Iterable, Transformer)}
   */
  @Test
  @DisplayName(
      "Test toString(Iterable, Transformer) with 'iterable', 'transformer'; given 'Apply'; then return '[Apply]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IterableUtils.toString(Iterable, Transformer)"})
  void testToStringWithIterableTransformer_givenApply_thenReturnApply() {
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
   * Test {@link IterableUtils#toString(Iterable, Transformer)} with {@code iterable}, {@code
   * transformer}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#toString(Iterable, Transformer)}
   */
  @Test
  @DisplayName(
      "Test toString(Iterable, Transformer) with 'iterable', 'transformer'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IterableUtils.toString(Iterable, Transformer)"})
  void testToStringWithIterableTransformer_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    Transformer<Object, String> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> IterableUtils.toString(iterable, transformer));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link IterableUtils#toString(Iterable, Transformer)} with {@code iterable}, {@code
   * transformer}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#toString(Iterable, Transformer)}
   */
  @Test
  @DisplayName(
      "Test toString(Iterable, Transformer) with 'iterable', 'transformer'; when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IterableUtils.toString(Iterable, Transformer)"})
  void testToStringWithIterableTransformer_whenArrayList() {
    // Arrange, Act and Assert
    assertEquals("[]", IterableUtils.toString(new ArrayList<>(), mock(Transformer.class)));
  }

  /**
   * Test {@link IterableUtils#toString(Iterable, Transformer)} with {@code iterable}, {@code
   * transformer}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#toString(Iterable, Transformer)}
   */
  @Test
  @DisplayName("Test toString(Iterable, Transformer) with 'iterable', 'transformer'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IterableUtils.toString(Iterable, Transformer)"})
  void testToStringWithIterableTransformer_whenNull() {
    // Arrange, Act and Assert
    assertEquals("[]", IterableUtils.toString(null, mock(Transformer.class)));
  }

  /**
   * Test {@link IterableUtils#toString(Iterable)} with {@code iterable}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code [42]}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#toString(Iterable)}
   */
  @Test
  @DisplayName(
      "Test toString(Iterable) with 'iterable'; given '42'; when ArrayList() add '42'; then return '[42]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IterableUtils.toString(Iterable)"})
  void testToStringWithIterable_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act and Assert
    assertEquals("[42]", IterableUtils.toString(iterable));
  }

  /**
   * Test {@link IterableUtils#toString(Iterable)} with {@code iterable}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#toString(Iterable)}
   */
  @Test
  @DisplayName("Test toString(Iterable) with 'iterable'; given ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IterableUtils.toString(Iterable)"})
  void testToStringWithIterable_givenArrayListAdd42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    BoundedIterator<Object> boundedIteratorResult =
        IteratorUtils.boundedIterator(objectList.iterator(), 1L, 1L);

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(boundedIteratorResult);

    // Act
    String actualToStringResult = IterableUtils.toString(iterable);

    // Assert
    verify(iterable).iterator();
    assertEquals("[42]", actualToStringResult);
  }

  /**
   * Test {@link IterableUtils#toString(Iterable)} with {@code iterable}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code [42]}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#toString(Iterable)}
   */
  @Test
  @DisplayName(
      "Test toString(Iterable) with 'iterable'; given ArrayList() add '42'; then return '[42]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IterableUtils.toString(Iterable)"})
  void testToStringWithIterable_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    IteratorChain<Object> iteratorChain = new IteratorChain<>();
    iteratorChain.addIterator(iterator);

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(iteratorChain);

    // Act
    String actualToStringResult = IterableUtils.toString(iterable);

    // Assert
    verify(iterable).iterator();
    assertEquals("[42]", actualToStringResult);
  }

  /**
   * Test {@link IterableUtils#toString(Iterable)} with {@code iterable}.
   *
   * <ul>
   *   <li>Given {@link CollatingIterator#CollatingIterator()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#toString(Iterable)}
   */
  @Test
  @DisplayName("Test toString(Iterable) with 'iterable'; given CollatingIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IterableUtils.toString(Iterable)"})
  void testToStringWithIterable_givenCollatingIterator() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(new CollatingIterator<>());

    // Act
    String actualToStringResult = IterableUtils.toString(iterable);

    // Assert
    verify(iterable).iterator();
    assertEquals("[]", actualToStringResult);
  }

  /**
   * Test {@link IterableUtils#toString(Iterable)} with {@code iterable}.
   *
   * <ul>
   *   <li>Given {@link IteratorChain#IteratorChain()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#toString(Iterable)}
   */
  @Test
  @DisplayName("Test toString(Iterable) with 'iterable'; given IteratorChain()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IterableUtils.toString(Iterable)"})
  void testToStringWithIterable_givenIteratorChain() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(new IteratorChain<>());

    // Act
    String actualToStringResult = IterableUtils.toString(iterable);

    // Assert
    verify(iterable).iterator();
    assertEquals("[]", actualToStringResult);
  }

  /**
   * Test {@link IterableUtils#toString(Iterable)} with {@code iterable}.
   *
   * <ul>
   *   <li>Given {@link IteratorChain#IteratorChain()} addIterator {@link ArrayList#ArrayList()}
   *       iterator.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#toString(Iterable)}
   */
  @Test
  @DisplayName(
      "Test toString(Iterable) with 'iterable'; given IteratorChain() addIterator ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IterableUtils.toString(Iterable)"})
  void testToStringWithIterable_givenIteratorChainAddIteratorArrayListIterator() {
    // Arrange
    IteratorChain<Object> iteratorChain = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iteratorChain.addIterator(objectList.iterator());

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(iteratorChain);

    // Act
    String actualToStringResult = IterableUtils.toString(iterable);

    // Assert
    verify(iterable).iterator();
    assertEquals("[]", actualToStringResult);
  }

  /**
   * Test {@link IterableUtils#toString(Iterable)} with {@code iterable}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link Iterable} {@link Iterable#iterator()} return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#toString(Iterable)}
   */
  @Test
  @DisplayName(
      "Test toString(Iterable) with 'iterable'; given 'null'; when Iterable iterator() return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IterableUtils.toString(Iterable)"})
  void testToStringWithIterable_givenNull_whenIterableIteratorReturnNull() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(null);

    // Act
    String actualToStringResult = IterableUtils.toString(iterable);

    // Assert
    verify(iterable).iterator();
    assertEquals("[]", actualToStringResult);
  }

  /**
   * Test {@link IterableUtils#toString(Iterable)} with {@code iterable}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#toString(Iterable)}
   */
  @Test
  @DisplayName("Test toString(Iterable) with 'iterable'; when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IterableUtils.toString(Iterable)"})
  void testToStringWithIterable_whenArrayList() {
    // Arrange, Act and Assert
    assertEquals("[]", IterableUtils.toString(new ArrayList<>()));
  }

  /**
   * Test {@link IterableUtils#toString(Iterable)} with {@code iterable}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code []}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#toString(Iterable)}
   */
  @Test
  @DisplayName("Test toString(Iterable) with 'iterable'; when 'null'; then return '[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IterableUtils.toString(Iterable)"})
  void testToStringWithIterable_whenNull_thenReturnLeftSquareBracketRightSquareBracket() {
    // Arrange, Act and Assert
    assertEquals("[]", IterableUtils.toString(null));
  }

  /**
   * Test {@link IterableUtils#transformedIterable(Iterable, Transformer)}.
   *
   * <ul>
   *   <li>When {@link Transformer}.
   *   <li>Then iterator return {@link TransformIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#transformedIterable(Iterable, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedIterable(Iterable, Transformer); when Transformer; then iterator return TransformIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.transformedIterable(Iterable, Transformer)"})
  void testTransformedIterable_whenTransformer_thenIteratorReturnTransformIterator() {
    // Arrange and Act
    Iterable<Object> actualTransformedIterableResult =
        IterableUtils.transformedIterable(new ArrayList<>(), mock(Transformer.class));
    Iterator<Object> actualIteratorResult = actualTransformedIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof TransformIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#uniqueIterable(Iterable)}.
   *
   * <p>Method under test: {@link IterableUtils#uniqueIterable(Iterable)}
   */
  @Test
  @DisplayName("Test uniqueIterable(Iterable)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.uniqueIterable(Iterable)"})
  void testUniqueIterable() {
    // Arrange and Act
    Iterable<Object> actualUniqueIterableResult = IterableUtils.uniqueIterable(new ArrayList<>());
    Iterator<Object> actualIteratorResult = actualUniqueIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof UniqueFilterIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#unmodifiableIterable(Iterable)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then iterator return {@link UnmodifiableIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#unmodifiableIterable(Iterable)}
   */
  @Test
  @DisplayName(
      "Test unmodifiableIterable(Iterable); when ArrayList(); then iterator return UnmodifiableIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.unmodifiableIterable(Iterable)"})
  void testUnmodifiableIterable_whenArrayList_thenIteratorReturnUnmodifiableIterator() {
    // Arrange and Act
    Iterable<Object> actualUnmodifiableIterableResult =
        IterableUtils.unmodifiableIterable(new ArrayList<>());
    Iterator<Object> actualIteratorResult = actualUnmodifiableIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof UnmodifiableIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#unmodifiableIterable(Iterable)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then iterator return {@link UnmodifiableIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#unmodifiableIterable(Iterable)}
   */
  @Test
  @DisplayName(
      "Test unmodifiableIterable(Iterable); when empty; then iterator return UnmodifiableIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.unmodifiableIterable(Iterable)"})
  void testUnmodifiableIterable_whenEmpty_thenIteratorReturnUnmodifiableIterator() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.empty();

    // Act
    Iterable<Object> actualUnmodifiableIterableResult =
        IterableUtils.unmodifiableIterable(iterable);
    Iterator<Object> actualIteratorResult = actualUnmodifiableIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof UnmodifiableIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#unmodifiableIterable(Iterable)}.
   *
   * <ul>
   *   <li>When {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()} append {@code
   *       Elements}.
   * </ul>
   *
   * <p>Method under test: {@link IterableUtils#unmodifiableIterable(Iterable)}
   */
  @Test
  @DisplayName(
      "Test unmodifiableIterable(Iterable); when FluentIterable with iterable is ArrayList() append 'Elements'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.unmodifiableIterable(Iterable)"})
  void testUnmodifiableIterable_whenFluentIterableWithIterableIsArrayListAppendElements() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.of((Iterable<Object>) new ArrayList<>());
    iterable.append("Elements");

    // Act
    Iterable<Object> actualUnmodifiableIterableResult =
        IterableUtils.unmodifiableIterable(iterable);
    Iterator<Object> actualIteratorResult = actualUnmodifiableIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof UnmodifiableIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#zippingIterable(Iterable, Iterable)} with {@code a}, {@code b}.
   *
   * <p>Method under test: {@link IterableUtils#zippingIterable(Iterable, Iterable)}
   */
  @Test
  @DisplayName("Test zippingIterable(Iterable, Iterable) with 'a', 'b'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.zippingIterable(Iterable, Iterable)"})
  void testZippingIterableWithAB() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Iterable<Object> actualZippingIterableResult =
        IterableUtils.zippingIterable(a, new ArrayList<>());
    Iterator<Object> actualIteratorResult = actualZippingIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof ZippingIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link IterableUtils#zippingIterable(Iterable, Iterable[])} with {@code first}, {@code
   * others}.
   *
   * <p>Method under test: {@link IterableUtils#zippingIterable(Iterable, Iterable[])}
   */
  @Test
  @DisplayName("Test zippingIterable(Iterable, Iterable[]) with 'first', 'others'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IterableUtils.zippingIterable(Iterable, Iterable[])"})
  void testZippingIterableWithFirstOthers() {
    // Arrange
    ArrayList<Object> first = new ArrayList<>();

    // Act
    Iterable<Object> actualZippingIterableResult =
        IterableUtils.zippingIterable(first, new ArrayList<>());
    Iterator<Object> actualIteratorResult = actualZippingIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof ZippingIterator);
    assertFalse(actualIteratorResult.hasNext());
  }
}
