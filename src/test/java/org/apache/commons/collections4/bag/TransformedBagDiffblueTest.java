package org.apache.commons.collections4.bag;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TransformedBagDiffblueTest {
  /**
   * Test {@link TransformedBag#transformedBag(Bag, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then calls {@link Transformer#apply(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedBag#transformedBag(Bag, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedBag(Bag, Transformer); given 'Object'; when HashBag() add 'Object'; then calls apply(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag TransformedBag.transformedBag(Bag, Transformer)"})
  void testTransformedBag_givenObject_whenHashBagAddObject_thenCallsApply() {
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
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then calls {@link Transformer#apply(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedBag#transformedBag(Bag, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedBag(Bag, Transformer); given 'Object'; when HashBag() add 'Object'; then calls apply(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag TransformedBag.transformedBag(Bag, Transformer)"})
  void testTransformedBag_givenObject_whenHashBagAddObject_thenCallsApply2() {
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
   *
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedBag#transformedBag(Bag, Transformer)}
   */
  @Test
  @DisplayName("Test transformedBag(Bag, Transformer); when HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag TransformedBag.transformedBag(Bag, Transformer)"})
  void testTransformedBag_whenHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualTransformedBagResult =
        TransformedBag.transformedBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformedBagResult);
  }

  /**
   * Test {@link TransformedBag#transformingBag(Bag, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedBag#transformingBag(Bag, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingBag(Bag, Transformer); given 'Object'; when HashBag() add 'Object'; then return HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag TransformedBag.transformingBag(Bag, Transformer)"})
  void testTransformingBag_givenObject_whenHashBagAddObject_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    Bag<Object> actualTransformingBagResult =
        TransformedBag.transformingBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingBagResult);
  }

  /**
   * Test {@link TransformedBag#transformingBag(Bag, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedBag#transformingBag(Bag, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingBag(Bag, Transformer); given 'Object'; when HashBag() add 'Object'; then return HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag TransformedBag.transformingBag(Bag, Transformer)"})
  void testTransformingBag_givenObject_whenHashBagAddObject_thenReturnHashBag2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    Bag<Object> actualTransformingBagResult =
        TransformedBag.transformingBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingBagResult);
  }

  /**
   * Test {@link TransformedBag#transformingBag(Bag, Transformer)}.
   *
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.
   *   <li>Then return {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedBag#transformingBag(Bag, Transformer)}
   */
  @Test
  @DisplayName("Test transformingBag(Bag, Transformer); when HashBag(); then return HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag TransformedBag.transformingBag(Bag, Transformer)"})
  void testTransformingBag_whenHashBag_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualTransformingBagResult =
        TransformedBag.transformingBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingBagResult);
  }

  /**
   * Test {@link TransformedBag#TransformedBag(Bag, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedBag#TransformedBag(Bag, Transformer)}
   */
  @Test
  @DisplayName(
      "Test new TransformedBag(Bag, Transformer); given 'Object'; when HashBag() add 'Object'; then return HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransformedBag.<init>(Bag, Transformer)"})
  void testNewTransformedBag_givenObject_whenHashBagAddObject_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    TransformedBag<Object> actualTransformedBag =
        new TransformedBag<>(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformedBag);
  }

  /**
   * Test {@link TransformedBag#TransformedBag(Bag, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedBag#TransformedBag(Bag, Transformer)}
   */
  @Test
  @DisplayName(
      "Test new TransformedBag(Bag, Transformer); given 'Object'; when HashBag() add 'Object'; then return HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransformedBag.<init>(Bag, Transformer)"})
  void testNewTransformedBag_givenObject_whenHashBagAddObject_thenReturnHashBag2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    TransformedBag<Object> actualTransformedBag =
        new TransformedBag<>(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformedBag);
  }

  /**
   * Test {@link TransformedBag#TransformedBag(Bag, Transformer)}.
   *
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.
   *   <li>Then return {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedBag#TransformedBag(Bag, Transformer)}
   */
  @Test
  @DisplayName("Test new TransformedBag(Bag, Transformer); when HashBag(); then return HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransformedBag.<init>(Bag, Transformer)"})
  void testNewTransformedBag_whenHashBag_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    TransformedBag<Object> actualTransformedBag =
        new TransformedBag<>(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformedBag);
  }
}
