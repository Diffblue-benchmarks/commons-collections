package org.apache.commons.collections4.set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.NavigableSet;
import java.util.TreeSet;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PredicatedNavigableSetDiffblueTest {
  /**
   * Test {@link PredicatedNavigableSet#predicatedNavigableSet(NavigableSet, Predicate)}.
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.</li>
   *   <li>Then return {@link TreeSet#TreeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedNavigableSet#predicatedNavigableSet(NavigableSet, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedNavigableSet(NavigableSet, Predicate); when TreeSet(); then return TreeSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PredicatedNavigableSet PredicatedNavigableSet.predicatedNavigableSet(NavigableSet, Predicate)"})
  void testPredicatedNavigableSet_whenTreeSet_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    PredicatedNavigableSet<Object> actualPredicatedNavigableSetResult = PredicatedNavigableSet
        .predicatedNavigableSet(set, mock(Predicate.class));

    // Assert
    assertEquals(set, actualPredicatedNavigableSetResult);
  }

  /**
   * Test {@link PredicatedNavigableSet#PredicatedNavigableSet(NavigableSet, Predicate)}.
   * <p>
   * Method under test: {@link PredicatedNavigableSet#PredicatedNavigableSet(NavigableSet, Predicate)}
   */
  @Test
  @DisplayName("Test new PredicatedNavigableSet(NavigableSet, Predicate)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedNavigableSet.<init>(NavigableSet, Predicate)"})
  void testNewPredicatedNavigableSet() {
    // Arrange and Act
    PredicatedNavigableSet<Object> actualObjectSet = new PredicatedNavigableSet<>(new TreeSet<>(),
        mock(Predicate.class));

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }
}
