package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.Comparator;
import org.apache.commons.collections4.comparators.BooleanComparator;
import org.apache.commons.collections4.comparators.ComparatorChain;
import org.apache.commons.collections4.comparators.NullComparator;
import org.apache.commons.collections4.comparators.ReverseComparator;
import org.apache.commons.collections4.junit.ObjectToStringComparator;
import org.junit.Test;

public class ComparatorUtilsDiffblueTest {
  /**
   * Method under test: {@link ComparatorUtils#booleanComparator(boolean)}
   */
  @Test
  public void testBooleanComparator() {
    // Arrange and Act
    Comparator<Boolean> actualBooleanComparatorResult = ComparatorUtils.booleanComparator(true);

    // Assert
    assertTrue(actualBooleanComparatorResult instanceof BooleanComparator);
    assertEquals(0, actualBooleanComparatorResult.compare(true, true));
    assertTrue(((BooleanComparator) actualBooleanComparatorResult).sortsTrueFirst());
  }

  /**
   * Method under test: {@link ComparatorUtils#booleanComparator(boolean)}
   */
  @Test
  public void testBooleanComparator2() {
    // Arrange and Act
    Comparator<Boolean> actualBooleanComparatorResult = ComparatorUtils.booleanComparator(true);

    // Assert
    assertTrue(actualBooleanComparatorResult instanceof BooleanComparator);
    assertEquals(1, actualBooleanComparatorResult.compare(false, true));
    assertTrue(((BooleanComparator) actualBooleanComparatorResult).sortsTrueFirst());
  }

  /**
   * Method under test: {@link ComparatorUtils#booleanComparator(boolean)}
   */
  @Test
  public void testBooleanComparator3() {
    // Arrange and Act
    Comparator<Boolean> actualBooleanComparatorResult = ComparatorUtils.booleanComparator(true);
    int actualCompareResult = actualBooleanComparatorResult.compare(true, false);

    // Assert
    assertTrue(actualBooleanComparatorResult instanceof BooleanComparator);
    assertTrue(((BooleanComparator) actualBooleanComparatorResult).sortsTrueFirst());
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualCompareResult);
  }

  /**
   * Method under test: {@link ComparatorUtils#chainedComparator(Comparator[])}
   */
  @Test
  public void testChainedComparator() {
    // Arrange and Act
    Comparator<Object> actualChainedComparatorResult = ComparatorUtils.chainedComparator(new NullComparator<>());

    // Assert
    assertTrue(actualChainedComparatorResult instanceof ComparatorChain);
    assertEquals(0, actualChainedComparatorResult.compare("42", "42"));
    assertEquals(1, ((ComparatorChain<Object>) actualChainedComparatorResult).size());
    assertTrue(((ComparatorChain<Object>) actualChainedComparatorResult).isLocked());
  }

  /**
   * Method under test: {@link ComparatorUtils#chainedComparator(Comparator[])}
   */
  @Test
  public void testChainedComparator2() {
    // Arrange and Act
    Comparator<Object> actualChainedComparatorResult = ComparatorUtils.chainedComparator(new ReverseComparator<>());

    // Assert
    assertTrue(actualChainedComparatorResult instanceof ComparatorChain);
    assertEquals(0, actualChainedComparatorResult.compare("42", "42"));
    assertEquals(1, ((ComparatorChain<Object>) actualChainedComparatorResult).size());
    assertTrue(((ComparatorChain<Object>) actualChainedComparatorResult).isLocked());
  }

  /**
   * Method under test: {@link ComparatorUtils#chainedComparator(Comparator[])}
   */
  @Test
  public void testChainedComparator3() {
    // Arrange and Act
    Comparator<Object> actualChainedComparatorResult = ComparatorUtils.chainedComparator(new NullComparator<>());

    // Assert
    assertTrue(actualChainedComparatorResult instanceof ComparatorChain);
    assertEquals(1, actualChainedComparatorResult.compare(null, "42"));
    assertEquals(1, ((ComparatorChain<Object>) actualChainedComparatorResult).size());
    assertTrue(((ComparatorChain<Object>) actualChainedComparatorResult).isLocked());
  }

  /**
   * Method under test: {@link ComparatorUtils#chainedComparator(Comparator[])}
   */
  @Test
  public void testChainedComparator4() {
    // Arrange and Act
    Comparator<Object> actualChainedComparatorResult = ComparatorUtils.chainedComparator(new NullComparator<>());
    int actualCompareResult = actualChainedComparatorResult.compare(1, null);

    // Assert
    assertTrue(actualChainedComparatorResult instanceof ComparatorChain);
    assertEquals(1, ((ComparatorChain<Object>) actualChainedComparatorResult).size());
    assertTrue(((ComparatorChain<Object>) actualChainedComparatorResult).isLocked());
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualCompareResult);
  }

  /**
   * Method under test: {@link ComparatorUtils#chainedComparator(Comparator[])}
   */
  @Test
  public void testChainedComparator5() {
    // Arrange and Act
    Comparator<Object> actualChainedComparatorResult = ComparatorUtils.chainedComparator(new NullComparator<>());

    // Assert
    assertTrue(actualChainedComparatorResult instanceof ComparatorChain);
    assertEquals(1, actualChainedComparatorResult.compare(1, 0));
    assertEquals(1, ((ComparatorChain<Object>) actualChainedComparatorResult).size());
    assertTrue(((ComparatorChain<Object>) actualChainedComparatorResult).isLocked());
  }

  /**
   * Method under test: {@link ComparatorUtils#max(Object, Object, Comparator)}
   */
  @Test
  public void testMax() {
    // Arrange, Act and Assert
    assertEquals("O2", ComparatorUtils.max("O1", "O2", null));
    assertEquals("O2", ComparatorUtils.max("O1", "O2", new NullComparator<>()));
    assertEquals("O1", ComparatorUtils.max("O1", "O2", new ReverseComparator<>()));
    assertEquals("O2", ComparatorUtils.max("O1", "O2", new ObjectToStringComparator()));
    assertNull(ComparatorUtils.max(null, "O2", new NullComparator<>()));
    assertNull(ComparatorUtils.max(true, null, new NullComparator<>()));
  }

  /**
   * Method under test: {@link ComparatorUtils#min(Object, Object, Comparator)}
   */
  @Test
  public void testMin() {
    // Arrange, Act and Assert
    assertEquals("O1", ComparatorUtils.min("O1", "O2", null));
    assertEquals("O1", ComparatorUtils.min("O1", "O2", new NullComparator<>()));
    assertEquals("O2", ComparatorUtils.min("O1", "O2", new ReverseComparator<>()));
    assertEquals("O1", ComparatorUtils.min("O1", "O2", new ObjectToStringComparator()));
    assertEquals("O2", ComparatorUtils.min(null, "O2", new NullComparator<>()));
  }

  /**
   * Method under test: {@link ComparatorUtils#nullHighComparator(Comparator)}
   */
  @Test
  public void testNullHighComparator() {
    // Arrange and Act
    Comparator<Object> actualNullHighComparatorResult = ComparatorUtils.nullHighComparator(null);

    // Assert
    assertTrue(actualNullHighComparatorResult instanceof NullComparator);
    assertEquals(0, actualNullHighComparatorResult.compare("42", "42"));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualNullHighComparatorResult.compare("O1", "O2"));
  }

  /**
   * Method under test: {@link ComparatorUtils#nullHighComparator(Comparator)}
   */
  @Test
  public void testNullHighComparator2() {
    // Arrange and Act
    Comparator<Object> actualNullHighComparatorResult = ComparatorUtils.nullHighComparator(null);
    int actualCompareResult = actualNullHighComparatorResult.compare(42, null);

    // Assert
    assertTrue(actualNullHighComparatorResult instanceof NullComparator);
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualNullHighComparatorResult.compare("O1", "O2"));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualCompareResult);
  }

  /**
   * Method under test: {@link ComparatorUtils#nullHighComparator(Comparator)}
   */
  @Test
  public void testNullHighComparator3() {
    // Arrange and Act
    Comparator<Object> actualNullHighComparatorResult = ComparatorUtils.nullHighComparator(null);

    // Assert
    assertTrue(actualNullHighComparatorResult instanceof NullComparator);
    assertEquals(1, actualNullHighComparatorResult.compare(42, 1));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualNullHighComparatorResult.compare("O1", "O2"));
  }

  /**
   * Method under test: {@link ComparatorUtils#nullHighComparator(Comparator)}
   */
  @Test
  public void testNullHighComparator4() {
    // Arrange and Act
    Comparator<Object> actualNullHighComparatorResult = ComparatorUtils
        .nullHighComparator(new ObjectToStringComparator());

    // Assert
    assertTrue(actualNullHighComparatorResult instanceof NullComparator);
    assertEquals(0, actualNullHighComparatorResult.compare(42, "42"));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualNullHighComparatorResult.compare("O1", "O2"));
  }

  /**
   * Method under test: {@link ComparatorUtils#nullHighComparator(Comparator)}
   */
  @Test
  public void testNullHighComparator5() {
    // Arrange and Act
    Comparator<Object> actualNullHighComparatorResult = ComparatorUtils.nullHighComparator(new NullComparator<>());

    // Assert
    assertTrue(actualNullHighComparatorResult instanceof NullComparator);
    assertEquals(1, actualNullHighComparatorResult.compare(42, 1));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualNullHighComparatorResult.compare("O1", "O2"));
  }

  /**
   * Method under test: {@link ComparatorUtils#nullHighComparator(Comparator)}
   */
  @Test
  public void testNullHighComparator6() {
    // Arrange and Act
    Comparator<Object> actualNullHighComparatorResult = ComparatorUtils.nullHighComparator(new ReverseComparator<>());
    int actualCompareResult = actualNullHighComparatorResult.compare(42, 1);

    // Assert
    assertTrue(actualNullHighComparatorResult instanceof NullComparator);
    assertEquals(1, actualNullHighComparatorResult.compare("O1", "O2"));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualCompareResult);
  }

  /**
   * Method under test: {@link ComparatorUtils#nullLowComparator(Comparator)}
   */
  @Test
  public void testNullLowComparator() {
    // Arrange and Act
    Comparator<Object> actualNullLowComparatorResult = ComparatorUtils.nullLowComparator(null);

    // Assert
    assertTrue(actualNullLowComparatorResult instanceof NullComparator);
    assertEquals(0, actualNullLowComparatorResult.compare("42", "42"));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualNullLowComparatorResult.compare("O1", "O2"));
  }

  /**
   * Method under test: {@link ComparatorUtils#nullLowComparator(Comparator)}
   */
  @Test
  public void testNullLowComparator2() {
    // Arrange and Act
    Comparator<Object> actualNullLowComparatorResult = ComparatorUtils.nullLowComparator(null);

    // Assert
    assertTrue(actualNullLowComparatorResult instanceof NullComparator);
    assertEquals(1, actualNullLowComparatorResult.compare(42, null));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualNullLowComparatorResult.compare("O1", "O2"));
  }

  /**
   * Method under test: {@link ComparatorUtils#nullLowComparator(Comparator)}
   */
  @Test
  public void testNullLowComparator3() {
    // Arrange and Act
    Comparator<Object> actualNullLowComparatorResult = ComparatorUtils.nullLowComparator(null);

    // Assert
    assertTrue(actualNullLowComparatorResult instanceof NullComparator);
    assertEquals(1, actualNullLowComparatorResult.compare(42, 1));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualNullLowComparatorResult.compare("O1", "O2"));
  }

  /**
   * Method under test: {@link ComparatorUtils#nullLowComparator(Comparator)}
   */
  @Test
  public void testNullLowComparator4() {
    // Arrange and Act
    Comparator<Object> actualNullLowComparatorResult = ComparatorUtils
        .nullLowComparator(new ObjectToStringComparator());

    // Assert
    assertTrue(actualNullLowComparatorResult instanceof NullComparator);
    assertEquals(0, actualNullLowComparatorResult.compare(42, "42"));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualNullLowComparatorResult.compare("O1", "O2"));
  }

  /**
   * Method under test: {@link ComparatorUtils#nullLowComparator(Comparator)}
   */
  @Test
  public void testNullLowComparator5() {
    // Arrange and Act
    Comparator<Object> actualNullLowComparatorResult = ComparatorUtils.nullLowComparator(new NullComparator<>());

    // Assert
    assertTrue(actualNullLowComparatorResult instanceof NullComparator);
    assertEquals(1, actualNullLowComparatorResult.compare(42, 1));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualNullLowComparatorResult.compare("O1", "O2"));
  }

  /**
   * Method under test: {@link ComparatorUtils#nullLowComparator(Comparator)}
   */
  @Test
  public void testNullLowComparator6() {
    // Arrange and Act
    Comparator<Object> actualNullLowComparatorResult = ComparatorUtils.nullLowComparator(new ReverseComparator<>());
    int actualCompareResult = actualNullLowComparatorResult.compare(42, 1);

    // Assert
    assertTrue(actualNullLowComparatorResult instanceof NullComparator);
    assertEquals(1, actualNullLowComparatorResult.compare("O1", "O2"));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualCompareResult);
  }

  /**
   * Method under test: {@link ComparatorUtils#reversedComparator(Comparator)}
   */
  @Test
  public void testReversedComparator() {
    // Arrange and Act
    Comparator<Object> actualReversedComparatorResult = ComparatorUtils.reversedComparator(null);

    // Assert
    assertTrue(actualReversedComparatorResult instanceof ReverseComparator);
    assertEquals(0, actualReversedComparatorResult.compare("42", "42"));
    assertEquals(1, actualReversedComparatorResult.compare("Obj1", "Obj2"));
  }

  /**
   * Method under test: {@link ComparatorUtils#reversedComparator(Comparator)}
   */
  @Test
  public void testReversedComparator2() {
    // Arrange and Act
    Comparator<Object> actualReversedComparatorResult = ComparatorUtils.reversedComparator(new NullComparator<>());

    // Assert
    assertTrue(actualReversedComparatorResult instanceof ReverseComparator);
    assertEquals(0, actualReversedComparatorResult.compare("42", "42"));
    assertEquals(1, actualReversedComparatorResult.compare("Obj1", "Obj2"));
  }

  /**
   * Method under test: {@link ComparatorUtils#reversedComparator(Comparator)}
   */
  @Test
  public void testReversedComparator3() {
    // Arrange and Act
    Comparator<Object> actualReversedComparatorResult = ComparatorUtils.reversedComparator(new ReverseComparator<>());

    // Assert
    assertTrue(actualReversedComparatorResult instanceof ReverseComparator);
    assertEquals(0, actualReversedComparatorResult.compare("42", "42"));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualReversedComparatorResult.compare("Obj1", "Obj2"));
  }

  /**
   * Method under test: {@link ComparatorUtils#reversedComparator(Comparator)}
   */
  @Test
  public void testReversedComparator4() {
    // Arrange and Act
    Comparator<Object> actualReversedComparatorResult = ComparatorUtils
        .reversedComparator(new ObjectToStringComparator());

    // Assert
    assertTrue(actualReversedComparatorResult instanceof ReverseComparator);
    assertEquals(0, actualReversedComparatorResult.compare("42", "42"));
    assertEquals(1, actualReversedComparatorResult.compare("Obj1", "Obj2"));
  }

  /**
   * Method under test: {@link ComparatorUtils#reversedComparator(Comparator)}
   */
  @Test
  public void testReversedComparator5() {
    // Arrange and Act
    Comparator<Object> actualReversedComparatorResult = ComparatorUtils.reversedComparator(new NullComparator<>());
    int actualCompareResult = actualReversedComparatorResult.compare(42, null);

    // Assert
    assertTrue(actualReversedComparatorResult instanceof ReverseComparator);
    assertEquals(1, actualReversedComparatorResult.compare("Obj1", "Obj2"));
    assertEquals(1, actualCompareResult);
  }

  /**
   * Method under test: {@link ComparatorUtils#reversedComparator(Comparator)}
   */
  @Test
  public void testReversedComparator6() {
    // Arrange and Act
    Comparator<Object> actualReversedComparatorResult = ComparatorUtils.reversedComparator(new NullComparator<>());
    int actualCompareResult = actualReversedComparatorResult.compare(42, 1);

    // Assert
    assertTrue(actualReversedComparatorResult instanceof ReverseComparator);
    assertEquals(1, actualReversedComparatorResult.compare("Obj1", "Obj2"));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualCompareResult);
  }
}
