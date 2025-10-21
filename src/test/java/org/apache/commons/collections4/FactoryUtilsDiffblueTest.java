package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.apache.commons.collections4.functors.InstantiateFactory;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class FactoryUtilsDiffblueTest {
  /**
   * Test {@link FactoryUtils#constantFactory(Object)}.
   * <p>
   * Method under test: {@link FactoryUtils#constantFactory(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Factory FactoryUtils.constantFactory(Object)"})
  public void testConstantFactory() {
    // Arrange and Act
    Factory<Object> actualConstantFactoryResult = FactoryUtils.constantFactory("Constant To Return");

    // Assert
    assertTrue(actualConstantFactoryResult instanceof ConstantFactory);
    assertEquals("Constant To Return", actualConstantFactoryResult.create());
    assertEquals("Constant To Return", actualConstantFactoryResult.get());
    assertEquals("Constant To Return", ((ConstantFactory<Object>) actualConstantFactoryResult).getConstant());
  }

  /**
   * Test {@link FactoryUtils#instantiateFactory(Class)} with {@code classToInstantiate}.
   * <p>
   * Method under test: {@link FactoryUtils#instantiateFactory(Class)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Factory FactoryUtils.instantiateFactory(Class)"})
  public void testInstantiateFactoryWithClassToInstantiate() {
    // Arrange
    Class<Object> classToInstantiate = Object.class;

    // Act
    Factory<Object> actualInstantiateFactoryResult = FactoryUtils.instantiateFactory(classToInstantiate);
    actualInstantiateFactoryResult.create();

    // Assert
    assertTrue(actualInstantiateFactoryResult instanceof InstantiateFactory);
  }

  /**
   * Test {@link FactoryUtils#instantiateFactory(Class, Class[], Object[])} with {@code classToInstantiate}, {@code paramTypes}, {@code args}.
   * <p>
   * Method under test: {@link FactoryUtils#instantiateFactory(Class, Class[], Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Factory FactoryUtils.instantiateFactory(Class, Class[], Object[])"})
  public void testInstantiateFactoryWithClassToInstantiateParamTypesArgs() {
    // Arrange
    Class<Object> classToInstantiate = Object.class;

    // Act
    Factory<Object> actualInstantiateFactoryResult = FactoryUtils.instantiateFactory(classToInstantiate, null, null);
    actualInstantiateFactoryResult.create();

    // Assert
    assertTrue(actualInstantiateFactoryResult instanceof InstantiateFactory);
  }

  /**
   * Test {@link FactoryUtils#nullFactory()}.
   * <p>
   * Method under test: {@link FactoryUtils#nullFactory()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Factory FactoryUtils.nullFactory()"})
  public void testNullFactory() {
    // Arrange and Act
    Factory<Object> actualNullFactoryResult = FactoryUtils.nullFactory();

    // Assert
    assertTrue(actualNullFactoryResult instanceof ConstantFactory);
    assertNull(actualNullFactoryResult.create());
    assertNull(actualNullFactoryResult.get());
    assertNull(((ConstantFactory<Object>) actualNullFactoryResult).getConstant());
  }

  /**
   * Test {@link FactoryUtils#prototypeFactory(Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link ConstantFactory}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FactoryUtils#prototypeFactory(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Factory FactoryUtils.prototypeFactory(Object)"})
  public void testPrototypeFactory_whenNull_thenReturnConstantFactory() {
    // Arrange and Act
    Factory<Object> actualPrototypeFactoryResult = FactoryUtils.prototypeFactory(null);

    // Assert
    assertTrue(actualPrototypeFactoryResult instanceof ConstantFactory);
    assertNull(actualPrototypeFactoryResult.create());
    assertNull(actualPrototypeFactoryResult.get());
    assertNull(((ConstantFactory<Object>) actualPrototypeFactoryResult).getConstant());
  }

  /**
   * Test {@link FactoryUtils#prototypeFactory(Object)}.
   * <ul>
   *   <li>When {@code Prototype}.</li>
   *   <li>Then return {@link InstantiateFactory}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FactoryUtils#prototypeFactory(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Factory FactoryUtils.prototypeFactory(Object)"})
  public void testPrototypeFactory_whenPrototype_thenReturnInstantiateFactory() {
    // Arrange and Act
    Factory<Object> actualPrototypeFactoryResult = FactoryUtils.prototypeFactory("Prototype");

    // Assert
    assertTrue(actualPrototypeFactoryResult instanceof InstantiateFactory);
    assertEquals("Prototype", actualPrototypeFactoryResult.create());
    assertEquals("Prototype", actualPrototypeFactoryResult.get());
  }
}
