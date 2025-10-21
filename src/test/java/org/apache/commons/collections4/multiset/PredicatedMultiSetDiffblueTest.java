package org.apache.commons.collections4.multiset;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class PredicatedMultiSetDiffblueTest {
  /**
   * Test {@link PredicatedMultiSet#predicatedMultiSet(MultiSet, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedMultiSet#predicatedMultiSet(MultiSet, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedMultiSet PredicatedMultiSet.predicatedMultiSet(MultiSet, Predicate)"})
  public void testPredicatedMultiSet_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedMultiSet<Object> actualPredicatedMultiSetResult = PredicatedMultiSet.predicatedMultiSet(multiset,
        predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(multiset, actualPredicatedMultiSetResult);
  }

  /**
   * Test {@link PredicatedMultiSet#predicatedMultiSet(MultiSet, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedMultiSet#predicatedMultiSet(MultiSet, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedMultiSet PredicatedMultiSet.predicatedMultiSet(MultiSet, Predicate)"})
  public void testPredicatedMultiSet_givenTrue_whenPredicateTestReturnTrue_thenCallsTest2() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");
    multiset.add("Object");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedMultiSet<Object> actualPredicatedMultiSetResult = PredicatedMultiSet.predicatedMultiSet(multiset,
        predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(multiset, actualPredicatedMultiSetResult);
  }

  /**
   * Test {@link PredicatedMultiSet#predicatedMultiSet(MultiSet, Predicate)}.
   * <ul>
   *   <li>When {@link HashMultiSet#HashMultiSet()}.</li>
   *   <li>Then return {@link HashMultiSet#HashMultiSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedMultiSet#predicatedMultiSet(MultiSet, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedMultiSet PredicatedMultiSet.predicatedMultiSet(MultiSet, Predicate)"})
  public void testPredicatedMultiSet_whenHashMultiSet_thenReturnHashMultiSet() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();

    // Act
    PredicatedMultiSet<Object> actualPredicatedMultiSetResult = PredicatedMultiSet.predicatedMultiSet(multiset,
        mock(Predicate.class));

    // Assert
    assertEquals(multiset, actualPredicatedMultiSetResult);
  }

  /**
   * Test {@link PredicatedMultiSet#PredicatedMultiSet(MultiSet, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedMultiSet#PredicatedMultiSet(MultiSet, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedMultiSet.<init>(MultiSet, Predicate)"})
  public void testNewPredicatedMultiSet_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedMultiSet<Object> actualPredicatedMultiSet = new PredicatedMultiSet<>(multiset, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(multiset, actualPredicatedMultiSet);
  }

  /**
   * Test {@link PredicatedMultiSet#PredicatedMultiSet(MultiSet, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedMultiSet#PredicatedMultiSet(MultiSet, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedMultiSet.<init>(MultiSet, Predicate)"})
  public void testNewPredicatedMultiSet_givenTrue_whenPredicateTestReturnTrue_thenCallsTest2() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");
    multiset.add("Object");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedMultiSet<Object> actualPredicatedMultiSet = new PredicatedMultiSet<>(multiset, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(multiset, actualPredicatedMultiSet);
  }

  /**
   * Test {@link PredicatedMultiSet#PredicatedMultiSet(MultiSet, Predicate)}.
   * <ul>
   *   <li>When {@link HashMultiSet#HashMultiSet()}.</li>
   *   <li>Then return {@link HashMultiSet#HashMultiSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedMultiSet#PredicatedMultiSet(MultiSet, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedMultiSet.<init>(MultiSet, Predicate)"})
  public void testNewPredicatedMultiSet_whenHashMultiSet_thenReturnHashMultiSet() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();

    // Act and Assert
    assertEquals(multiset, new PredicatedMultiSet<>(multiset, mock(Predicate.class)));
  }
}
