package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;

public class InstantiateTransformerDiffblueTest {
  /**
   * Method under test: {@link InstantiateTransformer#instantiateTransformer()}
   */
  @Test
  public void testInstantiateTransformer() {
    // Arrange and Act
    Transformer<Class<?>, Object> actualInstantiateTransformerResult = InstantiateTransformer.instantiateTransformer();
    Class<Object> forNameResult = Object.class;
    actualInstantiateTransformerResult.transform(forNameResult);

    // Assert
    assertTrue(actualInstantiateTransformerResult instanceof InstantiateTransformer);
  }

  /**
   * Method under test: {@link InstantiateTransformer#instantiateTransformer()}
   */
  @Test
  public void testInstantiateTransformer2() {
    // Arrange and Act
    Transformer<Class<?>, Object> actualInstantiateTransformerResult = InstantiateTransformer.instantiateTransformer();

    // Assert
    assertThrows(FunctorException.class, () -> actualInstantiateTransformerResult.transform(null));
  }

  /**
   * Method under test:
   * {@link InstantiateTransformer#instantiateTransformer(Class[], Object[])}
   */
  @Test
  public void testInstantiateTransformer3() {
    // Arrange
    Class<Object> forNameResult = Object.class;

    // Act
    Transformer<Class<?>, Object> actualInstantiateTransformerResult = InstantiateTransformer
        .instantiateTransformer(new Class[]{forNameResult}, new Object[]{"Args"});
    Class<Object> forNameResult2 = Object.class;

    // Assert
    assertThrows(FunctorException.class, () -> actualInstantiateTransformerResult.transform(forNameResult2));
  }

  /**
   * Method under test:
   * {@link InstantiateTransformer#instantiateTransformer(Class[], Object[])}
   */
  @Test
  public void testInstantiateTransformer4() {
    // Arrange and Act
    Transformer<Class<?>, Object> actualInstantiateTransformerResult = InstantiateTransformer
        .instantiateTransformer(null, null);
    Class<Object> forNameResult = Object.class;
    actualInstantiateTransformerResult.transform(forNameResult);

    // Assert
    assertTrue(actualInstantiateTransformerResult instanceof InstantiateTransformer);
  }

  /**
   * Method under test:
   * {@link InstantiateTransformer#instantiateTransformer(Class[], Object[])}
   */
  @Test
  public void testInstantiateTransformer5() {
    // Arrange
    Class<Object> forNameResult = Object.class;

    // Act
    Transformer<Class<?>, Object> actualInstantiateTransformerResult = InstantiateTransformer
        .instantiateTransformer(new Class[]{forNameResult}, new Object[]{"Args"});

    // Assert
    assertThrows(FunctorException.class, () -> actualInstantiateTransformerResult.transform(null));
  }

  /**
   * Method under test: {@link InstantiateTransformer#transform(Class)}
   */
  @Test
  public void testTransform() {
    // Arrange
    Class<Object> forNameResult = Object.class;
    InstantiateTransformer<Object> instantiateTransformer = new InstantiateTransformer<>(new Class[]{forNameResult},
        new Object[]{"Args"});
    Class<Object> input = Object.class;

    // Act and Assert
    assertThrows(FunctorException.class, () -> instantiateTransformer.transform(input));
  }

  /**
   * Method under test: {@link InstantiateTransformer#transform(Class)}
   */
  @Test
  public void testTransform2() {
    // Arrange
    Class<Object> forNameResult = Object.class;
    InstantiateTransformer<Object> instantiateTransformer = new InstantiateTransformer<>(new Class[]{forNameResult},
        new Object[]{"Args"});

    // Act and Assert
    assertThrows(FunctorException.class, () -> instantiateTransformer.transform(null));
  }
}
