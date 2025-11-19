package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractQuantifierPredicateDiffblueTest {
  /**
   * Test {@link AbstractQuantifierPredicate#getPredicates()}.
   *
   * <p>Method under test: {@link AbstractQuantifierPredicate#getPredicates()}
   */
  @Test
  @DisplayName("Test getPredicates()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate[] AbstractQuantifierPredicate.getPredicates()"})
  void testGetPredicates() {
    // Arrange
    AllPredicate<Object> allPredicate = new AllPredicate<>(mock(Predicate.class));

    // Act and Assert
    assertEquals(1, allPredicate.getPredicates().length);
  }
}
