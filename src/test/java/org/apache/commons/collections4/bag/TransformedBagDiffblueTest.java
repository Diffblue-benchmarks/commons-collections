package org.apache.commons.collections4.bag;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class TransformedBagDiffblueTest {
  /**
   * Test {@link TransformedBag#transformedBag(Bag, Transformer)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then calls {@link Transformer#apply(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedBag#transformedBag(Bag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag TransformedBag.transformedBag(Bag, Transformer)"})
  public void testTransformedBag_givenObject_whenHashBagAddObject_thenCallsApply() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Bag<Object> actualTransformedBagResult = TransformedBag.transformedBag(bag, transformer);

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals(bag, actualTransformedBagResult);
  }

  /**
   * Test {@link TransformedBag#transformedBag(Bag, Transformer)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then calls {@link Transformer#apply(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedBag#transformedBag(Bag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag TransformedBag.transformedBag(Bag, Transformer)"})
  public void testTransformedBag_givenObject_whenHashBagAddObject_thenCallsApply2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Bag<Object> actualTransformedBagResult = TransformedBag.transformedBag(bag, transformer);

    // Assert
    verify(transformer, atLeast(1)).apply(isA(Object.class));
    assertEquals(bag, actualTransformedBagResult);
  }

  /**
   * Test {@link TransformedBag#transformedBag(Bag, Transformer)}.
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedBag#transformedBag(Bag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag TransformedBag.transformedBag(Bag, Transformer)"})
  public void testTransformedBag_whenHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualTransformedBagResult = TransformedBag.transformedBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformedBagResult);
  }

  /**
   * Test {@link TransformedBag#transformingBag(Bag, Transformer)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then return {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedBag#transformingBag(Bag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag TransformedBag.transformingBag(Bag, Transformer)"})
  public void testTransformingBag_givenObject_whenHashBagAddObject_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    Bag<Object> actualTransformingBagResult = TransformedBag.transformingBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingBagResult);
  }

  /**
   * Test {@link TransformedBag#transformingBag(Bag, Transformer)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then return {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedBag#transformingBag(Bag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag TransformedBag.transformingBag(Bag, Transformer)"})
  public void testTransformingBag_givenObject_whenHashBagAddObject_thenReturnHashBag2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    Bag<Object> actualTransformingBagResult = TransformedBag.transformingBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingBagResult);
  }

  /**
   * Test {@link TransformedBag#transformingBag(Bag, Transformer)}.
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.</li>
   *   <li>Then return {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedBag#transformingBag(Bag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag TransformedBag.transformingBag(Bag, Transformer)"})
  public void testTransformingBag_whenHashBag_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualTransformingBagResult = TransformedBag.transformingBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingBagResult);
  }

  /**
   * Test {@link TransformedBag#TransformedBag(Bag, Transformer)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then return {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedBag#TransformedBag(Bag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformedBag.<init>(Bag, Transformer)"})
  public void testNewTransformedBag_givenObject_whenHashBagAddObject_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act and Assert
    assertEquals(bag, new TransformedBag<>(bag, mock(Transformer.class)));
  }

  /**
   * Test {@link TransformedBag#TransformedBag(Bag, Transformer)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then return {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedBag#TransformedBag(Bag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformedBag.<init>(Bag, Transformer)"})
  public void testNewTransformedBag_givenObject_whenHashBagAddObject_thenReturnHashBag2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act and Assert
    assertEquals(bag, new TransformedBag<>(bag, mock(Transformer.class)));
  }

  /**
   * Test {@link TransformedBag#TransformedBag(Bag, Transformer)}.
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.</li>
   *   <li>Then return {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedBag#TransformedBag(Bag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformedBag.<init>(Bag, Transformer)"})
  public void testNewTransformedBag_whenHashBag_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act and Assert
    assertEquals(bag, new TransformedBag<>(bag, mock(Transformer.class)));
  }
}
