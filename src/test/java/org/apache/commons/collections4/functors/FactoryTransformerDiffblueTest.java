package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FactoryTransformerDiffblueTest {
  /**
   * Test {@link FactoryTransformer#factoryTransformer(Factory)}.
   *
   * <ul>
   *   <li>Given {@code Get}.
   *   <li>Then return transform {@code 42} is {@code Get}.
   * </ul>
   *
   * <p>Method under test: {@link FactoryTransformer#factoryTransformer(Factory)}
   */
  @Test
  @DisplayName("Test factoryTransformer(Factory); given 'Get'; then return transform '42' is 'Get'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer FactoryTransformer.factoryTransformer(Factory)"})
  void testFactoryTransformer_givenGet_thenReturnTransform42IsGet() {
    // Arrange
    Factory<Object> factory = mock(Factory.class);
    when(factory.get()).thenReturn("Get");

    // Act
    Transformer<Object, Object> actualFactoryTransformerResult =
        FactoryTransformer.factoryTransformer(factory);
    Object actualTransformResult = actualFactoryTransformerResult.transform("42");

    // Assert
    verify(factory).get();
    assertTrue(actualFactoryTransformerResult instanceof FactoryTransformer);
    assertEquals("Get", actualTransformResult);
    assertSame(
        factory,
        ((FactoryTransformer<Object, Object>) actualFactoryTransformerResult).getFactory());
  }

  /**
   * Test {@link FactoryTransformer#factoryTransformer(Factory)}.
   *
   * <ul>
   *   <li>When {@link Factory}.
   *   <li>Then return {@link FactoryTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link FactoryTransformer#factoryTransformer(Factory)}
   */
  @Test
  @DisplayName("Test factoryTransformer(Factory); when Factory; then return FactoryTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer FactoryTransformer.factoryTransformer(Factory)"})
  void testFactoryTransformer_whenFactory_thenReturnFactoryTransformer() {
    // Arrange
    Factory<Object> factory = mock(Factory.class);

    // Act
    Transformer<Object, Object> actualFactoryTransformerResult =
        FactoryTransformer.factoryTransformer(factory);

    // Assert
    assertTrue(actualFactoryTransformerResult instanceof FactoryTransformer);
    assertSame(
        factory,
        ((FactoryTransformer<Object, Object>) actualFactoryTransformerResult).getFactory());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FactoryTransformer#FactoryTransformer(Factory)}
   *   <li>{@link FactoryTransformer#getFactory()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FactoryTransformer.<init>(Factory)",
    "Factory FactoryTransformer.getFactory()"
  })
  void testGettersAndSetters() {
    // Arrange
    Factory<Object> factory = mock(Factory.class);

    // Act
    FactoryTransformer<Object, Object> actualFactoryTransformer = new FactoryTransformer<>(factory);

    // Assert
    assertSame(factory, actualFactoryTransformer.getFactory());
  }
}
