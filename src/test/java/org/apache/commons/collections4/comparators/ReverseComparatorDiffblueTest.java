package org.apache.commons.collections4.comparators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Comparator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ReverseComparatorDiffblueTest {
  /**
   * Test {@link ReverseComparator#ReverseComparator()}.
   *
   * <ul>
   *   <li>Then return compare {@code Obj1} and {@code Obj2} is one.
   * </ul>
   *
   * <p>Method under test: {@link ReverseComparator#ReverseComparator()}
   */
  @Test
  @DisplayName("Test new ReverseComparator(); then return compare 'Obj1' and 'Obj2' is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReverseComparator.<init>()"})
  void testNewReverseComparator_thenReturnCompareObj1AndObj2IsOne() {
    // Arrange and Act
    ReverseComparator<Object> actualReverseComparator = new ReverseComparator<>();

    // Assert
    assertEquals(1, actualReverseComparator.compare("Obj1", "Obj2"));
  }

  /**
   * Test {@link ReverseComparator#ReverseComparator(Comparator)}.
   *
   * <ul>
   *   <li>When {@link Comparator}.
   *   <li>Then return compare {@code Obj1} and {@code Obj2} is zero.
   * </ul>
   *
   * <p>Method under test: {@link ReverseComparator#ReverseComparator(Comparator)}
   */
  @Test
  @DisplayName(
      "Test new ReverseComparator(Comparator); when Comparator; then return compare 'Obj1' and 'Obj2' is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReverseComparator.<init>(Comparator)"})
  void testNewReverseComparator_whenComparator_thenReturnCompareObj1AndObj2IsZero() {
    // Arrange and Act
    ReverseComparator<Object> actualReverseComparator =
        new ReverseComparator<>(mock(Comparator.class));

    // Assert
    assertEquals(0, actualReverseComparator.compare("Obj1", "Obj2"));
  }

  /**
   * Test {@link ReverseComparator#ReverseComparator(Comparator)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ReverseComparator#ReverseComparator(Comparator)}
   */
  @Test
  @DisplayName("Test new ReverseComparator(Comparator); when 'null'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReverseComparator.<init>(Comparator)"})
  void testNewReverseComparator_whenNull_thenNull() {
    // Arrange and Act
    ReverseComparator<Object> actualReverseComparator = new ReverseComparator<>(null);

    // Assert
    assertNull(null);
    assertEquals(1, actualReverseComparator.compare("Obj1", "Obj2"));
  }

  /**
   * Test {@link ReverseComparator#equals(Object)}, and {@link ReverseComparator#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ReverseComparator#equals(Object)}
   *   <li>{@link ReverseComparator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ReverseComparator.equals(Object)",
    "int ReverseComparator.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ReverseComparator<Object> reverseComparator = new ReverseComparator<>();
    ReverseComparator<Object> reverseComparator2 = new ReverseComparator<>();

    // Act and Assert
    assertEquals(reverseComparator, reverseComparator2);
    assertEquals(reverseComparator.hashCode(), reverseComparator2.hashCode());
  }

  /**
   * Test {@link ReverseComparator#equals(Object)}, and {@link ReverseComparator#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ReverseComparator#equals(Object)}
   *   <li>{@link ReverseComparator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ReverseComparator.equals(Object)",
    "int ReverseComparator.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ReverseComparator<Object> reverseComparator = new ReverseComparator<>();

    // Act and Assert
    assertEquals(reverseComparator, reverseComparator);
    int expectedHashCodeResult = reverseComparator.hashCode();
    assertEquals(expectedHashCodeResult, reverseComparator.hashCode());
  }

  /**
   * Test {@link ReverseComparator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReverseComparator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ReverseComparator.equals(Object)",
    "int ReverseComparator.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ReverseComparator<Object> reverseComparator = new ReverseComparator<>(mock(Comparator.class));

    // Act and Assert
    assertNotEquals(reverseComparator, new ReverseComparator<>());
  }

  /**
   * Test {@link ReverseComparator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReverseComparator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ReverseComparator.equals(Object)",
    "int ReverseComparator.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ReverseComparator<Object> reverseComparator =
        new ReverseComparator<>(new ReverseComparator<>());

    // Act and Assert
    assertNotEquals(reverseComparator, new ReverseComparator<>());
  }

  /**
   * Test {@link ReverseComparator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReverseComparator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ReverseComparator.equals(Object)",
    "int ReverseComparator.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ReverseComparator<Object> reverseComparator = new ReverseComparator<>();

    // Act and Assert
    assertNotEquals(reverseComparator, null);
  }

  /**
   * Test {@link ReverseComparator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReverseComparator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ReverseComparator.equals(Object)",
    "int ReverseComparator.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ReverseComparator<Object> reverseComparator = new ReverseComparator<>();

    // Act and Assert
    assertNotEquals(reverseComparator, "Different type to ReverseComparator");
  }
}
