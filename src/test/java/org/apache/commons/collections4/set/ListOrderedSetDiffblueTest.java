package org.apache.commons.collections4.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
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
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import org.apache.commons.collections4.OrderedIterator;
import org.apache.commons.collections4.set.ListOrderedSet.OrderedSetIterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class ListOrderedSetDiffblueTest {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(List)"})
  public void testListOrderedSetWithList_given42_whenArrayListAdd42_thenArrayListSizeIsOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(List)"})
  public void testListOrderedSetWithList_given42_whenArrayListAdd42_thenArrayListSizeIsOne2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(List)"})
  public void testListOrderedSetWithList_givenTwo_whenArrayListAddTwo_thenArrayListSizeIsTwo() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(List)"})
  public void testListOrderedSetWithList_whenArrayList_thenArrayListEmpty() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(Set, List)"})
  public void testListOrderedSetWithSetList_givenTwo_whenHashSetAddTwo() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(Set, List)"})
  public void testListOrderedSetWithSetList_whenArrayListAdd42() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(Set, List)"})
  public void testListOrderedSetWithSetList_whenArrayListAdd422() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(Set, List)"})
  public void testListOrderedSetWithSetList_whenHashSetAdd42_thenThrowIllegalArgumentException() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(Set, List)"})
  public void testListOrderedSetWithSetList_whenHashSet_thenReturnHashSet() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(Set)"})
  public void testListOrderedSetWithSet_given42_whenHashSetAdd42() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(Set)"})
  public void testListOrderedSetWithSet_givenTwo_whenHashSetAddTwo() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListOrderedSet ListOrderedSet.listOrderedSet(Set)"})
  public void testListOrderedSetWithSet_whenHashSet() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ListOrderedSet.<init>()"})
  public void testNewListOrderedSet() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ListOrderedSet.<init>(Set)"})
  public void testNewListOrderedSet_given42_whenHashSetAdd42() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ListOrderedSet.<init>(Set)"})
  public void testNewListOrderedSet_givenTwo_whenHashSetAddTwo() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ListOrderedSet.<init>(Set)"})
  public void testNewListOrderedSet_whenHashSet() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ListOrderedSet.<init>(Set, List)"})
  public void testNewListOrderedSet_whenHashSet_thenReturnHashSet() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ListOrderedSet.add(int, Object)"})
  public void testAddWithIndexObject_givenListOrderedSetAddObject_thenListOrderedSetSizeIsOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ListOrderedSet.add(int, Object)"})
  public void testAddWithIndexObject_givenListOrderedSetAddTwo_thenListOrderedSetSizeIsTwo() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListOrderedSet.add(Object)"})
  public void testAddWithObject_givenListOrderedSetAddObject_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListOrderedSet.add(Object)"})
  public void testAddWithObject_givenListOrderedSet_thenReturnTrue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListOrderedSet.addAll(Collection)"})
  public void testAddAllWithColl_given42_whenArrayListAdd42_thenListOrderedSetSizeIsOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListOrderedSet.addAll(Collection)"})
  public void testAddAllWithColl_given42_whenArrayListAdd42_thenListOrderedSetSizeIsOne2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListOrderedSet.addAll(Collection)"})
  public void testAddAllWithColl_whenArrayList_thenReturnFalse() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertFalse(objectSet.addAll(new ArrayList<>()));
    assertTrue(objectSet.isEmpty());
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListOrderedSet.addAll(int, Collection)"})
  public void testAddAllWithIndexColl_givenListOrderedSetAddObject_thenListOrderedSetSizeIsTwo() {
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
   *   <li>Given {@link ListOrderedSet#ListOrderedSet()}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedSet#addAll(int, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListOrderedSet.addAll(int, Collection)"})
  public void testAddAllWithIndexColl_givenListOrderedSet_whenArrayList_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListOrderedSet.asList()"})
  public void testAsList() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ListOrderedSet.get(int)"})
  public void testGet_givenListOrderedSetAddObject_whenZero_thenReturnObject() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ListOrderedSet.indexOf(Object)"})
  public void testIndexOf() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"OrderedIterator ListOrderedSet.iterator()"})
  public void testIterator() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ListOrderedSet.remove(int)"})
  public void testRemoveWithIndex_givenListOrderedSetAddObject_whenZero_thenReturnObject() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListOrderedSet.remove(Object)"})
  public void testRemoveWithObject_givenListOrderedSetAddObject_thenReturnTrue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListOrderedSet.remove(Object)"})
  public void testRemoveWithObject_givenListOrderedSet_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListOrderedSet.removeAll(Collection)"})
  public void testRemoveAll_givenListOrderedSetAdd42_whenArrayListAdd42_thenReturnTrue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListOrderedSet.removeAll(Collection)"})
  public void testRemoveAll_givenListOrderedSet_whenArrayListAdd42_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListOrderedSet.removeAll(Collection)"})
  public void testRemoveAll_givenListOrderedSet_whenArrayListAdd42_thenReturnFalse2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListOrderedSet.removeAll(Collection)"})
  public void testRemoveAll_givenListOrderedSet_whenArrayList_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListOrderedSet.removeIf(Predicate)"})
  public void testRemoveIf_givenListOrderedSet_whenPredicate_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListOrderedSet.removeIf(Predicate)"})
  public void testRemoveIf_givenTrue_whenPredicateTestReturnTrue_thenReturnTrue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListOrderedSet.retainAll(Collection)"})
  public void testRetainAll_given42_whenArrayListAdd42_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListOrderedSet.retainAll(Collection)"})
  public void testRetainAll_given42_whenArrayListAdd42_thenReturnFalse2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListOrderedSet.retainAll(Collection)"})
  public void testRetainAll_givenListOrderedSetAddObject_whenArrayList_thenReturnTrue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListOrderedSet.retainAll(Collection)"})
  public void testRetainAll_givenListOrderedSet_whenArrayList_thenReturnFalse() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertFalse(objectSet.retainAll(new ArrayList<>()));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link ListOrderedSet#toString()}.
   * <p>
   * Method under test: {@link ListOrderedSet#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String ListOrderedSet.toString()"})
  public void testToString() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertEquals("[]", objectSet.toString());
  }
}
