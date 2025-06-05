package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ArrayUtilsDiffblueTest {
  /**
   * Test {@link ArrayUtils#contains(Object[], Object)}.
   * <ul>
   *   <li>When array of {@link Object} with {@code Array}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayUtils#contains(Object[], Object)}
   */
  @Test
  @DisplayName("Test contains(Object[], Object); when array of Object with 'Array'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ArrayUtils.contains(Object[], Object)"})
  void testContains_whenArrayOfObjectWithArray_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(ArrayUtils.contains(new Object[]{"Array"}, "Object To Find"));
  }

  /**
   * Test {@link ArrayUtils#contains(Object[], Object)}.
   * <ul>
   *   <li>When array of {@link Object} with {@code Array}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayUtils#contains(Object[], Object)}
   */
  @Test
  @DisplayName("Test contains(Object[], Object); when array of Object with 'Array'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ArrayUtils.contains(Object[], Object)"})
  void testContains_whenArrayOfObjectWithArray_thenReturnFalse2() {
    // Arrange, Act and Assert
    assertFalse(ArrayUtils.contains(new Object[]{"Array"}, null));
  }

  /**
   * Test {@link ArrayUtils#contains(Object[], Object)}.
   * <ul>
   *   <li>When array of {@link Object} with {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayUtils#contains(Object[], Object)}
   */
  @Test
  @DisplayName("Test contains(Object[], Object); when array of Object with 'null'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ArrayUtils.contains(Object[], Object)"})
  void testContains_whenArrayOfObjectWithNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(ArrayUtils.contains(new Object[]{null}, null));
  }

  /**
   * Test {@link ArrayUtils#contains(Object[], Object)}.
   * <ul>
   *   <li>When array of {@link Object} with {@code Object To Find}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayUtils#contains(Object[], Object)}
   */
  @Test
  @DisplayName("Test contains(Object[], Object); when array of Object with 'Object To Find'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ArrayUtils.contains(Object[], Object)"})
  void testContains_whenArrayOfObjectWithObjectToFind_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(ArrayUtils.contains(new Object[]{"Object To Find"}, "Object To Find"));
  }

  /**
   * Test {@link ArrayUtils#contains(Object[], Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayUtils#contains(Object[], Object)}
   */
  @Test
  @DisplayName("Test contains(Object[], Object); when 'null'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ArrayUtils.contains(Object[], Object)"})
  void testContains_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(ArrayUtils.contains(null, "Object To Find"));
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object, int)} with {@code array}, {@code objectToFind}, {@code startIndex}.
   * <p>
   * Method under test: {@link ArrayUtils#indexOf(Object[], Object, int)}
   */
  @Test
  @DisplayName("Test indexOf(Object[], Object, int) with 'array', 'objectToFind', 'startIndex'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object, int)"})
  void testIndexOfWithArrayObjectToFindStartIndex() {
    // Arrange, Act and Assert
    assertEquals(1, ArrayUtils.indexOf(new Object[]{"Array", "Object To Find"}, "Object To Find", 1));
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object, int)} with {@code array}, {@code objectToFind}, {@code startIndex}.
   * <ul>
   *   <li>When array of {@link Object} with {@code Array}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayUtils#indexOf(Object[], Object, int)}
   */
  @Test
  @DisplayName("Test indexOf(Object[], Object, int) with 'array', 'objectToFind', 'startIndex'; when array of Object with 'Array'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object, int)"})
  void testIndexOfWithArrayObjectToFindStartIndex_whenArrayOfObjectWithArray() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new Object[]{"Array"}, "Object To Find", 1));
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object, int)} with {@code array}, {@code objectToFind}, {@code startIndex}.
   * <ul>
   *   <li>When array of {@link Object} with {@code Array}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayUtils#indexOf(Object[], Object, int)}
   */
  @Test
  @DisplayName("Test indexOf(Object[], Object, int) with 'array', 'objectToFind', 'startIndex'; when array of Object with 'Array'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object, int)"})
  void testIndexOfWithArrayObjectToFindStartIndex_whenArrayOfObjectWithArray2() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new Object[]{"Array"}, null, 1));
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object, int)} with {@code array}, {@code objectToFind}, {@code startIndex}.
   * <ul>
   *   <li>When array of {@link Object} with {@code Array} and {@code Array}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayUtils#indexOf(Object[], Object, int)}
   */
  @Test
  @DisplayName("Test indexOf(Object[], Object, int) with 'array', 'objectToFind', 'startIndex'; when array of Object with 'Array' and 'Array'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object, int)"})
  void testIndexOfWithArrayObjectToFindStartIndex_whenArrayOfObjectWithArrayAndArray() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND,
        ArrayUtils.indexOf(new Object[]{"Array", "Array"}, "Object To Find", 1));
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object, int)} with {@code array}, {@code objectToFind}, {@code startIndex}.
   * <ul>
   *   <li>When array of {@link Object} with {@code Array} and {@code Array}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayUtils#indexOf(Object[], Object, int)}
   */
  @Test
  @DisplayName("Test indexOf(Object[], Object, int) with 'array', 'objectToFind', 'startIndex'; when array of Object with 'Array' and 'Array'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object, int)"})
  void testIndexOfWithArrayObjectToFindStartIndex_whenArrayOfObjectWithArrayAndArray2() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new Object[]{"Array", "Array"}, null, 1));
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object, int)} with {@code array}, {@code objectToFind}, {@code startIndex}.
   * <ul>
   *   <li>When array of {@link Object} with {@code Array} and {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayUtils#indexOf(Object[], Object, int)}
   */
  @Test
  @DisplayName("Test indexOf(Object[], Object, int) with 'array', 'objectToFind', 'startIndex'; when array of Object with 'Array' and 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object, int)"})
  void testIndexOfWithArrayObjectToFindStartIndex_whenArrayOfObjectWithArrayAndNull() {
    // Arrange, Act and Assert
    assertEquals(1, ArrayUtils.indexOf(new Object[]{"Array", null}, null, 1));
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object, int)} with {@code array}, {@code objectToFind}, {@code startIndex}.
   * <ul>
   *   <li>When {@link CollectionUtils#INDEX_NOT_FOUND}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayUtils#indexOf(Object[], Object, int)}
   */
  @Test
  @DisplayName("Test indexOf(Object[], Object, int) with 'array', 'objectToFind', 'startIndex'; when INDEX_NOT_FOUND")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object, int)"})
  void testIndexOfWithArrayObjectToFindStartIndex_whenIndex_not_found() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND,
        ArrayUtils.indexOf(new Object[]{"Array"}, "Object To Find", CollectionUtils.INDEX_NOT_FOUND));
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object, int)} with {@code array}, {@code objectToFind}, {@code startIndex}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link CollectionUtils#INDEX_NOT_FOUND}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayUtils#indexOf(Object[], Object, int)}
   */
  @Test
  @DisplayName("Test indexOf(Object[], Object, int) with 'array', 'objectToFind', 'startIndex'; when 'null'; then return INDEX_NOT_FOUND")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object, int)"})
  void testIndexOfWithArrayObjectToFindStartIndex_whenNull_thenReturnIndex_not_found() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(null, "Object To Find", 1));
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object)} with {@code array}, {@code objectToFind}.
   * <ul>
   *   <li>When array of {@link Object} with {@code Array}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayUtils#indexOf(Object[], Object)}
   */
  @Test
  @DisplayName("Test indexOf(Object[], Object) with 'array', 'objectToFind'; when array of Object with 'Array'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object)"})
  void testIndexOfWithArrayObjectToFind_whenArrayOfObjectWithArray() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new Object[]{"Array"}, "Object To Find"));
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object)} with {@code array}, {@code objectToFind}.
   * <ul>
   *   <li>When array of {@link Object} with {@code Array}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayUtils#indexOf(Object[], Object)}
   */
  @Test
  @DisplayName("Test indexOf(Object[], Object) with 'array', 'objectToFind'; when array of Object with 'Array'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object)"})
  void testIndexOfWithArrayObjectToFind_whenArrayOfObjectWithArray2() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new Object[]{"Array"}, null));
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object)} with {@code array}, {@code objectToFind}.
   * <ul>
   *   <li>When array of {@link Object} with {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayUtils#indexOf(Object[], Object)}
   */
  @Test
  @DisplayName("Test indexOf(Object[], Object) with 'array', 'objectToFind'; when array of Object with 'null'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object)"})
  void testIndexOfWithArrayObjectToFind_whenArrayOfObjectWithNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, ArrayUtils.indexOf(new Object[]{null}, null));
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object)} with {@code array}, {@code objectToFind}.
   * <ul>
   *   <li>When array of {@link Object} with {@code Object To Find}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayUtils#indexOf(Object[], Object)}
   */
  @Test
  @DisplayName("Test indexOf(Object[], Object) with 'array', 'objectToFind'; when array of Object with 'Object To Find'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object)"})
  void testIndexOfWithArrayObjectToFind_whenArrayOfObjectWithObjectToFind() {
    // Arrange, Act and Assert
    assertEquals(0, ArrayUtils.indexOf(new Object[]{"Object To Find"}, "Object To Find"));
  }

  /**
   * Test {@link ArrayUtils#indexOf(Object[], Object)} with {@code array}, {@code objectToFind}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link CollectionUtils#INDEX_NOT_FOUND}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayUtils#indexOf(Object[], Object)}
   */
  @Test
  @DisplayName("Test indexOf(Object[], Object) with 'array', 'objectToFind'; when 'null'; then return INDEX_NOT_FOUND")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ArrayUtils.indexOf(Object[], Object)"})
  void testIndexOfWithArrayObjectToFind_whenNull_thenReturnIndex_not_found() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(null, "Object To Find"));
  }
}
