package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Factory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class InstantiateFactoryDiffblueTest {
  /**
   * Test {@link InstantiateFactory#instantiateFactory(Class, Class[], Object[])}.
   * <ul>
   *   <li>When empty array of {@link Object}.</li>
   *   <li>Then return {@link InstantiateFactory}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InstantiateFactory#instantiateFactory(Class, Class[], Object[])}
   */
  @Test
  @DisplayName("Test instantiateFactory(Class, Class[], Object[]); when empty array of Object; then return InstantiateFactory")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Factory InstantiateFactory.instantiateFactory(Class, Class[], Object[])"})
  void testInstantiateFactory_whenEmptyArrayOfObject_thenReturnInstantiateFactory() {
    // Arrange
    Class<Object> classToInstantiate = Object.class;

    // Act
    Factory<Object> actualInstantiateFactoryResult = InstantiateFactory.instantiateFactory(classToInstantiate,
        new Class[]{}, new Object[]{});
    actualInstantiateFactoryResult.create();

    // Assert
    assertTrue(actualInstantiateFactoryResult instanceof InstantiateFactory);
  }

  /**
   * Test {@link InstantiateFactory#instantiateFactory(Class, Class[], Object[])}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link InstantiateFactory}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InstantiateFactory#instantiateFactory(Class, Class[], Object[])}
   */
  @Test
  @DisplayName("Test instantiateFactory(Class, Class[], Object[]); when 'null'; then return InstantiateFactory")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Factory InstantiateFactory.instantiateFactory(Class, Class[], Object[])"})
  void testInstantiateFactory_whenNull_thenReturnInstantiateFactory() {
    // Arrange
    Class<Object> classToInstantiate = Object.class;

    // Act
    Factory<Object> actualInstantiateFactoryResult = InstantiateFactory.instantiateFactory(classToInstantiate, null,
        null);
    actualInstantiateFactoryResult.create();

    // Assert
    assertTrue(actualInstantiateFactoryResult instanceof InstantiateFactory);
  }
}
