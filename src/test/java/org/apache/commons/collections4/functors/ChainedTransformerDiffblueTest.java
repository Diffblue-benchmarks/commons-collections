package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ChainedTransformerDiffblueTest {
  /**
   * Test {@link ChainedTransformer#chainedTransformer(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>Given {@link Transformer}.
   *   <li>Then {@link ArrayList#ArrayList()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link ChainedTransformer#chainedTransformer(Collection)}
   */
  @Test
  @DisplayName(
      "Test chainedTransformer(Collection) with 'Collection'; given Transformer; then ArrayList() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer ChainedTransformer.chainedTransformer(Collection)"})
  void testChainedTransformerWithCollection_givenTransformer_thenArrayListSizeIsOne() {
    // Arrange
    ArrayList<Transformer<? super Object, ?>> transformers = new ArrayList<>();
    transformers.add(mock(Transformer.class));

    // Act
    Transformer<Object, Object> actualChainedTransformerResult =
        ChainedTransformer.chainedTransformer(transformers);

    // Assert
    assertTrue(actualChainedTransformerResult instanceof ChainedTransformer);
    assertEquals(1, transformers.size());
    assertEquals(
        1, ((ChainedTransformer<Object>) actualChainedTransformerResult).getTransformers().length);
  }

  /**
   * Test {@link ChainedTransformer#chainedTransformer(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>Given {@link Transformer}.
   *   <li>Then {@link ArrayList#ArrayList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link ChainedTransformer#chainedTransformer(Collection)}
   */
  @Test
  @DisplayName(
      "Test chainedTransformer(Collection) with 'Collection'; given Transformer; then ArrayList() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer ChainedTransformer.chainedTransformer(Collection)"})
  void testChainedTransformerWithCollection_givenTransformer_thenArrayListSizeIsTwo() {
    // Arrange
    ArrayList<Transformer<? super Object, ?>> transformers = new ArrayList<>();
    transformers.add(mock(Transformer.class));
    transformers.add(mock(Transformer.class));

    // Act
    Transformer<Object, Object> actualChainedTransformerResult =
        ChainedTransformer.chainedTransformer(transformers);

    // Assert
    assertTrue(actualChainedTransformerResult instanceof ChainedTransformer);
    assertEquals(2, transformers.size());
    assertEquals(
        2, ((ChainedTransformer<Object>) actualChainedTransformerResult).getTransformers().length);
  }

  /**
   * Test {@link ChainedTransformer#chainedTransformer(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>Then return transform {@code 42} is {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link ChainedTransformer#chainedTransformer(Collection)}
   */
  @Test
  @DisplayName(
      "Test chainedTransformer(Collection) with 'Collection'; then return transform '42' is 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer ChainedTransformer.chainedTransformer(Collection)"})
  void testChainedTransformerWithCollection_thenReturnTransform42IsApply() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    ArrayList<Transformer<? super Object, ?>> transformers = new ArrayList<>();
    transformers.add(transformer);

    // Act
    Transformer<Object, Object> actualChainedTransformerResult =
        ChainedTransformer.chainedTransformer(transformers);
    Object actualTransformResult = actualChainedTransformerResult.transform("42");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualChainedTransformerResult instanceof ChainedTransformer);
    assertEquals(1, transformers.size());
    assertEquals("Apply", actualTransformResult);
    assertEquals(
        1, ((ChainedTransformer<Object>) actualChainedTransformerResult).getTransformers().length);
  }

  /**
   * Test {@link ChainedTransformer#chainedTransformer(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link NOPTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link ChainedTransformer#chainedTransformer(Collection)}
   */
  @Test
  @DisplayName(
      "Test chainedTransformer(Collection) with 'Collection'; when ArrayList(); then return NOPTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer ChainedTransformer.chainedTransformer(Collection)"})
  void testChainedTransformerWithCollection_whenArrayList_thenReturnNOPTransformer() {
    // Arrange
    ArrayList<Transformer<? super Object, ?>> transformers = new ArrayList<>();

    // Act
    Transformer<Object, Object> actualChainedTransformerResult =
        ChainedTransformer.chainedTransformer(transformers);

    // Assert
    assertTrue(actualChainedTransformerResult instanceof NOPTransformer);
    assertEquals("42", actualChainedTransformerResult.apply("42"));
    assertEquals("Input", actualChainedTransformerResult.transform("Input"));
    assertTrue(transformers.isEmpty());
  }

  /**
   * Test {@link ChainedTransformer#chainedTransformer(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return transform {@code 42} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ChainedTransformer#chainedTransformer(Collection)}
   */
  @Test
  @DisplayName(
      "Test chainedTransformer(Collection) with 'Collection'; when ArrayList(); then return transform '42' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer ChainedTransformer.chainedTransformer(Collection)"})
  void testChainedTransformerWithCollection_whenArrayList_thenReturnTransform42Is42() {
    // Arrange
    ArrayList<Transformer<? super Object, ?>> transformers = new ArrayList<>();

    // Act
    Transformer<Object, Object> actualChainedTransformerResult =
        ChainedTransformer.chainedTransformer(transformers);
    Object actualTransformResult = actualChainedTransformerResult.transform("42");

    // Assert
    assertTrue(actualChainedTransformerResult instanceof NOPTransformer);
    assertEquals("42", actualChainedTransformerResult.apply("42"));
    assertEquals("42", actualTransformResult);
    assertEquals("Input", actualChainedTransformerResult.transform("Input"));
    assertTrue(transformers.isEmpty());
  }

  /**
   * Test {@link ChainedTransformer#chainedTransformer(Transformer[])} with {@code Transformer[]}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then return transform {@code 42} is {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link ChainedTransformer#chainedTransformer(Transformer[])}
   */
  @Test
  @DisplayName(
      "Test chainedTransformer(Transformer[]) with 'Transformer[]'; given 'Apply'; then return transform '42' is 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer ChainedTransformer.chainedTransformer(Transformer[])"})
  void testChainedTransformerWithTransformer_givenApply_thenReturnTransform42IsApply() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<? super Object, ?>[] transformers = new Transformer[] {transformer};

    // Act
    Transformer<Object, Object> actualChainedTransformerResult =
        ChainedTransformer.chainedTransformer(transformers);
    Object actualTransformResult = actualChainedTransformerResult.transform("42");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualChainedTransformerResult instanceof ChainedTransformer);
    assertEquals("Apply", actualTransformResult);
    assertEquals(
        1, ((ChainedTransformer<Object>) actualChainedTransformerResult).getTransformers().length);
    assertEquals(1, transformers.length);
  }

  /**
   * Test {@link ChainedTransformer#chainedTransformer(Transformer[])} with {@code Transformer[]}.
   *
   * <ul>
   *   <li>Then return {@link ChainedTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link ChainedTransformer#chainedTransformer(Transformer[])}
   */
  @Test
  @DisplayName(
      "Test chainedTransformer(Transformer[]) with 'Transformer[]'; then return ChainedTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer ChainedTransformer.chainedTransformer(Transformer[])"})
  void testChainedTransformerWithTransformer_thenReturnChainedTransformer() {
    // Arrange
    Transformer<? super Object, ?>[] transformers = new Transformer[] {mock(Transformer.class)};

    // Act
    Transformer<Object, Object> actualChainedTransformerResult =
        ChainedTransformer.chainedTransformer(transformers);

    // Assert
    assertTrue(actualChainedTransformerResult instanceof ChainedTransformer);
    assertEquals(
        1, ((ChainedTransformer<Object>) actualChainedTransformerResult).getTransformers().length);
    assertEquals(1, transformers.length);
  }

  /**
   * Test {@link ChainedTransformer#chainedTransformer(Transformer[])} with {@code Transformer[]}.
   *
   * <ul>
   *   <li>Then return {@link NOPTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link ChainedTransformer#chainedTransformer(Transformer[])}
   */
  @Test
  @DisplayName(
      "Test chainedTransformer(Transformer[]) with 'Transformer[]'; then return NOPTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer ChainedTransformer.chainedTransformer(Transformer[])"})
  void testChainedTransformerWithTransformer_thenReturnNOPTransformer() {
    // Arrange
    Transformer<? super Object, ?>[] transformers = new Transformer[] {};

    // Act
    Transformer<Object, Object> actualChainedTransformerResult =
        ChainedTransformer.chainedTransformer(transformers);
    Object actualTransformResult = actualChainedTransformerResult.transform("42");

    // Assert
    assertTrue(actualChainedTransformerResult instanceof NOPTransformer);
    assertEquals("42", actualChainedTransformerResult.apply("42"));
    assertEquals("42", actualTransformResult);
    assertEquals("Input", actualChainedTransformerResult.transform("Input"));
    assertEquals(0, transformers.length);
  }

  /**
   * Test {@link ChainedTransformer#ChainedTransformer(Transformer[])}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Transformers is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ChainedTransformer#ChainedTransformer(Transformer[])}
   */
  @Test
  @DisplayName(
      "Test new ChainedTransformer(Transformer[]); when 'null'; then return Transformers is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ChainedTransformer.<init>(Transformer[])"})
  void testNewChainedTransformer_whenNull_thenReturnTransformersIsNull() {
    // Arrange and Act
    ChainedTransformer<Object> actualChainedTransformer = new ChainedTransformer<>(null);

    // Assert
    assertNull(actualChainedTransformer.getTransformers());
  }

  /**
   * Test {@link ChainedTransformer#ChainedTransformer(Transformer[])}.
   *
   * <ul>
   *   <li>When {@link Transformer}.
   *   <li>Then return array length is one.
   * </ul>
   *
   * <p>Method under test: {@link ChainedTransformer#ChainedTransformer(Transformer[])}
   */
  @Test
  @DisplayName(
      "Test new ChainedTransformer(Transformer[]); when Transformer; then return array length is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ChainedTransformer.<init>(Transformer[])"})
  void testNewChainedTransformer_whenTransformer_thenReturnArrayLengthIsOne() {
    // Arrange and Act
    ChainedTransformer<Object> actualChainedTransformer =
        new ChainedTransformer<>(mock(Transformer.class));

    // Assert
    assertEquals(1, actualChainedTransformer.getTransformers().length);
  }

  /**
   * Test {@link ChainedTransformer#getTransformers()}.
   *
   * <p>Method under test: {@link ChainedTransformer#getTransformers()}
   */
  @Test
  @DisplayName("Test getTransformers()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer[] ChainedTransformer.getTransformers()"})
  void testGetTransformers() {
    // Arrange
    ChainedTransformer<Object> chainedTransformer =
        new ChainedTransformer<>(mock(Transformer.class));

    // Act and Assert
    assertEquals(1, chainedTransformer.getTransformers().length);
  }
}
