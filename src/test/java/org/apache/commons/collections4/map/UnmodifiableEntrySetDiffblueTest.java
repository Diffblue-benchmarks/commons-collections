package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.Test;

public class UnmodifiableEntrySetDiffblueTest {
  /**
   * Method under test: {@link UnmodifiableEntrySet#unmodifiableEntrySet(Set)}
   */
  @Test
  public void testUnmodifiableEntrySet() {
    // Arrange and Act
    Set<Map.Entry<Object, Object>> actualUnmodifiableEntrySetResult = UnmodifiableEntrySet
        .unmodifiableEntrySet(new HashSet<>());

    // Assert
    assertTrue(actualUnmodifiableEntrySetResult.isEmpty());
  }

  /**
   * Method under test: {@link UnmodifiableEntrySet#unmodifiableEntrySet(Set)}
   */
  @Test
  public void testUnmodifiableEntrySet2() {
    // Arrange
    HashSet<Map.Entry<Object, Object>> set = new HashSet<>();
    set.add(new AbstractMap.SimpleEntry<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL));

    // Act
    Set<Map.Entry<Object, Object>> actualUnmodifiableEntrySetResult = UnmodifiableEntrySet.unmodifiableEntrySet(set);

    // Assert
    assertEquals(1, actualUnmodifiableEntrySetResult.size());
  }

  /**
   * Method under test: {@link UnmodifiableEntrySet#unmodifiableEntrySet(Set)}
   */
  @Test
  public void testUnmodifiableEntrySet3() {
    // Arrange
    HashSet<Map.Entry<Object, Object>> set = new HashSet<>();
    set.add(new AbstractMap.SimpleEntry<>("42", AbstractHashedMap.NULL));
    set.add(new AbstractMap.SimpleEntry<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL));

    // Act
    Set<Map.Entry<Object, Object>> actualUnmodifiableEntrySetResult = UnmodifiableEntrySet.unmodifiableEntrySet(set);

    // Assert
    assertEquals(set, actualUnmodifiableEntrySetResult);
  }
}
