package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import org.apache.commons.collections4.comparators.BooleanComparator;
import org.apache.commons.collections4.comparators.ComparatorChain;
import org.apache.commons.collections4.comparators.NullComparator;
import org.apache.commons.collections4.comparators.TransformingComparator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ComparatorUtilsDiffblueTest {
  /**
   * Test {@link ComparatorUtils#booleanComparator(boolean)}.
   * <ul>
   *   <li>When {@code false}.</li>
   *   <li>Then return not sortsTrueFirst.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#booleanComparator(boolean)}
   */
  @Test
  @DisplayName("Test booleanComparator(boolean); when 'false'; then return not sortsTrueFirst")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Comparator ComparatorUtils.booleanComparator(boolean)"})
  void testBooleanComparator_whenFalse_thenReturnNotSortsTrueFirst() {
    // Arrange and Act
    Comparator<Boolean> actualBooleanComparatorResult = ComparatorUtils.booleanComparator(false);

    // Assert
    assertTrue(actualBooleanComparatorResult instanceof BooleanComparator);
    assertEquals(0, actualBooleanComparatorResult.compare(true, true));
    assertFalse(((BooleanComparator) actualBooleanComparatorResult).sortsTrueFirst());
  }

  /**
   * Test {@link ComparatorUtils#booleanComparator(boolean)}.
   * <ul>
   *   <li>When {@code true}.</li>
   *   <li>Then return compare {@code false} and {@code true} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#booleanComparator(boolean)}
   */
  @Test
  @DisplayName("Test booleanComparator(boolean); when 'true'; then return compare 'false' and 'true' is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Comparator ComparatorUtils.booleanComparator(boolean)"})
  void testBooleanComparator_whenTrue_thenReturnCompareFalseAndTrueIsOne() {
    // Arrange and Act
    Comparator<Boolean> actualBooleanComparatorResult = ComparatorUtils.booleanComparator(true);

    // Assert
    assertTrue(actualBooleanComparatorResult instanceof BooleanComparator);
    assertEquals(1, actualBooleanComparatorResult.compare(false, true));
    assertTrue(((BooleanComparator) actualBooleanComparatorResult).sortsTrueFirst());
  }

  /**
   * Test {@link ComparatorUtils#booleanComparator(boolean)}.
   * <ul>
   *   <li>When {@code true}.</li>
   *   <li>Then return compare {@code true} and {@code false} is {@link CollectionUtils#INDEX_NOT_FOUND}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#booleanComparator(boolean)}
   */
  @Test
  @DisplayName("Test booleanComparator(boolean); when 'true'; then return compare 'true' and 'false' is INDEX_NOT_FOUND")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Comparator ComparatorUtils.booleanComparator(boolean)"})
  void testBooleanComparator_whenTrue_thenReturnCompareTrueAndFalseIsIndex_not_found() {
    // Arrange and Act
    Comparator<Boolean> actualBooleanComparatorResult = ComparatorUtils.booleanComparator(true);
    int actualCompareResult = actualBooleanComparatorResult.compare(true, false);

    // Assert
    assertTrue(actualBooleanComparatorResult instanceof BooleanComparator);
    assertTrue(((BooleanComparator) actualBooleanComparatorResult).sortsTrueFirst());
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualCompareResult);
  }

  /**
   * Test {@link ComparatorUtils#booleanComparator(boolean)}.
   * <ul>
   *   <li>When {@code true}.</li>
   *   <li>Then return compare {@code true} and {@code true} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#booleanComparator(boolean)}
   */
  @Test
  @DisplayName("Test booleanComparator(boolean); when 'true'; then return compare 'true' and 'true' is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Comparator ComparatorUtils.booleanComparator(boolean)"})
  void testBooleanComparator_whenTrue_thenReturnCompareTrueAndTrueIsZero() {
    // Arrange and Act
    Comparator<Boolean> actualBooleanComparatorResult = ComparatorUtils.booleanComparator(true);

    // Assert
    assertTrue(actualBooleanComparatorResult instanceof BooleanComparator);
    assertEquals(0, actualBooleanComparatorResult.compare(true, true));
    assertTrue(((BooleanComparator) actualBooleanComparatorResult).sortsTrueFirst());
  }

  /**
   * Test {@link ComparatorUtils#chainedComparator(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#chainedComparator(Collection)}
   */
  @Test
  @DisplayName("Test chainedComparator(Collection) with 'Collection'; then ArrayList() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Comparator ComparatorUtils.chainedComparator(Collection)"})
  void testChainedComparatorWithCollection_thenArrayListSizeIsOne() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    ArrayList<Comparator<Object>> comparators = new ArrayList<>();
    comparators.add(comparator);

    // Act
    Comparator<Object> actualChainedComparatorResult = ComparatorUtils.chainedComparator(comparators);
    int actualCompareResult = actualChainedComparatorResult.compare("42", "42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualChainedComparatorResult instanceof ComparatorChain);
    assertEquals(1, comparators.size());
    assertEquals(1, actualCompareResult);
    assertEquals(1, ((ComparatorChain<Object>) actualChainedComparatorResult).size());
    assertTrue(((ComparatorChain<Object>) actualChainedComparatorResult).isLocked());
  }

  /**
   * Test {@link ComparatorUtils#chainedComparator(Collection)} with {@code Collection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return size is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#chainedComparator(Collection)}
   */
  @Test
  @DisplayName("Test chainedComparator(Collection) with 'Collection'; when ArrayList(); then return size is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Comparator ComparatorUtils.chainedComparator(Collection)"})
  void testChainedComparatorWithCollection_whenArrayList_thenReturnSizeIsZero() {
    // Arrange
    ArrayList<Comparator<Object>> comparators = new ArrayList<>();

    // Act
    Comparator<Object> actualChainedComparatorResult = ComparatorUtils.chainedComparator(comparators);

    // Assert
    assertTrue(actualChainedComparatorResult instanceof ComparatorChain);
    assertEquals(0, ((ComparatorChain<Object>) actualChainedComparatorResult).size());
    assertFalse(((ComparatorChain<Object>) actualChainedComparatorResult).isLocked());
    assertTrue(comparators.isEmpty());
  }

  /**
   * Test {@link ComparatorUtils#max(Object, Object, Comparator)}.
   * <ul>
   *   <li>Given one.</li>
   *   <li>When {@link Comparator} {@link Comparator#compare(Object, Object)} return one.</li>
   *   <li>Then return {@code O1}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#max(Object, Object, Comparator)}
   */
  @Test
  @DisplayName("Test max(Object, Object, Comparator); given one; when Comparator compare(Object, Object) return one; then return 'O1'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ComparatorUtils.max(Object, Object, Comparator)"})
  void testMax_givenOne_whenComparatorCompareReturnOne_thenReturnO1() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Object actualMaxResult = ComparatorUtils.max("O1", "O2", comparator);

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertEquals("O1", actualMaxResult);
  }

  /**
   * Test {@link ComparatorUtils#max(Object, Object, Comparator)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code O2}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#max(Object, Object, Comparator)}
   */
  @Test
  @DisplayName("Test max(Object, Object, Comparator); when 'null'; then return 'O2'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ComparatorUtils.max(Object, Object, Comparator)"})
  void testMax_whenNull_thenReturnO2() {
    // Arrange, Act and Assert
    assertEquals("O2", ComparatorUtils.max("O1", "O2", null));
  }

  /**
   * Test {@link ComparatorUtils#min(Object, Object, Comparator)}.
   * <ul>
   *   <li>Given one.</li>
   *   <li>When {@link Comparator} {@link Comparator#compare(Object, Object)} return one.</li>
   *   <li>Then return {@code O2}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#min(Object, Object, Comparator)}
   */
  @Test
  @DisplayName("Test min(Object, Object, Comparator); given one; when Comparator compare(Object, Object) return one; then return 'O2'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ComparatorUtils.min(Object, Object, Comparator)"})
  void testMin_givenOne_whenComparatorCompareReturnOne_thenReturnO2() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Object actualMinResult = ComparatorUtils.min("O1", "O2", comparator);

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertEquals("O2", actualMinResult);
  }

  /**
   * Test {@link ComparatorUtils#min(Object, Object, Comparator)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code O1}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#min(Object, Object, Comparator)}
   */
  @Test
  @DisplayName("Test min(Object, Object, Comparator); when 'null'; then return 'O1'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ComparatorUtils.min(Object, Object, Comparator)"})
  void testMin_whenNull_thenReturnO1() {
    // Arrange, Act and Assert
    assertEquals("O1", ComparatorUtils.min("O1", "O2", null));
  }

  /**
   * Test {@link ComparatorUtils#nullHighComparator(Comparator)}.
   * <ul>
   *   <li>Given one.</li>
   *   <li>Then return compare {@code O1} and {@code O2} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#nullHighComparator(Comparator)}
   */
  @Test
  @DisplayName("Test nullHighComparator(Comparator); given one; then return compare 'O1' and 'O2' is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Comparator ComparatorUtils.nullHighComparator(Comparator)"})
  void testNullHighComparator_givenOne_thenReturnCompareO1AndO2IsOne() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Comparator<Object> actualNullHighComparatorResult = ComparatorUtils.nullHighComparator(comparator);
    int actualCompareResult = actualNullHighComparatorResult.compare(42, "42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualNullHighComparatorResult instanceof NullComparator);
    assertEquals(1, actualNullHighComparatorResult.compare("O1", "O2"));
    assertEquals(1, actualCompareResult);
  }

  /**
   * Test {@link ComparatorUtils#nullHighComparator(Comparator)}.
   * <ul>
   *   <li>Then return compare forty-two and {@code null} is {@link CollectionUtils#INDEX_NOT_FOUND}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#nullHighComparator(Comparator)}
   */
  @Test
  @DisplayName("Test nullHighComparator(Comparator); then return compare forty-two and 'null' is INDEX_NOT_FOUND")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Comparator ComparatorUtils.nullHighComparator(Comparator)"})
  void testNullHighComparator_thenReturnCompareFortyTwoAndNullIsIndex_not_found() {
    // Arrange and Act
    Comparator<Object> actualNullHighComparatorResult = ComparatorUtils.nullHighComparator(null);
    int actualCompareResult = actualNullHighComparatorResult.compare(42, null);

    // Assert
    assertTrue(actualNullHighComparatorResult instanceof NullComparator);
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualNullHighComparatorResult.compare("O1", "O2"));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualCompareResult);
  }

  /**
   * Test {@link ComparatorUtils#nullHighComparator(Comparator)}.
   * <ul>
   *   <li>When {@link Comparator}.</li>
   *   <li>Then return compare {@code O1} and {@code O2} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#nullHighComparator(Comparator)}
   */
  @Test
  @DisplayName("Test nullHighComparator(Comparator); when Comparator; then return compare 'O1' and 'O2' is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Comparator ComparatorUtils.nullHighComparator(Comparator)"})
  void testNullHighComparator_whenComparator_thenReturnCompareO1AndO2IsZero() {
    // Arrange and Act
    Comparator<Object> actualNullHighComparatorResult = ComparatorUtils
        .<Object>nullHighComparator(mock(Comparator.class));

    // Assert
    assertTrue(actualNullHighComparatorResult instanceof NullComparator);
    assertEquals(0, actualNullHighComparatorResult.compare("42", "42"));
    assertEquals(0, actualNullHighComparatorResult.compare("O1", "O2"));
  }

  /**
   * Test {@link ComparatorUtils#nullHighComparator(Comparator)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return compare {@code 42} and {@code 42} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#nullHighComparator(Comparator)}
   */
  @Test
  @DisplayName("Test nullHighComparator(Comparator); when 'null'; then return compare '42' and '42' is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Comparator ComparatorUtils.nullHighComparator(Comparator)"})
  void testNullHighComparator_whenNull_thenReturnCompare42And42IsZero() {
    // Arrange and Act
    Comparator<Object> actualNullHighComparatorResult = ComparatorUtils.nullHighComparator(null);

    // Assert
    assertTrue(actualNullHighComparatorResult instanceof NullComparator);
    assertEquals(0, actualNullHighComparatorResult.compare("42", "42"));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualNullHighComparatorResult.compare("O1", "O2"));
  }

  /**
   * Test {@link ComparatorUtils#nullHighComparator(Comparator)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return compare forty-two and one is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#nullHighComparator(Comparator)}
   */
  @Test
  @DisplayName("Test nullHighComparator(Comparator); when 'null'; then return compare forty-two and one is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Comparator ComparatorUtils.nullHighComparator(Comparator)"})
  void testNullHighComparator_whenNull_thenReturnCompareFortyTwoAndOneIsOne() {
    // Arrange and Act
    Comparator<Object> actualNullHighComparatorResult = ComparatorUtils.nullHighComparator(null);

    // Assert
    assertTrue(actualNullHighComparatorResult instanceof NullComparator);
    assertEquals(1, actualNullHighComparatorResult.compare(42, 1));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualNullHighComparatorResult.compare("O1", "O2"));
  }

  /**
   * Test {@link ComparatorUtils#nullLowComparator(Comparator)}.
   * <ul>
   *   <li>Given one.</li>
   *   <li>Then return compare {@code O1} and {@code O2} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#nullLowComparator(Comparator)}
   */
  @Test
  @DisplayName("Test nullLowComparator(Comparator); given one; then return compare 'O1' and 'O2' is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Comparator ComparatorUtils.nullLowComparator(Comparator)"})
  void testNullLowComparator_givenOne_thenReturnCompareO1AndO2IsOne() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Comparator<Object> actualNullLowComparatorResult = ComparatorUtils.nullLowComparator(comparator);
    int actualCompareResult = actualNullLowComparatorResult.compare(42, "42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualNullLowComparatorResult instanceof NullComparator);
    assertEquals(1, actualNullLowComparatorResult.compare("O1", "O2"));
    assertEquals(1, actualCompareResult);
  }

  /**
   * Test {@link ComparatorUtils#nullLowComparator(Comparator)}.
   * <ul>
   *   <li>When {@link Comparator}.</li>
   *   <li>Then return compare {@code O1} and {@code O2} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#nullLowComparator(Comparator)}
   */
  @Test
  @DisplayName("Test nullLowComparator(Comparator); when Comparator; then return compare 'O1' and 'O2' is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Comparator ComparatorUtils.nullLowComparator(Comparator)"})
  void testNullLowComparator_whenComparator_thenReturnCompareO1AndO2IsZero() {
    // Arrange and Act
    Comparator<Object> actualNullLowComparatorResult = ComparatorUtils
        .<Object>nullLowComparator(mock(Comparator.class));

    // Assert
    assertTrue(actualNullLowComparatorResult instanceof NullComparator);
    assertEquals(0, actualNullLowComparatorResult.compare("42", "42"));
    assertEquals(0, actualNullLowComparatorResult.compare("O1", "O2"));
  }

  /**
   * Test {@link ComparatorUtils#nullLowComparator(Comparator)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return compare {@code 42} and {@code 42} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#nullLowComparator(Comparator)}
   */
  @Test
  @DisplayName("Test nullLowComparator(Comparator); when 'null'; then return compare '42' and '42' is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Comparator ComparatorUtils.nullLowComparator(Comparator)"})
  void testNullLowComparator_whenNull_thenReturnCompare42And42IsZero() {
    // Arrange and Act
    Comparator<Object> actualNullLowComparatorResult = ComparatorUtils.nullLowComparator(null);

    // Assert
    assertTrue(actualNullLowComparatorResult instanceof NullComparator);
    assertEquals(0, actualNullLowComparatorResult.compare("42", "42"));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualNullLowComparatorResult.compare("O1", "O2"));
  }

  /**
   * Test {@link ComparatorUtils#nullLowComparator(Comparator)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return compare forty-two and {@code null} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#nullLowComparator(Comparator)}
   */
  @Test
  @DisplayName("Test nullLowComparator(Comparator); when 'null'; then return compare forty-two and 'null' is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Comparator ComparatorUtils.nullLowComparator(Comparator)"})
  void testNullLowComparator_whenNull_thenReturnCompareFortyTwoAndNullIsOne() {
    // Arrange and Act
    Comparator<Object> actualNullLowComparatorResult = ComparatorUtils.nullLowComparator(null);

    // Assert
    assertTrue(actualNullLowComparatorResult instanceof NullComparator);
    assertEquals(1, actualNullLowComparatorResult.compare(42, null));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualNullLowComparatorResult.compare("O1", "O2"));
  }

  /**
   * Test {@link ComparatorUtils#nullLowComparator(Comparator)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return compare forty-two and one is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#nullLowComparator(Comparator)}
   */
  @Test
  @DisplayName("Test nullLowComparator(Comparator); when 'null'; then return compare forty-two and one is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Comparator ComparatorUtils.nullLowComparator(Comparator)"})
  void testNullLowComparator_whenNull_thenReturnCompareFortyTwoAndOneIsOne() {
    // Arrange and Act
    Comparator<Object> actualNullLowComparatorResult = ComparatorUtils.nullLowComparator(null);

    // Assert
    assertTrue(actualNullLowComparatorResult instanceof NullComparator);
    assertEquals(1, actualNullLowComparatorResult.compare(42, 1));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualNullLowComparatorResult.compare("O1", "O2"));
  }

  /**
   * Test {@link ComparatorUtils#transformedComparator(Comparator, Transformer)}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>Then return compare {@code 42} and {@code 42} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#transformedComparator(Comparator, Transformer)}
   */
  @Test
  @DisplayName("Test transformedComparator(Comparator, Transformer); given 'Apply'; then return compare '42' and '42' is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Comparator ComparatorUtils.transformedComparator(Comparator, Transformer)"})
  void testTransformedComparator_givenApply_thenReturnCompare42And42IsZero() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Comparator<Object> actualTransformedComparatorResult = ComparatorUtils.transformedComparator(null, transformer);
    int actualCompareResult = actualTransformedComparatorResult.compare("42", "42");

    // Assert
    verify(transformer, atLeast(1)).apply(isA(Object.class));
    assertTrue(actualTransformedComparatorResult instanceof TransformingComparator);
    assertNull(null);
    assertEquals(0, actualCompareResult);
    assertEquals(0, actualTransformedComparatorResult.compare("Obj1", "Obj2"));
  }

  /**
   * Test {@link ComparatorUtils#transformedComparator(Comparator, Transformer)}.
   * <ul>
   *   <li>When {@link Comparator}.</li>
   *   <li>Then return compare {@code Obj1} and {@code Obj2} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#transformedComparator(Comparator, Transformer)}
   */
  @Test
  @DisplayName("Test transformedComparator(Comparator, Transformer); when Comparator; then return compare 'Obj1' and 'Obj2' is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Comparator ComparatorUtils.transformedComparator(Comparator, Transformer)"})
  void testTransformedComparator_whenComparator_thenReturnCompareObj1AndObj2IsZero() {
    // Arrange and Act
    Comparator<Object> actualTransformedComparatorResult = ComparatorUtils
        .<Object, Object>transformedComparator(mock(Comparator.class), mock(Transformer.class));

    // Assert
    assertTrue(actualTransformedComparatorResult instanceof TransformingComparator);
    assertEquals(0, actualTransformedComparatorResult.compare("Obj1", "Obj2"));
  }

  /**
   * Test {@link ComparatorUtils#transformedComparator(Comparator, Transformer)}.
   * <ul>
   *   <li>When {@link Transformer}.</li>
   *   <li>Then {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#transformedComparator(Comparator, Transformer)}
   */
  @Test
  @DisplayName("Test transformedComparator(Comparator, Transformer); when Transformer; then 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Comparator ComparatorUtils.transformedComparator(Comparator, Transformer)"})
  void testTransformedComparator_whenTransformer_thenNull() {
    // Arrange and Act
    Comparator<Object> actualTransformedComparatorResult = ComparatorUtils.<Object, Object>transformedComparator(null,
        mock(Transformer.class));

    // Assert
    assertTrue(actualTransformedComparatorResult instanceof TransformingComparator);
    assertNull(null);
  }
}
