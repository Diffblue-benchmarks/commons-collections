package org.apache.commons.collections4.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AbstractSetDecoratorDiffblueTest {
  /**
   * Method under test: {@link AbstractSetDecorator#decorated()}
   */
  @Test
  public void testDecorated() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertTrue(objectSet.decorated().isEmpty());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractSetDecorator#equals(Object)}
   *   <li>{@link AbstractSetDecorator#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    ListOrderedSet<Object> objectSet2 = new ListOrderedSet<>();

    // Act and Assert
    assertEquals(objectSet, objectSet2);
    int expectedHashCodeResult = objectSet.hashCode();
    assertEquals(expectedHashCodeResult, objectSet2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractSetDecorator#equals(Object)}
   *   <li>{@link AbstractSetDecorator#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertEquals(objectSet, objectSet);
    int expectedHashCodeResult = objectSet.hashCode();
    assertEquals(expectedHashCodeResult, objectSet.hashCode());
  }

  /**
   * Method under test: {@link AbstractSetDecorator#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    objectSet.add("Object");

    // Act and Assert
    assertNotEquals(objectSet, new ListOrderedSet<>());
  }

  /**
   * Method under test: {@link AbstractSetDecorator#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertNotEquals(objectSet, null);
  }

  /**
   * Method under test: {@link AbstractSetDecorator#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertNotEquals(objectSet, "Different type to AbstractSetDecorator");
  }
}
