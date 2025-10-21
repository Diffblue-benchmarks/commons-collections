package org.apache.commons.collections4.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.NavigableSet;
import java.util.TreeSet;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class PredicatedNavigableSetDiffblueTest {
  /**
   * Test {@link PredicatedNavigableSet#predicatedNavigableSet(NavigableSet, Predicate)}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link TreeSet#TreeSet()} add {@code foo}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedNavigableSet#predicatedNavigableSet(NavigableSet, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedNavigableSet PredicatedNavigableSet.predicatedNavigableSet(NavigableSet, Predicate)"})
  public void testPredicatedNavigableSet_givenFoo_whenTreeSetAddFoo_thenCallsTest() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");
    set.add("foo");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedNavigableSet<Object> actualPredicatedNavigableSetResult = PredicatedNavigableSet
        .predicatedNavigableSet(set, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(Mockito.<Object>any());
    assertEquals(set, actualPredicatedNavigableSetResult);
  }

  /**
   * Test {@link PredicatedNavigableSet#predicatedNavigableSet(NavigableSet, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedNavigableSet#predicatedNavigableSet(NavigableSet, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedNavigableSet PredicatedNavigableSet.predicatedNavigableSet(NavigableSet, Predicate)"})
  public void testPredicatedNavigableSet_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedNavigableSet<Object> actualPredicatedNavigableSetResult = PredicatedNavigableSet
        .predicatedNavigableSet(set, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(set, actualPredicatedNavigableSetResult);
  }

  /**
   * Test {@link PredicatedNavigableSet#predicatedNavigableSet(NavigableSet, Predicate)}.
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.</li>
   *   <li>Then return {@link TreeSet#TreeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedNavigableSet#predicatedNavigableSet(NavigableSet, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedNavigableSet PredicatedNavigableSet.predicatedNavigableSet(NavigableSet, Predicate)"})
  public void testPredicatedNavigableSet_whenTreeSet_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    PredicatedNavigableSet<Object> actualPredicatedNavigableSetResult = PredicatedNavigableSet
        .predicatedNavigableSet(set, mock(Predicate.class));

    // Assert
    assertEquals(set, actualPredicatedNavigableSetResult);
  }

  /**
   * Test {@link PredicatedNavigableSet#PredicatedNavigableSet(NavigableSet, Predicate)}.
   * <p>
   * Method under test: {@link PredicatedNavigableSet#PredicatedNavigableSet(NavigableSet, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedNavigableSet.<init>(NavigableSet, Predicate)"})
  public void testNewPredicatedNavigableSet() {
    // Arrange and Act
    PredicatedNavigableSet<Object> actualObjectSet = new PredicatedNavigableSet<>(new TreeSet<>(),
        mock(Predicate.class));

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }
}
