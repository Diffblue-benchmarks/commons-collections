package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class InstantiateTransformerDiffblueTest {
  /**
   * Test {@link InstantiateTransformer#instantiateTransformer(Class[], Object[])} with {@code Class[]}, {@code Object[]}.
   * <ul>
   *   <li>Then return {@link InstantiateTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InstantiateTransformer#instantiateTransformer(Class[], Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer InstantiateTransformer.instantiateTransformer(Class[], Object[])"})
  public void testInstantiateTransformerWithClassObject_thenReturnInstantiateTransformer() {
    // Arrange and Act
    Transformer<Class<?>, Object> actualInstantiateTransformerResult = InstantiateTransformer
        .instantiateTransformer(null, null);
    Class<Object> forNameResult = Object.class;
    actualInstantiateTransformerResult.transform(forNameResult);

    // Assert
    assertTrue(actualInstantiateTransformerResult instanceof InstantiateTransformer);
  }

  /**
   * Test {@link InstantiateTransformer#instantiateTransformer(Class[], Object[])} with {@code Class[]}, {@code Object[]}.
   * <ul>
   *   <li>Then throw {@link FunctorException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InstantiateTransformer#instantiateTransformer(Class[], Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer InstantiateTransformer.instantiateTransformer(Class[], Object[])"})
  public void testInstantiateTransformerWithClassObject_thenThrowFunctorException() {
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
   * Test {@link InstantiateTransformer#instantiateTransformer(Class[], Object[])} with {@code Class[]}, {@code Object[]}.
   * <ul>
   *   <li>Then throw {@link FunctorException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InstantiateTransformer#instantiateTransformer(Class[], Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer InstantiateTransformer.instantiateTransformer(Class[], Object[])"})
  public void testInstantiateTransformerWithClassObject_thenThrowFunctorException2() {
    // Arrange
    Class<Object> forNameResult = Object.class;

    // Act
    Transformer<Class<?>, Object> actualInstantiateTransformerResult = InstantiateTransformer
        .instantiateTransformer(new Class[]{forNameResult}, new Object[]{"Args"});

    // Assert
    assertThrows(FunctorException.class, () -> actualInstantiateTransformerResult.transform(null));
  }

  /**
   * Test {@link InstantiateTransformer#instantiateTransformer()}.
   * <ul>
   *   <li>Then return {@link InstantiateTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InstantiateTransformer#instantiateTransformer()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer InstantiateTransformer.instantiateTransformer()"})
  public void testInstantiateTransformer_thenReturnInstantiateTransformer() {
    // Arrange and Act
    Transformer<Class<?>, Object> actualInstantiateTransformerResult = InstantiateTransformer.instantiateTransformer();
    Class<Object> forNameResult = Object.class;
    actualInstantiateTransformerResult.transform(forNameResult);

    // Assert
    assertTrue(actualInstantiateTransformerResult instanceof InstantiateTransformer);
  }

  /**
   * Test {@link InstantiateTransformer#instantiateTransformer()}.
   * <ul>
   *   <li>Then throw {@link FunctorException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InstantiateTransformer#instantiateTransformer()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer InstantiateTransformer.instantiateTransformer()"})
  public void testInstantiateTransformer_thenThrowFunctorException() {
    // Arrange and Act
    Transformer<Class<?>, Object> actualInstantiateTransformerResult = InstantiateTransformer.instantiateTransformer();

    // Assert
    assertThrows(FunctorException.class, () -> actualInstantiateTransformerResult.transform(null));
  }

  /**
   * Test {@link InstantiateTransformer#transform(Class)} with {@code Class}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>Then throw {@link FunctorException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InstantiateTransformer#transform(Class)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object InstantiateTransformer.transform(Class)"})
  public void testTransformWithClass_givenJavaLangObject_thenThrowFunctorException() {
    // Arrange
    Class<Object> forNameResult = Object.class;
    InstantiateTransformer<Object> instantiateTransformer = new InstantiateTransformer<>(new Class[]{forNameResult},
        new Object[]{"Args"});
    Class<Object> input = Object.class;

    // Act and Assert
    assertThrows(FunctorException.class, () -> instantiateTransformer.transform(input));
  }

  /**
   * Test {@link InstantiateTransformer#transform(Class)} with {@code Class}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link FunctorException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InstantiateTransformer#transform(Class)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object InstantiateTransformer.transform(Class)"})
  public void testTransformWithClass_givenJavaLangObject_whenNull_thenThrowFunctorException() {
    // Arrange
    Class<Object> forNameResult = Object.class;
    InstantiateTransformer<Object> instantiateTransformer = new InstantiateTransformer<>(new Class[]{forNameResult},
        new Object[]{"Args"});

    // Act and Assert
    assertThrows(FunctorException.class, () -> instantiateTransformer.transform(null));
  }
}
