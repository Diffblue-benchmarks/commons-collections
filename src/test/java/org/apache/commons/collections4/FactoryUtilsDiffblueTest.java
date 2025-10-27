package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.apache.commons.collections4.functors.InstantiateFactory;
import org.junit.Test;

public class FactoryUtilsDiffblueTest {
  /**
   * Method under test: {@link FactoryUtils#constantFactory(Object)}
   */
  @Test
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
   * Method under test: {@link FactoryUtils#instantiateFactory(Class)}
   */
  @Test
  public void testInstantiateFactory() {
    // Arrange
    Class<Object> classToInstantiate = Object.class;

    // Act
    Factory<Object> actualInstantiateFactoryResult = FactoryUtils.instantiateFactory(classToInstantiate);
    actualInstantiateFactoryResult.create();

    // Assert
    assertTrue(actualInstantiateFactoryResult instanceof InstantiateFactory);
  }

  /**
   * Method under test:
   * {@link FactoryUtils#instantiateFactory(Class, Class[], Object[])}
   */
  @Test
  public void testInstantiateFactory2() {
    // Arrange
    Class<Object> classToInstantiate = Object.class;

    // Act
    Factory<Object> actualInstantiateFactoryResult = FactoryUtils.instantiateFactory(classToInstantiate, null, null);
    actualInstantiateFactoryResult.create();

    // Assert
    assertTrue(actualInstantiateFactoryResult instanceof InstantiateFactory);
  }

  /**
   * Method under test: {@link FactoryUtils#nullFactory()}
   */
  @Test
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
   * Method under test: {@link FactoryUtils#prototypeFactory(Object)}
   */
  @Test
  public void testPrototypeFactory() {
    // Arrange and Act
    Factory<Object> actualPrototypeFactoryResult = FactoryUtils.prototypeFactory("Prototype");

    // Assert
    assertTrue(actualPrototypeFactoryResult instanceof InstantiateFactory);
    assertEquals("Prototype", actualPrototypeFactoryResult.create());
    assertEquals("Prototype", actualPrototypeFactoryResult.get());
  }

  /**
   * Method under test: {@link FactoryUtils#prototypeFactory(Object)}
   */
  @Test
  public void testPrototypeFactory2() {
    // Arrange and Act
    Factory<Object> actualPrototypeFactoryResult = FactoryUtils.prototypeFactory(null);

    // Assert
    assertTrue(actualPrototypeFactoryResult instanceof ConstantFactory);
    assertNull(actualPrototypeFactoryResult.create());
    assertNull(actualPrototypeFactoryResult.get());
    assertNull(((ConstantFactory<Object>) actualPrototypeFactoryResult).getConstant());
  }
}
