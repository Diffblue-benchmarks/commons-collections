package org.apache.commons.collections4.bloomfilter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Deque;
import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apache.commons.collections4.bloomfilter.LayerManager.Builder;
import org.apache.commons.collections4.bloomfilter.LayerManager.Cleanup;
import org.apache.commons.collections4.bloomfilter.LayerManager.ExtendCheck;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LayerManagerDiffblueTest {
  /**
   * Test Builder {@link Builder#get()}.
   *
   * <ul>
   *   <li>Then return Depth is one.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get()}
   */
  @Test
  @DisplayName("Test Builder get(); then return Depth is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LayerManager Builder.get()"})
  void testBuilderGet_thenReturnDepthIsOne() {
    // Arrange
    Supplier<SimpleBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);
    when(supplier.get()).thenReturn(simpleBloomFilter);

    Builder<SimpleBloomFilter> builderResult = LayerManager.builder();
    builderResult.setSupplier(supplier);

    // Act
    LayerManager<SimpleBloomFilter> actualGetResult = builderResult.get();

    // Assert
    verify(supplier).get();
    assertEquals(1, actualGetResult.getDepth());
    assertSame(simpleBloomFilter, actualGetResult.first());
    assertSame(simpleBloomFilter, actualGetResult.getTarget());
  }

  /**
   * Test Builder getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Builder#setCleanup(Consumer)}
   *   <li>{@link Builder#setExtendCheck(Predicate)}
   *   <li>{@link Builder#setSupplier(Supplier)}
   * </ul>
   */
  @Test
  @DisplayName("Test Builder getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Builder Builder.setCleanup(Consumer)",
    "Builder Builder.setExtendCheck(Predicate)",
    "Builder Builder.setSupplier(Supplier)"
  })
  void testBuilderGettersAndSetters() {
    // Arrange
    Builder<SimpleBloomFilter> builderResult = LayerManager.builder();

    // Act
    Builder<SimpleBloomFilter> actualSetCleanupResult =
        builderResult.setCleanup(mock(Consumer.class));
    Builder<SimpleBloomFilter> actualSetExtendCheckResult =
        builderResult.setExtendCheck(mock(Predicate.class));
    Builder<SimpleBloomFilter> actualSetSupplierResult =
        builderResult.setSupplier(mock(Supplier.class));

    // Assert
    assertSame(builderResult, actualSetCleanupResult);
    assertSame(builderResult, actualSetExtendCheckResult);
    assertSame(builderResult, actualSetSupplierResult);
  }

  /**
   * Test Cleanup {@link Cleanup#removeEmptyTarget()}.
   *
   * <ul>
   *   <li>Then {@link LinkedList#LinkedList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link Cleanup#removeEmptyTarget()}
   */
  @Test
  @DisplayName("Test Cleanup removeEmptyTarget(); then LinkedList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Consumer Cleanup.removeEmptyTarget()"})
  void testCleanupRemoveEmptyTarget_thenLinkedListEmpty() {
    // Arrange and Act
    Consumer<Deque<SimpleBloomFilter>> actualRemoveEmptyTargetResult = Cleanup.removeEmptyTarget();
    LinkedList<SimpleBloomFilter> simpleBloomFilterList = new LinkedList<>();
    actualRemoveEmptyTargetResult.accept(simpleBloomFilterList);

    // Assert that nothing has changed
    assertTrue(simpleBloomFilterList.isEmpty());
  }

  /**
   * Test Cleanup {@link Cleanup#removeEmptyTarget()}.
   *
   * <ul>
   *   <li>Then {@link LinkedList#LinkedList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link Cleanup#removeEmptyTarget()}
   */
  @Test
  @DisplayName("Test Cleanup removeEmptyTarget(); then LinkedList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Consumer Cleanup.removeEmptyTarget()"})
  void testCleanupRemoveEmptyTarget_thenLinkedListEmpty2() {
    // Arrange and Act
    Consumer<Deque<SimpleBloomFilter>> actualRemoveEmptyTargetResult = Cleanup.removeEmptyTarget();
    LinkedList<SimpleBloomFilter> simpleBloomFilterList = new LinkedList<>();
    Shape shape = Shape.fromKM(19088743, 10);
    simpleBloomFilterList.add(new SimpleBloomFilter(shape));
    actualRemoveEmptyTargetResult.accept(simpleBloomFilterList);

    // Assert
    assertTrue(simpleBloomFilterList.isEmpty());
  }

  /**
   * Test ExtendCheck {@link ExtendCheck#advanceOnCount(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return test {@link LayerManager}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendCheck#advanceOnCount(int)}
   */
  @Test
  @DisplayName("Test ExtendCheck advanceOnCount(int); when one; then return test LayerManager")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate ExtendCheck.advanceOnCount(int)"})
  void testExtendCheckAdvanceOnCount_whenOne_thenReturnTestLayerManager() {
    // Arrange and Act
    Predicate<LayerManager<SimpleBloomFilter>> actualAdvanceOnCountResult =
        ExtendCheck.advanceOnCount(1);

    // Assert
    assertTrue(actualAdvanceOnCountResult.test(mock(LayerManager.class)));
  }

  /**
   * Test ExtendCheck {@link ExtendCheck#advanceOnCount(int)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return not test {@link LayerManager}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendCheck#advanceOnCount(int)}
   */
  @Test
  @DisplayName(
      "Test ExtendCheck advanceOnCount(int); when three; then return not test LayerManager")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate ExtendCheck.advanceOnCount(int)"})
  void testExtendCheckAdvanceOnCount_whenThree_thenReturnNotTestLayerManager() {
    // Arrange and Act
    Predicate<LayerManager<SimpleBloomFilter>> actualAdvanceOnCountResult =
        ExtendCheck.advanceOnCount(3);

    // Assert
    assertFalse(actualAdvanceOnCountResult.test(mock(LayerManager.class)));
  }

  /**
   * Test ExtendCheck {@link ExtendCheck#advanceOnPopulated()}.
   *
   * <ul>
   *   <li>Then return not test {@link LayerManager}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendCheck#advanceOnPopulated()}
   */
  @Test
  @DisplayName("Test ExtendCheck advanceOnPopulated(); then return not test LayerManager")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate ExtendCheck.advanceOnPopulated()"})
  void testExtendCheckAdvanceOnPopulated_thenReturnNotTestLayerManager() {
    // Arrange and Act
    Predicate<LayerManager<SimpleBloomFilter>> actualAdvanceOnPopulatedResult =
        ExtendCheck.advanceOnPopulated();
    LayerManager<SimpleBloomFilter> layerManager = mock(LayerManager.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(layerManager.last()).thenReturn(new SimpleBloomFilter(shape));
    boolean actualTestResult = actualAdvanceOnPopulatedResult.test(layerManager);

    // Assert
    verify(layerManager).last();
    assertFalse(actualTestResult);
  }

  /**
   * Test ExtendCheck {@link ExtendCheck#advanceOnPopulated()}.
   *
   * <ul>
   *   <li>Then return test {@link LayerManager}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendCheck#advanceOnPopulated()}
   */
  @Test
  @DisplayName("Test ExtendCheck advanceOnPopulated(); then return test LayerManager")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate ExtendCheck.advanceOnPopulated()"})
  void testExtendCheckAdvanceOnPopulated_thenReturnTestLayerManager() {
    // Arrange and Act
    Predicate<LayerManager<SimpleBloomFilter>> actualAdvanceOnPopulatedResult =
        ExtendCheck.advanceOnPopulated();
    SimpleBloomFilter simpleBloomFilter = mock(SimpleBloomFilter.class);
    when(simpleBloomFilter.isEmpty()).thenReturn(false);
    LayerManager<SimpleBloomFilter> layerManager = mock(LayerManager.class);
    when(layerManager.last()).thenReturn(simpleBloomFilter);
    boolean actualTestResult = actualAdvanceOnPopulatedResult.test(layerManager);

    // Assert
    verify(layerManager).last();
    verify(simpleBloomFilter).isEmpty();
    assertTrue(actualTestResult);
  }

  /**
   * Test ExtendCheck {@link ExtendCheck#advanceOnPopulated()}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendCheck#advanceOnPopulated()}
   */
  @Test
  @DisplayName("Test ExtendCheck advanceOnPopulated(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate ExtendCheck.advanceOnPopulated()"})
  void testExtendCheckAdvanceOnPopulated_thenThrowIllegalArgumentException() {
    // Arrange and Act
    Predicate<LayerManager<SimpleBloomFilter>> actualAdvanceOnPopulatedResult =
        ExtendCheck.advanceOnPopulated();
    LayerManager<SimpleBloomFilter> layerManager = mock(LayerManager.class);
    when(layerManager.last()).thenThrow(new IllegalArgumentException());

    // Assert
    assertThrows(
        IllegalArgumentException.class, () -> actualAdvanceOnPopulatedResult.test(layerManager));
    verify(layerManager).last();
  }

  /**
   * Test ExtendCheck {@link ExtendCheck#advanceOnSaturation(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return not test {@link LayerManager}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendCheck#advanceOnSaturation(double)}
   */
  @Test
  @DisplayName(
      "Test ExtendCheck advanceOnSaturation(double); when ten; then return not test LayerManager")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate ExtendCheck.advanceOnSaturation(double)"})
  void testExtendCheckAdvanceOnSaturation_whenTen_thenReturnNotTestLayerManager() {
    // Arrange and Act
    Predicate<LayerManager<SimpleBloomFilter>> actualAdvanceOnSaturationResult =
        ExtendCheck.advanceOnSaturation(10.0d);
    LayerManager<SimpleBloomFilter> layerManager = mock(LayerManager.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(layerManager.last()).thenReturn(new SimpleBloomFilter(shape));
    boolean actualTestResult = actualAdvanceOnSaturationResult.test(layerManager);

    // Assert
    verify(layerManager).last();
    assertFalse(actualTestResult);
  }

  /**
   * Test ExtendCheck {@link ExtendCheck#advanceOnSaturation(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendCheck#advanceOnSaturation(double)}
   */
  @Test
  @DisplayName(
      "Test ExtendCheck advanceOnSaturation(double); when ten; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate ExtendCheck.advanceOnSaturation(double)"})
  void testExtendCheckAdvanceOnSaturation_whenTen_thenThrowIllegalArgumentException() {
    // Arrange and Act
    Predicate<LayerManager<SimpleBloomFilter>> actualAdvanceOnSaturationResult =
        ExtendCheck.advanceOnSaturation(10.0d);
    LayerManager<SimpleBloomFilter> layerManager = mock(LayerManager.class);
    when(layerManager.last()).thenThrow(new IllegalArgumentException());

    // Assert
    assertThrows(
        IllegalArgumentException.class, () -> actualAdvanceOnSaturationResult.test(layerManager));
    verify(layerManager).last();
  }

  /**
   * Test ExtendCheck {@link ExtendCheck#neverAdvance()}.
   *
   * <p>Method under test: {@link ExtendCheck#neverAdvance()}
   */
  @Test
  @DisplayName("Test ExtendCheck neverAdvance()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate ExtendCheck.neverAdvance()"})
  void testExtendCheckNeverAdvance() {
    // Arrange and Act
    Predicate<LayerManager<SimpleBloomFilter>> actualNeverAdvanceResult =
        ExtendCheck.neverAdvance();

    // Assert
    assertFalse(actualNeverAdvanceResult.test(mock(LayerManager.class)));
  }
}
