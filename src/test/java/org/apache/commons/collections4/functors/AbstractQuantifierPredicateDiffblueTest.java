package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractQuantifierPredicateDiffblueTest {
  /**
   * Test {@link AbstractQuantifierPredicate#getPredicates()}.
   * <ul>
   *   <li>Given {@link AllPredicate#AllPredicate(Predicate[])} with predicates is {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractQuantifierPredicate#getPredicates()}
   */
  @Test
  @DisplayName("Test getPredicates(); given AllPredicate(Predicate[]) with predicates is 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate[] AbstractQuantifierPredicate.getPredicates()"})
  void testGetPredicates_givenAllPredicateWithPredicatesIsNull_thenReturnNull() {
    // Arrange
    AllPredicate<Object> allPredicate = new AllPredicate<>(null);

    // Act and Assert
    assertNull(allPredicate.getPredicates());
  }

  /**
   * Test {@link AbstractQuantifierPredicate#getPredicates()}.
   * <ul>
   *   <li>Then return array length is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractQuantifierPredicate#getPredicates()}
   */
  @Test
  @DisplayName("Test getPredicates(); then return array length is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate[] AbstractQuantifierPredicate.getPredicates()"})
  void testGetPredicates_thenReturnArrayLengthIsOne() {
    // Arrange
    AllPredicate<Object> allPredicate = new AllPredicate<>(mock(Predicate.class));

    // Act and Assert
    assertEquals(1, allPredicate.getPredicates().length);
  }
}
