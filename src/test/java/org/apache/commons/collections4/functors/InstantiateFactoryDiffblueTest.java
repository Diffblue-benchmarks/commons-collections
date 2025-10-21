package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Factory;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class InstantiateFactoryDiffblueTest {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Factory InstantiateFactory.instantiateFactory(Class, Class[], Object[])"})
  public void testInstantiateFactory_whenNull_thenReturnInstantiateFactory() {
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
