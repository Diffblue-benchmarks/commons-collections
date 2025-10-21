package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import org.apache.commons.collections4.SetUtils.SetView;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class SetUtilsDiffblueTest {
  /**
   * Test {@link SetUtils#difference(Set, Set)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#difference(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetView SetUtils.difference(Set, Set)"})
  public void testDifference_given42_whenHashSetAdd42() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();
    setA.add("42");

    // Act
    SetView<Object> actualDifferenceResult = SetUtils.difference(setA, new HashSet<>());

    // Assert
    assertEquals(setA, actualDifferenceResult);
  }

  /**
   * Test {@link SetUtils#difference(Set, Set)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#difference(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetView SetUtils.difference(Set, Set)"})
  public void testDifference_given42_whenHashSetAdd422() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    HashSet<Object> setB = new HashSet<>();
    setB.add("42");

    // Act
    SetView<Object> actualDifferenceResult = SetUtils.difference(setA, setB);

    // Assert
    assertEquals(setA, actualDifferenceResult);
  }

  /**
   * Test {@link SetUtils#difference(Set, Set)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#difference(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetView SetUtils.difference(Set, Set)"})
  public void testDifference_givenTwo_whenHashSetAddTwo() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();
    setA.add(2);
    setA.add("42");

    // Act
    SetView<Object> actualDifferenceResult = SetUtils.difference(setA, new HashSet<>());

    // Assert
    assertEquals(setA, actualDifferenceResult);
  }

  /**
   * Test {@link SetUtils#difference(Set, Set)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#difference(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetView SetUtils.difference(Set, Set)"})
  public void testDifference_givenTwo_whenHashSetAddTwo2() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    HashSet<Object> setB = new HashSet<>();
    setB.add(2);
    setB.add("42");

    // Act
    SetView<Object> actualDifferenceResult = SetUtils.difference(setA, setB);

    // Assert
    assertEquals(setA, actualDifferenceResult);
  }

  /**
   * Test {@link SetUtils#difference(Set, Set)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#difference(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetView SetUtils.difference(Set, Set)"})
  public void testDifference_whenHashSet() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    // Act
    SetView<Object> actualDifferenceResult = SetUtils.difference(setA, new HashSet<>());

    // Assert
    assertEquals(setA, actualDifferenceResult);
  }

  /**
   * Test {@link SetUtils#disjunction(Set, Set)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#disjunction(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetView SetUtils.disjunction(Set, Set)"})
  public void testDisjunction_given42_whenHashSetAdd42_thenReturnHashSet() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();
    setA.add("42");

    // Act
    SetView<Object> actualDisjunctionResult = SetUtils.disjunction(setA, new HashSet<>());

    // Assert
    assertEquals(setA, actualDisjunctionResult);
  }

  /**
   * Test {@link SetUtils#disjunction(Set, Set)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#disjunction(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetView SetUtils.disjunction(Set, Set)"})
  public void testDisjunction_given42_whenHashSetAdd42_thenReturnSizeIsOne() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    HashSet<Object> setB = new HashSet<>();
    setB.add("42");

    // Act
    SetView<Object> actualDisjunctionResult = SetUtils.disjunction(setA, setB);

    // Assert
    assertEquals(1, actualDisjunctionResult.size());
  }

  /**
   * Test {@link SetUtils#disjunction(Set, Set)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#disjunction(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetView SetUtils.disjunction(Set, Set)"})
  public void testDisjunction_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();
    setA.add(2);
    setA.add("42");

    // Act
    SetView<Object> actualDisjunctionResult = SetUtils.disjunction(setA, new HashSet<>());

    // Assert
    assertEquals(setA, actualDisjunctionResult);
  }

  /**
   * Test {@link SetUtils#disjunction(Set, Set)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#disjunction(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetView SetUtils.disjunction(Set, Set)"})
  public void testDisjunction_givenTwo_whenHashSetAddTwo_thenReturnHashSet2() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    HashSet<Object> setB = new HashSet<>();
    setB.add(2);
    setB.add("42");

    // Act
    SetView<Object> actualDisjunctionResult = SetUtils.disjunction(setA, setB);

    // Assert
    assertEquals(setB, actualDisjunctionResult);
  }

  /**
   * Test {@link SetUtils#disjunction(Set, Set)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#disjunction(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetView SetUtils.disjunction(Set, Set)"})
  public void testDisjunction_whenHashSet_thenReturnHashSet() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    // Act
    SetView<Object> actualDisjunctionResult = SetUtils.disjunction(setA, new HashSet<>());

    // Assert
    assertEquals(setA, actualDisjunctionResult);
  }

  /**
   * Test {@link SetUtils#emptyIfNull(Set)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#emptyIfNull(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SetUtils.emptyIfNull(Set)"})
  public void testEmptyIfNull_given42_whenHashSetAdd42_thenReturnSizeIsOne() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    Set<Object> actualEmptyIfNullResult = SetUtils.emptyIfNull(set);

    // Assert
    assertEquals(1, actualEmptyIfNullResult.size());
  }

  /**
   * Test {@link SetUtils#emptyIfNull(Set)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#emptyIfNull(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SetUtils.emptyIfNull(Set)"})
  public void testEmptyIfNull_givenTwo_whenHashSetAddTwo_thenReturnSizeIsTwo() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    Set<Object> actualEmptyIfNullResult = SetUtils.emptyIfNull(set);

    // Assert
    assertEquals(2, actualEmptyIfNullResult.size());
  }

  /**
   * Test {@link SetUtils#emptyIfNull(Set)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#emptyIfNull(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SetUtils.emptyIfNull(Set)"})
  public void testEmptyIfNull_whenHashSet_thenReturnEmpty() {
    // Arrange and Act
    Set<Object> actualEmptyIfNullResult = SetUtils.emptyIfNull(new HashSet<>());

    // Assert
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Test {@link SetUtils#emptyIfNull(Set)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#emptyIfNull(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SetUtils.emptyIfNull(Set)"})
  public void testEmptyIfNull_whenNull_thenReturnEmpty() {
    // Arrange and Act
    Set<Object> actualEmptyIfNullResult = SetUtils.emptyIfNull(null);

    // Assert
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Test {@link SetUtils#emptySet()}.
   * <p>
   * Method under test: {@link SetUtils#emptySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SetUtils.emptySet()"})
  public void testEmptySet() {
    // Arrange and Act
    Set<Object> actualEmptySetResult = SetUtils.emptySet();

    // Assert
    assertTrue(actualEmptySetResult.isEmpty());
  }

  /**
   * Test {@link SetUtils#emptySortedSet()}.
   * <p>
   * Method under test: {@link SetUtils#emptySortedSet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet SetUtils.emptySortedSet()"})
  public void testEmptySortedSet() {
    // Arrange and Act
    SortedSet<Object> actualEmptySortedSetResult = SetUtils.emptySortedSet();

    // Assert
    assertTrue(actualEmptySortedSetResult.isEmpty());
  }

  /**
   * Test {@link SetUtils#hashCodeForSet(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 3324}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#hashCodeForSet(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int SetUtils.hashCodeForSet(Collection)"})
  public void testHashCodeForSet_given42_whenArrayListAdd42_thenReturn3324() {
    // Arrange
    ArrayList<Object> set = new ArrayList<>();
    set.add("42");
    set.add("42");

    // Act and Assert
    assertEquals(3324, SetUtils.hashCodeForSet(set));
  }

  /**
   * Test {@link SetUtils#hashCodeForSet(Collection)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#hashCodeForSet(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int SetUtils.hashCodeForSet(Collection)"})
  public void testHashCodeForSet_givenNull_whenLinkedHashSetAddNull_thenReturnZero() {
    // Arrange
    LinkedHashSet<Object> set = new LinkedHashSet<>();
    set.add(null);

    // Act and Assert
    assertEquals(0, SetUtils.hashCodeForSet(set));
  }

  /**
   * Test {@link SetUtils#hashCodeForSet(Collection)}.
   * <ul>
   *   <li>Given {@code Set}.</li>
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@code Set}.</li>
   *   <li>Then return {@code 83010}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#hashCodeForSet(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int SetUtils.hashCodeForSet(Collection)"})
  public void testHashCodeForSet_givenSet_whenLinkedHashSetAddSet_thenReturn83010() {
    // Arrange
    LinkedHashSet<Object> set = new LinkedHashSet<>();
    set.add("Set");

    // Act and Assert
    assertEquals(83010, SetUtils.hashCodeForSet(set));
  }

  /**
   * Test {@link SetUtils#hashCodeForSet(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#hashCodeForSet(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int SetUtils.hashCodeForSet(Collection)"})
  public void testHashCodeForSet_whenArrayList_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, SetUtils.hashCodeForSet(new ArrayList<>()));
  }

  /**
   * Test {@link SetUtils#hashCodeForSet(Collection)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#hashCodeForSet(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int SetUtils.hashCodeForSet(Collection)"})
  public void testHashCodeForSet_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, SetUtils.hashCodeForSet(null));
  }

  /**
   * Test {@link SetUtils#hashSet(Object[])}.
   * <ul>
   *   <li>When {@code Items}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#hashSet(Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"HashSet SetUtils.hashSet(Object[])"})
  public void testHashSet_whenItems_thenReturnSizeIsOne() {
    // Arrange and Act
    HashSet<Object> actualHashSetResult = SetUtils.hashSet("Items");

    // Assert
    assertEquals(1, actualHashSetResult.size());
  }

  /**
   * Test {@link SetUtils#hashSet(Object[])}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#hashSet(Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"HashSet SetUtils.hashSet(Object[])"})
  public void testHashSet_whenNull_thenReturnNull() {
    // Arrange and Act
    HashSet<Object> actualHashSetResult = SetUtils.hashSet(null);

    // Assert
    assertNull(actualHashSetResult);
  }

  /**
   * Test {@link SetUtils#intersection(Set, Set)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#intersection(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetView SetUtils.intersection(Set, Set)"})
  public void testIntersection_given42_whenHashSetAdd42_thenReturnEmpty() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();
    setA.add("42");

    // Act
    SetView<Object> actualIntersectionResult = SetUtils.intersection(setA, new HashSet<>());

    // Assert
    assertTrue(actualIntersectionResult.isEmpty());
  }

  /**
   * Test {@link SetUtils#intersection(Set, Set)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#intersection(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetView SetUtils.intersection(Set, Set)"})
  public void testIntersection_given42_whenHashSetAdd42_thenReturnHashSet() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    HashSet<Object> setB = new HashSet<>();
    setB.add("42");

    // Act
    SetView<Object> actualIntersectionResult = SetUtils.intersection(setA, setB);

    // Assert
    assertEquals(setA, actualIntersectionResult);
  }

  /**
   * Test {@link SetUtils#intersection(Set, Set)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#intersection(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetView SetUtils.intersection(Set, Set)"})
  public void testIntersection_givenTwo_whenHashSetAddTwo_thenReturnEmpty() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();
    setA.add(2);
    setA.add("42");

    // Act
    SetView<Object> actualIntersectionResult = SetUtils.intersection(setA, new HashSet<>());

    // Assert
    assertTrue(actualIntersectionResult.isEmpty());
  }

  /**
   * Test {@link SetUtils#intersection(Set, Set)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#intersection(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetView SetUtils.intersection(Set, Set)"})
  public void testIntersection_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    HashSet<Object> setB = new HashSet<>();
    setB.add(2);
    setB.add("42");

    // Act
    SetView<Object> actualIntersectionResult = SetUtils.intersection(setA, setB);

    // Assert
    assertEquals(setA, actualIntersectionResult);
  }

  /**
   * Test {@link SetUtils#intersection(Set, Set)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#intersection(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetView SetUtils.intersection(Set, Set)"})
  public void testIntersection_whenHashSet_thenReturnHashSet() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    // Act
    SetView<Object> actualIntersectionResult = SetUtils.intersection(setA, new HashSet<>());

    // Assert
    assertEquals(setA, actualIntersectionResult);
  }

  /**
   * Test {@link SetUtils#isEqualSet(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#isEqualSet(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SetUtils.isEqualSet(Collection, Collection)"})
  public void testIsEqualSet_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ArrayList<Object> set1 = new ArrayList<>();
    set1.add("42");

    // Act and Assert
    assertFalse(SetUtils.isEqualSet(set1, new ArrayList<>()));
  }

  /**
   * Test {@link SetUtils#isEqualSet(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#isEqualSet(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SetUtils.isEqualSet(Collection, Collection)"})
  public void testIsEqualSet_given42_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    ArrayList<Object> set1 = new ArrayList<>();
    set1.add("42");
    set1.add("42");

    // Act and Assert
    assertFalse(SetUtils.isEqualSet(set1, new ArrayList<>()));
  }

  /**
   * Test {@link SetUtils#isEqualSet(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#isEqualSet(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SetUtils.isEqualSet(Collection, Collection)"})
  public void testIsEqualSet_given42_whenArrayListAdd42_thenReturnFalse3() {
    // Arrange
    ArrayList<Object> set1 = new ArrayList<>();

    ArrayList<Object> set2 = new ArrayList<>();
    set2.add("42");

    // Act and Assert
    assertFalse(SetUtils.isEqualSet(set1, set2));
  }

  /**
   * Test {@link SetUtils#isEqualSet(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#isEqualSet(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SetUtils.isEqualSet(Collection, Collection)"})
  public void testIsEqualSet_given42_whenArrayListAdd42_thenReturnFalse4() {
    // Arrange
    ArrayList<Object> set1 = new ArrayList<>();

    ArrayList<Object> set2 = new ArrayList<>();
    set2.add("42");
    set2.add("42");

    // Act and Assert
    assertFalse(SetUtils.isEqualSet(set1, set2));
  }

  /**
   * Test {@link SetUtils#isEqualSet(Collection, Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#isEqualSet(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SetUtils.isEqualSet(Collection, Collection)"})
  public void testIsEqualSet_whenArrayList_thenReturnTrue() {
    // Arrange
    ArrayList<Object> set1 = new ArrayList<>();

    // Act and Assert
    assertTrue(SetUtils.isEqualSet(set1, new ArrayList<>()));
  }

  /**
   * Test {@link SetUtils#isEqualSet(Collection, Collection)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#isEqualSet(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SetUtils.isEqualSet(Collection, Collection)"})
  public void testIsEqualSet_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(SetUtils.isEqualSet(null, new ArrayList<>()));
  }

  /**
   * Test {@link SetUtils#isEqualSet(Collection, Collection)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#isEqualSet(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SetUtils.isEqualSet(Collection, Collection)"})
  public void testIsEqualSet_whenNull_thenReturnFalse2() {
    // Arrange, Act and Assert
    assertFalse(SetUtils.isEqualSet(new ArrayList<>(), null));
  }

  /**
   * Test {@link SetUtils#isEqualSet(Collection, Collection)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#isEqualSet(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SetUtils.isEqualSet(Collection, Collection)"})
  public void testIsEqualSet_whenNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(SetUtils.isEqualSet(null, null));
  }

  /**
   * Test {@link SetUtils#newIdentityHashSet()}.
   * <p>
   * Method under test: {@link SetUtils#newIdentityHashSet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SetUtils.newIdentityHashSet()"})
  public void testNewIdentityHashSet() {
    // Arrange and Act
    Set<Object> actualNewIdentityHashSetResult = SetUtils.newIdentityHashSet();

    // Assert
    assertTrue(actualNewIdentityHashSetResult.isEmpty());
  }

  /**
   * Test {@link SetUtils#orderedSet(Set)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#orderedSet(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SetUtils.orderedSet(Set)"})
  public void testOrderedSet_given42_whenHashSetAdd42_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    Set<Object> actualOrderedSetResult = SetUtils.orderedSet(set);

    // Assert
    assertEquals(set, actualOrderedSetResult);
  }

  /**
   * Test {@link SetUtils#orderedSet(Set)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#orderedSet(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SetUtils.orderedSet(Set)"})
  public void testOrderedSet_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    Set<Object> actualOrderedSetResult = SetUtils.orderedSet(set);

    // Assert
    assertEquals(set, actualOrderedSetResult);
  }

  /**
   * Test {@link SetUtils#orderedSet(Set)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#orderedSet(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SetUtils.orderedSet(Set)"})
  public void testOrderedSet_whenHashSet_thenReturnEmpty() {
    // Arrange and Act
    Set<Object> actualOrderedSetResult = SetUtils.orderedSet(new HashSet<>());

    // Assert
    assertTrue(actualOrderedSetResult.isEmpty());
  }

  /**
   * Test {@link SetUtils#predicatedNavigableSet(NavigableSet, Predicate)}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link TreeSet#TreeSet()} add {@code foo}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#predicatedNavigableSet(NavigableSet, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet SetUtils.predicatedNavigableSet(NavigableSet, Predicate)"})
  public void testPredicatedNavigableSet_givenFoo_whenTreeSetAddFoo_thenCallsTest() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");
    set.add("foo");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    SortedSet<Object> actualPredicatedNavigableSetResult = SetUtils.predicatedNavigableSet(set, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(Mockito.<Object>any());
    assertEquals(set, actualPredicatedNavigableSetResult);
  }

  /**
   * Test {@link SetUtils#predicatedNavigableSet(NavigableSet, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#predicatedNavigableSet(NavigableSet, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet SetUtils.predicatedNavigableSet(NavigableSet, Predicate)"})
  public void testPredicatedNavigableSet_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    SortedSet<Object> actualPredicatedNavigableSetResult = SetUtils.predicatedNavigableSet(set, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(set, actualPredicatedNavigableSetResult);
  }

  /**
   * Test {@link SetUtils#predicatedNavigableSet(NavigableSet, Predicate)}.
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.</li>
   *   <li>Then return {@link TreeSet#TreeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#predicatedNavigableSet(NavigableSet, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet SetUtils.predicatedNavigableSet(NavigableSet, Predicate)"})
  public void testPredicatedNavigableSet_whenTreeSet_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    SortedSet<Object> actualPredicatedNavigableSetResult = SetUtils.predicatedNavigableSet(set, mock(Predicate.class));

    // Assert
    assertEquals(set, actualPredicatedNavigableSetResult);
  }

  /**
   * Test {@link SetUtils#predicatedSet(Set, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#predicatedSet(Set, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SetUtils.predicatedSet(Set, Predicate)"})
  public void testPredicatedSet_givenTrue_whenPredicateTestReturnTrue_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Set<Object> actualPredicatedSetResult = SetUtils.predicatedSet(set, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(set, actualPredicatedSetResult);
  }

  /**
   * Test {@link SetUtils#predicatedSet(Set, Predicate)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#predicatedSet(Set, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SetUtils.predicatedSet(Set, Predicate)"})
  public void testPredicatedSet_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");
    set.add(2);
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Set<Object> actualPredicatedSetResult = SetUtils.predicatedSet(set, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(Mockito.<Object>any());
    assertEquals(set, actualPredicatedSetResult);
  }

  /**
   * Test {@link SetUtils#predicatedSet(Set, Predicate)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#predicatedSet(Set, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SetUtils.predicatedSet(Set, Predicate)"})
  public void testPredicatedSet_whenHashSet_thenReturnEmpty() {
    // Arrange and Act
    Set<Object> actualPredicatedSetResult = SetUtils.predicatedSet(new HashSet<>(), mock(Predicate.class));

    // Assert
    assertTrue(actualPredicatedSetResult.isEmpty());
  }

  /**
   * Test {@link SetUtils#predicatedSortedSet(SortedSet, Predicate)}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link TreeSet#TreeSet()} add {@code foo}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#predicatedSortedSet(SortedSet, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet SetUtils.predicatedSortedSet(SortedSet, Predicate)"})
  public void testPredicatedSortedSet_givenFoo_whenTreeSetAddFoo_thenCallsTest() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");
    set.add("foo");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    SortedSet<Object> actualPredicatedSortedSetResult = SetUtils.predicatedSortedSet(set, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(Mockito.<Object>any());
    assertEquals(set, actualPredicatedSortedSetResult);
  }

  /**
   * Test {@link SetUtils#predicatedSortedSet(SortedSet, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#predicatedSortedSet(SortedSet, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet SetUtils.predicatedSortedSet(SortedSet, Predicate)"})
  public void testPredicatedSortedSet_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    SortedSet<Object> actualPredicatedSortedSetResult = SetUtils.predicatedSortedSet(set, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(set, actualPredicatedSortedSetResult);
  }

  /**
   * Test {@link SetUtils#predicatedSortedSet(SortedSet, Predicate)}.
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.</li>
   *   <li>Then return {@link TreeSet#TreeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#predicatedSortedSet(SortedSet, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet SetUtils.predicatedSortedSet(SortedSet, Predicate)"})
  public void testPredicatedSortedSet_whenTreeSet_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    SortedSet<Object> actualPredicatedSortedSetResult = SetUtils.predicatedSortedSet(set, mock(Predicate.class));

    // Assert
    assertEquals(set, actualPredicatedSortedSetResult);
  }

  /**
   * Test {@link SetUtils#synchronizedSet(Set)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#synchronizedSet(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SetUtils.synchronizedSet(Set)"})
  public void testSynchronizedSet_given42_whenHashSetAdd42_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    Set<Object> actualSynchronizedSetResult = SetUtils.synchronizedSet(set);

    // Assert
    assertEquals(set, actualSynchronizedSetResult);
  }

  /**
   * Test {@link SetUtils#synchronizedSet(Set)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#synchronizedSet(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SetUtils.synchronizedSet(Set)"})
  public void testSynchronizedSet_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    Set<Object> actualSynchronizedSetResult = SetUtils.synchronizedSet(set);

    // Assert
    assertEquals(set, actualSynchronizedSetResult);
  }

  /**
   * Test {@link SetUtils#synchronizedSet(Set)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#synchronizedSet(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SetUtils.synchronizedSet(Set)"})
  public void testSynchronizedSet_whenHashSet_thenReturnEmpty() {
    // Arrange and Act
    Set<Object> actualSynchronizedSetResult = SetUtils.synchronizedSet(new HashSet<>());

    // Assert
    assertTrue(actualSynchronizedSetResult.isEmpty());
  }

  /**
   * Test {@link SetUtils#synchronizedSortedSet(SortedSet)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link TreeSet#TreeSet()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#synchronizedSortedSet(SortedSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet SetUtils.synchronizedSortedSet(SortedSet)"})
  public void testSynchronizedSortedSet_given42_whenTreeSetAdd42() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    // Act
    SortedSet<Object> actualSynchronizedSortedSetResult = SetUtils.synchronizedSortedSet(set);

    // Assert
    assertEquals(set, actualSynchronizedSortedSetResult);
  }

  /**
   * Test {@link SetUtils#synchronizedSortedSet(SortedSet)}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link TreeSet#TreeSet()} add {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#synchronizedSortedSet(SortedSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet SetUtils.synchronizedSortedSet(SortedSet)"})
  public void testSynchronizedSortedSet_givenFoo_whenTreeSetAddFoo() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("foo");
    set.add("42");

    // Act
    SortedSet<Object> actualSynchronizedSortedSetResult = SetUtils.synchronizedSortedSet(set);

    // Assert
    assertEquals(set, actualSynchronizedSortedSetResult);
  }

  /**
   * Test {@link SetUtils#synchronizedSortedSet(SortedSet)}.
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#synchronizedSortedSet(SortedSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet SetUtils.synchronizedSortedSet(SortedSet)"})
  public void testSynchronizedSortedSet_whenTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    SortedSet<Object> actualSynchronizedSortedSetResult = SetUtils.synchronizedSortedSet(set);

    // Assert
    assertEquals(set, actualSynchronizedSortedSetResult);
  }

  /**
   * Test {@link SetUtils#transformedNavigableSet(NavigableSet, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link TreeSet#TreeSet()} add {@code 42}.</li>
   *   <li>Then return {@link TreeSet#TreeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#transformedNavigableSet(NavigableSet, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet SetUtils.transformedNavigableSet(NavigableSet, Transformer)"})
  public void testTransformedNavigableSet_given42_whenTreeSetAdd42_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    // Act
    SortedSet<Object> actualTransformedNavigableSetResult = SetUtils.transformedNavigableSet(set,
        mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformedNavigableSetResult);
  }

  /**
   * Test {@link SetUtils#transformedNavigableSet(NavigableSet, Transformer)}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link TreeSet#TreeSet()} add {@code foo}.</li>
   *   <li>Then return {@link TreeSet#TreeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#transformedNavigableSet(NavigableSet, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet SetUtils.transformedNavigableSet(NavigableSet, Transformer)"})
  public void testTransformedNavigableSet_givenFoo_whenTreeSetAddFoo_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("foo");
    set.add("42");

    // Act
    SortedSet<Object> actualTransformedNavigableSetResult = SetUtils.transformedNavigableSet(set,
        mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformedNavigableSetResult);
  }

  /**
   * Test {@link SetUtils#transformedNavigableSet(NavigableSet, Transformer)}.
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.</li>
   *   <li>Then return {@link TreeSet#TreeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#transformedNavigableSet(NavigableSet, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet SetUtils.transformedNavigableSet(NavigableSet, Transformer)"})
  public void testTransformedNavigableSet_whenTreeSet_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    SortedSet<Object> actualTransformedNavigableSetResult = SetUtils.transformedNavigableSet(set,
        mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformedNavigableSetResult);
  }

  /**
   * Test {@link SetUtils#transformedSet(Set, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#transformedSet(Set, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SetUtils.transformedSet(Set, Transformer)"})
  public void testTransformedSet_given42_whenHashSetAdd42_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    Set<Object> actualTransformedSetResult = SetUtils.transformedSet(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformedSetResult);
  }

  /**
   * Test {@link SetUtils#transformedSet(Set, Transformer)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#transformedSet(Set, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SetUtils.transformedSet(Set, Transformer)"})
  public void testTransformedSet_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    Set<Object> actualTransformedSetResult = SetUtils.transformedSet(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformedSetResult);
  }

  /**
   * Test {@link SetUtils#transformedSet(Set, Transformer)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#transformedSet(Set, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SetUtils.transformedSet(Set, Transformer)"})
  public void testTransformedSet_whenHashSet_thenReturnEmpty() {
    // Arrange and Act
    Set<Object> actualTransformedSetResult = SetUtils.transformedSet(new HashSet<>(), mock(Transformer.class));

    // Assert
    assertTrue(actualTransformedSetResult.isEmpty());
  }

  /**
   * Test {@link SetUtils#transformedSortedSet(SortedSet, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link TreeSet#TreeSet()} add {@code 42}.</li>
   *   <li>Then return {@link TreeSet#TreeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#transformedSortedSet(SortedSet, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet SetUtils.transformedSortedSet(SortedSet, Transformer)"})
  public void testTransformedSortedSet_given42_whenTreeSetAdd42_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    // Act
    SortedSet<Object> actualTransformedSortedSetResult = SetUtils.transformedSortedSet(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformedSortedSetResult);
  }

  /**
   * Test {@link SetUtils#transformedSortedSet(SortedSet, Transformer)}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link TreeSet#TreeSet()} add {@code foo}.</li>
   *   <li>Then return {@link TreeSet#TreeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#transformedSortedSet(SortedSet, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet SetUtils.transformedSortedSet(SortedSet, Transformer)"})
  public void testTransformedSortedSet_givenFoo_whenTreeSetAddFoo_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("foo");
    set.add("42");

    // Act
    SortedSet<Object> actualTransformedSortedSetResult = SetUtils.transformedSortedSet(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformedSortedSetResult);
  }

  /**
   * Test {@link SetUtils#transformedSortedSet(SortedSet, Transformer)}.
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.</li>
   *   <li>Then return {@link TreeSet#TreeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#transformedSortedSet(SortedSet, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet SetUtils.transformedSortedSet(SortedSet, Transformer)"})
  public void testTransformedSortedSet_whenTreeSet_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    SortedSet<Object> actualTransformedSortedSetResult = SetUtils.transformedSortedSet(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformedSortedSetResult);
  }

  /**
   * Test {@link SetUtils#union(Set, Set)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#union(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetView SetUtils.union(Set, Set)"})
  public void testUnion_given42_whenHashSetAdd42_thenReturnHashSet() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();
    setA.add("42");

    // Act
    SetView<Object> actualUnionResult = SetUtils.union(setA, new HashSet<>());

    // Assert
    assertEquals(setA, actualUnionResult);
  }

  /**
   * Test {@link SetUtils#union(Set, Set)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#union(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetView SetUtils.union(Set, Set)"})
  public void testUnion_given42_whenHashSetAdd42_thenReturnSizeIsOne() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    HashSet<Object> setB = new HashSet<>();
    setB.add("42");

    // Act
    SetView<Object> actualUnionResult = SetUtils.union(setA, setB);

    // Assert
    assertEquals(1, actualUnionResult.size());
  }

  /**
   * Test {@link SetUtils#union(Set, Set)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#union(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetView SetUtils.union(Set, Set)"})
  public void testUnion_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();
    setA.add(2);
    setA.add("42");

    // Act
    SetView<Object> actualUnionResult = SetUtils.union(setA, new HashSet<>());

    // Assert
    assertEquals(setA, actualUnionResult);
  }

  /**
   * Test {@link SetUtils#union(Set, Set)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#union(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetView SetUtils.union(Set, Set)"})
  public void testUnion_givenTwo_whenHashSetAddTwo_thenReturnHashSet2() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    HashSet<Object> setB = new HashSet<>();
    setB.add(2);
    setB.add("42");

    // Act
    SetView<Object> actualUnionResult = SetUtils.union(setA, setB);

    // Assert
    assertEquals(setB, actualUnionResult);
  }

  /**
   * Test {@link SetUtils#union(Set, Set)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#union(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetView SetUtils.union(Set, Set)"})
  public void testUnion_whenHashSet_thenReturnHashSet() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    // Act
    SetView<Object> actualUnionResult = SetUtils.union(setA, new HashSet<>());

    // Assert
    assertEquals(setA, actualUnionResult);
  }

  /**
   * Test {@link SetUtils#unmodifiableNavigableSet(NavigableSet)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link TreeSet#TreeSet()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#unmodifiableNavigableSet(NavigableSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet SetUtils.unmodifiableNavigableSet(NavigableSet)"})
  public void testUnmodifiableNavigableSet_given42_whenTreeSetAdd42() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    // Act
    SortedSet<Object> actualUnmodifiableNavigableSetResult = SetUtils.unmodifiableNavigableSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableNavigableSetResult);
  }

  /**
   * Test {@link SetUtils#unmodifiableNavigableSet(NavigableSet)}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link TreeSet#TreeSet()} add {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#unmodifiableNavigableSet(NavigableSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet SetUtils.unmodifiableNavigableSet(NavigableSet)"})
  public void testUnmodifiableNavigableSet_givenFoo_whenTreeSetAddFoo() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("foo");
    set.add("42");

    // Act
    SortedSet<Object> actualUnmodifiableNavigableSetResult = SetUtils.unmodifiableNavigableSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableNavigableSetResult);
  }

  /**
   * Test {@link SetUtils#unmodifiableNavigableSet(NavigableSet)}.
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#unmodifiableNavigableSet(NavigableSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet SetUtils.unmodifiableNavigableSet(NavigableSet)"})
  public void testUnmodifiableNavigableSet_whenTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    SortedSet<Object> actualUnmodifiableNavigableSetResult = SetUtils.unmodifiableNavigableSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableNavigableSetResult);
  }

  /**
   * Test {@link SetUtils#unmodifiableSet(Object[])} with {@code items}.
   * <ul>
   *   <li>When {@code Items}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#unmodifiableSet(Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SetUtils.unmodifiableSet(Object[])"})
  public void testUnmodifiableSetWithItems_whenItems_thenReturnSizeIsOne() {
    // Arrange and Act
    Set<Object> actualUnmodifiableSetResult = SetUtils.unmodifiableSet("Items");

    // Assert
    assertEquals(1, actualUnmodifiableSetResult.size());
  }

  /**
   * Test {@link SetUtils#unmodifiableSet(Object[])} with {@code items}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#unmodifiableSet(Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SetUtils.unmodifiableSet(Object[])"})
  public void testUnmodifiableSetWithItems_whenNull_thenReturnNull() {
    // Arrange and Act
    Set<Object> actualUnmodifiableSetResult = SetUtils.unmodifiableSet((Object[]) null);

    // Assert
    assertNull(actualUnmodifiableSetResult);
  }

  /**
   * Test {@link SetUtils#unmodifiableSet(Set)} with {@code set}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#unmodifiableSet(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SetUtils.unmodifiableSet(Set)"})
  public void testUnmodifiableSetWithSet_given42_whenHashSetAdd42_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    Set<Object> actualUnmodifiableSetResult = SetUtils.unmodifiableSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableSetResult);
  }

  /**
   * Test {@link SetUtils#unmodifiableSet(Set)} with {@code set}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#unmodifiableSet(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SetUtils.unmodifiableSet(Set)"})
  public void testUnmodifiableSetWithSet_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    Set<Object> actualUnmodifiableSetResult = SetUtils.unmodifiableSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableSetResult);
  }

  /**
   * Test {@link SetUtils#unmodifiableSet(Set)} with {@code set}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#unmodifiableSet(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SetUtils.unmodifiableSet(Set)"})
  public void testUnmodifiableSetWithSet_whenHashSet_thenReturnEmpty() {
    // Arrange and Act
    Set<Object> actualUnmodifiableSetResult = SetUtils.unmodifiableSet(new HashSet<>());

    // Assert
    assertTrue(actualUnmodifiableSetResult.isEmpty());
  }

  /**
   * Test {@link SetUtils#unmodifiableSortedSet(SortedSet)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link TreeSet#TreeSet()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#unmodifiableSortedSet(SortedSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet SetUtils.unmodifiableSortedSet(SortedSet)"})
  public void testUnmodifiableSortedSet_given42_whenTreeSetAdd42() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    // Act
    SortedSet<Object> actualUnmodifiableSortedSetResult = SetUtils.unmodifiableSortedSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableSortedSetResult);
  }

  /**
   * Test {@link SetUtils#unmodifiableSortedSet(SortedSet)}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link TreeSet#TreeSet()} add {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#unmodifiableSortedSet(SortedSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet SetUtils.unmodifiableSortedSet(SortedSet)"})
  public void testUnmodifiableSortedSet_givenFoo_whenTreeSetAddFoo() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("foo");
    set.add("42");

    // Act
    SortedSet<Object> actualUnmodifiableSortedSetResult = SetUtils.unmodifiableSortedSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableSortedSetResult);
  }

  /**
   * Test {@link SetUtils#unmodifiableSortedSet(SortedSet)}.
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUtils#unmodifiableSortedSet(SortedSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet SetUtils.unmodifiableSortedSet(SortedSet)"})
  public void testUnmodifiableSortedSet_whenTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    SortedSet<Object> actualUnmodifiableSortedSetResult = SetUtils.unmodifiableSortedSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableSortedSetResult);
  }
}
