package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.functors.ChainedTransformer;
import org.apache.commons.collections4.functors.CloneTransformer;
import org.apache.commons.collections4.functors.ClosureTransformer;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.DefaultEquator;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.ExceptionTransformer;
import org.apache.commons.collections4.functors.FactoryTransformer;
import org.apache.commons.collections4.functors.IfTransformer;
import org.apache.commons.collections4.functors.InstantiateTransformer;
import org.apache.commons.collections4.functors.InvokerTransformer;
import org.apache.commons.collections4.functors.MapTransformer;
import org.apache.commons.collections4.functors.NOPTransformer;
import org.apache.commons.collections4.functors.PredicateTransformer;
import org.apache.commons.collections4.functors.StringValueTransformer;
import org.apache.commons.collections4.functors.SwitchTransformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TransformerUtilsDiffblueTest {
  /**
   * Test {@link TransformerUtils#asTransformer(Closure)} with {@code closure}.
   *
   * <ul>
   *   <li>Then return transform {@code 42} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#asTransformer(Closure)}
   */
  @Test
  @DisplayName("Test asTransformer(Closure) with 'closure'; then return transform '42' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.asTransformer(Closure)"})
  void testAsTransformerWithClosure_thenReturnTransform42Is42() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    // Act
    Transformer<Object, Object> actualAsTransformerResult = TransformerUtils.asTransformer(closure);
    Object actualTransformResult = actualAsTransformerResult.transform("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    assertTrue(actualAsTransformerResult instanceof ClosureTransformer);
    assertEquals("42", actualTransformResult);
    assertSame(closure, ((ClosureTransformer<Object>) actualAsTransformerResult).getClosure());
  }

  /**
   * Test {@link TransformerUtils#asTransformer(Closure)} with {@code closure}.
   *
   * <ul>
   *   <li>When {@link Closure}.
   *   <li>Then return {@link ClosureTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#asTransformer(Closure)}
   */
  @Test
  @DisplayName(
      "Test asTransformer(Closure) with 'closure'; when Closure; then return ClosureTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.asTransformer(Closure)"})
  void testAsTransformerWithClosure_whenClosure_thenReturnClosureTransformer() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);

    // Act
    Transformer<Object, Object> actualAsTransformerResult = TransformerUtils.asTransformer(closure);

    // Assert
    assertTrue(actualAsTransformerResult instanceof ClosureTransformer);
    assertSame(closure, ((ClosureTransformer<Object>) actualAsTransformerResult).getClosure());
  }

  /**
   * Test {@link TransformerUtils#asTransformer(Factory)} with {@code factory}.
   *
   * <ul>
   *   <li>Given {@code Get}.
   *   <li>Then return transform {@code 42} is {@code Get}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#asTransformer(Factory)}
   */
  @Test
  @DisplayName(
      "Test asTransformer(Factory) with 'factory'; given 'Get'; then return transform '42' is 'Get'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.asTransformer(Factory)"})
  void testAsTransformerWithFactory_givenGet_thenReturnTransform42IsGet() {
    // Arrange
    Factory<Object> factory = mock(Factory.class);
    when(factory.get()).thenReturn("Get");

    // Act
    Transformer<Object, Object> actualAsTransformerResult = TransformerUtils.asTransformer(factory);
    Object actualTransformResult = actualAsTransformerResult.transform("42");

    // Assert
    verify(factory).get();
    assertTrue(actualAsTransformerResult instanceof FactoryTransformer);
    assertEquals("Get", actualTransformResult);
    assertSame(
        factory, ((FactoryTransformer<Object, Object>) actualAsTransformerResult).getFactory());
  }

  /**
   * Test {@link TransformerUtils#asTransformer(Factory)} with {@code factory}.
   *
   * <ul>
   *   <li>When {@link Factory}.
   *   <li>Then return {@link FactoryTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#asTransformer(Factory)}
   */
  @Test
  @DisplayName(
      "Test asTransformer(Factory) with 'factory'; when Factory; then return FactoryTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.asTransformer(Factory)"})
  void testAsTransformerWithFactory_whenFactory_thenReturnFactoryTransformer() {
    // Arrange
    Factory<Object> factory = mock(Factory.class);

    // Act
    Transformer<Object, Object> actualAsTransformerResult = TransformerUtils.asTransformer(factory);

    // Assert
    assertTrue(actualAsTransformerResult instanceof FactoryTransformer);
    assertSame(
        factory, ((FactoryTransformer<Object, Object>) actualAsTransformerResult).getFactory());
  }

  /**
   * Test {@link TransformerUtils#asTransformer(Predicate)} with {@code predicate}.
   *
   * <p>Method under test: {@link TransformerUtils#asTransformer(Predicate)}
   */
  @Test
  @DisplayName("Test asTransformer(Predicate) with 'predicate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.asTransformer(Predicate)"})
  void testAsTransformerWithPredicate() {
    // Arrange
    DefaultEquator<Object> equator = DefaultEquator.defaultEquator();
    EqualPredicate<Object> predicate = new EqualPredicate<>("Test", equator);

    // Act
    Transformer<Object, Boolean> actualAsTransformerResult =
        TransformerUtils.asTransformer(predicate);
    Boolean actualTransformResult = actualAsTransformerResult.transform("42");

    // Assert
    Predicate<? super Object> predicate2 =
        ((PredicateTransformer<Object>) actualAsTransformerResult).getPredicate();
    assertTrue(predicate2 instanceof EqualPredicate);
    assertTrue(actualAsTransformerResult instanceof PredicateTransformer);
    assertEquals("Test", predicate.getValue());
    assertEquals("Test", ((EqualPredicate<? super Object>) predicate2).getValue());
    assertFalse(actualTransformResult);
    assertSame(predicate, predicate2);
  }

  /**
   * Test {@link TransformerUtils#asTransformer(Predicate)} with {@code predicate}.
   *
   * <p>Method under test: {@link TransformerUtils#asTransformer(Predicate)}
   */
  @Test
  @DisplayName("Test asTransformer(Predicate) with 'predicate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.asTransformer(Predicate)"})
  void testAsTransformerWithPredicate2() {
    // Arrange
    EqualPredicate<Object> predicate = new EqualPredicate<>("Test", null);

    // Act
    Transformer<Object, Boolean> actualAsTransformerResult =
        TransformerUtils.asTransformer(predicate);
    Boolean actualTransformResult = actualAsTransformerResult.transform("42");

    // Assert
    Predicate<? super Object> predicate2 =
        ((PredicateTransformer<Object>) actualAsTransformerResult).getPredicate();
    assertTrue(predicate2 instanceof EqualPredicate);
    assertTrue(actualAsTransformerResult instanceof PredicateTransformer);
    assertEquals("Test", predicate.getValue());
    assertEquals("Test", ((EqualPredicate<? super Object>) predicate2).getValue());
    assertFalse(actualTransformResult);
    assertSame(predicate, predicate2);
  }

  /**
   * Test {@link TransformerUtils#asTransformer(Predicate)} with {@code predicate}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#asTransformer(Predicate)}
   */
  @Test
  @DisplayName(
      "Test asTransformer(Predicate) with 'predicate'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.asTransformer(Predicate)"})
  void testAsTransformerWithPredicate_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Transformer<Object, Boolean> actualAsTransformerResult =
        TransformerUtils.asTransformer(predicate);
    Boolean actualTransformResult = actualAsTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAsTransformerResult instanceof PredicateTransformer);
    assertFalse(actualTransformResult);
    assertSame(
        predicate, ((PredicateTransformer<Object>) actualAsTransformerResult).getPredicate());
  }

  /**
   * Test {@link TransformerUtils#asTransformer(Predicate)} with {@code predicate}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return transform {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#asTransformer(Predicate)}
   */
  @Test
  @DisplayName(
      "Test asTransformer(Predicate) with 'predicate'; given 'true'; then return transform '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.asTransformer(Predicate)"})
  void testAsTransformerWithPredicate_givenTrue_thenReturnTransform42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Transformer<Object, Boolean> actualAsTransformerResult =
        TransformerUtils.asTransformer(predicate);
    Boolean actualTransformResult = actualAsTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAsTransformerResult instanceof PredicateTransformer);
    assertTrue(actualTransformResult);
    assertSame(
        predicate, ((PredicateTransformer<Object>) actualAsTransformerResult).getPredicate());
  }

  /**
   * Test {@link TransformerUtils#asTransformer(Predicate)} with {@code predicate}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#asTransformer(Predicate)}
   */
  @Test
  @DisplayName(
      "Test asTransformer(Predicate) with 'predicate'; when Predicate; then return Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.asTransformer(Predicate)"})
  void testAsTransformerWithPredicate_whenPredicate_thenReturnPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    Transformer<Object, Boolean> actualAsTransformerResult =
        TransformerUtils.asTransformer(predicate);

    // Assert
    assertTrue(actualAsTransformerResult instanceof PredicateTransformer);
    assertSame(
        predicate, ((PredicateTransformer<Object>) actualAsTransformerResult).getPredicate());
  }

  /**
   * Test {@link TransformerUtils#chainedTransformer(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>Given {@link Transformer}.
   *   <li>Then {@link ArrayList#ArrayList()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#chainedTransformer(Collection)}
   */
  @Test
  @DisplayName(
      "Test chainedTransformer(Collection) with 'Collection'; given Transformer; then ArrayList() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.chainedTransformer(Collection)"})
  void testChainedTransformerWithCollection_givenTransformer_thenArrayListSizeIsOne() {
    // Arrange
    ArrayList<Transformer<? super Object, ?>> transformers = new ArrayList<>();
    transformers.add(mock(Transformer.class));

    // Act
    Transformer<Object, Object> actualChainedTransformerResult =
        TransformerUtils.chainedTransformer(transformers);

    // Assert
    assertTrue(actualChainedTransformerResult instanceof ChainedTransformer);
    assertEquals(1, transformers.size());
    assertEquals(
        1, ((ChainedTransformer<Object>) actualChainedTransformerResult).getTransformers().length);
  }

  /**
   * Test {@link TransformerUtils#chainedTransformer(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>Given {@link Transformer}.
   *   <li>Then {@link ArrayList#ArrayList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#chainedTransformer(Collection)}
   */
  @Test
  @DisplayName(
      "Test chainedTransformer(Collection) with 'Collection'; given Transformer; then ArrayList() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.chainedTransformer(Collection)"})
  void testChainedTransformerWithCollection_givenTransformer_thenArrayListSizeIsTwo() {
    // Arrange
    ArrayList<Transformer<? super Object, ?>> transformers = new ArrayList<>();
    transformers.add(mock(Transformer.class));
    transformers.add(mock(Transformer.class));

    // Act
    Transformer<Object, Object> actualChainedTransformerResult =
        TransformerUtils.chainedTransformer(transformers);

    // Assert
    assertTrue(actualChainedTransformerResult instanceof ChainedTransformer);
    assertEquals(2, transformers.size());
    assertEquals(
        2, ((ChainedTransformer<Object>) actualChainedTransformerResult).getTransformers().length);
  }

  /**
   * Test {@link TransformerUtils#chainedTransformer(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>Then return transform {@code 42} is {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#chainedTransformer(Collection)}
   */
  @Test
  @DisplayName(
      "Test chainedTransformer(Collection) with 'Collection'; then return transform '42' is 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.chainedTransformer(Collection)"})
  void testChainedTransformerWithCollection_thenReturnTransform42IsApply() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    ArrayList<Transformer<? super Object, ?>> transformers = new ArrayList<>();
    transformers.add(transformer);

    // Act
    Transformer<Object, Object> actualChainedTransformerResult =
        TransformerUtils.chainedTransformer(transformers);
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
   * Test {@link TransformerUtils#chainedTransformer(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link NOPTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#chainedTransformer(Collection)}
   */
  @Test
  @DisplayName(
      "Test chainedTransformer(Collection) with 'Collection'; when ArrayList(); then return NOPTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.chainedTransformer(Collection)"})
  void testChainedTransformerWithCollection_whenArrayList_thenReturnNOPTransformer() {
    // Arrange
    ArrayList<Transformer<? super Object, ?>> transformers = new ArrayList<>();

    // Act
    Transformer<Object, Object> actualChainedTransformerResult =
        TransformerUtils.chainedTransformer(transformers);

    // Assert
    assertTrue(actualChainedTransformerResult instanceof NOPTransformer);
    assertEquals("42", actualChainedTransformerResult.apply("42"));
    assertEquals("Input", actualChainedTransformerResult.transform("Input"));
    assertTrue(transformers.isEmpty());
  }

  /**
   * Test {@link TransformerUtils#chainedTransformer(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return transform {@code 42} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#chainedTransformer(Collection)}
   */
  @Test
  @DisplayName(
      "Test chainedTransformer(Collection) with 'Collection'; when ArrayList(); then return transform '42' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.chainedTransformer(Collection)"})
  void testChainedTransformerWithCollection_whenArrayList_thenReturnTransform42Is42() {
    // Arrange
    ArrayList<Transformer<? super Object, ?>> transformers = new ArrayList<>();

    // Act
    Transformer<Object, Object> actualChainedTransformerResult =
        TransformerUtils.chainedTransformer(transformers);
    Object actualTransformResult = actualChainedTransformerResult.transform("42");

    // Assert
    assertTrue(actualChainedTransformerResult instanceof NOPTransformer);
    assertEquals("42", actualChainedTransformerResult.apply("42"));
    assertEquals("42", actualTransformResult);
    assertEquals("Input", actualChainedTransformerResult.transform("Input"));
    assertTrue(transformers.isEmpty());
  }

  /**
   * Test {@link TransformerUtils#chainedTransformer(Transformer[])} with {@code Transformer[]}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then return transform {@code 42} is {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#chainedTransformer(Transformer[])}
   */
  @Test
  @DisplayName(
      "Test chainedTransformer(Transformer[]) with 'Transformer[]'; given 'Apply'; then return transform '42' is 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.chainedTransformer(Transformer[])"})
  void testChainedTransformerWithTransformer_givenApply_thenReturnTransform42IsApply() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<? super Object, ?>[] transformers = new Transformer[] {transformer};

    // Act
    Transformer<Object, Object> actualChainedTransformerResult =
        TransformerUtils.chainedTransformer(transformers);
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
   * Test {@link TransformerUtils#chainedTransformer(Transformer[])} with {@code Transformer[]}.
   *
   * <ul>
   *   <li>Then return {@link ChainedTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#chainedTransformer(Transformer[])}
   */
  @Test
  @DisplayName(
      "Test chainedTransformer(Transformer[]) with 'Transformer[]'; then return ChainedTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.chainedTransformer(Transformer[])"})
  void testChainedTransformerWithTransformer_thenReturnChainedTransformer() {
    // Arrange
    Transformer<? super Object, ?>[] transformers = new Transformer[] {mock(Transformer.class)};

    // Act
    Transformer<Object, Object> actualChainedTransformerResult =
        TransformerUtils.chainedTransformer(transformers);

    // Assert
    assertTrue(actualChainedTransformerResult instanceof ChainedTransformer);
    assertEquals(
        1, ((ChainedTransformer<Object>) actualChainedTransformerResult).getTransformers().length);
    assertEquals(1, transformers.length);
  }

  /**
   * Test {@link TransformerUtils#chainedTransformer(Transformer[])} with {@code Transformer[]}.
   *
   * <ul>
   *   <li>Then return {@link NOPTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#chainedTransformer(Transformer[])}
   */
  @Test
  @DisplayName(
      "Test chainedTransformer(Transformer[]) with 'Transformer[]'; then return NOPTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.chainedTransformer(Transformer[])"})
  void testChainedTransformerWithTransformer_thenReturnNOPTransformer() {
    // Arrange
    Transformer<? super Object, ?>[] transformers = new Transformer[] {};

    // Act
    Transformer<Object, Object> actualChainedTransformerResult =
        TransformerUtils.chainedTransformer(transformers);
    Object actualTransformResult = actualChainedTransformerResult.transform("42");

    // Assert
    assertTrue(actualChainedTransformerResult instanceof NOPTransformer);
    assertEquals("42", actualChainedTransformerResult.apply("42"));
    assertEquals("42", actualTransformResult);
    assertEquals("Input", actualChainedTransformerResult.transform("Input"));
    assertEquals(0, transformers.length);
  }

  /**
   * Test {@link TransformerUtils#cloneTransformer()}.
   *
   * <p>Method under test: {@link TransformerUtils#cloneTransformer()}
   */
  @Test
  @DisplayName("Test cloneTransformer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.cloneTransformer()"})
  void testCloneTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualCloneTransformerResult = TransformerUtils.cloneTransformer();

    // Assert
    assertTrue(actualCloneTransformerResult instanceof CloneTransformer);
    assertEquals("42", actualCloneTransformerResult.apply("42"));
    assertEquals("Input", actualCloneTransformerResult.transform("Input"));
  }

  /**
   * Test {@link TransformerUtils#cloneTransformer()}.
   *
   * <ul>
   *   <li>Then {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#cloneTransformer()}
   */
  @Test
  @DisplayName("Test cloneTransformer(); then ArrayList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.cloneTransformer()"})
  void testCloneTransformer_thenArrayListEmpty() {
    // Arrange and Act
    Transformer<Object, Object> actualCloneTransformerResult = TransformerUtils.cloneTransformer();
    ArrayList<Object> objectList = new ArrayList<>();
    Object actualTransformResult = actualCloneTransformerResult.transform(objectList);

    // Assert
    assertTrue(actualCloneTransformerResult instanceof CloneTransformer);
    assertEquals("42", actualCloneTransformerResult.apply("42"));
    assertEquals("Input", actualCloneTransformerResult.transform("Input"));
    assertTrue(objectList.isEmpty());
    assertEquals(objectList, actualTransformResult);
  }

  /**
   * Test {@link TransformerUtils#cloneTransformer()}.
   *
   * <ul>
   *   <li>Then return transform {@code 42} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#cloneTransformer()}
   */
  @Test
  @DisplayName("Test cloneTransformer(); then return transform '42' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.cloneTransformer()"})
  void testCloneTransformer_thenReturnTransform42Is42() {
    // Arrange and Act
    Transformer<Object, Object> actualCloneTransformerResult = TransformerUtils.cloneTransformer();
    Object actualTransformResult = actualCloneTransformerResult.transform("42");

    // Assert
    assertTrue(actualCloneTransformerResult instanceof CloneTransformer);
    assertEquals("42", actualCloneTransformerResult.apply("42"));
    assertEquals("42", actualTransformResult);
    assertEquals("Input", actualCloneTransformerResult.transform("Input"));
  }

  /**
   * Test {@link TransformerUtils#cloneTransformer()}.
   *
   * <ul>
   *   <li>Then return transform {@code null} is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#cloneTransformer()}
   */
  @Test
  @DisplayName("Test cloneTransformer(); then return transform 'null' is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.cloneTransformer()"})
  void testCloneTransformer_thenReturnTransformNullIsNull() {
    // Arrange and Act
    Transformer<Object, Object> actualCloneTransformerResult = TransformerUtils.cloneTransformer();
    Object actualTransformResult = actualCloneTransformerResult.transform(null);

    // Assert
    assertTrue(actualCloneTransformerResult instanceof CloneTransformer);
    assertEquals("42", actualCloneTransformerResult.apply("42"));
    assertEquals("Input", actualCloneTransformerResult.transform("Input"));
    assertNull(actualTransformResult);
    assertNull(null);
  }

  /**
   * Test {@link TransformerUtils#cloneTransformer()}.
   *
   * <ul>
   *   <li>Then return transform one intValue is one.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#cloneTransformer()}
   */
  @Test
  @DisplayName("Test cloneTransformer(); then return transform one intValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.cloneTransformer()"})
  void testCloneTransformer_thenReturnTransformOneIntValueIsOne() {
    // Arrange and Act
    Transformer<Object, Object> actualCloneTransformerResult = TransformerUtils.cloneTransformer();
    Object actualTransformResult = actualCloneTransformerResult.transform(1);

    // Assert
    assertTrue(actualCloneTransformerResult instanceof CloneTransformer);
    assertEquals("42", actualCloneTransformerResult.apply("42"));
    assertEquals("Input", actualCloneTransformerResult.transform("Input"));
    assertEquals(1, ((Integer) actualTransformResult).intValue());
  }

  /**
   * Test {@link TransformerUtils#constantTransformer(Object)}.
   *
   * <ul>
   *   <li>Then return transform {@code 42} is {@code Constant To Return}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#constantTransformer(Object)}
   */
  @Test
  @DisplayName(
      "Test constantTransformer(Object); then return transform '42' is 'Constant To Return'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.constantTransformer(Object)"})
  void testConstantTransformer_thenReturnTransform42IsConstantToReturn() {
    // Arrange and Act
    Transformer<Object, Object> actualConstantTransformerResult =
        TransformerUtils.constantTransformer("Constant To Return");
    Object actualTransformResult = actualConstantTransformerResult.transform("42");

    // Assert
    assertTrue(actualConstantTransformerResult instanceof ConstantTransformer);
    assertEquals("Constant To Return", actualTransformResult);
    assertEquals(
        "Constant To Return",
        ((ConstantTransformer<Object, Object>) actualConstantTransformerResult).getConstant());
  }

  /**
   * Test {@link TransformerUtils#constantTransformer(Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return transform {@code 42} is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#constantTransformer(Object)}
   */
  @Test
  @DisplayName(
      "Test constantTransformer(Object); when 'null'; then return transform '42' is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.constantTransformer(Object)"})
  void testConstantTransformer_whenNull_thenReturnTransform42IsNull() {
    // Arrange and Act
    Transformer<Object, Object> actualConstantTransformerResult =
        TransformerUtils.constantTransformer(null);
    Object actualTransformResult = actualConstantTransformerResult.transform("42");

    // Assert
    assertTrue(actualConstantTransformerResult instanceof ConstantTransformer);
    assertNull(actualTransformResult);
    assertNull(
        ((ConstantTransformer<Object, Object>) actualConstantTransformerResult).getConstant());
  }

  /**
   * Test {@link TransformerUtils#exceptionTransformer()}.
   *
   * <ul>
   *   <li>Then return {@link ExceptionTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#exceptionTransformer()}
   */
  @Test
  @DisplayName("Test exceptionTransformer(); then return ExceptionTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.exceptionTransformer()"})
  void testExceptionTransformer_thenReturnExceptionTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualExceptionTransformerResult =
        TransformerUtils.exceptionTransformer();

    // Assert
    assertTrue(actualExceptionTransformerResult instanceof ExceptionTransformer);
  }

  /**
   * Test {@link TransformerUtils#ifTransformer(Predicate, Transformer)} with {@code predicate},
   * {@code trueTransformer}.
   *
   * <p>Method under test: {@link TransformerUtils#ifTransformer(Predicate, Transformer)}
   */
  @Test
  @DisplayName("Test ifTransformer(Predicate, Transformer) with 'predicate', 'trueTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.ifTransformer(Predicate, Transformer)"})
  void testIfTransformerWithPredicateTrueTransformer() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Object> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Transformer<Object, Object> actualIfTransformerResult =
        TransformerUtils.ifTransformer(predicate, trueTransformer);
    Object actualTransformResult = actualIfTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertTrue(actualIfTransformerResult instanceof IfTransformer);
    assertTrue(
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getFalseTransformer()
            instanceof NOPTransformer);
    assertEquals("Apply", actualTransformResult);
    assertSame(
        predicate, ((IfTransformer<Object, Object>) actualIfTransformerResult).getPredicate());
    assertSame(
        trueTransformer,
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getTrueTransformer());
  }

  /**
   * Test {@link TransformerUtils#ifTransformer(Predicate, Transformer)} with {@code predicate},
   * {@code trueTransformer}.
   *
   * <p>Method under test: {@link TransformerUtils#ifTransformer(Predicate, Transformer)}
   */
  @Test
  @DisplayName("Test ifTransformer(Predicate, Transformer) with 'predicate', 'trueTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.ifTransformer(Predicate, Transformer)"})
  void testIfTransformerWithPredicateTrueTransformer2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    ClosureTransformer<? super Object> trueTransformer = new ClosureTransformer<>(closure);

    // Act
    Transformer<Object, Object> actualIfTransformerResult =
        TransformerUtils.ifTransformer(predicate, trueTransformer);
    Object actualTransformResult = actualIfTransformerResult.transform("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    Transformer<? super Object, ?> trueTransformer2 =
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getTrueTransformer();
    assertTrue(trueTransformer2 instanceof ClosureTransformer);
    assertTrue(actualIfTransformerResult instanceof IfTransformer);
    assertTrue(
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getFalseTransformer()
            instanceof NOPTransformer);
    assertEquals("42", actualTransformResult);
    assertSame(trueTransformer, trueTransformer2);
    assertSame(
        predicate, ((IfTransformer<Object, Object>) actualIfTransformerResult).getPredicate());
  }

  /**
   * Test {@link TransformerUtils#ifTransformer(Predicate, Transformer)} with {@code predicate},
   * {@code trueTransformer}.
   *
   * <p>Method under test: {@link TransformerUtils#ifTransformer(Predicate, Transformer)}
   */
  @Test
  @DisplayName("Test ifTransformer(Predicate, Transformer) with 'predicate', 'trueTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.ifTransformer(Predicate, Transformer)"})
  void testIfTransformerWithPredicateTrueTransformer3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    ConstantTransformer<? super Object, Object> trueTransformer =
        new ConstantTransformer<>("Constant To Return");

    // Act
    Transformer<Object, Object> actualIfTransformerResult =
        TransformerUtils.ifTransformer(predicate, trueTransformer);
    Object actualTransformResult = actualIfTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    Transformer<? super Object, ?> trueTransformer2 =
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getTrueTransformer();
    assertTrue(trueTransformer2 instanceof ConstantTransformer);
    assertTrue(actualIfTransformerResult instanceof IfTransformer);
    assertTrue(
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getFalseTransformer()
            instanceof NOPTransformer);
    assertEquals("Constant To Return", actualTransformResult);
    assertEquals("Constant To Return", trueTransformer.getConstant());
    assertEquals(
        "Constant To Return",
        ((ConstantTransformer<? super Object, ?>) trueTransformer2).getConstant());
    assertSame(trueTransformer, trueTransformer2);
    assertSame(
        predicate, ((IfTransformer<Object, Object>) actualIfTransformerResult).getPredicate());
  }

  /**
   * Test {@link TransformerUtils#ifTransformer(Predicate, Transformer)} with {@code predicate},
   * {@code trueTransformer}.
   *
   * <p>Method under test: {@link TransformerUtils#ifTransformer(Predicate, Transformer)}
   */
  @Test
  @DisplayName("Test ifTransformer(Predicate, Transformer) with 'predicate', 'trueTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.ifTransformer(Predicate, Transformer)"})
  void testIfTransformerWithPredicateTrueTransformer4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Factory<Object> factory = mock(Factory.class);
    when(factory.get()).thenReturn("Get");
    FactoryTransformer<? super Object, ?> trueTransformer = new FactoryTransformer<>(factory);

    // Act
    Transformer<Object, Object> actualIfTransformerResult =
        TransformerUtils.ifTransformer(predicate, trueTransformer);
    Object actualTransformResult = actualIfTransformerResult.transform("42");

    // Assert
    verify(factory).get();
    verify(predicate).test(isA(Object.class));
    Transformer<? super Object, ?> trueTransformer2 =
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getTrueTransformer();
    assertTrue(trueTransformer2 instanceof FactoryTransformer);
    assertTrue(actualIfTransformerResult instanceof IfTransformer);
    assertTrue(
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getFalseTransformer()
            instanceof NOPTransformer);
    assertEquals("Get", actualTransformResult);
    assertSame(trueTransformer, trueTransformer2);
    assertSame(
        predicate, ((IfTransformer<Object, Object>) actualIfTransformerResult).getPredicate());
  }

  /**
   * Test {@link TransformerUtils#ifTransformer(Predicate, Transformer)} with {@code predicate},
   * {@code trueTransformer}.
   *
   * <p>Method under test: {@link TransformerUtils#ifTransformer(Predicate, Transformer)}
   */
  @Test
  @DisplayName("Test ifTransformer(Predicate, Transformer) with 'predicate', 'trueTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.ifTransformer(Predicate, Transformer)"})
  void testIfTransformerWithPredicateTrueTransformer5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Object> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    IfTransformer<? super Object, ?> trueTransformer2 =
        new IfTransformer<>(predicate2, trueTransformer, mock(Transformer.class));

    // Act
    Transformer<Object, Object> actualIfTransformerResult =
        TransformerUtils.ifTransformer(predicate, trueTransformer2);
    Object actualTransformResult = actualIfTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    Transformer<? super Object, ?> trueTransformer3 =
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getTrueTransformer();
    assertTrue(trueTransformer3 instanceof IfTransformer);
    assertTrue(actualIfTransformerResult instanceof IfTransformer);
    assertTrue(
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getFalseTransformer()
            instanceof NOPTransformer);
    assertEquals("Apply", actualTransformResult);
    assertSame(trueTransformer2, trueTransformer3);
    assertSame(
        predicate, ((IfTransformer<Object, Object>) actualIfTransformerResult).getPredicate());
  }

  /**
   * Test {@link TransformerUtils#ifTransformer(Predicate, Transformer)} with {@code predicate},
   * {@code trueTransformer}.
   *
   * <p>Method under test: {@link TransformerUtils#ifTransformer(Predicate, Transformer)}
   */
  @Test
  @DisplayName("Test ifTransformer(Predicate, Transformer) with 'predicate', 'trueTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.ifTransformer(Predicate, Transformer)"})
  void testIfTransformerWithPredicateTrueTransformer6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Object> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    IfTransformer<? super Object, ?> trueTransformer =
        new IfTransformer<>(predicate2, mock(Transformer.class), falseTransformer);

    // Act
    Transformer<Object, Object> actualIfTransformerResult =
        TransformerUtils.ifTransformer(predicate, trueTransformer);
    Object actualTransformResult = actualIfTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    Transformer<? super Object, ?> trueTransformer2 =
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getTrueTransformer();
    assertTrue(trueTransformer2 instanceof IfTransformer);
    assertTrue(actualIfTransformerResult instanceof IfTransformer);
    assertTrue(
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getFalseTransformer()
            instanceof NOPTransformer);
    assertEquals("Apply", actualTransformResult);
    assertSame(trueTransformer, trueTransformer2);
    assertSame(
        predicate, ((IfTransformer<Object, Object>) actualIfTransformerResult).getPredicate());
  }

  /**
   * Test {@link TransformerUtils#ifTransformer(Predicate, Transformer)} with {@code predicate},
   * {@code trueTransformer}.
   *
   * <p>Method under test: {@link TransformerUtils#ifTransformer(Predicate, Transformer)}
   */
  @Test
  @DisplayName("Test ifTransformer(Predicate, Transformer) with 'predicate', 'trueTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.ifTransformer(Predicate, Transformer)"})
  void testIfTransformerWithPredicateTrueTransformer7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate2};

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<? super Object, ?>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<? super Object, ?> trueTransformer =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    Transformer<Object, Object> actualIfTransformerResult =
        TransformerUtils.ifTransformer(predicate, trueTransformer);
    Object actualTransformResult = actualIfTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualIfTransformerResult instanceof IfTransformer);
    assertTrue(
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getFalseTransformer()
            instanceof NOPTransformer);
    assertEquals("Apply", actualTransformResult);
    assertEquals(1, trueTransformer.getPredicates().length);
    assertEquals(1, trueTransformer.getTransformers().length);
    assertSame(
        trueTransformer,
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getTrueTransformer());
    assertSame(
        predicate, ((IfTransformer<Object, Object>) actualIfTransformerResult).getPredicate());
  }

  /**
   * Test {@link TransformerUtils#ifTransformer(Predicate, Transformer)} with {@code predicate},
   * {@code trueTransformer}.
   *
   * <p>Method under test: {@link TransformerUtils#ifTransformer(Predicate, Transformer)}
   */
  @Test
  @DisplayName("Test ifTransformer(Predicate, Transformer) with 'predicate', 'trueTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.ifTransformer(Predicate, Transformer)"})
  void testIfTransformerWithPredicateTrueTransformer8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate2};

    Transformer<Object, Object> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<? super Object, ?>[] transformers = new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<? super Object, ?> trueTransformer =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    Transformer<Object, Object> actualIfTransformerResult =
        TransformerUtils.ifTransformer(predicate, trueTransformer);
    Object actualTransformResult = actualIfTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertTrue(actualIfTransformerResult instanceof IfTransformer);
    assertTrue(
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getFalseTransformer()
            instanceof NOPTransformer);
    assertEquals("Apply", actualTransformResult);
    assertEquals(1, trueTransformer.getPredicates().length);
    assertEquals(1, trueTransformer.getTransformers().length);
    assertSame(
        trueTransformer,
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getTrueTransformer());
    assertSame(
        predicate, ((IfTransformer<Object, Object>) actualIfTransformerResult).getPredicate());
  }

  /**
   * Test {@link TransformerUtils#ifTransformer(Predicate, Transformer, Transformer)} with {@code
   * predicate}, {@code trueTransformer}, {@code falseTransformer}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#ifTransformer(Predicate, Transformer,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test ifTransformer(Predicate, Transformer, Transformer) with 'predicate', 'trueTransformer', 'falseTransformer'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer TransformerUtils.ifTransformer(Predicate, Transformer, Transformer)"
  })
  void testIfTransformerWithPredicateTrueTransformerFalseTransformer_givenFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);

    Transformer<Object, Object> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Transformer<Object, Object> actualIfTransformerResult =
        TransformerUtils.ifTransformer(predicate, trueTransformer, falseTransformer);
    Object actualTransformResult = actualIfTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertTrue(actualIfTransformerResult instanceof IfTransformer);
    assertEquals("Apply", actualTransformResult);
    assertSame(
        predicate, ((IfTransformer<Object, Object>) actualIfTransformerResult).getPredicate());
    assertSame(
        falseTransformer,
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getFalseTransformer());
    assertSame(
        trueTransformer,
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getTrueTransformer());
  }

  /**
   * Test {@link TransformerUtils#ifTransformer(Predicate, Transformer, Transformer)} with {@code
   * predicate}, {@code trueTransformer}, {@code falseTransformer}.
   *
   * <ul>
   *   <li>Given {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#ifTransformer(Predicate, Transformer,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test ifTransformer(Predicate, Transformer, Transformer) with 'predicate', 'trueTransformer', 'falseTransformer'; given 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer TransformerUtils.ifTransformer(Predicate, Transformer, Transformer)"
  })
  void testIfTransformerWithPredicateTrueTransformerFalseTransformer_givenTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Object> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> falseTransformer = mock(Transformer.class);

    // Act
    Transformer<Object, Object> actualIfTransformerResult =
        TransformerUtils.ifTransformer(predicate, trueTransformer, falseTransformer);
    Object actualTransformResult = actualIfTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertTrue(actualIfTransformerResult instanceof IfTransformer);
    assertEquals("Apply", actualTransformResult);
    assertSame(
        predicate, ((IfTransformer<Object, Object>) actualIfTransformerResult).getPredicate());
    assertSame(
        falseTransformer,
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getFalseTransformer());
    assertSame(
        trueTransformer,
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getTrueTransformer());
  }

  /**
   * Test {@link TransformerUtils#ifTransformer(Predicate, Transformer, Transformer)} with {@code
   * predicate}, {@code trueTransformer}, {@code falseTransformer}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#ifTransformer(Predicate, Transformer,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test ifTransformer(Predicate, Transformer, Transformer) with 'predicate', 'trueTransformer', 'falseTransformer'; when Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer TransformerUtils.ifTransformer(Predicate, Transformer, Transformer)"
  })
  void testIfTransformerWithPredicateTrueTransformerFalseTransformer_whenPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);
    Transformer<Object, Object> falseTransformer = mock(Transformer.class);

    // Act
    Transformer<Object, Object> actualIfTransformerResult =
        TransformerUtils.ifTransformer(predicate, trueTransformer, falseTransformer);

    // Assert
    assertTrue(actualIfTransformerResult instanceof IfTransformer);
    assertSame(
        predicate, ((IfTransformer<Object, Object>) actualIfTransformerResult).getPredicate());
    assertSame(
        falseTransformer,
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getFalseTransformer());
    assertSame(
        trueTransformer,
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getTrueTransformer());
  }

  /**
   * Test {@link TransformerUtils#ifTransformer(Predicate, Transformer)} with {@code predicate},
   * {@code trueTransformer}.
   *
   * <ul>
   *   <li>Then return not transform {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#ifTransformer(Predicate, Transformer)}
   */
  @Test
  @DisplayName(
      "Test ifTransformer(Predicate, Transformer) with 'predicate', 'trueTransformer'; then return not transform '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.ifTransformer(Predicate, Transformer)"})
  void testIfTransformerWithPredicateTrueTransformer_thenReturnNotTransform42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);
    PredicateTransformer<? super Object> trueTransformer = new PredicateTransformer<>(predicate2);

    // Act
    Transformer<Object, Object> actualIfTransformerResult =
        TransformerUtils.ifTransformer(predicate, trueTransformer);
    Object actualTransformResult = actualIfTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualIfTransformerResult instanceof IfTransformer);
    assertTrue(
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getFalseTransformer()
            instanceof NOPTransformer);
    Transformer<? super Object, ?> trueTransformer2 =
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getTrueTransformer();
    assertTrue(trueTransformer2 instanceof PredicateTransformer);
    assertFalse((Boolean) actualTransformResult);
    assertSame(trueTransformer, trueTransformer2);
    assertSame(
        predicate, ((IfTransformer<Object, Object>) actualIfTransformerResult).getPredicate());
  }

  /**
   * Test {@link TransformerUtils#ifTransformer(Predicate, Transformer)} with {@code predicate},
   * {@code trueTransformer}.
   *
   * <ul>
   *   <li>Then return transform {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#ifTransformer(Predicate, Transformer)}
   */
  @Test
  @DisplayName(
      "Test ifTransformer(Predicate, Transformer) with 'predicate', 'trueTransformer'; then return transform '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.ifTransformer(Predicate, Transformer)"})
  void testIfTransformerWithPredicateTrueTransformer_thenReturnTransform42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    PredicateTransformer<? super Object> trueTransformer = new PredicateTransformer<>(predicate2);

    // Act
    Transformer<Object, Object> actualIfTransformerResult =
        TransformerUtils.ifTransformer(predicate, trueTransformer);
    Object actualTransformResult = actualIfTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualIfTransformerResult instanceof IfTransformer);
    assertTrue(
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getFalseTransformer()
            instanceof NOPTransformer);
    Transformer<? super Object, ?> trueTransformer2 =
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getTrueTransformer();
    assertTrue(trueTransformer2 instanceof PredicateTransformer);
    assertTrue((Boolean) actualTransformResult);
    assertSame(trueTransformer, trueTransformer2);
    assertSame(
        predicate, ((IfTransformer<Object, Object>) actualIfTransformerResult).getPredicate());
  }

  /**
   * Test {@link TransformerUtils#ifTransformer(Predicate, Transformer)} with {@code predicate},
   * {@code trueTransformer}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#ifTransformer(Predicate, Transformer)}
   */
  @Test
  @DisplayName(
      "Test ifTransformer(Predicate, Transformer) with 'predicate', 'trueTransformer'; when Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.ifTransformer(Predicate, Transformer)"})
  void testIfTransformerWithPredicateTrueTransformer_whenPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);

    // Act
    Transformer<Object, Object> actualIfTransformerResult =
        TransformerUtils.ifTransformer(predicate, trueTransformer);

    // Assert
    assertTrue(actualIfTransformerResult instanceof IfTransformer);
    assertTrue(
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getFalseTransformer()
            instanceof NOPTransformer);
    assertSame(
        predicate, ((IfTransformer<Object, Object>) actualIfTransformerResult).getPredicate());
    assertSame(
        trueTransformer,
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getTrueTransformer());
  }

  /**
   * Test {@link TransformerUtils#ifTransformer(Predicate, Transformer)} with {@code predicate},
   * {@code trueTransformer}.
   *
   * <ul>
   *   <li>When {@link Transformer}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#ifTransformer(Predicate, Transformer)}
   */
  @Test
  @DisplayName(
      "Test ifTransformer(Predicate, Transformer) with 'predicate', 'trueTransformer'; when Transformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.ifTransformer(Predicate, Transformer)"})
  void testIfTransformerWithPredicateTrueTransformer_whenTransformer() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);

    // Act
    Transformer<Object, Object> actualIfTransformerResult =
        TransformerUtils.ifTransformer(predicate, trueTransformer);
    Object actualTransformResult = actualIfTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualIfTransformerResult instanceof IfTransformer);
    assertTrue(
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getFalseTransformer()
            instanceof NOPTransformer);
    assertEquals("42", actualTransformResult);
    assertSame(
        predicate, ((IfTransformer<Object, Object>) actualIfTransformerResult).getPredicate());
    assertSame(
        trueTransformer,
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getTrueTransformer());
  }

  /**
   * Test {@link TransformerUtils#instantiateTransformer(Class[], Object[])} with {@code Class[]},
   * {@code Object[]}.
   *
   * <ul>
   *   <li>Then array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#instantiateTransformer(Class[], Object[])}
   */
  @Test
  @DisplayName(
      "Test instantiateTransformer(Class[], Object[]) with 'Class[]', 'Object[]'; then array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.instantiateTransformer(Class[], Object[])"})
  void testInstantiateTransformerWithClassObject_thenArrayLengthIsZero() {
    // Arrange
    Class<?>[] paramTypes = new Class[] {};
    Object[] args = new Object[] {};

    // Act
    Transformer<Class<?>, Object> actualInstantiateTransformerResult =
        TransformerUtils.instantiateTransformer(paramTypes, args);
    Class<Object> forNameResult = Object.class;
    actualInstantiateTransformerResult.transform(forNameResult);

    // Assert
    assertTrue(actualInstantiateTransformerResult instanceof InstantiateTransformer);
    assertEquals(0, paramTypes.length);
    assertEquals(0, args.length);
  }

  /**
   * Test {@link TransformerUtils#instantiateTransformer(Class[], Object[])} with {@code Class[]},
   * {@code Object[]}.
   *
   * <ul>
   *   <li>Then first element is {@code Args}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#instantiateTransformer(Class[], Object[])}
   */
  @Test
  @DisplayName(
      "Test instantiateTransformer(Class[], Object[]) with 'Class[]', 'Object[]'; then first element is 'Args'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.instantiateTransformer(Class[], Object[])"})
  void testInstantiateTransformerWithClassObject_thenFirstElementIsArgs() {
    // Arrange
    Class<Object> forNameResult = Object.class;
    Class<?>[] paramTypes = new Class[] {forNameResult};
    Object[] args = new Object[] {"Args"};

    // Act
    Transformer<Class<?>, Object> actualInstantiateTransformerResult =
        TransformerUtils.instantiateTransformer(paramTypes, args);

    // Assert
    assertTrue(actualInstantiateTransformerResult instanceof InstantiateTransformer);
    assertEquals("Args", args[0]);
    assertEquals(1, args.length);
    assertArrayEquals(new Class[] {Object.class}, paramTypes);
  }

  /**
   * Test {@link TransformerUtils#instantiateTransformer(Class[], Object[])} with {@code Class[]},
   * {@code Object[]}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#instantiateTransformer(Class[], Object[])}
   */
  @Test
  @DisplayName(
      "Test instantiateTransformer(Class[], Object[]) with 'Class[]', 'Object[]'; when 'null'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.instantiateTransformer(Class[], Object[])"})
  void testInstantiateTransformerWithClassObject_whenNull_thenNull() {
    // Arrange and Act
    Transformer<Class<?>, Object> actualInstantiateTransformerResult =
        TransformerUtils.instantiateTransformer(null, null);
    Class<Object> forNameResult = Object.class;
    actualInstantiateTransformerResult.transform(forNameResult);

    // Assert
    assertTrue(actualInstantiateTransformerResult instanceof InstantiateTransformer);
    assertNull(null);
    assertNull(null);
  }

  /**
   * Test {@link TransformerUtils#instantiateTransformer()}.
   *
   * <ul>
   *   <li>Then return {@link InstantiateTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#instantiateTransformer()}
   */
  @Test
  @DisplayName("Test instantiateTransformer(); then return InstantiateTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.instantiateTransformer()"})
  void testInstantiateTransformer_thenReturnInstantiateTransformer() {
    // Arrange and Act
    Transformer<Class<?>, Object> actualInstantiateTransformerResult =
        TransformerUtils.instantiateTransformer();
    Class<Object> forNameResult = Object.class;
    actualInstantiateTransformerResult.transform(forNameResult);

    // Assert
    assertTrue(actualInstantiateTransformerResult instanceof InstantiateTransformer);
  }

  /**
   * Test {@link TransformerUtils#invokerTransformer(String, Class[], Object[])} with {@code
   * methodName}, {@code paramTypes}, {@code args}.
   *
   * <ul>
   *   <li>Then return {@link InvokerTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#invokerTransformer(String, Class[], Object[])}
   */
  @Test
  @DisplayName(
      "Test invokerTransformer(String, Class[], Object[]) with 'methodName', 'paramTypes', 'args'; then return InvokerTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.invokerTransformer(String, Class[], Object[])"})
  void testInvokerTransformerWithMethodNameParamTypesArgs_thenReturnInvokerTransformer() {
    // Arrange
    Class<Object> forNameResult = Object.class;

    // Act
    Transformer<Object, Object> actualInvokerTransformerResult =
        TransformerUtils.invokerTransformer(
            "Method Name", new Class[] {forNameResult}, new Object[] {"Args"});

    // Assert
    assertTrue(actualInvokerTransformerResult instanceof InvokerTransformer);
  }

  /**
   * Test {@link TransformerUtils#invokerTransformer(String, Class[], Object[])} with {@code
   * methodName}, {@code paramTypes}, {@code args}.
   *
   * <ul>
   *   <li>Then return {@link InvokerTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#invokerTransformer(String, Class[], Object[])}
   */
  @Test
  @DisplayName(
      "Test invokerTransformer(String, Class[], Object[]) with 'methodName', 'paramTypes', 'args'; then return InvokerTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.invokerTransformer(String, Class[], Object[])"})
  void testInvokerTransformerWithMethodNameParamTypesArgs_thenReturnInvokerTransformer2() {
    // Arrange and Act
    Transformer<Object, Object> actualInvokerTransformerResult =
        TransformerUtils.invokerTransformer("Method Name", null, null);

    // Assert
    assertTrue(actualInvokerTransformerResult instanceof InvokerTransformer);
  }

  /**
   * Test {@link TransformerUtils#invokerTransformer(String)} with {@code methodName}.
   *
   * <ul>
   *   <li>Then return {@link InvokerTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#invokerTransformer(String)}
   */
  @Test
  @DisplayName("Test invokerTransformer(String) with 'methodName'; then return InvokerTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.invokerTransformer(String)"})
  void testInvokerTransformerWithMethodName_thenReturnInvokerTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualInvokerTransformerResult =
        TransformerUtils.invokerTransformer("Method Name");

    // Assert
    assertTrue(actualInvokerTransformerResult instanceof InvokerTransformer);
  }

  /**
   * Test {@link TransformerUtils#mapTransformer(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@link MapTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#mapTransformer(Map)}
   */
  @Test
  @DisplayName("Test mapTransformer(Map); when HashMap(); then return MapTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.mapTransformer(Map)"})
  void testMapTransformer_whenHashMap_thenReturnMapTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualMapTransformerResult =
        TransformerUtils.mapTransformer(new HashMap<>());
    Object actualTransformResult = actualMapTransformerResult.transform("42");

    // Assert
    assertTrue(actualMapTransformerResult instanceof MapTransformer);
    assertNull(actualTransformResult);
    assertTrue(((MapTransformer<Object, Object>) actualMapTransformerResult).getMap().isEmpty());
  }

  /**
   * Test {@link TransformerUtils#mapTransformer(Map)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link ConstantTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#mapTransformer(Map)}
   */
  @Test
  @DisplayName("Test mapTransformer(Map); when 'null'; then return ConstantTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.mapTransformer(Map)"})
  void testMapTransformer_whenNull_thenReturnConstantTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualMapTransformerResult = TransformerUtils.mapTransformer(null);
    Object actualTransformResult = actualMapTransformerResult.transform("42");

    // Assert
    assertTrue(actualMapTransformerResult instanceof ConstantTransformer);
    assertNull(actualTransformResult);
    assertNull(((ConstantTransformer<Object, Object>) actualMapTransformerResult).getConstant());
  }

  /**
   * Test {@link TransformerUtils#nopTransformer()}.
   *
   * <p>Method under test: {@link TransformerUtils#nopTransformer()}
   */
  @Test
  @DisplayName("Test nopTransformer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.nopTransformer()"})
  void testNopTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualNopTransformerResult = TransformerUtils.nopTransformer();
    Object actualTransformResult = actualNopTransformerResult.transform("42");

    // Assert
    assertTrue(actualNopTransformerResult instanceof NOPTransformer);
    assertEquals("42", actualNopTransformerResult.apply("42"));
    assertEquals("42", actualTransformResult);
    assertEquals("Input", actualNopTransformerResult.transform("Input"));
  }

  /**
   * Test {@link TransformerUtils#nullTransformer()}.
   *
   * <p>Method under test: {@link TransformerUtils#nullTransformer()}
   */
  @Test
  @DisplayName("Test nullTransformer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.nullTransformer()"})
  void testNullTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualNullTransformerResult = TransformerUtils.nullTransformer();
    Object actualTransformResult = actualNullTransformerResult.transform("42");

    // Assert
    assertTrue(actualNullTransformerResult instanceof ConstantTransformer);
    assertNull(actualTransformResult);
    assertNull(((ConstantTransformer<Object, Object>) actualNullTransformerResult).getConstant());
  }

  /**
   * Test {@link TransformerUtils#stringValueTransformer()}.
   *
   * <p>Method under test: {@link TransformerUtils#stringValueTransformer()}
   */
  @Test
  @DisplayName("Test stringValueTransformer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.stringValueTransformer()"})
  void testStringValueTransformer() {
    // Arrange and Act
    Transformer<Object, String> actualStringValueTransformerResult =
        TransformerUtils.stringValueTransformer();

    // Assert
    assertTrue(actualStringValueTransformerResult instanceof StringValueTransformer);
    assertEquals("42", actualStringValueTransformerResult.apply("42"));
    assertEquals("Input", actualStringValueTransformerResult.transform("Input"));
  }

  /**
   * Test {@link TransformerUtils#stringValueTransformer()}.
   *
   * <ul>
   *   <li>Then return transform {@code 42} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#stringValueTransformer()}
   */
  @Test
  @DisplayName("Test stringValueTransformer(); then return transform '42' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.stringValueTransformer()"})
  void testStringValueTransformer_thenReturnTransform42Is42() {
    // Arrange and Act
    Transformer<Object, String> actualStringValueTransformerResult =
        TransformerUtils.stringValueTransformer();
    String actualTransformResult = actualStringValueTransformerResult.transform("42");

    // Assert
    assertTrue(actualStringValueTransformerResult instanceof StringValueTransformer);
    assertEquals("42", actualStringValueTransformerResult.apply("42"));
    assertEquals("42", actualTransformResult);
    assertEquals("Input", actualStringValueTransformerResult.transform("Input"));
  }

  /**
   * Test {@link TransformerUtils#switchMapTransformer(Map)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link HashMap#HashMap()} {@code null} is {@link Transformer}.
   *   <li>Then {@link HashMap#HashMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#switchMapTransformer(Map)}
   */
  @Test
  @DisplayName(
      "Test switchMapTransformer(Map); given 'null'; when HashMap() 'null' is Transformer; then HashMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.switchMapTransformer(Map)"})
  void testSwitchMapTransformer_givenNull_whenHashMapNullIsTransformer_thenHashMapEmpty() {
    // Arrange
    HashMap<Object, Transformer<Object, Object>> objectsAndTransformers = new HashMap<>();
    objectsAndTransformers.put(null, mock(Transformer.class));

    // Act
    TransformerUtils.switchMapTransformer(objectsAndTransformers);

    // Assert
    assertTrue(objectsAndTransformers.isEmpty());
  }

  /**
   * Test {@link TransformerUtils#switchMapTransformer(Map)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return first element Value intValue is one.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#switchMapTransformer(Map)}
   */
  @Test
  @DisplayName(
      "Test switchMapTransformer(Map); given one; then return first element Value intValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.switchMapTransformer(Map)"})
  void testSwitchMapTransformer_givenOne_thenReturnFirstElementValueIntValueIsOne() {
    // Arrange
    HashMap<Object, Transformer<Object, Object>> objectsAndTransformers = new HashMap<>();
    objectsAndTransformers.put(1, mock(Transformer.class));

    // Act
    Transformer<Object, Object> actualSwitchMapTransformerResult =
        TransformerUtils.switchMapTransformer(objectsAndTransformers);
    Object actualTransformResult = actualSwitchMapTransformerResult.transform("42");

    // Assert
    assertEquals(1, objectsAndTransformers.size());
    Transformer<? super Object, ?> defaultTransformer =
        ((SwitchTransformer<Object, Object>) actualSwitchMapTransformerResult)
            .getDefaultTransformer();
    assertTrue(defaultTransformer instanceof ConstantTransformer);
    Predicate<? super Object>[] predicates =
        ((SwitchTransformer<Object, Object>) actualSwitchMapTransformerResult).getPredicates();
    Predicate<? super Object> predicate = predicates[0];
    assertTrue(predicate instanceof EqualPredicate);
    assertTrue(actualSwitchMapTransformerResult instanceof SwitchTransformer);
    assertNull(actualTransformResult);
    assertNull(((ConstantTransformer<? super Object, ?>) defaultTransformer).getConstant());
    assertEquals(1, ((Integer) ((EqualPredicate<? super Object>) predicate).getValue()).intValue());
    assertEquals(1, predicates.length);
    assertEquals(
        1,
        ((SwitchTransformer<Object, Object>) actualSwitchMapTransformerResult)
            .getTransformers()
            .length);
    assertTrue(objectsAndTransformers.containsKey(1));
  }

  /**
   * Test {@link TransformerUtils#switchMapTransformer(Map)}.
   *
   * <ul>
   *   <li>Then return first element Value is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#switchMapTransformer(Map)}
   */
  @Test
  @DisplayName("Test switchMapTransformer(Map); then return first element Value is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.switchMapTransformer(Map)"})
  void testSwitchMapTransformer_thenReturnFirstElementValueIs42() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    HashMap<Object, Transformer<Object, Object>> objectsAndTransformers = new HashMap<>();
    objectsAndTransformers.put("42", transformer);

    // Act
    Transformer<Object, Object> actualSwitchMapTransformerResult =
        TransformerUtils.switchMapTransformer(objectsAndTransformers);
    Object actualTransformResult = actualSwitchMapTransformerResult.transform("42");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals(1, objectsAndTransformers.size());
    Transformer<? super Object, ?> defaultTransformer =
        ((SwitchTransformer<Object, Object>) actualSwitchMapTransformerResult)
            .getDefaultTransformer();
    assertTrue(defaultTransformer instanceof ConstantTransformer);
    Predicate<? super Object>[] predicates =
        ((SwitchTransformer<Object, Object>) actualSwitchMapTransformerResult).getPredicates();
    Predicate<? super Object> predicate = predicates[0];
    assertTrue(predicate instanceof EqualPredicate);
    assertTrue(actualSwitchMapTransformerResult instanceof SwitchTransformer);
    assertEquals("42", ((EqualPredicate<? super Object>) predicate).getValue());
    assertEquals("Apply", actualTransformResult);
    assertNull(((ConstantTransformer<? super Object, ?>) defaultTransformer).getConstant());
    assertEquals(1, predicates.length);
    assertEquals(
        1,
        ((SwitchTransformer<Object, Object>) actualSwitchMapTransformerResult)
            .getTransformers()
            .length);
    assertTrue(objectsAndTransformers.containsKey("42"));
  }

  /**
   * Test {@link TransformerUtils#switchMapTransformer(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@link ConstantTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#switchMapTransformer(Map)}
   */
  @Test
  @DisplayName("Test switchMapTransformer(Map); when HashMap(); then return ConstantTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.switchMapTransformer(Map)"})
  void testSwitchMapTransformer_whenHashMap_thenReturnConstantTransformer() {
    // Arrange
    HashMap<Object, Transformer<Object, Object>> objectsAndTransformers = new HashMap<>();

    // Act
    Transformer<Object, Object> actualSwitchMapTransformerResult =
        TransformerUtils.switchMapTransformer(objectsAndTransformers);
    Object actualTransformResult = actualSwitchMapTransformerResult.transform("42");

    // Assert
    assertTrue(actualSwitchMapTransformerResult instanceof ConstantTransformer);
    assertNull(actualTransformResult);
    assertNull(
        ((ConstantTransformer<Object, Object>) actualSwitchMapTransformerResult).getConstant());
    assertTrue(objectsAndTransformers.isEmpty());
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Predicate, Transformer, Transformer)} with
   * {@code predicate}, {@code trueTransformer}, {@code falseTransformer}.
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Predicate, Transformer,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate, Transformer, Transformer) with 'predicate', 'trueTransformer', 'falseTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer TransformerUtils.switchTransformer(Predicate, Transformer, Transformer)"
  })
  void testSwitchTransformerWithPredicateTrueTransformerFalseTransformer() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        TransformerUtils.switchTransformer(predicate, trueTransformer, null);

    // Assert
    Transformer<? super Object, ?> defaultTransformer =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getDefaultTransformer();
    assertTrue(defaultTransformer instanceof ConstantTransformer);
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertNull(((ConstantTransformer<? super Object, ?>) defaultTransformer).getConstant());
    assertNull(null);
    Predicate<? super Object>[] predicates =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates();
    assertEquals(1, predicates.length);
    Transformer<? super Object, ?>[] transformers =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getTransformers();
    assertEquals(1, transformers.length);
    assertSame(predicate, predicates[0]);
    assertSame(trueTransformer, transformers[0]);
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Predicate, Transformer, Transformer)} with
   * {@code predicate}, {@code trueTransformer}, {@code falseTransformer}.
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Predicate, Transformer,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate, Transformer, Transformer) with 'predicate', 'trueTransformer', 'falseTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer TransformerUtils.switchTransformer(Predicate, Transformer, Transformer)"
  })
  void testSwitchTransformerWithPredicateTrueTransformerFalseTransformer2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Object> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> falseTransformer = mock(Transformer.class);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        TransformerUtils.switchTransformer(predicate, trueTransformer, falseTransformer);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertEquals("Apply", actualTransformResult);
    Predicate<? super Object>[] predicates =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates();
    assertEquals(1, predicates.length);
    Transformer<? super Object, ?>[] transformers =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getTransformers();
    assertEquals(1, transformers.length);
    assertSame(predicate, predicates[0]);
    assertSame(
        falseTransformer,
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult)
            .getDefaultTransformer());
    assertSame(trueTransformer, transformers[0]);
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Predicate, Transformer, Transformer)} with
   * {@code predicate}, {@code trueTransformer}, {@code falseTransformer}.
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Predicate, Transformer,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate, Transformer, Transformer) with 'predicate', 'trueTransformer', 'falseTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer TransformerUtils.switchTransformer(Predicate, Transformer, Transformer)"
  })
  void testSwitchTransformerWithPredicateTrueTransformerFalseTransformer3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);

    Transformer<Object, Object> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        TransformerUtils.switchTransformer(predicate, trueTransformer, falseTransformer);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertEquals("Apply", actualTransformResult);
    Predicate<? super Object>[] predicates =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates();
    assertEquals(1, predicates.length);
    Transformer<? super Object, ?>[] transformers =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getTransformers();
    assertEquals(1, transformers.length);
    assertSame(predicate, predicates[0]);
    assertSame(
        falseTransformer,
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult)
            .getDefaultTransformer());
    assertSame(trueTransformer, transformers[0]);
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Predicate, Transformer, Transformer)} with
   * {@code predicate}, {@code trueTransformer}, {@code falseTransformer}.
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Predicate, Transformer,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate, Transformer, Transformer) with 'predicate', 'trueTransformer', 'falseTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer TransformerUtils.switchTransformer(Predicate, Transformer, Transformer)"
  })
  void testSwitchTransformerWithPredicateTrueTransformerFalseTransformer4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        TransformerUtils.switchTransformer(predicate, trueTransformer, null);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    Transformer<? super Object, ?> defaultTransformer =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getDefaultTransformer();
    assertTrue(defaultTransformer instanceof ConstantTransformer);
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertNull(actualTransformResult);
    assertNull(((ConstantTransformer<? super Object, ?>) defaultTransformer).getConstant());
    assertNull(null);
    Predicate<? super Object>[] predicates =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates();
    assertEquals(1, predicates.length);
    Transformer<? super Object, ?>[] transformers =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getTransformers();
    assertEquals(1, transformers.length);
    assertSame(predicate, predicates[0]);
    assertSame(trueTransformer, transformers[0]);
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Predicate, Transformer, Transformer)} with
   * {@code predicate}, {@code trueTransformer}, {@code falseTransformer}.
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Predicate, Transformer,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate, Transformer, Transformer) with 'predicate', 'trueTransformer', 'falseTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer TransformerUtils.switchTransformer(Predicate, Transformer, Transformer)"
  })
  void testSwitchTransformerWithPredicateTrueTransformerFalseTransformer5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    ClosureTransformer<? super Object> falseTransformer = new ClosureTransformer<>(closure);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        TransformerUtils.switchTransformer(predicate, trueTransformer, falseTransformer);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    Transformer<? super Object, ?> defaultTransformer =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getDefaultTransformer();
    assertTrue(defaultTransformer instanceof ClosureTransformer);
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertEquals("42", actualTransformResult);
    Predicate<? super Object>[] predicates =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates();
    assertEquals(1, predicates.length);
    Transformer<? super Object, ?>[] transformers =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getTransformers();
    assertEquals(1, transformers.length);
    assertSame(falseTransformer, defaultTransformer);
    assertSame(predicate, predicates[0]);
    assertSame(trueTransformer, transformers[0]);
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Predicate, Transformer, Transformer)} with
   * {@code predicate}, {@code trueTransformer}, {@code falseTransformer}.
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Predicate, Transformer,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate, Transformer, Transformer) with 'predicate', 'trueTransformer', 'falseTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer TransformerUtils.switchTransformer(Predicate, Transformer, Transformer)"
  })
  void testSwitchTransformerWithPredicateTrueTransformerFalseTransformer6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);

    Factory<Object> factory = mock(Factory.class);
    when(factory.get()).thenReturn("Get");
    FactoryTransformer<? super Object, ?> falseTransformer = new FactoryTransformer<>(factory);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        TransformerUtils.switchTransformer(predicate, trueTransformer, falseTransformer);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(factory).get();
    verify(predicate).test(isA(Object.class));
    Transformer<? super Object, ?> defaultTransformer =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getDefaultTransformer();
    assertTrue(defaultTransformer instanceof FactoryTransformer);
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertEquals("Get", actualTransformResult);
    Predicate<? super Object>[] predicates =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates();
    assertEquals(1, predicates.length);
    Transformer<? super Object, ?>[] transformers =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getTransformers();
    assertEquals(1, transformers.length);
    assertSame(falseTransformer, defaultTransformer);
    assertSame(predicate, predicates[0]);
    assertSame(trueTransformer, transformers[0]);
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Predicate, Transformer, Transformer)} with
   * {@code predicate}, {@code trueTransformer}, {@code falseTransformer}.
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Predicate, Transformer,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate, Transformer, Transformer) with 'predicate', 'trueTransformer', 'falseTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer TransformerUtils.switchTransformer(Predicate, Transformer, Transformer)"
  })
  void testSwitchTransformerWithPredicateTrueTransformerFalseTransformer7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Object> trueTransformer2 = mock(Transformer.class);
    when(trueTransformer2.apply(Mockito.<Object>any())).thenReturn("Apply");

    IfTransformer<? super Object, ?> falseTransformer =
        new IfTransformer<>(predicate2, trueTransformer2, mock(Transformer.class));

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        TransformerUtils.switchTransformer(predicate, trueTransformer, falseTransformer);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    verify(trueTransformer2).apply(isA(Object.class));
    Transformer<? super Object, ?> defaultTransformer =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getDefaultTransformer();
    assertTrue(defaultTransformer instanceof IfTransformer);
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertEquals("Apply", actualTransformResult);
    Predicate<? super Object>[] predicates =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates();
    assertEquals(1, predicates.length);
    Transformer<? super Object, ?>[] transformers =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getTransformers();
    assertEquals(1, transformers.length);
    assertSame(falseTransformer, defaultTransformer);
    assertSame(predicate, predicates[0]);
    assertSame(trueTransformer, transformers[0]);
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Predicate, Transformer, Transformer)} with
   * {@code predicate}, {@code trueTransformer}, {@code falseTransformer}.
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Predicate, Transformer,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate, Transformer, Transformer) with 'predicate', 'trueTransformer', 'falseTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer TransformerUtils.switchTransformer(Predicate, Transformer, Transformer)"
  })
  void testSwitchTransformerWithPredicateTrueTransformerFalseTransformer8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Object> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    IfTransformer<? super Object, ?> falseTransformer2 =
        new IfTransformer<>(predicate2, mock(Transformer.class), falseTransformer);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        TransformerUtils.switchTransformer(predicate, trueTransformer, falseTransformer2);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    Transformer<? super Object, ?> defaultTransformer =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getDefaultTransformer();
    assertTrue(defaultTransformer instanceof IfTransformer);
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertEquals("Apply", actualTransformResult);
    Predicate<? super Object>[] predicates =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates();
    assertEquals(1, predicates.length);
    Transformer<? super Object, ?>[] transformers =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getTransformers();
    assertEquals(1, transformers.length);
    assertSame(falseTransformer2, defaultTransformer);
    assertSame(predicate, predicates[0]);
    assertSame(trueTransformer, transformers[0]);
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Predicate, Transformer, Transformer)} with
   * {@code predicate}, {@code trueTransformer}, {@code falseTransformer}.
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Predicate, Transformer,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate, Transformer, Transformer) with 'predicate', 'trueTransformer', 'falseTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer TransformerUtils.switchTransformer(Predicate, Transformer, Transformer)"
  })
  void testSwitchTransformerWithPredicateTrueTransformerFalseTransformer9() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    PredicateTransformer<? super Object> falseTransformer = new PredicateTransformer<>(predicate2);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        TransformerUtils.switchTransformer(predicate, trueTransformer, falseTransformer);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    Transformer<? super Object, ?> defaultTransformer =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getDefaultTransformer();
    assertTrue(defaultTransformer instanceof PredicateTransformer);
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    Predicate<? super Object>[] predicates =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates();
    assertEquals(1, predicates.length);
    Transformer<? super Object, ?>[] transformers =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getTransformers();
    assertEquals(1, transformers.length);
    assertTrue((Boolean) actualTransformResult);
    assertSame(falseTransformer, defaultTransformer);
    assertSame(predicate, predicates[0]);
    assertSame(trueTransformer, transformers[0]);
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Predicate, Transformer, Transformer)} with
   * {@code predicate}, {@code trueTransformer}, {@code falseTransformer}.
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Predicate, Transformer,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate, Transformer, Transformer) with 'predicate', 'trueTransformer', 'falseTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer TransformerUtils.switchTransformer(Predicate, Transformer, Transformer)"
  })
  void testSwitchTransformerWithPredicateTrueTransformerFalseTransformer10() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);
    PredicateTransformer<? super Object> falseTransformer = new PredicateTransformer<>(predicate2);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        TransformerUtils.switchTransformer(predicate, trueTransformer, falseTransformer);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    Transformer<? super Object, ?> defaultTransformer =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getDefaultTransformer();
    assertTrue(defaultTransformer instanceof PredicateTransformer);
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    Predicate<? super Object>[] predicates =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates();
    assertEquals(1, predicates.length);
    Transformer<? super Object, ?>[] transformers =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getTransformers();
    assertEquals(1, transformers.length);
    assertFalse((Boolean) actualTransformResult);
    assertSame(falseTransformer, defaultTransformer);
    assertSame(predicate, predicates[0]);
    assertSame(trueTransformer, transformers[0]);
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Predicate, Transformer, Transformer)} with
   * {@code predicate}, {@code trueTransformer}, {@code falseTransformer}.
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Predicate, Transformer,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate, Transformer, Transformer) with 'predicate', 'trueTransformer', 'falseTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer TransformerUtils.switchTransformer(Predicate, Transformer, Transformer)"
  })
  void testSwitchTransformerWithPredicateTrueTransformerFalseTransformer11() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate2};

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<? super Object, ?>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<? super Object, ?> falseTransformer =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        TransformerUtils.switchTransformer(predicate, trueTransformer, falseTransformer);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertEquals("Apply", actualTransformResult);
    assertEquals(1, falseTransformer.getPredicates().length);
    Predicate<? super Object>[] predicates2 =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates();
    assertEquals(1, predicates2.length);
    assertEquals(1, falseTransformer.getTransformers().length);
    Transformer<? super Object, ?>[] transformers2 =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getTransformers();
    assertEquals(1, transformers2.length);
    assertSame(
        falseTransformer,
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult)
            .getDefaultTransformer());
    assertSame(predicate, predicates2[0]);
    assertSame(trueTransformer, transformers2[0]);
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Predicate, Transformer, Transformer)} with
   * {@code predicate}, {@code trueTransformer}, {@code falseTransformer}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Predicate, Transformer,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate, Transformer, Transformer) with 'predicate', 'trueTransformer', 'falseTransformer'; when Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer TransformerUtils.switchTransformer(Predicate, Transformer, Transformer)"
  })
  void testSwitchTransformerWithPredicateTrueTransformerFalseTransformer_whenPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);
    Transformer<Object, Object> falseTransformer = mock(Transformer.class);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        TransformerUtils.switchTransformer(predicate, trueTransformer, falseTransformer);

    // Assert
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    Predicate<? super Object>[] predicates =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates();
    assertEquals(1, predicates.length);
    Transformer<? super Object, ?>[] transformers =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getTransformers();
    assertEquals(1, transformers.length);
    assertSame(predicate, predicates[0]);
    assertSame(
        falseTransformer,
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult)
            .getDefaultTransformer());
    assertSame(trueTransformer, transformers[0]);
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Map)} with {@code predicatesAndTransformers}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Map)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Map) with 'predicatesAndTransformers'; given Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.switchTransformer(Map)"})
  void testSwitchTransformerWithPredicatesAndTransformers_givenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    HashMap<Predicate<Object>, Transformer<Object, Object>> predicatesAndTransformers =
        new HashMap<>();
    predicatesAndTransformers.put(predicate, mock(Transformer.class));

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        TransformerUtils.switchTransformer(predicatesAndTransformers);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(1, predicatesAndTransformers.size());
    Transformer<? super Object, ?> defaultTransformer =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getDefaultTransformer();
    assertTrue(defaultTransformer instanceof ConstantTransformer);
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertNull(actualTransformResult);
    assertNull(((ConstantTransformer<? super Object, ?>) defaultTransformer).getConstant());
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
   * Test {@link TransformerUtils#switchTransformer(Map)} with {@code predicatesAndTransformers}.
   *
   * <ul>
   *   <li>Then return transform {@code 42} is {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Map)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Map) with 'predicatesAndTransformers'; then return transform '42' is 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.switchTransformer(Map)"})
  void testSwitchTransformerWithPredicatesAndTransformers_thenReturnTransform42IsApply() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    HashMap<Predicate<Object>, Transformer<Object, Object>> predicatesAndTransformers =
        new HashMap<>();

    predicatesAndTransformers.put(predicate, transformer);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        TransformerUtils.switchTransformer(predicatesAndTransformers);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals(1, predicatesAndTransformers.size());
    Transformer<? super Object, ?> defaultTransformer =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getDefaultTransformer();
    assertTrue(defaultTransformer instanceof ConstantTransformer);
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertEquals("Apply", actualTransformResult);
    assertNull(((ConstantTransformer<? super Object, ?>) defaultTransformer).getConstant());
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
   * Test {@link TransformerUtils#switchTransformer(Map)} with {@code predicatesAndTransformers}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Map)}
   */
  @Test
  @DisplayName("Test switchTransformer(Map) with 'predicatesAndTransformers'; when HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.switchTransformer(Map)"})
  void testSwitchTransformerWithPredicatesAndTransformers_whenHashMap() {
    // Arrange
    HashMap<Predicate<Object>, Transformer<Object, Object>> predicatesAndTransformers =
        new HashMap<>();

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        TransformerUtils.switchTransformer(predicatesAndTransformers);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    assertTrue(actualSwitchTransformerResult instanceof ConstantTransformer);
    assertNull(actualTransformResult);
    assertNull(((ConstantTransformer<Object, Object>) actualSwitchTransformerResult).getConstant());
    assertTrue(predicatesAndTransformers.isEmpty());
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Map)} with {@code predicatesAndTransformers}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code null} is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Map)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Map) with 'predicatesAndTransformers'; when HashMap() 'null' is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.switchTransformer(Map)"})
  void testSwitchTransformerWithPredicatesAndTransformers_whenHashMapNullIsNull() {
    // Arrange
    HashMap<Predicate<Object>, Transformer<Object, Object>> predicatesAndTransformers =
        new HashMap<>();
    predicatesAndTransformers.put(null, null);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        TransformerUtils.switchTransformer(predicatesAndTransformers);

    // Assert
    assertTrue(actualSwitchTransformerResult instanceof ConstantTransformer);
    assertNull(((ConstantTransformer<Object, Object>) actualSwitchTransformerResult).getConstant());
    assertTrue(predicatesAndTransformers.isEmpty());
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Map)} with {@code predicatesAndTransformers}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code null} is {@link Transformer}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Map)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Map) with 'predicatesAndTransformers'; when HashMap() 'null' is Transformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.switchTransformer(Map)"})
  void testSwitchTransformerWithPredicatesAndTransformers_whenHashMapNullIsTransformer() {
    // Arrange
    HashMap<Predicate<Object>, Transformer<Object, Object>> predicatesAndTransformers =
        new HashMap<>();
    predicatesAndTransformers.put(null, mock(Transformer.class));

    // Act
    TransformerUtils.switchTransformer(predicatesAndTransformers);

    // Assert
    assertTrue(predicatesAndTransformers.isEmpty());
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Predicate[], Transformer[])} with {@code
   * predicates}, {@code transformers}.
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Predicate[], Transformer[])}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate[], Transformer[]) with 'predicates', 'transformers'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.switchTransformer(Predicate[], Transformer[])"})
  void testSwitchTransformerWithPredicatesTransformers() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {mock(Predicate.class)};
    Transformer<? super Object, ?>[] transformers = new Transformer[] {mock(Transformer.class)};

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        TransformerUtils.switchTransformer(predicates, transformers);

    // Assert
    Transformer<? super Object, ?> defaultTransformer =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getDefaultTransformer();
    assertTrue(defaultTransformer instanceof ConstantTransformer);
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertNull(((ConstantTransformer<? super Object, ?>) defaultTransformer).getConstant());
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
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Predicate[], Transformer[], Transformer)} with
   * {@code predicates}, {@code transformers}, {@code defaultTransformer}.
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Predicate[], Transformer[],
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate[], Transformer[], Transformer) with 'predicates', 'transformers', 'defaultTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer TransformerUtils.switchTransformer(Predicate[], Transformer[], Transformer)"
  })
  void testSwitchTransformerWithPredicatesTransformersDefaultTransformer() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {mock(Predicate.class)};
    Transformer<? super Object, ?>[] transformers = new Transformer[] {mock(Transformer.class)};
    Transformer<Object, Object> defaultTransformer = mock(Transformer.class);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        TransformerUtils.switchTransformer(predicates, transformers, defaultTransformer);

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
   * Test {@link TransformerUtils#switchTransformer(Predicate[], Transformer[], Transformer)} with
   * {@code predicates}, {@code transformers}, {@code defaultTransformer}.
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Predicate[], Transformer[],
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate[], Transformer[], Transformer) with 'predicates', 'transformers', 'defaultTransformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer TransformerUtils.switchTransformer(Predicate[], Transformer[], Transformer)"
  })
  void testSwitchTransformerWithPredicatesTransformersDefaultTransformer2() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {};
    Transformer<? super Object, ?>[] transformers = new Transformer[] {};

    Transformer<Object, Object> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.transform(Mockito.<Object>any())).thenReturn("Transform");

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        TransformerUtils.switchTransformer(predicates, transformers, defaultTransformer);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(defaultTransformer).transform(isA(Object.class));
    assertEquals("Transform", actualTransformResult);
    assertEquals(0, predicates.length);
    assertEquals(0, transformers.length);
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Predicate[], Transformer[], Transformer)} with
   * {@code predicates}, {@code transformers}, {@code defaultTransformer}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Predicate[], Transformer[],
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate[], Transformer[], Transformer) with 'predicates', 'transformers', 'defaultTransformer'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer TransformerUtils.switchTransformer(Predicate[], Transformer[], Transformer)"
  })
  void testSwitchTransformerWithPredicatesTransformersDefaultTransformer_givenFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ?>[] transformers = new Transformer[] {mock(Transformer.class)};

    Transformer<Object, Object> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        TransformerUtils.switchTransformer(predicates, transformers, defaultTransformer);
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
   * Test {@link TransformerUtils#switchTransformer(Predicate[], Transformer[], Transformer)} with
   * {@code predicates}, {@code transformers}, {@code defaultTransformer}.
   *
   * <ul>
   *   <li>Given {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Predicate[], Transformer[],
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate[], Transformer[], Transformer) with 'predicates', 'transformers', 'defaultTransformer'; given 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer TransformerUtils.switchTransformer(Predicate[], Transformer[], Transformer)"
  })
  void testSwitchTransformerWithPredicatesTransformersDefaultTransformer_givenTrue() {
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
        TransformerUtils.switchTransformer(predicates, transformers, defaultTransformer);
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
   * Test {@link TransformerUtils#switchTransformer(Predicate[], Transformer[])} with {@code
   * predicates}, {@code transformers}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Predicate[], Transformer[])}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate[], Transformer[]) with 'predicates', 'transformers'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.switchTransformer(Predicate[], Transformer[])"})
  void testSwitchTransformerWithPredicatesTransformers_givenFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ?>[] transformers = new Transformer[] {mock(Transformer.class)};

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        TransformerUtils.switchTransformer(predicates, transformers);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    Transformer<? super Object, ?> defaultTransformer =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getDefaultTransformer();
    assertTrue(defaultTransformer instanceof ConstantTransformer);
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertNull(actualTransformResult);
    assertNull(((ConstantTransformer<? super Object, ?>) defaultTransformer).getConstant());
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
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Predicate[], Transformer[])} with {@code
   * predicates}, {@code transformers}.
   *
   * <ul>
   *   <li>Then return {@link ConstantTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Predicate[], Transformer[])}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate[], Transformer[]) with 'predicates', 'transformers'; then return ConstantTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.switchTransformer(Predicate[], Transformer[])"})
  void testSwitchTransformerWithPredicatesTransformers_thenReturnConstantTransformer() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {};
    Transformer<? super Object, ?>[] transformers = new Transformer[] {};

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        TransformerUtils.switchTransformer(predicates, transformers);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    assertTrue(actualSwitchTransformerResult instanceof ConstantTransformer);
    assertNull(actualTransformResult);
    assertNull(((ConstantTransformer<Object, Object>) actualSwitchTransformerResult).getConstant());
    assertEquals(0, predicates.length);
    assertEquals(0, transformers.length);
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Predicate[], Transformer[])} with {@code
   * predicates}, {@code transformers}.
   *
   * <ul>
   *   <li>Then return transform {@code 42} is {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerUtils#switchTransformer(Predicate[], Transformer[])}
   */
  @Test
  @DisplayName(
      "Test switchTransformer(Predicate[], Transformer[]) with 'predicates', 'transformers'; then return transform '42' is 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer TransformerUtils.switchTransformer(Predicate[], Transformer[])"})
  void testSwitchTransformerWithPredicatesTransformers_thenReturnTransform42IsApply() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<? super Object, ?>[] transformers = new Transformer[] {transformer};

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult =
        TransformerUtils.switchTransformer(predicates, transformers);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    Transformer<? super Object, ?> defaultTransformer =
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getDefaultTransformer();
    assertTrue(defaultTransformer instanceof ConstantTransformer);
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertEquals("Apply", actualTransformResult);
    assertNull(((ConstantTransformer<? super Object, ?>) defaultTransformer).getConstant());
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
  }
}
