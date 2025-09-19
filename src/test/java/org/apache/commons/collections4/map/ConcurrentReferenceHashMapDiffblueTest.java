package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.map.ConcurrentReferenceHashMap.Builder;
import org.apache.commons.collections4.map.ConcurrentReferenceHashMap.ReferenceType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ConcurrentReferenceHashMapDiffblueTest {
  /**
   * Test Builder getters and setters.
   *
   * <p>Methods under test:
   *
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
  @DisplayName("Test Builder getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Builder Builder.setConcurrencyLevel(int)",
    "Builder Builder.setInitialCapacity(int)",
    "Builder Builder.setKeyReferenceType(ReferenceType)",
    "Builder Builder.setLoadFactor(float)",
    "Builder Builder.setOptions(EnumSet)",
    "Builder Builder.setSourceMap(Map)",
    "Builder Builder.setValueReferenceType(ReferenceType)"
  })
  void testBuilderGettersAndSetters() {
    // Arrange
    Builder<Object, Object> builder = new Builder<>();

    // Act
    Builder<Object, Object> actualSetConcurrencyLevelResult = builder.setConcurrencyLevel(1);
    Builder<Object, Object> actualSetInitialCapacityResult = builder.setInitialCapacity(1);
    Builder<Object, Object> actualSetKeyReferenceTypeResult =
        builder.setKeyReferenceType(ReferenceType.STRONG);
    Builder<Object, Object> actualSetLoadFactorResult = builder.setLoadFactor(10.0f);
    Builder<Object, Object> actualSetOptionsResult = builder.setOptions(null);
    Builder<Object, Object> actualSetSourceMapResult = builder.setSourceMap(new HashMap<>());
    Builder<Object, Object> actualSetValueReferenceTypeResult =
        builder.setValueReferenceType(ReferenceType.STRONG);

    // Assert
    assertSame(builder, actualSetConcurrencyLevelResult);
    assertSame(builder, actualSetInitialCapacityResult);
    assertSame(builder, actualSetKeyReferenceTypeResult);
    assertSame(builder, actualSetLoadFactorResult);
    assertSame(builder, actualSetOptionsResult);
    assertSame(builder, actualSetSourceMapResult);
    assertSame(builder, actualSetValueReferenceTypeResult);
  }

  /**
   * Test Builder new {@link Builder} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link Builder}
   */
  @Test
  @DisplayName("Test Builder new Builder (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Builder.<init>()"})
  void testBuilderNewBuilder() {
    // Arrange and Act
    Builder<Object, Object> actualBuilder = new Builder<>();

    // Assert
    assertTrue(actualBuilder.get().isEmpty());
  }

  /**
   * Test Builder {@link Builder#softKeys()}.
   *
   * <p>Method under test: {@link Builder#softKeys()}
   */
  @Test
  @DisplayName("Test Builder softKeys()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.softKeys()"})
  void testBuilderSoftKeys() {
    // Arrange
    Builder<Object, Object> builderResult = ConcurrentReferenceHashMap.builder();

    // Act
    Builder<Object, Object> actualSoftKeysResult = builderResult.softKeys();

    // Assert
    assertSame(builderResult, actualSoftKeysResult);
  }

  /**
   * Test Builder {@link Builder#softValues()}.
   *
   * <p>Method under test: {@link Builder#softValues()}
   */
  @Test
  @DisplayName("Test Builder softValues()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.softValues()"})
  void testBuilderSoftValues() {
    // Arrange
    Builder<Object, Object> builderResult = ConcurrentReferenceHashMap.builder();

    // Act
    Builder<Object, Object> actualSoftValuesResult = builderResult.softValues();

    // Assert
    assertSame(builderResult, actualSoftValuesResult);
  }

  /**
   * Test Builder {@link Builder#strongKeys()}.
   *
   * <p>Method under test: {@link Builder#strongKeys()}
   */
  @Test
  @DisplayName("Test Builder strongKeys()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.strongKeys()"})
  void testBuilderStrongKeys() {
    // Arrange
    Builder<Object, Object> builderResult = ConcurrentReferenceHashMap.builder();

    // Act
    Builder<Object, Object> actualStrongKeysResult = builderResult.strongKeys();

    // Assert
    assertSame(builderResult, actualStrongKeysResult);
  }

  /**
   * Test Builder {@link Builder#strongValues()}.
   *
   * <p>Method under test: {@link Builder#strongValues()}
   */
  @Test
  @DisplayName("Test Builder strongValues()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.strongValues()"})
  void testBuilderStrongValues() {
    // Arrange
    Builder<Object, Object> builderResult = ConcurrentReferenceHashMap.builder();

    // Act
    Builder<Object, Object> actualStrongValuesResult = builderResult.strongValues();

    // Assert
    assertSame(builderResult, actualStrongValuesResult);
  }

  /**
   * Test Builder {@link Builder#weakKeys()}.
   *
   * <p>Method under test: {@link Builder#weakKeys()}
   */
  @Test
  @DisplayName("Test Builder weakKeys()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.weakKeys()"})
  void testBuilderWeakKeys() {
    // Arrange
    Builder<Object, Object> builderResult = ConcurrentReferenceHashMap.builder();

    // Act
    Builder<Object, Object> actualWeakKeysResult = builderResult.weakKeys();

    // Assert
    assertSame(builderResult, actualWeakKeysResult);
  }

  /**
   * Test Builder {@link Builder#weakValues()}.
   *
   * <p>Method under test: {@link Builder#weakValues()}
   */
  @Test
  @DisplayName("Test Builder weakValues()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.weakValues()"})
  void testBuilderWeakValues() {
    // Arrange
    Builder<Object, Object> builderResult = ConcurrentReferenceHashMap.builder();

    // Act
    Builder<Object, Object> actualWeakValuesResult = builderResult.weakValues();

    // Assert
    assertSame(builderResult, actualWeakValuesResult);
  }
}
