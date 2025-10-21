package org.apache.commons.collections4.bag;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.SortedBag;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class TransformedSortedBagDiffblueTest {
  /**
   * Test {@link TransformedSortedBag#transformedSortedBag(SortedBag, Transformer)}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>Then calls {@link Transformer#apply(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedSortedBag#transformedSortedBag(SortedBag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TransformedSortedBag TransformedSortedBag.transformedSortedBag(SortedBag, Transformer)"})
  public void testTransformedSortedBag_givenApply_thenCallsApply() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    TransformedSortedBag<Object> actualTransformedSortedBagResult = TransformedSortedBag.transformedSortedBag(bag,
        transformer);

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals(bag, actualTransformedSortedBagResult);
  }

  /**
   * Test {@link TransformedSortedBag#transformedSortedBag(SortedBag, Transformer)}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>Then calls {@link Transformer#apply(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedSortedBag#transformedSortedBag(SortedBag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TransformedSortedBag TransformedSortedBag.transformedSortedBag(SortedBag, Transformer)"})
  public void testTransformedSortedBag_givenApply_thenCallsApply2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    TransformedSortedBag<Object> actualTransformedSortedBagResult = TransformedSortedBag.transformedSortedBag(bag,
        transformer);

    // Assert
    verify(transformer, atLeast(1)).apply(isA(Object.class));
    assertEquals(bag, actualTransformedSortedBagResult);
  }

  /**
   * Test {@link TransformedSortedBag#transformedSortedBag(SortedBag, Transformer)}.
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.</li>
   *   <li>Then return {@link TreeBag#TreeBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedSortedBag#transformedSortedBag(SortedBag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TransformedSortedBag TransformedSortedBag.transformedSortedBag(SortedBag, Transformer)"})
  public void testTransformedSortedBag_whenTreeBag_thenReturnTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    TransformedSortedBag<Object> actualTransformedSortedBagResult = TransformedSortedBag.transformedSortedBag(bag,
        mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformedSortedBagResult);
  }

  /**
   * Test {@link TransformedSortedBag#transformingSortedBag(SortedBag, Transformer)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.</li>
   *   <li>Then return {@link TreeBag#TreeBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedSortedBag#transformingSortedBag(SortedBag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TransformedSortedBag TransformedSortedBag.transformingSortedBag(SortedBag, Transformer)"})
  public void testTransformingSortedBag_givenObject_whenTreeBagAddObject_thenReturnTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act
    TransformedSortedBag<Object> actualTransformingSortedBagResult = TransformedSortedBag.transformingSortedBag(bag,
        mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingSortedBagResult);
  }

  /**
   * Test {@link TransformedSortedBag#transformingSortedBag(SortedBag, Transformer)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.</li>
   *   <li>Then return {@link TreeBag#TreeBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedSortedBag#transformingSortedBag(SortedBag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TransformedSortedBag TransformedSortedBag.transformingSortedBag(SortedBag, Transformer)"})
  public void testTransformingSortedBag_givenObject_whenTreeBagAddObject_thenReturnTreeBag2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    TransformedSortedBag<Object> actualTransformingSortedBagResult = TransformedSortedBag.transformingSortedBag(bag,
        mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingSortedBagResult);
  }

  /**
   * Test {@link TransformedSortedBag#transformingSortedBag(SortedBag, Transformer)}.
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.</li>
   *   <li>Then return {@link TreeBag#TreeBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedSortedBag#transformingSortedBag(SortedBag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TransformedSortedBag TransformedSortedBag.transformingSortedBag(SortedBag, Transformer)"})
  public void testTransformingSortedBag_whenTreeBag_thenReturnTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    TransformedSortedBag<Object> actualTransformingSortedBagResult = TransformedSortedBag.transformingSortedBag(bag,
        mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingSortedBagResult);
  }

  /**
   * Test {@link TransformedSortedBag#TransformedSortedBag(SortedBag, Transformer)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.</li>
   *   <li>Then return {@link TreeBag#TreeBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedSortedBag#TransformedSortedBag(SortedBag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformedSortedBag.<init>(SortedBag, Transformer)"})
  public void testNewTransformedSortedBag_givenObject_whenTreeBagAddObject_thenReturnTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act and Assert
    assertEquals(bag, new TransformedSortedBag<>(bag, mock(Transformer.class)));
  }

  /**
   * Test {@link TransformedSortedBag#TransformedSortedBag(SortedBag, Transformer)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.</li>
   *   <li>Then return {@link TreeBag#TreeBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedSortedBag#TransformedSortedBag(SortedBag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformedSortedBag.<init>(SortedBag, Transformer)"})
  public void testNewTransformedSortedBag_givenObject_whenTreeBagAddObject_thenReturnTreeBag2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act and Assert
    assertEquals(bag, new TransformedSortedBag<>(bag, mock(Transformer.class)));
  }

  /**
   * Test {@link TransformedSortedBag#TransformedSortedBag(SortedBag, Transformer)}.
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.</li>
   *   <li>Then return {@link TreeBag#TreeBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedSortedBag#TransformedSortedBag(SortedBag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformedSortedBag.<init>(SortedBag, Transformer)"})
  public void testNewTransformedSortedBag_whenTreeBag_thenReturnTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act and Assert
    assertEquals(bag, new TransformedSortedBag<>(bag, mock(Transformer.class)));
  }
}
