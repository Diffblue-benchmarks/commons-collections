package org.apache.commons.collections4.map;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class ConcurrentReferenceHashMapDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link ConcurrentReferenceHashMap.Builder#setConcurrencyLevel(int)}
   *   <li>{@link ConcurrentReferenceHashMap.Builder#setInitialCapacity(int)}
   *   <li>
   * {@link ConcurrentReferenceHashMap.Builder#setKeyReferenceType(ConcurrentReferenceHashMap.ReferenceType)}
   *   <li>{@link ConcurrentReferenceHashMap.Builder#setLoadFactor(float)}
   *   <li>{@link ConcurrentReferenceHashMap.Builder#setOptions(EnumSet)}
   *   <li>{@link ConcurrentReferenceHashMap.Builder#setSourceMap(Map)}
   *   <li>
   * {@link ConcurrentReferenceHashMap.Builder#setValueReferenceType(ConcurrentReferenceHashMap.ReferenceType)}
   * </ul>
   */
  @Test
  public void testBuilderGettersAndSetters() {
    // Arrange
    ConcurrentReferenceHashMap.Builder<Object, Object> builder = new ConcurrentReferenceHashMap.Builder<>();

    // Act
    ConcurrentReferenceHashMap.Builder<Object, Object> actualSetConcurrencyLevelResult = builder.setConcurrencyLevel(1);
    ConcurrentReferenceHashMap.Builder<Object, Object> actualSetInitialCapacityResult = builder.setInitialCapacity(1);
    ConcurrentReferenceHashMap.Builder<Object, Object> actualSetKeyReferenceTypeResult = builder
        .setKeyReferenceType(ConcurrentReferenceHashMap.ReferenceType.STRONG);
    ConcurrentReferenceHashMap.Builder<Object, Object> actualSetLoadFactorResult = builder.setLoadFactor(10.0f);
    ConcurrentReferenceHashMap.Builder<Object, Object> actualSetOptionsResult = builder.setOptions(null);
    ConcurrentReferenceHashMap.Builder<Object, Object> actualSetSourceMapResult = builder.setSourceMap(new HashMap<>());

    // Assert
    assertSame(builder, actualSetConcurrencyLevelResult);
    assertSame(builder, actualSetInitialCapacityResult);
    assertSame(builder, actualSetKeyReferenceTypeResult);
    assertSame(builder, actualSetLoadFactorResult);
    assertSame(builder, actualSetOptionsResult);
    assertSame(builder, actualSetSourceMapResult);
    assertSame(builder, builder.setValueReferenceType(ConcurrentReferenceHashMap.ReferenceType.STRONG));
  }

  /**
   * Method under test: default or parameterless constructor of
   * {@link ConcurrentReferenceHashMap.Builder}
   */
  @Test
  public void testBuilderNewBuilder() {
    // Arrange and Act
    ConcurrentReferenceHashMap.Builder<Object, Object> actualBuilder = new ConcurrentReferenceHashMap.Builder<>();

    // Assert
    assertTrue(actualBuilder.get().isEmpty());
  }

  /**
   * Method under test: {@link ConcurrentReferenceHashMap.Builder#softKeys()}
   */
  @Test
  public void testBuilderSoftKeys() {
    // Arrange
    ConcurrentReferenceHashMap.Builder<Object, Object> builderResult = ConcurrentReferenceHashMap.builder();

    // Act
    ConcurrentReferenceHashMap.Builder<Object, Object> actualSoftKeysResult = builderResult.softKeys();

    // Assert
    assertTrue(actualSoftKeysResult.get().isEmpty());
    assertSame(builderResult, actualSoftKeysResult);
  }

  /**
   * Method under test: {@link ConcurrentReferenceHashMap.Builder#softValues()}
   */
  @Test
  public void testBuilderSoftValues() {
    // Arrange
    ConcurrentReferenceHashMap.Builder<Object, Object> builderResult = ConcurrentReferenceHashMap.builder();

    // Act
    ConcurrentReferenceHashMap.Builder<Object, Object> actualSoftValuesResult = builderResult.softValues();

    // Assert
    assertTrue(actualSoftValuesResult.get().isEmpty());
    assertSame(builderResult, actualSoftValuesResult);
  }

  /**
   * Method under test: {@link ConcurrentReferenceHashMap.Builder#strongKeys()}
   */
  @Test
  public void testBuilderStrongKeys() {
    // Arrange
    ConcurrentReferenceHashMap.Builder<Object, Object> builderResult = ConcurrentReferenceHashMap.builder();

    // Act
    ConcurrentReferenceHashMap.Builder<Object, Object> actualStrongKeysResult = builderResult.strongKeys();

    // Assert
    assertTrue(actualStrongKeysResult.get().isEmpty());
    assertSame(builderResult, actualStrongKeysResult);
  }

  /**
   * Method under test: {@link ConcurrentReferenceHashMap.Builder#strongValues()}
   */
  @Test
  public void testBuilderStrongValues() {
    // Arrange
    ConcurrentReferenceHashMap.Builder<Object, Object> builderResult = ConcurrentReferenceHashMap.builder();

    // Act
    ConcurrentReferenceHashMap.Builder<Object, Object> actualStrongValuesResult = builderResult.strongValues();

    // Assert
    assertTrue(actualStrongValuesResult.get().isEmpty());
    assertSame(builderResult, actualStrongValuesResult);
  }

  /**
   * Method under test: {@link ConcurrentReferenceHashMap.Builder#weakKeys()}
   */
  @Test
  public void testBuilderWeakKeys() {
    // Arrange
    ConcurrentReferenceHashMap.Builder<Object, Object> builderResult = ConcurrentReferenceHashMap.builder();

    // Act
    ConcurrentReferenceHashMap.Builder<Object, Object> actualWeakKeysResult = builderResult.weakKeys();

    // Assert
    assertTrue(actualWeakKeysResult.get().isEmpty());
    assertSame(builderResult, actualWeakKeysResult);
  }

  /**
   * Method under test: {@link ConcurrentReferenceHashMap.Builder#weakValues()}
   */
  @Test
  public void testBuilderWeakValues() {
    // Arrange
    ConcurrentReferenceHashMap.Builder<Object, Object> builderResult = ConcurrentReferenceHashMap.builder();

    // Act
    ConcurrentReferenceHashMap.Builder<Object, Object> actualWeakValuesResult = builderResult.weakValues();

    // Assert
    assertTrue(actualWeakValuesResult.get().isEmpty());
    assertSame(builderResult, actualWeakValuesResult);
  }
}
