package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.functors.AllPredicate;
import org.apache.commons.collections4.functors.AndPredicate;
import org.apache.commons.collections4.functors.ChainedClosure;
import org.apache.commons.collections4.functors.ChainedTransformer;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.DefaultEquator;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.ForClosure;
import org.apache.commons.collections4.functors.NOPClosure;
import org.apache.commons.collections4.functors.SwitchClosure;
import org.apache.commons.collections4.functors.TransformerClosure;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.junit.Test;

public class ClosureUtilsDiffblueTest {
  /**
   * Method under test: {@link ClosureUtils#nopClosure()}
   */
  @Test
  public void testNopClosure() {
    // Arrange and Act
    Closure<Object> actualNopClosureResult = ClosureUtils.nopClosure();
    actualNopClosureResult.execute("42");

    // Assert that nothing has changed
    assertTrue(actualNopClosureResult instanceof NOPClosure);
  }

  /**
   * Method under test: {@link ClosureUtils#switchClosure(Map)}
   */
  @Test
  public void testSwitchClosure() {
    // Arrange and Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(new HashMap<>());
    actualSwitchClosureResult.execute("42");

    // Assert that nothing has changed
    assertTrue(actualSwitchClosureResult instanceof NOPClosure);
  }

  /**
   * Method under test: {@link ClosureUtils#switchClosure(Map)}
   */
  @Test
  public void testSwitchClosure2() {
    // Arrange
    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();
    EqualPredicate<? super Object> predicate1 = new EqualPredicate<>("Test", equator);

    AllPredicate<Object> allPredicate = new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>()));
    ChainedClosure<Object> chainedClosure = new ChainedClosure<>(new ForClosure<>(3, null));
    predicatesAndClosures.put(allPredicate, chainedClosure);

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert that nothing has changed
    assertTrue(((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure() instanceof NOPClosure);
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    Closure<? super Object>[] closures = ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures();
    assertEquals(1, closures.length);
    Predicate<? super Object>[] predicates = ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates();
    assertEquals(1, predicates.length);
    assertSame(allPredicate, predicates[0]);
    assertSame(chainedClosure, closures[0]);
  }

  /**
   * Method under test: {@link ClosureUtils#switchClosure(Map)}
   */
  @Test
  public void testSwitchClosure3() {
    // Arrange
    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    EqualPredicate<? super Object> predicate1 = new EqualPredicate<>("Object");
    AllPredicate<Object> allPredicate = new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>()));
    ChainedClosure<Object> chainedClosure = new ChainedClosure<>(new ForClosure<>(3, null));
    predicatesAndClosures.put(allPredicate, chainedClosure);

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert that nothing has changed
    assertTrue(((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure() instanceof NOPClosure);
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    Closure<? super Object>[] closures = ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures();
    assertEquals(1, closures.length);
    Predicate<? super Object>[] predicates = ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates();
    assertEquals(1, predicates.length);
    assertSame(allPredicate, predicates[0]);
    assertSame(chainedClosure, closures[0]);
  }

  /**
   * Method under test: {@link ClosureUtils#switchClosure(Map)}
   */
  @Test
  public void testSwitchClosure4() {
    // Arrange
    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<Object> allPredicate = new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>()));
    ChainedClosure<Object> chainedClosure = new ChainedClosure<>(
        new TransformerClosure<>(new ChainedTransformer<>(new ConstantTransformer<>("Constant To Return"))));
    predicatesAndClosures.put(allPredicate, chainedClosure);

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert
    assertTrue(((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure() instanceof NOPClosure);
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    Closure<? super Object>[] closures = ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures();
    assertEquals(1, closures.length);
    Predicate<? super Object>[] predicates = ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates();
    assertEquals(1, predicates.length);
    assertSame(allPredicate, predicates[0]);
    assertSame(chainedClosure, closures[0]);
  }
}
