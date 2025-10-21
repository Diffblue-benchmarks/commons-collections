package org.apache.commons.collections4.map;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.map.ConcurrentReferenceHashMap.Builder;
import org.apache.commons.collections4.map.ConcurrentReferenceHashMap.ReferenceType;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ConcurrentReferenceHashMapDiffblueTest {
  /**
   * Test Builder getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Builder#setConcurrencyLevel(int)}
   *   <li>{@link Builder#setInitialCapacity(int)}
   *   <li>{@link Builder#setKeyReferenceType(ReferenceType)}
   *   <li>{@link Builder#setLoadFactor(float)}
   *   <li>{@link Builder#setOptions(EnumSet)}
   *   <li>{@link Builder#setSourceMap(Map)}
   *   <li>{@link Builder#setValueReferenceType(ReferenceType)}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Builder Builder.setConcurrencyLevel(int)", "Builder Builder.setInitialCapacity(int)",
      "Builder Builder.setKeyReferenceType(ReferenceType)", "Builder Builder.setLoadFactor(float)",
      "Builder Builder.setOptions(EnumSet)", "Builder Builder.setSourceMap(Map)",
      "Builder Builder.setValueReferenceType(ReferenceType)"})
  public void testBuilderGettersAndSetters() {
    // Arrange
    Builder<Object, Object> builder = new Builder<>();

    // Act
    Builder<Object, Object> actualSetConcurrencyLevelResult = builder.setConcurrencyLevel(1);
    Builder<Object, Object> actualSetInitialCapacityResult = builder.setInitialCapacity(1);
    Builder<Object, Object> actualSetKeyReferenceTypeResult = builder.setKeyReferenceType(ReferenceType.STRONG);
    Builder<Object, Object> actualSetLoadFactorResult = builder.setLoadFactor(10.0f);
    Builder<Object, Object> actualSetOptionsResult = builder.setOptions(null);
    Builder<Object, Object> actualSetSourceMapResult = builder.setSourceMap(new HashMap<>());

    // Assert
    assertSame(builder, actualSetConcurrencyLevelResult);
    assertSame(builder, actualSetInitialCapacityResult);
    assertSame(builder, actualSetKeyReferenceTypeResult);
    assertSame(builder, actualSetLoadFactorResult);
    assertSame(builder, actualSetOptionsResult);
    assertSame(builder, actualSetSourceMapResult);
    assertSame(builder, builder.setValueReferenceType(ReferenceType.STRONG));
  }

  /**
   * Test Builder new {@link Builder} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link Builder}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void Builder.<init>()"})
  public void testBuilderNewBuilder() {
    // Arrange and Act
    Builder<Object, Object> actualBuilder = new Builder<>();

    // Assert
    assertTrue(actualBuilder.get().isEmpty());
  }

  /**
   * Test Builder {@link Builder#softKeys()}.
   * <p>
   * Method under test: {@link Builder#softKeys()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Builder Builder.softKeys()"})
  public void testBuilderSoftKeys() {
    // Arrange
    Builder<Object, Object> builderResult = ConcurrentReferenceHashMap.builder();

    // Act and Assert
    assertSame(builderResult, builderResult.softKeys());
  }

  /**
   * Test Builder {@link Builder#softValues()}.
   * <p>
   * Method under test: {@link Builder#softValues()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Builder Builder.softValues()"})
  public void testBuilderSoftValues() {
    // Arrange
    Builder<Object, Object> builderResult = ConcurrentReferenceHashMap.builder();

    // Act and Assert
    assertSame(builderResult, builderResult.softValues());
  }

  /**
   * Test Builder {@link Builder#strongKeys()}.
   * <p>
   * Method under test: {@link Builder#strongKeys()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Builder Builder.strongKeys()"})
  public void testBuilderStrongKeys() {
    // Arrange
    Builder<Object, Object> builderResult = ConcurrentReferenceHashMap.builder();

    // Act and Assert
    assertSame(builderResult, builderResult.strongKeys());
  }

  /**
   * Test Builder {@link Builder#strongValues()}.
   * <p>
   * Method under test: {@link Builder#strongValues()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Builder Builder.strongValues()"})
  public void testBuilderStrongValues() {
    // Arrange
    Builder<Object, Object> builderResult = ConcurrentReferenceHashMap.builder();

    // Act and Assert
    assertSame(builderResult, builderResult.strongValues());
  }

  /**
   * Test Builder {@link Builder#weakKeys()}.
   * <p>
   * Method under test: {@link Builder#weakKeys()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Builder Builder.weakKeys()"})
  public void testBuilderWeakKeys() {
    // Arrange
    Builder<Object, Object> builderResult = ConcurrentReferenceHashMap.builder();

    // Act and Assert
    assertSame(builderResult, builderResult.weakKeys());
  }

  /**
   * Test Builder {@link Builder#weakValues()}.
   * <p>
   * Method under test: {@link Builder#weakValues()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Builder Builder.weakValues()"})
  public void testBuilderWeakValues() {
    // Arrange
    Builder<Object, Object> builderResult = ConcurrentReferenceHashMap.builder();

    // Act and Assert
    assertSame(builderResult, builderResult.weakValues());
  }
}
