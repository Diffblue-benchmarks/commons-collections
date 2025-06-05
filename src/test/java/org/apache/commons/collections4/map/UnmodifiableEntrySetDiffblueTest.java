package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnmodifiableEntrySetDiffblueTest {
  /**
   * Test {@link UnmodifiableEntrySet#unmodifiableEntrySet(Set)}.
   * <ul>
   *   <li>Given {@link SimpleEntry#SimpleEntry(Object, Object)} with {@code 42} and {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableEntrySet#unmodifiableEntrySet(Set)}
   */
  @Test
  @DisplayName("Test unmodifiableEntrySet(Set); given SimpleEntry(Object, Object) with '42' and NULL")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set UnmodifiableEntrySet.unmodifiableEntrySet(Set)"})
  void testUnmodifiableEntrySet_givenSimpleEntryWith42AndNull() {
    // Arrange
    HashSet<Entry<Object, Object>> set = new HashSet<>();
    set.add(new SimpleEntry<>("42", AbstractHashedMap.NULL));
    set.add(new SimpleEntry<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL));

    // Act
    Set<Entry<Object, Object>> actualUnmodifiableEntrySetResult = UnmodifiableEntrySet.unmodifiableEntrySet(set);

    // Assert
    assertEquals(set, actualUnmodifiableEntrySetResult);
  }

  /**
   * Test {@link UnmodifiableEntrySet#unmodifiableEntrySet(Set)}.
   * <ul>
   *   <li>Given {@link SimpleEntry#SimpleEntry(Object, Object)} with {@link AbstractHashedMap#NULL} and {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableEntrySet#unmodifiableEntrySet(Set)}
   */
  @Test
  @DisplayName("Test unmodifiableEntrySet(Set); given SimpleEntry(Object, Object) with NULL and NULL; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set UnmodifiableEntrySet.unmodifiableEntrySet(Set)"})
  void testUnmodifiableEntrySet_givenSimpleEntryWithNullAndNull_thenReturnHashSet() {
    // Arrange
    HashSet<Entry<Object, Object>> set = new HashSet<>();
    set.add(new SimpleEntry<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL));

    // Act
    Set<Entry<Object, Object>> actualUnmodifiableEntrySetResult = UnmodifiableEntrySet.unmodifiableEntrySet(set);

    // Assert
    assertEquals(set, actualUnmodifiableEntrySetResult);
  }

  /**
   * Test {@link UnmodifiableEntrySet#unmodifiableEntrySet(Set)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableEntrySet#unmodifiableEntrySet(Set)}
   */
  @Test
  @DisplayName("Test unmodifiableEntrySet(Set); when HashSet(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set UnmodifiableEntrySet.unmodifiableEntrySet(Set)"})
  void testUnmodifiableEntrySet_whenHashSet_thenReturnEmpty() {
    // Arrange and Act
    Set<Entry<Object, Object>> actualUnmodifiableEntrySetResult = UnmodifiableEntrySet
        .unmodifiableEntrySet(new HashSet<>());

    // Assert
    assertTrue(actualUnmodifiableEntrySetResult.isEmpty());
  }
}
