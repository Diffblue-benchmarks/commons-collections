package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.awt.Component;
import java.util.AbstractMap;
import java.util.NoSuchElementException;
import org.junit.Test;

public class TreeBidiMapDiffblueTest {
  /**
   * Method under test: {@link TreeBidiMap.AbstractViewIterator#navigateNext()}
   */
  @Test
  public void testAbstractViewIteratorNavigateNext() {
    // Arrange, Act and Assert
    assertThrows(NoSuchElementException.class,
        () -> ((new TreeBidiMap()).new InverseViewMapEntryIterator()).navigateNext());
  }

  /**
   * Method under test:
   * {@link TreeBidiMap.AbstractViewIterator#navigatePrevious()}
   */
  @Test
  public void testAbstractViewIteratorNavigatePrevious() {
    // Arrange, Act and Assert
    assertThrows(NoSuchElementException.class,
        () -> ((new TreeBidiMap()).new InverseViewMapEntryIterator()).navigatePrevious());
  }

  /**
   * Method under test: {@link TreeBidiMap.AbstractViewIterator#remove()}
   */
  @Test
  public void testAbstractViewIteratorRemove() {
    // Arrange, Act and Assert
    assertThrows(IllegalStateException.class, () -> ((new TreeBidiMap()).new InverseViewMapEntryIterator()).remove());
  }

  /**
   * Method under test: {@link TreeBidiMap.EntryView#EntryView(TreeBidiMap)}
   */
  @Test
  public void testEntryViewNewEntryView() {
    // Arrange, Act and Assert
    assertTrue(((new TreeBidiMap()).new EntryView()).isEmpty());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link TreeBidiMap#equals(Object)}
   *   <li>{@link TreeBidiMap#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    TreeBidiMap<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    TreeBidiMap<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap2 = new TreeBidiMap<>();

    // Act and Assert
    assertEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, baselineResizeBehaviorBaselineResizeBehaviorMap2);
    int expectedHashCodeResult = baselineResizeBehaviorBaselineResizeBehaviorMap.hashCode();
    assertEquals(expectedHashCodeResult, baselineResizeBehaviorBaselineResizeBehaviorMap2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link TreeBidiMap#equals(Object)}
   *   <li>{@link TreeBidiMap#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    TreeBidiMap<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(Component.BaselineResizeBehavior.CONSTANT_ASCENT,
        Component.BaselineResizeBehavior.CONSTANT_DESCENT);

    TreeBidiMap<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap2 = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap2.put(Component.BaselineResizeBehavior.CONSTANT_ASCENT,
        Component.BaselineResizeBehavior.CONSTANT_DESCENT);

    // Act and Assert
    assertEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, baselineResizeBehaviorBaselineResizeBehaviorMap2);
    int expectedHashCodeResult = baselineResizeBehaviorBaselineResizeBehaviorMap.hashCode();
    assertEquals(expectedHashCodeResult, baselineResizeBehaviorBaselineResizeBehaviorMap2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link TreeBidiMap#equals(Object)}
   *   <li>{@link TreeBidiMap#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    TreeBidiMap<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, baselineResizeBehaviorBaselineResizeBehaviorMap);
    int expectedHashCodeResult = baselineResizeBehaviorBaselineResizeBehaviorMap.hashCode();
    assertEquals(expectedHashCodeResult, baselineResizeBehaviorBaselineResizeBehaviorMap.hashCode());
  }

  /**
   * Method under test: {@link TreeBidiMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    TreeBidiMap<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(Component.BaselineResizeBehavior.CONSTANT_ASCENT,
        Component.BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNotEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, new TreeBidiMap<>());
  }

  /**
   * Method under test: {@link TreeBidiMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    TreeBidiMap<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(Component.BaselineResizeBehavior.CONSTANT_ASCENT,
        Component.BaselineResizeBehavior.CONSTANT_ASCENT);

    TreeBidiMap<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap2 = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap2.put(Component.BaselineResizeBehavior.CONSTANT_DESCENT,
        Component.BaselineResizeBehavior.CONSTANT_DESCENT);

    // Act and Assert
    assertNotEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, baselineResizeBehaviorBaselineResizeBehaviorMap2);
  }

  /**
   * Method under test: {@link TreeBidiMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    TreeBidiMap<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(Component.BaselineResizeBehavior.CONSTANT_ASCENT,
        Component.BaselineResizeBehavior.CONSTANT_ASCENT);

    TreeBidiMap<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap2 = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap2.put(Component.BaselineResizeBehavior.CONSTANT_ASCENT,
        Component.BaselineResizeBehavior.CONSTANT_DESCENT);

    // Act and Assert
    assertNotEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, baselineResizeBehaviorBaselineResizeBehaviorMap2);
  }

  /**
   * Method under test: {@link TreeBidiMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    TreeBidiMap<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(Component.BaselineResizeBehavior.CENTER_OFFSET,
        Component.BaselineResizeBehavior.CONSTANT_ASCENT);

    TreeBidiMap<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap2 = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap2.put(Component.BaselineResizeBehavior.CONSTANT_DESCENT,
        Component.BaselineResizeBehavior.CONSTANT_DESCENT);

    // Act and Assert
    assertNotEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, baselineResizeBehaviorBaselineResizeBehaviorMap2);
  }

  /**
   * Method under test: {@link TreeBidiMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    TreeBidiMap<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertNotEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, null);
  }

  /**
   * Method under test: {@link TreeBidiMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    TreeBidiMap<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertNotEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, "Different type to TreeBidiMap");
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link TreeBidiMap#toString()}
   *   <li>{@link TreeBidiMap#size()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    TreeBidiMap<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act
    String actualToStringResult = baselineResizeBehaviorBaselineResizeBehaviorMap.toString();

    // Assert
    assertEquals("{}", actualToStringResult);
    assertEquals(0, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
  }

  /**
   * Method under test:
   * {@link TreeBidiMap.InverseEntryView#InverseEntryView(TreeBidiMap)}
   */
  @Test
  public void testInverseEntryViewNewInverseEntryView() {
    // Arrange, Act and Assert
    assertTrue(((new TreeBidiMap()).new InverseEntryView()).isEmpty());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link TreeBidiMap.Inverse#Inverse(TreeBidiMap)}
   *   <li>{@link TreeBidiMap.Inverse#toString()}
   * </ul>
   */
  @Test
  public void testInverseGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("{}", ((new TreeBidiMap()).new Inverse()).toString());
  }

  /**
   * Method under test:
   * {@link TreeBidiMap.InverseViewMapEntryIterator#InverseViewMapEntryIterator(TreeBidiMap)}
   */
  @Test
  public void testInverseViewMapEntryIteratorNewInverseViewMapEntryIterator() {
    // Arrange, Act and Assert
    assertFalse(((new TreeBidiMap()).new InverseViewMapEntryIterator()).hasNext());
  }

  /**
   * Method under test: {@link TreeBidiMap.InverseViewMapIterator#getKey()}
   */
  @Test
  public void testInverseViewMapIteratorGetKey() {
    // Arrange, Act and Assert
    assertThrows(IllegalStateException.class,
        () -> ((new TreeBidiMap()).new InverseViewMapIterator(TreeBidiMap.DataElement.KEY)).getKey());
  }

  /**
   * Method under test: {@link TreeBidiMap.InverseViewMapIterator#getValue()}
   */
  @Test
  public void testInverseViewMapIteratorGetValue() {
    // Arrange, Act and Assert
    assertThrows(IllegalStateException.class,
        () -> ((new TreeBidiMap()).new InverseViewMapIterator(TreeBidiMap.DataElement.KEY)).getValue());
  }

  /**
   * Method under test:
   * {@link TreeBidiMap.InverseViewMapIterator#InverseViewMapIterator(TreeBidiMap, TreeBidiMap.DataElement)}
   */
  @Test
  public void testInverseViewMapIteratorNewInverseViewMapIterator() {
    // Arrange, Act and Assert
    assertFalse(((new TreeBidiMap()).new InverseViewMapIterator(TreeBidiMap.DataElement.KEY)).hasNext());
  }

  /**
   * Method under test:
   * {@link TreeBidiMap.InverseViewMapIterator#setValue(Comparable)}
   */
  @Test
  public void testInverseViewMapIteratorSetValue() {
    // Arrange, Act and Assert
    assertThrows(UnsupportedOperationException.class,
        () -> ((new TreeBidiMap()).new InverseViewMapIterator(TreeBidiMap.DataElement.KEY))
            .setValue(TreeBidiMap.DataElement.KEY));
  }

  /**
   * Method under test:
   * {@link TreeBidiMap.KeyView#KeyView(TreeBidiMap, TreeBidiMap.DataElement)}
   */
  @Test
  public void testKeyViewNewKeyView() {
    // Arrange, Act and Assert
    assertTrue(((new TreeBidiMap()).new KeyView(TreeBidiMap.DataElement.KEY)).isEmpty());
  }

  /**
   * Method under test: {@link TreeBidiMap#TreeBidiMap()}
   */
  @Test
  public void testNewTreeBidiMap() {
    // Arrange and Act
    TreeBidiMap<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> actualBaselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Assert
    assertTrue(actualBaselineResizeBehaviorBaselineResizeBehaviorMap.isEmpty());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link TreeBidiMap.Node#equals(Object)}
   *   <li>{@link TreeBidiMap.Node#hashCode()}
   * </ul>
   */
  @Test
  public void testNodeEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    TreeBidiMap.Node<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> node = new TreeBidiMap.Node<>(
        Component.BaselineResizeBehavior.CONSTANT_ASCENT, Component.BaselineResizeBehavior.CONSTANT_ASCENT);
    TreeBidiMap.Node<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> node2 = new TreeBidiMap.Node<>(
        Component.BaselineResizeBehavior.CONSTANT_ASCENT, Component.BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(node, node2);
    int expectedHashCodeResult = node.hashCode();
    assertEquals(expectedHashCodeResult, node2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link TreeBidiMap.Node#equals(Object)}
   *   <li>{@link TreeBidiMap.Node#hashCode()}
   * </ul>
   */
  @Test
  public void testNodeEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    TreeBidiMap.Node<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> node = new TreeBidiMap.Node<>(
        Component.BaselineResizeBehavior.CONSTANT_ASCENT, Component.BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(node, node);
    int expectedHashCodeResult = node.hashCode();
    assertEquals(expectedHashCodeResult, node.hashCode());
  }

  /**
   * Method under test: {@link TreeBidiMap.Node#equals(Object)}
   */
  @Test
  public void testNodeEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    TreeBidiMap.Node<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> node = new TreeBidiMap.Node<>(
        Component.BaselineResizeBehavior.CONSTANT_DESCENT, Component.BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNotEquals(node, new TreeBidiMap.Node<>(Component.BaselineResizeBehavior.CONSTANT_ASCENT,
        Component.BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Method under test: {@link TreeBidiMap.Node#equals(Object)}
   */
  @Test
  public void testNodeEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    TreeBidiMap.Node<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> node = new TreeBidiMap.Node<>(
        Component.BaselineResizeBehavior.CONSTANT_ASCENT, Component.BaselineResizeBehavior.CONSTANT_DESCENT);

    // Act and Assert
    assertNotEquals(node, new TreeBidiMap.Node<>(Component.BaselineResizeBehavior.CONSTANT_ASCENT,
        Component.BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Method under test: {@link TreeBidiMap.Node#equals(Object)}
   */
  @Test
  public void testNodeEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    TreeBidiMap.Node<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> node = new TreeBidiMap.Node<>(
        Component.BaselineResizeBehavior.CONSTANT_ASCENT, Component.BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNotEquals(node, new AbstractMap.SimpleEntry<>("42", "42"));
  }

  /**
   * Method under test: {@link TreeBidiMap.Node#equals(Object)}
   */
  @Test
  public void testNodeEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    TreeBidiMap.Node<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> node = new TreeBidiMap.Node<>(
        Component.BaselineResizeBehavior.CONSTANT_ASCENT, Component.BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNotEquals(node, null);
  }

  /**
   * Method under test: {@link TreeBidiMap.Node#equals(Object)}
   */
  @Test
  public void testNodeEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    TreeBidiMap.Node<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> node = new TreeBidiMap.Node<>(
        Component.BaselineResizeBehavior.CONSTANT_ASCENT, Component.BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNotEquals(node, "Different type to Node");
  }

  /**
   * Method under test: {@link TreeBidiMap.Node#getKey()}
   */
  @Test
  public void testNodeGetKey() {
    // Arrange
    TreeBidiMap.Node<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> node = new TreeBidiMap.Node<>(
        Component.BaselineResizeBehavior.CONSTANT_ASCENT, Component.BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(Component.BaselineResizeBehavior.CONSTANT_ASCENT, node.getKey());
  }

  /**
   * Method under test: {@link TreeBidiMap.Node#getValue()}
   */
  @Test
  public void testNodeGetValue() {
    // Arrange
    TreeBidiMap.Node<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> node = new TreeBidiMap.Node<>(
        Component.BaselineResizeBehavior.CONSTANT_ASCENT, Component.BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(Component.BaselineResizeBehavior.CONSTANT_ASCENT, node.getValue());
  }

  /**
   * Method under test: {@link TreeBidiMap.Node#Node(Comparable, Comparable)}
   */
  @Test
  public void testNodeNewNode() {
    // Arrange and Act
    TreeBidiMap.Node<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> actualNode = new TreeBidiMap.Node<>(
        Component.BaselineResizeBehavior.CONSTANT_ASCENT, Component.BaselineResizeBehavior.CONSTANT_ASCENT);

    // Assert
    assertEquals(Component.BaselineResizeBehavior.CONSTANT_ASCENT, actualNode.getKey());
    assertEquals(Component.BaselineResizeBehavior.CONSTANT_ASCENT, actualNode.getValue());
  }

  /**
   * Method under test: {@link TreeBidiMap.Node#setValue(Comparable)}
   */
  @Test
  public void testNodeSetValue() throws UnsupportedOperationException {
    // Arrange
    TreeBidiMap.Node<Component.BaselineResizeBehavior, Component.BaselineResizeBehavior> node = new TreeBidiMap.Node<>(
        Component.BaselineResizeBehavior.CONSTANT_ASCENT, Component.BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class,
        () -> node.setValue(Component.BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Method under test:
   * {@link TreeBidiMap.ValueView#ValueView(TreeBidiMap, TreeBidiMap.DataElement)}
   */
  @Test
  public void testValueViewNewValueView() {
    // Arrange, Act and Assert
    assertTrue(((new TreeBidiMap()).new ValueView(TreeBidiMap.DataElement.KEY)).isEmpty());
  }

  /**
   * Method under test:
   * {@link TreeBidiMap.ViewMapEntryIterator#ViewMapEntryIterator(TreeBidiMap)}
   */
  @Test
  public void testViewMapEntryIteratorNewViewMapEntryIterator() {
    // Arrange, Act and Assert
    assertFalse(((new TreeBidiMap()).new ViewMapEntryIterator()).hasNext());
  }

  /**
   * Method under test: {@link TreeBidiMap.ViewMapIterator#getKey()}
   */
  @Test
  public void testViewMapIteratorGetKey() {
    // Arrange, Act and Assert
    assertThrows(IllegalStateException.class,
        () -> ((new TreeBidiMap()).new ViewMapIterator(TreeBidiMap.DataElement.KEY)).getKey());
  }

  /**
   * Method under test: {@link TreeBidiMap.ViewMapIterator#getValue()}
   */
  @Test
  public void testViewMapIteratorGetValue() {
    // Arrange, Act and Assert
    assertThrows(IllegalStateException.class,
        () -> ((new TreeBidiMap()).new ViewMapIterator(TreeBidiMap.DataElement.KEY)).getValue());
  }

  /**
   * Method under test:
   * {@link TreeBidiMap.ViewMapIterator#ViewMapIterator(TreeBidiMap, TreeBidiMap.DataElement)}
   */
  @Test
  public void testViewMapIteratorNewViewMapIterator() {
    // Arrange, Act and Assert
    assertFalse(((new TreeBidiMap()).new ViewMapIterator(TreeBidiMap.DataElement.KEY)).hasNext());
  }

  /**
   * Method under test: {@link TreeBidiMap.ViewMapIterator#setValue(Comparable)}
   */
  @Test
  public void testViewMapIteratorSetValue() {
    // Arrange, Act and Assert
    assertThrows(UnsupportedOperationException.class,
        () -> ((new TreeBidiMap()).new ViewMapIterator(TreeBidiMap.DataElement.KEY))
            .setValue(TreeBidiMap.DataElement.KEY));
  }
}
