package org.apache.commons.collections4.set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.SortedSet;
import java.util.TreeSet;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PredicatedSortedSetDiffblueTest {
  /**
   * Test {@link PredicatedSortedSet#predicatedSortedSet(SortedSet, Predicate)}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link TreeSet#TreeSet()} add {@code foo}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSortedSet#predicatedSortedSet(SortedSet, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedSortedSet(SortedSet, Predicate); given 'foo'; when TreeSet() add 'foo'; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PredicatedSortedSet PredicatedSortedSet.predicatedSortedSet(SortedSet, Predicate)"})
  void testPredicatedSortedSet_givenFoo_whenTreeSetAddFoo_thenCallsTest() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");
    set.add("foo");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSortedSet<Object> actualPredicatedSortedSetResult = PredicatedSortedSet.predicatedSortedSet(set,
        predicate);

    // Assert
    verify(predicate, atLeast(1)).test(Mockito.<Object>any());
    assertEquals(set, actualPredicatedSortedSetResult);
  }

  /**
   * Test {@link PredicatedSortedSet#predicatedSortedSet(SortedSet, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSortedSet#predicatedSortedSet(SortedSet, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedSortedSet(SortedSet, Predicate); given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PredicatedSortedSet PredicatedSortedSet.predicatedSortedSet(SortedSet, Predicate)"})
  void testPredicatedSortedSet_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSortedSet<Object> actualPredicatedSortedSetResult = PredicatedSortedSet.predicatedSortedSet(set,
        predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(set, actualPredicatedSortedSetResult);
  }

  /**
   * Test {@link PredicatedSortedSet#predicatedSortedSet(SortedSet, Predicate)}.
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.</li>
   *   <li>Then return {@link TreeSet#TreeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSortedSet#predicatedSortedSet(SortedSet, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedSortedSet(SortedSet, Predicate); when TreeSet(); then return TreeSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PredicatedSortedSet PredicatedSortedSet.predicatedSortedSet(SortedSet, Predicate)"})
  void testPredicatedSortedSet_whenTreeSet_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    PredicatedSortedSet<Object> actualPredicatedSortedSetResult = PredicatedSortedSet.predicatedSortedSet(set,
        mock(Predicate.class));

    // Assert
    assertEquals(set, actualPredicatedSortedSetResult);
  }

  /**
   * Test {@link PredicatedSortedSet#PredicatedSortedSet(SortedSet, Predicate)}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link TreeSet#TreeSet()} add {@code foo}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSortedSet#PredicatedSortedSet(SortedSet, Predicate)}
   */
  @Test
  @DisplayName("Test new PredicatedSortedSet(SortedSet, Predicate); given 'foo'; when TreeSet() add 'foo'; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedSortedSet.<init>(SortedSet, Predicate)"})
  void testNewPredicatedSortedSet_givenFoo_whenTreeSetAddFoo_thenCallsTest() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");
    set.add("foo");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSortedSet<Object> actualObjectSet = new PredicatedSortedSet<>(set, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(Mockito.<Object>any());
    assertEquals(set, actualObjectSet);
  }

  /**
   * Test {@link PredicatedSortedSet#PredicatedSortedSet(SortedSet, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSortedSet#PredicatedSortedSet(SortedSet, Predicate)}
   */
  @Test
  @DisplayName("Test new PredicatedSortedSet(SortedSet, Predicate); given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedSortedSet.<init>(SortedSet, Predicate)"})
  void testNewPredicatedSortedSet_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSortedSet<Object> actualObjectSet = new PredicatedSortedSet<>(set, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(set, actualObjectSet);
  }

  /**
   * Test {@link PredicatedSortedSet#PredicatedSortedSet(SortedSet, Predicate)}.
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.</li>
   *   <li>Then return {@link TreeSet#TreeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSortedSet#PredicatedSortedSet(SortedSet, Predicate)}
   */
  @Test
  @DisplayName("Test new PredicatedSortedSet(SortedSet, Predicate); when TreeSet(); then return TreeSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedSortedSet.<init>(SortedSet, Predicate)"})
  void testNewPredicatedSortedSet_whenTreeSet_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act and Assert
    assertEquals(set, new PredicatedSortedSet<>(set, mock(Predicate.class)));
  }
}
