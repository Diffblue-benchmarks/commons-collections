package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.functors.PrototypeFactory.PrototypeCloneFactory;
import org.apache.commons.collections4.functors.PrototypeFactory.PrototypeSerializationFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PrototypeFactoryDiffblueTest {
  /**
   * Test {@link PrototypeFactory#prototypeFactory(Object)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link PrototypeCloneFactory}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PrototypeFactory#prototypeFactory(Object)}
   */
  @Test
  @DisplayName("Test prototypeFactory(Object); when ArrayList(); then return PrototypeCloneFactory")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Factory PrototypeFactory.prototypeFactory(Object)"})
  void testPrototypeFactory_whenArrayList_thenReturnPrototypeCloneFactory() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Factory<Object> actualPrototypeFactoryResult = PrototypeFactory.prototypeFactory(objectList);
    Object actualCreateResult = actualPrototypeFactoryResult.create();

    // Assert
    assertTrue(actualPrototypeFactoryResult instanceof PrototypeCloneFactory);
    assertTrue(objectList.isEmpty());
    assertEquals(objectList, actualCreateResult);
    assertEquals(objectList, actualPrototypeFactoryResult.get());
  }

  /**
   * Test {@link PrototypeFactory#prototypeFactory(Object)}.
   * <ul>
   *   <li>When forty-two.</li>
   *   <li>Then return {@link PrototypeSerializationFactory}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PrototypeFactory#prototypeFactory(Object)}
   */
  @Test
  @DisplayName("Test prototypeFactory(Object); when forty-two; then return PrototypeSerializationFactory")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Factory PrototypeFactory.prototypeFactory(Object)"})
  void testPrototypeFactory_whenFortyTwo_thenReturnPrototypeSerializationFactory() {
    // Arrange and Act
    Factory<Object> actualPrototypeFactoryResult = PrototypeFactory.<Object>prototypeFactory(42);

    // Assert
    assertTrue(actualPrototypeFactoryResult instanceof PrototypeSerializationFactory);
    assertEquals(42, ((Integer) actualPrototypeFactoryResult.create()).intValue());
    assertEquals(42, ((Integer) actualPrototypeFactoryResult.get()).intValue());
  }

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
  @DisplayName("Test prototypeFactory(Object); when 'null'; then return ConstantFactory")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Factory PrototypeFactory.prototypeFactory(Object)"})
  void testPrototypeFactory_whenNull_thenReturnConstantFactory() {
    // Arrange and Act
    Factory<Object> actualPrototypeFactoryResult = PrototypeFactory.prototypeFactory(null);

    // Assert
    assertTrue(actualPrototypeFactoryResult instanceof ConstantFactory);
    assertNull(null);
    assertNull(actualPrototypeFactoryResult.get());
    assertNull(((ConstantFactory<Object>) actualPrototypeFactoryResult).getConstant());
  }

  /**
   * Test {@link PrototypeFactory#prototypeFactory(Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return create is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PrototypeFactory#prototypeFactory(Object)}
   */
  @Test
  @DisplayName("Test prototypeFactory(Object); when 'null'; then return create is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Factory PrototypeFactory.prototypeFactory(Object)"})
  void testPrototypeFactory_whenNull_thenReturnCreateIsNull() {
    // Arrange and Act
    Factory<Object> actualPrototypeFactoryResult = PrototypeFactory.prototypeFactory(null);

    // Assert
    assertTrue(actualPrototypeFactoryResult instanceof ConstantFactory);
    assertNull(null);
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
  @DisplayName("Test prototypeFactory(Object); when 'Prototype'; then return InstantiateFactory")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Factory PrototypeFactory.prototypeFactory(Object)"})
  void testPrototypeFactory_whenPrototype_thenReturnInstantiateFactory() {
    // Arrange and Act
    Factory<Object> actualPrototypeFactoryResult = PrototypeFactory.prototypeFactory("Prototype");

    // Assert
    assertTrue(actualPrototypeFactoryResult instanceof InstantiateFactory);
    assertEquals("Prototype", actualPrototypeFactoryResult.create());
    assertEquals("Prototype", actualPrototypeFactoryResult.get());
  }
}
