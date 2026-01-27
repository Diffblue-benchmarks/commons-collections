package org.apache.commons.collections4.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractListDecoratorDiffblueTest {
  /**
   * Test {@link AbstractListDecorator#add(int, Object)} with {@code index}, {@code object}.
   *
   * <p>Method under test: {@link AbstractListDecorator#add(int, Object)}
   */
  @Test
  @DisplayName("Test add(int, Object) with 'index', 'object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractListDecorator.add(int, Object)"})
  void testAddWithIndexObject() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act
    objectList.add(1, "Object");

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("Object", objectList.get(1));
    assertNull(objectList.get(0));
  }

  /**
   * Test {@link AbstractListDecorator#decorated()}.
   *
   * <p>Method under test: {@link AbstractListDecorator#decorated()}
   */
  @Test
  @DisplayName("Test decorated()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List AbstractListDecorator.decorated()"})
  void testDecorated() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertTrue(objectList.decorated().isEmpty());
  }

  /**
   * Test {@link AbstractListDecorator#equals(Object)}, and {@link
   * AbstractListDecorator#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AbstractListDecorator#equals(Object)}
   *   <li>{@link AbstractListDecorator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractListDecorator.equals(Object)",
    "int AbstractListDecorator.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    GrowthList<Object> objectList2 = new GrowthList<>();

    // Act and Assert
    assertEquals(objectList, objectList2);
    assertEquals(objectList.hashCode(), objectList2.hashCode());
  }

  /**
   * Test {@link AbstractListDecorator#equals(Object)}, and {@link
   * AbstractListDecorator#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AbstractListDecorator#equals(Object)}
   *   <li>{@link AbstractListDecorator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractListDecorator.equals(Object)",
    "int AbstractListDecorator.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertEquals(objectList, objectList);
    int expectedHashCodeResult = objectList.hashCode();
    assertEquals(expectedHashCodeResult, objectList.hashCode());
  }

  /**
   * Test {@link AbstractListDecorator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractListDecorator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractListDecorator.equals(Object)",
    "int AbstractListDecorator.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");

    // Act and Assert
    assertNotEquals(objectList, new GrowthList<>());
  }

  /**
   * Test {@link AbstractListDecorator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractListDecorator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractListDecorator.equals(Object)",
    "int AbstractListDecorator.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertNotEquals(objectList, null);
  }

  /**
   * Test {@link AbstractListDecorator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractListDecorator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractListDecorator.equals(Object)",
    "int AbstractListDecorator.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertNotEquals(objectList, "Different type to AbstractListDecorator");
  }

  /**
   * Test {@link AbstractListDecorator#get(int)}.
   *
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()} add {@code Object}.
   *   <li>Then return {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractListDecorator#get(int)}
   */
  @Test
  @DisplayName("Test get(int); given GrowthList() add 'Object'; then return 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractListDecorator.get(int)"})
  void testGet_givenGrowthListAddObject_thenReturnObject() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");
    objectList.add("Object");

    // Act and Assert
    assertEquals("Object", objectList.get(1));
  }

  /**
   * Test {@link AbstractListDecorator#indexOf(Object)}.
   *
   * <p>Method under test: {@link AbstractListDecorator#indexOf(Object)}
   */
  @Test
  @DisplayName("Test indexOf(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractListDecorator.indexOf(Object)"})
  void testIndexOf() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertEquals(-1, objectList.indexOf("Object"));
  }

  /**
   * Test {@link AbstractListDecorator#lastIndexOf(Object)}.
   *
   * <p>Method under test: {@link AbstractListDecorator#lastIndexOf(Object)}
   */
  @Test
  @DisplayName("Test lastIndexOf(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractListDecorator.lastIndexOf(Object)"})
  void testLastIndexOf() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertEquals(-1, objectList.lastIndexOf("Object"));
  }

  /**
   * Test {@link AbstractListDecorator#listIterator()}.
   *
   * <p>Method under test: {@link AbstractListDecorator#listIterator()}
   */
  @Test
  @DisplayName("Test listIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.ListIterator AbstractListDecorator.listIterator()"})
  void testListIterator() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertFalse(objectList.listIterator().hasNext());
  }

  /**
   * Test {@link AbstractListDecorator#listIterator(int)} with {@code int}.
   *
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()} add {@code Object}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link AbstractListDecorator#listIterator(int)}
   */
  @Test
  @DisplayName(
      "Test listIterator(int) with 'int'; given GrowthList() add 'Object'; then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.ListIterator AbstractListDecorator.listIterator(int)"})
  void testListIteratorWithInt_givenGrowthListAddObject_thenReturnNotHasNext() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");

    // Act and Assert
    assertFalse(objectList.listIterator(1).hasNext());
  }

  /**
   * Test {@link AbstractListDecorator#remove(int)} with {@code index}.
   *
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()} add {@code Object}.
   *   <li>Then {@link GrowthList#GrowthList()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link AbstractListDecorator#remove(int)}
   */
  @Test
  @DisplayName(
      "Test remove(int) with 'index'; given GrowthList() add 'Object'; then GrowthList() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractListDecorator.remove(int)"})
  void testRemoveWithIndex_givenGrowthListAddObject_thenGrowthListSizeIsOne() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");
    objectList.add("Object");

    // Act
    Object actualRemoveResult = objectList.remove(1);

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("Object", actualRemoveResult);
  }

  /**
   * Test {@link AbstractListDecorator#subList(int, int)}.
   *
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()} add {@code Object}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link AbstractListDecorator#subList(int, int)}
   */
  @Test
  @DisplayName("Test subList(int, int); given GrowthList() add 'Object'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List AbstractListDecorator.subList(int, int)"})
  void testSubList_givenGrowthListAddObject_thenReturnEmpty() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");

    // Act and Assert
    assertTrue(objectList.subList(1, 1).isEmpty());
  }
}
