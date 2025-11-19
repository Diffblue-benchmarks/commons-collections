package org.apache.commons.collections4.keyvalue;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MultiKeyDiffblueTest {
  /**
   * Test {@link MultiKey#MultiKey(Object[])}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code Keys}.
   *   <li>Then return first element is {@code Keys}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#MultiKey(Object[])}
   */
  @Test
  @DisplayName(
      "Test new MultiKey(Object[]); when array of Object with 'Keys'; then return first element is 'Keys'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MultiKey.<init>(Object[])"})
  void testNewMultiKey_whenArrayOfObjectWithKeys_thenReturnFirstElementIsKeys() {
    // Arrange
    Object[] keys = new Object[] {"Keys"};

    // Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(keys);

    // Assert
    Object[] keys2 = actualMultiKey.getKeys();
    assertEquals("Keys", keys2[0]);
    assertEquals(1, actualMultiKey.size());
    assertEquals(1, keys2.length);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object[], boolean)}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code Keys}.
   *   <li>Then return first element is {@code Keys}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#MultiKey(Object[], boolean)}
   */
  @Test
  @DisplayName(
      "Test new MultiKey(Object[], boolean); when array of Object with 'Keys'; then return first element is 'Keys'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MultiKey.<init>(Object[], boolean)"})
  void testNewMultiKey_whenArrayOfObjectWithKeys_thenReturnFirstElementIsKeys2() {
    // Arrange
    Object[] keys = new Object[] {"Keys"};

    // Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(keys, true);

    // Assert
    Object[] keys2 = actualMultiKey.getKeys();
    assertEquals("Keys", keys2[0]);
    assertEquals(1, actualMultiKey.size());
    assertEquals(1, keys2.length);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object[])}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code null}.
   *   <li>Then return first element is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#MultiKey(Object[])}
   */
  @Test
  @DisplayName(
      "Test new MultiKey(Object[]); when array of Object with 'null'; then return first element is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MultiKey.<init>(Object[])"})
  void testNewMultiKey_whenArrayOfObjectWithNull_thenReturnFirstElementIsNull() {
    // Arrange
    Object[] keys = new Object[] {null};

    // Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(keys);

    // Assert
    Object[] keys2 = actualMultiKey.getKeys();
    assertNull(keys2[0]);
    assertEquals(1, actualMultiKey.size());
    assertEquals(1, keys2.length);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object[], boolean)}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code null}.
   *   <li>Then return first element is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#MultiKey(Object[], boolean)}
   */
  @Test
  @DisplayName(
      "Test new MultiKey(Object[], boolean); when array of Object with 'null'; then return first element is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MultiKey.<init>(Object[], boolean)"})
  void testNewMultiKey_whenArrayOfObjectWithNull_thenReturnFirstElementIsNull2() {
    // Arrange
    Object[] keys = new Object[] {null};

    // Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(keys, true);

    // Assert
    Object[] keys2 = actualMultiKey.getKeys();
    assertNull(keys2[0]);
    assertEquals(1, actualMultiKey.size());
    assertEquals(1, keys2.length);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object[], boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return first element is {@code Keys}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#MultiKey(Object[], boolean)}
   */
  @Test
  @DisplayName(
      "Test new MultiKey(Object[], boolean); when 'false'; then return first element is 'Keys'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MultiKey.<init>(Object[], boolean)"})
  void testNewMultiKey_whenFalse_thenReturnFirstElementIsKeys() {
    // Arrange
    Object[] keys = new Object[] {"Keys"};

    // Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(keys, false);

    // Assert
    Object[] keys2 = actualMultiKey.getKeys();
    assertEquals("Keys", keys2[0]);
    assertEquals(1, actualMultiKey.size());
    assertEquals(1, keys2.length);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object, Object, Object, Object, Object)}.
   *
   * <ul>
   *   <li>When five.
   *   <li>Then return first element intValue is five.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#MultiKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test new MultiKey(Object, Object, Object, Object, Object); when five; then return first element intValue is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>When four.
   *   <li>Then return first element intValue is four.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#MultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test new MultiKey(Object, Object, Object, Object); when four; then return first element intValue is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>When {@code Key1}.
   *   <li>Then Keys return {@code String[]}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#MultiKey(Object, Object)}
   */
  @Test
  @DisplayName("Test new MultiKey(Object, Object); when 'Key1'; then Keys return String[]")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MultiKey.<init>(Object, Object)"})
  void testNewMultiKey_whenKey1_thenKeysReturnString() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>("Key1", "Key2");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertTrue(keys instanceof String[]);
    assertEquals(2, actualMultiKey.size());
    assertArrayEquals(new String[] {"Key1", "Key2"}, keys);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object, Object, Object)}.
   *
   * <ul>
   *   <li>When {@code Key1}.
   *   <li>Then Keys return {@code String[]}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#MultiKey(Object, Object, Object)}
   */
  @Test
  @DisplayName("Test new MultiKey(Object, Object, Object); when 'Key1'; then Keys return String[]")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MultiKey.<init>(Object, Object, Object)"})
  void testNewMultiKey_whenKey1_thenKeysReturnString2() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>("Key1", "Key2", "Key3");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertTrue(keys instanceof String[]);
    assertEquals(3, actualMultiKey.size());
    assertArrayEquals(new String[] {"Key1", "Key2", "Key3"}, keys);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object, Object, Object, Object)}.
   *
   * <ul>
   *   <li>When {@code Key1}.
   *   <li>Then Keys return {@code String[]}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#MultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test new MultiKey(Object, Object, Object, Object); when 'Key1'; then Keys return String[]")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MultiKey.<init>(Object, Object, Object, Object)"})
  void testNewMultiKey_whenKey1_thenKeysReturnString3() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>("Key1", "Key2", "Key3", "Key4");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertTrue(keys instanceof String[]);
    assertEquals(4, actualMultiKey.size());
    assertArrayEquals(new String[] {"Key1", "Key2", "Key3", "Key4"}, keys);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object, Object, Object, Object, Object)}.
   *
   * <ul>
   *   <li>When {@code Key1}.
   *   <li>Then Keys return {@code String[]}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#MultiKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test new MultiKey(Object, Object, Object, Object, Object); when 'Key1'; then Keys return String[]")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MultiKey.<init>(Object, Object, Object, Object, Object)"})
  void testNewMultiKey_whenKey1_thenKeysReturnString4() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>("Key1", "Key2", "Key3", "Key4", "Key5");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertTrue(keys instanceof String[]);
    assertEquals(5, actualMultiKey.size());
    assertArrayEquals(new String[] {"Key1", "Key2", "Key3", "Key4", "Key5"}, keys);
  }

  /**
   * Test {@link MultiKey#MultiKey(Object, Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return first element is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#MultiKey(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test new MultiKey(Object, Object); when 'null'; then return first element is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return first element is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#MultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test new MultiKey(Object, Object, Object, Object); when 'null'; then return first element is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return first element is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#MultiKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test new MultiKey(Object, Object, Object, Object, Object); when 'null'; then return first element is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return second element is {@code Key2}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#MultiKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test new MultiKey(Object, Object, Object); when 'null'; then return second element is 'Key2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return first element intValue is three.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#MultiKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test new MultiKey(Object, Object, Object); when three; then return first element intValue is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return first element intValue is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#MultiKey(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test new MultiKey(Object, Object); when two; then return first element intValue is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MultiKey#equals(Object)}
   *   <li>{@link MultiKey#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKey.equals(Object)", "int MultiKey.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Object[] keys = new Object[] {"Keys"};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    Object[] keys2 = new Object[] {"Keys"};
    MultiKey<Object> multiKey2 = new MultiKey<>(keys2);

    // Act and Assert
    assertEquals(multiKey, multiKey2);
    assertEquals(multiKey.hashCode(), multiKey2.hashCode());
  }

  /**
   * Test {@link MultiKey#equals(Object)}, and {@link MultiKey#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MultiKey#equals(Object)}
   *   <li>{@link MultiKey#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKey.equals(Object)", "int MultiKey.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Object[] keys = new Object[] {"Keys"};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertEquals(multiKey, multiKey);
    int expectedHashCodeResult = multiKey.hashCode();
    assertEquals(expectedHashCodeResult, multiKey.hashCode());
  }

  /**
   * Test {@link MultiKey#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKey.equals(Object)", "int MultiKey.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>("Key1", "Key2");
    Object[] keys = new Object[] {"Keys"};
    MultiKey<Object> multiKey2 = new MultiKey<>(keys);

    // Act and Assert
    assertNotEquals(multiKey, multiKey2);
  }

  /**
   * Test {@link MultiKey#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKey.equals(Object)", "int MultiKey.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Object[] keys = new Object[] {"Keys"};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    Object[] keys2 = new Object[] {multiKey};
    MultiKey<Object> multiKey2 = new MultiKey<>(keys2);
    Object[] keys3 = new Object[] {"Keys"};
    MultiKey<Object> multiKey3 = new MultiKey<>(keys3);

    // Act and Assert
    assertNotEquals(multiKey2, multiKey3);
  }

  /**
   * Test {@link MultiKey#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKey.equals(Object)", "int MultiKey.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Object[] keys = new Object[] {"Keys"};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNotEquals(multiKey, null);
  }

  /**
   * Test {@link MultiKey#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKey.equals(Object)", "int MultiKey.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Object[] keys = new Object[] {"Keys"};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNotEquals(multiKey, "Different type to MultiKey");
  }

  /**
   * Test {@link MultiKey#getKey(int)}.
   *
   * <ul>
   *   <li>Given {@link MultiKey#MultiKey(Object, Object)} with {@code Key1} and {@code Key2}.
   *   <li>Then return {@code Key2}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#getKey(int)}
   */
  @Test
  @DisplayName(
      "Test getKey(int); given MultiKey(Object, Object) with 'Key1' and 'Key2'; then return 'Key2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKey.getKey(int)"})
  void testGetKey_givenMultiKeyWithKey1AndKey2_thenReturnKey2() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>("Key1", "Key2");

    // Act and Assert
    assertEquals("Key2", multiKey.getKey(1));
  }

  /**
   * Test {@link MultiKey#getKeys()}.
   *
   * <p>Method under test: {@link MultiKey#getKeys()}
   */
  @Test
  @DisplayName("Test getKeys()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] MultiKey.getKeys()"})
  void testGetKeys() {
    // Arrange
    Object[] keys = new Object[] {"Keys"};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act
    Object[] actualKeys = multiKey.getKeys();

    // Assert
    assertEquals("Keys", actualKeys[0]);
    assertEquals(1, actualKeys.length);
  }

  /**
   * Test {@link MultiKey#readResolve()}.
   *
   * <ul>
   *   <li>Then return {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with
   *       {@code Keys}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#readResolve()}
   */
  @Test
  @DisplayName(
      "Test readResolve(); then return MultiKey(Object[]) with keys is array of Object with 'Keys'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKey.readResolve()"})
  void testReadResolve_thenReturnMultiKeyWithKeysIsArrayOfObjectWithKeys() {
    // Arrange
    Object[] keys = new Object[] {"Keys"};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act
    Object actualReadResolveResult = multiKey.readResolve();

    // Assert
    assertSame(multiKey, actualReadResolveResult);
  }

  /**
   * Test {@link MultiKey#readResolve()}.
   *
   * <ul>
   *   <li>Then return {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with
   *       {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKey#readResolve()}
   */
  @Test
  @DisplayName(
      "Test readResolve(); then return MultiKey(Object[]) with keys is array of Object with 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKey.readResolve()"})
  void testReadResolve_thenReturnMultiKeyWithKeysIsArrayOfObjectWithNull() {
    // Arrange
    Object[] keys = new Object[] {null};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act
    Object actualReadResolveResult = multiKey.readResolve();

    // Assert
    assertSame(multiKey, actualReadResolveResult);
  }

  /**
   * Test {@link MultiKey#size()}.
   *
   * <p>Method under test: {@link MultiKey#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MultiKey.size()"})
  void testSize() {
    // Arrange
    Object[] keys = new Object[] {"Keys"};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertEquals(1, multiKey.size());
  }

  /**
   * Test {@link MultiKey#toString()}.
   *
   * <p>Method under test: {@link MultiKey#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String MultiKey.toString()"})
  void testToString() {
    // Arrange
    Object[] keys = new Object[] {"Keys"};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertEquals("MultiKey[Keys]", multiKey.toString());
  }
}
