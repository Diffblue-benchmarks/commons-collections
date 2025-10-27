package org.apache.commons.collections4.comparators;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NullComparatorDiffblueTest {
  /**
   * Method under test: {@link NullComparator#compare(Object, Object)}
   */
  @Test
  public void testCompare() {
    // Arrange
    NullComparator<Object> nullComparator = new NullComparator<>();

    // Act and Assert
    assertEquals(-1, nullComparator.compare("O1", "O2"));
  }

  /**
   * Method under test: {@link NullComparator#compare(Object, Object)}
   */
  @Test
  public void testCompare2() {
    // Arrange
    NullComparator<Object> nullComparator = new NullComparator<>();

    // Act and Assert
    assertEquals(1, nullComparator.compare(null, "O2"));
  }

  /**
   * Method under test: {@link NullComparator#compare(Object, Object)}
   */
  @Test
  public void testCompare3() {
    // Arrange
    NullComparator<Object> nullComparator = new NullComparator<>();

    // Act and Assert
    assertEquals(0, nullComparator.compare(true, true));
  }

  /**
   * Method under test: {@link NullComparator#compare(Object, Object)}
   */
  @Test
  public void testCompare4() {
    // Arrange
    NullComparator<Object> nullComparator = new NullComparator<>();

    // Act and Assert
    assertEquals(-1, nullComparator.compare(true, null));
  }

  /**
   * Method under test: {@link NullComparator#NullComparator()}
   */
  @Test
  public void testNewNullComparator() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>();

    // Assert
    assertEquals(-1, actualNullComparator.compare("O1", "O2"));
  }

  /**
   * Method under test: {@link NullComparator#NullComparator()}
   */
  @Test
  public void testNewNullComparator2() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>();

    // Assert
    assertEquals(1, actualNullComparator.compare(null, "O2"));
  }

  /**
   * Method under test: {@link NullComparator#NullComparator()}
   */
  @Test
  public void testNewNullComparator3() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>();

    // Assert
    assertEquals(0, actualNullComparator.compare(true, true));
  }

  /**
   * Method under test: {@link NullComparator#NullComparator()}
   */
  @Test
  public void testNewNullComparator4() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>();

    // Assert
    assertEquals(-1, actualNullComparator.compare(true, null));
  }

  /**
   * Method under test: {@link NullComparator#NullComparator(boolean)}
   */
  @Test
  public void testNewNullComparator5() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>(true);

    // Assert
    assertEquals(-1, actualNullComparator.compare("O1", "O2"));
  }

  /**
   * Method under test: {@link NullComparator#NullComparator(boolean)}
   */
  @Test
  public void testNewNullComparator6() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>(true);

    // Assert
    assertEquals(1, actualNullComparator.compare(null, "O2"));
  }

  /**
   * Method under test: {@link NullComparator#NullComparator(boolean)}
   */
  @Test
  public void testNewNullComparator7() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>(true);

    // Assert
    assertEquals(0, actualNullComparator.compare(true, true));
  }

  /**
   * Method under test: {@link NullComparator#NullComparator(boolean)}
   */
  @Test
  public void testNewNullComparator8() {
    // Arrange and Act
    NullComparator<Object> actualNullComparator = new NullComparator<>(true);

    // Assert
    assertEquals(-1, actualNullComparator.compare(true, null));
  }
}
