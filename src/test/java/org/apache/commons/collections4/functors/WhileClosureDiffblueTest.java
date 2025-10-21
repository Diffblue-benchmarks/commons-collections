package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class WhileClosureDiffblueTest {
  /**
   * Test {@link WhileClosure#whileClosure(Predicate, Closure, boolean)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@link WhileClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WhileClosure#whileClosure(Predicate, Closure, boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure WhileClosure.whileClosure(Predicate, Closure, boolean)"})
  public void testWhileClosure_givenFalse_whenPredicateTestReturnFalse_thenReturnWhileClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualWhileClosureResult = WhileClosure.whileClosure(predicate, closure, true);
    actualWhileClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualWhileClosureResult instanceof WhileClosure);
    assertTrue(((WhileClosure<Object>) actualWhileClosureResult).isDoLoop());
    assertSame(closure, ((WhileClosure<Object>) actualWhileClosureResult).getClosure());
    assertSame(predicate, ((WhileClosure<Object>) actualWhileClosureResult).getPredicate());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link WhileClosure#WhileClosure(Predicate, Closure, boolean)}
   *   <li>{@link WhileClosure#getClosure()}
   *   <li>{@link WhileClosure#getPredicate()}
   *   <li>{@link WhileClosure#isDoLoop()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void WhileClosure.<init>(Predicate, Closure, boolean)", "Closure WhileClosure.getClosure()",
      "Predicate WhileClosure.getPredicate()", "boolean WhileClosure.isDoLoop()"})
  public void testGettersAndSetters() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    Closure<Object> closure = mock(Closure.class);

    // Act
    WhileClosure<Object> actualWhileClosure = new WhileClosure<>(predicate, closure, true);
    Closure<? super Object> actualClosure = actualWhileClosure.getClosure();
    Predicate<? super Object> actualPredicate = actualWhileClosure.getPredicate();

    // Assert
    assertTrue(actualWhileClosure.isDoLoop());
    assertSame(closure, actualClosure);
    assertSame(predicate, actualPredicate);
  }

  /**
   * Test {@link WhileClosure#execute(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then calls {@link Closure#accept(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WhileClosure#execute(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void WhileClosure.execute(Object)"})
  public void testExecute_givenPredicateTestReturnFalse_thenCallsAccept() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    WhileClosure<Object> whileClosure = new WhileClosure<>(predicate, closure, true);

    // Act
    whileClosure.execute("Input");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
  }
}
