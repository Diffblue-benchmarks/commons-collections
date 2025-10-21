package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Factory;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class PrototypeFactoryDiffblueTest {
  /**
   * Test {@link PrototypeFactory#prototypeFactory(Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link ConstantFactory}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PrototypeFactory#prototypeFactory(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Factory PrototypeFactory.prototypeFactory(Object)"})
  public void testPrototypeFactory_whenNull_thenReturnConstantFactory() {
    // Arrange and Act
    Factory<Object> actualPrototypeFactoryResult = PrototypeFactory.prototypeFactory(null);

    // Assert
    assertTrue(actualPrototypeFactoryResult instanceof ConstantFactory);
    assertNull(actualPrototypeFactoryResult.create());
    assertNull(actualPrototypeFactoryResult.get());
    assertNull(((ConstantFactory<Object>) actualPrototypeFactoryResult).getConstant());
  }

  /**
   * Test {@link PrototypeFactory#prototypeFactory(Object)}.
   * <ul>
   *   <li>When {@code Prototype}.</li>
   *   <li>Then return {@link InstantiateFactory}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PrototypeFactory#prototypeFactory(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Factory PrototypeFactory.prototypeFactory(Object)"})
  public void testPrototypeFactory_whenPrototype_thenReturnInstantiateFactory() {
    // Arrange and Act
    Factory<Object> actualPrototypeFactoryResult = PrototypeFactory.prototypeFactory("Prototype");

    // Assert
    assertTrue(actualPrototypeFactoryResult instanceof InstantiateFactory);
    assertEquals("Prototype", actualPrototypeFactoryResult.create());
    assertEquals("Prototype", actualPrototypeFactoryResult.get());
  }
}
