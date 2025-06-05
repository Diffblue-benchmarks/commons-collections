package org.apache.commons.collections4.comparators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Comparator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NullComparatorDiffblueTest {
  /**
   * Test {@link NullComparator#NullComparator(Comparator)}.
   * <ul>
   *   <li>Given one.</li>
   *   <li>Then return compare {@code O1} and {@code O2} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#NullComparator(Comparator)}
   */
  @Test
  @DisplayName("Test new NullComparator(Comparator); given one; then return compare 'O1' and 'O2' is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NullComparator.<init>(Comparator)"})
  void testNewNullComparator_givenOne_thenReturnCompareO1AndO2IsOne() {
    // Arrange
    Comparator<Object> nonNullComparator = mock(Comparator.class);
    when(nonNullComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    NullComparator<Object> actualNullComparator = new NullComparator<>(nonNullComparator);
    int actualCompareResult = actualNullComparator.compare("O1", "O2");

    // Assert
    verify(nonNullComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(1, actualCompareResult);
  }

  /**
   * Test {@link NullComparator#NullComparator(Comparator, boolean)}.
   * <ul>
   *   <li>Given one.</li>
   *   <li>Then return compare {@code O1} and {@code O2} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#NullComparator(Comparator, boolean)}
   */
  @Test
  @DisplayName("Test new NullComparator(Comparator, boolean); given one; then return compare 'O1' and 'O2' is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NullComparator.<init>(Comparator, boolean)"})
  void testNewNullComparator_givenOne_thenReturnCompareO1AndO2IsOne2() {
    // Arrange
    Comparator<Object> nonNullComparator = mock(Comparator.class);
    when(nonNullComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    NullComparator<Object> actualNullComparator = new NullComparator<>(nonNullComparator, true);
    int actualCompareResult = actualNullComparator.compare("O1", "O2");

    // Assert
    verify(nonNullComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(1, actualCompareResult);
  }

  /**
   * Test {@link NullComparator#NullComparator()}.
   * <ul>
   *   <li>Then return compare {@code null} and {@code O2} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#NullComparator()}
   */
  @Test
  @DisplayName("Test new NullComparator(); then return compare 'null' and 'O2' is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NullComparator.<init>()"})
  void testNewNullComparator_thenReturnCompareNullAndO2IsOne() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>();

    // Assert
    assertEquals(1, actualNullComparator.compare(null, "O2"));
  }

  /**
   * Test {@link NullComparator#NullComparator(boolean)}.
   * <ul>
   *   <li>Then return compare {@code null} and {@code O2} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#NullComparator(boolean)}
   */
  @Test
  @DisplayName("Test new NullComparator(boolean); then return compare 'null' and 'O2' is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NullComparator.<init>(boolean)"})
  void testNewNullComparator_thenReturnCompareNullAndO2IsOne2() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>(true);

    // Assert
    assertEquals(1, actualNullComparator.compare(null, "O2"));
  }

  /**
   * Test {@link NullComparator#NullComparator()}.
   * <ul>
   *   <li>Then return compare {@code O1} and {@code O2} is minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#NullComparator()}
   */
  @Test
  @DisplayName("Test new NullComparator(); then return compare 'O1' and 'O2' is minus one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NullComparator.<init>()"})
  void testNewNullComparator_thenReturnCompareO1AndO2IsMinusOne() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>();

    // Assert
    assertEquals(-1, actualNullComparator.compare("O1", "O2"));
  }

  /**
   * Test {@link NullComparator#NullComparator(boolean)}.
   * <ul>
   *   <li>Then return compare {@code O1} and {@code O2} is minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#NullComparator(boolean)}
   */
  @Test
  @DisplayName("Test new NullComparator(boolean); then return compare 'O1' and 'O2' is minus one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NullComparator.<init>(boolean)"})
  void testNewNullComparator_thenReturnCompareO1AndO2IsMinusOne2() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>(true);

    // Assert
    assertEquals(-1, actualNullComparator.compare("O1", "O2"));
  }

  /**
   * Test {@link NullComparator#NullComparator()}.
   * <ul>
   *   <li>Then return compare {@code true} and {@code null} is minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#NullComparator()}
   */
  @Test
  @DisplayName("Test new NullComparator(); then return compare 'true' and 'null' is minus one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NullComparator.<init>()"})
  void testNewNullComparator_thenReturnCompareTrueAndNullIsMinusOne() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>();

    // Assert
    assertEquals(-1, actualNullComparator.compare(true, null));
  }

  /**
   * Test {@link NullComparator#NullComparator(boolean)}.
   * <ul>
   *   <li>Then return compare {@code true} and {@code null} is minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#NullComparator(boolean)}
   */
  @Test
  @DisplayName("Test new NullComparator(boolean); then return compare 'true' and 'null' is minus one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NullComparator.<init>(boolean)"})
  void testNewNullComparator_thenReturnCompareTrueAndNullIsMinusOne2() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>(true);

    // Assert
    assertEquals(-1, actualNullComparator.compare(true, null));
  }

  /**
   * Test {@link NullComparator#NullComparator()}.
   * <ul>
   *   <li>Then return compare {@code true} and {@code true} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#NullComparator()}
   */
  @Test
  @DisplayName("Test new NullComparator(); then return compare 'true' and 'true' is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NullComparator.<init>()"})
  void testNewNullComparator_thenReturnCompareTrueAndTrueIsZero() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>();

    // Assert
    assertEquals(0, actualNullComparator.compare(true, true));
  }

  /**
   * Test {@link NullComparator#NullComparator(boolean)}.
   * <ul>
   *   <li>Then return compare {@code true} and {@code true} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#NullComparator(boolean)}
   */
  @Test
  @DisplayName("Test new NullComparator(boolean); then return compare 'true' and 'true' is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NullComparator.<init>(boolean)"})
  void testNewNullComparator_thenReturnCompareTrueAndTrueIsZero2() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>(true);

    // Assert
    assertEquals(0, actualNullComparator.compare(true, true));
  }

  /**
   * Test {@link NullComparator#NullComparator(Comparator)}.
   * <ul>
   *   <li>When {@link Comparator}.</li>
   *   <li>Then return compare {@code null} and {@code null} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#NullComparator(Comparator)}
   */
  @Test
  @DisplayName("Test new NullComparator(Comparator); when Comparator; then return compare 'null' and 'null' is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NullComparator.<init>(Comparator)"})
  void testNewNullComparator_whenComparator_thenReturnCompareNullAndNullIsZero() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>(mock(Comparator.class));

    // Assert
    assertNull(null);
    assertEquals(0, actualNullComparator.compare(null, null));
  }

  /**
   * Test {@link NullComparator#NullComparator(Comparator)}.
   * <ul>
   *   <li>When {@link Comparator}.</li>
   *   <li>Then return compare {@code null} and {@code O2} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#NullComparator(Comparator)}
   */
  @Test
  @DisplayName("Test new NullComparator(Comparator); when Comparator; then return compare 'null' and 'O2' is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NullComparator.<init>(Comparator)"})
  void testNewNullComparator_whenComparator_thenReturnCompareNullAndO2IsOne() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>(mock(Comparator.class));

    // Assert
    assertNull(null);
    assertEquals(1, actualNullComparator.compare(null, "O2"));
  }

  /**
   * Test {@link NullComparator#NullComparator(Comparator)}.
   * <ul>
   *   <li>When {@link Comparator}.</li>
   *   <li>Then return compare {@code O1} and {@code null} is minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#NullComparator(Comparator)}
   */
  @Test
  @DisplayName("Test new NullComparator(Comparator); when Comparator; then return compare 'O1' and 'null' is minus one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NullComparator.<init>(Comparator)"})
  void testNewNullComparator_whenComparator_thenReturnCompareO1AndNullIsMinusOne() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>(mock(Comparator.class));

    // Assert
    assertNull(null);
    assertEquals(-1, actualNullComparator.compare("O1", null));
  }

  /**
   * Test {@link NullComparator#NullComparator(Comparator)}.
   * <ul>
   *   <li>When {@link Comparator}.</li>
   *   <li>Then return compare {@code O1} and {@code O2} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#NullComparator(Comparator)}
   */
  @Test
  @DisplayName("Test new NullComparator(Comparator); when Comparator; then return compare 'O1' and 'O2' is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NullComparator.<init>(Comparator)"})
  void testNewNullComparator_whenComparator_thenReturnCompareO1AndO2IsZero() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>(mock(Comparator.class));

    // Assert
    assertEquals(0, actualNullComparator.compare("O1", "O2"));
  }

  /**
   * Test {@link NullComparator#NullComparator(Comparator, boolean)}.
   * <ul>
   *   <li>When {@code false}.</li>
   *   <li>Then return compare {@code null} and {@code O2} is minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#NullComparator(Comparator, boolean)}
   */
  @Test
  @DisplayName("Test new NullComparator(Comparator, boolean); when 'false'; then return compare 'null' and 'O2' is minus one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NullComparator.<init>(Comparator, boolean)"})
  void testNewNullComparator_whenFalse_thenReturnCompareNullAndO2IsMinusOne() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>(mock(Comparator.class), false);

    // Assert
    assertNull(null);
    assertEquals(-1, actualNullComparator.compare(null, "O2"));
  }

  /**
   * Test {@link NullComparator#NullComparator(Comparator, boolean)}.
   * <ul>
   *   <li>When {@code false}.</li>
   *   <li>Then return compare {@code O1} and {@code null} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#NullComparator(Comparator, boolean)}
   */
  @Test
  @DisplayName("Test new NullComparator(Comparator, boolean); when 'false'; then return compare 'O1' and 'null' is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NullComparator.<init>(Comparator, boolean)"})
  void testNewNullComparator_whenFalse_thenReturnCompareO1AndNullIsOne() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>(mock(Comparator.class), false);

    // Assert
    assertNull(null);
    assertEquals(1, actualNullComparator.compare("O1", null));
  }

  /**
   * Test {@link NullComparator#NullComparator(Comparator, boolean)}.
   * <ul>
   *   <li>When {@code true}.</li>
   *   <li>Then return compare {@code null} and {@code null} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#NullComparator(Comparator, boolean)}
   */
  @Test
  @DisplayName("Test new NullComparator(Comparator, boolean); when 'true'; then return compare 'null' and 'null' is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NullComparator.<init>(Comparator, boolean)"})
  void testNewNullComparator_whenTrue_thenReturnCompareNullAndNullIsZero() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>(mock(Comparator.class), true);

    // Assert
    assertNull(null);
    assertEquals(0, actualNullComparator.compare(null, null));
  }

  /**
   * Test {@link NullComparator#NullComparator(Comparator, boolean)}.
   * <ul>
   *   <li>When {@code true}.</li>
   *   <li>Then return compare {@code null} and {@code O2} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#NullComparator(Comparator, boolean)}
   */
  @Test
  @DisplayName("Test new NullComparator(Comparator, boolean); when 'true'; then return compare 'null' and 'O2' is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NullComparator.<init>(Comparator, boolean)"})
  void testNewNullComparator_whenTrue_thenReturnCompareNullAndO2IsOne() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>(mock(Comparator.class), true);

    // Assert
    assertNull(null);
    assertEquals(1, actualNullComparator.compare(null, "O2"));
  }

  /**
   * Test {@link NullComparator#NullComparator(Comparator, boolean)}.
   * <ul>
   *   <li>When {@code true}.</li>
   *   <li>Then return compare {@code O1} and {@code null} is minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#NullComparator(Comparator, boolean)}
   */
  @Test
  @DisplayName("Test new NullComparator(Comparator, boolean); when 'true'; then return compare 'O1' and 'null' is minus one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NullComparator.<init>(Comparator, boolean)"})
  void testNewNullComparator_whenTrue_thenReturnCompareO1AndNullIsMinusOne() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>(mock(Comparator.class), true);

    // Assert
    assertNull(null);
    assertEquals(-1, actualNullComparator.compare("O1", null));
  }

  /**
   * Test {@link NullComparator#NullComparator(Comparator, boolean)}.
   * <ul>
   *   <li>When {@code true}.</li>
   *   <li>Then return compare {@code O1} and {@code O2} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#NullComparator(Comparator, boolean)}
   */
  @Test
  @DisplayName("Test new NullComparator(Comparator, boolean); when 'true'; then return compare 'O1' and 'O2' is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NullComparator.<init>(Comparator, boolean)"})
  void testNewNullComparator_whenTrue_thenReturnCompareO1AndO2IsZero() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>(mock(Comparator.class), true);

    // Assert
    assertEquals(0, actualNullComparator.compare("O1", "O2"));
  }

  /**
   * Test {@link NullComparator#compare(Object, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#compare(Object, Object)}
   */
  @Test
  @DisplayName("Test compare(Object, Object); when 'null'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int NullComparator.compare(Object, Object)"})
  void testCompare_whenNull_thenReturnZero() {
    // Arrange
    NullComparator<Object> nullComparator = new NullComparator<>();

    // Act and Assert
    assertEquals(0, nullComparator.compare(null, null));
  }

  /**
   * Test {@link NullComparator#compare(Object, Object)}.
   * <ul>
   *   <li>When {@code O1}.</li>
   *   <li>Then return minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#compare(Object, Object)}
   */
  @Test
  @DisplayName("Test compare(Object, Object); when 'O1'; then return minus one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int NullComparator.compare(Object, Object)"})
  void testCompare_whenO1_thenReturnMinusOne() {
    // Arrange
    NullComparator<Object> nullComparator = new NullComparator<>();

    // Act and Assert
    assertEquals(-1, nullComparator.compare("O1", "O2"));
  }

  /**
   * Test {@link NullComparator#compare(Object, Object)}.
   * <ul>
   *   <li>When {@code O1}.</li>
   *   <li>Then return minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#compare(Object, Object)}
   */
  @Test
  @DisplayName("Test compare(Object, Object); when 'O1'; then return minus one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int NullComparator.compare(Object, Object)"})
  void testCompare_whenO1_thenReturnMinusOne2() {
    // Arrange
    NullComparator<Object> nullComparator = new NullComparator<>();

    // Act and Assert
    assertEquals(-1, nullComparator.compare("O1", null));
  }

  /**
   * Test {@link NullComparator#compare(Object, Object)}.
   * <ul>
   *   <li>When {@code O2}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullComparator#compare(Object, Object)}
   */
  @Test
  @DisplayName("Test compare(Object, Object); when 'O2'; then return one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int NullComparator.compare(Object, Object)"})
  void testCompare_whenO2_thenReturnOne() {
    // Arrange
    NullComparator<Object> nullComparator = new NullComparator<>();

    // Act and Assert
    assertEquals(1, nullComparator.compare(null, "O2"));
  }
}
