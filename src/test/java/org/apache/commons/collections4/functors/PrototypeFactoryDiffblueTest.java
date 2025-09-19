package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link PrototypeCloneFactory}.
   * </ul>
   *
   * <p>Method under test: {@link PrototypeFactory#prototypeFactory(Object)}
   */
  @Test
  @DisplayName("Test prototypeFactory(Object); when ArrayList(); then return PrototypeCloneFactory")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>When forty-two.
   *   <li>Then return {@link PrototypeSerializationFactory}.
   * </ul>
   *
   * <p>Method under test: {@link PrototypeFactory#prototypeFactory(Object)}
   */
  @Test
  @DisplayName(
      "Test prototypeFactory(Object); when forty-two; then return PrototypeSerializationFactory")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Factory PrototypeFactory.prototypeFactory(Object)"})
  void testPrototypeFactory_whenFortyTwo_thenReturnPrototypeSerializationFactory() {
    // Arrange and Act
    Factory<Object> actualPrototypeFactoryResult = PrototypeFactory.prototypeFactory(42);
    Object actualCreateResult = actualPrototypeFactoryResult.create();

    // Assert
    assertTrue(actualPrototypeFactoryResult instanceof PrototypeSerializationFactory);
    assertEquals(42, ((Integer) actualCreateResult).intValue());
    assertEquals(42, ((Integer) actualPrototypeFactoryResult.get()).intValue());
  }

  /**
   * Test {@link PrototypeFactory#prototypeFactory(Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link ConstantFactory}.
   * </ul>
   *
   * <p>Method under test: {@link PrototypeFactory#prototypeFactory(Object)}
   */
  @Test
  @DisplayName("Test prototypeFactory(Object); when 'null'; then return ConstantFactory")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return create is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link PrototypeFactory#prototypeFactory(Object)}
   */
  @Test
  @DisplayName("Test prototypeFactory(Object); when 'null'; then return create is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Factory PrototypeFactory.prototypeFactory(Object)"})
  void testPrototypeFactory_whenNull_thenReturnCreateIsNull() {
    // Arrange and Act
    Factory<Object> actualPrototypeFactoryResult = PrototypeFactory.prototypeFactory(null);
    Object actualCreateResult = actualPrototypeFactoryResult.create();

    // Assert
    assertTrue(actualPrototypeFactoryResult instanceof ConstantFactory);
    assertNull(null);
    assertNull(actualCreateResult);
    assertNull(actualPrototypeFactoryResult.get());
    assertNull(((ConstantFactory<Object>) actualPrototypeFactoryResult).getConstant());
  }

  /**
   * Test {@link PrototypeFactory#prototypeFactory(Object)}.
   *
   * <ul>
   *   <li>When {@code Prototype}.
   *   <li>Then return {@link InstantiateFactory}.
   * </ul>
   *
   * <p>Method under test: {@link PrototypeFactory#prototypeFactory(Object)}
   */
  @Test
  @DisplayName("Test prototypeFactory(Object); when 'Prototype'; then return InstantiateFactory")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Factory PrototypeFactory.prototypeFactory(Object)"})
  void testPrototypeFactory_whenPrototype_thenReturnInstantiateFactory() {
    // Arrange and Act
    Factory<Object> actualPrototypeFactoryResult = PrototypeFactory.prototypeFactory("Prototype");
    Object actualCreateResult = actualPrototypeFactoryResult.create();

    // Assert
    assertTrue(actualPrototypeFactoryResult instanceof InstantiateFactory);
    assertEquals("Prototype", actualCreateResult);
    assertEquals("Prototype", actualPrototypeFactoryResult.get());
  }
}
