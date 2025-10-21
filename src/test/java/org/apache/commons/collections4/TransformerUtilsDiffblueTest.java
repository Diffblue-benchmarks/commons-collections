package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
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
import org.apache.commons.collections4.functors.FactoryTransformer;
import org.apache.commons.collections4.functors.IfTransformer;
import org.apache.commons.collections4.functors.InstantiateTransformer;
import org.apache.commons.collections4.functors.MapTransformer;
import org.apache.commons.collections4.functors.NOPTransformer;
import org.apache.commons.collections4.functors.PredicateTransformer;
import org.apache.commons.collections4.functors.StringValueTransformer;
import org.apache.commons.collections4.functors.SwitchTransformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class TransformerUtilsDiffblueTest {
  /**
   * Test {@link TransformerUtils#asTransformer(Closure)} with {@code closure}.
   * <p>
   * Method under test: {@link TransformerUtils#asTransformer(Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.asTransformer(Closure)"})
  public void testAsTransformerWithClosure() {
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
   * Test {@link TransformerUtils#asTransformer(Factory)} with {@code factory}.
   * <p>
   * Method under test: {@link TransformerUtils#asTransformer(Factory)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.asTransformer(Factory)"})
  public void testAsTransformerWithFactory() {
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
    assertSame(factory, ((FactoryTransformer<Object, Object>) actualAsTransformerResult).getFactory());
  }

  /**
   * Test {@link TransformerUtils#asTransformer(Predicate)} with {@code predicate}.
   * <p>
   * Method under test: {@link TransformerUtils#asTransformer(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.asTransformer(Predicate)"})
  public void testAsTransformerWithPredicate() {
    // Arrange
    DefaultEquator<Object> equator = DefaultEquator.defaultEquator();
    EqualPredicate<Object> predicate = new EqualPredicate<>("Test", equator);

    // Act
    Transformer<Object, Boolean> actualAsTransformerResult = TransformerUtils.asTransformer(predicate);
    actualAsTransformerResult.transform("42");

    // Assert
    Predicate<? super Object> predicate2 = ((PredicateTransformer<Object>) actualAsTransformerResult).getPredicate();
    assertTrue(predicate2 instanceof EqualPredicate);
    assertTrue(actualAsTransformerResult instanceof PredicateTransformer);
    assertEquals("Test", ((EqualPredicate<? super Object>) predicate2).getValue());
    assertSame(predicate, predicate2);
  }

  /**
   * Test {@link TransformerUtils#asTransformer(Predicate)} with {@code predicate}.
   * <p>
   * Method under test: {@link TransformerUtils#asTransformer(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.asTransformer(Predicate)"})
  public void testAsTransformerWithPredicate2() {
    // Arrange
    EqualPredicate<Object> predicate = new EqualPredicate<>("Test", null);

    // Act
    Transformer<Object, Boolean> actualAsTransformerResult = TransformerUtils.asTransformer(predicate);
    actualAsTransformerResult.transform("42");

    // Assert
    Predicate<? super Object> predicate2 = ((PredicateTransformer<Object>) actualAsTransformerResult).getPredicate();
    assertTrue(predicate2 instanceof EqualPredicate);
    assertTrue(actualAsTransformerResult instanceof PredicateTransformer);
    assertEquals("Test", ((EqualPredicate<? super Object>) predicate2).getValue());
    assertSame(predicate, predicate2);
  }

  /**
   * Test {@link TransformerUtils#asTransformer(Predicate)} with {@code predicate}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return not transform {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#asTransformer(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.asTransformer(Predicate)"})
  public void testAsTransformerWithPredicate_givenFalse_thenReturnNotTransform42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Transformer<Object, Boolean> actualAsTransformerResult = TransformerUtils.asTransformer(predicate);
    Boolean actualTransformResult = actualAsTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAsTransformerResult instanceof PredicateTransformer);
    assertFalse(actualTransformResult);
    assertSame(predicate, ((PredicateTransformer<Object>) actualAsTransformerResult).getPredicate());
  }

  /**
   * Test {@link TransformerUtils#asTransformer(Predicate)} with {@code predicate}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return transform {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#asTransformer(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.asTransformer(Predicate)"})
  public void testAsTransformerWithPredicate_givenTrue_thenReturnTransform42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Transformer<Object, Boolean> actualAsTransformerResult = TransformerUtils.asTransformer(predicate);
    Boolean actualTransformResult = actualAsTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAsTransformerResult instanceof PredicateTransformer);
    assertTrue(actualTransformResult);
    assertSame(predicate, ((PredicateTransformer<Object>) actualAsTransformerResult).getPredicate());
  }

  /**
   * Test {@link TransformerUtils#chainedTransformer(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Then return array length is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#chainedTransformer(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.chainedTransformer(Collection)"})
  public void testChainedTransformerWithCollection_thenReturnArrayLengthIsOne() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    ArrayList<Transformer<? super Object, ?>> transformers = new ArrayList<>();
    transformers.add(transformer);

    // Act
    Transformer<Object, Object> actualChainedTransformerResult = TransformerUtils.chainedTransformer(transformers);
    Object actualTransformResult = actualChainedTransformerResult.transform("42");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualChainedTransformerResult instanceof ChainedTransformer);
    assertEquals("Apply", actualTransformResult);
    assertEquals(1, ((ChainedTransformer<Object>) actualChainedTransformerResult).getTransformers().length);
  }

  /**
   * Test {@link TransformerUtils#chainedTransformer(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Then return array length is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#chainedTransformer(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.chainedTransformer(Collection)"})
  public void testChainedTransformerWithCollection_thenReturnArrayLengthIsTwo() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> transformer2 = mock(Transformer.class);
    when(transformer2.apply(Mockito.<Object>any())).thenReturn("Apply");

    ArrayList<Transformer<? super Object, ?>> transformers = new ArrayList<>();
    transformers.add(transformer2);
    transformers.add(transformer);

    // Act
    Transformer<Object, Object> actualChainedTransformerResult = TransformerUtils.chainedTransformer(transformers);
    Object actualTransformResult = actualChainedTransformerResult.transform("42");

    // Assert
    verify(transformer2).apply(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualChainedTransformerResult instanceof ChainedTransformer);
    assertEquals("Apply", actualTransformResult);
    assertEquals(2, ((ChainedTransformer<Object>) actualChainedTransformerResult).getTransformers().length);
  }

  /**
   * Test {@link TransformerUtils#chainedTransformer(Collection)} with {@code Collection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link NOPTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#chainedTransformer(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.chainedTransformer(Collection)"})
  public void testChainedTransformerWithCollection_whenArrayList_thenReturnNOPTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualChainedTransformerResult = TransformerUtils.chainedTransformer(new ArrayList<>());
    Object actualTransformResult = actualChainedTransformerResult.transform("42");

    // Assert
    assertTrue(actualChainedTransformerResult instanceof NOPTransformer);
    assertEquals("42", actualChainedTransformerResult.apply("42"));
    assertEquals("42", actualTransformResult);
    assertEquals("Input", actualChainedTransformerResult.transform("Input"));
  }

  /**
   * Test {@link TransformerUtils#chainedTransformer(Transformer[])} with {@code Transformer[]}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>Then return {@link ChainedTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#chainedTransformer(Transformer[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.chainedTransformer(Transformer[])"})
  public void testChainedTransformerWithTransformer_givenApply_thenReturnChainedTransformer() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Transformer<Object, Object> actualChainedTransformerResult = TransformerUtils.chainedTransformer(transformer);
    Object actualTransformResult = actualChainedTransformerResult.transform("42");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualChainedTransformerResult instanceof ChainedTransformer);
    assertEquals("Apply", actualTransformResult);
    assertEquals(1, ((ChainedTransformer<Object>) actualChainedTransformerResult).getTransformers().length);
  }

  /**
   * Test {@link TransformerUtils#chainedTransformer(Transformer[])} with {@code Transformer[]}.
   * <ul>
   *   <li>Then return {@link NOPTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#chainedTransformer(Transformer[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.chainedTransformer(Transformer[])"})
  public void testChainedTransformerWithTransformer_thenReturnNOPTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualChainedTransformerResult = TransformerUtils.chainedTransformer();
    Object actualTransformResult = actualChainedTransformerResult.transform("42");

    // Assert
    assertTrue(actualChainedTransformerResult instanceof NOPTransformer);
    assertEquals("42", actualChainedTransformerResult.apply("42"));
    assertEquals("42", actualTransformResult);
    assertEquals("Input", actualChainedTransformerResult.transform("Input"));
  }

  /**
   * Test {@link TransformerUtils#cloneTransformer()}.
   * <ul>
   *   <li>Then return transform {@code 42} is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#cloneTransformer()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.cloneTransformer()"})
  public void testCloneTransformer_thenReturnTransform42Is42() {
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
   * <ul>
   *   <li>Then return transform {@link ArrayList#ArrayList()} is {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#cloneTransformer()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.cloneTransformer()"})
  public void testCloneTransformer_thenReturnTransformArrayListIsArrayList() {
    // Arrange and Act
    Transformer<Object, Object> actualCloneTransformerResult = TransformerUtils.cloneTransformer();
    ArrayList<Object> objectList = new ArrayList<>();
    Object actualTransformResult = actualCloneTransformerResult.transform(objectList);

    // Assert
    assertTrue(actualCloneTransformerResult instanceof CloneTransformer);
    assertEquals("42", actualCloneTransformerResult.apply("42"));
    assertEquals("Input", actualCloneTransformerResult.transform("Input"));
    assertEquals(objectList, actualTransformResult);
  }

  /**
   * Test {@link TransformerUtils#cloneTransformer()}.
   * <ul>
   *   <li>Then return transform {@code null} is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#cloneTransformer()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.cloneTransformer()"})
  public void testCloneTransformer_thenReturnTransformNullIsNull() {
    // Arrange and Act
    Transformer<Object, Object> actualCloneTransformerResult = TransformerUtils.cloneTransformer();
    Object actualTransformResult = actualCloneTransformerResult.transform(null);

    // Assert
    assertTrue(actualCloneTransformerResult instanceof CloneTransformer);
    assertEquals("42", actualCloneTransformerResult.apply("42"));
    assertEquals("Input", actualCloneTransformerResult.transform("Input"));
    assertNull(actualTransformResult);
  }

  /**
   * Test {@link TransformerUtils#cloneTransformer()}.
   * <ul>
   *   <li>Then return transform one intValue is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#cloneTransformer()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.cloneTransformer()"})
  public void testCloneTransformer_thenReturnTransformOneIntValueIsOne() {
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
   * <p>
   * Method under test: {@link TransformerUtils#constantTransformer(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.constantTransformer(Object)"})
  public void testConstantTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualConstantTransformerResult = TransformerUtils
        .constantTransformer("Constant To Return");

    // Assert
    assertTrue(actualConstantTransformerResult instanceof ConstantTransformer);
    assertEquals("Constant To Return", actualConstantTransformerResult.transform("42"));
    assertEquals("Constant To Return",
        ((ConstantTransformer<Object, Object>) actualConstantTransformerResult).getConstant());
  }

  /**
   * Test {@link TransformerUtils#ifTransformer(Predicate, Transformer, Transformer)} with {@code predicate}, {@code trueTransformer}, {@code falseTransformer}.
   * <ul>
   *   <li>Given {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#ifTransformer(Predicate, Transformer, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.ifTransformer(Predicate, Transformer, Transformer)"})
  public void testIfTransformerWithPredicateTrueTransformerFalseTransformer_givenFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Transformer<Object, Object> actualIfTransformerResult = TransformerUtils.ifTransformer(predicate, trueTransformer,
        falseTransformer);
    Object actualTransformResult = actualIfTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertTrue(actualIfTransformerResult instanceof IfTransformer);
    assertEquals("Apply", actualTransformResult);
    assertSame(predicate, ((IfTransformer<Object, Object>) actualIfTransformerResult).getPredicate());
    assertSame(falseTransformer, ((IfTransformer<Object, Object>) actualIfTransformerResult).getFalseTransformer());
    assertSame(trueTransformer, ((IfTransformer<Object, Object>) actualIfTransformerResult).getTrueTransformer());
  }

  /**
   * Test {@link TransformerUtils#ifTransformer(Predicate, Transformer, Transformer)} with {@code predicate}, {@code trueTransformer}, {@code falseTransformer}.
   * <ul>
   *   <li>Given {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#ifTransformer(Predicate, Transformer, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.ifTransformer(Predicate, Transformer, Transformer)"})
  public void testIfTransformerWithPredicateTrueTransformerFalseTransformer_givenTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> falseTransformer = mock(Transformer.class);

    // Act
    Transformer<Object, Object> actualIfTransformerResult = TransformerUtils.ifTransformer(predicate, trueTransformer,
        falseTransformer);
    Object actualTransformResult = actualIfTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertTrue(actualIfTransformerResult instanceof IfTransformer);
    assertEquals("Apply", actualTransformResult);
    assertSame(predicate, ((IfTransformer<Object, Object>) actualIfTransformerResult).getPredicate());
    assertSame(falseTransformer, ((IfTransformer<Object, Object>) actualIfTransformerResult).getFalseTransformer());
    assertSame(trueTransformer, ((IfTransformer<Object, Object>) actualIfTransformerResult).getTrueTransformer());
  }

  /**
   * Test {@link TransformerUtils#ifTransformer(Predicate, Transformer)} with {@code predicate}, {@code trueTransformer}.
   * <ul>
   *   <li>Then return transform {@code 42} is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#ifTransformer(Predicate, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.ifTransformer(Predicate, Transformer)"})
  public void testIfTransformerWithPredicateTrueTransformer_thenReturnTransform42Is42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);

    // Act
    Transformer<Object, Object> actualIfTransformerResult = TransformerUtils.ifTransformer(predicate, trueTransformer);
    Object actualTransformResult = actualIfTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualIfTransformerResult instanceof IfTransformer);
    assertTrue(
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getFalseTransformer() instanceof NOPTransformer);
    assertEquals("42", actualTransformResult);
    assertSame(predicate, ((IfTransformer<Object, Object>) actualIfTransformerResult).getPredicate());
    assertSame(trueTransformer, ((IfTransformer<Object, Object>) actualIfTransformerResult).getTrueTransformer());
  }

  /**
   * Test {@link TransformerUtils#ifTransformer(Predicate, Transformer)} with {@code predicate}, {@code trueTransformer}.
   * <ul>
   *   <li>Then return transform {@code 42} is {@code Apply}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#ifTransformer(Predicate, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.ifTransformer(Predicate, Transformer)"})
  public void testIfTransformerWithPredicateTrueTransformer_thenReturnTransform42IsApply() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Transformer<Object, Object> actualIfTransformerResult = TransformerUtils.ifTransformer(predicate, trueTransformer);
    Object actualTransformResult = actualIfTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertTrue(actualIfTransformerResult instanceof IfTransformer);
    assertTrue(
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getFalseTransformer() instanceof NOPTransformer);
    assertEquals("Apply", actualTransformResult);
    assertSame(predicate, ((IfTransformer<Object, Object>) actualIfTransformerResult).getPredicate());
    assertSame(trueTransformer, ((IfTransformer<Object, Object>) actualIfTransformerResult).getTrueTransformer());
  }

  /**
   * Test {@link TransformerUtils#instantiateTransformer(Class[], Object[])} with {@code Class[]}, {@code Object[]}.
   * <ul>
   *   <li>Then return {@link InstantiateTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#instantiateTransformer(Class[], Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.instantiateTransformer(Class[], Object[])"})
  public void testInstantiateTransformerWithClassObject_thenReturnInstantiateTransformer() {
    // Arrange and Act
    Transformer<Class<?>, Object> actualInstantiateTransformerResult = TransformerUtils.instantiateTransformer(null,
        null);
    Class<Object> forNameResult = Object.class;
    actualInstantiateTransformerResult.transform(forNameResult);

    // Assert
    assertTrue(actualInstantiateTransformerResult instanceof InstantiateTransformer);
  }

  /**
   * Test {@link TransformerUtils#instantiateTransformer()}.
   * <ul>
   *   <li>Then return {@link InstantiateTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#instantiateTransformer()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.instantiateTransformer()"})
  public void testInstantiateTransformer_thenReturnInstantiateTransformer() {
    // Arrange and Act
    Transformer<Class<?>, Object> actualInstantiateTransformerResult = TransformerUtils.instantiateTransformer();
    Class<Object> forNameResult = Object.class;
    actualInstantiateTransformerResult.transform(forNameResult);

    // Assert
    assertTrue(actualInstantiateTransformerResult instanceof InstantiateTransformer);
  }

  /**
   * Test {@link TransformerUtils#mapTransformer(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@link MapTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#mapTransformer(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.mapTransformer(Map)"})
  public void testMapTransformer_whenHashMap_thenReturnMapTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualMapTransformerResult = TransformerUtils.mapTransformer(new HashMap<>());

    // Assert
    assertTrue(actualMapTransformerResult instanceof MapTransformer);
    assertNull(actualMapTransformerResult.transform("42"));
    assertTrue(((MapTransformer<Object, Object>) actualMapTransformerResult).getMap().isEmpty());
  }

  /**
   * Test {@link TransformerUtils#mapTransformer(Map)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link ConstantTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#mapTransformer(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.mapTransformer(Map)"})
  public void testMapTransformer_whenNull_thenReturnConstantTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualMapTransformerResult = TransformerUtils.mapTransformer(null);

    // Assert
    assertTrue(actualMapTransformerResult instanceof ConstantTransformer);
    assertNull(actualMapTransformerResult.transform("42"));
    assertNull(((ConstantTransformer<Object, Object>) actualMapTransformerResult).getConstant());
  }

  /**
   * Test {@link TransformerUtils#nopTransformer()}.
   * <p>
   * Method under test: {@link TransformerUtils#nopTransformer()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.nopTransformer()"})
  public void testNopTransformer() {
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
   * <p>
   * Method under test: {@link TransformerUtils#nullTransformer()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.nullTransformer()"})
  public void testNullTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualNullTransformerResult = TransformerUtils.nullTransformer();

    // Assert
    assertTrue(actualNullTransformerResult instanceof ConstantTransformer);
    assertNull(actualNullTransformerResult.transform("42"));
    assertNull(((ConstantTransformer<Object, Object>) actualNullTransformerResult).getConstant());
  }

  /**
   * Test {@link TransformerUtils#stringValueTransformer()}.
   * <p>
   * Method under test: {@link TransformerUtils#stringValueTransformer()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.stringValueTransformer()"})
  public void testStringValueTransformer() {
    // Arrange and Act
    Transformer<Object, String> actualStringValueTransformerResult = TransformerUtils.stringValueTransformer();
    String actualTransformResult = actualStringValueTransformerResult.transform("42");

    // Assert
    assertTrue(actualStringValueTransformerResult instanceof StringValueTransformer);
    assertEquals("42", actualStringValueTransformerResult.apply("42"));
    assertEquals("42", actualTransformResult);
    assertEquals("Input", actualStringValueTransformerResult.transform("Input"));
  }

  /**
   * Test {@link TransformerUtils#switchMapTransformer(Map)}.
   * <ul>
   *   <li>Then DefaultTransformer return {@link ConstantTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#switchMapTransformer(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.switchMapTransformer(Map)"})
  public void testSwitchMapTransformer_thenDefaultTransformerReturnConstantTransformer() {
    // Arrange
    HashMap<Object, Transformer<Object, Object>> objectsAndTransformers = new HashMap<>();
    objectsAndTransformers.put(1, mock(Transformer.class));

    // Act
    Transformer<Object, Object> actualSwitchMapTransformerResult = TransformerUtils
        .switchMapTransformer(objectsAndTransformers);
    actualSwitchMapTransformerResult.transform("42");

    // Assert
    Transformer<? super Object, ?> defaultTransformer = ((SwitchTransformer<Object, Object>) actualSwitchMapTransformerResult)
        .getDefaultTransformer();
    assertTrue(defaultTransformer instanceof ConstantTransformer);
    Predicate<? super Object>[] predicates = ((SwitchTransformer<Object, Object>) actualSwitchMapTransformerResult)
        .getPredicates();
    Predicate<? super Object> predicate = predicates[0];
    assertTrue(predicate instanceof EqualPredicate);
    assertTrue(actualSwitchMapTransformerResult instanceof SwitchTransformer);
    assertNull(((ConstantTransformer<? super Object, ?>) defaultTransformer).getConstant());
    assertEquals(1, ((Integer) ((EqualPredicate<? super Object>) predicate).getValue()).intValue());
    assertEquals(1, predicates.length);
    assertEquals(1, ((SwitchTransformer<Object, Object>) actualSwitchMapTransformerResult).getTransformers().length);
  }

  /**
   * Test {@link TransformerUtils#switchMapTransformer(Map)}.
   * <ul>
   *   <li>Then return first element Value is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#switchMapTransformer(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.switchMapTransformer(Map)"})
  public void testSwitchMapTransformer_thenReturnFirstElementValueIs42() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    HashMap<Object, Transformer<Object, Object>> objectsAndTransformers = new HashMap<>();
    objectsAndTransformers.put("42", transformer);

    // Act
    Transformer<Object, Object> actualSwitchMapTransformerResult = TransformerUtils
        .switchMapTransformer(objectsAndTransformers);
    Object actualTransformResult = actualSwitchMapTransformerResult.transform("42");

    // Assert
    verify(transformer).apply(isA(Object.class));
    Predicate<? super Object>[] predicates = ((SwitchTransformer<Object, Object>) actualSwitchMapTransformerResult)
        .getPredicates();
    Predicate<? super Object> predicate = predicates[0];
    assertTrue(predicate instanceof EqualPredicate);
    assertTrue(actualSwitchMapTransformerResult instanceof SwitchTransformer);
    assertEquals("42", ((EqualPredicate<? super Object>) predicate).getValue());
    assertEquals("Apply", actualTransformResult);
    assertEquals(1, predicates.length);
  }

  /**
   * Test {@link TransformerUtils#switchMapTransformer(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@link ConstantTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#switchMapTransformer(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.switchMapTransformer(Map)"})
  public void testSwitchMapTransformer_whenHashMap_thenReturnConstantTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualSwitchMapTransformerResult = TransformerUtils
        .switchMapTransformer(new HashMap<>());

    // Assert
    assertTrue(actualSwitchMapTransformerResult instanceof ConstantTransformer);
    assertNull(actualSwitchMapTransformerResult.transform("42"));
    assertNull(((ConstantTransformer<Object, Object>) actualSwitchMapTransformerResult).getConstant());
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Predicate, Transformer, Transformer)} with {@code predicate}, {@code trueTransformer}, {@code falseTransformer}.
   * <ul>
   *   <li>Given {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#switchTransformer(Predicate, Transformer, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.switchTransformer(Predicate, Transformer, Transformer)"})
  public void testSwitchTransformerWithPredicateTrueTransformerFalseTransformer_givenFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult = TransformerUtils.switchTransformer(predicate,
        trueTransformer, falseTransformer);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertEquals("Apply", actualTransformResult);
    Predicate<? super Object>[] predicates = ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    Transformer<? super Object, ?>[] transformers = ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult)
        .getTransformers();
    assertEquals(1, transformers.length);
    assertSame(predicate, predicates[0]);
    assertSame(falseTransformer,
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getDefaultTransformer());
    assertSame(trueTransformer, transformers[0]);
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Predicate, Transformer, Transformer)} with {@code predicate}, {@code trueTransformer}, {@code falseTransformer}.
   * <ul>
   *   <li>Given {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#switchTransformer(Predicate, Transformer, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.switchTransformer(Predicate, Transformer, Transformer)"})
  public void testSwitchTransformerWithPredicateTrueTransformerFalseTransformer_givenTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> falseTransformer = mock(Transformer.class);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult = TransformerUtils.switchTransformer(predicate,
        trueTransformer, falseTransformer);
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertEquals("Apply", actualTransformResult);
    Predicate<? super Object>[] predicates = ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    Transformer<? super Object, ?>[] transformers = ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult)
        .getTransformers();
    assertEquals(1, transformers.length);
    assertSame(predicate, predicates[0]);
    assertSame(falseTransformer,
        ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getDefaultTransformer());
    assertSame(trueTransformer, transformers[0]);
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Predicate[], Transformer[], Transformer)} with {@code predicates}, {@code transformers}, {@code defaultTransformer}.
   * <ul>
   *   <li>Given {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#switchTransformer(Predicate[], Transformer[], Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.switchTransformer(Predicate[], Transformer[], Transformer)"})
  public void testSwitchTransformerWithPredicatesTransformersDefaultTransformer_givenFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult = TransformerUtils
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
   * Test {@link TransformerUtils#switchTransformer(Predicate[], Transformer[], Transformer)} with {@code predicates}, {@code transformers}, {@code defaultTransformer}.
   * <ul>
   *   <li>Given {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#switchTransformer(Predicate[], Transformer[], Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.switchTransformer(Predicate[], Transformer[], Transformer)"})
  public void testSwitchTransformerWithPredicatesTransformersDefaultTransformer_givenTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> defaultTransformer = mock(Transformer.class);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult = TransformerUtils
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
   * Test {@link TransformerUtils#switchTransformer(Predicate[], Transformer[])} with {@code predicates}, {@code transformers}.
   * <ul>
   *   <li>Given {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#switchTransformer(Predicate[], Transformer[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.switchTransformer(Predicate[], Transformer[])"})
  public void testSwitchTransformerWithPredicatesTransformers_givenFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult = TransformerUtils
        .switchTransformer(new Predicate[]{predicate}, new Transformer[]{mock(Transformer.class)});
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    Transformer<? super Object, ?> defaultTransformer = ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult)
        .getDefaultTransformer();
    assertTrue(defaultTransformer instanceof ConstantTransformer);
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertNull(actualTransformResult);
    assertNull(((ConstantTransformer<? super Object, ?>) defaultTransformer).getConstant());
    assertEquals(1, ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates().length);
    assertEquals(1, ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getTransformers().length);
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Predicate[], Transformer[])} with {@code predicates}, {@code transformers}.
   * <ul>
   *   <li>Then return {@link ConstantTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#switchTransformer(Predicate[], Transformer[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.switchTransformer(Predicate[], Transformer[])"})
  public void testSwitchTransformerWithPredicatesTransformers_thenReturnConstantTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualSwitchTransformerResult = TransformerUtils.switchTransformer(new Predicate[]{},
        new Transformer[]{});

    // Assert
    assertTrue(actualSwitchTransformerResult instanceof ConstantTransformer);
    assertNull(actualSwitchTransformerResult.transform("42"));
    assertNull(((ConstantTransformer<Object, Object>) actualSwitchTransformerResult).getConstant());
  }

  /**
   * Test {@link TransformerUtils#switchTransformer(Predicate[], Transformer[])} with {@code predicates}, {@code transformers}.
   * <ul>
   *   <li>Then return transform {@code 42} is {@code Apply}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerUtils#switchTransformer(Predicate[], Transformer[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer TransformerUtils.switchTransformer(Predicate[], Transformer[])"})
  public void testSwitchTransformerWithPredicatesTransformers_thenReturnTransform42IsApply() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Transformer<Object, Object> actualSwitchTransformerResult = TransformerUtils
        .switchTransformer(new Predicate[]{predicate}, new Transformer[]{transformer});
    Object actualTransformResult = actualSwitchTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    Transformer<? super Object, ?> defaultTransformer = ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult)
        .getDefaultTransformer();
    assertTrue(defaultTransformer instanceof ConstantTransformer);
    assertTrue(actualSwitchTransformerResult instanceof SwitchTransformer);
    assertEquals("Apply", actualTransformResult);
    assertNull(((ConstantTransformer<? super Object, ?>) defaultTransformer).getConstant());
    assertEquals(1, ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getPredicates().length);
    assertEquals(1, ((SwitchTransformer<Object, Object>) actualSwitchTransformerResult).getTransformers().length);
  }
}
