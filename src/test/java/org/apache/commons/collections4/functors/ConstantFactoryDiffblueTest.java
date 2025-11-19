package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Factory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ConstantFactoryDiffblueTest {
  /**
   * Test {@link ConstantFactory#constantFactory(Object)}.
   *
   * <ul>
   *   <li>When {@code Constant To Return}.
   *   <li>Then return create is {@code Constant To Return}.
   * </ul>
   *
   * <p>Method under test: {@link ConstantFactory#constantFactory(Object)}
   */
  @Test
  @DisplayName(
      "Test constantFactory(Object); when 'Constant To Return'; then return create is 'Constant To Return'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Factory ConstantFactory.constantFactory(Object)"})
  void testConstantFactory_whenConstantToReturn_thenReturnCreateIsConstantToReturn() {
    // Arrange and Act
    Factory<Object> actualConstantFactoryResult =
        ConstantFactory.constantFactory("Constant To Return");
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
   * Test {@link ConstantFactory#constantFactory(Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return create is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ConstantFactory#constantFactory(Object)}
   */
  @Test
  @DisplayName("Test constantFactory(Object); when 'null'; then return create is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Factory ConstantFactory.constantFactory(Object)"})
  void testConstantFactory_whenNull_thenReturnCreateIsNull() {
    // Arrange and Act
    Factory<Object> actualConstantFactoryResult = ConstantFactory.constantFactory(null);
    Object actualCreateResult = actualConstantFactoryResult.create();

    // Assert
    assertTrue(actualConstantFactoryResult instanceof ConstantFactory);
    assertNull(actualCreateResult);
    assertNull(actualConstantFactoryResult.get());
    assertNull(((ConstantFactory<Object>) actualConstantFactoryResult).getConstant());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ConstantFactory#ConstantFactory(Object)}
   *   <li>{@link ConstantFactory#getConstant()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ConstantFactory.<init>(Object)", "Object ConstantFactory.getConstant()"})
  void testGettersAndSetters() {
    // Arrange and Act
    ConstantFactory<Object> actualConstantFactory = new ConstantFactory<>("Constant To Return");

    // Assert
    assertEquals("Constant To Return", actualConstantFactory.getConstant());
  }

  /**
   * Test {@link ConstantFactory#create()}.
   *
   * <p>Method under test: {@link ConstantFactory#create()}
   */
  @Test
  @DisplayName("Test create()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ConstantFactory.create()"})
  void testCreate() {
    // Arrange
    ConstantFactory<Object> constantFactory = new ConstantFactory<>("Constant To Return");

    // Act and Assert
    assertEquals("Constant To Return", constantFactory.create());
  }
}
