package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Comparator;
import org.apache.commons.collections4.functors.AllPredicate;
import org.apache.commons.collections4.functors.AndPredicate;
import org.apache.commons.collections4.functors.ComparatorPredicate;
import org.apache.commons.collections4.functors.ComparatorPredicate.Criterion;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PredicateDiffblueTest {
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
  @DisplayName("Test test(Object); given Comparator compare(Object, Object) return one; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Predicate.test(Object)"})
  void testTest_givenComparatorCompareReturnOne_thenReturnFalse() {
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
  @DisplayName("Test test(Object); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Predicate.test(Object)"})
  void testTest_thenReturnTrue() {
    // Arrange
    UniquePredicate<? super Object> predicate1 = new UniquePredicate<>();
    AllPredicate<Object> allPredicate = new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>()));

    // Act and Assert
    assertTrue(allPredicate.test("42"));
  }
}
