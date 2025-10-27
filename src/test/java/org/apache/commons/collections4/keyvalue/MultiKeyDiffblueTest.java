package org.apache.commons.collections4.keyvalue;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MultiKeyDiffblueTest {
  /**
   * Method under test: {@link MultiKey#getKey(int)}
   */
  @Test
  public void testGetKey() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{"Keys", "Keys"});

    // Act and Assert
    assertEquals("Keys", multiKey.getKey(1));
  }

  /**
   * Method under test: {@link MultiKey#getKeys()}
   */
  @Test
  public void testGetKeys() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{"Keys"});

    // Act
    Object[] actualKeys = multiKey.getKeys();

    // Assert
    assertEquals("Keys", actualKeys[0]);
    assertEquals(1, actualKeys.length);
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link MultiKey#equals(Object)}
   *   <li>{@link MultiKey#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{"Keys"});
    MultiKey<Object> multiKey2 = new MultiKey<>(new Object[]{"Keys"});

    // Act and Assert
    assertEquals(multiKey, multiKey2);
    int expectedHashCodeResult = multiKey.hashCode();
    assertEquals(expectedHashCodeResult, multiKey2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link MultiKey#equals(Object)}
   *   <li>{@link MultiKey#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{"Keys"});

    // Act and Assert
    assertEquals(multiKey, multiKey);
    int expectedHashCodeResult = multiKey.hashCode();
    assertEquals(expectedHashCodeResult, multiKey.hashCode());
  }

  /**
   * Method under test: {@link MultiKey#readResolve()}
   */
  @Test
  public void testReadResolve() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{"Keys"});

    // Act and Assert
    assertSame(multiKey, multiKey.readResolve());
  }

  /**
   * Method under test: {@link MultiKey#readResolve()}
   */
  @Test
  public void testReadResolve2() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{null});

    // Act and Assert
    assertSame(multiKey, multiKey.readResolve());
  }

  /**
   * Method under test: {@link MultiKey#size()}
   */
  @Test
  public void testSize() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{"Keys"});

    // Act and Assert
    assertEquals(1, multiKey.size());
  }

  /**
   * Method under test: {@link MultiKey#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{1});

    // Act and Assert
    assertNotEquals(multiKey, new MultiKey<>(new Object[]{"Keys"}));
  }

  /**
   * Method under test: {@link MultiKey#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{new MultiKey<>(new Object[]{"Keys"})});

    // Act and Assert
    assertNotEquals(multiKey, new MultiKey<>(new Object[]{"Keys"}));
  }

  /**
   * Method under test: {@link MultiKey#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{"Keys"});

    // Act and Assert
    assertNotEquals(multiKey, null);
  }

  /**
   * Method under test: {@link MultiKey#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{"Keys"});

    // Act and Assert
    assertNotEquals(multiKey, "Different type to MultiKey");
  }

  /**
   * Method under test: {@link MultiKey#MultiKey(Object, Object)}
   */
  @Test
  public void testNewMultiKey() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>("Key1", "Key2");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertTrue(keys instanceof String[]);
    assertEquals(2, actualMultiKey.size());
    assertArrayEquals(new String[]{"Key1", "Key2"}, keys);
  }

  /**
   * Method under test: {@link MultiKey#MultiKey(Object, Object)}
   */
  @Test
  public void testNewMultiKey2() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(2, "Key2");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertEquals("Key2", keys[1]);
    assertEquals(2, actualMultiKey.size());
    assertEquals(2, keys.length);
  }

  /**
   * Method under test: {@link MultiKey#MultiKey(Object, Object)}
   */
  @Test
  public void testNewMultiKey3() {
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
   * Method under test: {@link MultiKey#MultiKey(Object, Object, Object)}
   */
  @Test
  public void testNewMultiKey4() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>("Key1", "Key2", "Key3");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertTrue(keys instanceof String[]);
    assertEquals(3, actualMultiKey.size());
    assertArrayEquals(new String[]{"Key1", "Key2", "Key3"}, keys);
  }

  /**
   * Method under test: {@link MultiKey#MultiKey(Object, Object, Object)}
   */
  @Test
  public void testNewMultiKey5() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(3, "Key2", "Key3");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertEquals("Key2", keys[1]);
    assertEquals("Key3", keys[2]);
    assertEquals(3, actualMultiKey.size());
    assertEquals(3, keys.length);
  }

  /**
   * Method under test: {@link MultiKey#MultiKey(Object, Object, Object)}
   */
  @Test
  public void testNewMultiKey6() {
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
   * Method under test: {@link MultiKey#MultiKey(Object, Object, Object, Object)}
   */
  @Test
  public void testNewMultiKey7() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>("Key1", "Key2", "Key3", "Key4");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertTrue(keys instanceof String[]);
    assertEquals(4, actualMultiKey.size());
    assertArrayEquals(new String[]{"Key1", "Key2", "Key3", "Key4"}, keys);
  }

  /**
   * Method under test: {@link MultiKey#MultiKey(Object, Object, Object, Object)}
   */
  @Test
  public void testNewMultiKey8() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(4, "Key2", "Key3", "Key4");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertEquals("Key2", keys[1]);
    assertEquals("Key3", keys[2]);
    assertEquals("Key4", keys[3]);
    assertEquals(4, actualMultiKey.size());
    assertEquals(4, keys.length);
  }

  /**
   * Method under test: {@link MultiKey#MultiKey(Object, Object, Object, Object)}
   */
  @Test
  public void testNewMultiKey9() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(null, "Key2", "Key3", "Key4");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertEquals("Key2", keys[1]);
    assertEquals("Key3", keys[2]);
    assertEquals("Key4", keys[3]);
    assertNull(keys[0]);
    assertEquals(4, actualMultiKey.size());
    assertEquals(4, keys.length);
  }

  /**
   * Method under test:
   * {@link MultiKey#MultiKey(Object, Object, Object, Object, Object)}
   */
  @Test
  public void testNewMultiKey10() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>("Key1", "Key2", "Key3", "Key4", "Key5");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertTrue(keys instanceof String[]);
    assertEquals(5, actualMultiKey.size());
    assertArrayEquals(new String[]{"Key1", "Key2", "Key3", "Key4", "Key5"}, keys);
  }

  /**
   * Method under test:
   * {@link MultiKey#MultiKey(Object, Object, Object, Object, Object)}
   */
  @Test
  public void testNewMultiKey11() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(5, "Key2", "Key3", "Key4", "Key5");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertEquals("Key2", keys[1]);
    assertEquals("Key3", keys[2]);
    assertEquals("Key4", keys[3]);
    assertEquals("Key5", keys[4]);
    assertEquals(5, actualMultiKey.size());
    assertEquals(5, keys.length);
  }

  /**
   * Method under test:
   * {@link MultiKey#MultiKey(Object, Object, Object, Object, Object)}
   */
  @Test
  public void testNewMultiKey12() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(null, "Key2", "Key3", "Key4", "Key5");

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertEquals("Key2", keys[1]);
    assertEquals("Key3", keys[2]);
    assertEquals("Key4", keys[3]);
    assertEquals("Key5", keys[4]);
    assertNull(keys[0]);
    assertEquals(5, actualMultiKey.size());
    assertEquals(5, keys.length);
  }

  /**
   * Method under test: {@link MultiKey#MultiKey(Object[])}
   */
  @Test
  public void testNewMultiKey13() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(new Object[]{"Keys"});

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertEquals("Keys", keys[0]);
    assertEquals(1, actualMultiKey.size());
    assertEquals(1, keys.length);
  }

  /**
   * Method under test: {@link MultiKey#MultiKey(Object[])}
   */
  @Test
  public void testNewMultiKey14() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(new Object[]{null});

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertNull(keys[0]);
    assertEquals(1, actualMultiKey.size());
    assertEquals(1, keys.length);
  }

  /**
   * Method under test: {@link MultiKey#MultiKey(Object[], boolean)}
   */
  @Test
  public void testNewMultiKey15() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(new Object[]{"Keys"}, true);

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertEquals("Keys", keys[0]);
    assertEquals(1, actualMultiKey.size());
    assertEquals(1, keys.length);
  }

  /**
   * Method under test: {@link MultiKey#MultiKey(Object[], boolean)}
   */
  @Test
  public void testNewMultiKey16() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(new Object[]{null}, true);

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertNull(keys[0]);
    assertEquals(1, actualMultiKey.size());
    assertEquals(1, keys.length);
  }

  /**
   * Method under test: {@link MultiKey#MultiKey(Object[], boolean)}
   */
  @Test
  public void testNewMultiKey17() {
    // Arrange and Act
    MultiKey<Object> actualMultiKey = new MultiKey<>(new Object[]{"Keys"}, false);

    // Assert
    Object[] keys = actualMultiKey.getKeys();
    assertEquals("Keys", keys[0]);
    assertEquals(1, actualMultiKey.size());
    assertEquals(1, keys.length);
  }

  /**
   * Method under test: {@link MultiKey#toString()}
   */
  @Test
  public void testToString() {
    // Arrange
    MultiKey<Object> multiKey = new MultiKey<>(new Object[]{"Keys"});

    // Act and Assert
    assertEquals("MultiKey[Keys]", multiKey.toString());
  }
}
