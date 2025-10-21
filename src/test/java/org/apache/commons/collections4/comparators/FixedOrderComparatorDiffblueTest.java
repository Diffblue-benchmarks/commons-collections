package org.apache.commons.collections4.comparators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections4.comparators.FixedOrderComparator.UnknownObjectBehavior;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class FixedOrderComparatorDiffblueTest {
  /**
   * Test {@link FixedOrderComparator#FixedOrderComparator()}.
   * <p>
   * Method under test: {@link FixedOrderComparator#FixedOrderComparator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void FixedOrderComparator.<init>()"})
  public void testNewFixedOrderComparator() {
    // Arrange and Act
    FixedOrderComparator<Object> actualFixedOrderComparator = new FixedOrderComparator<>();

    // Assert
    assertEquals(UnknownObjectBehavior.EXCEPTION, actualFixedOrderComparator.getUnknownObjectBehavior());
    assertFalse(actualFixedOrderComparator.isLocked());
  }

  /**
   * Test {@link FixedOrderComparator#FixedOrderComparator(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FixedOrderComparator#FixedOrderComparator(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void FixedOrderComparator.<init>(List)"})
  public void testNewFixedOrderComparator_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> items = new ArrayList<>();
    items.add("42");

    // Act
    FixedOrderComparator<Object> actualFixedOrderComparator = new FixedOrderComparator<>(items);

    // Assert
    assertEquals(UnknownObjectBehavior.EXCEPTION, actualFixedOrderComparator.getUnknownObjectBehavior());
    assertFalse(actualFixedOrderComparator.isLocked());
  }

  /**
   * Test {@link FixedOrderComparator#FixedOrderComparator(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FixedOrderComparator#FixedOrderComparator(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void FixedOrderComparator.<init>(List)"})
  public void testNewFixedOrderComparator_given42_whenArrayListAdd422() {
    // Arrange
    ArrayList<Object> items = new ArrayList<>();
    items.add("42");
    items.add("42");

    // Act
    FixedOrderComparator<Object> actualFixedOrderComparator = new FixedOrderComparator<>(items);

    // Assert
    assertEquals(UnknownObjectBehavior.EXCEPTION, actualFixedOrderComparator.getUnknownObjectBehavior());
    assertFalse(actualFixedOrderComparator.isLocked());
  }

  /**
   * Test {@link FixedOrderComparator#FixedOrderComparator(List)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FixedOrderComparator#FixedOrderComparator(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void FixedOrderComparator.<init>(List)"})
  public void testNewFixedOrderComparator_whenArrayList() {
    // Arrange and Act
    FixedOrderComparator<Object> actualFixedOrderComparator = new FixedOrderComparator<>(new ArrayList<>());

    // Assert
    assertEquals(UnknownObjectBehavior.EXCEPTION, actualFixedOrderComparator.getUnknownObjectBehavior());
    assertFalse(actualFixedOrderComparator.isLocked());
  }

  /**
   * Test {@link FixedOrderComparator#FixedOrderComparator(Object[])}.
   * <ul>
   *   <li>When {@code Items} and {@code Items}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FixedOrderComparator#FixedOrderComparator(Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void FixedOrderComparator.<init>(Object[])"})
  public void testNewFixedOrderComparator_whenItemsAndItems() {
    // Arrange and Act
    FixedOrderComparator<Object> actualFixedOrderComparator = new FixedOrderComparator<>("Items", "Items");

    // Assert
    assertEquals(UnknownObjectBehavior.EXCEPTION, actualFixedOrderComparator.getUnknownObjectBehavior());
    assertFalse(actualFixedOrderComparator.isLocked());
  }

  /**
   * Test {@link FixedOrderComparator#FixedOrderComparator(Object[])}.
   * <ul>
   *   <li>When {@code Items}.</li>
   *   <li>Then return UnknownObjectBehavior is {@code EXCEPTION}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FixedOrderComparator#FixedOrderComparator(Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void FixedOrderComparator.<init>(Object[])"})
  public void testNewFixedOrderComparator_whenItems_thenReturnUnknownObjectBehaviorIsException() {
    // Arrange and Act
    FixedOrderComparator<Object> actualFixedOrderComparator = new FixedOrderComparator<>("Items");

    // Assert
    assertEquals(UnknownObjectBehavior.EXCEPTION, actualFixedOrderComparator.getUnknownObjectBehavior());
    assertFalse(actualFixedOrderComparator.isLocked());
  }

  /**
   * Test {@link FixedOrderComparator#add(Object)}.
   * <ul>
   *   <li>Given {@link FixedOrderComparator#FixedOrderComparator()} add {@code Obj}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FixedOrderComparator#add(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FixedOrderComparator.add(Object)"})
  public void testAdd_givenFixedOrderComparatorAddObj_thenReturnFalse() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();
    fixedOrderComparator.add("Obj");

    // Act and Assert
    assertFalse(fixedOrderComparator.add("Obj"));
  }

  /**
   * Test {@link FixedOrderComparator#add(Object)}.
   * <ul>
   *   <li>Given {@link FixedOrderComparator#FixedOrderComparator()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FixedOrderComparator#add(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FixedOrderComparator.add(Object)"})
  public void testAdd_givenFixedOrderComparator_thenReturnTrue() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act and Assert
    assertTrue(fixedOrderComparator.add("Obj"));
  }

  /**
   * Test {@link FixedOrderComparator#addAsEqual(Object, Object)}.
   * <p>
   * Method under test: {@link FixedOrderComparator#addAsEqual(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FixedOrderComparator.addAsEqual(Object, Object)"})
  public void testAddAsEqual() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> fixedOrderComparator.addAsEqual("Existing Obj", "New Obj"));
  }

  /**
   * Test {@link FixedOrderComparator#compare(Object, Object)}.
   * <ul>
   *   <li>Given {@link FixedOrderComparator#FixedOrderComparator()} UnknownObjectBehavior is {@code AFTER}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link FixedOrderComparator#compare(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int FixedOrderComparator.compare(Object, Object)"})
  public void testCompare_givenFixedOrderComparatorUnknownObjectBehaviorIsAfter_thenReturnZero() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();
    fixedOrderComparator.setUnknownObjectBehavior(UnknownObjectBehavior.AFTER);

    // Act and Assert
    assertEquals(0, fixedOrderComparator.compare("Obj1", "Obj2"));
    assertTrue(fixedOrderComparator.isLocked());
  }

  /**
   * Test {@link FixedOrderComparator#compare(Object, Object)}.
   * <ul>
   *   <li>Given {@link FixedOrderComparator#FixedOrderComparator()} UnknownObjectBehavior is {@code BEFORE}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FixedOrderComparator#compare(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int FixedOrderComparator.compare(Object, Object)"})
  public void testCompare_givenFixedOrderComparatorUnknownObjectBehaviorIsBefore() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();
    fixedOrderComparator.setUnknownObjectBehavior(UnknownObjectBehavior.BEFORE);

    // Act and Assert
    assertEquals(0, fixedOrderComparator.compare("Obj1", "Obj2"));
    assertTrue(fixedOrderComparator.isLocked());
  }

  /**
   * Test {@link FixedOrderComparator#compare(Object, Object)}.
   * <ul>
   *   <li>Given {@link FixedOrderComparator#FixedOrderComparator()}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FixedOrderComparator#compare(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int FixedOrderComparator.compare(Object, Object)"})
  public void testCompare_givenFixedOrderComparator_thenThrowIllegalArgumentException() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> fixedOrderComparator.compare("Obj1", "Obj2"));
  }

  /**
   * Test {@link FixedOrderComparator#equals(Object)}, and {@link FixedOrderComparator#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link FixedOrderComparator#equals(Object)}
   *   <li>{@link FixedOrderComparator#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FixedOrderComparator.equals(Object)", "int FixedOrderComparator.hashCode()"})
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
   * Test {@link FixedOrderComparator#equals(Object)}, and {@link FixedOrderComparator#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link FixedOrderComparator#equals(Object)}
   *   <li>{@link FixedOrderComparator#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FixedOrderComparator.equals(Object)", "int FixedOrderComparator.hashCode()"})
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
   * Test {@link FixedOrderComparator#equals(Object)}, and {@link FixedOrderComparator#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link FixedOrderComparator#equals(Object)}
   *   <li>{@link FixedOrderComparator#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FixedOrderComparator.equals(Object)", "int FixedOrderComparator.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act and Assert
    assertEquals(fixedOrderComparator, fixedOrderComparator);
    int expectedHashCodeResult = fixedOrderComparator.hashCode();
    assertEquals(expectedHashCodeResult, fixedOrderComparator.hashCode());
  }

  /**
   * Test {@link FixedOrderComparator#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FixedOrderComparator#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FixedOrderComparator.equals(Object)", "int FixedOrderComparator.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>("Items");

    // Act and Assert
    assertNotEquals(fixedOrderComparator, new FixedOrderComparator<>());
  }

  /**
   * Test {@link FixedOrderComparator#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FixedOrderComparator#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FixedOrderComparator.equals(Object)", "int FixedOrderComparator.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();
    fixedOrderComparator.setUnknownObjectBehavior(UnknownObjectBehavior.BEFORE);

    // Act and Assert
    assertNotEquals(fixedOrderComparator, new FixedOrderComparator<>());
  }

  /**
   * Test {@link FixedOrderComparator#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FixedOrderComparator#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FixedOrderComparator.equals(Object)", "int FixedOrderComparator.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>("Items");

    FixedOrderComparator<Object> fixedOrderComparator2 = new FixedOrderComparator<>();
    fixedOrderComparator2.add("Obj");

    // Act and Assert
    assertNotEquals(fixedOrderComparator, fixedOrderComparator2);
  }

  /**
   * Test {@link FixedOrderComparator#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FixedOrderComparator#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FixedOrderComparator.equals(Object)", "int FixedOrderComparator.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>(new FixedOrderComparator<>());

    FixedOrderComparator<Object> fixedOrderComparator2 = new FixedOrderComparator<>();
    fixedOrderComparator2.add("Obj");

    // Act and Assert
    assertNotEquals(fixedOrderComparator, fixedOrderComparator2);
  }

  /**
   * Test {@link FixedOrderComparator#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FixedOrderComparator#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FixedOrderComparator.equals(Object)", "int FixedOrderComparator.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act and Assert
    assertNotEquals(fixedOrderComparator, null);
  }

  /**
   * Test {@link FixedOrderComparator#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FixedOrderComparator#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FixedOrderComparator.equals(Object)", "int FixedOrderComparator.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act and Assert
    assertNotEquals(fixedOrderComparator, "Different type to FixedOrderComparator");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link FixedOrderComparator#getUnknownObjectBehavior()}
   *   <li>{@link FixedOrderComparator#isLocked()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"UnknownObjectBehavior FixedOrderComparator.getUnknownObjectBehavior()",
      "boolean FixedOrderComparator.isLocked()"})
  public void testGettersAndSetters() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act
    UnknownObjectBehavior actualUnknownObjectBehavior = fixedOrderComparator.getUnknownObjectBehavior();

    // Assert
    assertEquals(UnknownObjectBehavior.EXCEPTION, actualUnknownObjectBehavior);
    assertFalse(fixedOrderComparator.isLocked());
  }

  /**
   * Test {@link FixedOrderComparator#setUnknownObjectBehavior(UnknownObjectBehavior)}.
   * <p>
   * Method under test: {@link FixedOrderComparator#setUnknownObjectBehavior(UnknownObjectBehavior)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void FixedOrderComparator.setUnknownObjectBehavior(UnknownObjectBehavior)"})
  public void testSetUnknownObjectBehavior() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act
    fixedOrderComparator.setUnknownObjectBehavior(UnknownObjectBehavior.BEFORE);

    // Assert
    assertEquals(UnknownObjectBehavior.BEFORE, fixedOrderComparator.getUnknownObjectBehavior());
  }
}
