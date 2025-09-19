package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SwitchTransformerDiffblueTest {
  /**
   * Test {@link SwitchTransformer#switchTransformer(Map)} with {@code map}.
   *
   * <p>Method under test: {@link SwitchTransformer#switchTransformer(Map)}
   */
  @Test
  @DisplayName("Test switchTransformer(Map) with 'map'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer SwitchTransformer.switchTransformer(Map)"})
  void testSwitchTransformerWithMap() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    HashMap<Predicate<? super Object>, Transformer<? super Object, ?>> map = new HashMap<>();
    map.put(predicate, null);
    AndPredicate<? super Object> andPredicate =
        new AndPredicate<>(mock(Predicate.class), mock(Predicate.class));
    map.put(andPredicate, mock(Transformer.class));

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        SwitchTransformer.switchTransformer(map);

    // Assert
    assertThrows(
        IllegalArgumentException.class, () -> actualSwitchTransformerResult.transform("42"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchTransformer#switchTransformer(Map)} with {@code map}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then {@link HashMap#HashMap()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link SwitchTransformer#switchTransformer(Map)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Map) with 'map'; given Predicate test(Object) return 'false'; then HashMap() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer SwitchTransformer.switchTransformer(Map)"})
  void testSwitchTransformerWithMap_givenPredicateTestReturnFalse_thenHashMapSizeIsTwo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    HashMap<Predicate<? super Object>, Transformer<? super Object, ?>> map = new HashMap<>();
    map.put(predicate, mock(Transformer.class));
    map.put(predicate2, mock(Transformer.class));

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        SwitchTransformer.switchTransformer(map);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertEquals(2, map.size());
    Transformer<? super Object, ?> defaultTransformer =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getDefaultTransformer();
    assertTrue(defaultTransformer instanceof ConstantTransformer);
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertNull(actualTransformResult);
    assertNull(((ConstantTransformer<? super Object, ?>) defaultTransformer).getConstant());
    assertEquals(
        2,
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates().length);
    assertEquals(
        2,
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult)
            .getTransformers()
            .length);
  }

  /**
   * Test {@link SwitchTransformer#switchTransformer(Map)} with {@code map}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchTransformer#switchTransformer(Map)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Map) with 'map'; given Predicate test(Object) throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer SwitchTransformer.switchTransformer(Map)"})
  void testSwitchTransformerWithMap_givenPredicateTestThrowIllegalArgumentException() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    HashMap<Predicate<? super Object>, Transformer<? super Object, ?>> map = new HashMap<>();
    map.put(predicate, null);
    map.put(null, mock(Transformer.class));

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        SwitchTransformer.switchTransformer(map);

    // Assert
    assertThrows(
        IllegalArgumentException.class, () -> actualSwitchTransformerResult.transform("42"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchTransformer#switchTransformer(Map)} with {@code map}.
   *
   * <ul>
   *   <li>Given {@link Predicate}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchTransformer#switchTransformer(Map)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Map) with 'map'; given Predicate; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer SwitchTransformer.switchTransformer(Map)"})
  void testSwitchTransformerWithMap_givenPredicate_thenThrowIllegalArgumentException() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    HashMap<Predicate<? super Object>, Transformer<? super Object, ?>> map = new HashMap<>();
    map.put(predicate, null);
    map.put(mock(Predicate.class), mock(Transformer.class));

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        SwitchTransformer.switchTransformer(map);

    // Assert
    assertThrows(
        IllegalArgumentException.class, () -> actualSwitchTransformerResult.transform("42"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchTransformer#switchTransformer(Map)} with {@code map}.
   *
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchTransformer#switchTransformer(Map)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Map) with 'map'; given Transformer apply(Object) throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer SwitchTransformer.switchTransformer(Map)"})
  void testSwitchTransformerWithMap_givenTransformerApplyThrowIllegalArgumentException() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    HashMap<Predicate<? super Object>, Transformer<? super Object, ?>> map = new HashMap<>();
    map.put(predicate, mock(Transformer.class));
    map.put(null, transformer);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        SwitchTransformer.switchTransformer(map);

    // Assert
    assertThrows(
        IllegalArgumentException.class, () -> actualSwitchTransformerResult.transform("42"));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link SwitchTransformer#switchTransformer(Map)} with {@code map}.
   *
   * <ul>
   *   <li>Then {@link HashMap#HashMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link SwitchTransformer#switchTransformer(Map)}
   */
  @Test
  @DisplayName("Test switchTransformer(Map) with 'map'; then HashMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer SwitchTransformer.switchTransformer(Map)"})
  void testSwitchTransformerWithMap_thenHashMapSizeIsOne() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    HashMap<Predicate<? super Object>, Transformer<? super Object, ?>> map = new HashMap<>();
    map.put(predicate, mock(Transformer.class));
    map.put(null, transformer);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        SwitchTransformer.switchTransformer(map);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertEquals(1, map.size());
    assertEquals("Apply", actualTransformResult);
    assertEquals(
        1,
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates().length);
    assertEquals(
        1,
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult)
            .getTransformers()
            .length);
  }

  /**
   * Test {@link SwitchTransformer#switchTransformer(Map)} with {@code map}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code null} is {@code null}.
   *   <li>Then {@link HashMap#HashMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link SwitchTransformer#switchTransformer(Map)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Map) with 'map'; when HashMap() 'null' is 'null'; then HashMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer SwitchTransformer.switchTransformer(Map)"})
  void testSwitchTransformerWithMap_whenHashMapNullIsNull_thenHashMapEmpty() {
    // Arrange
    HashMap<Predicate<? super Object>, Transformer<? super Object, ?>> map = new HashMap<>();
    map.put(null, null);
    map.put(null, mock(Transformer.class));

    // Act
    SwitchTransformer.switchTransformer(map);

    // Assert
    assertTrue(map.isEmpty());
  }

  /**
   * Test {@link SwitchTransformer#switchTransformer(Map)} with {@code map}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code null} is {@code null}.
   *   <li>Then return {@link ConstantTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchTransformer#switchTransformer(Map)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Map) with 'map'; when HashMap() 'null' is 'null'; then return ConstantTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer SwitchTransformer.switchTransformer(Map)"})
  void testSwitchTransformerWithMap_whenHashMapNullIsNull_thenReturnConstantTransformer() {
    // Arrange
    HashMap<Predicate<? super Object>, Transformer<? super Object, ?>> map = new HashMap<>();
    map.put(null, null);
    map.put(null, null);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        SwitchTransformer.switchTransformer(map);

    // Assert
    assertTrue(actualSwitchTransformerResult instanceof ConstantTransformer);
    assertNull(((ConstantTransformer<Object, Object>) actualSwitchTransformerResult).getConstant());
    assertTrue(map.isEmpty());
  }

  /**
   * Test {@link SwitchTransformer#switchTransformer(Map)} with {@code map}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@link ConstantTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchTransformer#switchTransformer(Map)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Map) with 'map'; when HashMap(); then return ConstantTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer SwitchTransformer.switchTransformer(Map)"})
  void testSwitchTransformerWithMap_whenHashMap_thenReturnConstantTransformer() {
    // Arrange
    HashMap<Predicate<? super Object>, Transformer<? super Object, ?>> map = new HashMap<>();

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        SwitchTransformer.switchTransformer(map);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    assertTrue(actualSwitchTransformerResult instanceof ConstantTransformer);
    assertNull(actualTransformResult);
    assertNull(((ConstantTransformer<Object, Object>) actualSwitchTransformerResult).getConstant());
    assertTrue(map.isEmpty());
  }

  /**
   * Test {@link SwitchTransformer#switchTransformer(Predicate[], Transformer[], Transformer)} with
   * {@code predicates}, {@code transformers}, {@code defaultTransformer}.
   *
   * <p>Method under test: {@link SwitchTransformer#switchTransformer(Predicate[], Transformer[],
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate[], Transformer[], Transformer) with 'predicates', 'transformers', 'defaultTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer SwitchTransformer.switchTransformer(Predicate[], Transformer[], Transformer)"
  })
  void testSwitchTransformerWithPredicatesTransformersDefaultTransformer() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {mock(Predicate.class)};
    Transformer<? super Object, ?>[] transformers = new Transformer[] {mock(Transformer.class)};
    Transformer<Object, Object> defaultTransformer = mock(Transformer.class);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        SwitchTransformer.switchTransformer(predicates, transformers, defaultTransformer);

    // Assert
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertEquals(
        1,
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates().length);
    assertEquals(
        1,
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult)
            .getTransformers()
            .length);
    assertEquals(1, predicates.length);
    assertEquals(1, transformers.length);
    assertSame(
        defaultTransformer,
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult)
            .getDefaultTransformer());
  }

  /**
   * Test {@link SwitchTransformer#switchTransformer(Predicate[], Transformer[], Transformer)} with
   * {@code predicates}, {@code transformers}, {@code defaultTransformer}.
   *
   * <p>Method under test: {@link SwitchTransformer#switchTransformer(Predicate[], Transformer[],
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate[], Transformer[], Transformer) with 'predicates', 'transformers', 'defaultTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer SwitchTransformer.switchTransformer(Predicate[], Transformer[], Transformer)"
  })
  void testSwitchTransformerWithPredicatesTransformersDefaultTransformer2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        SwitchTransformer.switchTransformer(
            new Predicate[] {predicate},
            new Transformer[] {mock(Transformer.class)},
            mock(Transformer.class));

    // Assert
    assertThrows(
        IllegalArgumentException.class, () -> actualSwitchTransformerResult.transform("42"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchTransformer#switchTransformer(Predicate[], Transformer[], Transformer)} with
   * {@code predicates}, {@code transformers}, {@code defaultTransformer}.
   *
   * <p>Method under test: {@link SwitchTransformer#switchTransformer(Predicate[], Transformer[],
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate[], Transformer[], Transformer) with 'predicates', 'transformers', 'defaultTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer SwitchTransformer.switchTransformer(Predicate[], Transformer[], Transformer)"
  })
  void testSwitchTransformerWithPredicatesTransformersDefaultTransformer3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<? super Object, ?>[] transformers = new Transformer[] {transformer};
    Transformer<Object, Object> defaultTransformer = mock(Transformer.class);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        SwitchTransformer.switchTransformer(predicates, transformers, defaultTransformer);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertEquals("Apply", actualTransformResult);
    assertEquals(
        1,
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates().length);
    assertEquals(
        1,
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult)
            .getTransformers()
            .length);
    assertEquals(1, predicates.length);
    assertEquals(1, transformers.length);
    assertSame(
        defaultTransformer,
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult)
            .getDefaultTransformer());
  }

  /**
   * Test {@link SwitchTransformer#switchTransformer(Predicate[], Transformer[], Transformer)} with
   * {@code predicates}, {@code transformers}, {@code defaultTransformer}.
   *
   * <p>Method under test: {@link SwitchTransformer#switchTransformer(Predicate[], Transformer[],
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate[], Transformer[], Transformer) with 'predicates', 'transformers', 'defaultTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer SwitchTransformer.switchTransformer(Predicate[], Transformer[], Transformer)"
  })
  void testSwitchTransformerWithPredicatesTransformersDefaultTransformer4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ?>[] transformers = new Transformer[] {mock(Transformer.class)};

    Transformer<Object, Object> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        SwitchTransformer.switchTransformer(predicates, transformers, defaultTransformer);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertEquals("Apply", actualTransformResult);
    assertEquals(
        1,
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates().length);
    assertEquals(
        1,
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult)
            .getTransformers()
            .length);
    assertEquals(1, predicates.length);
    assertEquals(1, transformers.length);
    assertSame(
        defaultTransformer,
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult)
            .getDefaultTransformer());
  }

  /**
   * Test {@link SwitchTransformer#switchTransformer(Predicate[], Transformer[], Transformer)} with
   * {@code predicates}, {@code transformers}, {@code defaultTransformer}.
   *
   * <p>Method under test: {@link SwitchTransformer#switchTransformer(Predicate[], Transformer[],
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate[], Transformer[], Transformer) with 'predicates', 'transformers', 'defaultTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer SwitchTransformer.switchTransformer(Predicate[], Transformer[], Transformer)"
  })
  void testSwitchTransformerWithPredicatesTransformersDefaultTransformer5() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {};
    Transformer<? super Object, ?>[] transformers = new Transformer[] {};

    Transformer<Object, Object> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.transform(Mockito.<Object>any())).thenReturn("Transform");

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        SwitchTransformer.switchTransformer(predicates, transformers, defaultTransformer);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(defaultTransformer).transform(isA(Object.class));
    assertEquals("Transform", actualTransformResult);
    assertEquals(0, predicates.length);
    assertEquals(0, transformers.length);
  }

  /**
   * Test {@link SwitchTransformer#switchTransformer(Predicate[], Transformer[], Transformer)} with
   * {@code predicates}, {@code transformers}, {@code defaultTransformer}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchTransformer#switchTransformer(Predicate[], Transformer[],
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate[], Transformer[], Transformer) with 'predicates', 'transformers', 'defaultTransformer'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer SwitchTransformer.switchTransformer(Predicate[], Transformer[], Transformer)"
  })
  void testSwitchTransformerWithPredicatesTransformersDefaultTransformer_givenFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Object> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        SwitchTransformer.switchTransformer(
            new Predicate[] {predicate},
            new Transformer[] {mock(Transformer.class)},
            defaultTransformer);

    // Assert
    assertThrows(
        IllegalArgumentException.class, () -> actualSwitchTransformerResult.transform("42"));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link SwitchTransformer#switchTransformer(Predicate[], Transformer[], Transformer)} with
   * {@code predicates}, {@code transformers}, {@code defaultTransformer}.
   *
   * <ul>
   *   <li>Given {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchTransformer#switchTransformer(Predicate[], Transformer[],
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate[], Transformer[], Transformer) with 'predicates', 'transformers', 'defaultTransformer'; given 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer SwitchTransformer.switchTransformer(Predicate[], Transformer[], Transformer)"
  })
  void testSwitchTransformerWithPredicatesTransformersDefaultTransformer_givenTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        SwitchTransformer.switchTransformer(
            new Predicate[] {predicate}, new Transformer[] {transformer}, mock(Transformer.class));

    // Assert
    assertThrows(
        IllegalArgumentException.class, () -> actualSwitchTransformerResult.transform("42"));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link SwitchTransformer#SwitchTransformer(Predicate[], Transformer[], Transformer)}.
   *
   * <ul>
   *   <li>Then DefaultTransformer return {@link ConstantTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchTransformer#SwitchTransformer(Predicate[], Transformer[],
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test new SwitchTransformer(Predicate[], Transformer[], Transformer); then DefaultTransformer return ConstantTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SwitchTransformer.<init>(Predicate[], Transformer[], Transformer)"})
  void testNewSwitchTransformer_thenDefaultTransformerReturnConstantTransformer() {
    // Arrange and Act
    SwitchTransformer<Object, Object> actualSwitchTransformer =
        new SwitchTransformer<>(null, null, null);

    // Assert
    Transformer<? super Object, ?> defaultTransformer =
        actualSwitchTransformer.getDefaultTransformer();
    assertTrue(defaultTransformer instanceof ConstantTransformer);
    assertNull(((ConstantTransformer<? super Object, ?>) defaultTransformer).getConstant());
    assertNull(actualSwitchTransformer.getPredicates());
    assertNull(actualSwitchTransformer.getTransformers());
  }

  /**
   * Test {@link SwitchTransformer#SwitchTransformer(Predicate[], Transformer[], Transformer)}.
   *
   * <ul>
   *   <li>Then return array length is one.
   * </ul>
   *
   * <p>Method under test: {@link SwitchTransformer#SwitchTransformer(Predicate[], Transformer[],
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test new SwitchTransformer(Predicate[], Transformer[], Transformer); then return array length is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SwitchTransformer.<init>(Predicate[], Transformer[], Transformer)"})
  void testNewSwitchTransformer_thenReturnArrayLengthIsOne() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {mock(Predicate.class)};
    Transformer<? super Object, ?>[] transformers = new Transformer[] {mock(Transformer.class)};
    Transformer<Object, Object> defaultTransformer = mock(Transformer.class);

    // Act
    SwitchTransformer<Object, Object> actualSwitchTransformer =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Assert
    assertEquals(1, actualSwitchTransformer.getPredicates().length);
    assertEquals(1, actualSwitchTransformer.getTransformers().length);
    assertSame(defaultTransformer, actualSwitchTransformer.getDefaultTransformer());
  }

  /**
   * Test {@link SwitchTransformer#getPredicates()}.
   *
   * <p>Method under test: {@link SwitchTransformer#getPredicates()}
   */
  @Test
  @DisplayName("Test getPredicates()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate[] SwitchTransformer.getPredicates()"})
  void testGetPredicates() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {mock(Predicate.class)};
    Transformer<? super Object, ?>[] transformers = new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Object> switchTransformer =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertEquals(1, switchTransformer.getPredicates().length);
  }

  /**
   * Test {@link SwitchTransformer#getTransformers()}.
   *
   * <p>Method under test: {@link SwitchTransformer#getTransformers()}
   */
  @Test
  @DisplayName("Test getTransformers()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer[] SwitchTransformer.getTransformers()"})
  void testGetTransformers() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {mock(Predicate.class)};
    Transformer<? super Object, ?>[] transformers = new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Object> switchTransformer =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertEquals(1, switchTransformer.getTransformers().length);
  }

  /**
   * Test {@link SwitchTransformer#transform(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchTransformer#transform(Object)}
   */
  @Test
  @DisplayName(
      "Test transform(Object); given Predicate test(Object) return 'false'; then return 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object SwitchTransformer.transform(Object)"})
  void testTransform_givenPredicateTestReturnFalse_thenReturnApply() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Object> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<? super Object, ?>[] transformers = new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Object> switchTransformer =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    Object actualTransformResult = switchTransformer.transform("Input");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertEquals("Apply", actualTransformResult);
  }

  /**
   * Test {@link SwitchTransformer#transform(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchTransformer#transform(Object)}
   */
  @Test
  @DisplayName(
      "Test transform(Object); given Predicate test(Object) return 'true'; then return 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object SwitchTransformer.transform(Object)"})
  void testTransform_givenPredicateTestReturnTrue_thenReturnApply() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<? super Object, ?>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Object> switchTransformer =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    Object actualTransformResult = switchTransformer.transform("Input");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals("Apply", actualTransformResult);
  }

  /**
   * Test {@link SwitchTransformer#transform(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchTransformer#transform(Object)}
   */
  @Test
  @DisplayName(
      "Test transform(Object); given Predicate test(Object) throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object SwitchTransformer.transform(Object)"})
  void testTransform_givenPredicateTestThrowIllegalArgumentException() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ?>[] transformers = new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Object> switchTransformer =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> switchTransformer.transform("Input"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchTransformer#transform(Object)}.
   *
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchTransformer#transform(Object)}
   */
  @Test
  @DisplayName(
      "Test transform(Object); given Transformer apply(Object) throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object SwitchTransformer.transform(Object)"})
  void testTransform_givenTransformerApplyThrowIllegalArgumentException() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ?>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Object> switchTransformer =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> switchTransformer.transform("Input"));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link SwitchTransformer#transform(Object)}.
   *
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchTransformer#transform(Object)}
   */
  @Test
  @DisplayName(
      "Test transform(Object); given Transformer apply(Object) throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object SwitchTransformer.transform(Object)"})
  void testTransform_givenTransformerApplyThrowIllegalArgumentException2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Object> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ?>[] transformers = new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Object> switchTransformer =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> switchTransformer.transform("Input"));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }
}
