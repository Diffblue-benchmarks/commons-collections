package org.apache.commons.collections4.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.NavigableSet;
import java.util.TreeSet;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class TransformedNavigableSetDiffblueTest {
  /**
   * Test {@link TransformedNavigableSet#transformedNavigableSet(NavigableSet, Transformer)}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>Then calls {@link Transformer#apply(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedNavigableSet#transformedNavigableSet(NavigableSet, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({
      "TransformedNavigableSet TransformedNavigableSet.transformedNavigableSet(NavigableSet, Transformer)"})
  public void testTransformedNavigableSet_givenApply_thenCallsApply() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    TransformedNavigableSet<Object> actualTransformedNavigableSetResult = TransformedNavigableSet
        .transformedNavigableSet(set, transformer);

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals(set, actualTransformedNavigableSetResult);
  }

  /**
   * Test {@link TransformedNavigableSet#transformedNavigableSet(NavigableSet, Transformer)}.
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.</li>
   *   <li>Then return {@link TreeSet#TreeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedNavigableSet#transformedNavigableSet(NavigableSet, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({
      "TransformedNavigableSet TransformedNavigableSet.transformedNavigableSet(NavigableSet, Transformer)"})
  public void testTransformedNavigableSet_whenTreeSet_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    TransformedNavigableSet<Object> actualTransformedNavigableSetResult = TransformedNavigableSet
        .transformedNavigableSet(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformedNavigableSetResult);
  }

  /**
   * Test {@link TransformedNavigableSet#transformingNavigableSet(NavigableSet, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link TreeSet#TreeSet()} add {@code 42}.</li>
   *   <li>Then return {@link TreeSet#TreeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedNavigableSet#transformingNavigableSet(NavigableSet, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({
      "TransformedNavigableSet TransformedNavigableSet.transformingNavigableSet(NavigableSet, Transformer)"})
  public void testTransformingNavigableSet_given42_whenTreeSetAdd42_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    // Act
    TransformedNavigableSet<Object> actualTransformingNavigableSetResult = TransformedNavigableSet
        .transformingNavigableSet(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformingNavigableSetResult);
  }

  /**
   * Test {@link TransformedNavigableSet#transformingNavigableSet(NavigableSet, Transformer)}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link TreeSet#TreeSet()} add {@code foo}.</li>
   *   <li>Then return {@link TreeSet#TreeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedNavigableSet#transformingNavigableSet(NavigableSet, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({
      "TransformedNavigableSet TransformedNavigableSet.transformingNavigableSet(NavigableSet, Transformer)"})
  public void testTransformingNavigableSet_givenFoo_whenTreeSetAddFoo_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("foo");
    set.add("42");

    // Act
    TransformedNavigableSet<Object> actualTransformingNavigableSetResult = TransformedNavigableSet
        .transformingNavigableSet(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformingNavigableSetResult);
  }

  /**
   * Test {@link TransformedNavigableSet#transformingNavigableSet(NavigableSet, Transformer)}.
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.</li>
   *   <li>Then return {@link TreeSet#TreeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedNavigableSet#transformingNavigableSet(NavigableSet, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({
      "TransformedNavigableSet TransformedNavigableSet.transformingNavigableSet(NavigableSet, Transformer)"})
  public void testTransformingNavigableSet_whenTreeSet_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    TransformedNavigableSet<Object> actualTransformingNavigableSetResult = TransformedNavigableSet
        .transformingNavigableSet(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformingNavigableSetResult);
  }

  /**
   * Test {@link TransformedNavigableSet#TransformedNavigableSet(NavigableSet, Transformer)}.
   * <p>
   * Method under test: {@link TransformedNavigableSet#TransformedNavigableSet(NavigableSet, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformedNavigableSet.<init>(NavigableSet, Transformer)"})
  public void testNewTransformedNavigableSet() {
    // Arrange and Act
    TransformedNavigableSet<Object> actualObjectSet = new TransformedNavigableSet<>(new TreeSet<>(),
        mock(Transformer.class));

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }
}
