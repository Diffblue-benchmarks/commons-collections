package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.collections4.iterators.EmptyIterator;
import org.apache.commons.collections4.iterators.IteratorEnumeration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FluentIterableDiffblueTest {
  /**
   * Test {@link FluentIterable#empty()}.
   *
   * <p>Method under test: {@link FluentIterable#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FluentIterable FluentIterable.empty()"})
  void testEmpty() {
    // Arrange and Act
    FluentIterable<Object> actualEmptyResult = FluentIterable.empty();

    // Assert
    assertTrue(actualEmptyResult.toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#of(Object[])} with {@code elements}.
   *
   * <p>Method under test: {@link FluentIterable#of(Object[])}
   */
  @Test
  @DisplayName("Test of(Object[]) with 'elements'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FluentIterable FluentIterable.of(Object[])"})
  void testOfWithElements() {
    // Arrange and Act
    FluentIterable<Object> actualOfResult = FluentIterable.of("Elements");

    // Assert
    List<Object> toListResult = actualOfResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals("Elements", toListResult.get(0));
  }

  /**
   * Test {@link FluentIterable#of(Iterable)} with {@code iterable}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#of(Iterable)}
   */
  @Test
  @DisplayName("Test of(Iterable) with 'iterable'; when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FluentIterable FluentIterable.of(Iterable)"})
  void testOfWithIterable_whenArrayList() {
    // Arrange and Act
    FluentIterable<Object> actualOfResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Assert
    assertTrue(actualOfResult.toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#of(Iterable)} with {@code iterable}.
   *
   * <ul>
   *   <li>When empty.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#of(Iterable)}
   */
  @Test
  @DisplayName("Test of(Iterable) with 'iterable'; when empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FluentIterable FluentIterable.of(Iterable)"})
  void testOfWithIterable_whenEmpty() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.empty();

    // Act
    FluentIterable<Object> actualOfResult = FluentIterable.of((Iterable<Object>) iterable);

    // Assert
    assertTrue(actualOfResult.toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#of(Object)} with {@code singleton}.
   *
   * <p>Method under test: {@link FluentIterable#of(Object)}
   */
  @Test
  @DisplayName("Test of(Object) with 'singleton'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FluentIterable FluentIterable.of(Object)"})
  void testOfWithSingleton() {
    // Arrange and Act
    FluentIterable<Object> actualOfResult = FluentIterable.of("Singleton");

    // Assert
    List<Object> toListResult = actualOfResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals("Singleton", toListResult.get(0));
  }

  /**
   * Test {@link FluentIterable#allMatch(Predicate)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link Predicate}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#allMatch(Predicate)}
   */
  @Test
  @DisplayName("Test allMatch(Predicate); given empty; when Predicate; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FluentIterable.allMatch(Predicate)"})
  void testAllMatch_givenEmpty_whenPredicate_thenReturnTrue() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.allMatch(mock(Predicate.class)));
  }

  /**
   * Test {@link FluentIterable#allMatch(Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#allMatch(Predicate)}
   */
  @Test
  @DisplayName(
      "Test allMatch(Predicate); given 'false'; when Predicate test(Object) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FluentIterable.allMatch(Predicate)"})
  void testAllMatch_givenFalse_whenPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) iterable);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualAllMatchResult = ofResult.allMatch(predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualAllMatchResult);
  }

  /**
   * Test {@link FluentIterable#allMatch(Predicate)}.
   *
   * <ul>
   *   <li>Given {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#allMatch(Predicate)}
   */
  @Test
  @DisplayName(
      "Test allMatch(Predicate); given FluentIterable with iterable is ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FluentIterable.allMatch(Predicate)"})
  void testAllMatch_givenFluentIterableWithIterableIsArrayList_thenReturnTrue() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.allMatch(mock(Predicate.class)));
  }

  /**
   * Test {@link FluentIterable#allMatch(Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then calls {@link Predicate#test(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#allMatch(Predicate)}
   */
  @Test
  @DisplayName(
      "Test allMatch(Predicate); given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FluentIterable.allMatch(Predicate)"})
  void testAllMatch_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) iterable);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualAllMatchResult = ofResult.allMatch(predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAllMatchResult);
  }

  /**
   * Test {@link FluentIterable#anyMatch(Predicate)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link Predicate}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#anyMatch(Predicate)}
   */
  @Test
  @DisplayName("Test anyMatch(Predicate); given empty; when Predicate; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FluentIterable.anyMatch(Predicate)"})
  void testAnyMatch_givenEmpty_whenPredicate_thenReturnFalse() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertFalse(emptyResult.anyMatch(mock(Predicate.class)));
  }

  /**
   * Test {@link FluentIterable#anyMatch(Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then calls {@link Predicate#test(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#anyMatch(Predicate)}
   */
  @Test
  @DisplayName(
      "Test anyMatch(Predicate); given 'false'; when Predicate test(Object) return 'false'; then calls test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FluentIterable.anyMatch(Predicate)"})
  void testAnyMatch_givenFalse_whenPredicateTestReturnFalse_thenCallsTest() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) iterable);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualAnyMatchResult = ofResult.anyMatch(predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualAnyMatchResult);
  }

  /**
   * Test {@link FluentIterable#anyMatch(Predicate)}.
   *
   * <ul>
   *   <li>Given {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#anyMatch(Predicate)}
   */
  @Test
  @DisplayName(
      "Test anyMatch(Predicate); given FluentIterable with iterable is ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FluentIterable.anyMatch(Predicate)"})
  void testAnyMatch_givenFluentIterableWithIterableIsArrayList_thenReturnFalse() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertFalse(ofResult.anyMatch(mock(Predicate.class)));
  }

  /**
   * Test {@link FluentIterable#anyMatch(Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#anyMatch(Predicate)}
   */
  @Test
  @DisplayName(
      "Test anyMatch(Predicate); given 'true'; when Predicate test(Object) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FluentIterable.anyMatch(Predicate)"})
  void testAnyMatch_givenTrue_whenPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) iterable);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualAnyMatchResult = ofResult.anyMatch(predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAnyMatchResult);
  }

  /**
   * Test {@link FluentIterable#append(Object[])} with {@code elements}.
   *
   * <p>Method under test: {@link FluentIterable#append(Object[])}
   */
  @Test
  @DisplayName("Test append(Object[]) with 'elements'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FluentIterable FluentIterable.append(Object[])"})
  void testAppendWithElements() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    List<Object> toListResult = emptyResult.append("Elements").toList();
    assertEquals(1, toListResult.size());
    assertEquals("Elements", toListResult.get(0));
  }

  /**
   * Test {@link FluentIterable#append(Iterable)} with {@code other}.
   *
   * <p>Method under test: {@link FluentIterable#append(Iterable)}
   */
  @Test
  @DisplayName("Test append(Iterable) with 'other'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FluentIterable FluentIterable.append(Iterable)"})
  void testAppendWithOther() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.append(new ArrayList<>()).toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#asEnumeration()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then Iterator return {@link EmptyIterator}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#asEnumeration()}
   */
  @Test
  @DisplayName("Test asEnumeration(); given empty; then Iterator return EmptyIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Enumeration FluentIterable.asEnumeration()"})
  void testAsEnumeration_givenEmpty_thenIteratorReturnEmptyIterator() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act
    Enumeration<Object> actualAsEnumerationResult = emptyResult.asEnumeration();

    // Assert
    Iterator<?> iterator = ((IteratorEnumeration<Object>) actualAsEnumerationResult).getIterator();
    assertTrue(iterator instanceof EmptyIterator);
    assertTrue(actualAsEnumerationResult instanceof IteratorEnumeration);
    assertFalse(actualAsEnumerationResult.hasMoreElements());
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link FluentIterable#asEnumeration()}.
   *
   * <ul>
   *   <li>Given {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#asEnumeration()}
   */
  @Test
  @DisplayName("Test asEnumeration(); given FluentIterable with iterable is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Enumeration FluentIterable.asEnumeration()"})
  void testAsEnumeration_givenFluentIterableWithIterableIsArrayList() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act
    Enumeration<Object> actualAsEnumerationResult = ofResult.asEnumeration();

    // Assert
    assertTrue(actualAsEnumerationResult instanceof IteratorEnumeration);
    assertFalse(actualAsEnumerationResult.hasMoreElements());
    assertFalse(((IteratorEnumeration<Object>) actualAsEnumerationResult).getIterator().hasNext());
  }

  /**
   * Test {@link FluentIterable#collate(Iterable)} with {@code other}.
   *
   * <p>Method under test: {@link FluentIterable#collate(Iterable)}
   */
  @Test
  @DisplayName("Test collate(Iterable) with 'other'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FluentIterable FluentIterable.collate(Iterable)"})
  void testCollateWithOther() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.collate(new ArrayList<>()).toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#collate(Iterable, Comparator)} with {@code other}, {@code
   * comparator}.
   *
   * <p>Method under test: {@link FluentIterable#collate(Iterable, Comparator)}
   */
  @Test
  @DisplayName("Test collate(Iterable, Comparator) with 'other', 'comparator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FluentIterable FluentIterable.collate(Iterable, Comparator)"})
  void testCollateWithOtherComparator() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.collate(new ArrayList<>(), mock(Comparator.class)).toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#contains(Object)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>When {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#contains(Object)}
   */
  @Test
  @DisplayName("Test contains(Object); given ArrayList() add '42'; when '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FluentIterable.contains(Object)"})
  void testContains_givenArrayListAdd42_when42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(objectList.iterator());
    FluentIterable<Object> ofResult = FluentIterable.of(iterable);

    // Act
    boolean actualContainsResult = ofResult.contains("42");

    // Assert
    verify(iterable).iterator();
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link FluentIterable#contains(Object)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>When {@code null}.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#contains(Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Object); given ArrayList() add '42'; when 'null'; then calls iterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FluentIterable.contains(Object)"})
  void testContains_givenArrayListAdd42_whenNull_thenCallsIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(objectList.iterator());
    FluentIterable<Object> ofResult = FluentIterable.of(iterable);

    // Act
    boolean actualContainsResult = ofResult.contains(null);

    // Assert
    verify(iterable).iterator();
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link FluentIterable#contains(Object)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>When {@code Object}.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#contains(Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Object); given ArrayList() add '42'; when 'Object'; then calls iterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FluentIterable.contains(Object)"})
  void testContains_givenArrayListAdd42_whenObject_thenCallsIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(objectList.iterator());
    FluentIterable<Object> ofResult = FluentIterable.of(iterable);

    // Act
    boolean actualContainsResult = ofResult.contains("Object");

    // Assert
    verify(iterable).iterator();
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link FluentIterable#contains(Object)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#contains(Object)}
   */
  @Test
  @DisplayName("Test contains(Object); given empty; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FluentIterable.contains(Object)"})
  void testContains_givenEmpty_whenNull_thenReturnFalse() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertFalse(emptyResult.contains(null));
  }

  /**
   * Test {@link FluentIterable#contains(Object)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@code Object}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#contains(Object)}
   */
  @Test
  @DisplayName("Test contains(Object); given empty; when 'Object'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FluentIterable.contains(Object)"})
  void testContains_givenEmpty_whenObject_thenReturnFalse() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertFalse(emptyResult.contains("Object"));
  }

  /**
   * Test {@link FluentIterable#contains(Object)}.
   *
   * <ul>
   *   <li>Given {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()}.
   *   <li>When {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#contains(Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Object); given FluentIterable with iterable is ArrayList(); when '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FluentIterable.contains(Object)"})
  void testContains_givenFluentIterableWithIterableIsArrayList_when42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) iterable);

    // Act and Assert
    assertTrue(ofResult.contains("42"));
  }

  /**
   * Test {@link FluentIterable#contains(Object)}.
   *
   * <ul>
   *   <li>Given {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()}.
   *   <li>When {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#contains(Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Object); given FluentIterable with iterable is ArrayList(); when 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FluentIterable.contains(Object)"})
  void testContains_givenFluentIterableWithIterableIsArrayList_whenObject() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertFalse(ofResult.contains("Object"));
  }

  /**
   * Test {@link FluentIterable#contains(Object)}.
   *
   * <ul>
   *   <li>Given {@link Iterable} {@link Iterable#iterator()} return {@link ArrayList#ArrayList()}
   *       iterator.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#contains(Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Object); given Iterable iterator() return ArrayList() iterator; then calls iterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FluentIterable.contains(Object)"})
  void testContains_givenIterableIteratorReturnArrayListIterator_thenCallsIterator() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);

    ArrayList<Object> objectList = new ArrayList<>();
    when(iterable.iterator()).thenReturn(objectList.iterator());
    FluentIterable<Object> ofResult = FluentIterable.of(iterable);

    // Act
    boolean actualContainsResult = ofResult.contains("Object");

    // Assert
    verify(iterable).iterator();
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link FluentIterable#copyInto(Collection)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#copyInto(Collection)}
   */
  @Test
  @DisplayName("Test copyInto(Collection); given ArrayList() add '42'; then ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FluentIterable.copyInto(Collection)"})
  void testCopyInto_givenArrayListAdd42_thenArrayList() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) iterable);
    ArrayList<Object> collection = new ArrayList<>();

    // Act
    ofResult.copyInto(collection);

    // Assert
    assertEquals(iterable, collection);
  }

  /**
   * Test {@link FluentIterable#copyInto(Collection)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#copyInto(Collection)}
   */
  @Test
  @DisplayName("Test copyInto(Collection); given ArrayList() add '42'; then ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FluentIterable.copyInto(Collection)"})
  void testCopyInto_givenArrayListAdd42_thenArrayList2() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) iterable);
    ArrayList<Object> collection = new ArrayList<>();

    // Act
    ofResult.copyInto(collection);

    // Assert
    assertEquals(iterable, collection);
  }

  /**
   * Test {@link FluentIterable#copyInto(Collection)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#copyInto(Collection)}
   */
  @Test
  @DisplayName("Test copyInto(Collection); given empty; then ArrayList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FluentIterable.copyInto(Collection)"})
  void testCopyInto_givenEmpty_thenArrayListEmpty() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();
    ArrayList<Object> collection = new ArrayList<>();

    // Act
    emptyResult.copyInto(collection);

    // Assert that nothing has changed
    assertTrue(collection.isEmpty());
  }

  /**
   * Test {@link FluentIterable#copyInto(Collection)}.
   *
   * <ul>
   *   <li>Given {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()}.
   *   <li>Then {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#copyInto(Collection)}
   */
  @Test
  @DisplayName(
      "Test copyInto(Collection); given FluentIterable with iterable is ArrayList(); then ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FluentIterable.copyInto(Collection)"})
  void testCopyInto_givenFluentIterableWithIterableIsArrayList_thenArrayList() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) iterable);
    ArrayList<Object> collection = new ArrayList<>();

    // Act
    ofResult.copyInto(collection);

    // Assert that nothing has changed
    assertEquals(iterable, collection);
  }

  /**
   * Test {@link FluentIterable#eval()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return toList size is one.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#eval()}
   */
  @Test
  @DisplayName("Test eval(); given ArrayList() add '42'; then return toList size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FluentIterable FluentIterable.eval()"})
  void testEval_givenArrayListAdd42_thenReturnToListSizeIsOne() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) iterable);

    // Act and Assert
    List<Object> toListResult = ofResult.eval().toList();
    assertEquals(1, toListResult.size());
    assertEquals("42", toListResult.get(0));
  }

  /**
   * Test {@link FluentIterable#eval()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return toList Empty.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#eval()}
   */
  @Test
  @DisplayName("Test eval(); given empty; then return toList Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FluentIterable FluentIterable.eval()"})
  void testEval_givenEmpty_thenReturnToListEmpty() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.eval().toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#eval()}.
   *
   * <ul>
   *   <li>Given {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()}.
   *   <li>Then return toList Empty.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#eval()}
   */
  @Test
  @DisplayName(
      "Test eval(); given FluentIterable with iterable is ArrayList(); then return toList Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FluentIterable FluentIterable.eval()"})
  void testEval_givenFluentIterableWithIterableIsArrayList_thenReturnToListEmpty() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.eval().toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#filter(Predicate)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link Predicate}.
   *   <li>Then return toList Empty.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#filter(Predicate)}
   */
  @Test
  @DisplayName("Test filter(Predicate); given empty; when Predicate; then return toList Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FluentIterable FluentIterable.filter(Predicate)"})
  void testFilter_givenEmpty_whenPredicate_thenReturnToListEmpty() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.filter(mock(Predicate.class)).toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#forEach(Closure)} with {@code Closure}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then calls {@link Closure#accept(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#forEach(Closure)}
   */
  @Test
  @DisplayName(
      "Test forEach(Closure) with 'Closure'; given ArrayList() add '42'; then calls accept(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FluentIterable.forEach(Closure)"})
  void testForEachWithClosure_givenArrayListAdd42_thenCallsAccept() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) iterable);

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    // Act
    ofResult.forEach(closure);

    // Assert
    verify(closure).accept(isA(Object.class));
  }

  /**
   * Test {@link FluentIterable#get(int)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>When one.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#get(int)}
   */
  @Test
  @DisplayName("Test get(int); given ArrayList() add '42'; when one; then calls iterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FluentIterable.get(int)"})
  void testGet_givenArrayListAdd42_whenOne_thenCallsIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(objectList.iterator());
    FluentIterable<Object> ofResult = FluentIterable.of(iterable);

    // Act
    Object actualGetResult = ofResult.get(1);

    // Assert
    verify(iterable).iterator();
    assertEquals("42", actualGetResult);
  }

  /**
   * Test {@link FluentIterable#get(int)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>When zero.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#get(int)}
   */
  @Test
  @DisplayName("Test get(int); given ArrayList() add '42'; when zero; then calls iterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FluentIterable.get(int)"})
  void testGet_givenArrayListAdd42_whenZero_thenCallsIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(objectList.iterator());
    FluentIterable<Object> ofResult = FluentIterable.of(iterable);

    // Act
    Object actualGetResult = ofResult.get(0);

    // Assert
    verify(iterable).iterator();
    assertEquals("42", actualGetResult);
  }

  /**
   * Test {@link FluentIterable#get(int)}.
   *
   * <ul>
   *   <li>Given {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()}.
   *   <li>When zero.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#get(int)}
   */
  @Test
  @DisplayName(
      "Test get(int); given FluentIterable with iterable is ArrayList(); when zero; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FluentIterable.get(int)"})
  void testGet_givenFluentIterableWithIterableIsArrayList_whenZero_thenReturn42() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) iterable);

    // Act and Assert
    assertEquals("42", ofResult.get(0));
  }

  /**
   * Test {@link FluentIterable#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FluentIterable.isEmpty()"})
  void testIsEmpty_givenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) iterable);

    // Act and Assert
    assertFalse(ofResult.isEmpty());
  }

  /**
   * Test {@link FluentIterable#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FluentIterable.isEmpty()"})
  void testIsEmpty_givenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(objectList.iterator());
    FluentIterable<Object> ofResult = FluentIterable.of(iterable);

    // Act
    boolean actualIsEmptyResult = ofResult.isEmpty();

    // Assert
    verify(iterable).iterator();
    assertFalse(actualIsEmptyResult);
  }

  /**
   * Test {@link FluentIterable#isEmpty()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given empty; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FluentIterable.isEmpty()"})
  void testIsEmpty_givenEmpty_thenReturnTrue() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.isEmpty());
  }

  /**
   * Test {@link FluentIterable#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#isEmpty()}
   */
  @Test
  @DisplayName(
      "Test isEmpty(); given FluentIterable with iterable is ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FluentIterable.isEmpty()"})
  void testIsEmpty_givenFluentIterableWithIterableIsArrayList_thenReturnTrue() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.isEmpty());
  }

  /**
   * Test {@link FluentIterable#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link Iterable} {@link Iterable#iterator()} return {@link ArrayList#ArrayList()}
   *       iterator.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#isEmpty()}
   */
  @Test
  @DisplayName(
      "Test isEmpty(); given Iterable iterator() return ArrayList() iterator; then calls iterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FluentIterable.isEmpty()"})
  void testIsEmpty_givenIterableIteratorReturnArrayListIterator_thenCallsIterator() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);

    ArrayList<Object> objectList = new ArrayList<>();
    when(iterable.iterator()).thenReturn(objectList.iterator());
    FluentIterable<Object> ofResult = FluentIterable.of(iterable);

    // Act
    boolean actualIsEmptyResult = ofResult.isEmpty();

    // Assert
    verify(iterable).iterator();
    assertTrue(actualIsEmptyResult);
  }

  /**
   * Test {@link FluentIterable#iterator()}.
   *
   * <ul>
   *   <li>Given {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#iterator()}
   */
  @Test
  @DisplayName(
      "Test iterator(); given FluentIterable with iterable is ArrayList(); then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator FluentIterable.iterator()"})
  void testIterator_givenFluentIterableWithIterableIsArrayList_thenReturnNotHasNext() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertFalse(ofResult.iterator().hasNext());
  }

  /**
   * Test {@link FluentIterable#limit(long)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return toList Empty.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#limit(long)}
   */
  @Test
  @DisplayName("Test limit(long); when three; then return toList Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FluentIterable FluentIterable.limit(long)"})
  void testLimit_whenThree_thenReturnToListEmpty() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.limit(3L).toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#loop()}.
   *
   * <p>Method under test: {@link FluentIterable#loop()}
   */
  @Test
  @DisplayName("Test loop()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FluentIterable FluentIterable.loop()"})
  void testLoop() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.loop().toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#reverse()}.
   *
   * <p>Method under test: {@link FluentIterable#reverse()}
   */
  @Test
  @DisplayName("Test reverse()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FluentIterable FluentIterable.reverse()"})
  void testReverse() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.reverse().toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#size()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#size()}
   */
  @Test
  @DisplayName("Test size(); given ArrayList() add '42'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int FluentIterable.size()"})
  void testSize_givenArrayListAdd42_thenReturnOne() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(objectList.iterator());
    FluentIterable<Object> ofResult = FluentIterable.of(iterable);

    // Act
    int actualSizeResult = ofResult.size();

    // Assert
    verify(iterable).iterator();
    assertEquals(1, actualSizeResult);
  }

  /**
   * Test {@link FluentIterable#size()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#size()}
   */
  @Test
  @DisplayName("Test size(); given empty; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int FluentIterable.size()"})
  void testSize_givenEmpty_thenReturnZero() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertEquals(0, emptyResult.size());
  }

  /**
   * Test {@link FluentIterable#size()}.
   *
   * <ul>
   *   <li>Given {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#size()}
   */
  @Test
  @DisplayName("Test size(); given FluentIterable with iterable is ArrayList(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int FluentIterable.size()"})
  void testSize_givenFluentIterableWithIterableIsArrayList_thenReturnZero() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertEquals(0, ofResult.size());
  }

  /**
   * Test {@link FluentIterable#size()}.
   *
   * <ul>
   *   <li>Given {@link Iterable} {@link Iterable#iterator()} return {@link ArrayList#ArrayList()}
   *       iterator.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#size()}
   */
  @Test
  @DisplayName(
      "Test size(); given Iterable iterator() return ArrayList() iterator; then calls iterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int FluentIterable.size()"})
  void testSize_givenIterableIteratorReturnArrayListIterator_thenCallsIterator() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);

    ArrayList<Object> objectList = new ArrayList<>();
    when(iterable.iterator()).thenReturn(objectList.iterator());
    FluentIterable<Object> ofResult = FluentIterable.of(iterable);

    // Act
    int actualSizeResult = ofResult.size();

    // Assert
    verify(iterable).iterator();
    assertEquals(0, actualSizeResult);
  }

  /**
   * Test {@link FluentIterable#skip(long)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return toList Empty.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#skip(long)}
   */
  @Test
  @DisplayName("Test skip(long); when one; then return toList Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FluentIterable FluentIterable.skip(long)"})
  void testSkip_whenOne_thenReturnToListEmpty() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.skip(1L).toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#toArray(Class)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>When {@code Object}.
   *   <li>Then return first element is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#toArray(Class)}
   */
  @Test
  @DisplayName(
      "Test toArray(Class); given ArrayList() add '42'; when 'java.lang.Object'; then return first element is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] FluentIterable.toArray(Class)"})
  void testToArray_givenArrayListAdd42_whenJavaLangObject_thenReturnFirstElementIs42() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) iterable);
    Class<Object> arrayClass = Object.class;

    // Act
    Object[] actualToArrayResult = ofResult.toArray(arrayClass);

    // Assert
    assertEquals("42", actualToArrayResult[0]);
    assertEquals(1, actualToArrayResult.length);
  }

  /**
   * Test {@link FluentIterable#toArray(Class)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@code Object}.
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#toArray(Class)}
   */
  @Test
  @DisplayName(
      "Test toArray(Class); given empty; when 'java.lang.Object'; then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] FluentIterable.toArray(Class)"})
  void testToArray_givenEmpty_whenJavaLangObject_thenReturnArrayLengthIsZero() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();
    Class<Object> arrayClass = Object.class;

    // Act and Assert
    assertEquals(0, emptyResult.toArray(arrayClass).length);
  }

  /**
   * Test {@link FluentIterable#toArray(Class)}.
   *
   * <ul>
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#toArray(Class)}
   */
  @Test
  @DisplayName("Test toArray(Class); then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] FluentIterable.toArray(Class)"})
  void testToArray_thenReturnArrayLengthIsZero() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());
    Class<Object> arrayClass = Object.class;

    // Act and Assert
    assertEquals(0, ofResult.toArray(arrayClass).length);
  }

  /**
   * Test {@link FluentIterable#toList()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#toList()}
   */
  @Test
  @DisplayName("Test toList(); given ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List FluentIterable.toList()"})
  void testToList_givenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) iterable);

    // Act
    List<Object> actualToListResult = ofResult.toList();

    // Assert
    assertEquals(1, actualToListResult.size());
    assertEquals("42", actualToListResult.get(0));
  }

  /**
   * Test {@link FluentIterable#toList()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#toList()}
   */
  @Test
  @DisplayName("Test toList(); given empty; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List FluentIterable.toList()"})
  void testToList_givenEmpty_thenReturnEmpty() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#toList()}.
   *
   * <ul>
   *   <li>Given {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#toList()}
   */
  @Test
  @DisplayName(
      "Test toList(); given FluentIterable with iterable is ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List FluentIterable.toList()"})
  void testToList_givenFluentIterableWithIterableIsArrayList_thenReturnEmpty() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#toString()}.
   *
   * <p>Method under test: {@link FluentIterable#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String FluentIterable.toString()"})
  void testToString() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertEquals("[]", emptyResult.toString());
  }

  /**
   * Test {@link FluentIterable#transform(Transformer)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link Transformer}.
   *   <li>Then return toList Empty.
   * </ul>
   *
   * <p>Method under test: {@link FluentIterable#transform(Transformer)}
   */
  @Test
  @DisplayName(
      "Test transform(Transformer); given empty; when Transformer; then return toList Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FluentIterable FluentIterable.transform(Transformer)"})
  void testTransform_givenEmpty_whenTransformer_thenReturnToListEmpty() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.transform(mock(Transformer.class)).toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#unique()}.
   *
   * <p>Method under test: {@link FluentIterable#unique()}
   */
  @Test
  @DisplayName("Test unique()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FluentIterable FluentIterable.unique()"})
  void testUnique() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.unique().toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#unmodifiable()}.
   *
   * <p>Method under test: {@link FluentIterable#unmodifiable()}
   */
  @Test
  @DisplayName("Test unmodifiable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FluentIterable FluentIterable.unmodifiable()"})
  void testUnmodifiable() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.unmodifiable().toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#zip(Iterable)} with {@code other}.
   *
   * <p>Method under test: {@link FluentIterable#zip(Iterable)}
   */
  @Test
  @DisplayName("Test zip(Iterable) with 'other'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FluentIterable FluentIterable.zip(Iterable)"})
  void testZipWithOther() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.zip(new ArrayList<>()).toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#zip(Iterable[])} with {@code others}.
   *
   * <p>Method under test: {@link FluentIterable#zip(Iterable[])}
   */
  @Test
  @DisplayName("Test zip(Iterable[]) with 'others'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FluentIterable FluentIterable.zip(Iterable[])"})
  void testZipWithOthers() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.zip(new ArrayList<>()).toList().isEmpty());
  }
}
