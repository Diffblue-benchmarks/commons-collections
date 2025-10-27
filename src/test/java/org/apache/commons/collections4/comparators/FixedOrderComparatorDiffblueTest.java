package org.apache.commons.collections4.comparators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class FixedOrderComparatorDiffblueTest {
  /**
   * Method under test: {@link FixedOrderComparator#add(Object)}
   */
  @Test
  public void testAdd() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act and Assert
    assertTrue(fixedOrderComparator.add("Obj"));
  }

  /**
   * Method under test: {@link FixedOrderComparator#add(Object)}
   */
  @Test
  public void testAdd2() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();
    fixedOrderComparator.add("Obj");

    // Act and Assert
    assertFalse(fixedOrderComparator.add("Obj"));
  }

  /**
   * Method under test: {@link FixedOrderComparator#addAsEqual(Object, Object)}
   */
  @Test
  public void testAddAsEqual() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> fixedOrderComparator.addAsEqual("Existing Obj", "New Obj"));
  }

  /**
   * Method under test: {@link FixedOrderComparator#compare(Object, Object)}
   */
  @Test
  public void testCompare() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> fixedOrderComparator.compare("Obj1", "Obj2"));
  }

  /**
   * Method under test: {@link FixedOrderComparator#compare(Object, Object)}
   */
  @Test
  public void testCompare2() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();
    fixedOrderComparator.setUnknownObjectBehavior(FixedOrderComparator.UnknownObjectBehavior.BEFORE);

    // Act and Assert
    assertEquals(0, fixedOrderComparator.compare("Obj1", "Obj2"));
    assertTrue(fixedOrderComparator.isLocked());
  }

  /**
   * Method under test: {@link FixedOrderComparator#compare(Object, Object)}
   */
  @Test
  public void testCompare3() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();
    fixedOrderComparator.setUnknownObjectBehavior(FixedOrderComparator.UnknownObjectBehavior.AFTER);

    // Act and Assert
    assertEquals(0, fixedOrderComparator.compare("Obj1", "Obj2"));
    assertTrue(fixedOrderComparator.isLocked());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link FixedOrderComparator#equals(Object)}
   *   <li>{@link FixedOrderComparator#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();
    FixedOrderComparator<Object> fixedOrderComparator2 = new FixedOrderComparator<>();

    // Act and Assert
    assertEquals(fixedOrderComparator, fixedOrderComparator2);
    int expectedHashCodeResult = fixedOrderComparator.hashCode();
    assertEquals(expectedHashCodeResult, fixedOrderComparator2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link FixedOrderComparator#equals(Object)}
   *   <li>{@link FixedOrderComparator#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>(new FixedOrderComparator<>());

    FixedOrderComparator<Object> fixedOrderComparator2 = new FixedOrderComparator<>();
    fixedOrderComparator2.add(new FixedOrderComparator<>());

    // Act and Assert
    assertEquals(fixedOrderComparator, fixedOrderComparator2);
    int expectedHashCodeResult = fixedOrderComparator.hashCode();
    assertEquals(expectedHashCodeResult, fixedOrderComparator2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link FixedOrderComparator#equals(Object)}
   *   <li>{@link FixedOrderComparator#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act and Assert
    assertEquals(fixedOrderComparator, fixedOrderComparator);
    int expectedHashCodeResult = fixedOrderComparator.hashCode();
    assertEquals(expectedHashCodeResult, fixedOrderComparator.hashCode());
  }

  /**
   * Method under test:
   * {@link FixedOrderComparator#setUnknownObjectBehavior(FixedOrderComparator.UnknownObjectBehavior)}
   */
  @Test
  public void testSetUnknownObjectBehavior() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act
    fixedOrderComparator.setUnknownObjectBehavior(FixedOrderComparator.UnknownObjectBehavior.BEFORE);

    // Assert
    assertEquals(FixedOrderComparator.UnknownObjectBehavior.BEFORE, fixedOrderComparator.getUnknownObjectBehavior());
  }

  /**
   * Method under test: {@link FixedOrderComparator#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>("Items");

    // Act and Assert
    assertNotEquals(fixedOrderComparator, new FixedOrderComparator<>());
  }

  /**
   * Method under test: {@link FixedOrderComparator#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();
    fixedOrderComparator.setUnknownObjectBehavior(FixedOrderComparator.UnknownObjectBehavior.BEFORE);

    // Act and Assert
    assertNotEquals(fixedOrderComparator, new FixedOrderComparator<>());
  }

  /**
   * Method under test: {@link FixedOrderComparator#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>("Items");

    FixedOrderComparator<Object> fixedOrderComparator2 = new FixedOrderComparator<>();
    fixedOrderComparator2.add("Obj");

    // Act and Assert
    assertNotEquals(fixedOrderComparator, fixedOrderComparator2);
  }

  /**
   * Method under test: {@link FixedOrderComparator#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>(new FixedOrderComparator<>());

    FixedOrderComparator<Object> fixedOrderComparator2 = new FixedOrderComparator<>();
    fixedOrderComparator2.add("Obj");

    // Act and Assert
    assertNotEquals(fixedOrderComparator, fixedOrderComparator2);
  }

  /**
   * Method under test: {@link FixedOrderComparator#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act and Assert
    assertNotEquals(fixedOrderComparator, null);
  }

  /**
   * Method under test: {@link FixedOrderComparator#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act and Assert
    assertNotEquals(fixedOrderComparator, "Different type to FixedOrderComparator");
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link FixedOrderComparator#getUnknownObjectBehavior()}
   *   <li>{@link FixedOrderComparator#isLocked()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act
    FixedOrderComparator.UnknownObjectBehavior actualUnknownObjectBehavior = fixedOrderComparator
        .getUnknownObjectBehavior();

    // Assert
    assertEquals(FixedOrderComparator.UnknownObjectBehavior.EXCEPTION, actualUnknownObjectBehavior);
    assertFalse(fixedOrderComparator.isLocked());
  }

  /**
   * Method under test: {@link FixedOrderComparator#FixedOrderComparator()}
   */
  @Test
  public void testNewFixedOrderComparator() {
    // Arrange and Act
    FixedOrderComparator<Object> actualFixedOrderComparator = new FixedOrderComparator<>();

    // Assert
    assertEquals(FixedOrderComparator.UnknownObjectBehavior.EXCEPTION,
        actualFixedOrderComparator.getUnknownObjectBehavior());
    assertFalse(actualFixedOrderComparator.isLocked());
  }

  /**
   * Method under test: {@link FixedOrderComparator#FixedOrderComparator(List)}
   */
  @Test
  public void testNewFixedOrderComparator2() {
    // Arrange and Act
    FixedOrderComparator<Object> actualFixedOrderComparator = new FixedOrderComparator<>(new ArrayList<>());

    // Assert
    assertEquals(FixedOrderComparator.UnknownObjectBehavior.EXCEPTION,
        actualFixedOrderComparator.getUnknownObjectBehavior());
    assertFalse(actualFixedOrderComparator.isLocked());
  }

  /**
   * Method under test: {@link FixedOrderComparator#FixedOrderComparator(List)}
   */
  @Test
  public void testNewFixedOrderComparator3() {
    // Arrange
    ArrayList<Object> items = new ArrayList<>();
    items.add("42");

    // Act
    FixedOrderComparator<Object> actualFixedOrderComparator = new FixedOrderComparator<>(items);

    // Assert
    assertEquals(FixedOrderComparator.UnknownObjectBehavior.EXCEPTION,
        actualFixedOrderComparator.getUnknownObjectBehavior());
    assertFalse(actualFixedOrderComparator.isLocked());
  }

  /**
   * Method under test: {@link FixedOrderComparator#FixedOrderComparator(List)}
   */
  @Test
  public void testNewFixedOrderComparator4() {
    // Arrange
    ArrayList<Object> items = new ArrayList<>();
    items.add("42");
    items.add("42");

    // Act
    FixedOrderComparator<Object> actualFixedOrderComparator = new FixedOrderComparator<>(items);

    // Assert
    assertEquals(FixedOrderComparator.UnknownObjectBehavior.EXCEPTION,
        actualFixedOrderComparator.getUnknownObjectBehavior());
    assertFalse(actualFixedOrderComparator.isLocked());
  }

  /**
   * Method under test:
   * {@link FixedOrderComparator#FixedOrderComparator(Object[])}
   */
  @Test
  public void testNewFixedOrderComparator5() {
    // Arrange and Act
    FixedOrderComparator<Object> actualFixedOrderComparator = new FixedOrderComparator<>("Items");

    // Assert
    assertEquals(FixedOrderComparator.UnknownObjectBehavior.EXCEPTION,
        actualFixedOrderComparator.getUnknownObjectBehavior());
    assertFalse(actualFixedOrderComparator.isLocked());
  }

  /**
   * Method under test:
   * {@link FixedOrderComparator#FixedOrderComparator(Object[])}
   */
  @Test
  public void testNewFixedOrderComparator6() {
    // Arrange and Act
    FixedOrderComparator<Object> actualFixedOrderComparator = new FixedOrderComparator<>("Items", "Items");

    // Assert
    assertEquals(FixedOrderComparator.UnknownObjectBehavior.EXCEPTION,
        actualFixedOrderComparator.getUnknownObjectBehavior());
    assertFalse(actualFixedOrderComparator.isLocked());
  }
}
