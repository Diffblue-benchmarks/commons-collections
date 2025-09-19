package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class InvokerTransformerDiffblueTest {
  /**
   * Test {@link InvokerTransformer#invokerTransformer(String, Class[], Object[])} with {@code
   * methodName}, {@code paramTypes}, {@code args}.
   *
   * <ul>
   *   <li>Then return {@link InvokerTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link InvokerTransformer#invokerTransformer(String, Class[], Object[])}
   */
  @Test
  @DisplayName(
      "Test invokerTransformer(String, Class[], Object[]) with 'methodName', 'paramTypes', 'args'; then return InvokerTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer InvokerTransformer.invokerTransformer(String, Class[], Object[])"
  })
  void testInvokerTransformerWithMethodNameParamTypesArgs_thenReturnInvokerTransformer() {
    // Arrange
    Class<Object> forNameResult = Object.class;

    // Act
    Transformer<Object, Object> actualInvokerTransformerResult =
        InvokerTransformer.invokerTransformer(
            "Method Name", new Class[] {forNameResult}, new Object[] {"Args"});
    Object actualTransformResult = actualInvokerTransformerResult.transform(null);

    // Assert
    assertTrue(actualInvokerTransformerResult instanceof InvokerTransformer);
    assertNull(actualTransformResult);
  }

  /**
   * Test {@link InvokerTransformer#invokerTransformer(String, Class[], Object[])} with {@code
   * methodName}, {@code paramTypes}, {@code args}.
   *
   * <ul>
   *   <li>Then throw {@link FunctorException}.
   * </ul>
   *
   * <p>Method under test: {@link InvokerTransformer#invokerTransformer(String, Class[], Object[])}
   */
  @Test
  @DisplayName(
      "Test invokerTransformer(String, Class[], Object[]) with 'methodName', 'paramTypes', 'args'; then throw FunctorException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer InvokerTransformer.invokerTransformer(String, Class[], Object[])"
  })
  void testInvokerTransformerWithMethodNameParamTypesArgs_thenThrowFunctorException() {
    // Arrange
    Class<Object> forNameResult = Object.class;

    // Act
    Transformer<Object, Object> actualInvokerTransformerResult =
        InvokerTransformer.invokerTransformer(
            "Method Name", new Class[] {forNameResult}, new Object[] {"Args"});

    // Assert
    assertThrows(FunctorException.class, () -> actualInvokerTransformerResult.transform("42"));
  }

  /**
   * Test {@link InvokerTransformer#invokerTransformer(String, Class[], Object[])} with {@code
   * methodName}, {@code paramTypes}, {@code args}.
   *
   * <ul>
   *   <li>Then throw {@link FunctorException}.
   * </ul>
   *
   * <p>Method under test: {@link InvokerTransformer#invokerTransformer(String, Class[], Object[])}
   */
  @Test
  @DisplayName(
      "Test invokerTransformer(String, Class[], Object[]) with 'methodName', 'paramTypes', 'args'; then throw FunctorException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer InvokerTransformer.invokerTransformer(String, Class[], Object[])"
  })
  void testInvokerTransformerWithMethodNameParamTypesArgs_thenThrowFunctorException2() {
    // Arrange and Act
    Transformer<Object, Object> actualInvokerTransformerResult =
        InvokerTransformer.invokerTransformer("Method Name", null, null);

    // Assert
    assertThrows(FunctorException.class, () -> actualInvokerTransformerResult.transform("42"));
  }

  /**
   * Test {@link InvokerTransformer#invokerTransformer(String, Class[], Object[])} with {@code
   * methodName}, {@code paramTypes}, {@code args}.
   *
   * <ul>
   *   <li>When empty array of {@link Object}.
   * </ul>
   *
   * <p>Method under test: {@link InvokerTransformer#invokerTransformer(String, Class[], Object[])}
   */
  @Test
  @DisplayName(
      "Test invokerTransformer(String, Class[], Object[]) with 'methodName', 'paramTypes', 'args'; when empty array of Object")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Transformer InvokerTransformer.invokerTransformer(String, Class[], Object[])"
  })
  void testInvokerTransformerWithMethodNameParamTypesArgs_whenEmptyArrayOfObject() {
    // Arrange and Act
    Transformer<Object, Object> actualInvokerTransformerResult =
        InvokerTransformer.invokerTransformer("Method Name", new Class[] {}, new Object[] {});

    // Assert
    assertThrows(FunctorException.class, () -> actualInvokerTransformerResult.transform("42"));
  }

  /**
   * Test {@link InvokerTransformer#invokerTransformer(String)} with {@code methodName}.
   *
   * <ul>
   *   <li>When {@code Method Name}.
   *   <li>Then return {@link InvokerTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link InvokerTransformer#invokerTransformer(String)}
   */
  @Test
  @DisplayName(
      "Test invokerTransformer(String) with 'methodName'; when 'Method Name'; then return InvokerTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer InvokerTransformer.invokerTransformer(String)"})
  void testInvokerTransformerWithMethodName_whenMethodName_thenReturnInvokerTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualInvokerTransformerResult =
        InvokerTransformer.invokerTransformer("Method Name");
    Object actualTransformResult = actualInvokerTransformerResult.transform(null);

    // Assert
    assertTrue(actualInvokerTransformerResult instanceof InvokerTransformer);
    assertNull(actualTransformResult);
  }

  /**
   * Test {@link InvokerTransformer#invokerTransformer(String)} with {@code methodName}.
   *
   * <ul>
   *   <li>When {@code Method Name}.
   *   <li>Then throw {@link FunctorException}.
   * </ul>
   *
   * <p>Method under test: {@link InvokerTransformer#invokerTransformer(String)}
   */
  @Test
  @DisplayName(
      "Test invokerTransformer(String) with 'methodName'; when 'Method Name'; then throw FunctorException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer InvokerTransformer.invokerTransformer(String)"})
  void testInvokerTransformerWithMethodName_whenMethodName_thenThrowFunctorException() {
    // Arrange and Act
    Transformer<Object, Object> actualInvokerTransformerResult =
        InvokerTransformer.invokerTransformer("Method Name");

    // Assert
    assertThrows(FunctorException.class, () -> actualInvokerTransformerResult.transform("42"));
  }

  /**
   * Test {@link InvokerTransformer#InvokerTransformer(String, Class[], Object[])}.
   *
   * <ul>
   *   <li>When {@code Method Name}.
   *   <li>Then return transform {@code null} is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link InvokerTransformer#InvokerTransformer(String, Class[], Object[])}
   */
  @Test
  @DisplayName(
      "Test new InvokerTransformer(String, Class[], Object[]); when 'Method Name'; then return transform 'null' is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InvokerTransformer.<init>(String, Class[], Object[])"})
  void testNewInvokerTransformer_whenMethodName_thenReturnTransformNullIsNull() {
    // Arrange
    Class<Object> forNameResult = Object.class;
    Class<?>[] paramTypes = new Class[] {forNameResult};
    Object[] args = new Object[] {"Args"};

    // Act
    InvokerTransformer<Object, Object> actualInvokerTransformer =
        new InvokerTransformer<>("Method Name", paramTypes, args);

    // Assert
    assertNull(actualInvokerTransformer.transform(null));
  }

  /**
   * Test {@link InvokerTransformer#transform(Object)}.
   *
   * <ul>
   *   <li>Then throw {@link FunctorException}.
   * </ul>
   *
   * <p>Method under test: {@link InvokerTransformer#transform(Object)}
   */
  @Test
  @DisplayName("Test transform(Object); then throw FunctorException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object InvokerTransformer.transform(Object)"})
  void testTransform_thenThrowFunctorException() {
    // Arrange
    Class<Object> forNameResult = Object.class;
    Class<?>[] paramTypes = new Class[] {forNameResult};
    Object[] args = new Object[] {"Args"};

    InvokerTransformer<Object, Object> invokerTransformer =
        new InvokerTransformer<>("Method Name", paramTypes, args);

    // Act and Assert
    assertThrows(FunctorException.class, () -> invokerTransformer.transform("Input"));
  }

  /**
   * Test {@link InvokerTransformer#transform(Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link InvokerTransformer#transform(Object)}
   */
  @Test
  @DisplayName("Test transform(Object); when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object InvokerTransformer.transform(Object)"})
  void testTransform_whenNull_thenReturnNull() {
    // Arrange
    Class<Object> forNameResult = Object.class;
    Class<?>[] paramTypes = new Class[] {forNameResult};
    Object[] args = new Object[] {"Args"};

    InvokerTransformer<Object, Object> invokerTransformer =
        new InvokerTransformer<>("Method Name", paramTypes, args);

    // Act and Assert
    assertNull(invokerTransformer.transform(null));
  }
}
