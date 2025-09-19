package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class InstantiateTransformerDiffblueTest {
  /**
   * Test {@link InstantiateTransformer#instantiateTransformer(Class[], Object[])} with {@code
   * Class[]}, {@code Object[]}.
   *
   * <ul>
   *   <li>Then return {@link InstantiateTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link InstantiateTransformer#instantiateTransformer(Class[], Object[])}
   */
  @Test
  @DisplayName(
      "Test instantiateTransformer(Class[], Object[]) with 'Class[]', 'Object[]'; then return InstantiateTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer InstantiateTransformer.instantiateTransformer(Class[], Object[])"
  })
  void testInstantiateTransformerWithClassObject_thenReturnInstantiateTransformer() {
    // Arrange and Act
    Transformer<Class<?>, Object> actualInstantiateTransformerResult =
        InstantiateTransformer.instantiateTransformer(null, null);
    Class<Object> forNameResult = Object.class;
    actualInstantiateTransformerResult.transform(forNameResult);

    // Assert
    assertTrue(actualInstantiateTransformerResult instanceof InstantiateTransformer);
  }

  /**
   * Test {@link InstantiateTransformer#instantiateTransformer(Class[], Object[])} with {@code
   * Class[]}, {@code Object[]}.
   *
   * <ul>
   *   <li>Then throw {@link FunctorException}.
   * </ul>
   *
   * <p>Method under test: {@link InstantiateTransformer#instantiateTransformer(Class[], Object[])}
   */
  @Test
  @DisplayName(
      "Test instantiateTransformer(Class[], Object[]) with 'Class[]', 'Object[]'; then throw FunctorException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer InstantiateTransformer.instantiateTransformer(Class[], Object[])"
  })
  void testInstantiateTransformerWithClassObject_thenThrowFunctorException() {
    // Arrange
    Class<Object> forNameResult = Object.class;

    // Act
    Transformer<Class<?>, Object> actualInstantiateTransformerResult =
        InstantiateTransformer.instantiateTransformer(
            new Class[] {forNameResult}, new Object[] {"Args"});
    Class<Object> forNameResult2 = Object.class;

    // Assert
    assertThrows(
        FunctorException.class, () -> actualInstantiateTransformerResult.transform(forNameResult2));
  }

  /**
   * Test {@link InstantiateTransformer#instantiateTransformer(Class[], Object[])} with {@code
   * Class[]}, {@code Object[]}.
   *
   * <ul>
   *   <li>Then throw {@link FunctorException}.
   * </ul>
   *
   * <p>Method under test: {@link InstantiateTransformer#instantiateTransformer(Class[], Object[])}
   */
  @Test
  @DisplayName(
      "Test instantiateTransformer(Class[], Object[]) with 'Class[]', 'Object[]'; then throw FunctorException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer InstantiateTransformer.instantiateTransformer(Class[], Object[])"
  })
  void testInstantiateTransformerWithClassObject_thenThrowFunctorException2() {
    // Arrange
    Class<Object> forNameResult = Object.class;

    // Act
    Transformer<Class<?>, Object> actualInstantiateTransformerResult =
        InstantiateTransformer.instantiateTransformer(
            new Class[] {forNameResult}, new Object[] {"Args"});

    // Assert
    assertThrows(FunctorException.class, () -> actualInstantiateTransformerResult.transform(null));
  }

  /**
   * Test {@link InstantiateTransformer#instantiateTransformer(Class[], Object[])} with {@code
   * Class[]}, {@code Object[]}.
   *
   * <ul>
   *   <li>When empty array of {@link Object}.
   * </ul>
   *
   * <p>Method under test: {@link InstantiateTransformer#instantiateTransformer(Class[], Object[])}
   */
  @Test
  @DisplayName(
      "Test instantiateTransformer(Class[], Object[]) with 'Class[]', 'Object[]'; when empty array of Object")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer InstantiateTransformer.instantiateTransformer(Class[], Object[])"
  })
  void testInstantiateTransformerWithClassObject_whenEmptyArrayOfObject() {
    // Arrange and Act
    Transformer<Class<?>, Object> actualInstantiateTransformerResult =
        InstantiateTransformer.instantiateTransformer(new Class[] {}, new Object[] {});
    Class<Object> forNameResult = Object.class;
    actualInstantiateTransformerResult.transform(forNameResult);

    // Assert
    assertTrue(actualInstantiateTransformerResult instanceof InstantiateTransformer);
  }

  /**
   * Test {@link InstantiateTransformer#instantiateTransformer()}.
   *
   * <ul>
   *   <li>Then return {@link InstantiateTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link InstantiateTransformer#instantiateTransformer()}
   */
  @Test
  @DisplayName("Test instantiateTransformer(); then return InstantiateTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer InstantiateTransformer.instantiateTransformer()"})
  void testInstantiateTransformer_thenReturnInstantiateTransformer() {
    // Arrange and Act
    Transformer<Class<?>, Object> actualInstantiateTransformerResult =
        InstantiateTransformer.instantiateTransformer();
    Class<Object> forNameResult = Object.class;
    actualInstantiateTransformerResult.transform(forNameResult);

    // Assert
    assertTrue(actualInstantiateTransformerResult instanceof InstantiateTransformer);
  }

  /**
   * Test {@link InstantiateTransformer#instantiateTransformer()}.
   *
   * <ul>
   *   <li>Then throw {@link FunctorException}.
   * </ul>
   *
   * <p>Method under test: {@link InstantiateTransformer#instantiateTransformer()}
   */
  @Test
  @DisplayName("Test instantiateTransformer(); then throw FunctorException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer InstantiateTransformer.instantiateTransformer()"})
  void testInstantiateTransformer_thenThrowFunctorException() {
    // Arrange and Act
    Transformer<Class<?>, Object> actualInstantiateTransformerResult =
        InstantiateTransformer.instantiateTransformer();

    // Assert
    assertThrows(FunctorException.class, () -> actualInstantiateTransformerResult.transform(null));
  }

  /**
   * Test {@link InstantiateTransformer#transform(Class)} with {@code Class}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then throw {@link FunctorException}.
   * </ul>
   *
   * <p>Method under test: {@link InstantiateTransformer#transform(Class)}
   */
  @Test
  @DisplayName(
      "Test transform(Class) with 'Class'; given 'java.lang.Object'; then throw FunctorException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object InstantiateTransformer.transform(Class)"})
  void testTransformWithClass_givenJavaLangObject_thenThrowFunctorException() {
    // Arrange
    Class<Object> forNameResult = Object.class;
    Class<?>[] paramTypes = new Class[] {forNameResult};
    Object[] args = new Object[] {"Args"};

    InstantiateTransformer<Object> instantiateTransformer =
        new InstantiateTransformer<>(paramTypes, args);
    Class<Object> input = Object.class;

    // Act and Assert
    assertThrows(FunctorException.class, () -> instantiateTransformer.transform(input));
  }

  /**
   * Test {@link InstantiateTransformer#transform(Class)} with {@code Class}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@code null}.
   *   <li>Then throw {@link FunctorException}.
   * </ul>
   *
   * <p>Method under test: {@link InstantiateTransformer#transform(Class)}
   */
  @Test
  @DisplayName(
      "Test transform(Class) with 'Class'; given 'java.lang.Object'; when 'null'; then throw FunctorException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object InstantiateTransformer.transform(Class)"})
  void testTransformWithClass_givenJavaLangObject_whenNull_thenThrowFunctorException() {
    // Arrange
    Class<Object> forNameResult = Object.class;
    Class<?>[] paramTypes = new Class[] {forNameResult};
    Object[] args = new Object[] {"Args"};

    InstantiateTransformer<Object> instantiateTransformer =
        new InstantiateTransformer<>(paramTypes, args);

    // Act and Assert
    assertThrows(FunctorException.class, () -> instantiateTransformer.transform(null));
  }
}
