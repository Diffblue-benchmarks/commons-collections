package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
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
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SetUtilsDiffblueTest {
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
  @DisplayName("Test difference(Set, Set); given '42'; when HashSet() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetView SetUtils.difference(Set, Set)"})
  void testDifference_given42_whenHashSetAdd42() {
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
  @DisplayName("Test difference(Set, Set); given '42'; when HashSet() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetView SetUtils.difference(Set, Set)"})
  void testDifference_given42_whenHashSetAdd422() {
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
  @DisplayName("Test difference(Set, Set); given two; when HashSet() add two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetView SetUtils.difference(Set, Set)"})
  void testDifference_givenTwo_whenHashSetAddTwo() {
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
  @DisplayName("Test difference(Set, Set); given two; when HashSet() add two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetView SetUtils.difference(Set, Set)"})
  void testDifference_givenTwo_whenHashSetAddTwo2() {
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
  @DisplayName("Test difference(Set, Set); when HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetView SetUtils.difference(Set, Set)"})
  void testDifference_whenHashSet() {
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
  @DisplayName("Test disjunction(Set, Set); given '42'; when HashSet() add '42'; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetView SetUtils.disjunction(Set, Set)"})
  void testDisjunction_given42_whenHashSetAdd42_thenReturnHashSet() {
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
  @DisplayName("Test disjunction(Set, Set); given '42'; when HashSet() add '42'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetView SetUtils.disjunction(Set, Set)"})
  void testDisjunction_given42_whenHashSetAdd42_thenReturnSizeIsOne() {
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
  @DisplayName("Test disjunction(Set, Set); given two; when HashSet() add two; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetView SetUtils.disjunction(Set, Set)"})
  void testDisjunction_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
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
  @DisplayName("Test disjunction(Set, Set); given two; when HashSet() add two; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetView SetUtils.disjunction(Set, Set)"})
  void testDisjunction_givenTwo_whenHashSetAddTwo_thenReturnHashSet2() {
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
  @DisplayName("Test disjunction(Set, Set); when HashSet(); then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetView SetUtils.disjunction(Set, Set)"})
  void testDisjunction_whenHashSet_thenReturnHashSet() {
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
  @DisplayName("Test emptyIfNull(Set); given '42'; when HashSet() add '42'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set SetUtils.emptyIfNull(Set)"})
  void testEmptyIfNull_given42_whenHashSetAdd42_thenReturnSizeIsOne() {
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
  @DisplayName("Test emptyIfNull(Set); given two; when HashSet() add two; then return size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set SetUtils.emptyIfNull(Set)"})
  void testEmptyIfNull_givenTwo_whenHashSetAddTwo_thenReturnSizeIsTwo() {
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
  @DisplayName("Test emptyIfNull(Set); when HashSet(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set SetUtils.emptyIfNull(Set)"})
  void testEmptyIfNull_whenHashSet_thenReturnEmpty() {
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
  @DisplayName("Test emptyIfNull(Set); when 'null'; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set SetUtils.emptyIfNull(Set)"})
  void testEmptyIfNull_whenNull_thenReturnEmpty() {
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
  @DisplayName("Test emptySet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set SetUtils.emptySet()"})
  void testEmptySet() {
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
  @DisplayName("Test emptySortedSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedSet SetUtils.emptySortedSet()"})
  void testEmptySortedSet() {
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
  @DisplayName("Test hashCodeForSet(Collection); given '42'; when ArrayList() add '42'; then return '3324'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int SetUtils.hashCodeForSet(Collection)"})
  void testHashCodeForSet_given42_whenArrayListAdd42_thenReturn3324() {
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
  @DisplayName("Test hashCodeForSet(Collection); given 'null'; when LinkedHashSet() add 'null'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int SetUtils.hashCodeForSet(Collection)"})
  void testHashCodeForSet_givenNull_whenLinkedHashSetAddNull_thenReturnZero() {
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
  @DisplayName("Test hashCodeForSet(Collection); given 'Set'; when LinkedHashSet() add 'Set'; then return '83010'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int SetUtils.hashCodeForSet(Collection)"})
  void testHashCodeForSet_givenSet_whenLinkedHashSetAddSet_thenReturn83010() {
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
  @DisplayName("Test hashCodeForSet(Collection); when ArrayList(); then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int SetUtils.hashCodeForSet(Collection)"})
  void testHashCodeForSet_whenArrayList_thenReturnZero() {
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
  @DisplayName("Test hashCodeForSet(Collection); when 'null'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int SetUtils.hashCodeForSet(Collection)"})
  void testHashCodeForSet_whenNull_thenReturnZero() {
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
  @DisplayName("Test hashSet(Object[]); when 'Items'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"HashSet SetUtils.hashSet(Object[])"})
  void testHashSet_whenItems_thenReturnSizeIsOne() {
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
  @DisplayName("Test hashSet(Object[]); when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"HashSet SetUtils.hashSet(Object[])"})
  void testHashSet_whenNull_thenReturnNull() {
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
  @DisplayName("Test intersection(Set, Set); given '42'; when HashSet() add '42'; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetView SetUtils.intersection(Set, Set)"})
  void testIntersection_given42_whenHashSetAdd42_thenReturnEmpty() {
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
  @DisplayName("Test intersection(Set, Set); given '42'; when HashSet() add '42'; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetView SetUtils.intersection(Set, Set)"})
  void testIntersection_given42_whenHashSetAdd42_thenReturnHashSet() {
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
  @DisplayName("Test intersection(Set, Set); given two; when HashSet() add two; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetView SetUtils.intersection(Set, Set)"})
  void testIntersection_givenTwo_whenHashSetAddTwo_thenReturnEmpty() {
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
  @DisplayName("Test intersection(Set, Set); given two; when HashSet() add two; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetView SetUtils.intersection(Set, Set)"})
  void testIntersection_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
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
  @DisplayName("Test intersection(Set, Set); when HashSet(); then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetView SetUtils.intersection(Set, Set)"})
  void testIntersection_whenHashSet_thenReturnHashSet() {
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
  @DisplayName("Test isEqualSet(Collection, Collection); given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SetUtils.isEqualSet(Collection, Collection)"})
  void testIsEqualSet_given42_whenArrayListAdd42_thenReturnFalse() {
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
  @DisplayName("Test isEqualSet(Collection, Collection); given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SetUtils.isEqualSet(Collection, Collection)"})
  void testIsEqualSet_given42_whenArrayListAdd42_thenReturnFalse2() {
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
  @DisplayName("Test isEqualSet(Collection, Collection); given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SetUtils.isEqualSet(Collection, Collection)"})
  void testIsEqualSet_given42_whenArrayListAdd42_thenReturnFalse3() {
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
  @DisplayName("Test isEqualSet(Collection, Collection); given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SetUtils.isEqualSet(Collection, Collection)"})
  void testIsEqualSet_given42_whenArrayListAdd42_thenReturnFalse4() {
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
  @DisplayName("Test isEqualSet(Collection, Collection); when ArrayList(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SetUtils.isEqualSet(Collection, Collection)"})
  void testIsEqualSet_whenArrayList_thenReturnTrue() {
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
  @DisplayName("Test isEqualSet(Collection, Collection); when 'null'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SetUtils.isEqualSet(Collection, Collection)"})
  void testIsEqualSet_whenNull_thenReturnFalse() {
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
  @DisplayName("Test isEqualSet(Collection, Collection); when 'null'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SetUtils.isEqualSet(Collection, Collection)"})
  void testIsEqualSet_whenNull_thenReturnFalse2() {
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
  @DisplayName("Test isEqualSet(Collection, Collection); when 'null'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SetUtils.isEqualSet(Collection, Collection)"})
  void testIsEqualSet_whenNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(SetUtils.isEqualSet(null, null));
  }

  /**
   * Test {@link SetUtils#newIdentityHashSet()}.
   * <p>
   * Method under test: {@link SetUtils#newIdentityHashSet()}
   */
  @Test
  @DisplayName("Test newIdentityHashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set SetUtils.newIdentityHashSet()"})
  void testNewIdentityHashSet() {
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
  @DisplayName("Test orderedSet(Set); given '42'; when HashSet() add '42'; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set SetUtils.orderedSet(Set)"})
  void testOrderedSet_given42_whenHashSetAdd42_thenReturnHashSet() {
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
  @DisplayName("Test orderedSet(Set); given two; when HashSet() add two; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set SetUtils.orderedSet(Set)"})
  void testOrderedSet_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
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
  @DisplayName("Test orderedSet(Set); when HashSet(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set SetUtils.orderedSet(Set)"})
  void testOrderedSet_whenHashSet_thenReturnEmpty() {
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
  @DisplayName("Test predicatedNavigableSet(NavigableSet, Predicate); given 'foo'; when TreeSet() add 'foo'; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedSet SetUtils.predicatedNavigableSet(NavigableSet, Predicate)"})
  void testPredicatedNavigableSet_givenFoo_whenTreeSetAddFoo_thenCallsTest() {
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
  @DisplayName("Test predicatedNavigableSet(NavigableSet, Predicate); given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedSet SetUtils.predicatedNavigableSet(NavigableSet, Predicate)"})
  void testPredicatedNavigableSet_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
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
  @DisplayName("Test predicatedNavigableSet(NavigableSet, Predicate); when TreeSet(); then return TreeSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedSet SetUtils.predicatedNavigableSet(NavigableSet, Predicate)"})
  void testPredicatedNavigableSet_whenTreeSet_thenReturnTreeSet() {
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
  @DisplayName("Test predicatedSet(Set, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set SetUtils.predicatedSet(Set, Predicate)"})
  void testPredicatedSet_givenTrue_whenPredicateTestReturnTrue_thenReturnHashSet() {
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
  @DisplayName("Test predicatedSet(Set, Predicate); given two; when HashSet() add two; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set SetUtils.predicatedSet(Set, Predicate)"})
  void testPredicatedSet_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
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
  @DisplayName("Test predicatedSet(Set, Predicate); when HashSet(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set SetUtils.predicatedSet(Set, Predicate)"})
  void testPredicatedSet_whenHashSet_thenReturnEmpty() {
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
  @DisplayName("Test predicatedSortedSet(SortedSet, Predicate); given 'foo'; when TreeSet() add 'foo'; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedSet SetUtils.predicatedSortedSet(SortedSet, Predicate)"})
  void testPredicatedSortedSet_givenFoo_whenTreeSetAddFoo_thenCallsTest() {
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
  @DisplayName("Test predicatedSortedSet(SortedSet, Predicate); given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedSet SetUtils.predicatedSortedSet(SortedSet, Predicate)"})
  void testPredicatedSortedSet_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
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
  @DisplayName("Test predicatedSortedSet(SortedSet, Predicate); when TreeSet(); then return TreeSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedSet SetUtils.predicatedSortedSet(SortedSet, Predicate)"})
  void testPredicatedSortedSet_whenTreeSet_thenReturnTreeSet() {
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
  @DisplayName("Test synchronizedSet(Set); given '42'; when HashSet() add '42'; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set SetUtils.synchronizedSet(Set)"})
  void testSynchronizedSet_given42_whenHashSetAdd42_thenReturnHashSet() {
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
  @DisplayName("Test synchronizedSet(Set); given two; when HashSet() add two; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set SetUtils.synchronizedSet(Set)"})
  void testSynchronizedSet_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
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
  @DisplayName("Test synchronizedSet(Set); when HashSet(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set SetUtils.synchronizedSet(Set)"})
  void testSynchronizedSet_whenHashSet_thenReturnEmpty() {
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
  @DisplayName("Test synchronizedSortedSet(SortedSet); given '42'; when TreeSet() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedSet SetUtils.synchronizedSortedSet(SortedSet)"})
  void testSynchronizedSortedSet_given42_whenTreeSetAdd42() {
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
  @DisplayName("Test synchronizedSortedSet(SortedSet); given 'foo'; when TreeSet() add 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedSet SetUtils.synchronizedSortedSet(SortedSet)"})
  void testSynchronizedSortedSet_givenFoo_whenTreeSetAddFoo() {
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
  @DisplayName("Test synchronizedSortedSet(SortedSet); when TreeSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedSet SetUtils.synchronizedSortedSet(SortedSet)"})
  void testSynchronizedSortedSet_whenTreeSet() {
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
  @DisplayName("Test transformedNavigableSet(NavigableSet, Transformer); given '42'; when TreeSet() add '42'; then return TreeSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedSet SetUtils.transformedNavigableSet(NavigableSet, Transformer)"})
  void testTransformedNavigableSet_given42_whenTreeSetAdd42_thenReturnTreeSet() {
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
  @DisplayName("Test transformedNavigableSet(NavigableSet, Transformer); given 'foo'; when TreeSet() add 'foo'; then return TreeSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedSet SetUtils.transformedNavigableSet(NavigableSet, Transformer)"})
  void testTransformedNavigableSet_givenFoo_whenTreeSetAddFoo_thenReturnTreeSet() {
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
  @DisplayName("Test transformedNavigableSet(NavigableSet, Transformer); when TreeSet(); then return TreeSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedSet SetUtils.transformedNavigableSet(NavigableSet, Transformer)"})
  void testTransformedNavigableSet_whenTreeSet_thenReturnTreeSet() {
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
  @DisplayName("Test transformedSet(Set, Transformer); given '42'; when HashSet() add '42'; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set SetUtils.transformedSet(Set, Transformer)"})
  void testTransformedSet_given42_whenHashSetAdd42_thenReturnHashSet() {
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
  @DisplayName("Test transformedSet(Set, Transformer); given two; when HashSet() add two; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set SetUtils.transformedSet(Set, Transformer)"})
  void testTransformedSet_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
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
  @DisplayName("Test transformedSet(Set, Transformer); when HashSet(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set SetUtils.transformedSet(Set, Transformer)"})
  void testTransformedSet_whenHashSet_thenReturnEmpty() {
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
  @DisplayName("Test transformedSortedSet(SortedSet, Transformer); given '42'; when TreeSet() add '42'; then return TreeSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedSet SetUtils.transformedSortedSet(SortedSet, Transformer)"})
  void testTransformedSortedSet_given42_whenTreeSetAdd42_thenReturnTreeSet() {
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
  @DisplayName("Test transformedSortedSet(SortedSet, Transformer); given 'foo'; when TreeSet() add 'foo'; then return TreeSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedSet SetUtils.transformedSortedSet(SortedSet, Transformer)"})
  void testTransformedSortedSet_givenFoo_whenTreeSetAddFoo_thenReturnTreeSet() {
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
  @DisplayName("Test transformedSortedSet(SortedSet, Transformer); when TreeSet(); then return TreeSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedSet SetUtils.transformedSortedSet(SortedSet, Transformer)"})
  void testTransformedSortedSet_whenTreeSet_thenReturnTreeSet() {
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
  @DisplayName("Test union(Set, Set); given '42'; when HashSet() add '42'; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetView SetUtils.union(Set, Set)"})
  void testUnion_given42_whenHashSetAdd42_thenReturnHashSet() {
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
  @DisplayName("Test union(Set, Set); given '42'; when HashSet() add '42'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetView SetUtils.union(Set, Set)"})
  void testUnion_given42_whenHashSetAdd42_thenReturnSizeIsOne() {
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
  @DisplayName("Test union(Set, Set); given two; when HashSet() add two; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetView SetUtils.union(Set, Set)"})
  void testUnion_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
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
  @DisplayName("Test union(Set, Set); given two; when HashSet() add two; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetView SetUtils.union(Set, Set)"})
  void testUnion_givenTwo_whenHashSetAddTwo_thenReturnHashSet2() {
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
  @DisplayName("Test union(Set, Set); when HashSet(); then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetView SetUtils.union(Set, Set)"})
  void testUnion_whenHashSet_thenReturnHashSet() {
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
  @DisplayName("Test unmodifiableNavigableSet(NavigableSet); given '42'; when TreeSet() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedSet SetUtils.unmodifiableNavigableSet(NavigableSet)"})
  void testUnmodifiableNavigableSet_given42_whenTreeSetAdd42() {
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
  @DisplayName("Test unmodifiableNavigableSet(NavigableSet); given 'foo'; when TreeSet() add 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedSet SetUtils.unmodifiableNavigableSet(NavigableSet)"})
  void testUnmodifiableNavigableSet_givenFoo_whenTreeSetAddFoo() {
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
  @DisplayName("Test unmodifiableNavigableSet(NavigableSet); when TreeSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedSet SetUtils.unmodifiableNavigableSet(NavigableSet)"})
  void testUnmodifiableNavigableSet_whenTreeSet() {
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
  @DisplayName("Test unmodifiableSet(Object[]) with 'items'; when 'Items'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set SetUtils.unmodifiableSet(Object[])"})
  void testUnmodifiableSetWithItems_whenItems_thenReturnSizeIsOne() {
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
  @DisplayName("Test unmodifiableSet(Object[]) with 'items'; when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set SetUtils.unmodifiableSet(Object[])"})
  void testUnmodifiableSetWithItems_whenNull_thenReturnNull() {
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
  @DisplayName("Test unmodifiableSet(Set) with 'set'; given '42'; when HashSet() add '42'; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set SetUtils.unmodifiableSet(Set)"})
  void testUnmodifiableSetWithSet_given42_whenHashSetAdd42_thenReturnHashSet() {
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
  @DisplayName("Test unmodifiableSet(Set) with 'set'; given two; when HashSet() add two; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set SetUtils.unmodifiableSet(Set)"})
  void testUnmodifiableSetWithSet_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
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
  @DisplayName("Test unmodifiableSet(Set) with 'set'; when HashSet(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set SetUtils.unmodifiableSet(Set)"})
  void testUnmodifiableSetWithSet_whenHashSet_thenReturnEmpty() {
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
  @DisplayName("Test unmodifiableSortedSet(SortedSet); given '42'; when TreeSet() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedSet SetUtils.unmodifiableSortedSet(SortedSet)"})
  void testUnmodifiableSortedSet_given42_whenTreeSetAdd42() {
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
  @DisplayName("Test unmodifiableSortedSet(SortedSet); given 'foo'; when TreeSet() add 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedSet SetUtils.unmodifiableSortedSet(SortedSet)"})
  void testUnmodifiableSortedSet_givenFoo_whenTreeSetAddFoo() {
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
  @DisplayName("Test unmodifiableSortedSet(SortedSet); when TreeSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedSet SetUtils.unmodifiableSortedSet(SortedSet)"})
  void testUnmodifiableSortedSet_whenTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    SortedSet<Object> actualUnmodifiableSortedSetResult = SetUtils.unmodifiableSortedSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableSortedSetResult);
  }
}
