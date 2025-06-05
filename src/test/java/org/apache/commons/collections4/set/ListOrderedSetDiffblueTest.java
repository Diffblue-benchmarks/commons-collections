package org.apache.commons.collections4.set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import org.apache.commons.collections4.OrderedIterator;
import org.apache.commons.collections4.set.ListOrderedSet.OrderedSetIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ListOrderedSetDiffblueTest {
  /**
   * Test {@link ListOrderedSet#listOrderedSet(List)} with {@code list}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#listOrderedSet(List)}
   */
  @Test
  @DisplayName("Test listOrderedSet(List) with 'list'; given '42'; when ArrayList() add '42'; then ArrayList() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(List)"})
  void testListOrderedSetWithList_given42_whenArrayListAdd42_thenArrayListSizeIsOne() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    ListOrderedSet<Object> actualListOrderedSetResult = ListOrderedSet.listOrderedSet(list);

    // Assert
    assertEquals(1, list.size());
    assertEquals(1, actualListOrderedSetResult.size());
  }

  /**
   * Test {@link ListOrderedSet#listOrderedSet(List)} with {@code list}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#listOrderedSet(List)}
   */
  @Test
  @DisplayName("Test listOrderedSet(List) with 'list'; given '42'; when ArrayList() add '42'; then ArrayList() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(List)"})
  void testListOrderedSetWithList_given42_whenArrayListAdd42_thenArrayListSizeIsOne2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    ListOrderedSet<Object> actualListOrderedSetResult = ListOrderedSet.listOrderedSet(list);

    // Assert
    assertEquals(1, list.size());
    assertEquals(1, actualListOrderedSetResult.size());
  }

  /**
   * Test {@link ListOrderedSet#listOrderedSet(List)} with {@code list}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link ArrayList#ArrayList()} add two.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#listOrderedSet(List)}
   */
  @Test
  @DisplayName("Test listOrderedSet(List) with 'list'; given two; when ArrayList() add two; then ArrayList() size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(List)"})
  void testListOrderedSetWithList_givenTwo_whenArrayListAddTwo_thenArrayListSizeIsTwo() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add(2);
    list.add("42");

    // Act
    ListOrderedSet<Object> actualListOrderedSetResult = ListOrderedSet.listOrderedSet(list);

    // Assert
    assertEquals(2, list.size());
    assertEquals(2, actualListOrderedSetResult.size());
  }

  /**
   * Test {@link ListOrderedSet#listOrderedSet(List)} with {@code list}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#listOrderedSet(List)}
   */
  @Test
  @DisplayName("Test listOrderedSet(List) with 'list'; when ArrayList(); then ArrayList() Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(List)"})
  void testListOrderedSetWithList_whenArrayList_thenArrayListEmpty() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    ListOrderedSet<Object> actualListOrderedSetResult = ListOrderedSet.listOrderedSet(list);

    // Assert
    assertTrue(list.isEmpty());
    assertTrue(actualListOrderedSetResult.isEmpty());
  }

  /**
   * Test {@link ListOrderedSet#listOrderedSet(Set, List)} with {@code set}, {@code list}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#listOrderedSet(Set, List)}
   */
  @Test
  @DisplayName("Test listOrderedSet(Set, List) with 'set', 'list'; given two; when HashSet() add two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(Set, List)"})
  void testListOrderedSetWithSetList_givenTwo_whenHashSetAddTwo() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ListOrderedSet.listOrderedSet(set, new ArrayList<>()));
  }

  /**
   * Test {@link ListOrderedSet#listOrderedSet(Set, List)} with {@code set}, {@code list}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#listOrderedSet(Set, List)}
   */
  @Test
  @DisplayName("Test listOrderedSet(Set, List) with 'set', 'list'; when ArrayList() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(Set, List)"})
  void testListOrderedSetWithSetList_whenArrayListAdd42() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ListOrderedSet.listOrderedSet(set, list));
  }

  /**
   * Test {@link ListOrderedSet#listOrderedSet(Set, List)} with {@code set}, {@code list}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#listOrderedSet(Set, List)}
   */
  @Test
  @DisplayName("Test listOrderedSet(Set, List) with 'set', 'list'; when ArrayList() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(Set, List)"})
  void testListOrderedSetWithSetList_whenArrayListAdd422() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ListOrderedSet.listOrderedSet(set, list));
  }

  /**
   * Test {@link ListOrderedSet#listOrderedSet(Set, List)} with {@code set}, {@code list}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#listOrderedSet(Set, List)}
   */
  @Test
  @DisplayName("Test listOrderedSet(Set, List) with 'set', 'list'; when HashSet() add '42'; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(Set, List)"})
  void testListOrderedSetWithSetList_whenHashSetAdd42_thenThrowIllegalArgumentException() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ListOrderedSet.listOrderedSet(set, new ArrayList<>()));
  }

  /**
   * Test {@link ListOrderedSet#listOrderedSet(Set, List)} with {@code set}, {@code list}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#listOrderedSet(Set, List)}
   */
  @Test
  @DisplayName("Test listOrderedSet(Set, List) with 'set', 'list'; when HashSet(); then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(Set, List)"})
  void testListOrderedSetWithSetList_whenHashSet_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    // Act
    ListOrderedSet<Object> actualListOrderedSetResult = ListOrderedSet.listOrderedSet(set, new ArrayList<>());

    // Assert
    assertEquals(set, actualListOrderedSetResult);
  }

  /**
   * Test {@link ListOrderedSet#listOrderedSet(Set)} with {@code set}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#listOrderedSet(Set)}
   */
  @Test
  @DisplayName("Test listOrderedSet(Set) with 'set'; given '42'; when HashSet() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(Set)"})
  void testListOrderedSetWithSet_given42_whenHashSetAdd42() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    ListOrderedSet<Object> actualListOrderedSetResult = ListOrderedSet.listOrderedSet(set);

    // Assert
    assertEquals(set, actualListOrderedSetResult);
  }

  /**
   * Test {@link ListOrderedSet#listOrderedSet(Set)} with {@code set}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#listOrderedSet(Set)}
   */
  @Test
  @DisplayName("Test listOrderedSet(Set) with 'set'; given two; when HashSet() add two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(Set)"})
  void testListOrderedSetWithSet_givenTwo_whenHashSetAddTwo() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    ListOrderedSet<Object> actualListOrderedSetResult = ListOrderedSet.listOrderedSet(set);

    // Assert
    assertEquals(set, actualListOrderedSetResult);
  }

  /**
   * Test {@link ListOrderedSet#listOrderedSet(Set)} with {@code set}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#listOrderedSet(Set)}
   */
  @Test
  @DisplayName("Test listOrderedSet(Set) with 'set'; when HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(Set)"})
  void testListOrderedSetWithSet_whenHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    // Act
    ListOrderedSet<Object> actualListOrderedSetResult = ListOrderedSet.listOrderedSet(set);

    // Assert
    assertEquals(set, actualListOrderedSetResult);
  }

  /**
   * Test {@link ListOrderedSet#ListOrderedSet()}.
   * <p>
   * Method under test: {@link ListOrderedSet#ListOrderedSet()}
   */
  @Test
  @DisplayName("Test new ListOrderedSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ListOrderedSet.<init>()"})
  void testNewListOrderedSet() {
    // Arrange and Act
    ListOrderedSet<Object> actualObjectSet = new ListOrderedSet<>();

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test {@link ListOrderedSet#ListOrderedSet(Set)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#ListOrderedSet(Set)}
   */
  @Test
  @DisplayName("Test new ListOrderedSet(Set); given '42'; when HashSet() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ListOrderedSet.<init>(Set)"})
  void testNewListOrderedSet_given42_whenHashSetAdd42() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act and Assert
    assertEquals(set, new ListOrderedSet<>(set));
  }

  /**
   * Test {@link ListOrderedSet#ListOrderedSet(Set)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#ListOrderedSet(Set)}
   */
  @Test
  @DisplayName("Test new ListOrderedSet(Set); given two; when HashSet() add two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ListOrderedSet.<init>(Set)"})
  void testNewListOrderedSet_givenTwo_whenHashSetAddTwo() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act and Assert
    assertEquals(set, new ListOrderedSet<>(set));
  }

  /**
   * Test {@link ListOrderedSet#ListOrderedSet(Set)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#ListOrderedSet(Set)}
   */
  @Test
  @DisplayName("Test new ListOrderedSet(Set); when HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ListOrderedSet.<init>(Set)"})
  void testNewListOrderedSet_whenHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    // Act and Assert
    assertEquals(set, new ListOrderedSet<>(set));
  }

  /**
   * Test {@link ListOrderedSet#ListOrderedSet(Set, List)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#ListOrderedSet(Set, List)}
   */
  @Test
  @DisplayName("Test new ListOrderedSet(Set, List); when HashSet(); then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ListOrderedSet.<init>(Set, List)"})
  void testNewListOrderedSet_whenHashSet_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    // Act and Assert
    assertEquals(set, new ListOrderedSet<>(set, new ArrayList<>()));
  }

  /**
   * Test {@link ListOrderedSet#add(int, Object)} with {@code index}, {@code object}.
   * <ul>
   *   <li>Given {@link ListOrderedSet#ListOrderedSet()} add {@code Object}.</li>
   *   <li>Then {@link ListOrderedSet#ListOrderedSet()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#add(int, Object)}
   */
  @Test
  @DisplayName("Test add(int, Object) with 'index', 'object'; given ListOrderedSet() add 'Object'; then ListOrderedSet() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ListOrderedSet.add(int, Object)"})
  void testAddWithIndexObject_givenListOrderedSetAddObject_thenListOrderedSetSizeIsOne() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    objectSet.add("Object");

    // Act
    objectSet.add(1, "Object");

    // Assert that nothing has changed
    assertEquals(1, objectSet.size());
  }

  /**
   * Test {@link ListOrderedSet#add(int, Object)} with {@code index}, {@code object}.
   * <ul>
   *   <li>Given {@link ListOrderedSet#ListOrderedSet()} add two.</li>
   *   <li>Then {@link ListOrderedSet#ListOrderedSet()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#add(int, Object)}
   */
  @Test
  @DisplayName("Test add(int, Object) with 'index', 'object'; given ListOrderedSet() add two; then ListOrderedSet() size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ListOrderedSet.add(int, Object)"})
  void testAddWithIndexObject_givenListOrderedSetAddTwo_thenListOrderedSetSizeIsTwo() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    objectSet.add(2);

    // Act
    objectSet.add(1, "Object");

    // Assert
    assertEquals(2, objectSet.size());
  }

  /**
   * Test {@link ListOrderedSet#add(Object)} with {@code object}.
   * <ul>
   *   <li>Given {@link ListOrderedSet#ListOrderedSet()} add {@code Object}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object) with 'object'; given ListOrderedSet() add 'Object'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListOrderedSet.add(Object)"})
  void testAddWithObject_givenListOrderedSetAddObject_thenReturnFalse() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    objectSet.add("Object");

    // Act
    boolean actualAddResult = objectSet.add("Object");

    // Assert
    assertEquals(1, objectSet.size());
    assertFalse(actualAddResult);
  }

  /**
   * Test {@link ListOrderedSet#add(Object)} with {@code object}.
   * <ul>
   *   <li>Given {@link ListOrderedSet#ListOrderedSet()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object) with 'object'; given ListOrderedSet(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListOrderedSet.add(Object)"})
  void testAddWithObject_givenListOrderedSet_thenReturnTrue() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act
    boolean actualAddResult = objectSet.add("Object");

    // Assert
    assertEquals(1, objectSet.size());
    assertTrue(actualAddResult);
  }

  /**
   * Test {@link ListOrderedSet#addAll(Collection)} with {@code coll}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link ListOrderedSet#ListOrderedSet()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#addAll(Collection)}
   */
  @Test
  @DisplayName("Test addAll(Collection) with 'coll'; given '42'; when ArrayList() add '42'; then ListOrderedSet() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListOrderedSet.addAll(Collection)"})
  void testAddAllWithColl_given42_whenArrayListAdd42_thenListOrderedSetSizeIsOne() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualAddAllResult = objectSet.addAll(coll);

    // Assert
    assertEquals(1, objectSet.size());
    assertTrue(actualAddAllResult);
  }

  /**
   * Test {@link ListOrderedSet#addAll(Collection)} with {@code coll}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link ListOrderedSet#ListOrderedSet()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#addAll(Collection)}
   */
  @Test
  @DisplayName("Test addAll(Collection) with 'coll'; given '42'; when ArrayList() add '42'; then ListOrderedSet() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListOrderedSet.addAll(Collection)"})
  void testAddAllWithColl_given42_whenArrayListAdd42_thenListOrderedSetSizeIsOne2() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualAddAllResult = objectSet.addAll(coll);

    // Assert
    assertEquals(1, objectSet.size());
    assertTrue(actualAddAllResult);
  }

  /**
   * Test {@link ListOrderedSet#addAll(Collection)} with {@code coll}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#addAll(Collection)}
   */
  @Test
  @DisplayName("Test addAll(Collection) with 'coll'; when ArrayList(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListOrderedSet.addAll(Collection)"})
  void testAddAllWithColl_whenArrayList_thenReturnFalse() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertFalse(objectSet.addAll(new ArrayList<>()));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link ListOrderedSet#addAll(int, Collection)} with {@code index}, {@code coll}.
   * <ul>
   *   <li>Given {@link ListOrderedSet#ListOrderedSet()} add {@code 42}.</li>
   *   <li>Then {@link ListOrderedSet#ListOrderedSet()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#addAll(int, Collection)}
   */
  @Test
  @DisplayName("Test addAll(int, Collection) with 'index', 'coll'; given ListOrderedSet() add '42'; then ListOrderedSet() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListOrderedSet.addAll(int, Collection)"})
  void testAddAllWithIndexColl_givenListOrderedSetAdd42_thenListOrderedSetSizeIsOne() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    objectSet.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualAddAllResult = objectSet.addAll(1, coll);

    // Assert
    assertEquals(1, objectSet.size());
    assertFalse(actualAddAllResult);
  }

  /**
   * Test {@link ListOrderedSet#addAll(int, Collection)} with {@code index}, {@code coll}.
   * <ul>
   *   <li>Given {@link ListOrderedSet#ListOrderedSet()} add {@code Object}.</li>
   *   <li>Then {@link ListOrderedSet#ListOrderedSet()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#addAll(int, Collection)}
   */
  @Test
  @DisplayName("Test addAll(int, Collection) with 'index', 'coll'; given ListOrderedSet() add 'Object'; then ListOrderedSet() size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListOrderedSet.addAll(int, Collection)"})
  void testAddAllWithIndexColl_givenListOrderedSetAddObject_thenListOrderedSetSizeIsTwo() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    objectSet.add("Object");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualAddAllResult = objectSet.addAll(1, coll);

    // Assert
    assertEquals(2, objectSet.size());
    assertTrue(actualAddAllResult);
  }

  /**
   * Test {@link ListOrderedSet#addAll(int, Collection)} with {@code index}, {@code coll}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then {@link ListOrderedSet#ListOrderedSet()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#addAll(int, Collection)}
   */
  @Test
  @DisplayName("Test addAll(int, Collection) with 'index', 'coll'; when ArrayList(); then ListOrderedSet() Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListOrderedSet.addAll(int, Collection)"})
  void testAddAllWithIndexColl_whenArrayList_thenListOrderedSetEmpty() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertFalse(objectSet.addAll(1, new ArrayList<>()));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link ListOrderedSet#asList()}.
   * <p>
   * Method under test: {@link ListOrderedSet#asList()}
   */
  @Test
  @DisplayName("Test asList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ListOrderedSet.asList()"})
  void testAsList() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertTrue(objectSet.asList().isEmpty());
  }

  /**
   * Test {@link ListOrderedSet#get(int)}.
   * <ul>
   *   <li>Given {@link ListOrderedSet#ListOrderedSet()} add {@code Object}.</li>
   *   <li>When zero.</li>
   *   <li>Then return {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#get(int)}
   */
  @Test
  @DisplayName("Test get(int); given ListOrderedSet() add 'Object'; when zero; then return 'Object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ListOrderedSet.get(int)"})
  void testGet_givenListOrderedSetAddObject_whenZero_thenReturnObject() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    objectSet.add("Object");

    // Act and Assert
    assertEquals("Object", objectSet.get(0));
  }

  /**
   * Test {@link ListOrderedSet#indexOf(Object)}.
   * <p>
   * Method under test: {@link ListOrderedSet#indexOf(Object)}
   */
  @Test
  @DisplayName("Test indexOf(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ListOrderedSet.indexOf(Object)"})
  void testIndexOf() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertEquals(-1, objectSet.indexOf("Object"));
  }

  /**
   * Test {@link ListOrderedSet#iterator()}.
   * <p>
   * Method under test: {@link ListOrderedSet#iterator()}
   */
  @Test
  @DisplayName("Test iterator()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"OrderedIterator ListOrderedSet.iterator()"})
  void testIterator() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act
    OrderedIterator<Object> actualIteratorResult = objectSet.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof OrderedSetIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link ListOrderedSet#remove(int)} with {@code index}.
   * <ul>
   *   <li>Given {@link ListOrderedSet#ListOrderedSet()} add {@code Object}.</li>
   *   <li>When zero.</li>
   *   <li>Then return {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#remove(int)}
   */
  @Test
  @DisplayName("Test remove(int) with 'index'; given ListOrderedSet() add 'Object'; when zero; then return 'Object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ListOrderedSet.remove(int)"})
  void testRemoveWithIndex_givenListOrderedSetAddObject_whenZero_thenReturnObject() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    objectSet.add("Object");

    // Act and Assert
    assertEquals("Object", objectSet.remove(0));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link ListOrderedSet#remove(Object)} with {@code object}.
   * <ul>
   *   <li>Given {@link ListOrderedSet#ListOrderedSet()} add {@code Object}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object) with 'object'; given ListOrderedSet() add 'Object'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListOrderedSet.remove(Object)"})
  void testRemoveWithObject_givenListOrderedSetAddObject_thenReturnTrue() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    objectSet.add("Object");

    // Act
    boolean actualRemoveResult = objectSet.remove("Object");

    // Assert
    assertTrue(objectSet.isEmpty());
    assertTrue(actualRemoveResult);
  }

  /**
   * Test {@link ListOrderedSet#remove(Object)} with {@code object}.
   * <ul>
   *   <li>Given {@link ListOrderedSet#ListOrderedSet()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object) with 'object'; given ListOrderedSet(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListOrderedSet.remove(Object)"})
  void testRemoveWithObject_givenListOrderedSet_thenReturnFalse() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertFalse(objectSet.remove("Object"));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link ListOrderedSet#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link ListOrderedSet#ListOrderedSet()} add {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#removeAll(Collection)}
   */
  @Test
  @DisplayName("Test removeAll(Collection); given ListOrderedSet() add '42'; when ArrayList() add '42'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListOrderedSet.removeAll(Collection)"})
  void testRemoveAll_givenListOrderedSetAdd42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    objectSet.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualRemoveAllResult = objectSet.removeAll(coll);

    // Assert
    assertTrue(objectSet.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link ListOrderedSet#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link ListOrderedSet#ListOrderedSet()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#removeAll(Collection)}
   */
  @Test
  @DisplayName("Test removeAll(Collection); given ListOrderedSet(); when ArrayList() add '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListOrderedSet.removeAll(Collection)"})
  void testRemoveAll_givenListOrderedSet_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.removeAll(coll));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link ListOrderedSet#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link ListOrderedSet#ListOrderedSet()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#removeAll(Collection)}
   */
  @Test
  @DisplayName("Test removeAll(Collection); given ListOrderedSet(); when ArrayList() add '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListOrderedSet.removeAll(Collection)"})
  void testRemoveAll_givenListOrderedSet_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.removeAll(coll));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link ListOrderedSet#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link ListOrderedSet#ListOrderedSet()}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#removeAll(Collection)}
   */
  @Test
  @DisplayName("Test removeAll(Collection); given ListOrderedSet(); when ArrayList(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListOrderedSet.removeAll(Collection)"})
  void testRemoveAll_givenListOrderedSet_whenArrayList_thenReturnFalse() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertFalse(objectSet.removeAll(new ArrayList<>()));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link ListOrderedSet#removeIf(Predicate)}.
   * <ul>
   *   <li>Given {@link ListOrderedSet#ListOrderedSet()}.</li>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#removeIf(Predicate)}
   */
  @Test
  @DisplayName("Test removeIf(Predicate); given ListOrderedSet(); when Predicate; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListOrderedSet.removeIf(Predicate)"})
  void testRemoveIf_givenListOrderedSet_whenPredicate_thenReturnFalse() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertFalse(objectSet.removeIf(mock(Predicate.class)));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link ListOrderedSet#removeIf(Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#removeIf(Predicate)}
   */
  @Test
  @DisplayName("Test removeIf(Predicate); given 'true'; when Predicate test(Object) return 'true'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListOrderedSet.removeIf(Predicate)"})
  void testRemoveIf_givenTrue_whenPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    objectSet.add("Object");
    Predicate<Object> filter = mock(Predicate.class);
    when(filter.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualRemoveIfResult = objectSet.removeIf(filter);

    // Assert
    verify(filter, atLeast(1)).test(isA(Object.class));
    assertTrue(objectSet.isEmpty());
    assertTrue(actualRemoveIfResult);
  }

  /**
   * Test {@link ListOrderedSet#retainAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#retainAll(Collection)}
   */
  @Test
  @DisplayName("Test retainAll(Collection); given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListOrderedSet.retainAll(Collection)"})
  void testRetainAll_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.retainAll(coll));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link ListOrderedSet#retainAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#retainAll(Collection)}
   */
  @Test
  @DisplayName("Test retainAll(Collection); given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListOrderedSet.retainAll(Collection)"})
  void testRetainAll_given42_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.retainAll(coll));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link ListOrderedSet#retainAll(Collection)}.
   * <ul>
   *   <li>Given {@link ListOrderedSet#ListOrderedSet()} add {@code Object}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#retainAll(Collection)}
   */
  @Test
  @DisplayName("Test retainAll(Collection); given ListOrderedSet() add 'Object'; when ArrayList(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListOrderedSet.retainAll(Collection)"})
  void testRetainAll_givenListOrderedSetAddObject_whenArrayList_thenReturnTrue() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    objectSet.add("Object");

    // Act
    boolean actualRetainAllResult = objectSet.retainAll(new ArrayList<>());

    // Assert
    assertTrue(objectSet.isEmpty());
    assertTrue(actualRetainAllResult);
  }

  /**
   * Test {@link ListOrderedSet#retainAll(Collection)}.
   * <ul>
   *   <li>Given {@link ListOrderedSet#ListOrderedSet()}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#retainAll(Collection)}
   */
  @Test
  @DisplayName("Test retainAll(Collection); given ListOrderedSet(); when ArrayList(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListOrderedSet.retainAll(Collection)"})
  void testRetainAll_givenListOrderedSet_whenArrayList_thenReturnFalse() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertFalse(objectSet.retainAll(new ArrayList<>()));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link ListOrderedSet#toArray()}.
   * <p>
   * Method under test: {@link ListOrderedSet#toArray()}
   */
  @Test
  @DisplayName("Test toArray()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object[] ListOrderedSet.toArray()"})
  void testToArray() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertEquals(0, objectSet.toArray().length);
  }

  /**
   * Test {@link ListOrderedSet#toString()}.
   * <p>
   * Method under test: {@link ListOrderedSet#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String ListOrderedSet.toString()"})
  void testToString() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertEquals("[]", objectSet.toString());
  }
}
