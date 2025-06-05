package org.apache.commons.collections4.multiset;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PredicatedMultiSetDiffblueTest {
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
  @DisplayName("Test predicatedMultiSet(MultiSet, Predicate); given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PredicatedMultiSet PredicatedMultiSet.predicatedMultiSet(MultiSet, Predicate)"})
  void testPredicatedMultiSet_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
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
  @DisplayName("Test predicatedMultiSet(MultiSet, Predicate); given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PredicatedMultiSet PredicatedMultiSet.predicatedMultiSet(MultiSet, Predicate)"})
  void testPredicatedMultiSet_givenTrue_whenPredicateTestReturnTrue_thenCallsTest2() {
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
  @DisplayName("Test predicatedMultiSet(MultiSet, Predicate); when HashMultiSet(); then return HashMultiSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PredicatedMultiSet PredicatedMultiSet.predicatedMultiSet(MultiSet, Predicate)"})
  void testPredicatedMultiSet_whenHashMultiSet_thenReturnHashMultiSet() {
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
  @DisplayName("Test new PredicatedMultiSet(MultiSet, Predicate); given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedMultiSet.<init>(MultiSet, Predicate)"})
  void testNewPredicatedMultiSet_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
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
  @DisplayName("Test new PredicatedMultiSet(MultiSet, Predicate); given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedMultiSet.<init>(MultiSet, Predicate)"})
  void testNewPredicatedMultiSet_givenTrue_whenPredicateTestReturnTrue_thenCallsTest2() {
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
  @DisplayName("Test new PredicatedMultiSet(MultiSet, Predicate); when HashMultiSet(); then return HashMultiSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedMultiSet.<init>(MultiSet, Predicate)"})
  void testNewPredicatedMultiSet_whenHashMultiSet_thenReturnHashMultiSet() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();

    // Act and Assert
    assertEquals(multiset, new PredicatedMultiSet<>(multiset, mock(Predicate.class)));
  }
}
