package org.apache.commons.collections4.set;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class PredicatedSetDiffblueTest {
  /**
   * Test {@link PredicatedSet#predicatedSet(Set, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSet#predicatedSet(Set, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedSet PredicatedSet.predicatedSet(Set, Predicate)"})
  public void testPredicatedSet_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSet<Object> actualPredicatedSetResult = PredicatedSet.predicatedSet(set, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(set, actualPredicatedSetResult);
  }

  /**
   * Test {@link PredicatedSet#predicatedSet(Set, Predicate)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSet#predicatedSet(Set, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedSet PredicatedSet.predicatedSet(Set, Predicate)"})
  public void testPredicatedSet_givenTwo_whenHashSetAddTwo_thenCallsTest() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");
    set.add(2);
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSet<Object> actualPredicatedSetResult = PredicatedSet.predicatedSet(set, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(Mockito.<Object>any());
    assertEquals(set, actualPredicatedSetResult);
  }

  /**
   * Test {@link PredicatedSet#predicatedSet(Set, Predicate)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSet#predicatedSet(Set, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedSet PredicatedSet.predicatedSet(Set, Predicate)"})
  public void testPredicatedSet_whenHashSet_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    // Act
    PredicatedSet<Object> actualPredicatedSetResult = PredicatedSet.predicatedSet(set, mock(Predicate.class));

    // Assert
    assertEquals(set, actualPredicatedSetResult);
  }

  /**
   * Test {@link PredicatedSet#PredicatedSet(Set, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSet#PredicatedSet(Set, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedSet.<init>(Set, Predicate)"})
  public void testNewPredicatedSet_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSet<Object> actualObjectSet = new PredicatedSet<>(set, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(set, actualObjectSet);
  }

  /**
   * Test {@link PredicatedSet#PredicatedSet(Set, Predicate)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSet#PredicatedSet(Set, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedSet.<init>(Set, Predicate)"})
  public void testNewPredicatedSet_givenTwo_whenHashSetAddTwo_thenCallsTest() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");
    set.add(2);
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSet<Object> actualObjectSet = new PredicatedSet<>(set, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(Mockito.<Object>any());
    assertEquals(set, actualObjectSet);
  }

  /**
   * Test {@link PredicatedSet#PredicatedSet(Set, Predicate)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSet#PredicatedSet(Set, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedSet.<init>(Set, Predicate)"})
  public void testNewPredicatedSet_whenHashSet_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    // Act and Assert
    assertEquals(set, new PredicatedSet<>(set, mock(Predicate.class)));
  }
}
