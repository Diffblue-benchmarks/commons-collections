package org.apache.commons.collections4.keyvalue;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MultiKeyDiffblueTest {
  /**
   * Test {@link MultiKey#MultiKey(Object[])}.
   * <ul>
   *   <li>When array of {@link Object} with {@code Keys}.</li>
   *   <li>Then return first element is {@code Keys}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#MultiKey(Object[])}
   */
  @Test
  @DisplayName("Test new MultiKey(Object[]); when array of Object with 'Keys'; then return first element is 'Keys'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MultiKey.<init>(Object[])"})
  void testNewMultiKey_whenArrayOfObjectWithKeys_thenReturnFirstElementIsKeys() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(new Object[]{"Keys"});

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertEquals("Keys", keys[0]);
    assertEquals(1, actualMultiKey.size());
    assertEquals(1, keys.length);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object[], boolean)}.
   * <ul>
   *   <li>When array of {@link Object} with {@code Keys}.</li>
   *   <li>Then return first element is {@code Keys}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#MultiKey(Object[], boolean)}
   */
  @Test
  @DisplayName("Test new MultiKey(Object[], boolean); when array of Object with 'Keys'; then return first element is 'Keys'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MultiKey.<init>(Object[], boolean)"})
  void testNewMultiKey_whenArrayOfObjectWithKeys_thenReturnFirstElementIsKeys2() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(new Object[]{"Keys"}, true);

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertEquals("Keys", keys[0]);
    assertEquals(1, actualMultiKey.size());
    assertEquals(1, keys.length);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object[])}.
   * <ul>
   *   <li>When array of {@link Object} with {@code null}.</li>
   *   <li>Then return first element is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#MultiKey(Object[])}
   */
  @Test
  @DisplayName("Test new MultiKey(Object[]); when array of Object with 'null'; then return first element is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MultiKey.<init>(Object[])"})
  void testNewMultiKey_whenArrayOfObjectWithNull_thenReturnFirstElementIsNull() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(new Object[]{null});

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertNull(keys[0]);
    assertEquals(1, actualMultiKey.size());
    assertEquals(1, keys.length);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object[], boolean)}.
   * <ul>
   *   <li>When array of {@link Object} with {@code null}.</li>
   *   <li>Then return first element is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#MultiKey(Object[], boolean)}
   */
  @Test
  @DisplayName("Test new MultiKey(Object[], boolean); when array of Object with 'null'; then return first element is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MultiKey.<init>(Object[], boolean)"})
  void testNewMultiKey_whenArrayOfObjectWithNull_thenReturnFirstElementIsNull2() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(new Object[]{null}, true);

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertNull(keys[0]);
    assertEquals(1, actualMultiKey.size());
    assertEquals(1, keys.length);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object[], boolean)}.
   * <ul>
   *   <li>When {@code false}.</li>
   *   <li>Then return first element is {@code Keys}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#MultiKey(Object[], boolean)}
   */
  @Test
  @DisplayName("Test new MultiKey(Object[], boolean); when 'false'; then return first element is 'Keys'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MultiKey.<init>(Object[], boolean)"})
  void testNewMultiKey_whenFalse_thenReturnFirstElementIsKeys() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(new Object[]{"Keys"}, false);

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertEquals("Keys", keys[0]);
    assertEquals(1, actualMultiKey.size());
    assertEquals(1, keys.length);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object, Object, Object, Object, Object)}.
   * <ul>
   *   <li>When five.</li>
   *   <li>Then return first element intValue is five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#MultiKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName("Test new MultiKey(Object, Object, Object, Object, Object); when five; then return first element intValue is five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MultiKey.<init>(Object, Object, Object, Object, Object)"})
  void testNewMultiKey_whenFive_thenReturnFirstElementIntValueIsFive() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(5, "Key2", "Key3", "Key4", "Key5");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertEquals(5, ((Integer) keys[0]).intValue());
    assertEquals(5, keys.length);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object, Object, Object, Object)}.
   * <ul>
   *   <li>When four.</li>
   *   <li>Then return first element intValue is four.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#MultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName("Test new MultiKey(Object, Object, Object, Object); when four; then return first element intValue is four")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MultiKey.<init>(Object, Object, Object, Object)"})
  void testNewMultiKey_whenFour_thenReturnFirstElementIntValueIsFour() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(4, "Key2", "Key3", "Key4");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertEquals(4, ((Integer) keys[0]).intValue());
    assertEquals(4, keys.length);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object, Object)}.
   * <ul>
   *   <li>When {@code Key1}.</li>
   *   <li>Then Keys return {@code String[]}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#MultiKey(Object, Object)}
   */
  @Test
  @DisplayName("Test new MultiKey(Object, Object); when 'Key1'; then Keys return String[]")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MultiKey.<init>(Object, Object)"})
  void testNewMultiKey_whenKey1_thenKeysReturnString() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>("Key1", "Key2");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertTrue(keys instanceof String[]);
    assertEquals(2, actualMultiKey.size());
    assertArrayEquals(new String[]{"Key1", "Key2"}, keys);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object, Object, Object)}.
   * <ul>
   *   <li>When {@code Key1}.</li>
   *   <li>Then Keys return {@code String[]}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#MultiKey(Object, Object, Object)}
   */
  @Test
  @DisplayName("Test new MultiKey(Object, Object, Object); when 'Key1'; then Keys return String[]")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MultiKey.<init>(Object, Object, Object)"})
  void testNewMultiKey_whenKey1_thenKeysReturnString2() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>("Key1", "Key2", "Key3");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertTrue(keys instanceof String[]);
    assertEquals(3, actualMultiKey.size());
    assertArrayEquals(new String[]{"Key1", "Key2", "Key3"}, keys);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object, Object, Object, Object)}.
   * <ul>
   *   <li>When {@code Key1}.</li>
   *   <li>Then Keys return {@code String[]}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#MultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName("Test new MultiKey(Object, Object, Object, Object); when 'Key1'; then Keys return String[]")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MultiKey.<init>(Object, Object, Object, Object)"})
  void testNewMultiKey_whenKey1_thenKeysReturnString3() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>("Key1", "Key2", "Key3", "Key4");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertTrue(keys instanceof String[]);
    assertEquals(4, actualMultiKey.size());
    assertArrayEquals(new String[]{"Key1", "Key2", "Key3", "Key4"}, keys);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object, Object, Object, Object, Object)}.
   * <ul>
   *   <li>When {@code Key1}.</li>
   *   <li>Then Keys return {@code String[]}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#MultiKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName("Test new MultiKey(Object, Object, Object, Object, Object); when 'Key1'; then Keys return String[]")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MultiKey.<init>(Object, Object, Object, Object, Object)"})
  void testNewMultiKey_whenKey1_thenKeysReturnString4() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>("Key1", "Key2", "Key3", "Key4", "Key5");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertTrue(keys instanceof String[]);
    assertEquals(5, actualMultiKey.size());
    assertArrayEquals(new String[]{"Key1", "Key2", "Key3", "Key4", "Key5"}, keys);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return first element is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#MultiKey(Object, Object)}
   */
  @Test
  @DisplayName("Test new MultiKey(Object, Object); when 'null'; then return first element is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MultiKey.<init>(Object, Object)"})
  void testNewMultiKey_whenNull_thenReturnFirstElementIsNull() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(null, "Key2");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertEquals("Key2", keys[1]);
    assertNull(keys[0]);
    assertEquals(2, actualMultiKey.size());
    assertEquals(2, keys.length);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object, Object, Object, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return first element is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#MultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName("Test new MultiKey(Object, Object, Object, Object); when 'null'; then return first element is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MultiKey.<init>(Object, Object, Object, Object)"})
  void testNewMultiKey_whenNull_thenReturnFirstElementIsNull2() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(null, "Key2", "Key3", "Key4");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertNull(keys[0]);
    assertEquals(4, keys.length);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object, Object, Object, Object, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return first element is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#MultiKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName("Test new MultiKey(Object, Object, Object, Object, Object); when 'null'; then return first element is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MultiKey.<init>(Object, Object, Object, Object, Object)"})
  void testNewMultiKey_whenNull_thenReturnFirstElementIsNull3() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(null, "Key2", "Key3", "Key4", "Key5");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertNull(keys[0]);
    assertEquals(5, keys.length);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object, Object, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return second element is {@code Key2}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#MultiKey(Object, Object, Object)}
   */
  @Test
  @DisplayName("Test new MultiKey(Object, Object, Object); when 'null'; then return second element is 'Key2'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MultiKey.<init>(Object, Object, Object)"})
  void testNewMultiKey_whenNull_thenReturnSecondElementIsKey2() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(null, "Key2", "Key3");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertEquals("Key2", keys[1]);
    assertEquals("Key3", keys[2]);
    assertNull(keys[0]);
    assertEquals(3, actualMultiKey.size());
    assertEquals(3, keys.length);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object, Object, Object)}.
   * <ul>
   *   <li>When three.</li>
   *   <li>Then return first element intValue is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#MultiKey(Object, Object, Object)}
   */
  @Test
  @DisplayName("Test new MultiKey(Object, Object, Object); when three; then return first element intValue is three")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MultiKey.<init>(Object, Object, Object)"})
  void testNewMultiKey_whenThree_thenReturnFirstElementIntValueIsThree() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(3, "Key2", "Key3");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertEquals(3, ((Integer) keys[0]).intValue());
    assertEquals(3, keys.length);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object, Object)}.
   * <ul>
   *   <li>When two.</li>
   *   <li>Then return first element intValue is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#MultiKey(Object, Object)}
   */
  @Test
  @DisplayName("Test new MultiKey(Object, Object); when two; then return first element intValue is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MultiKey.<init>(Object, Object)"})
  void testNewMultiKey_whenTwo_thenReturnFirstElementIntValueIsTwo() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(2, "Key2");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertEquals("Key2", keys[1]);
    assertEquals(2, ((Integer) keys[0]).intValue());
    assertEquals(2, actualMultiKey.size());
    assertEquals(2, keys.length);
  }

  /**
   * Test {@link MultiKey#equals(Object)}, and {@link MultiKey#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link MultiKey#equals(Object)}
   *   <li>{@link MultiKey#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MultiKey.equals(Object)", "int MultiKey.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{"Keys"});
    MultiKey<Object> multiKey2 = new MultiKey<>(new Object[]{"Keys"});

    // Act and Assert
    assertEquals(multiKey, multiKey2);
    int expectedHashCodeResult = multiKey.hashCode();
    assertEquals(expectedHashCodeResult, multiKey2.hashCode());
  }

  /**
   * Test {@link MultiKey#equals(Object)}, and {@link MultiKey#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link MultiKey#equals(Object)}
   *   <li>{@link MultiKey#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MultiKey.equals(Object)", "int MultiKey.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{"Keys"});

    // Act and Assert
    assertEquals(multiKey, multiKey);
    int expectedHashCodeResult = multiKey.hashCode();
    assertEquals(expectedHashCodeResult, multiKey.hashCode());
  }

  /**
   * Test {@link MultiKey#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MultiKey.equals(Object)", "int MultiKey.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{1});

    // Act and Assert
    assertNotEquals(multiKey, new MultiKey<>(new Object[]{"Keys"}));
  }

  /**
   * Test {@link MultiKey#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MultiKey.equals(Object)", "int MultiKey.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{new MultiKey<>(new Object[]{"Keys"})});

    // Act and Assert
    assertNotEquals(multiKey, new MultiKey<>(new Object[]{"Keys"}));
  }

  /**
   * Test {@link MultiKey#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MultiKey.equals(Object)", "int MultiKey.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{"Keys"});

    // Act and Assert
    assertNotEquals(multiKey, null);
  }

  /**
   * Test {@link MultiKey#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MultiKey.equals(Object)", "int MultiKey.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{"Keys"});

    // Act and Assert
    assertNotEquals(multiKey, "Different type to MultiKey");
  }

  /**
   * Test {@link MultiKey#getKey(int)}.
   * <ul>
   *   <li>Given {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@code Keys} and {@code Keys}.</li>
   *   <li>Then return {@code Keys}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#getKey(int)}
   */
  @Test
  @DisplayName("Test getKey(int); given MultiKey(Object[]) with keys is array of Object with 'Keys' and 'Keys'; then return 'Keys'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object MultiKey.getKey(int)"})
  void testGetKey_givenMultiKeyWithKeysIsArrayOfObjectWithKeysAndKeys_thenReturnKeys() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{"Keys", "Keys"});

    // Act and Assert
    assertEquals("Keys", multiKey.getKey(1));
  }

  /**
   * Test {@link MultiKey#getKeys()}.
   * <p>
   * Method under test: {@link MultiKey#getKeys()}
   */
  @Test
  @DisplayName("Test getKeys()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object[] MultiKey.getKeys()"})
  void testGetKeys() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{"Keys"});

    // Act
    Object[] actualKeys = multiKey.getKeys();

    // Assert
    assertEquals("Keys", actualKeys[0]);
    assertEquals(1, actualKeys.length);
  }

  /**
   * Test {@link MultiKey#readResolve()}.
   * <ul>
   *   <li>Then return {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@code Keys}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#readResolve()}
   */
  @Test
  @DisplayName("Test readResolve(); then return MultiKey(Object[]) with keys is array of Object with 'Keys'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object MultiKey.readResolve()"})
  void testReadResolve_thenReturnMultiKeyWithKeysIsArrayOfObjectWithKeys() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{"Keys"});

    // Act and Assert
    assertSame(multiKey, multiKey.readResolve());
  }

  /**
   * Test {@link MultiKey#readResolve()}.
   * <ul>
   *   <li>Then return {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiKey#readResolve()}
   */
  @Test
  @DisplayName("Test readResolve(); then return MultiKey(Object[]) with keys is array of Object with 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object MultiKey.readResolve()"})
  void testReadResolve_thenReturnMultiKeyWithKeysIsArrayOfObjectWithNull() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{null});

    // Act and Assert
    assertSame(multiKey, multiKey.readResolve());
  }

  /**
   * Test {@link MultiKey#size()}.
   * <p>
   * Method under test: {@link MultiKey#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int MultiKey.size()"})
  void testSize() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{"Keys"});

    // Act and Assert
    assertEquals(1, multiKey.size());
  }

  /**
   * Test {@link MultiKey#toString()}.
   * <p>
   * Method under test: {@link MultiKey#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String MultiKey.toString()"})
  void testToString() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{"Keys"});

    // Act and Assert
    assertEquals("MultiKey[Keys]", multiKey.toString());
  }
}
