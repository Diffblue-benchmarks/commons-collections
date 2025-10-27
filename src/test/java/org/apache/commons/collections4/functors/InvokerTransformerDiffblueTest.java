package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;

public class InvokerTransformerDiffblueTest {
  /**
   * Method under test: {@link InvokerTransformer#invokerTransformer(String)}
   */
  @Test
  public void testInvokerTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualInvokerTransformerResult = InvokerTransformer.invokerTransformer("Method Name");

    // Assert
    assertThrows(FunctorException.class, () -> actualInvokerTransformerResult.transform("42"));
  }

  /**
   * Method under test: {@link InvokerTransformer#invokerTransformer(String)}
   */
  @Test
  public void testInvokerTransformer2() {
    // Arrange and Act
    Transformer<Object, Object> actualInvokerTransformerResult = InvokerTransformer.invokerTransformer("Method Name");

    // Assert
    assertTrue(actualInvokerTransformerResult instanceof InvokerTransformer);
    assertNull(actualInvokerTransformerResult.transform(null));
  }

  /**
   * Method under test:
   * {@link InvokerTransformer#invokerTransformer(String, Class[], Object[])}
   */
  @Test
  public void testInvokerTransformer3() {
    // Arrange
    Class<Object> forNameResult = Object.class;

    // Act
    Transformer<Object, Object> actualInvokerTransformerResult = InvokerTransformer.invokerTransformer("Method Name",
        new Class[]{forNameResult}, new Object[]{"Args"});

    // Assert
    assertThrows(FunctorException.class, () -> actualInvokerTransformerResult.transform("42"));
  }

  /**
   * Method under test:
   * {@link InvokerTransformer#invokerTransformer(String, Class[], Object[])}
   */
  @Test
  public void testInvokerTransformer4() {
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
   * Method under test:
   * {@link InvokerTransformer#InvokerTransformer(String, Class[], Object[])}
   */
  @Test
  public void testNewInvokerTransformer() {
    // Arrange
    Class<Object> forNameResult = Object.class;

    // Act
    InvokerTransformer<Object, Object> actualInvokerTransformer = new InvokerTransformer<>("Method Name",
        new Class[]{forNameResult}, new Object[]{"Args"});

    // Assert
    assertNull(actualInvokerTransformer.transform(null));
  }

  /**
   * Method under test: {@link InvokerTransformer#transform(Object)}
   */
  @Test
  public void testTransform() {
    // Arrange
    Class<Object> forNameResult = Object.class;
    InvokerTransformer<Object, Object> invokerTransformer = new InvokerTransformer<>("Method Name",
        new Class[]{forNameResult}, new Object[]{"Args"});

    // Act and Assert
    assertThrows(FunctorException.class, () -> invokerTransformer.transform("Input"));
  }

  /**
   * Method under test: {@link InvokerTransformer#transform(Object)}
   */
  @Test
  public void testTransform2() {
    // Arrange
    Class<Object> forNameResult = Object.class;
    InvokerTransformer<Object, Object> invokerTransformer = new InvokerTransformer<>("Method Name",
        new Class[]{forNameResult}, new Object[]{"Args"});

    // Act and Assert
    assertNull(invokerTransformer.transform(null));
  }
}
