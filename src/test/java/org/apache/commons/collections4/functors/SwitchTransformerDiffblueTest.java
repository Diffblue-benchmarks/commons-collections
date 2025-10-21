package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class SwitchTransformerDiffblueTest {
  /**
   * Test {@link SwitchTransformer#switchTransformer(Map)} with {@code map}.
   * <ul>
   *   <li>Then DefaultTransformer return {@link ConstantTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchTransformer#switchTransformer(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer SwitchTransformer.switchTransformer(Map)"})
  public void testSwitchTransformerWithMap_thenDefaultTransformerReturnConstantTransformer() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    HashMap<Predicate<? super Object>, Transformer<? super Object, ?>> map = new HashMap<>();
    map.put(predicate2, mock(Transformer.class));
    map.put(predicate, mock(Transformer.class));

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult = SwitchTransformer.switchTransformer(map);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate2).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    Transformer<? super Object, ?> defaultTransformer = ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult)
        .getDefaultTransformer();
    assertTrue(defaultTransformer instanceof ConstantTransformer);
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertNull(actualTransformResult);
    assertNull(((ConstantTransformer<? super Object, ?>) defaultTransformer).getConstant());
    assertEquals(2, ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates().length);
    assertEquals(2, ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getTransformers().length);
  }

  /**
   * Test {@link SwitchTransformer#switchTransformer(Map)} with {@code map}.
   * <ul>
   *   <li>Then return array length is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchTransformer#switchTransformer(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer SwitchTransformer.switchTransformer(Map)"})
  public void testSwitchTransformerWithMap_thenReturnArrayLengthIsOne() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    HashMap<Predicate<? super Object>, Transformer<? super Object, ?>> map = new HashMap<>();
    map.put(predicate, transformer);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult = SwitchTransformer.switchTransformer(map);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertEquals("Apply", actualTransformResult);
    assertEquals(1, ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates().length);
    assertEquals(1, ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getTransformers().length);
  }

  /**
   * Test {@link SwitchTransformer#switchTransformer(Map)} with {@code map}.
   * <ul>
   *   <li>Then return transform {@code 42} is {@code Apply}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchTransformer#switchTransformer(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer SwitchTransformer.switchTransformer(Map)"})
  public void testSwitchTransformerWithMap_thenReturnTransform42IsApply() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    HashMap<Predicate<? super Object>, Transformer<? super Object, ?>> map = new HashMap<>();
    map.put(predicate2, mock(Transformer.class));
    map.put(predicate, transformer);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult = SwitchTransformer.switchTransformer(map);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertEquals("Apply", actualTransformResult);
    assertEquals(2, ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates().length);
    assertEquals(2, ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getTransformers().length);
  }

  /**
   * Test {@link SwitchTransformer#switchTransformer(Map)} with {@code map}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchTransformer#switchTransformer(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer SwitchTransformer.switchTransformer(Map)"})
  public void testSwitchTransformerWithMap_thenThrowIllegalArgumentException() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    HashMap<Predicate<? super Object>, Transformer<? super Object, ?>> map = new HashMap<>();
    map.put(predicate, transformer);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult = SwitchTransformer.switchTransformer(map);

    // Assert
    assertThrows(IllegalArgumentException.class, () -> actualSwitchTransformerResult.transform("42"));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link SwitchTransformer#switchTransformer(Map)} with {@code map}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@link ConstantTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchTransformer#switchTransformer(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer SwitchTransformer.switchTransformer(Map)"})
  public void testSwitchTransformerWithMap_whenHashMap_thenReturnConstantTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualSwitchTransformerResult = SwitchTransformer.switchTransformer(new HashMap<>());

    // Assert
    assertTrue(actualSwitchTransformerResult instanceof ConstantTransformer);
    assertNull(actualSwitchTransformerResult.transform("42"));
    assertNull(((ConstantTransformer<Object, Object>) actualSwitchTransformerResult).getConstant());
  }

  /**
   * Test {@link SwitchTransformer#switchTransformer(Predicate[], Transformer[], Transformer)} with {@code predicates}, {@code transformers}, {@code defaultTransformer}.
   * <p>
   * Method under test: {@link SwitchTransformer#switchTransformer(Predicate[], Transformer[], Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer SwitchTransformer.switchTransformer(Predicate[], Transformer[], Transformer)"})
  public void testSwitchTransformerWithPredicatesTransformersDefaultTransformer() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> defaultTransformer = mock(Transformer.class);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult = SwitchTransformer
        .switchTransformer(new Predicate[]{predicate}, new Transformer[]{transformer}, defaultTransformer);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertEquals("Apply", actualTransformResult);
    assertEquals(1, ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates().length);
    assertEquals(1, ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getTransformers().length);
    assertSame(defaultTransformer,
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getDefaultTransformer());
  }

  /**
   * Test {@link SwitchTransformer#switchTransformer(Predicate[], Transformer[], Transformer)} with {@code predicates}, {@code transformers}, {@code defaultTransformer}.
   * <p>
   * Method under test: {@link SwitchTransformer#switchTransformer(Predicate[], Transformer[], Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer SwitchTransformer.switchTransformer(Predicate[], Transformer[], Transformer)"})
  public void testSwitchTransformerWithPredicatesTransformersDefaultTransformer2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult = SwitchTransformer
        .switchTransformer(new Predicate[]{predicate}, new Transformer[]{transformer}, mock(Transformer.class));

    // Assert
    assertThrows(IllegalArgumentException.class, () -> actualSwitchTransformerResult.transform("42"));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link SwitchTransformer#switchTransformer(Predicate[], Transformer[], Transformer)} with {@code predicates}, {@code transformers}, {@code defaultTransformer}.
   * <p>
   * Method under test: {@link SwitchTransformer#switchTransformer(Predicate[], Transformer[], Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer SwitchTransformer.switchTransformer(Predicate[], Transformer[], Transformer)"})
  public void testSwitchTransformerWithPredicatesTransformersDefaultTransformer3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult = SwitchTransformer
        .switchTransformer(new Predicate[]{predicate}, new Transformer[]{transformer}, defaultTransformer);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertEquals("Apply", actualTransformResult);
    assertEquals(1, ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates().length);
    assertEquals(1, ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getTransformers().length);
    assertSame(defaultTransformer,
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getDefaultTransformer());
  }

  /**
   * Test {@link SwitchTransformer#switchTransformer(Predicate[], Transformer[], Transformer)} with {@code predicates}, {@code transformers}, {@code defaultTransformer}.
   * <p>
   * Method under test: {@link SwitchTransformer#switchTransformer(Predicate[], Transformer[], Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer SwitchTransformer.switchTransformer(Predicate[], Transformer[], Transformer)"})
  public void testSwitchTransformerWithPredicatesTransformersDefaultTransformer4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult = SwitchTransformer
        .switchTransformer(new Predicate[]{predicate}, new Transformer[]{transformer}, defaultTransformer);

    // Assert
    assertThrows(IllegalArgumentException.class, () -> actualSwitchTransformerResult.transform("42"));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link SwitchTransformer#SwitchTransformer(Predicate[], Transformer[], Transformer)}.
   * <ul>
   *   <li>Then DefaultTransformer return {@link ConstantTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchTransformer#SwitchTransformer(Predicate[], Transformer[], Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SwitchTransformer.<init>(Predicate[], Transformer[], Transformer)"})
  public void testNewSwitchTransformer_thenDefaultTransformerReturnConstantTransformer() {
    // Arrange and Act
    SwitchTransformer<Object, Object> actualSwitchTransformer = new SwitchTransformer<>(null, null, null);

    // Assert
    Transformer<? super Object, ?> defaultTransformer = actualSwitchTransformer.getDefaultTransformer();
    assertTrue(defaultTransformer instanceof ConstantTransformer);
    assertNull(actualSwitchTransformer.getPredicates());
    assertNull(actualSwitchTransformer.getTransformers());
    assertNull(((ConstantTransformer<? super Object, ?>) defaultTransformer).getConstant());
  }

  /**
   * Test {@link SwitchTransformer#SwitchTransformer(Predicate[], Transformer[], Transformer)}.
   * <ul>
   *   <li>Then return array length is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchTransformer#SwitchTransformer(Predicate[], Transformer[], Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SwitchTransformer.<init>(Predicate[], Transformer[], Transformer)"})
  public void testNewSwitchTransformer_thenReturnArrayLengthIsOne() {
    // Arrange
    Transformer<Object, Object> defaultTransformer = mock(Transformer.class);

    // Act
    SwitchTransformer<Object, Object> actualSwitchTransformer = new SwitchTransformer<>(
        new Predicate[]{mock(Predicate.class)}, new Transformer[]{mock(Transformer.class)}, defaultTransformer);

    // Assert
    assertEquals(1, actualSwitchTransformer.getPredicates().length);
    assertEquals(1, actualSwitchTransformer.getTransformers().length);
    assertSame(defaultTransformer, actualSwitchTransformer.getDefaultTransformer());
  }

  /**
   * Test {@link SwitchTransformer#getPredicates()}.
   * <p>
   * Method under test: {@link SwitchTransformer#getPredicates()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate[] SwitchTransformer.getPredicates()"})
  public void testGetPredicates() {
    // Arrange
    SwitchTransformer<Object, Object> switchTransformer = new SwitchTransformer<>(
        new Predicate[]{mock(Predicate.class)}, new Transformer[]{mock(Transformer.class)}, mock(Transformer.class));

    // Act and Assert
    assertEquals(1, switchTransformer.getPredicates().length);
  }

  /**
   * Test {@link SwitchTransformer#getTransformers()}.
   * <p>
   * Method under test: {@link SwitchTransformer#getTransformers()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer[] SwitchTransformer.getTransformers()"})
  public void testGetTransformers() {
    // Arrange
    SwitchTransformer<Object, Object> switchTransformer = new SwitchTransformer<>(
        new Predicate[]{mock(Predicate.class)}, new Transformer[]{mock(Transformer.class)}, mock(Transformer.class));

    // Act and Assert
    assertEquals(1, switchTransformer.getTransformers().length);
  }

  /**
   * Test {@link SwitchTransformer#transform(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@code Apply}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchTransformer#transform(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object SwitchTransformer.transform(Object)"})
  public void testTransform_givenPredicateTestReturnFalse_thenReturnApply() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    SwitchTransformer<Object, Object> switchTransformer = new SwitchTransformer<>(new Predicate[]{predicate},
        new Transformer[]{transformer}, defaultTransformer);

    // Act
    Object actualTransformResult = switchTransformer.transform("Input");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertEquals("Apply", actualTransformResult);
  }

  /**
   * Test {@link SwitchTransformer#transform(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code Apply}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchTransformer#transform(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object SwitchTransformer.transform(Object)"})
  public void testTransform_givenPredicateTestReturnTrue_thenReturnApply() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    SwitchTransformer<Object, Object> switchTransformer = new SwitchTransformer<>(new Predicate[]{predicate},
        new Transformer[]{transformer}, mock(Transformer.class));

    // Act
    Object actualTransformResult = switchTransformer.transform("Input");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals("Apply", actualTransformResult);
  }

  /**
   * Test {@link SwitchTransformer#transform(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} throw {@link IllegalArgumentException#IllegalArgumentException(String)} with {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchTransformer#transform(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object SwitchTransformer.transform(Object)"})
  public void testTransform_givenPredicateTestThrowIllegalArgumentExceptionWithFoo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));
    SwitchTransformer<Object, Object> switchTransformer = new SwitchTransformer<>(
        new Predicate[]{predicate, mock(Predicate.class)}, new Transformer[]{mock(Transformer.class)},
        mock(Transformer.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> switchTransformer.transform("Input"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchTransformer#transform(Object)}.
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} throw {@link IllegalArgumentException#IllegalArgumentException(String)} with {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchTransformer#transform(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object SwitchTransformer.transform(Object)"})
  public void testTransform_givenTransformerApplyThrowIllegalArgumentExceptionWithFoo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));
    SwitchTransformer<Object, Object> switchTransformer = new SwitchTransformer<>(new Predicate[]{predicate},
        new Transformer[]{transformer}, mock(Transformer.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> switchTransformer.transform("Input"));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }
}
