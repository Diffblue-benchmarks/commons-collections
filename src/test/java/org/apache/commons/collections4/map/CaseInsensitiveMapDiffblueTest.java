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

class CaseInsensitiveMapDiffblueTest {
  /**
   * Test {@link CaseInsensitiveMap#CaseInsensitiveMap()}.
   *
   * <p>Method under test: {@link CaseInsensitiveMap#CaseInsensitiveMap()}
   */
  @Test
  @DisplayName("Test new CaseInsensitiveMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CaseInsensitiveMap.<init>()"})
  void testNewCaseInsensitiveMap() {
    // Arrange and Act
    CaseInsensitiveMap<Object, Object> actualObjectObjectMap = new CaseInsensitiveMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link CaseInsensitiveMap#clone()}.
   *
   * <ul>
   *   <li>Given {@link CaseInsensitiveMap#CaseInsensitiveMap()} {@link AbstractHashedMap#NULL} is
   *       {@link AbstractHashedMap#NULL}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CaseInsensitiveMap#clone()}
   */
  @Test
  @DisplayName("Test clone(); given CaseInsensitiveMap() NULL is NULL; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CaseInsensitiveMap CaseInsensitiveMap.clone()"})
  void testClone_givenCaseInsensitiveMapNullIsNull_thenReturnSizeIsOne() {
    // Arrange
    CaseInsensitiveMap<Object, Object> objectObjectMap = new CaseInsensitiveMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(1, objectObjectMap.clone().size());
  }

  /**
   * Test {@link CaseInsensitiveMap#clone()}.
   *
   * <ul>
   *   <li>Given {@link CaseInsensitiveMap#CaseInsensitiveMap()}.
   *   <li>Then return {@link CaseInsensitiveMap#CaseInsensitiveMap()}.
   * </ul>
   *
   * <p>Method under test: {@link CaseInsensitiveMap#clone()}
   */
  @Test
  @DisplayName("Test clone(); given CaseInsensitiveMap(); then return CaseInsensitiveMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CaseInsensitiveMap CaseInsensitiveMap.clone()"})
  void testClone_givenCaseInsensitiveMap_thenReturnCaseInsensitiveMap() {
    // Arrange
    CaseInsensitiveMap<Object, Object> objectObjectMap = new CaseInsensitiveMap<>();

    // Act
    CaseInsensitiveMap<Object, Object> actualCloneResult = objectObjectMap.clone();

    // Assert
    assertEquals(objectObjectMap, actualCloneResult);
  }

  /**
   * Test {@link CaseInsensitiveMap#clone()}.
   *
   * <ul>
   *   <li>Then return {@code {}} is {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link CaseInsensitiveMap#clone()}
   */
  @Test
  @DisplayName("Test clone(); then return '{}' is NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CaseInsensitiveMap CaseInsensitiveMap.clone()"})
  void testClone_thenReturnLeftCurlyBracketRightCurlyBracketIsNull() {
    // Arrange
    HashEntry<Object, Object> next = mock(HashEntry.class);
    when(next.getKey()).thenReturn(AbstractHashedMap.NULL);
    when(next.getValue()).thenReturn(AbstractHashedMap.NULL);
    HashEntry<Object, Object> entry =
        new HashEntry<>(next, 19088743, new AbstractHashedMap<>(), AbstractHashedMap.NULL);

    CaseInsensitiveMap<Object, Object> objectObjectMap = new CaseInsensitiveMap<>();
    objectObjectMap.addEntry(entry, 1);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    CaseInsensitiveMap<Object, Object> actualCloneResult = objectObjectMap.clone();

    // Assert
    verify(next).getKey();
    verify(next).getValue();
    assertEquals(2, actualCloneResult.size());
    assertSame(AbstractHashedMap.NULL, actualCloneResult.get("{}"));
  }

  /**
   * Test {@link CaseInsensitiveMap#clone()}.
   *
   * <ul>
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link CaseInsensitiveMap#clone()}
   */
  @Test
  @DisplayName("Test clone(); then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CaseInsensitiveMap CaseInsensitiveMap.clone()"})
  void testClone_thenReturnNull() {
    // Arrange
    HashEntry<Object, Object> next = mock(HashEntry.class);
    when(next.getKey()).thenReturn(AbstractHashedMap.NULL);
    when(next.getValue()).thenReturn(AbstractHashedMap.NULL);
    HashEntry<Object, Object> entry =
        new HashEntry<>(next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    CaseInsensitiveMap<Object, Object> objectObjectMap = new CaseInsensitiveMap<>();
    objectObjectMap.addEntry(entry, 1);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    CaseInsensitiveMap<Object, Object> actualCloneResult = objectObjectMap.clone();

    // Assert
    verify(next).getKey();
    verify(next).getValue();
    assertEquals(2, actualCloneResult.size());
    assertSame(AbstractHashedMap.NULL, actualCloneResult.get(null));
  }

  /**
   * Test {@link CaseInsensitiveMap#convertKey(Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link CaseInsensitiveMap#convertKey(Object)}
   */
  @Test
  @DisplayName("Test convertKey(Object); when 'null'; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CaseInsensitiveMap.convertKey(Object)"})
  void testConvertKey_whenNull_thenReturnNull() {
    // Arrange
    CaseInsensitiveMap<Object, Object> objectObjectMap = new CaseInsensitiveMap<>();

    // Act and Assert
    assertSame(AbstractHashedMap.NULL, objectObjectMap.convertKey(null));
  }
}
