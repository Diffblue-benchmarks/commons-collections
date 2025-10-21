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

public class AllPredicateDiffblueTest {
  /**
   * Test {@link AllPredicate#allPredicate(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Then return array length is ninety-nine.</li>
   * </ul>
   * <p>
   * Method under test: {@link AllPredicate#allPredicate(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate AllPredicate.allPredicate(Collection)"})
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
    Predicate<Object> actualAllPredicateResult = AllPredicate.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate99).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    assertEquals(99, ((AllPredicate<Object>) actualAllPredicateResult).getPredicates().length);
    assertEquals(99, ((AllPredicate<Object>) actualAllPredicateResult).iPredicates.length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link AllPredicate#allPredicate(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Then return array length is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AllPredicate#allPredicate(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate AllPredicate.allPredicate(Collection)"})
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
    Predicate<Object> actualAllPredicateResult = AllPredicate.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate2).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    assertEquals(2, ((AllPredicate<Object>) actualAllPredicateResult).getPredicates().length);
    assertEquals(2, ((AllPredicate<Object>) actualAllPredicateResult).iPredicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link AllPredicate#allPredicate(Collection)} with {@code Collection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link TruePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AllPredicate#allPredicate(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate AllPredicate.allPredicate(Collection)"})
  public void testAllPredicateWithCollection_whenArrayList_thenReturnTruePredicate() {
    // Arrange and Act
    Predicate<Object> actualAllPredicateResult = AllPredicate.allPredicate(new ArrayList<>());

    // Assert
    assertTrue(actualAllPredicateResult instanceof TruePredicate);
    assertTrue(actualAllPredicateResult.evaluate("42"));
    assertTrue(actualAllPredicateResult.evaluate("Object"));
    assertTrue(actualAllPredicateResult.test("Object"));
  }

  /**
   * Test {@link AllPredicate#allPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>Then return {@link TruePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AllPredicate#allPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate AllPredicate.allPredicate(Predicate[])"})
  public void testAllPredicateWithPredicate_thenReturnTruePredicate() {
    // Arrange and Act
    Predicate<Object> actualAllPredicateResult = AllPredicate.allPredicate();

    // Assert
    assertTrue(actualAllPredicateResult instanceof TruePredicate);
    assertTrue(actualAllPredicateResult.evaluate("42"));
    assertTrue(actualAllPredicateResult.evaluate("Object"));
    assertTrue(actualAllPredicateResult.test("Object"));
  }

  /**
   * Test {@link AllPredicate#allPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AllPredicate#allPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate AllPredicate.allPredicate(Predicate[])"})
  public void testAllPredicateWithPredicate_whenPredicateEvaluateReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualAllPredicateResult = AllPredicate.allPredicate(predicate);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link AllPredicate#allPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#evaluate(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AllPredicate#allPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate AllPredicate.allPredicate(Predicate[])"})
  public void testAllPredicateWithPredicate_whenPredicateEvaluateReturnTrue_thenCallsEvaluate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualAllPredicateResult = AllPredicate.allPredicate(predicate);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link AllPredicate#allPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AllPredicate#allPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate AllPredicate.allPredicate(Predicate[])"})
  public void testAllPredicateWithPredicate_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualAllPredicateResult = AllPredicate.allPredicate(predicate, predicate2);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    assertEquals(2, ((AllPredicate<Object>) actualAllPredicateResult).getPredicates().length);
    assertEquals(2, ((AllPredicate<Object>) actualAllPredicateResult).iPredicates.length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link AllPredicate#allPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@link AllPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AllPredicate#allPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate AllPredicate.allPredicate(Predicate[])"})
  public void testAllPredicateWithPredicate_whenPredicateTestReturnTrue_thenReturnAllPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualAllPredicateResult = AllPredicate.allPredicate(predicate, predicate2);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    assertEquals(2, ((AllPredicate<Object>) actualAllPredicateResult).getPredicates().length);
    assertEquals(2, ((AllPredicate<Object>) actualAllPredicateResult).iPredicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link AllPredicate#AllPredicate(Predicate[])}.
   * <p>
   * Method under test: {@link AllPredicate#AllPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AllPredicate.<init>(Predicate[])"})
  public void testNewAllPredicate() {
    // Arrange and Act
    AllPredicate<Object> actualAllPredicate = new AllPredicate<>(mock(Predicate.class));

    // Assert
    assertEquals(1, actualAllPredicate.getPredicates().length);
    assertEquals(1, actualAllPredicate.iPredicates.length);
  }

  /**
   * Test {@link AllPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AllPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AllPredicate.test(Object)"})
  public void testTest_givenPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    AllPredicate<Object> allPredicate = new AllPredicate<>(predicate);

    // Act
    boolean actualTestResult = allPredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link AllPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AllPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AllPredicate.test(Object)"})
  public void testTest_givenPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    AllPredicate<Object> allPredicate = new AllPredicate<>(predicate);

    // Act
    boolean actualTestResult = allPredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualTestResult);
  }
}
