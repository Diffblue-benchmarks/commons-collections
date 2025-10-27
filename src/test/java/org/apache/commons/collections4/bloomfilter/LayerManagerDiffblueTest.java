package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.Deque;
import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.junit.Test;

public class LayerManagerDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link LayerManager.Builder#setCleanup(Consumer)}
   *   <li>{@link LayerManager.Builder#setExtendCheck(Predicate)}
   *   <li>{@link LayerManager.Builder#setSupplier(Supplier)}
   * </ul>
   */
  @Test
  public void testBuilderGettersAndSetters() {
    // Arrange
    LayerManager.Builder<SimpleBloomFilter> builderResult = LayerManager.builder();

    // Act
    LayerManager.Builder<SimpleBloomFilter> actualSetCleanupResult = builderResult.setCleanup(null);
    LayerManager.Builder<SimpleBloomFilter> actualSetExtendCheckResult = builderResult.setExtendCheck(null);

    // Assert
    assertSame(builderResult, actualSetCleanupResult);
    assertSame(builderResult, actualSetExtendCheckResult);
    assertSame(builderResult, builderResult.setSupplier(null));
  }

  /**
   * Method under test: {@link LayerManager.Cleanup#removeEmptyTarget()}
   */
  @Test
  public void testCleanupRemoveEmptyTarget() {
    // Arrange and Act
    Consumer<Deque<SimpleBloomFilter>> actualRemoveEmptyTargetResult = LayerManager.Cleanup.removeEmptyTarget();
    LinkedList<SimpleBloomFilter> simpleBloomFilterList = new LinkedList<>();
    actualRemoveEmptyTargetResult.accept(simpleBloomFilterList);

    // Assert that nothing has changed
    assertTrue(simpleBloomFilterList.isEmpty());
  }

  /**
   * Method under test: {@link LayerManager.Cleanup#removeEmptyTarget()}
   */
  @Test
  public void testCleanupRemoveEmptyTarget2() {
    // Arrange and Act
    Consumer<Deque<SimpleBloomFilter>> actualRemoveEmptyTargetResult = LayerManager.Cleanup.removeEmptyTarget();
    LinkedList<SimpleBloomFilter> simpleBloomFilterList = new LinkedList<>();
    simpleBloomFilterList.add(new SimpleBloomFilter(Shape.fromKM(19088743, 10)));
    actualRemoveEmptyTargetResult.accept(simpleBloomFilterList);

    // Assert
    assertTrue(simpleBloomFilterList.isEmpty());
  }
}
