package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.collections4.iterators.EmptyIterator;
import org.apache.commons.collections4.iterators.IteratorEnumeration;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class FluentIterableDiffblueTest {
  /**
   * Test {@link FluentIterable#empty()}.
   * <p>
   * Method under test: {@link FluentIterable#empty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"FluentIterable FluentIterable.empty()"})
  public void testEmpty() {
    // Arrange and Act
    FluentIterable<Object> actualEmptyResult = FluentIterable.empty();

    // Assert
    assertTrue(actualEmptyResult.toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#of(Object[])} with {@code elements}.
   * <p>
   * Method under test: {@link FluentIterable#of(Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"FluentIterable FluentIterable.of(Object[])"})
  public void testOfWithElements() {
    // Arrange and Act
    FluentIterable<Object> actualOfResult = FluentIterable.of("Elements");

    // Assert
    List<Object> toListResult = actualOfResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals("Elements", toListResult.get(0));
  }

  /**
   * Test {@link FluentIterable#of(Iterable)} with {@code iterable}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#of(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"FluentIterable FluentIterable.of(Iterable)"})
  public void testOfWithIterable_whenArrayList() {
    // Arrange and Act
    FluentIterable<Object> actualOfResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Assert
    assertTrue(actualOfResult.toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#of(Iterable)} with {@code iterable}.
   * <ul>
   *   <li>When empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#of(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"FluentIterable FluentIterable.of(Iterable)"})
  public void testOfWithIterable_whenEmpty() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.empty();

    // Act
    FluentIterable<Object> actualOfResult = FluentIterable.of((Iterable<Object>) iterable);

    // Assert
    assertTrue(actualOfResult.toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#of(Object)} with {@code singleton}.
   * <p>
   * Method under test: {@link FluentIterable#of(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"FluentIterable FluentIterable.of(Object)"})
  public void testOfWithSingleton() {
    // Arrange and Act
    FluentIterable<Object> actualOfResult = FluentIterable.of("Singleton");

    // Assert
    List<Object> toListResult = actualOfResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals("Singleton", toListResult.get(0));
  }

  /**
   * Test {@link FluentIterable#allMatch(Predicate)}.
   * <ul>
   *   <li>Given empty.</li>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#allMatch(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FluentIterable.allMatch(Predicate)"})
  public void testAllMatch_givenEmpty_whenPredicate_thenReturnTrue() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.allMatch(mock(Predicate.class)));
  }

  /**
   * Test {@link FluentIterable#allMatch(Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#allMatch(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FluentIterable.allMatch(Predicate)"})
  public void testAllMatch_givenFalse_whenPredicateTestReturnFalse_thenReturnFalse() {
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
   * <ul>
   *   <li>Given {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#allMatch(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FluentIterable.allMatch(Predicate)"})
  public void testAllMatch_givenFluentIterableWithIterableIsArrayList_thenReturnTrue() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.allMatch(mock(Predicate.class)));
  }

  /**
   * Test {@link FluentIterable#allMatch(Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#allMatch(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FluentIterable.allMatch(Predicate)"})
  public void testAllMatch_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
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
   * <ul>
   *   <li>Given empty.</li>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#anyMatch(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FluentIterable.anyMatch(Predicate)"})
  public void testAnyMatch_givenEmpty_whenPredicate_thenReturnFalse() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertFalse(emptyResult.anyMatch(mock(Predicate.class)));
  }

  /**
   * Test {@link FluentIterable#anyMatch(Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#anyMatch(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FluentIterable.anyMatch(Predicate)"})
  public void testAnyMatch_givenFalse_whenPredicateTestReturnFalse_thenCallsTest() {
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
   * <ul>
   *   <li>Given {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#anyMatch(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FluentIterable.anyMatch(Predicate)"})
  public void testAnyMatch_givenFluentIterableWithIterableIsArrayList_thenReturnFalse() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertFalse(ofResult.anyMatch(mock(Predicate.class)));
  }

  /**
   * Test {@link FluentIterable#anyMatch(Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#anyMatch(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FluentIterable.anyMatch(Predicate)"})
  public void testAnyMatch_givenTrue_whenPredicateTestReturnTrue_thenReturnTrue() {
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
   * <p>
   * Method under test: {@link FluentIterable#append(Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"FluentIterable FluentIterable.append(Object[])"})
  public void testAppendWithElements() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    List<Object> toListResult = emptyResult.append("Elements").toList();
    assertEquals(1, toListResult.size());
    assertEquals("Elements", toListResult.get(0));
  }

  /**
   * Test {@link FluentIterable#append(Iterable)} with {@code other}.
   * <p>
   * Method under test: {@link FluentIterable#append(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"FluentIterable FluentIterable.append(Iterable)"})
  public void testAppendWithOther() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.append(new ArrayList<>()).toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#asEnumeration()}.
   * <ul>
   *   <li>Given empty.</li>
   *   <li>Then Iterator return {@link EmptyIterator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#asEnumeration()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Enumeration FluentIterable.asEnumeration()"})
  public void testAsEnumeration_givenEmpty_thenIteratorReturnEmptyIterator() {
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
   * <ul>
   *   <li>Given {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#asEnumeration()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Enumeration FluentIterable.asEnumeration()"})
  public void testAsEnumeration_givenFluentIterableWithIterableIsArrayList() {
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
   * <p>
   * Method under test: {@link FluentIterable#collate(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"FluentIterable FluentIterable.collate(Iterable)"})
  public void testCollateWithOther() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.collate(new ArrayList<>()).toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#contains(Object)}.
   * <ul>
   *   <li>Given empty.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FluentIterable.contains(Object)"})
  public void testContains_givenEmpty_whenNull_thenReturnFalse() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertFalse(emptyResult.contains(null));
  }

  /**
   * Test {@link FluentIterable#contains(Object)}.
   * <ul>
   *   <li>Given empty.</li>
   *   <li>When {@code Object}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FluentIterable.contains(Object)"})
  public void testContains_givenEmpty_whenObject_thenReturnFalse() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertFalse(emptyResult.contains("Object"));
  }

  /**
   * Test {@link FluentIterable#contains(Object)}.
   * <ul>
   *   <li>Given {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FluentIterable.contains(Object)"})
  public void testContains_givenFluentIterableWithIterableIsArrayList_thenReturnFalse() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertFalse(ofResult.contains("Object"));
  }

  /**
   * Test {@link FluentIterable#eval()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return toList size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#eval()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"FluentIterable FluentIterable.eval()"})
  public void testEval_givenArrayListAdd42_thenReturnToListSizeIsOne() {
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
   * <ul>
   *   <li>Given empty.</li>
   *   <li>Then return toList Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#eval()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"FluentIterable FluentIterable.eval()"})
  public void testEval_givenEmpty_thenReturnToListEmpty() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.eval().toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#eval()}.
   * <ul>
   *   <li>Given {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return toList Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#eval()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"FluentIterable FluentIterable.eval()"})
  public void testEval_givenFluentIterableWithIterableIsArrayList_thenReturnToListEmpty() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.eval().toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#filter(Predicate)}.
   * <ul>
   *   <li>Given empty.</li>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return toList Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#filter(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"FluentIterable FluentIterable.filter(Predicate)"})
  public void testFilter_givenEmpty_whenPredicate_thenReturnToListEmpty() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.filter(mock(Predicate.class)).toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#forEach(Closure)} with {@code Closure}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then calls {@link Closure#accept(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#forEach(Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void FluentIterable.forEach(Closure)"})
  public void testForEachWithClosure_givenArrayListAdd42_thenCallsAccept() {
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
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>When one.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#get(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FluentIterable.get(int)"})
  public void testGet_givenArrayListAdd42_whenOne_thenReturn42() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) iterable);

    // Act and Assert
    assertEquals("42", ofResult.get(1));
  }

  /**
   * Test {@link FluentIterable#isEmpty()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FluentIterable.isEmpty()"})
  public void testIsEmpty_givenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) iterable);

    // Act and Assert
    assertFalse(ofResult.isEmpty());
  }

  /**
   * Test {@link FluentIterable#isEmpty()}.
   * <ul>
   *   <li>Given empty.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FluentIterable.isEmpty()"})
  public void testIsEmpty_givenEmpty_thenReturnTrue() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.isEmpty());
  }

  /**
   * Test {@link FluentIterable#isEmpty()}.
   * <ul>
   *   <li>Given {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FluentIterable.isEmpty()"})
  public void testIsEmpty_givenFluentIterableWithIterableIsArrayList_thenReturnTrue() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.isEmpty());
  }

  /**
   * Test {@link FluentIterable#iterator()}.
   * <ul>
   *   <li>Given {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#iterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator FluentIterable.iterator()"})
  public void testIterator_givenFluentIterableWithIterableIsArrayList_thenReturnNotHasNext() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertFalse(ofResult.iterator().hasNext());
  }

  /**
   * Test {@link FluentIterable#limit(long)}.
   * <ul>
   *   <li>When three.</li>
   *   <li>Then return toList Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#limit(long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"FluentIterable FluentIterable.limit(long)"})
  public void testLimit_whenThree_thenReturnToListEmpty() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.limit(3L).toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#loop()}.
   * <p>
   * Method under test: {@link FluentIterable#loop()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"FluentIterable FluentIterable.loop()"})
  public void testLoop() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.loop().toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#reverse()}.
   * <p>
   * Method under test: {@link FluentIterable#reverse()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"FluentIterable FluentIterable.reverse()"})
  public void testReverse() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.reverse().toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#size()}.
   * <ul>
   *   <li>Given empty.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#size()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int FluentIterable.size()"})
  public void testSize_givenEmpty_thenReturnZero() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertEquals(0, emptyResult.size());
  }

  /**
   * Test {@link FluentIterable#size()}.
   * <ul>
   *   <li>Given {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#size()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int FluentIterable.size()"})
  public void testSize_givenFluentIterableWithIterableIsArrayList_thenReturnZero() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertEquals(0, ofResult.size());
  }

  /**
   * Test {@link FluentIterable#skip(long)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then return toList Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#skip(long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"FluentIterable FluentIterable.skip(long)"})
  public void testSkip_whenOne_thenReturnToListEmpty() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.skip(1L).toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#toArray(Class)}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>When {@code Object}.</li>
   *   <li>Then return first element is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#toArray(Class)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object[] FluentIterable.toArray(Class)"})
  public void testToArray_givenArrayListAdd42_whenJavaLangObject_thenReturnFirstElementIs42() {
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
   * <ul>
   *   <li>Given empty.</li>
   *   <li>When {@code Object}.</li>
   *   <li>Then return array length is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#toArray(Class)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object[] FluentIterable.toArray(Class)"})
  public void testToArray_givenEmpty_whenJavaLangObject_thenReturnArrayLengthIsZero() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();
    Class<Object> arrayClass = Object.class;

    // Act and Assert
    assertEquals(0, emptyResult.toArray(arrayClass).length);
  }

  /**
   * Test {@link FluentIterable#toArray(Class)}.
   * <ul>
   *   <li>Then return array length is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#toArray(Class)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object[] FluentIterable.toArray(Class)"})
  public void testToArray_thenReturnArrayLengthIsZero() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());
    Class<Object> arrayClass = Object.class;

    // Act and Assert
    assertEquals(0, ofResult.toArray(arrayClass).length);
  }

  /**
   * Test {@link FluentIterable#toList()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#toList()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List FluentIterable.toList()"})
  public void testToList_givenArrayListAdd42_thenReturnSizeIsOne() {
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
   * <ul>
   *   <li>Given empty.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#toList()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List FluentIterable.toList()"})
  public void testToList_givenEmpty_thenReturnEmpty() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#toList()}.
   * <ul>
   *   <li>Given {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#toList()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List FluentIterable.toList()"})
  public void testToList_givenFluentIterableWithIterableIsArrayList_thenReturnEmpty() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#toString()}.
   * <p>
   * Method under test: {@link FluentIterable#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String FluentIterable.toString()"})
  public void testToString() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertEquals("[]", emptyResult.toString());
  }

  /**
   * Test {@link FluentIterable#transform(Transformer)}.
   * <ul>
   *   <li>Given empty.</li>
   *   <li>When {@link Transformer}.</li>
   *   <li>Then return toList Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link FluentIterable#transform(Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"FluentIterable FluentIterable.transform(Transformer)"})
  public void testTransform_givenEmpty_whenTransformer_thenReturnToListEmpty() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.<Object>transform(mock(Transformer.class)).toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#unique()}.
   * <p>
   * Method under test: {@link FluentIterable#unique()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"FluentIterable FluentIterable.unique()"})
  public void testUnique() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.unique().toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#unmodifiable()}.
   * <p>
   * Method under test: {@link FluentIterable#unmodifiable()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"FluentIterable FluentIterable.unmodifiable()"})
  public void testUnmodifiable() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.unmodifiable().toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#zip(Iterable)} with {@code other}.
   * <p>
   * Method under test: {@link FluentIterable#zip(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"FluentIterable FluentIterable.zip(Iterable)"})
  public void testZipWithOther() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.zip(new ArrayList<>()).toList().isEmpty());
  }

  /**
   * Test {@link FluentIterable#zip(Iterable[])} with {@code others}.
   * <p>
   * Method under test: {@link FluentIterable#zip(Iterable[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"FluentIterable FluentIterable.zip(Iterable[])"})
  public void testZipWithOthers() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.zip(new ArrayList<>()).toList().isEmpty());
  }
}
