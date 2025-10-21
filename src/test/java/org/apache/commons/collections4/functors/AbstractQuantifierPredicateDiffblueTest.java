package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AbstractQuantifierPredicateDiffblueTest {
  /**
   * Test {@link AbstractQuantifierPredicate#getPredicates()}.
   * <p>
   * Method under test: {@link AbstractQuantifierPredicate#getPredicates()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate[] AbstractQuantifierPredicate.getPredicates()"})
  public void testGetPredicates() {
    // Arrange
    AllPredicate<Object> allPredicate = new AllPredicate<>(mock(Predicate.class));

    // Act and Assert
    assertEquals(1, allPredicate.getPredicates().length);
  }
}
