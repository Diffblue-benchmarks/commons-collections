package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.apache.commons.collections4.functors.ExceptionFactory;
import org.apache.commons.collections4.functors.InstantiateFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FactoryUtilsDiffblueTest {
  /**
   * Test {@link FactoryUtils#constantFactory(Object)}.
   *
   * <ul>
   *   <li>When {@code Constant To Return}.
   *   <li>Then return create is {@code Constant To Return}.
   * </ul>
   *
   * <p>Method under test: {@link FactoryUtils#constantFactory(Object)}
   */
  @Test
  @DisplayName(
      "Test constantFactory(Object); when 'Constant To Return'; then return create is 'Constant To Return'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Factory FactoryUtils.constantFactory(Object)"})
  void testConstantFactory_whenConstantToReturn_thenReturnCreateIsConstantToReturn() {
    // Arrange and Act
    Factory<Object> actualConstantFactoryResult =
        FactoryUtils.constantFactory("Constant To Return");
    Object actualCreateResult = actualConstantFactoryResult.create();

    // Assert
    assertTrue(actualConstantFactoryResult instanceof ConstantFactory);
    assertEquals("Constant To Return", actualCreateResult);
    assertEquals("Constant To Return", actualConstantFactoryResult.get());
    assertEquals(
        "Constant To Return",
        ((ConstantFactory<Object>) actualConstantFactoryResult).getConstant());
  }

  /**
   * Test {@link FactoryUtils#constantFactory(Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return create is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FactoryUtils#constantFactory(Object)}
   */
  @Test
  @DisplayName("Test constantFactory(Object); when 'null'; then return create is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Factory FactoryUtils.constantFactory(Object)"})
  void testConstantFactory_whenNull_thenReturnCreateIsNull() {
    // Arrange and Act
    Factory<Object> actualConstantFactoryResult = FactoryUtils.constantFactory(null);
    Object actualCreateResult = actualConstantFactoryResult.create();

    // Assert
    assertTrue(actualConstantFactoryResult instanceof ConstantFactory);
    assertNull(actualCreateResult);
    assertNull(actualConstantFactoryResult.get());
    assertNull(((ConstantFactory<Object>) actualConstantFactoryResult).getConstant());
  }

  /**
   * Test {@link FactoryUtils#exceptionFactory()}.
   *
   * <ul>
   *   <li>Then return {@link ExceptionFactory}.
   * </ul>
   *
   * <p>Method under test: {@link FactoryUtils#exceptionFactory()}
   */
  @Test
  @DisplayName("Test exceptionFactory(); then return ExceptionFactory")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Factory FactoryUtils.exceptionFactory()"})
  void testExceptionFactory_thenReturnExceptionFactory() {
    // Arrange and Act
    Factory<Object> actualExceptionFactoryResult = FactoryUtils.exceptionFactory();

    // Assert
    assertTrue(actualExceptionFactoryResult instanceof ExceptionFactory);
  }

  /**
   * Test {@link FactoryUtils#instantiateFactory(Class, Class[], Object[])} with {@code
   * classToInstantiate}, {@code paramTypes}, {@code args}.
   *
   * <p>Method under test: {@link FactoryUtils#instantiateFactory(Class, Class[], Object[])}
   */
  @Test
  @DisplayName(
      "Test instantiateFactory(Class, Class[], Object[]) with 'classToInstantiate', 'paramTypes', 'args'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Factory FactoryUtils.instantiateFactory(Class, Class[], Object[])"})
  void testInstantiateFactoryWithClassToInstantiateParamTypesArgs() {
    // Arrange
    Class<Object> classToInstantiate = Object.class;

    // Act
    Factory<Object> actualInstantiateFactoryResult =
        FactoryUtils.instantiateFactory(classToInstantiate, null, null);
    actualInstantiateFactoryResult.create();

    // Assert
    assertTrue(actualInstantiateFactoryResult instanceof InstantiateFactory);
  }

  /**
   * Test {@link FactoryUtils#instantiateFactory(Class, Class[], Object[])} with {@code
   * classToInstantiate}, {@code paramTypes}, {@code args}.
   *
   * <p>Method under test: {@link FactoryUtils#instantiateFactory(Class, Class[], Object[])}
   */
  @Test
  @DisplayName(
      "Test instantiateFactory(Class, Class[], Object[]) with 'classToInstantiate', 'paramTypes', 'args'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Factory FactoryUtils.instantiateFactory(Class, Class[], Object[])"})
  void testInstantiateFactoryWithClassToInstantiateParamTypesArgs2() {
    // Arrange
    Class<Object> classToInstantiate = Object.class;

    // Act
    Factory<Object> actualInstantiateFactoryResult =
        FactoryUtils.instantiateFactory(classToInstantiate, new Class[] {}, new Object[] {});
    actualInstantiateFactoryResult.create();

    // Assert
    assertTrue(actualInstantiateFactoryResult instanceof InstantiateFactory);
  }

  /**
   * Test {@link FactoryUtils#instantiateFactory(Class)} with {@code classToInstantiate}.
   *
   * <ul>
   *   <li>Then return {@link InstantiateFactory}.
   * </ul>
   *
   * <p>Method under test: {@link FactoryUtils#instantiateFactory(Class)}
   */
  @Test
  @DisplayName(
      "Test instantiateFactory(Class) with 'classToInstantiate'; then return InstantiateFactory")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Factory FactoryUtils.instantiateFactory(Class)"})
  void testInstantiateFactoryWithClassToInstantiate_thenReturnInstantiateFactory() {
    // Arrange
    Class<Object> classToInstantiate = Object.class;

    // Act
    Factory<Object> actualInstantiateFactoryResult =
        FactoryUtils.instantiateFactory(classToInstantiate);
    actualInstantiateFactoryResult.create();

    // Assert
    assertTrue(actualInstantiateFactoryResult instanceof InstantiateFactory);
  }

  /**
   * Test {@link FactoryUtils#nullFactory()}.
   *
   * <p>Method under test: {@link FactoryUtils#nullFactory()}
   */
  @Test
  @DisplayName("Test nullFactory()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Factory FactoryUtils.nullFactory()"})
  void testNullFactory() {
    // Arrange and Act
    Factory<Object> actualNullFactoryResult = FactoryUtils.nullFactory();
    Object actualCreateResult = actualNullFactoryResult.create();

    // Assert
    assertTrue(actualNullFactoryResult instanceof ConstantFactory);
    assertNull(actualCreateResult);
    assertNull(actualNullFactoryResult.get());
    assertNull(((ConstantFactory<Object>) actualNullFactoryResult).getConstant());
  }

  /**
   * Test {@link FactoryUtils#prototypeFactory(Object)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return create is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link FactoryUtils#prototypeFactory(Object)}
   */
  @Test
  @DisplayName("Test prototypeFactory(Object); when ArrayList(); then return create is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Factory FactoryUtils.prototypeFactory(Object)"})
  void testPrototypeFactory_whenArrayList_thenReturnCreateIsArrayList() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Factory<Object> actualPrototypeFactoryResult = FactoryUtils.prototypeFactory(objectList);

    // Assert
    assertEquals(objectList, actualPrototypeFactoryResult.create());
    assertEquals(objectList, actualPrototypeFactoryResult.get());
  }

  /**
   * Test {@link FactoryUtils#prototypeFactory(Object)}.
   *
   * <ul>
   *   <li>When forty-two.
   *   <li>Then return create intValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link FactoryUtils#prototypeFactory(Object)}
   */
  @Test
  @DisplayName(
      "Test prototypeFactory(Object); when forty-two; then return create intValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Factory FactoryUtils.prototypeFactory(Object)"})
  void testPrototypeFactory_whenFortyTwo_thenReturnCreateIntValueIsFortyTwo() {
    // Arrange and Act
    Factory<Object> actualPrototypeFactoryResult = FactoryUtils.prototypeFactory(42);

    // Assert
    assertEquals(42, ((Integer) actualPrototypeFactoryResult.create()).intValue());
    assertEquals(42, ((Integer) actualPrototypeFactoryResult.get()).intValue());
  }

  /**
   * Test {@link FactoryUtils#prototypeFactory(Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link ConstantFactory}.
   * </ul>
   *
   * <p>Method under test: {@link FactoryUtils#prototypeFactory(Object)}
   */
  @Test
  @DisplayName("Test prototypeFactory(Object); when 'null'; then return ConstantFactory")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Factory FactoryUtils.prototypeFactory(Object)"})
  void testPrototypeFactory_whenNull_thenReturnConstantFactory() {
    // Arrange and Act
    Factory<Object> actualPrototypeFactoryResult = FactoryUtils.prototypeFactory(null);
    Object actualCreateResult = actualPrototypeFactoryResult.create();

    // Assert
    assertTrue(actualPrototypeFactoryResult instanceof ConstantFactory);
    assertNull(actualCreateResult);
    assertNull(actualPrototypeFactoryResult.get());
    assertNull(((ConstantFactory<Object>) actualPrototypeFactoryResult).getConstant());
  }

  /**
   * Test {@link FactoryUtils#prototypeFactory(Object)}.
   *
   * <ul>
   *   <li>When {@code Prototype}.
   *   <li>Then return {@link InstantiateFactory}.
   * </ul>
   *
   * <p>Method under test: {@link FactoryUtils#prototypeFactory(Object)}
   */
  @Test
  @DisplayName("Test prototypeFactory(Object); when 'Prototype'; then return InstantiateFactory")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Factory FactoryUtils.prototypeFactory(Object)"})
  void testPrototypeFactory_whenPrototype_thenReturnInstantiateFactory() {
    // Arrange and Act
    Factory<Object> actualPrototypeFactoryResult = FactoryUtils.prototypeFactory("Prototype");
    Object actualCreateResult = actualPrototypeFactoryResult.create();

    // Assert
    assertTrue(actualPrototypeFactoryResult instanceof InstantiateFactory);
    assertEquals("Prototype", actualCreateResult);
    assertEquals("Prototype", actualPrototypeFactoryResult.get());
  }
}
