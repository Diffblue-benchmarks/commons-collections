package org.apache.commons.collections4.comparators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections4.comparators.FixedOrderComparator.UnknownObjectBehavior;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FixedOrderComparatorDiffblueTest {
  /**
   * Test {@link FixedOrderComparator#FixedOrderComparator()}.
   *
   * <p>Method under test: {@link FixedOrderComparator#FixedOrderComparator()}
   */
  @Test
  @DisplayName("Test new FixedOrderComparator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FixedOrderComparator.<init>()"})
  void testNewFixedOrderComparator() {
    // Arrange and Act
    FixedOrderComparator<Object> actualFixedOrderComparator = new FixedOrderComparator<>();

    // Assert
    assertEquals(
        UnknownObjectBehavior.EXCEPTION, actualFixedOrderComparator.getUnknownObjectBehavior());
    assertFalse(actualFixedOrderComparator.isLocked());
  }

  /**
   * Test {@link FixedOrderComparator#FixedOrderComparator(List)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link FixedOrderComparator#FixedOrderComparator(List)}
   */
  @Test
  @DisplayName("Test new FixedOrderComparator(List); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FixedOrderComparator.<init>(List)"})
  void testNewFixedOrderComparator_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> items = new ArrayList<>();
    items.add("42");

    // Act
    FixedOrderComparator<Object> actualFixedOrderComparator = new FixedOrderComparator<>(items);

    // Assert
    assertEquals(
        UnknownObjectBehavior.EXCEPTION, actualFixedOrderComparator.getUnknownObjectBehavior());
    assertFalse(actualFixedOrderComparator.isLocked());
  }

  /**
   * Test {@link FixedOrderComparator#FixedOrderComparator(List)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link FixedOrderComparator#FixedOrderComparator(List)}
   */
  @Test
  @DisplayName("Test new FixedOrderComparator(List); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FixedOrderComparator.<init>(List)"})
  void testNewFixedOrderComparator_given42_whenArrayListAdd422() {
    // Arrange
    ArrayList<Object> items = new ArrayList<>();
    items.add("42");
    items.add("42");

    // Act
    FixedOrderComparator<Object> actualFixedOrderComparator = new FixedOrderComparator<>(items);

    // Assert
    assertEquals(
        UnknownObjectBehavior.EXCEPTION, actualFixedOrderComparator.getUnknownObjectBehavior());
    assertFalse(actualFixedOrderComparator.isLocked());
  }

  /**
   * Test {@link FixedOrderComparator#FixedOrderComparator(List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link FixedOrderComparator#FixedOrderComparator(List)}
   */
  @Test
  @DisplayName("Test new FixedOrderComparator(List); when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FixedOrderComparator.<init>(List)"})
  void testNewFixedOrderComparator_whenArrayList() {
    // Arrange and Act
    FixedOrderComparator<Object> actualFixedOrderComparator =
        new FixedOrderComparator<>(new ArrayList<>());

    // Assert
    assertEquals(
        UnknownObjectBehavior.EXCEPTION, actualFixedOrderComparator.getUnknownObjectBehavior());
    assertFalse(actualFixedOrderComparator.isLocked());
  }

  /**
   * Test {@link FixedOrderComparator#FixedOrderComparator(Object[])}.
   *
   * <ul>
   *   <li>When {@code Items} and {@code Items}.
   * </ul>
   *
   * <p>Method under test: {@link FixedOrderComparator#FixedOrderComparator(Object[])}
   */
  @Test
  @DisplayName("Test new FixedOrderComparator(Object[]); when 'Items' and 'Items'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FixedOrderComparator.<init>(Object[])"})
  void testNewFixedOrderComparator_whenItemsAndItems() {
    // Arrange and Act
    FixedOrderComparator<Object> actualFixedOrderComparator =
        new FixedOrderComparator<>("Items", "Items");

    // Assert
    assertEquals(
        UnknownObjectBehavior.EXCEPTION, actualFixedOrderComparator.getUnknownObjectBehavior());
    assertFalse(actualFixedOrderComparator.isLocked());
  }

  /**
   * Test {@link FixedOrderComparator#FixedOrderComparator(Object[])}.
   *
   * <ul>
   *   <li>When {@code Items}.
   *   <li>Then return UnknownObjectBehavior is {@code EXCEPTION}.
   * </ul>
   *
   * <p>Method under test: {@link FixedOrderComparator#FixedOrderComparator(Object[])}
   */
  @Test
  @DisplayName(
      "Test new FixedOrderComparator(Object[]); when 'Items'; then return UnknownObjectBehavior is 'EXCEPTION'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FixedOrderComparator.<init>(Object[])"})
  void testNewFixedOrderComparator_whenItems_thenReturnUnknownObjectBehaviorIsException() {
    // Arrange and Act
    FixedOrderComparator<Object> actualFixedOrderComparator = new FixedOrderComparator<>("Items");

    // Assert
    assertEquals(
        UnknownObjectBehavior.EXCEPTION, actualFixedOrderComparator.getUnknownObjectBehavior());
    assertFalse(actualFixedOrderComparator.isLocked());
  }

  /**
   * Test {@link FixedOrderComparator#add(Object)}.
   *
   * <ul>
   *   <li>Given {@link FixedOrderComparator#FixedOrderComparator()} add {@code Obj}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FixedOrderComparator#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object); given FixedOrderComparator() add 'Obj'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FixedOrderComparator.add(Object)"})
  void testAdd_givenFixedOrderComparatorAddObj_thenReturnFalse() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();
    fixedOrderComparator.add("Obj");

    // Act and Assert
    assertFalse(fixedOrderComparator.add("Obj"));
  }

  /**
   * Test {@link FixedOrderComparator#add(Object)}.
   *
   * <ul>
   *   <li>Given {@link FixedOrderComparator#FixedOrderComparator()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FixedOrderComparator#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object); given FixedOrderComparator(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FixedOrderComparator.add(Object)"})
  void testAdd_givenFixedOrderComparator_thenReturnTrue() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act and Assert
    assertTrue(fixedOrderComparator.add("Obj"));
  }

  /**
   * Test {@link FixedOrderComparator#addAsEqual(Object, Object)}.
   *
   * <p>Method under test: {@link FixedOrderComparator#addAsEqual(Object, Object)}
   */
  @Test
  @DisplayName("Test addAsEqual(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FixedOrderComparator.addAsEqual(Object, Object)"})
  void testAddAsEqual() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> fixedOrderComparator.addAsEqual("Existing Obj", "New Obj"));
  }

  /**
   * Test {@link FixedOrderComparator#compare(Object, Object)}.
   *
   * <p>Method under test: {@link FixedOrderComparator#compare(Object, Object)}
   */
  @Test
  @DisplayName("Test compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int FixedOrderComparator.compare(Object, Object)"})
  void testCompare() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator =
        new FixedOrderComparator<>(new ArrayList<>());
    fixedOrderComparator.setUnknownObjectBehavior(UnknownObjectBehavior.BEFORE);

    // Act and Assert
    assertEquals(0, fixedOrderComparator.compare("Obj1", "Obj2"));
    assertTrue(fixedOrderComparator.isLocked());
  }

  /**
   * Test {@link FixedOrderComparator#compare(Object, Object)}.
   *
   * <p>Method under test: {@link FixedOrderComparator#compare(Object, Object)}
   */
  @Test
  @DisplayName("Test compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int FixedOrderComparator.compare(Object, Object)"})
  void testCompare2() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator =
        new FixedOrderComparator<>(new ArrayList<>());
    fixedOrderComparator.setUnknownObjectBehavior(UnknownObjectBehavior.AFTER);

    // Act and Assert
    assertEquals(0, fixedOrderComparator.compare("Obj1", "Obj2"));
    assertTrue(fixedOrderComparator.isLocked());
  }

  /**
   * Test {@link FixedOrderComparator#compare(Object, Object)}.
   *
   * <ul>
   *   <li>Given {@link FixedOrderComparator#FixedOrderComparator()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FixedOrderComparator#compare(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test compare(Object, Object); given FixedOrderComparator(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int FixedOrderComparator.compare(Object, Object)"})
  void testCompare_givenFixedOrderComparator_thenThrowIllegalArgumentException() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> fixedOrderComparator.compare("Obj1", "Obj2"));
  }

  /**
   * Test {@link FixedOrderComparator#equals(Object)}, and {@link FixedOrderComparator#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FixedOrderComparator#equals(Object)}
   *   <li>{@link FixedOrderComparator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedOrderComparator.equals(Object)",
    "int FixedOrderComparator.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();
    FixedOrderComparator<Object> fixedOrderComparator2 = new FixedOrderComparator<>();

    // Act and Assert
    assertEquals(fixedOrderComparator, fixedOrderComparator2);
    assertEquals(fixedOrderComparator.hashCode(), fixedOrderComparator2.hashCode());
  }

  /**
   * Test {@link FixedOrderComparator#equals(Object)}, and {@link FixedOrderComparator#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FixedOrderComparator#equals(Object)}
   *   <li>{@link FixedOrderComparator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedOrderComparator.equals(Object)",
    "int FixedOrderComparator.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator =
        new FixedOrderComparator<>(new FixedOrderComparator<>());

    FixedOrderComparator<Object> fixedOrderComparator2 = new FixedOrderComparator<>();
    fixedOrderComparator2.add(new FixedOrderComparator<>());

    // Act and Assert
    assertEquals(fixedOrderComparator, fixedOrderComparator2);
    assertEquals(fixedOrderComparator.hashCode(), fixedOrderComparator2.hashCode());
  }

  /**
   * Test {@link FixedOrderComparator#equals(Object)}, and {@link FixedOrderComparator#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FixedOrderComparator#equals(Object)}
   *   <li>{@link FixedOrderComparator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedOrderComparator.equals(Object)",
    "int FixedOrderComparator.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act and Assert
    assertEquals(fixedOrderComparator, fixedOrderComparator);
    int expectedHashCodeResult = fixedOrderComparator.hashCode();
    assertEquals(expectedHashCodeResult, fixedOrderComparator.hashCode());
  }

  /**
   * Test {@link FixedOrderComparator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedOrderComparator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedOrderComparator.equals(Object)",
    "int FixedOrderComparator.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>("Items");

    // Act and Assert
    assertNotEquals(fixedOrderComparator, new FixedOrderComparator<>());
  }

  /**
   * Test {@link FixedOrderComparator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedOrderComparator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedOrderComparator.equals(Object)",
    "int FixedOrderComparator.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();
    fixedOrderComparator.setUnknownObjectBehavior(UnknownObjectBehavior.BEFORE);

    // Act and Assert
    assertNotEquals(fixedOrderComparator, new FixedOrderComparator<>());
  }

  /**
   * Test {@link FixedOrderComparator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedOrderComparator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedOrderComparator.equals(Object)",
    "int FixedOrderComparator.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>("Items");

    FixedOrderComparator<Object> fixedOrderComparator2 = new FixedOrderComparator<>();
    fixedOrderComparator2.add("Obj");

    // Act and Assert
    assertNotEquals(fixedOrderComparator, fixedOrderComparator2);
  }

  /**
   * Test {@link FixedOrderComparator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedOrderComparator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedOrderComparator.equals(Object)",
    "int FixedOrderComparator.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator =
        new FixedOrderComparator<>(new FixedOrderComparator<>());

    FixedOrderComparator<Object> fixedOrderComparator2 = new FixedOrderComparator<>();
    fixedOrderComparator2.add("Obj");

    // Act and Assert
    assertNotEquals(fixedOrderComparator, fixedOrderComparator2);
  }

  /**
   * Test {@link FixedOrderComparator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedOrderComparator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedOrderComparator.equals(Object)",
    "int FixedOrderComparator.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act and Assert
    assertNotEquals(fixedOrderComparator, null);
  }

  /**
   * Test {@link FixedOrderComparator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedOrderComparator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedOrderComparator.equals(Object)",
    "int FixedOrderComparator.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act and Assert
    assertNotEquals(fixedOrderComparator, "Different type to FixedOrderComparator");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FixedOrderComparator#getUnknownObjectBehavior()}
   *   <li>{@link FixedOrderComparator#isLocked()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnknownObjectBehavior FixedOrderComparator.getUnknownObjectBehavior()",
    "boolean FixedOrderComparator.isLocked()"
  })
  void testGettersAndSetters() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act
    UnknownObjectBehavior actualUnknownObjectBehavior =
        fixedOrderComparator.getUnknownObjectBehavior();

    // Assert
    assertEquals(UnknownObjectBehavior.EXCEPTION, actualUnknownObjectBehavior);
    assertFalse(fixedOrderComparator.isLocked());
  }

  /**
   * Test {@link FixedOrderComparator#setUnknownObjectBehavior(UnknownObjectBehavior)}.
   *
   * <p>Method under test: {@link
   * FixedOrderComparator#setUnknownObjectBehavior(UnknownObjectBehavior)}
   */
  @Test
  @DisplayName("Test setUnknownObjectBehavior(UnknownObjectBehavior)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FixedOrderComparator.setUnknownObjectBehavior(UnknownObjectBehavior)"})
  void testSetUnknownObjectBehavior() {
    // Arrange
    FixedOrderComparator<Object> fixedOrderComparator = new FixedOrderComparator<>();

    // Act
    fixedOrderComparator.setUnknownObjectBehavior(UnknownObjectBehavior.BEFORE);

    // Assert
    assertEquals(UnknownObjectBehavior.BEFORE, fixedOrderComparator.getUnknownObjectBehavior());
  }
}
