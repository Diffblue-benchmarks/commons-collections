package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.map.AbstractHashedMap.HashEntry;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class HashedMapDiffblueTest {
  /**
   * Test {@link HashedMap#HashedMap()}.
   *
   * <p>Method under test: {@link HashedMap#HashedMap()}
   */
  @Test
  @DisplayName("Test new HashedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HashedMap.<init>()"})
  void testNewHashedMap() {
    // Arrange and Act
    HashedMap<Object, Object> actualObjectObjectMap = new HashedMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link HashedMap#clone()}.
   *
   * <p>Method under test: {@link HashedMap#clone()}
   */
  @Test
  @DisplayName("Test clone()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HashedMap HashedMap.clone()"})
  void testClone() {
    // Arrange
    HashEntry<Object, Object> next = mock(HashEntry.class);
    when(next.getKey()).thenReturn(AbstractHashedMap.NULL);
    when(next.getValue()).thenReturn(AbstractHashedMap.NULL);
    HashEntry<Object, Object> entry =
        new HashEntry<>(next, 19088743, new AbstractHashedMap<>(), AbstractHashedMap.NULL);

    HashedMap<Object, Object> objectObjectMap = new HashedMap<>();
    objectObjectMap.addEntry(entry, 1);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    HashedMap<Object, Object> actualCloneResult = objectObjectMap.clone();

    // Assert
    verify(next).getKey();
    verify(next).getValue();
    assertEquals(2, actualCloneResult.size());
    assertSame(AbstractHashedMap.NULL, actualCloneResult.get(null));
  }

  /**
   * Test {@link HashedMap#clone()}.
   *
   * <p>Method under test: {@link HashedMap#clone()}
   */
  @Test
  @DisplayName("Test clone()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HashedMap HashedMap.clone()"})
  void testClone2() {
    // Arrange
    HashEntry<Object, Object> next = mock(HashEntry.class);
    when(next.getKey()).thenReturn(AbstractHashedMap.NULL);
    when(next.getValue()).thenReturn(AbstractHashedMap.NULL);
    HashEntry<Object, Object> hashEntry =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    HashEntry<Object, Object> entry =
        new HashEntry<>(next, 19088743, hashEntry, AbstractHashedMap.NULL);

    HashedMap<Object, Object> objectObjectMap = new HashedMap<>();
    objectObjectMap.addEntry(entry, 1);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    HashedMap<Object, Object> actualCloneResult = objectObjectMap.clone();

    // Assert
    verify(next).getKey();
    verify(next).getValue();
    assertEquals(2, actualCloneResult.size());
    assertSame(AbstractHashedMap.NULL, actualCloneResult.get(null));
  }

  /**
   * Test {@link HashedMap#clone()}.
   *
   * <p>Method under test: {@link HashedMap#clone()}
   */
  @Test
  @DisplayName("Test clone()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HashedMap HashedMap.clone()"})
  void testClone3() {
    // Arrange
    HashEntry<Object, Object> next = mock(HashEntry.class);
    when(next.getKey()).thenReturn(AbstractHashedMap.NULL);
    when(next.getValue()).thenReturn(AbstractHashedMap.NULL);
    HashEntry<Object, Object> entry =
        new HashEntry<>(next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    HashedMap<Object, Object> objectObjectMap = new HashedMap<>();
    objectObjectMap.addEntry(entry, 1);
    objectObjectMap.put(
        "org.apache.commons.collections4.map.AbstractHashedMap", AbstractHashedMap.NULL);

    // Act
    HashedMap<Object, Object> actualCloneResult = objectObjectMap.clone();

    // Assert
    verify(next).getKey();
    verify(next).getValue();
    assertEquals(2, actualCloneResult.size());
    assertSame(entry.key, actualCloneResult.get(null));
    assertSame(
        AbstractHashedMap.NULL,
        actualCloneResult.get("org.apache.commons.collections4.map.AbstractHashedMap"));
  }

  /**
   * Test {@link HashedMap#clone()}.
   *
   * <ul>
   *   <li>Given {@link HashEntry} {@link HashEntry#getKey()} return {@link
   *       AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link HashedMap#clone()}
   */
  @Test
  @DisplayName(
      "Test clone(); given HashEntry getKey() return AbstractHashedMap(); then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HashedMap HashedMap.clone()"})
  void testClone_givenHashEntryGetKeyReturnAbstractHashedMap_thenReturnSizeIsTwo() {
    // Arrange
    HashEntry<Object, Object> next = mock(HashEntry.class);
    when(next.getKey()).thenReturn(new AbstractHashedMap<>());
    when(next.getValue()).thenReturn(AbstractHashedMap.NULL);
    HashEntry<Object, Object> entry =
        new HashEntry<>(next, 19088743, new AbstractHashedMap<>(), AbstractHashedMap.NULL);

    HashedMap<Object, Object> objectObjectMap = new HashedMap<>();
    objectObjectMap.addEntry(entry, 1);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    HashedMap<Object, Object> actualCloneResult = objectObjectMap.clone();

    // Assert
    verify(next).getKey();
    verify(next).getValue();
    assertEquals(2, actualCloneResult.size());
    assertSame(AbstractHashedMap.NULL, actualCloneResult.get(null));
  }

  /**
   * Test {@link HashedMap#clone()}.
   *
   * <ul>
   *   <li>Given {@link HashedMap#HashedMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link HashedMap#clone()}
   */
  @Test
  @DisplayName("Test clone(); given HashedMap() NULL is NULL; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HashedMap HashedMap.clone()"})
  void testClone_givenHashedMapNullIsNull_thenReturnSizeIsOne() {
    // Arrange
    HashedMap<Object, Object> objectObjectMap = new HashedMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    HashedMap<Object, Object> actualCloneResult = objectObjectMap.clone();

    // Assert
    assertEquals(1, actualCloneResult.size());
    assertSame(AbstractHashedMap.NULL, actualCloneResult.get(null));
  }

  /**
   * Test {@link HashedMap#clone()}.
   *
   * <ul>
   *   <li>Given {@link HashedMap#HashedMap()}.
   *   <li>Then return {@link HashedMap#HashedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link HashedMap#clone()}
   */
  @Test
  @DisplayName("Test clone(); given HashedMap(); then return HashedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HashedMap HashedMap.clone()"})
  void testClone_givenHashedMap_thenReturnHashedMap() {
    // Arrange
    HashedMap<Object, Object> objectObjectMap = new HashedMap<>();

    // Act
    HashedMap<Object, Object> actualCloneResult = objectObjectMap.clone();

    // Assert
    assertEquals(objectObjectMap, actualCloneResult);
  }

  /**
   * Test {@link HashedMap#clone()}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link HashedMap#clone()}
   */
  @Test
  @DisplayName("Test clone(); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HashedMap HashedMap.clone()"})
  void testClone_thenReturnSizeIsOne() {
    // Arrange
    HashEntry<Object, Object> next = mock(HashEntry.class);
    when(next.getKey()).thenReturn(AbstractHashedMap.NULL);
    when(next.getValue()).thenReturn(AbstractHashedMap.NULL);
    HashEntry<Object, Object> entry =
        new HashEntry<>(next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    HashedMap<Object, Object> objectObjectMap = new HashedMap<>();
    objectObjectMap.addEntry(entry, 1);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    HashedMap<Object, Object> actualCloneResult = objectObjectMap.clone();

    // Assert
    verify(next).getKey();
    verify(next).getValue();
    assertEquals(1, actualCloneResult.size());
    assertSame(AbstractHashedMap.NULL, actualCloneResult.get(null));
  }
}
