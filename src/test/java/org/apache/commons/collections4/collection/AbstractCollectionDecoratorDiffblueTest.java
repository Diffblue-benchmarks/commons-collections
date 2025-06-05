package org.apache.commons.collections4.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;
import org.apache.commons.collections4.list.GrowthList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AbstractCollectionDecoratorDiffblueTest {
  /**
   * Test {@link AbstractCollectionDecorator#add(Object)}.
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractCollectionDecorator.add(Object)"})
  void testAdd() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act
    boolean actualAddResult = objectList.add("Object");

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("Object", objectList.get(0));
    assertTrue(actualAddResult);
  }

  /**
   * Test {@link AbstractCollectionDecorator#addAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link GrowthList#GrowthList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#addAll(Collection)}
   */
  @Test
  @DisplayName("Test addAll(Collection); given '42'; when ArrayList() add '42'; then GrowthList() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractCollectionDecorator.addAll(Collection)"})
  void testAddAll_given42_whenArrayListAdd42_thenGrowthListSizeIsOne() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualAddAllResult = objectList.addAll(coll);

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("42", objectList.get(0));
    assertTrue(actualAddAllResult);
    assertEquals(objectList, coll);
  }

  /**
   * Test {@link AbstractCollectionDecorator#addAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link GrowthList#GrowthList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#addAll(Collection)}
   */
  @Test
  @DisplayName("Test addAll(Collection); given '42'; when ArrayList() add '42'; then GrowthList() size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractCollectionDecorator.addAll(Collection)"})
  void testAddAll_given42_whenArrayListAdd42_thenGrowthListSizeIsTwo() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualAddAllResult = objectList.addAll(coll);

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("42", objectList.get(1));
    assertTrue(actualAddAllResult);
    assertEquals(objectList, coll);
  }

  /**
   * Test {@link AbstractCollectionDecorator#addAll(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#addAll(Collection)}
   */
  @Test
  @DisplayName("Test addAll(Collection); when ArrayList(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractCollectionDecorator.addAll(Collection)"})
  void testAddAll_whenArrayList_thenReturnFalse() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    ArrayList<Object> coll = new ArrayList<>();

    // Act and Assert
    assertFalse(objectList.addAll(coll));
    assertTrue(objectList.isEmpty());
    assertEquals(objectList, coll);
  }

  /**
   * Test {@link AbstractCollectionDecorator#contains(Object)}.
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()} add {@code Object}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#contains(Object)}
   */
  @Test
  @DisplayName("Test contains(Object); given GrowthList() add 'Object'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractCollectionDecorator.contains(Object)"})
  void testContains_givenGrowthListAddObject_thenReturnTrue() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");

    // Act and Assert
    assertTrue(objectList.contains("Object"));
  }

  /**
   * Test {@link AbstractCollectionDecorator#contains(Object)}.
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#contains(Object)}
   */
  @Test
  @DisplayName("Test contains(Object); given GrowthList(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractCollectionDecorator.contains(Object)"})
  void testContains_givenGrowthList_thenReturnFalse() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertFalse(objectList.contains("Object"));
  }

  /**
   * Test {@link AbstractCollectionDecorator#containsAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#containsAll(Collection)}
   */
  @Test
  @DisplayName("Test containsAll(Collection); given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractCollectionDecorator.containsAll(Collection)"})
  void testContainsAll_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(objectList.containsAll(coll));
  }

  /**
   * Test {@link AbstractCollectionDecorator#containsAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#containsAll(Collection)}
   */
  @Test
  @DisplayName("Test containsAll(Collection); given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractCollectionDecorator.containsAll(Collection)"})
  void testContainsAll_given42_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(objectList.containsAll(coll));
  }

  /**
   * Test {@link AbstractCollectionDecorator#containsAll(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#containsAll(Collection)}
   */
  @Test
  @DisplayName("Test containsAll(Collection); when ArrayList(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractCollectionDecorator.containsAll(Collection)"})
  void testContainsAll_whenArrayList_thenReturnTrue() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertTrue(objectList.containsAll(new ArrayList<>()));
  }

  /**
   * Test {@link AbstractCollectionDecorator#decorated()}.
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#decorated()}
   */
  @Test
  @DisplayName("Test decorated()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Collection AbstractCollectionDecorator.decorated()"})
  void testDecorated() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertEquals(objectList, ((AbstractCollectionDecorator<Object>) objectList).decorated());
  }

  /**
   * Test {@link AbstractCollectionDecorator#isEmpty()}.
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()} add {@code Object}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given GrowthList() add 'Object'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractCollectionDecorator.isEmpty()"})
  void testIsEmpty_givenGrowthListAddObject_thenReturnFalse() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");

    // Act and Assert
    assertFalse(objectList.isEmpty());
  }

  /**
   * Test {@link AbstractCollectionDecorator#isEmpty()}.
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given GrowthList(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractCollectionDecorator.isEmpty()"})
  void testIsEmpty_givenGrowthList_thenReturnTrue() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link AbstractCollectionDecorator#iterator()}.
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#iterator()}
   */
  @Test
  @DisplayName("Test iterator()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Iterator AbstractCollectionDecorator.iterator()"})
  void testIterator() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertFalse(objectList.iterator().hasNext());
  }

  /**
   * Test {@link AbstractCollectionDecorator#remove(Object)}.
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()} add {@code Object}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object); given GrowthList() add 'Object'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractCollectionDecorator.remove(Object)"})
  void testRemove_givenGrowthListAddObject_thenReturnTrue() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");

    // Act
    boolean actualRemoveResult = objectList.remove("Object");

    // Assert
    assertTrue(objectList.isEmpty());
    assertTrue(actualRemoveResult);
  }

  /**
   * Test {@link AbstractCollectionDecorator#remove(Object)}.
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object); given GrowthList(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractCollectionDecorator.remove(Object)"})
  void testRemove_givenGrowthList_thenReturnFalse() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertFalse(objectList.remove("Object"));
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link AbstractCollectionDecorator#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()} add {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#removeAll(Collection)}
   */
  @Test
  @DisplayName("Test removeAll(Collection); given GrowthList() add '42'; when ArrayList() add '42'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractCollectionDecorator.removeAll(Collection)"})
  void testRemoveAll_givenGrowthListAdd42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualRemoveAllResult = objectList.removeAll(coll);

    // Assert
    assertTrue(objectList.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link AbstractCollectionDecorator#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#removeAll(Collection)}
   */
  @Test
  @DisplayName("Test removeAll(Collection); given GrowthList(); when ArrayList() add '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractCollectionDecorator.removeAll(Collection)"})
  void testRemoveAll_givenGrowthList_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(objectList.removeAll(coll));
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link AbstractCollectionDecorator#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#removeAll(Collection)}
   */
  @Test
  @DisplayName("Test removeAll(Collection); given GrowthList(); when ArrayList() add '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractCollectionDecorator.removeAll(Collection)"})
  void testRemoveAll_givenGrowthList_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(objectList.removeAll(coll));
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link AbstractCollectionDecorator#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#removeAll(Collection)}
   */
  @Test
  @DisplayName("Test removeAll(Collection); given GrowthList(); when ArrayList(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractCollectionDecorator.removeAll(Collection)"})
  void testRemoveAll_givenGrowthList_whenArrayList_thenReturnFalse() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertFalse(objectList.removeAll(new ArrayList<>()));
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link AbstractCollectionDecorator#removeIf(Predicate)}.
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()} add {@code Object}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#removeIf(Predicate)}
   */
  @Test
  @DisplayName("Test removeIf(Predicate); given GrowthList() add 'Object'; when Predicate test(Object) return 'true'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractCollectionDecorator.removeIf(Predicate)"})
  void testRemoveIf_givenGrowthListAddObject_whenPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");
    Predicate<Object> filter = mock(Predicate.class);
    when(filter.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualRemoveIfResult = objectList.removeIf(filter);

    // Assert
    verify(filter).test(isA(Object.class));
    assertTrue(objectList.isEmpty());
    assertTrue(actualRemoveIfResult);
  }

  /**
   * Test {@link AbstractCollectionDecorator#removeIf(Predicate)}.
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()}.</li>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#removeIf(Predicate)}
   */
  @Test
  @DisplayName("Test removeIf(Predicate); given GrowthList(); when Predicate; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractCollectionDecorator.removeIf(Predicate)"})
  void testRemoveIf_givenGrowthList_whenPredicate_thenReturnFalse() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertFalse(objectList.removeIf(mock(Predicate.class)));
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link AbstractCollectionDecorator#retainAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#retainAll(Collection)}
   */
  @Test
  @DisplayName("Test retainAll(Collection); given '42'; when ArrayList() add '42'; then ArrayList() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractCollectionDecorator.retainAll(Collection)"})
  void testRetainAll_given42_whenArrayListAdd42_thenArrayListSizeIsOne() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualRetainAllResult = objectList.retainAll(coll);

    // Assert
    assertEquals(1, coll.size());
    assertFalse(actualRetainAllResult);
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link AbstractCollectionDecorator#retainAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#retainAll(Collection)}
   */
  @Test
  @DisplayName("Test retainAll(Collection); given '42'; when ArrayList() add '42'; then ArrayList() size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractCollectionDecorator.retainAll(Collection)"})
  void testRetainAll_given42_whenArrayListAdd42_thenArrayListSizeIsTwo() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualRetainAllResult = objectList.retainAll(coll);

    // Assert
    assertEquals(2, coll.size());
    assertFalse(actualRetainAllResult);
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link AbstractCollectionDecorator#retainAll(Collection)}.
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()} add {@code Object}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#retainAll(Collection)}
   */
  @Test
  @DisplayName("Test retainAll(Collection); given GrowthList() add 'Object'; when ArrayList(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractCollectionDecorator.retainAll(Collection)"})
  void testRetainAll_givenGrowthListAddObject_whenArrayList_thenReturnTrue() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");
    ArrayList<Object> coll = new ArrayList<>();

    // Act
    boolean actualRetainAllResult = objectList.retainAll(coll);

    // Assert
    assertTrue(objectList.isEmpty());
    assertTrue(actualRetainAllResult);
    assertEquals(objectList, coll);
  }

  /**
   * Test {@link AbstractCollectionDecorator#retainAll(Collection)}.
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} is {@link GrowthList#GrowthList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#retainAll(Collection)}
   */
  @Test
  @DisplayName("Test retainAll(Collection); given GrowthList(); when ArrayList(); then ArrayList() is GrowthList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractCollectionDecorator.retainAll(Collection)"})
  void testRetainAll_givenGrowthList_whenArrayList_thenArrayListIsGrowthList() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    ArrayList<Object> coll = new ArrayList<>();

    // Act and Assert
    assertFalse(objectList.retainAll(coll));
    assertTrue(objectList.isEmpty());
    assertEquals(objectList, coll);
  }

  /**
   * Test {@link AbstractCollectionDecorator#setCollection(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link GrowthList#GrowthList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#setCollection(Collection)}
   */
  @Test
  @DisplayName("Test setCollection(Collection); given '42'; when ArrayList() add '42'; then GrowthList() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractCollectionDecorator.setCollection(Collection)"})
  void testSetCollection_given42_whenArrayListAdd42_thenGrowthListSizeIsOne() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    objectList.setCollection(collection);

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals(objectList, collection);
  }

  /**
   * Test {@link AbstractCollectionDecorator#setCollection(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link GrowthList#GrowthList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#setCollection(Collection)}
   */
  @Test
  @DisplayName("Test setCollection(Collection); given '42'; when ArrayList() add '42'; then GrowthList() size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractCollectionDecorator.setCollection(Collection)"})
  void testSetCollection_given42_whenArrayListAdd42_thenGrowthListSizeIsTwo() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    objectList.setCollection(collection);

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("42", objectList.get(1));
    assertEquals(objectList, collection);
  }

  /**
   * Test {@link AbstractCollectionDecorator#setCollection(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then {@link GrowthList#GrowthList()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#setCollection(Collection)}
   */
  @Test
  @DisplayName("Test setCollection(Collection); when ArrayList(); then GrowthList() Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractCollectionDecorator.setCollection(Collection)"})
  void testSetCollection_whenArrayList_thenGrowthListEmpty() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    ArrayList<Object> collection = new ArrayList<>();

    // Act
    objectList.setCollection(collection);

    // Assert that nothing has changed
    assertTrue(objectList.isEmpty());
    assertEquals(objectList, collection);
  }

  /**
   * Test {@link AbstractCollectionDecorator#size()}.
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractCollectionDecorator.size()"})
  void testSize() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertEquals(0, objectList.size());
  }

  /**
   * Test {@link AbstractCollectionDecorator#toArray()}.
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#toArray()}
   */
  @Test
  @DisplayName("Test toArray()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object[] AbstractCollectionDecorator.toArray()"})
  void testToArray() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertEquals(0, objectList.toArray().length);
  }

  /**
   * Test {@link AbstractCollectionDecorator#toString()}.
   * <p>
   * Method under test: {@link AbstractCollectionDecorator#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String AbstractCollectionDecorator.toString()"})
  void testToString() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertEquals("[]", objectList.toString());
  }
}
