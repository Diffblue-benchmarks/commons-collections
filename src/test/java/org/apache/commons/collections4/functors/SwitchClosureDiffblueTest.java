package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class SwitchClosureDiffblueTest {
  /**
   * Test {@link SwitchClosure#switchClosure(Map)} with {@code predicatesAndClosures}.
   * <ul>
   *   <li>Then return array length is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#switchClosure(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Map)"})
  public void testSwitchClosureWithPredicatesAndClosures_thenReturnArrayLengthIsOne() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    predicatesAndClosures.put(predicate, closure);

    // Act
    Closure<Object> actualSwitchClosureResult = SwitchClosure.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure() instanceof NOPClosure);
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Map)} with {@code predicatesAndClosures}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#switchClosure(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Map)"})
  public void testSwitchClosureWithPredicatesAndClosures_thenThrowIllegalArgumentException() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doThrow(new IllegalArgumentException("foo")).when(closure).accept(Mockito.<Object>any());

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    predicatesAndClosures.put(predicate, closure);

    // Act
    Closure<Object> actualSwitchClosureResult = SwitchClosure.switchClosure(predicatesAndClosures);

    // Assert
    assertThrows(IllegalArgumentException.class, () -> actualSwitchClosureResult.execute("42"));
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Map)} with {@code predicatesAndClosures}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#switchClosure(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Map)"})
  public void testSwitchClosureWithPredicatesAndClosures_whenHashMap_thenReturnNOPClosure() {
    // Arrange and Act
    Closure<Object> actualSwitchClosureResult = SwitchClosure.switchClosure(new HashMap<>());
    actualSwitchClosureResult.execute("42");

    // Assert
    assertTrue(actualSwitchClosureResult instanceof NOPClosure);
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)} with {@code predicates}, {@code closures}, {@code defaultClosure}.
   * <p>
   * Method under test: {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Predicate[], Closure[], Closure)"})
  public void testSwitchClosureWithPredicatesClosuresDefaultClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doThrow(new IllegalArgumentException("foo")).when(closure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualSwitchClosureResult = SwitchClosure.switchClosure(new Predicate[]{predicate},
        new Closure[]{closure}, mock(Closure.class));

    // Assert
    assertThrows(IllegalArgumentException.class, () -> actualSwitchClosureResult.execute("42"));
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)} with {@code predicates}, {@code closures}, {@code defaultClosure}.
   * <p>
   * Method under test: {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Predicate[], Closure[], Closure)"})
  public void testSwitchClosureWithPredicatesClosuresDefaultClosure2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Closure<Object> defaultClosure = mock(Closure.class);
    doThrow(new IllegalArgumentException("foo")).when(defaultClosure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualSwitchClosureResult = SwitchClosure.switchClosure(new Predicate[]{predicate},
        new Closure[]{closure}, defaultClosure);

    // Assert
    assertThrows(IllegalArgumentException.class, () -> actualSwitchClosureResult.execute("42"));
    verify(defaultClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)} with {@code predicates}, {@code closures}, {@code defaultClosure}.
   * <ul>
   *   <li>Then return {@link SwitchClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Predicate[], Closure[], Closure)"})
  public void testSwitchClosureWithPredicatesClosuresDefaultClosure_thenReturnSwitchClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Closure<Object> defaultClosure = mock(Closure.class);

    // Act
    Closure<Object> actualSwitchClosureResult = SwitchClosure.switchClosure(new Predicate[]{predicate},
        new Closure[]{closure}, defaultClosure);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
    assertSame(defaultClosure, ((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure());
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)} with {@code predicates}, {@code closures}, {@code defaultClosure}.
   * <ul>
   *   <li>Then return {@link SwitchClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Predicate[], Closure[], Closure)"})
  public void testSwitchClosureWithPredicatesClosuresDefaultClosure_thenReturnSwitchClosure2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Closure<Object> defaultClosure = mock(Closure.class);
    doNothing().when(defaultClosure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualSwitchClosureResult = SwitchClosure.switchClosure(new Predicate[]{predicate},
        new Closure[]{closure}, defaultClosure);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(defaultClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
    assertSame(defaultClosure, ((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure());
  }

  /**
   * Test {@link SwitchClosure#SwitchClosure(Predicate[], Closure[], Closure)}.
   * <ul>
   *   <li>Then return array length is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#SwitchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SwitchClosure.<init>(Predicate[], Closure[], Closure)"})
  public void testNewSwitchClosure_thenReturnArrayLengthIsOne() {
    // Arrange
    Closure<Object> defaultClosure = mock(Closure.class);

    // Act
    SwitchClosure<Object> actualSwitchClosure = new SwitchClosure<>(new Predicate[]{mock(Predicate.class)},
        new Closure[]{mock(Closure.class)}, defaultClosure);

    // Assert
    assertEquals(1, actualSwitchClosure.getClosures().length);
    assertEquals(1, actualSwitchClosure.getPredicates().length);
    assertSame(defaultClosure, actualSwitchClosure.getDefaultClosure());
  }

  /**
   * Test {@link SwitchClosure#SwitchClosure(Predicate[], Closure[], Closure)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then DefaultClosure return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#SwitchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SwitchClosure.<init>(Predicate[], Closure[], Closure)"})
  public void testNewSwitchClosure_whenNull_thenDefaultClosureReturnNOPClosure() {
    // Arrange and Act
    SwitchClosure<Object> actualSwitchClosure = new SwitchClosure<>(null, null, null);

    // Assert
    assertTrue(actualSwitchClosure.getDefaultClosure() instanceof NOPClosure);
    assertNull(actualSwitchClosure.getClosures());
    assertNull(actualSwitchClosure.getPredicates());
  }

  /**
   * Test {@link SwitchClosure#execute(Object)}.
   * <ul>
   *   <li>Given {@link Closure} {@link Closure#accept(Object)} throw {@link IllegalArgumentException#IllegalArgumentException(String)} with {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#execute(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SwitchClosure.execute(Object)"})
  public void testExecute_givenClosureAcceptThrowIllegalArgumentExceptionWithFoo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doThrow(new IllegalArgumentException("foo")).when(closure).accept(Mockito.<Object>any());
    SwitchClosure<Object> switchClosure = new SwitchClosure<>(new Predicate[]{predicate}, new Closure[]{closure},
        mock(Closure.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> switchClosure.execute("Input"));
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#execute(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then calls {@link Closure#accept(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#execute(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SwitchClosure.execute(Object)"})
  public void testExecute_givenPredicateTestReturnFalse_thenCallsAccept() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Closure<Object> defaultClosure = mock(Closure.class);
    doNothing().when(defaultClosure).accept(Mockito.<Object>any());
    SwitchClosure<Object> switchClosure = new SwitchClosure<>(new Predicate[]{predicate}, new Closure[]{closure},
        defaultClosure);

    // Act
    switchClosure.execute("Input");

    // Assert
    verify(defaultClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#execute(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Closure#accept(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#execute(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SwitchClosure.execute(Object)"})
  public void testExecute_givenPredicateTestReturnTrue_thenCallsAccept() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    SwitchClosure<Object> switchClosure = new SwitchClosure<>(new Predicate[]{predicate}, new Closure[]{closure},
        mock(Closure.class));

    // Act
    switchClosure.execute("Input");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#execute(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} throw {@link IllegalArgumentException#IllegalArgumentException(String)} with {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#execute(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SwitchClosure.execute(Object)"})
  public void testExecute_givenPredicateTestThrowIllegalArgumentExceptionWithFoo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));
    SwitchClosure<Object> switchClosure = new SwitchClosure<>(new Predicate[]{predicate, mock(Predicate.class)},
        new Closure[]{mock(Closure.class)}, mock(Closure.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> switchClosure.execute("Input"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#getClosures()}.
   * <p>
   * Method under test: {@link SwitchClosure#getClosures()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure[] SwitchClosure.getClosures()"})
  public void testGetClosures() {
    // Arrange
    SwitchClosure<Object> switchClosure = new SwitchClosure<>(new Predicate[]{mock(Predicate.class)},
        new Closure[]{mock(Closure.class)}, mock(Closure.class));

    // Act and Assert
    assertEquals(1, switchClosure.getClosures().length);
  }

  /**
   * Test {@link SwitchClosure#getPredicates()}.
   * <p>
   * Method under test: {@link SwitchClosure#getPredicates()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate[] SwitchClosure.getPredicates()"})
  public void testGetPredicates() {
    // Arrange
    SwitchClosure<Object> switchClosure = new SwitchClosure<>(new Predicate[]{mock(Predicate.class)},
        new Closure[]{mock(Closure.class)}, mock(Closure.class));

    // Act and Assert
    assertEquals(1, switchClosure.getPredicates().length);
  }
}
