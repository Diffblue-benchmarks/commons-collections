package org.apache.commons.collections4.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GrowthListDiffblueTest {
  /**
   * Test {@link GrowthList#growthList(List)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link GrowthList#growthList(List)}
   */
  @Test
  @DisplayName("Test growthList(List); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"GrowthList GrowthList.growthList(List)"})
  void testGrowthList_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    GrowthList<Object> actualGrowthListResult = GrowthList.growthList(list);

    // Assert
    assertEquals(list, actualGrowthListResult);
  }

  /**
   * Test {@link GrowthList#growthList(List)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link GrowthList#growthList(List)}
   */
  @Test
  @DisplayName("Test growthList(List); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"GrowthList GrowthList.growthList(List)"})
  void testGrowthList_given42_whenArrayListAdd422() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    GrowthList<Object> actualGrowthListResult = GrowthList.growthList(list);

    // Assert
    assertEquals(list, actualGrowthListResult);
  }

  /**
   * Test {@link GrowthList#growthList(List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link GrowthList#growthList(List)}
   */
  @Test
  @DisplayName("Test growthList(List); when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"GrowthList GrowthList.growthList(List)"})
  void testGrowthList_whenArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    GrowthList<Object> actualGrowthListResult = GrowthList.growthList(list);

    // Assert
    assertEquals(list, actualGrowthListResult);
  }

  /**
   * Test {@link GrowthList#GrowthList()}.
   *
   * <p>Method under test: {@link GrowthList#GrowthList()}
   */
  @Test
  @DisplayName("Test new GrowthList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GrowthList.<init>()"})
  void testNewGrowthList() {
    // Arrange and Act
    GrowthList<Object> actualObjectList = new GrowthList<>();

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Test {@link GrowthList#GrowthList(int)}.
   *
   * <p>Method under test: {@link GrowthList#GrowthList(int)}
   */
  @Test
  @DisplayName("Test new GrowthList(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GrowthList.<init>(int)"})
  void testNewGrowthList2() {
    // Arrange and Act
    GrowthList<Object> actualObjectList = new GrowthList<>(1);

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Test {@link GrowthList#GrowthList(List)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link GrowthList#GrowthList(List)}
   */
  @Test
  @DisplayName("Test new GrowthList(List); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GrowthList.<init>(List)"})
  void testNewGrowthList_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    GrowthList<Object> actualObjectList = new GrowthList<>(list);

    // Assert
    assertEquals(list, actualObjectList);
  }

  /**
   * Test {@link GrowthList#GrowthList(List)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link GrowthList#GrowthList(List)}
   */
  @Test
  @DisplayName("Test new GrowthList(List); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GrowthList.<init>(List)"})
  void testNewGrowthList_given42_whenArrayListAdd422() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    GrowthList<Object> actualObjectList = new GrowthList<>(list);

    // Assert
    assertEquals(list, actualObjectList);
  }

  /**
   * Test {@link GrowthList#GrowthList(List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link GrowthList#GrowthList(List)}
   */
  @Test
  @DisplayName("Test new GrowthList(List); when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GrowthList.<init>(List)"})
  void testNewGrowthList_whenArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    GrowthList<Object> actualObjectList = new GrowthList<>(list);

    // Assert
    assertEquals(list, actualObjectList);
  }

  /**
   * Test {@link GrowthList#add(int, Object)} with {@code index}, {@code element}.
   *
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()} add {@code Object}.
   *   <li>Then {@link GrowthList#GrowthList()} first is {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link GrowthList#add(int, Object)}
   */
  @Test
  @DisplayName(
      "Test add(int, Object) with 'index', 'element'; given GrowthList() add 'Object'; then GrowthList() first is 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GrowthList.add(int, Object)"})
  void testAddWithIndexElement_givenGrowthListAddObject_thenGrowthListFirstIsObject() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");

    // Act
    objectList.add(1, "Element");

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("Element", objectList.get(1));
    assertEquals("Object", objectList.get(0));
  }

  /**
   * Test {@link GrowthList#add(int, Object)} with {@code index}, {@code element}.
   *
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()}.
   *   <li>When one.
   *   <li>Then {@link GrowthList#GrowthList()} first is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link GrowthList#add(int, Object)}
   */
  @Test
  @DisplayName(
      "Test add(int, Object) with 'index', 'element'; given GrowthList(); when one; then GrowthList() first is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GrowthList.add(int, Object)"})
  void testAddWithIndexElement_givenGrowthList_whenOne_thenGrowthListFirstIsNull() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act
    objectList.add(1, "Element");

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("Element", objectList.get(1));
    assertNull(objectList.get(0));
  }

  /**
   * Test {@link GrowthList#addAll(int, Collection)} with {@code index}, {@code coll}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then {@link GrowthList#GrowthList()} size is three.
   * </ul>
   *
   * <p>Method under test: {@link GrowthList#addAll(int, Collection)}
   */
  @Test
  @DisplayName(
      "Test addAll(int, Collection) with 'index', 'coll'; given '42'; when ArrayList() add '42'; then GrowthList() size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean GrowthList.addAll(int, Collection)"})
  void testAddAllWithIndexColl_given42_whenArrayListAdd42_thenGrowthListSizeIsThree() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    objectList.addAll(1, coll);

    // Assert
    assertEquals(3, objectList.size());
    assertEquals("42", objectList.get(1));
    assertEquals("42", objectList.get(2));
  }

  /**
   * Test {@link GrowthList#addAll(int, Collection)} with {@code index}, {@code coll}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then {@link GrowthList#GrowthList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link GrowthList#addAll(int, Collection)}
   */
  @Test
  @DisplayName(
      "Test addAll(int, Collection) with 'index', 'coll'; given '42'; when ArrayList() add '42'; then GrowthList() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean GrowthList.addAll(int, Collection)"})
  void testAddAllWithIndexColl_given42_whenArrayListAdd42_thenGrowthListSizeIsTwo() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualAddAllResult = objectList.addAll(1, coll);

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("42", objectList.get(1));
    assertNull(objectList.get(0));
    assertTrue(actualAddAllResult);
  }

  /**
   * Test {@link GrowthList#addAll(int, Collection)} with {@code index}, {@code coll}.
   *
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()} add {@code Object}.
   *   <li>Then {@link GrowthList#GrowthList()} first is {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link GrowthList#addAll(int, Collection)}
   */
  @Test
  @DisplayName(
      "Test addAll(int, Collection) with 'index', 'coll'; given GrowthList() add 'Object'; then GrowthList() first is 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean GrowthList.addAll(int, Collection)"})
  void testAddAllWithIndexColl_givenGrowthListAddObject_thenGrowthListFirstIsObject() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");

    // Act
    boolean actualAddAllResult = objectList.addAll(1, new ArrayList<>());

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("Object", objectList.get(0));
    assertFalse(actualAddAllResult);
  }

  /**
   * Test {@link GrowthList#addAll(int, Collection)} with {@code index}, {@code coll}.
   *
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then {@link GrowthList#GrowthList()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link GrowthList#addAll(int, Collection)}
   */
  @Test
  @DisplayName(
      "Test addAll(int, Collection) with 'index', 'coll'; given GrowthList(); when ArrayList(); then GrowthList() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean GrowthList.addAll(int, Collection)"})
  void testAddAllWithIndexColl_givenGrowthList_whenArrayList_thenGrowthListSizeIsOne() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act
    boolean actualAddAllResult = objectList.addAll(1, new ArrayList<>());

    // Assert
    assertEquals(1, objectList.size());
    assertNull(objectList.get(0));
    assertTrue(actualAddAllResult);
  }

  /**
   * Test {@link GrowthList#set(int, Object)}.
   *
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()} add {@code Object}.
   *   <li>When one.
   *   <li>Then {@link GrowthList#GrowthList()} first is {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link GrowthList#set(int, Object)}
   */
  @Test
  @DisplayName(
      "Test set(int, Object); given GrowthList() add 'Object'; when one; then GrowthList() first is 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object GrowthList.set(int, Object)"})
  void testSet_givenGrowthListAddObject_whenOne_thenGrowthListFirstIsObject() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");
    objectList.add("Object");

    // Act
    Object actualSetResult = objectList.set(1, "Element");

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("Object", objectList.get(0));
    assertEquals("Object", actualSetResult);
  }

  /**
   * Test {@link GrowthList#set(int, Object)}.
   *
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()}.
   *   <li>When one.
   *   <li>Then {@link GrowthList#GrowthList()} first is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link GrowthList#set(int, Object)}
   */
  @Test
  @DisplayName(
      "Test set(int, Object); given GrowthList(); when one; then GrowthList() first is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object GrowthList.set(int, Object)"})
  void testSet_givenGrowthList_whenOne_thenGrowthListFirstIsNull() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act
    Object actualSetResult = objectList.set(1, "Element");

    // Assert
    assertEquals(2, objectList.size());
    assertNull(objectList.get(0));
    assertNull(actualSetResult);
  }
}
