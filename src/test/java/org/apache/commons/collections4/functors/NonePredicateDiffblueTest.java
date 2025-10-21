package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class NonePredicateDiffblueTest {
  /**
   * Test {@link NonePredicate#nonePredicate(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Given {@link Predicate}.</li>
   *   <li>Then return array length is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link NonePredicate#nonePredicate(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate NonePredicate.nonePredicate(Collection)"})
  public void testNonePredicateWithCollection_givenPredicate_thenReturnArrayLengthIsTwo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();
    predicates.add(predicate);
    predicates.add(mock(Predicate.class));

    // Act
    Predicate<Object> actualNonePredicateResult = NonePredicate.nonePredicate(predicates);
    boolean actualEvaluateResult = actualNonePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNonePredicateResult instanceof NonePredicate);
    assertEquals(2, ((NonePredicate<Object>) actualNonePredicateResult).getPredicates().length);
    assertEquals(2, ((NonePredicate<Object>) actualNonePredicateResult).iPredicates.length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link NonePredicate#nonePredicate(Collection)} with {@code Collection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link TruePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NonePredicate#nonePredicate(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate NonePredicate.nonePredicate(Collection)"})
  public void testNonePredicateWithCollection_whenArrayList_thenReturnTruePredicate() {
    // Arrange and Act
    Predicate<Object> actualNonePredicateResult = NonePredicate.nonePredicate(new ArrayList<>());

    // Assert
    assertTrue(actualNonePredicateResult instanceof TruePredicate);
    assertTrue(actualNonePredicateResult.evaluate("42"));
    assertTrue(actualNonePredicateResult.evaluate("Object"));
    assertTrue(actualNonePredicateResult.test("Object"));
  }

  /**
   * Test {@link NonePredicate#nonePredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NonePredicate#nonePredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate NonePredicate.nonePredicate(Predicate[])"})
  public void testNonePredicateWithPredicate_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualNonePredicateResult = NonePredicate.nonePredicate(predicate);
    boolean actualEvaluateResult = actualNonePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNonePredicateResult instanceof NonePredicate);
    assertEquals(1, ((NonePredicate<Object>) actualNonePredicateResult).getPredicates().length);
    assertEquals(1, ((NonePredicate<Object>) actualNonePredicateResult).iPredicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link NonePredicate#nonePredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NonePredicate#nonePredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate NonePredicate.nonePredicate(Predicate[])"})
  public void testNonePredicateWithPredicate_givenTrue_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualNonePredicateResult = NonePredicate.nonePredicate(predicate);
    boolean actualEvaluateResult = actualNonePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNonePredicateResult instanceof NonePredicate);
    assertEquals(1, ((NonePredicate<Object>) actualNonePredicateResult).getPredicates().length);
    assertEquals(1, ((NonePredicate<Object>) actualNonePredicateResult).iPredicates.length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link NonePredicate#nonePredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>Then return {@link TruePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NonePredicate#nonePredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate NonePredicate.nonePredicate(Predicate[])"})
  public void testNonePredicateWithPredicate_thenReturnTruePredicate() {
    // Arrange and Act
    Predicate<Object> actualNonePredicateResult = NonePredicate.nonePredicate();

    // Assert
    assertTrue(actualNonePredicateResult instanceof TruePredicate);
    assertTrue(actualNonePredicateResult.evaluate("42"));
    assertTrue(actualNonePredicateResult.evaluate("Object"));
    assertTrue(actualNonePredicateResult.test("Object"));
  }

  /**
   * Test {@link NonePredicate#NonePredicate(Predicate[])}.
   * <p>
   * Method under test: {@link NonePredicate#NonePredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void NonePredicate.<init>(Predicate[])"})
  public void testNewNonePredicate() {
    // Arrange and Act
    NonePredicate<Object> actualNonePredicate = new NonePredicate<>(mock(Predicate.class));

    // Assert
    assertEquals(1, actualNonePredicate.getPredicates().length);
    assertEquals(1, actualNonePredicate.iPredicates.length);
  }

  /**
   * Test {@link NonePredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NonePredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean NonePredicate.test(Object)"})
  public void testTest_givenPredicateTestReturnFalse_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    NonePredicate<Object> nonePredicate = new NonePredicate<>(predicate);

    // Act
    boolean actualTestResult = nonePredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link NonePredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NonePredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean NonePredicate.test(Object)"})
  public void testTest_givenPredicateTestReturnTrue_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    NonePredicate<Object> nonePredicate = new NonePredicate<>(predicate);

    // Act
    boolean actualTestResult = nonePredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualTestResult);
  }
}
