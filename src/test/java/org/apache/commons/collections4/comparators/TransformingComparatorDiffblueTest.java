package org.apache.commons.collections4.comparators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Comparator;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TransformingComparatorDiffblueTest {
  /**
   * Test {@link TransformingComparator#TransformingComparator(Transformer)}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>Then return compare {@code Obj1} and {@code Obj2} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformingComparator#TransformingComparator(Transformer)}
   */
  @Test
  @DisplayName("Test new TransformingComparator(Transformer); given 'Apply'; then return compare 'Obj1' and 'Obj2' is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TransformingComparator.<init>(Transformer)"})
  void testNewTransformingComparator_givenApply_thenReturnCompareObj1AndObj2IsZero() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    TransformingComparator<Object, Object> actualTransformingComparator = new TransformingComparator<>(transformer);
    int actualCompareResult = actualTransformingComparator.compare("Obj1", "Obj2");

    // Assert
    verify(transformer, atLeast(1)).apply(Mockito.<Object>any());
    assertEquals(0, actualCompareResult);
  }

  /**
   * Test {@link TransformingComparator#compare(Object, Object)}.
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@code Apply}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformingComparator#compare(Object, Object)}
   */
  @Test
  @DisplayName("Test compare(Object, Object); given Transformer apply(Object) return 'Apply'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int TransformingComparator.compare(Object, Object)"})
  void testCompare_givenTransformerApplyReturnApply_thenReturnZero() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    TransformingComparator<Object, Object> transformingComparator = new TransformingComparator<>(transformer);

    // Act
    int actualCompareResult = transformingComparator.compare("Obj1", "Obj2");

    // Assert
    verify(transformer, atLeast(1)).apply(Mockito.<Object>any());
    assertEquals(0, actualCompareResult);
  }

  /**
   * Test {@link TransformingComparator#equals(Object)}, and {@link TransformingComparator#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link TransformingComparator#equals(Object)}
   *   <li>{@link TransformingComparator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TransformingComparator.equals(Object)", "int TransformingComparator.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    TransformingComparator<Object, Object> transformingComparator = new TransformingComparator<>(
        mock(Transformer.class));

    // Act and Assert
    assertEquals(transformingComparator, transformingComparator);
    int expectedHashCodeResult = transformingComparator.hashCode();
    assertEquals(expectedHashCodeResult, transformingComparator.hashCode());
  }

  /**
   * Test {@link TransformingComparator#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformingComparator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TransformingComparator.equals(Object)", "int TransformingComparator.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    TransformingComparator<Object, Object> transformingComparator = new TransformingComparator<>(
        mock(Transformer.class));

    // Act and Assert
    assertNotEquals(transformingComparator, new TransformingComparator<>(mock(Transformer.class)));
  }

  /**
   * Test {@link TransformingComparator#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformingComparator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TransformingComparator.equals(Object)", "int TransformingComparator.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    TransformingComparator<Object, Object> transformingComparator = new TransformingComparator<>(
        mock(Transformer.class), mock(Comparator.class));

    // Act and Assert
    assertNotEquals(transformingComparator, new TransformingComparator<>(mock(Transformer.class)));
  }

  /**
   * Test {@link TransformingComparator#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformingComparator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TransformingComparator.equals(Object)", "int TransformingComparator.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    TransformingComparator<Object, Object> transformingComparator = new TransformingComparator<>(transformer,
        new TransformingComparator<>(mock(Transformer.class)));

    // Act and Assert
    assertNotEquals(transformingComparator, new TransformingComparator<>(mock(Transformer.class)));
  }

  /**
   * Test {@link TransformingComparator#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformingComparator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TransformingComparator.equals(Object)", "int TransformingComparator.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    TransformingComparator<Object, Object> transformingComparator = new TransformingComparator<>(
        mock(Transformer.class));

    // Act and Assert
    assertNotEquals(transformingComparator, null);
  }

  /**
   * Test {@link TransformingComparator#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformingComparator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TransformingComparator.equals(Object)", "int TransformingComparator.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    TransformingComparator<Object, Object> transformingComparator = new TransformingComparator<>(
        mock(Transformer.class));

    // Act and Assert
    assertNotEquals(transformingComparator, "Different type to TransformingComparator");
  }
}
