package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class InvokerTransformerDiffblueTest {
  /**
   * Test {@link InvokerTransformer#invokerTransformer(String, Class[], Object[])} with {@code methodName}, {@code paramTypes}, {@code args}.
   * <ul>
   *   <li>Then return {@link InvokerTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InvokerTransformer#invokerTransformer(String, Class[], Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer InvokerTransformer.invokerTransformer(String, Class[], Object[])"})
  public void testInvokerTransformerWithMethodNameParamTypesArgs_thenReturnInvokerTransformer() {
    // Arrange
    Class<Object> forNameResult = Object.class;

    // Act
    Transformer<Object, Object> actualInvokerTransformerResult = InvokerTransformer.invokerTransformer("Method Name",
        new Class[]{forNameResult}, new Object[]{"Args"});

    // Assert
    assertTrue(actualInvokerTransformerResult instanceof InvokerTransformer);
    assertNull(actualInvokerTransformerResult.transform(null));
  }

  /**
   * Test {@link InvokerTransformer#invokerTransformer(String, Class[], Object[])} with {@code methodName}, {@code paramTypes}, {@code args}.
   * <ul>
   *   <li>Then throw {@link FunctorException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InvokerTransformer#invokerTransformer(String, Class[], Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer InvokerTransformer.invokerTransformer(String, Class[], Object[])"})
  public void testInvokerTransformerWithMethodNameParamTypesArgs_thenThrowFunctorException() {
    // Arrange
    Class<Object> forNameResult = Object.class;

    // Act
    Transformer<Object, Object> actualInvokerTransformerResult = InvokerTransformer.invokerTransformer("Method Name",
        new Class[]{forNameResult}, new Object[]{"Args"});

    // Assert
    assertThrows(FunctorException.class, () -> actualInvokerTransformerResult.transform("42"));
  }

  /**
   * Test {@link InvokerTransformer#invokerTransformer(String)} with {@code methodName}.
   * <ul>
   *   <li>Then return {@link InvokerTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InvokerTransformer#invokerTransformer(String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer InvokerTransformer.invokerTransformer(String)"})
  public void testInvokerTransformerWithMethodName_thenReturnInvokerTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualInvokerTransformerResult = InvokerTransformer.invokerTransformer("Method Name");

    // Assert
    assertTrue(actualInvokerTransformerResult instanceof InvokerTransformer);
    assertNull(actualInvokerTransformerResult.transform(null));
  }

  /**
   * Test {@link InvokerTransformer#invokerTransformer(String)} with {@code methodName}.
   * <ul>
   *   <li>Then throw {@link FunctorException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InvokerTransformer#invokerTransformer(String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer InvokerTransformer.invokerTransformer(String)"})
  public void testInvokerTransformerWithMethodName_thenThrowFunctorException() {
    // Arrange and Act
    Transformer<Object, Object> actualInvokerTransformerResult = InvokerTransformer.invokerTransformer("Method Name");

    // Assert
    assertThrows(FunctorException.class, () -> actualInvokerTransformerResult.transform("42"));
  }

  /**
   * Test {@link InvokerTransformer#InvokerTransformer(String, Class[], Object[])}.
   * <ul>
   *   <li>When {@code Method Name}.</li>
   *   <li>Then return transform {@code null} is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InvokerTransformer#InvokerTransformer(String, Class[], Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void InvokerTransformer.<init>(String, Class[], Object[])"})
  public void testNewInvokerTransformer_whenMethodName_thenReturnTransformNullIsNull() {
    // Arrange
    Class<Object> forNameResult = Object.class;

    // Act
    InvokerTransformer<Object, Object> actualInvokerTransformer = new InvokerTransformer<>("Method Name",
        new Class[]{forNameResult}, new Object[]{"Args"});

    // Assert
    assertNull(actualInvokerTransformer.transform(null));
  }

  /**
   * Test {@link InvokerTransformer#transform(Object)}.
   * <ul>
   *   <li>Then throw {@link FunctorException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InvokerTransformer#transform(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object InvokerTransformer.transform(Object)"})
  public void testTransform_thenThrowFunctorException() {
    // Arrange
    Class<Object> forNameResult = Object.class;
    InvokerTransformer<Object, Object> invokerTransformer = new InvokerTransformer<>("Method Name",
        new Class[]{forNameResult}, new Object[]{"Args"});

    // Act and Assert
    assertThrows(FunctorException.class, () -> invokerTransformer.transform("Input"));
  }

  /**
   * Test {@link InvokerTransformer#transform(Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InvokerTransformer#transform(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object InvokerTransformer.transform(Object)"})
  public void testTransform_whenNull_thenReturnNull() {
    // Arrange
    Class<Object> forNameResult = Object.class;
    InvokerTransformer<Object, Object> invokerTransformer = new InvokerTransformer<>("Method Name",
        new Class[]{forNameResult}, new Object[]{"Args"});

    // Act and Assert
    assertNull(invokerTransformer.transform(null));
  }
}
