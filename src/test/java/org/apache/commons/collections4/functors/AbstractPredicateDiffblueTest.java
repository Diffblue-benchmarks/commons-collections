package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class AbstractPredicateDiffblueTest {
  /**
   * Test {@link AbstractPredicate#evaluate(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPredicate#evaluate(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractPredicate.evaluate(Object)"})
  public void testEvaluate_givenPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    AllPredicate<Object> allPredicate = new AllPredicate<>(predicate);

    // Act
    boolean actualEvaluateResult = allPredicate.evaluate("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link AbstractPredicate#evaluate(Object)}.
   * <ul>
   *   <li>Given {@link UniquePredicate} (default constructor).</li>
   *   <li>Then not {@link UniquePredicate} (default constructor) test {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPredicate#evaluate(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractPredicate.evaluate(Object)"})
  public void testEvaluate_givenUniquePredicate_thenNotUniquePredicateTestObject() {
    // Arrange
    UniquePredicate<Object> uniquePredicate = new UniquePredicate<>();

    // Act
    boolean actualEvaluateResult = uniquePredicate.evaluate("Object");

    // Assert
    assertFalse(uniquePredicate.test("Object"));
    assertTrue(actualEvaluateResult);
  }
}
