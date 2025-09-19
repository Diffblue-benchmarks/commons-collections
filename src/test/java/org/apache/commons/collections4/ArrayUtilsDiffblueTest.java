package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ArrayUtilsDiffblueTest {
  /**
   * Test {@link ArrayUtils#contains(Object[], Object)}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code Array}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayUtils#contains(Object[], Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Object[], Object); when array of Object with 'Array'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayUtils.contains(Object[], Object)"})
  void testContains_whenArrayOfObjectWithArray_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(ArrayUtils.contains(new Object[] {"Array"}, "Object To Find"));
  }

  /**
   * Test {@link ArrayUtils#contains(Object[], Object)}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code Array}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayUtils#contains(Object[], Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Object[], Object); when array of Object with 'Array'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayUtils.contains(Object[], Object)"})
  void testContains_whenArrayOfObjectWithArray_thenReturnFalse2() {
    // Arrange, Act and Assert
    assertFalse(ArrayUtils.contains(new Object[] {"Array"}, null));
  }

  /**
   * Test {@link ArrayUtils#contains(Object[], Object)}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayUtils#contains(Object[], Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Object[], Object); when array of Object with 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayUtils.contains(Object[], Object)"})
  void testContains_whenArrayOfObjectWithNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(ArrayUtils.contains(new Object[] {null}, null));
  }

  /**
   * Test {@link ArrayUtils#contains(Object[], Object)}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code Object To Find}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayUtils#contains(Object[], Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Object[], Object); when array of Object with 'Object To Find'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayUtils.contains(Object[], Object)"})
  void testContains_whenArrayOfObjectWithObjectToFind_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(ArrayUtils.contains(new Object[] {"Object To Find"}, "Object To Find"));
  }

  /**
   * Test {@link ArrayUtils#contains(Object[], Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayUtils#contains(Object[], Object)}
   */
  @Test
  @DisplayName("Test contains(Object[], Object); when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayUtils.contains(Object[], Object)"})
  void testContains_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(ArrayUtils.contains(null, "Object To Find"));
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object, int)} with {@code array}, {@code
   * objectToFind}, {@code startIndex}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code Array}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayUtils#indexOf(Object[], Object, int)}
   */
  @Test
  @DisplayName(
      "Test indexOf(Object[], Object, int) with 'array', 'objectToFind', 'startIndex'; when array of Object with 'Array'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object, int)"})
  void testIndexOfWithArrayObjectToFindStartIndex_whenArrayOfObjectWithArray() {
    // Arrange and Act
    int actualIndexOfResult = ArrayUtils.indexOf(new Object[] {"Array"}, null, 0);

    // Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualIndexOfResult);
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object, int)} with {@code array}, {@code
   * objectToFind}, {@code startIndex}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayUtils#indexOf(Object[], Object, int)}
   */
  @Test
  @DisplayName(
      "Test indexOf(Object[], Object, int) with 'array', 'objectToFind', 'startIndex'; when array of Object with 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object, int)"})
  void testIndexOfWithArrayObjectToFindStartIndex_whenArrayOfObjectWithNull() {
    // Arrange and Act
    int actualIndexOfResult = ArrayUtils.indexOf(new Object[] {null}, null, 0);

    // Assert
    assertEquals(0, actualIndexOfResult);
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object, int)} with {@code array}, {@code
   * objectToFind}, {@code startIndex}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code Object To Find}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayUtils#indexOf(Object[], Object, int)}
   */
  @Test
  @DisplayName(
      "Test indexOf(Object[], Object, int) with 'array', 'objectToFind', 'startIndex'; when array of Object with 'Object To Find'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object, int)"})
  void testIndexOfWithArrayObjectToFindStartIndex_whenArrayOfObjectWithObjectToFind() {
    // Arrange and Act
    int actualIndexOfResult =
        ArrayUtils.indexOf(new Object[] {"Object To Find"}, "Object To Find", 0);

    // Assert
    assertEquals(0, actualIndexOfResult);
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object, int)} with {@code array}, {@code
   * objectToFind}, {@code startIndex}.
   *
   * <ul>
   *   <li>When {@link CollectionUtils#INDEX_NOT_FOUND}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayUtils#indexOf(Object[], Object, int)}
   */
  @Test
  @DisplayName(
      "Test indexOf(Object[], Object, int) with 'array', 'objectToFind', 'startIndex'; when INDEX_NOT_FOUND")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object, int)"})
  void testIndexOfWithArrayObjectToFindStartIndex_whenIndex_not_found() {
    // Arrange and Act
    int actualIndexOfResult =
        ArrayUtils.indexOf(new Object[] {"Array"}, null, CollectionUtils.INDEX_NOT_FOUND);

    // Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualIndexOfResult);
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object, int)} with {@code array}, {@code
   * objectToFind}, {@code startIndex}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link CollectionUtils#INDEX_NOT_FOUND}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayUtils#indexOf(Object[], Object, int)}
   */
  @Test
  @DisplayName(
      "Test indexOf(Object[], Object, int) with 'array', 'objectToFind', 'startIndex'; when 'null'; then return INDEX_NOT_FOUND")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object, int)"})
  void testIndexOfWithArrayObjectToFindStartIndex_whenNull_thenReturnIndex_not_found() {
    // Arrange and Act
    int actualIndexOfResult = ArrayUtils.indexOf(null, null, 0);

    // Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualIndexOfResult);
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object, int)} with {@code array}, {@code
   * objectToFind}, {@code startIndex}.
   *
   * <ul>
   *   <li>When {@code Object To Find}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayUtils#indexOf(Object[], Object, int)}
   */
  @Test
  @DisplayName(
      "Test indexOf(Object[], Object, int) with 'array', 'objectToFind', 'startIndex'; when 'Object To Find'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object, int)"})
  void testIndexOfWithArrayObjectToFindStartIndex_whenObjectToFind() {
    // Arrange and Act
    int actualIndexOfResult = ArrayUtils.indexOf(new Object[] {"Array"}, "Object To Find", 0);

    // Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualIndexOfResult);
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object, int)} with {@code array}, {@code
   * objectToFind}, {@code startIndex}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@link CollectionUtils#INDEX_NOT_FOUND}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayUtils#indexOf(Object[], Object, int)}
   */
  @Test
  @DisplayName(
      "Test indexOf(Object[], Object, int) with 'array', 'objectToFind', 'startIndex'; when one; then return INDEX_NOT_FOUND")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object, int)"})
  void testIndexOfWithArrayObjectToFindStartIndex_whenOne_thenReturnIndex_not_found() {
    // Arrange and Act
    int actualIndexOfResult = ArrayUtils.indexOf(new Object[] {"Array"}, "Object To Find", 1);

    // Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualIndexOfResult);
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object)} with {@code array}, {@code objectToFind}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code Array}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayUtils#indexOf(Object[], Object)}
   */
  @Test
  @DisplayName(
      "Test indexOf(Object[], Object) with 'array', 'objectToFind'; when array of Object with 'Array'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object)"})
  void testIndexOfWithArrayObjectToFind_whenArrayOfObjectWithArray() {
    // Arrange, Act and Assert
    assertEquals(
        CollectionUtils.INDEX_NOT_FOUND,
        ArrayUtils.indexOf(new Object[] {"Array"}, "Object To Find"));
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object)} with {@code array}, {@code objectToFind}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code Array}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayUtils#indexOf(Object[], Object)}
   */
  @Test
  @DisplayName(
      "Test indexOf(Object[], Object) with 'array', 'objectToFind'; when array of Object with 'Array'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object)"})
  void testIndexOfWithArrayObjectToFind_whenArrayOfObjectWithArray2() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new Object[] {"Array"}, null));
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object)} with {@code array}, {@code objectToFind}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link ArrayUtils#indexOf(Object[], Object)}
   */
  @Test
  @DisplayName(
      "Test indexOf(Object[], Object) with 'array', 'objectToFind'; when array of Object with 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object)"})
  void testIndexOfWithArrayObjectToFind_whenArrayOfObjectWithNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, ArrayUtils.indexOf(new Object[] {null}, null));
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object)} with {@code array}, {@code objectToFind}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code Object To Find}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayUtils#indexOf(Object[], Object)}
   */
  @Test
  @DisplayName(
      "Test indexOf(Object[], Object) with 'array', 'objectToFind'; when array of Object with 'Object To Find'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object)"})
  void testIndexOfWithArrayObjectToFind_whenArrayOfObjectWithObjectToFind() {
    // Arrange, Act and Assert
    assertEquals(0, ArrayUtils.indexOf(new Object[] {"Object To Find"}, "Object To Find"));
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object)} with {@code array}, {@code objectToFind}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link CollectionUtils#INDEX_NOT_FOUND}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayUtils#indexOf(Object[], Object)}
   */
  @Test
  @DisplayName(
      "Test indexOf(Object[], Object) with 'array', 'objectToFind'; when 'null'; then return INDEX_NOT_FOUND")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object)"})
  void testIndexOfWithArrayObjectToFind_whenNull_thenReturnIndex_not_found() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(null, "Object To Find"));
  }
}
