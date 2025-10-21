package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.collections4.functors.AllPredicate;
import org.apache.commons.collections4.functors.AndPredicate;
import org.apache.commons.collections4.functors.AnyPredicate;
import org.apache.commons.collections4.functors.DefaultEquator;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.FalsePredicate;
import org.apache.commons.collections4.functors.IdentityPredicate;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.apache.commons.collections4.functors.NonePredicate;
import org.apache.commons.collections4.functors.NotNullPredicate;
import org.apache.commons.collections4.functors.NotPredicate;
import org.apache.commons.collections4.functors.NullIsExceptionPredicate;
import org.apache.commons.collections4.functors.NullIsFalsePredicate;
import org.apache.commons.collections4.functors.NullIsTruePredicate;
import org.apache.commons.collections4.functors.NullPredicate;
import org.apache.commons.collections4.functors.OnePredicate;
import org.apache.commons.collections4.functors.OrPredicate;
import org.apache.commons.collections4.functors.TransformedPredicate;
import org.apache.commons.collections4.functors.TransformerPredicate;
import org.apache.commons.collections4.functors.TruePredicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class PredicateUtilsDiffblueTest {
  /**
   * Test {@link PredicateUtils#allPredicate(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Then return array length is ninety-nine.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#allPredicate(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Collection)"})
  public void testAllPredicateWithCollection_thenReturnArrayLengthIsNinetyNine() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate3 = mock(Predicate.class);
    when(predicate3.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate4 = mock(Predicate.class);
    when(predicate4.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate5 = mock(Predicate.class);
    when(predicate5.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate6 = mock(Predicate.class);
    when(predicate6.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate7 = mock(Predicate.class);
    when(predicate7.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate8 = mock(Predicate.class);
    when(predicate8.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate9 = mock(Predicate.class);
    when(predicate9.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate10 = mock(Predicate.class);
    when(predicate10.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate11 = mock(Predicate.class);
    when(predicate11.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate12 = mock(Predicate.class);
    when(predicate12.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate13 = mock(Predicate.class);
    when(predicate13.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate14 = mock(Predicate.class);
    when(predicate14.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate15 = mock(Predicate.class);
    when(predicate15.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate16 = mock(Predicate.class);
    when(predicate16.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate17 = mock(Predicate.class);
    when(predicate17.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate18 = mock(Predicate.class);
    when(predicate18.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate19 = mock(Predicate.class);
    when(predicate19.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate20 = mock(Predicate.class);
    when(predicate20.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate21 = mock(Predicate.class);
    when(predicate21.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate22 = mock(Predicate.class);
    when(predicate22.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate23 = mock(Predicate.class);
    when(predicate23.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate24 = mock(Predicate.class);
    when(predicate24.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate25 = mock(Predicate.class);
    when(predicate25.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate26 = mock(Predicate.class);
    when(predicate26.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate27 = mock(Predicate.class);
    when(predicate27.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate28 = mock(Predicate.class);
    when(predicate28.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate29 = mock(Predicate.class);
    when(predicate29.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate30 = mock(Predicate.class);
    when(predicate30.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate31 = mock(Predicate.class);
    when(predicate31.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate32 = mock(Predicate.class);
    when(predicate32.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate33 = mock(Predicate.class);
    when(predicate33.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate34 = mock(Predicate.class);
    when(predicate34.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate35 = mock(Predicate.class);
    when(predicate35.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate36 = mock(Predicate.class);
    when(predicate36.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate37 = mock(Predicate.class);
    when(predicate37.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate38 = mock(Predicate.class);
    when(predicate38.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate39 = mock(Predicate.class);
    when(predicate39.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate40 = mock(Predicate.class);
    when(predicate40.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate41 = mock(Predicate.class);
    when(predicate41.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate42 = mock(Predicate.class);
    when(predicate42.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate43 = mock(Predicate.class);
    when(predicate43.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate44 = mock(Predicate.class);
    when(predicate44.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate45 = mock(Predicate.class);
    when(predicate45.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate46 = mock(Predicate.class);
    when(predicate46.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate47 = mock(Predicate.class);
    when(predicate47.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate48 = mock(Predicate.class);
    when(predicate48.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate49 = mock(Predicate.class);
    when(predicate49.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate50 = mock(Predicate.class);
    when(predicate50.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate51 = mock(Predicate.class);
    when(predicate51.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate52 = mock(Predicate.class);
    when(predicate52.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate53 = mock(Predicate.class);
    when(predicate53.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate54 = mock(Predicate.class);
    when(predicate54.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate55 = mock(Predicate.class);
    when(predicate55.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate56 = mock(Predicate.class);
    when(predicate56.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate57 = mock(Predicate.class);
    when(predicate57.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate58 = mock(Predicate.class);
    when(predicate58.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate59 = mock(Predicate.class);
    when(predicate59.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate60 = mock(Predicate.class);
    when(predicate60.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate61 = mock(Predicate.class);
    when(predicate61.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate62 = mock(Predicate.class);
    when(predicate62.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate63 = mock(Predicate.class);
    when(predicate63.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate64 = mock(Predicate.class);
    when(predicate64.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate65 = mock(Predicate.class);
    when(predicate65.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate66 = mock(Predicate.class);
    when(predicate66.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate67 = mock(Predicate.class);
    when(predicate67.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate68 = mock(Predicate.class);
    when(predicate68.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate69 = mock(Predicate.class);
    when(predicate69.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate70 = mock(Predicate.class);
    when(predicate70.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate71 = mock(Predicate.class);
    when(predicate71.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate72 = mock(Predicate.class);
    when(predicate72.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate73 = mock(Predicate.class);
    when(predicate73.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate74 = mock(Predicate.class);
    when(predicate74.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate75 = mock(Predicate.class);
    when(predicate75.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate76 = mock(Predicate.class);
    when(predicate76.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate77 = mock(Predicate.class);
    when(predicate77.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate78 = mock(Predicate.class);
    when(predicate78.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate79 = mock(Predicate.class);
    when(predicate79.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate80 = mock(Predicate.class);
    when(predicate80.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate81 = mock(Predicate.class);
    when(predicate81.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate82 = mock(Predicate.class);
    when(predicate82.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate83 = mock(Predicate.class);
    when(predicate83.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate84 = mock(Predicate.class);
    when(predicate84.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate85 = mock(Predicate.class);
    when(predicate85.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate86 = mock(Predicate.class);
    when(predicate86.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate87 = mock(Predicate.class);
    when(predicate87.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate88 = mock(Predicate.class);
    when(predicate88.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate89 = mock(Predicate.class);
    when(predicate89.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate90 = mock(Predicate.class);
    when(predicate90.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate91 = mock(Predicate.class);
    when(predicate91.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate92 = mock(Predicate.class);
    when(predicate92.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate93 = mock(Predicate.class);
    when(predicate93.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate94 = mock(Predicate.class);
    when(predicate94.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate95 = mock(Predicate.class);
    when(predicate95.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate96 = mock(Predicate.class);
    when(predicate96.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate97 = mock(Predicate.class);
    when(predicate97.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate98 = mock(Predicate.class);
    when(predicate98.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate99 = mock(Predicate.class);
    when(predicate99.test(Mockito.<Object>any())).thenReturn(false);

    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();
    predicates.add(predicate99);
    predicates.add(predicate98);
    predicates.add(predicate97);
    predicates.add(predicate96);
    predicates.add(predicate95);
    predicates.add(predicate94);
    predicates.add(predicate93);
    predicates.add(predicate92);
    predicates.add(predicate91);
    predicates.add(predicate90);
    predicates.add(predicate89);
    predicates.add(predicate88);
    predicates.add(predicate87);
    predicates.add(predicate86);
    predicates.add(predicate85);
    predicates.add(predicate84);
    predicates.add(predicate83);
    predicates.add(predicate82);
    predicates.add(predicate81);
    predicates.add(predicate80);
    predicates.add(predicate79);
    predicates.add(predicate78);
    predicates.add(predicate77);
    predicates.add(predicate76);
    predicates.add(predicate75);
    predicates.add(predicate74);
    predicates.add(predicate73);
    predicates.add(predicate72);
    predicates.add(predicate71);
    predicates.add(predicate70);
    predicates.add(predicate69);
    predicates.add(predicate68);
    predicates.add(predicate67);
    predicates.add(predicate66);
    predicates.add(predicate65);
    predicates.add(predicate64);
    predicates.add(predicate63);
    predicates.add(predicate62);
    predicates.add(predicate61);
    predicates.add(predicate60);
    predicates.add(predicate59);
    predicates.add(predicate58);
    predicates.add(predicate57);
    predicates.add(predicate56);
    predicates.add(predicate55);
    predicates.add(predicate54);
    predicates.add(predicate53);
    predicates.add(predicate52);
    predicates.add(predicate51);
    predicates.add(predicate50);
    predicates.add(predicate49);
    predicates.add(predicate48);
    predicates.add(predicate47);
    predicates.add(predicate46);
    predicates.add(predicate45);
    predicates.add(predicate44);
    predicates.add(predicate43);
    predicates.add(predicate42);
    predicates.add(predicate41);
    predicates.add(predicate40);
    predicates.add(predicate39);
    predicates.add(predicate38);
    predicates.add(predicate37);
    predicates.add(predicate36);
    predicates.add(predicate35);
    predicates.add(predicate34);
    predicates.add(predicate33);
    predicates.add(predicate32);
    predicates.add(predicate31);
    predicates.add(predicate30);
    predicates.add(predicate29);
    predicates.add(predicate28);
    predicates.add(predicate27);
    predicates.add(predicate26);
    predicates.add(predicate25);
    predicates.add(predicate24);
    predicates.add(predicate23);
    predicates.add(predicate22);
    predicates.add(predicate21);
    predicates.add(predicate20);
    predicates.add(predicate19);
    predicates.add(predicate18);
    predicates.add(predicate17);
    predicates.add(predicate16);
    predicates.add(predicate15);
    predicates.add(predicate14);
    predicates.add(predicate13);
    predicates.add(predicate12);
    predicates.add(predicate11);
    predicates.add(predicate10);
    predicates.add(predicate9);
    predicates.add(predicate8);
    predicates.add(predicate7);
    predicates.add(predicate6);
    predicates.add(predicate5);
    predicates.add(predicate4);
    predicates.add(predicate3);
    predicates.add(predicate2);
    predicates.add(predicate);

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate99).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    assertEquals(99, ((AllPredicate<Object>) actualAllPredicateResult).getPredicates().length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Then return array length is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#allPredicate(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Collection)"})
  public void testAllPredicateWithCollection_thenReturnArrayLengthIsTwo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();
    predicates.add(predicate2);
    predicates.add(predicate);

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate2).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    assertEquals(2, ((AllPredicate<Object>) actualAllPredicateResult).getPredicates().length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Collection)} with {@code Collection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link TruePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#allPredicate(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Collection)"})
  public void testAllPredicateWithCollection_whenArrayList_thenReturnTruePredicate() {
    // Arrange and Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(new ArrayList<>());

    // Assert
    assertTrue(actualAllPredicateResult instanceof TruePredicate);
    assertTrue(actualAllPredicateResult.evaluate("42"));
    assertTrue(actualAllPredicateResult.evaluate("Object"));
    assertTrue(actualAllPredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>Then return {@link TruePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  public void testAllPredicateWithPredicate_thenReturnTruePredicate() {
    // Arrange and Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate();

    // Assert
    assertTrue(actualAllPredicateResult instanceof TruePredicate);
    assertTrue(actualAllPredicateResult.evaluate("42"));
    assertTrue(actualAllPredicateResult.evaluate("Object"));
    assertTrue(actualAllPredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  public void testAllPredicateWithPredicate_whenPredicateEvaluateReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicate);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#evaluate(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  public void testAllPredicateWithPredicate_whenPredicateEvaluateReturnTrue_thenCallsEvaluate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicate);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  public void testAllPredicateWithPredicate_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicate, predicate2);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    assertEquals(2, ((AllPredicate<Object>) actualAllPredicateResult).getPredicates().length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@link AllPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  public void testAllPredicateWithPredicate_whenPredicateTestReturnTrue_thenReturnAllPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicate, predicate2);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    assertEquals(2, ((AllPredicate<Object>) actualAllPredicateResult).getPredicates().length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   * <p>
   * Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  public void testAndPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate12 = mock(Predicate.class);
    when(predicate12.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    AndPredicate<? super Object> predicate22 = new AndPredicate<>(predicate12, predicate2);

    // Act
    Predicate<Object> actualAndPredicateResult = PredicateUtils.andPredicate(predicate1, predicate22);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate12).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates = ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate22, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return first element is {@link Predicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  public void testAndPredicate_givenFalse_thenReturnFirstElementIsPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualAndPredicateResult = PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates = ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return first element is {@link Predicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  public void testAndPredicate_givenFalse_thenReturnFirstElementIsPredicate2() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualAndPredicateResult = PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates = ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>Then return second element is {@link EqualPredicate#EqualPredicate(Object)} with {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  public void testAndPredicate_thenReturnSecondElementIsEqualPredicateWithObject() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    EqualPredicate<Object> predicate2 = new EqualPredicate<>("Object");

    // Act
    Predicate<Object> actualAndPredicateResult = PredicateUtils.andPredicate(predicate1, predicate2);
    actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates = ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    Predicate<? super Object> predicate = predicates[1];
    assertTrue(predicate instanceof EqualPredicate);
    assertEquals("Object", ((EqualPredicate<? super Object>) predicate).getValue());
    assertEquals(2, predicates.length);
    assertSame(predicate2, predicate);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>Then return second element Value is {@code Test}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  public void testAndPredicate_thenReturnSecondElementValueIsTest() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    DefaultEquator<Object> equator = DefaultEquator.defaultEquator();
    EqualPredicate<Object> predicate2 = new EqualPredicate<>("Test", equator);

    // Act
    Predicate<Object> actualAndPredicateResult = PredicateUtils.andPredicate(predicate1, predicate2);
    actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates = ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    Predicate<? super Object> predicate = predicates[1];
    assertTrue(predicate instanceof EqualPredicate);
    assertEquals("Test", ((EqualPredicate<? super Object>) predicate).getValue());
    assertEquals(2, predicates.length);
    assertSame(predicate2, predicate);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>Then second element return {@link AnyPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  public void testAndPredicate_thenSecondElementReturnAnyPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    AnyPredicate<? super Object> predicate2 = new AnyPredicate<>(predicate);

    // Act
    Predicate<Object> actualAndPredicateResult = PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates = ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    Predicate<? super Object> predicate3 = predicates[1];
    assertTrue(predicate3 instanceof AnyPredicate);
    assertEquals(1, ((AnyPredicate<? super Object>) predicate3).getPredicates().length);
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate2, predicate3);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>Then second element return {@link AnyPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  public void testAndPredicate_thenSecondElementReturnAnyPredicate2() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    AnyPredicate<? super Object> predicate2 = new AnyPredicate<>(predicate);

    // Act
    Predicate<Object> actualAndPredicateResult = PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates = ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    Predicate<? super Object> predicate3 = predicates[1];
    assertTrue(predicate3 instanceof AnyPredicate);
    assertEquals(1, ((AnyPredicate<? super Object>) predicate3).getPredicates().length);
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate2, predicate3);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>Then second element return {@link IdentityPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  public void testAndPredicate_thenSecondElementReturnIdentityPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    IdentityPredicate<Object> predicate2 = new IdentityPredicate<>("Object");

    // Act
    Predicate<Object> actualAndPredicateResult = PredicateUtils.andPredicate(predicate1, predicate2);
    actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates = ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    Predicate<? super Object> predicate = predicates[1];
    assertTrue(predicate instanceof IdentityPredicate);
    assertEquals("Object", ((IdentityPredicate<? super Object>) predicate).getValue());
    assertEquals(2, predicates.length);
    assertSame(predicate2, predicate);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>Then second element return {@link NonePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  public void testAndPredicate_thenSecondElementReturnNonePredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    NonePredicate<? super Object> predicate2 = new NonePredicate<>(predicate);

    // Act
    Predicate<Object> actualAndPredicateResult = PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates = ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    Predicate<? super Object> predicate3 = predicates[1];
    assertTrue(predicate3 instanceof NonePredicate);
    assertEquals(1, ((NonePredicate<? super Object>) predicate3).getPredicates().length);
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate2, predicate3);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>Then second element return {@link NonePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  public void testAndPredicate_thenSecondElementReturnNonePredicate2() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    NonePredicate<? super Object> predicate2 = new NonePredicate<>(predicate);

    // Act
    Predicate<Object> actualAndPredicateResult = PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates = ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    Predicate<? super Object> predicate3 = predicates[1];
    assertTrue(predicate3 instanceof NonePredicate);
    assertEquals(1, ((NonePredicate<? super Object>) predicate3).getPredicates().length);
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate2, predicate3);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>Then second element return {@link NotPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  public void testAndPredicate_thenSecondElementReturnNotPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    NotPredicate<? super Object> predicate2 = new NotPredicate<>(predicate);

    // Act
    Predicate<Object> actualAndPredicateResult = PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates = ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    Predicate<? super Object> predicate3 = predicates[1];
    assertTrue(predicate3 instanceof NotPredicate);
    assertEquals(1, ((NotPredicate<? super Object>) predicate3).getPredicates().length);
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate2, predicate3);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>Then second element return {@link NotPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  public void testAndPredicate_thenSecondElementReturnNotPredicate2() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    NotPredicate<? super Object> predicate2 = new NotPredicate<>(predicate);

    // Act
    Predicate<Object> actualAndPredicateResult = PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates = ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    Predicate<? super Object> predicate3 = predicates[1];
    assertTrue(predicate3 instanceof NotPredicate);
    assertEquals(1, ((NotPredicate<? super Object>) predicate3).getPredicates().length);
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate2, predicate3);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>When {@code Object}.</li>
   *   <li>Then second element return {@link InstanceofPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  public void testAndPredicate_whenJavaLangObject_thenSecondElementReturnInstanceofPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Class<Object> type = Object.class;
    InstanceofPredicate predicate2 = new InstanceofPredicate(type);

    // Act
    Predicate<Object> actualAndPredicateResult = PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates = ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    Predicate<? super Object> predicate = predicates[1];
    assertTrue(predicate instanceof InstanceofPredicate);
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    Class<Object> expectedType = Object.class;
    assertEquals(expectedType, ((InstanceofPredicate) predicate).getType());
    assertSame(predicate2, predicate);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return first element is {@link Predicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  public void testAndPredicate_whenPredicateTestReturnTrue_thenReturnFirstElementIsPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualAndPredicateResult = PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates = ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#anyPredicate(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Then return {@link AnyPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#anyPredicate(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.anyPredicate(Collection)"})
  public void testAnyPredicateWithCollection_thenReturnAnyPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();
    predicates.add(predicate);
    predicates.add(mock(Predicate.class));

    // Act
    Predicate<Object> actualAnyPredicateResult = PredicateUtils.anyPredicate(predicates);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAnyPredicateResult instanceof AnyPredicate);
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).getPredicates().length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#anyPredicate(Collection)} with {@code Collection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link FalsePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#anyPredicate(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.anyPredicate(Collection)"})
  public void testAnyPredicateWithCollection_whenArrayList_thenReturnFalsePredicate() {
    // Arrange and Act
    Predicate<Object> actualAnyPredicateResult = PredicateUtils.anyPredicate(new ArrayList<>());

    // Assert
    assertTrue(actualAnyPredicateResult instanceof FalsePredicate);
    assertFalse(actualAnyPredicateResult.evaluate("42"));
    assertFalse(actualAnyPredicateResult.evaluate("Object"));
    assertFalse(actualAnyPredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#anyPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>Then return {@link FalsePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#anyPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.anyPredicate(Predicate[])"})
  public void testAnyPredicateWithPredicate_thenReturnFalsePredicate() {
    // Arrange and Act
    Predicate<Object> actualAnyPredicateResult = PredicateUtils.anyPredicate();

    // Assert
    assertTrue(actualAnyPredicateResult instanceof FalsePredicate);
    assertFalse(actualAnyPredicateResult.evaluate("42"));
    assertFalse(actualAnyPredicateResult.evaluate("Object"));
    assertFalse(actualAnyPredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#anyPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code false}.</li>
   *   <li>Then calls {@link Predicate#evaluate(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#anyPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.anyPredicate(Predicate[])"})
  public void testAnyPredicateWithPredicate_whenPredicateEvaluateReturnFalse_thenCallsEvaluate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualAnyPredicateResult = PredicateUtils.anyPredicate(predicate);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#anyPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#evaluate(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#anyPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.anyPredicate(Predicate[])"})
  public void testAnyPredicateWithPredicate_whenPredicateEvaluateReturnTrue_thenCallsEvaluate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualAnyPredicateResult = PredicateUtils.anyPredicate(predicate);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#anyPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#anyPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.anyPredicate(Predicate[])"})
  public void testAnyPredicateWithPredicate_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualAnyPredicateResult = PredicateUtils.anyPredicate(predicate, predicate2);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAnyPredicateResult instanceof AnyPredicate);
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).getPredicates().length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#anyPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#anyPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.anyPredicate(Predicate[])"})
  public void testAnyPredicateWithPredicate_whenPredicateTestReturnFalse2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualAnyPredicateResult = PredicateUtils.anyPredicate(predicate, predicate2);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAnyPredicateResult instanceof AnyPredicate);
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).getPredicates().length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#anyPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@link AnyPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#anyPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.anyPredicate(Predicate[])"})
  public void testAnyPredicateWithPredicate_whenPredicateTestReturnTrue_thenReturnAnyPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualAnyPredicateResult = PredicateUtils.anyPredicate(predicate, mock(Predicate.class));
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAnyPredicateResult instanceof AnyPredicate);
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).getPredicates().length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#asPredicate(Transformer)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#asPredicate(Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.asPredicate(Transformer)"})
  public void testAsPredicate_givenFalse_thenReturnNotEvaluate42() {
    // Arrange
    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualAsPredicateResult = PredicateUtils.asPredicate(transformer);
    boolean actualEvaluateResult = actualAsPredicateResult.evaluate("42");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualAsPredicateResult instanceof TransformerPredicate);
    assertFalse(actualEvaluateResult);
    assertSame(transformer, ((TransformerPredicate<Object>) actualAsPredicateResult).getTransformer());
  }

  /**
   * Test {@link PredicateUtils#asPredicate(Transformer)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Transformer} {@link Transformer#apply(Object)} return {@code true}.</li>
   *   <li>Then return evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#asPredicate(Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.asPredicate(Transformer)"})
  public void testAsPredicate_givenTrue_whenTransformerApplyReturnTrue_thenReturnEvaluate42() {
    // Arrange
    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualAsPredicateResult = PredicateUtils.asPredicate(transformer);
    boolean actualEvaluateResult = actualAsPredicateResult.evaluate("42");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualAsPredicateResult instanceof TransformerPredicate);
    assertTrue(actualEvaluateResult);
    assertSame(transformer, ((TransformerPredicate<Object>) actualAsPredicateResult).getTransformer());
  }

  /**
   * Test {@link PredicateUtils#eitherPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#eitherPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.eitherPredicate(Predicate, Predicate)"})
  public void testEitherPredicate_givenFalse_whenPredicateTestReturnFalse_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualEitherPredicateResult = PredicateUtils.eitherPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualEitherPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualEitherPredicateResult instanceof OnePredicate);
    Predicate<? super Object>[] predicates = ((OnePredicate<Object>) actualEitherPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#eitherPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#eitherPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.eitherPredicate(Predicate, Predicate)"})
  public void testEitherPredicate_whenPredicateTestReturnTrue_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualEitherPredicateResult = PredicateUtils.eitherPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualEitherPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualEitherPredicateResult instanceof OnePredicate);
    Predicate<? super Object>[] predicates = ((OnePredicate<Object>) actualEitherPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#equalPredicate(Object)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then return Value is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#equalPredicate(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.equalPredicate(Object)"})
  public void testEqualPredicate_when42_thenReturnValueIs42() {
    // Arrange and Act
    Predicate<Object> actualEqualPredicateResult = PredicateUtils.equalPredicate("42");
    boolean actualEvaluateResult = actualEqualPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualEqualPredicateResult instanceof EqualPredicate);
    assertEquals("42", ((EqualPredicate<Object>) actualEqualPredicateResult).getValue());
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#equalPredicate(Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link NullPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#equalPredicate(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.equalPredicate(Object)"})
  public void testEqualPredicate_whenNull_thenReturnNullPredicate() {
    // Arrange and Act
    Predicate<Object> actualEqualPredicateResult = PredicateUtils.equalPredicate(null);

    // Assert
    assertTrue(actualEqualPredicateResult instanceof NullPredicate);
    assertFalse(actualEqualPredicateResult.evaluate("42"));
    assertFalse(actualEqualPredicateResult.evaluate("Object"));
    assertFalse(actualEqualPredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#equalPredicate(Object)}.
   * <ul>
   *   <li>When {@code Value}.</li>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#equalPredicate(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.equalPredicate(Object)"})
  public void testEqualPredicate_whenValue_thenReturnValue() {
    // Arrange and Act
    Predicate<Object> actualEqualPredicateResult = PredicateUtils.equalPredicate("Value");
    boolean actualEvaluateResult = actualEqualPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualEqualPredicateResult instanceof EqualPredicate);
    assertEquals("Value", ((EqualPredicate<Object>) actualEqualPredicateResult).getValue());
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#falsePredicate()}.
   * <p>
   * Method under test: {@link PredicateUtils#falsePredicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.falsePredicate()"})
  public void testFalsePredicate() {
    // Arrange and Act
    Predicate<Object> actualFalsePredicateResult = PredicateUtils.falsePredicate();

    // Assert
    assertTrue(actualFalsePredicateResult instanceof FalsePredicate);
    assertFalse(actualFalsePredicateResult.evaluate("42"));
    assertFalse(actualFalsePredicateResult.evaluate("Object"));
    assertFalse(actualFalsePredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#identityPredicate(Object)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then return Value is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#identityPredicate(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.identityPredicate(Object)"})
  public void testIdentityPredicate_when42_thenReturnValueIs42() {
    // Arrange and Act
    Predicate<Object> actualIdentityPredicateResult = PredicateUtils.identityPredicate("42");
    boolean actualEvaluateResult = actualIdentityPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualIdentityPredicateResult instanceof IdentityPredicate);
    assertEquals("42", ((IdentityPredicate<Object>) actualIdentityPredicateResult).getValue());
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#identityPredicate(Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link NullPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#identityPredicate(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.identityPredicate(Object)"})
  public void testIdentityPredicate_whenNull_thenReturnNullPredicate() {
    // Arrange and Act
    Predicate<Object> actualIdentityPredicateResult = PredicateUtils.identityPredicate(null);

    // Assert
    assertTrue(actualIdentityPredicateResult instanceof NullPredicate);
    assertFalse(actualIdentityPredicateResult.evaluate("42"));
    assertFalse(actualIdentityPredicateResult.evaluate("Object"));
    assertFalse(actualIdentityPredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#identityPredicate(Object)}.
   * <ul>
   *   <li>When {@code Value}.</li>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#identityPredicate(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.identityPredicate(Object)"})
  public void testIdentityPredicate_whenValue_thenReturnValue() {
    // Arrange and Act
    Predicate<Object> actualIdentityPredicateResult = PredicateUtils.identityPredicate("Value");
    boolean actualEvaluateResult = actualIdentityPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualIdentityPredicateResult instanceof IdentityPredicate);
    assertEquals("Value", ((IdentityPredicate<Object>) actualIdentityPredicateResult).getValue());
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#instanceofPredicate(Class)}.
   * <p>
   * Method under test: {@link PredicateUtils#instanceofPredicate(Class)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.instanceofPredicate(Class)"})
  public void testInstanceofPredicate() {
    // Arrange
    Class<Object> type = Object.class;

    // Act
    Predicate<Object> actualInstanceofPredicateResult = PredicateUtils.instanceofPredicate(type);

    // Assert
    assertTrue(actualInstanceofPredicateResult instanceof InstanceofPredicate);
    assertTrue(actualInstanceofPredicateResult.evaluate("42"));
    Class<Object> expectedType = Object.class;
    assertEquals(expectedType, ((InstanceofPredicate) actualInstanceofPredicateResult).getType());
  }

  /**
   * Test {@link PredicateUtils#neitherPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#neitherPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.neitherPredicate(Predicate, Predicate)"})
  public void testNeitherPredicate_givenFalse_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualNeitherPredicateResult = PredicateUtils.neitherPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualNeitherPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualNeitherPredicateResult instanceof NonePredicate);
    Predicate<? super Object>[] predicates = ((NonePredicate<Object>) actualNeitherPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#neitherPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#neitherPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.neitherPredicate(Predicate, Predicate)"})
  public void testNeitherPredicate_givenFalse_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualNeitherPredicateResult = PredicateUtils.neitherPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualNeitherPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualNeitherPredicateResult instanceof NonePredicate);
    Predicate<? super Object>[] predicates = ((NonePredicate<Object>) actualNeitherPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#neitherPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#neitherPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.neitherPredicate(Predicate, Predicate)"})
  public void testNeitherPredicate_givenTrue_whenPredicate_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);

    // Act
    Predicate<Object> actualNeitherPredicateResult = PredicateUtils.neitherPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualNeitherPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    assertTrue(actualNeitherPredicateResult instanceof NonePredicate);
    Predicate<? super Object>[] predicates = ((NonePredicate<Object>) actualNeitherPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#nonePredicate(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Given {@link Predicate}.</li>
   *   <li>Then return array length is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#nonePredicate(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.nonePredicate(Collection)"})
  public void testNonePredicateWithCollection_givenPredicate_thenReturnArrayLengthIsTwo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();
    predicates.add(predicate);
    predicates.add(mock(Predicate.class));

    // Act
    Predicate<Object> actualNonePredicateResult = PredicateUtils.nonePredicate(predicates);
    boolean actualEvaluateResult = actualNonePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNonePredicateResult instanceof NonePredicate);
    assertEquals(2, ((NonePredicate<Object>) actualNonePredicateResult).getPredicates().length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#nonePredicate(Collection)} with {@code Collection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link TruePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#nonePredicate(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.nonePredicate(Collection)"})
  public void testNonePredicateWithCollection_whenArrayList_thenReturnTruePredicate() {
    // Arrange and Act
    Predicate<Object> actualNonePredicateResult = PredicateUtils.nonePredicate(new ArrayList<>());

    // Assert
    assertTrue(actualNonePredicateResult instanceof TruePredicate);
    assertTrue(actualNonePredicateResult.evaluate("42"));
    assertTrue(actualNonePredicateResult.evaluate("Object"));
    assertTrue(actualNonePredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#nonePredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#nonePredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.nonePredicate(Predicate[])"})
  public void testNonePredicateWithPredicate_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualNonePredicateResult = PredicateUtils.nonePredicate(predicate);
    boolean actualEvaluateResult = actualNonePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNonePredicateResult instanceof NonePredicate);
    assertEquals(1, ((NonePredicate<Object>) actualNonePredicateResult).getPredicates().length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#nonePredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#nonePredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.nonePredicate(Predicate[])"})
  public void testNonePredicateWithPredicate_givenTrue_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualNonePredicateResult = PredicateUtils.nonePredicate(predicate);
    boolean actualEvaluateResult = actualNonePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNonePredicateResult instanceof NonePredicate);
    assertEquals(1, ((NonePredicate<Object>) actualNonePredicateResult).getPredicates().length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#nonePredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>Then return {@link TruePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#nonePredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.nonePredicate(Predicate[])"})
  public void testNonePredicateWithPredicate_thenReturnTruePredicate() {
    // Arrange and Act
    Predicate<Object> actualNonePredicateResult = PredicateUtils.nonePredicate();

    // Assert
    assertTrue(actualNonePredicateResult instanceof TruePredicate);
    assertTrue(actualNonePredicateResult.evaluate("42"));
    assertTrue(actualNonePredicateResult.evaluate("Object"));
    assertTrue(actualNonePredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#notNullPredicate()}.
   * <p>
   * Method under test: {@link PredicateUtils#notNullPredicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.notNullPredicate()"})
  public void testNotNullPredicate() {
    // Arrange and Act
    Predicate<Object> actualNotNullPredicateResult = PredicateUtils.notNullPredicate();

    // Assert
    assertTrue(actualNotNullPredicateResult instanceof NotNullPredicate);
    assertTrue(actualNotNullPredicateResult.evaluate("42"));
    assertTrue(actualNotNullPredicateResult.evaluate("Object"));
    assertTrue(actualNotNullPredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#notPredicate(Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#notPredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.notPredicate(Predicate)"})
  public void testNotPredicate_givenFalse_whenPredicateTestReturnFalse_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualNotPredicateResult = PredicateUtils.notPredicate(predicate);
    boolean actualEvaluateResult = actualNotPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNotPredicateResult instanceof NotPredicate);
    Predicate<? super Object>[] predicates = ((NotPredicate<Object>) actualNotPredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#notPredicate(Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#notPredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.notPredicate(Predicate)"})
  public void testNotPredicate_givenTrue_whenPredicateTestReturnTrue_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualNotPredicateResult = PredicateUtils.notPredicate(predicate);
    boolean actualEvaluateResult = actualNotPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNotPredicateResult instanceof NotPredicate);
    Predicate<? super Object>[] predicates = ((NotPredicate<Object>) actualNotPredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#nullIsExceptionPredicate(Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#nullIsExceptionPredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.nullIsExceptionPredicate(Predicate)"})
  public void testNullIsExceptionPredicate_givenFalse_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualNullIsExceptionPredicateResult = PredicateUtils.nullIsExceptionPredicate(predicate);
    boolean actualEvaluateResult = actualNullIsExceptionPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNullIsExceptionPredicateResult instanceof NullIsExceptionPredicate);
    Predicate<? super Object>[] predicates = ((NullIsExceptionPredicate<Object>) actualNullIsExceptionPredicateResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#nullIsExceptionPredicate(Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#nullIsExceptionPredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.nullIsExceptionPredicate(Predicate)"})
  public void testNullIsExceptionPredicate_givenTrue_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualNullIsExceptionPredicateResult = PredicateUtils.nullIsExceptionPredicate(predicate);
    boolean actualEvaluateResult = actualNullIsExceptionPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNullIsExceptionPredicateResult instanceof NullIsExceptionPredicate);
    Predicate<? super Object>[] predicates = ((NullIsExceptionPredicate<Object>) actualNullIsExceptionPredicateResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#nullIsFalsePredicate(Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#nullIsFalsePredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.nullIsFalsePredicate(Predicate)"})
  public void testNullIsFalsePredicate_givenFalse_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualNullIsFalsePredicateResult = PredicateUtils.nullIsFalsePredicate(predicate);
    boolean actualEvaluateResult = actualNullIsFalsePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNullIsFalsePredicateResult instanceof NullIsFalsePredicate);
    Predicate<? super Object>[] predicates = ((NullIsFalsePredicate<Object>) actualNullIsFalsePredicateResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#nullIsFalsePredicate(Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#nullIsFalsePredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.nullIsFalsePredicate(Predicate)"})
  public void testNullIsFalsePredicate_givenTrue_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualNullIsFalsePredicateResult = PredicateUtils.nullIsFalsePredicate(predicate);
    boolean actualEvaluateResult = actualNullIsFalsePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNullIsFalsePredicateResult instanceof NullIsFalsePredicate);
    Predicate<? super Object>[] predicates = ((NullIsFalsePredicate<Object>) actualNullIsFalsePredicateResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#nullIsTruePredicate(Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#nullIsTruePredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.nullIsTruePredicate(Predicate)"})
  public void testNullIsTruePredicate_givenFalse_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualNullIsTruePredicateResult = PredicateUtils.nullIsTruePredicate(predicate);
    boolean actualEvaluateResult = actualNullIsTruePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNullIsTruePredicateResult instanceof NullIsTruePredicate);
    Predicate<? super Object>[] predicates = ((NullIsTruePredicate<Object>) actualNullIsTruePredicateResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#nullIsTruePredicate(Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#nullIsTruePredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.nullIsTruePredicate(Predicate)"})
  public void testNullIsTruePredicate_givenTrue_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualNullIsTruePredicateResult = PredicateUtils.nullIsTruePredicate(predicate);
    boolean actualEvaluateResult = actualNullIsTruePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNullIsTruePredicateResult instanceof NullIsTruePredicate);
    Predicate<? super Object>[] predicates = ((NullIsTruePredicate<Object>) actualNullIsTruePredicateResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#nullPredicate()}.
   * <p>
   * Method under test: {@link PredicateUtils#nullPredicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.nullPredicate()"})
  public void testNullPredicate() {
    // Arrange and Act
    Predicate<Object> actualNullPredicateResult = PredicateUtils.nullPredicate();

    // Assert
    assertTrue(actualNullPredicateResult instanceof NullPredicate);
    assertFalse(actualNullPredicateResult.evaluate("42"));
    assertFalse(actualNullPredicateResult.evaluate("Object"));
    assertFalse(actualNullPredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#onePredicate(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Then return array length is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#onePredicate(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.onePredicate(Collection)"})
  public void testOnePredicateWithCollection_thenReturnArrayLengthIsTwo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();
    predicates.add(predicate2);
    predicates.add(predicate);

    // Act
    Predicate<Object> actualOnePredicateResult = PredicateUtils.onePredicate(predicates);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    verify(predicate2).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualOnePredicateResult instanceof OnePredicate);
    assertEquals(2, ((OnePredicate<Object>) actualOnePredicateResult).getPredicates().length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#onePredicate(Collection)} with {@code Collection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return array length is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#onePredicate(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.onePredicate(Collection)"})
  public void testOnePredicateWithCollection_whenArrayList_thenReturnArrayLengthIsZero() {
    // Arrange and Act
    Predicate<Object> actualOnePredicateResult = PredicateUtils.onePredicate(new ArrayList<>());
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    assertTrue(actualOnePredicateResult instanceof OnePredicate);
    assertEquals(0, ((OnePredicate<Object>) actualOnePredicateResult).getPredicates().length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#onePredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>Then return {@link FalsePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#onePredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.onePredicate(Predicate[])"})
  public void testOnePredicateWithPredicate_thenReturnFalsePredicate() {
    // Arrange and Act
    Predicate<Object> actualOnePredicateResult = PredicateUtils.onePredicate();

    // Assert
    assertTrue(actualOnePredicateResult instanceof FalsePredicate);
    assertFalse(actualOnePredicateResult.evaluate("42"));
    assertFalse(actualOnePredicateResult.evaluate("Object"));
    assertFalse(actualOnePredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#onePredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code false}.</li>
   *   <li>Then calls {@link Predicate#evaluate(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#onePredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.onePredicate(Predicate[])"})
  public void testOnePredicateWithPredicate_whenPredicateEvaluateReturnFalse_thenCallsEvaluate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualOnePredicateResult = PredicateUtils.onePredicate(predicate);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#onePredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#onePredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.onePredicate(Predicate[])"})
  public void testOnePredicateWithPredicate_whenPredicateEvaluateReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualOnePredicateResult = PredicateUtils.onePredicate(predicate);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#onePredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#onePredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.onePredicate(Predicate[])"})
  public void testOnePredicateWithPredicate_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualOnePredicateResult = PredicateUtils.onePredicate(predicate, predicate2);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualOnePredicateResult instanceof OnePredicate);
    assertEquals(2, ((OnePredicate<Object>) actualOnePredicateResult).getPredicates().length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#onePredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@link OnePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#onePredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.onePredicate(Predicate[])"})
  public void testOnePredicateWithPredicate_whenPredicateTestReturnTrue_thenReturnOnePredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualOnePredicateResult = PredicateUtils.onePredicate(predicate, predicate2);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualOnePredicateResult instanceof OnePredicate);
    assertEquals(2, ((OnePredicate<Object>) actualOnePredicateResult).getPredicates().length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#orPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#orPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.orPredicate(Predicate, Predicate)"})
  public void testOrPredicate_givenFalse_whenPredicateTestReturnFalse_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualOrPredicateResult = PredicateUtils.orPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualOrPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualOrPredicateResult instanceof OrPredicate);
    Predicate<? super Object>[] predicates = ((OrPredicate<Object>) actualOrPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#orPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#orPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.orPredicate(Predicate, Predicate)"})
  public void testOrPredicate_givenFalse_whenPredicateTestReturnFalse_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualOrPredicateResult = PredicateUtils.orPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualOrPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualOrPredicateResult instanceof OrPredicate);
    Predicate<? super Object>[] predicates = ((OrPredicate<Object>) actualOrPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#orPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#orPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.orPredicate(Predicate, Predicate)"})
  public void testOrPredicate_givenTrue_whenPredicate_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);

    // Act
    Predicate<Object> actualOrPredicateResult = PredicateUtils.orPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualOrPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    assertTrue(actualOrPredicateResult instanceof OrPredicate);
    Predicate<? super Object>[] predicates = ((OrPredicate<Object>) actualOrPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#transformedPredicate(Transformer, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#transformedPredicate(Transformer, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.transformedPredicate(Transformer, Predicate)"})
  public void testTransformedPredicate_givenFalse_thenReturnNotEvaluate42() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualTransformedPredicateResult = PredicateUtils.transformedPredicate(transformer, predicate);
    boolean actualEvaluateResult = actualTransformedPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualTransformedPredicateResult instanceof TransformedPredicate);
    Predicate<? super Object>[] predicates = ((TransformedPredicate<Object>) actualTransformedPredicateResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
    assertSame(transformer, ((TransformedPredicate<Object>) actualTransformedPredicateResult).getTransformer());
  }

  /**
   * Test {@link PredicateUtils#transformedPredicate(Transformer, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateUtils#transformedPredicate(Transformer, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.transformedPredicate(Transformer, Predicate)"})
  public void testTransformedPredicate_givenTrue_thenReturnEvaluate42() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualTransformedPredicateResult = PredicateUtils.transformedPredicate(transformer, predicate);
    boolean actualEvaluateResult = actualTransformedPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualTransformedPredicateResult instanceof TransformedPredicate);
    Predicate<? super Object>[] predicates = ((TransformedPredicate<Object>) actualTransformedPredicateResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
    assertSame(transformer, ((TransformedPredicate<Object>) actualTransformedPredicateResult).getTransformer());
  }

  /**
   * Test {@link PredicateUtils#truePredicate()}.
   * <p>
   * Method under test: {@link PredicateUtils#truePredicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate PredicateUtils.truePredicate()"})
  public void testTruePredicate() {
    // Arrange and Act
    Predicate<Object> actualTruePredicateResult = PredicateUtils.truePredicate();

    // Assert
    assertTrue(actualTruePredicateResult instanceof TruePredicate);
    assertTrue(actualTruePredicateResult.evaluate("42"));
    assertTrue(actualTruePredicateResult.evaluate("Object"));
    assertTrue(actualTruePredicateResult.test("Object"));
  }
}
