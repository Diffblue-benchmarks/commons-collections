package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import org.apache.commons.collections4.comparators.BooleanComparator;
import org.apache.commons.collections4.comparators.ComparatorChain;
import org.apache.commons.collections4.comparators.NullComparator;
import org.apache.commons.collections4.comparators.ReverseComparator;
import org.apache.commons.collections4.comparators.TransformingComparator;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class ComparatorUtilsDiffblueTest {
  /**
   * Test {@link ComparatorUtils#booleanComparator(boolean)}.
   * <ul>
   *   <li>Then return compare {@code false} and {@code true} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#booleanComparator(boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparator ComparatorUtils.booleanComparator(boolean)"})
  public void testBooleanComparator_thenReturnCompareFalseAndTrueIsOne() {
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
   *   <li>Then return compare {@code true} and {@code false} is {@link CollectionUtils#INDEX_NOT_FOUND}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#booleanComparator(boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparator ComparatorUtils.booleanComparator(boolean)"})
  public void testBooleanComparator_thenReturnCompareTrueAndFalseIsIndex_not_found() {
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
   *   <li>Then return compare {@code true} and {@code true} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#booleanComparator(boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparator ComparatorUtils.booleanComparator(boolean)"})
  public void testBooleanComparator_thenReturnCompareTrueAndTrueIsZero() {
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
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#chainedComparator(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparator ComparatorUtils.chainedComparator(Collection)"})
  public void testChainedComparatorWithCollection_thenReturnSizeIsOne() {
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
    assertEquals(1, actualCompareResult);
    assertEquals(1, ((ComparatorChain<Object>) actualChainedComparatorResult).size());
    assertTrue(((ComparatorChain<Object>) actualChainedComparatorResult).isLocked());
  }

  /**
   * Test {@link ComparatorUtils#chainedComparator(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#chainedComparator(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparator ComparatorUtils.chainedComparator(Collection)"})
  public void testChainedComparatorWithCollection_thenReturnSizeIsTwo() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    Comparator<Object> comparator2 = mock(Comparator.class);
    when(comparator2.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    ArrayList<Comparator<Object>> comparators = new ArrayList<>();
    comparators.add(comparator2);
    comparators.add(comparator);

    // Act
    Comparator<Object> actualChainedComparatorResult = ComparatorUtils.chainedComparator(comparators);
    int actualCompareResult = actualChainedComparatorResult.compare("42", "42");

    // Assert
    verify(comparator2).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualChainedComparatorResult instanceof ComparatorChain);
    assertEquals(1, actualCompareResult);
    assertEquals(2, ((ComparatorChain<Object>) actualChainedComparatorResult).size());
    assertTrue(((ComparatorChain<Object>) actualChainedComparatorResult).isLocked());
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ComparatorUtils.max(Object, Object, Comparator)"})
  public void testMax_givenOne_whenComparatorCompareReturnOne_thenReturnO1() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ComparatorUtils.max(Object, Object, Comparator)"})
  public void testMax_whenNull_thenReturnO2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ComparatorUtils.min(Object, Object, Comparator)"})
  public void testMin_givenOne_whenComparatorCompareReturnOne_thenReturnO2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ComparatorUtils.min(Object, Object, Comparator)"})
  public void testMin_whenNull_thenReturnO1() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparator ComparatorUtils.nullHighComparator(Comparator)"})
  public void testNullHighComparator_givenOne_thenReturnCompareO1AndO2IsOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparator ComparatorUtils.nullHighComparator(Comparator)"})
  public void testNullHighComparator_thenReturnCompareFortyTwoAndNullIsIndex_not_found() {
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
   *   <li>Then return compare {@code 42} and {@code 42} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#nullHighComparator(Comparator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparator ComparatorUtils.nullHighComparator(Comparator)"})
  public void testNullHighComparator_whenComparator_thenReturnCompare42And42IsZero() {
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
   *   <li>Then return compare forty-two and one is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#nullHighComparator(Comparator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparator ComparatorUtils.nullHighComparator(Comparator)"})
  public void testNullHighComparator_whenNull_thenReturnCompareFortyTwoAndOneIsOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparator ComparatorUtils.nullLowComparator(Comparator)"})
  public void testNullLowComparator_givenOne_thenReturnCompareO1AndO2IsOne() {
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
   *   <li>Then return compare {@code 42} and {@code 42} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#nullLowComparator(Comparator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparator ComparatorUtils.nullLowComparator(Comparator)"})
  public void testNullLowComparator_whenComparator_thenReturnCompare42And42IsZero() {
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
   *   <li>Then return compare forty-two and {@code null} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#nullLowComparator(Comparator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparator ComparatorUtils.nullLowComparator(Comparator)"})
  public void testNullLowComparator_whenNull_thenReturnCompareFortyTwoAndNullIsOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparator ComparatorUtils.nullLowComparator(Comparator)"})
  public void testNullLowComparator_whenNull_thenReturnCompareFortyTwoAndOneIsOne() {
    // Arrange and Act
    Comparator<Object> actualNullLowComparatorResult = ComparatorUtils.nullLowComparator(null);

    // Assert
    assertTrue(actualNullLowComparatorResult instanceof NullComparator);
    assertEquals(1, actualNullLowComparatorResult.compare(42, 1));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualNullLowComparatorResult.compare("O1", "O2"));
  }

  /**
   * Test {@link ComparatorUtils#reversedComparator(Comparator)}.
   * <ul>
   *   <li>Given one.</li>
   *   <li>Then return compare {@code 42} and {@code 42} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#reversedComparator(Comparator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparator ComparatorUtils.reversedComparator(Comparator)"})
  public void testReversedComparator_givenOne_thenReturnCompare42And42IsOne() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Comparator<Object> actualReversedComparatorResult = ComparatorUtils.reversedComparator(comparator);
    int actualCompareResult = actualReversedComparatorResult.compare("42", "42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualReversedComparatorResult instanceof ReverseComparator);
    assertEquals(1, actualCompareResult);
    assertEquals(1, actualReversedComparatorResult.compare("Obj1", "Obj2"));
  }

  /**
   * Test {@link ComparatorUtils#reversedComparator(Comparator)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return compare {@code 42} and {@code 42} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#reversedComparator(Comparator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparator ComparatorUtils.reversedComparator(Comparator)"})
  public void testReversedComparator_whenNull_thenReturnCompare42And42IsZero() {
    // Arrange and Act
    Comparator<Object> actualReversedComparatorResult = ComparatorUtils.reversedComparator(null);

    // Assert
    assertTrue(actualReversedComparatorResult instanceof ReverseComparator);
    assertEquals(0, actualReversedComparatorResult.compare("42", "42"));
    assertEquals(1, actualReversedComparatorResult.compare("Obj1", "Obj2"));
  }

  /**
   * Test {@link ComparatorUtils#transformedComparator(Comparator, Transformer)}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>When {@link Transformer} {@link Transformer#apply(Object)} return {@code Apply}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#transformedComparator(Comparator, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparator ComparatorUtils.transformedComparator(Comparator, Transformer)"})
  public void testTransformedComparator_givenApply_whenTransformerApplyReturnApply() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Comparator<Object> actualTransformedComparatorResult = ComparatorUtils.transformedComparator(null, transformer);
    int actualCompareResult = actualTransformedComparatorResult.compare("42", "42");

    // Assert
    verify(transformer, atLeast(1)).apply(isA(Object.class));
    assertTrue(actualTransformedComparatorResult instanceof TransformingComparator);
    assertEquals(0, actualCompareResult);
    assertEquals(0, actualTransformedComparatorResult.compare("Obj1", "Obj2"));
  }

  /**
   * Test {@link ComparatorUtils#transformedComparator(Comparator, Transformer)}.
   * <ul>
   *   <li>Given one.</li>
   *   <li>Then return compare {@code 42} and {@code 42} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#transformedComparator(Comparator, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparator ComparatorUtils.transformedComparator(Comparator, Transformer)"})
  public void testTransformedComparator_givenOne_thenReturnCompare42And42IsOne() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ReverseComparator<Object> comparator2 = new ReverseComparator<>(comparator);
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    Comparator<Object> actualTransformedComparatorResult = ComparatorUtils.transformedComparator(comparator2,
        transformer);
    int actualCompareResult = actualTransformedComparatorResult.compare("42", "42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    verify(transformer, atLeast(1)).apply(isA(Object.class));
    assertTrue(actualTransformedComparatorResult instanceof TransformingComparator);
    assertEquals(1, actualCompareResult);
    assertEquals(1, actualTransformedComparatorResult.compare("Obj1", "Obj2"));
  }

  /**
   * Test {@link ComparatorUtils#transformedComparator(Comparator, Transformer)}.
   * <ul>
   *   <li>When {@link NullComparator#NullComparator()}.</li>
   *   <li>Then return compare {@code 42} and {@code 42} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#transformedComparator(Comparator, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparator ComparatorUtils.transformedComparator(Comparator, Transformer)"})
  public void testTransformedComparator_whenNullComparator_thenReturnCompare42And42IsZero() {
    // Arrange
    NullComparator<Object> comparator = new NullComparator<>();
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    Comparator<Object> actualTransformedComparatorResult = ComparatorUtils.transformedComparator(comparator,
        transformer);
    int actualCompareResult = actualTransformedComparatorResult.compare("42", "42");

    // Assert
    verify(transformer, atLeast(1)).apply(isA(Object.class));
    assertTrue(actualTransformedComparatorResult instanceof TransformingComparator);
    assertEquals(0, actualCompareResult);
    assertEquals(0, actualTransformedComparatorResult.compare("Obj1", "Obj2"));
  }

  /**
   * Test {@link ComparatorUtils#transformedComparator(Comparator, Transformer)}.
   * <ul>
   *   <li>When {@link ReverseComparator#ReverseComparator()}.</li>
   *   <li>Then return compare {@code 42} and {@code 42} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorUtils#transformedComparator(Comparator, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparator ComparatorUtils.transformedComparator(Comparator, Transformer)"})
  public void testTransformedComparator_whenReverseComparator_thenReturnCompare42And42IsZero() {
    // Arrange
    ReverseComparator<Object> comparator = new ReverseComparator<>();
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    Comparator<Object> actualTransformedComparatorResult = ComparatorUtils.transformedComparator(comparator,
        transformer);
    int actualCompareResult = actualTransformedComparatorResult.compare("42", "42");

    // Assert
    verify(transformer, atLeast(1)).apply(isA(Object.class));
    assertTrue(actualTransformedComparatorResult instanceof TransformingComparator);
    assertEquals(0, actualCompareResult);
    assertEquals(0, actualTransformedComparatorResult.compare("Obj1", "Obj2"));
  }
}
