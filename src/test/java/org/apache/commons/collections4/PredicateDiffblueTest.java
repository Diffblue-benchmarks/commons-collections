package org.apache.commons.collections4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Comparator;
import org.apache.commons.collections4.functors.AllPredicate;
import org.apache.commons.collections4.functors.AndPredicate;
import org.apache.commons.collections4.functors.ComparatorPredicate;
import org.apache.commons.collections4.functors.ComparatorPredicate.Criterion;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class PredicateDiffblueTest {
  /**
   * Test {@link Predicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return one.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Predicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Predicate.test(Object)"})
  public void testTest_givenComparatorCompareReturnOne_thenReturnFalse() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ComparatorPredicate<? super Object> predicate1 = new ComparatorPredicate<>("Object", comparator, Criterion.EQUAL);

    AllPredicate<Object> allPredicate = new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>()));

    // Act
    boolean actualTestResult = allPredicate.test("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link Predicate#test(Object)}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Predicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Predicate.test(Object)"})
  public void testTest_thenReturnTrue() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<Object> allPredicate = new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>()));

    // Act and Assert
    assertTrue(allPredicate.test("42"));
  }
}
