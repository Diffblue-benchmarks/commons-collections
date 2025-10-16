package org.apache.commons.collections4.bidimap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.awt.Component;
import java.awt.Component.BaselineResizeBehavior;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry;
import org.apache.commons.collections4.bidimap.TreeBidiMap.AbstractViewIterator;
import org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement;
import org.apache.commons.collections4.bidimap.TreeBidiMap.EntryView;
import org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse;
import org.apache.commons.collections4.bidimap.TreeBidiMap.InverseEntryView;
import org.apache.commons.collections4.bidimap.TreeBidiMap.InverseViewMapEntryIterator;
import org.apache.commons.collections4.bidimap.TreeBidiMap.InverseViewMapIterator;
import org.apache.commons.collections4.bidimap.TreeBidiMap.KeyView;
import org.apache.commons.collections4.bidimap.TreeBidiMap.Node;
import org.apache.commons.collections4.bidimap.TreeBidiMap.ValueView;
import org.apache.commons.collections4.bidimap.TreeBidiMap.ViewMapEntryIterator;
import org.apache.commons.collections4.bidimap.TreeBidiMap.ViewMapIterator;
import org.apache.commons.collections4.iterators.EmptyOrderedMapIterator;
import org.apache.commons.collections4.keyvalue.UnmodifiableMapEntry;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TreeBidiMapDiffblueTest {
  /**
   * Test AbstractViewIterator {@link AbstractViewIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractViewIterator#hasNext()}
   */
  @Test
  @DisplayName(
      "Test AbstractViewIterator hasNext(); given TreeBidiMap() 'Key' is 'Value'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractViewIterator.hasNext()"})
  void testAbstractViewIteratorHasNext_givenTreeBidiMapKeyIsValue_thenReturnTrue() {
    // Arrange
    TreeBidiMap treeBidiMap = new TreeBidiMap();
    treeBidiMap.put("Key", "Value");

    // Act and Assert
    assertTrue(treeBidiMap.new InverseViewMapEntryIterator().hasNext());
  }

  /**
   * Test AbstractViewIterator {@link AbstractViewIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractViewIterator#hasNext()}
   */
  @Test
  @DisplayName("Test AbstractViewIterator hasNext(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractViewIterator.hasNext()"})
  void testAbstractViewIteratorHasNext_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(new TreeBidiMap().new InverseViewMapEntryIterator().hasNext());
  }

  /**
   * Test AbstractViewIterator {@link AbstractViewIterator#hasPrevious()}.
   *
   * <p>Method under test: {@link AbstractViewIterator#hasPrevious()}
   */
  @Test
  @DisplayName("Test AbstractViewIterator hasPrevious()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractViewIterator.hasPrevious()"})
  void testAbstractViewIteratorHasPrevious() {
    // Arrange, Act and Assert
    assertFalse(new TreeBidiMap().new InverseViewMapEntryIterator().hasPrevious());
  }

  /**
   * Test AbstractViewIterator {@link AbstractViewIterator#navigateNext()}.
   *
   * <p>Method under test: {@link AbstractViewIterator#navigateNext()}
   */
  @Test
  @DisplayName("Test AbstractViewIterator navigateNext()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Node AbstractViewIterator.navigateNext()"})
  void testAbstractViewIteratorNavigateNext() {
    // Arrange
    TreeBidiMap treeBidiMap = new TreeBidiMap();
    treeBidiMap.put("Key", "Value");
    InverseViewMapEntryIterator inverseViewMapEntryIterator =
        treeBidiMap.new InverseViewMapEntryIterator();

    // Act
    Node<BaselineResizeBehavior, BaselineResizeBehavior> actualNavigateNextResult =
        inverseViewMapEntryIterator.navigateNext();

    // Assert
    assertFalse(inverseViewMapEntryIterator.hasNext());
    assertSame(inverseViewMapEntryIterator.lastReturnedNode, actualNavigateNextResult);
  }

  /**
   * Test AbstractViewIterator {@link AbstractViewIterator#navigateNext()}.
   *
   * <p>Method under test: {@link AbstractViewIterator#navigateNext()}
   */
  @Test
  @DisplayName("Test AbstractViewIterator navigateNext()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Node AbstractViewIterator.navigateNext()"})
  void testAbstractViewIteratorNavigateNext2() {
    // Arrange
    TreeBidiMap treeBidiMap = new TreeBidiMap();
    treeBidiMap.putIfAbsent("42", "foo");
    treeBidiMap.put("Key", "Value");
    InverseViewMapEntryIterator inverseViewMapEntryIterator =
        treeBidiMap.new InverseViewMapEntryIterator();

    // Act
    Node<BaselineResizeBehavior, BaselineResizeBehavior> actualNavigateNextResult =
        inverseViewMapEntryIterator.navigateNext();

    // Assert
    Entry<BaselineResizeBehavior, BaselineResizeBehavior> nextResult =
        inverseViewMapEntryIterator.next();
    assertTrue(nextResult instanceof UnmodifiableMapEntry);
    assertEquals("42", nextResult.getValue());
    assertEquals("Key", actualNavigateNextResult.getKey());
    assertEquals("Value", actualNavigateNextResult.getValue());
    assertEquals("foo", nextResult.getKey());
    assertFalse(inverseViewMapEntryIterator.hasNext());
  }

  /**
   * Test AbstractViewIterator {@link AbstractViewIterator#navigateNext()}.
   *
   * <ul>
   *   <li>Then return Key is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractViewIterator#navigateNext()}
   */
  @Test
  @DisplayName("Test AbstractViewIterator navigateNext(); then return Key is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Node AbstractViewIterator.navigateNext()"})
  void testAbstractViewIteratorNavigateNext_thenReturnKeyIs42() {
    // Arrange
    TreeBidiMap treeBidiMap = new TreeBidiMap();
    treeBidiMap.putIfAbsent("42", "42");
    treeBidiMap.put("Key", "Value");
    InverseViewMapEntryIterator inverseViewMapEntryIterator =
        treeBidiMap.new InverseViewMapEntryIterator();

    // Act
    Node<BaselineResizeBehavior, BaselineResizeBehavior> actualNavigateNextResult =
        inverseViewMapEntryIterator.navigateNext();

    // Assert
    Entry<BaselineResizeBehavior, BaselineResizeBehavior> nextResult =
        inverseViewMapEntryIterator.next();
    assertTrue(nextResult instanceof UnmodifiableMapEntry);
    assertEquals("42", actualNavigateNextResult.getKey());
    assertEquals("42", actualNavigateNextResult.getValue());
    assertEquals("Key", nextResult.getValue());
    assertEquals("Value", nextResult.getKey());
    assertFalse(inverseViewMapEntryIterator.hasNext());
  }

  /**
   * Test AbstractViewIterator {@link AbstractViewIterator#navigateNext()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractViewIterator#navigateNext()}
   */
  @Test
  @DisplayName("Test AbstractViewIterator navigateNext(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Node AbstractViewIterator.navigateNext()"})
  void testAbstractViewIteratorNavigateNext_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> new TreeBidiMap().new InverseViewMapEntryIterator().navigateNext());
  }

  /**
   * Test AbstractViewIterator {@link AbstractViewIterator#navigatePrevious()}.
   *
   * <p>Method under test: {@link AbstractViewIterator#navigatePrevious()}
   */
  @Test
  @DisplayName("Test AbstractViewIterator navigatePrevious()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Node AbstractViewIterator.navigatePrevious()"})
  void testAbstractViewIteratorNavigatePrevious() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> new TreeBidiMap().new InverseViewMapEntryIterator().navigatePrevious());
  }

  /**
   * Test AbstractViewIterator {@link AbstractViewIterator#remove()}.
   *
   * <p>Method under test: {@link AbstractViewIterator#remove()}
   */
  @Test
  @DisplayName("Test AbstractViewIterator remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractViewIterator.remove()"})
  void testAbstractViewIteratorRemove() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalStateException.class,
        () -> new TreeBidiMap().new InverseViewMapEntryIterator().remove());
  }

  /**
   * Test DataElement {@link DataElement#toString()}.
   *
   * <p>Method under test: {@link DataElement#toString()}
   */
  @Test
  @DisplayName("Test DataElement toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String DataElement.toString()"})
  void testDataElementToString() {
    // Arrange, Act and Assert
    assertEquals("key", DataElement.valueOf("KEY").toString());
  }

  /**
   * Test EntryView {@link EntryView#EntryView(TreeBidiMap)}.
   *
   * <p>Method under test: {@link EntryView#EntryView(TreeBidiMap)}
   */
  @Test
  @DisplayName("Test EntryView new EntryView(TreeBidiMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EntryView.<init>(TreeBidiMap)"})
  void testEntryViewNewEntryView() {
    // Arrange, Act and Assert
    assertTrue(new TreeBidiMap().new EntryView().isEmpty());
  }

  /**
   * Test InverseEntryView {@link InverseEntryView#InverseEntryView(TreeBidiMap)}.
   *
   * <p>Method under test: {@link InverseEntryView#InverseEntryView(TreeBidiMap)}
   */
  @Test
  @DisplayName("Test InverseEntryView new InverseEntryView(TreeBidiMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseEntryView.<init>(TreeBidiMap)"})
  void testInverseEntryViewNewInverseEntryView() {
    // Arrange, Act and Assert
    assertTrue(new TreeBidiMap().new InverseEntryView().isEmpty());
  }

  /**
   * Test Inverse getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Inverse#Inverse(TreeBidiMap)}
   *   <li>{@link Inverse#toString()}
   * </ul>
   */
  @Test
  @DisplayName("Test Inverse getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Inverse.<init>(TreeBidiMap)", "String Inverse.toString()"})
  void testInverseGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("{}", new TreeBidiMap().new Inverse().toString());
  }

  /**
   * Test InverseViewMapEntryIterator {@link
   * InverseViewMapEntryIterator#InverseViewMapEntryIterator(TreeBidiMap)}.
   *
   * <p>Method under test: {@link
   * InverseViewMapEntryIterator#InverseViewMapEntryIterator(TreeBidiMap)}
   */
  @Test
  @DisplayName("Test InverseViewMapEntryIterator new InverseViewMapEntryIterator(TreeBidiMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseViewMapEntryIterator.<init>(TreeBidiMap)"})
  void testInverseViewMapEntryIteratorNewInverseViewMapEntryIterator() {
    // Arrange
    TreeBidiMap treeBidiMap = new TreeBidiMap();
    treeBidiMap.put("Key", "Value");

    // Act
    InverseViewMapEntryIterator actualInverseViewMapEntryIterator =
        treeBidiMap.new InverseViewMapEntryIterator();

    // Assert
    Entry<BaselineResizeBehavior, BaselineResizeBehavior> nextResult =
        actualInverseViewMapEntryIterator.next();
    assertTrue(nextResult instanceof UnmodifiableMapEntry);
    assertEquals("Key", nextResult.getValue());
    assertEquals("Value", nextResult.getKey());
    assertFalse(actualInverseViewMapEntryIterator.hasNext());
  }

  /**
   * Test InverseViewMapEntryIterator {@link
   * InverseViewMapEntryIterator#InverseViewMapEntryIterator(TreeBidiMap)}.
   *
   * <ul>
   *   <li>When {@link TreeBidiMap#TreeBidiMap()}.
   * </ul>
   *
   * <p>Method under test: {@link
   * InverseViewMapEntryIterator#InverseViewMapEntryIterator(TreeBidiMap)}
   */
  @Test
  @DisplayName(
      "Test InverseViewMapEntryIterator new InverseViewMapEntryIterator(TreeBidiMap); when TreeBidiMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseViewMapEntryIterator.<init>(TreeBidiMap)"})
  void testInverseViewMapEntryIteratorNewInverseViewMapEntryIterator_whenTreeBidiMap() {
    // Arrange, Act and Assert
    assertFalse(new TreeBidiMap().new InverseViewMapEntryIterator().hasNext());
  }

  /**
   * Test InverseViewMapEntryIterator {@link InverseViewMapEntryIterator#next()}.
   *
   * <p>Method under test: {@link InverseViewMapEntryIterator#next()}
   */
  @Test
  @DisplayName("Test InverseViewMapEntryIterator next()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Entry InverseViewMapEntryIterator.next()"})
  void testInverseViewMapEntryIteratorNext() {
    // Arrange
    TreeBidiMap treeBidiMap = new TreeBidiMap();
    treeBidiMap.putIfAbsent("42", "42");
    treeBidiMap.put("Key", "Value");
    InverseViewMapEntryIterator inverseViewMapEntryIterator =
        treeBidiMap.new InverseViewMapEntryIterator();

    // Act
    Entry<BaselineResizeBehavior, BaselineResizeBehavior> actualNextResult =
        inverseViewMapEntryIterator.next();

    // Assert
    Node<BaselineResizeBehavior, BaselineResizeBehavior> expectedUnmodifiableMapEntry =
        inverseViewMapEntryIterator.lastReturnedNode;
    assertTrue(actualNextResult instanceof UnmodifiableMapEntry);
    Entry<BaselineResizeBehavior, BaselineResizeBehavior> nextResult =
        inverseViewMapEntryIterator.next();
    assertTrue(nextResult instanceof UnmodifiableMapEntry);
    assertEquals("Key", nextResult.getValue());
    assertEquals("Value", nextResult.getKey());
    assertFalse(inverseViewMapEntryIterator.hasNext());
    assertEquals(expectedUnmodifiableMapEntry, actualNextResult);
  }

  /**
   * Test InverseViewMapEntryIterator {@link InverseViewMapEntryIterator#next()}.
   *
   * <p>Method under test: {@link InverseViewMapEntryIterator#next()}
   */
  @Test
  @DisplayName("Test InverseViewMapEntryIterator next()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Entry InverseViewMapEntryIterator.next()"})
  void testInverseViewMapEntryIteratorNext2() {
    // Arrange
    TreeBidiMap treeBidiMap = new TreeBidiMap();
    treeBidiMap.putIfAbsent("42", "foo");
    treeBidiMap.put("Key", "Value");
    InverseViewMapEntryIterator inverseViewMapEntryIterator =
        treeBidiMap.new InverseViewMapEntryIterator();

    // Act
    Entry<BaselineResizeBehavior, BaselineResizeBehavior> actualNextResult =
        inverseViewMapEntryIterator.next();

    // Assert
    assertTrue(actualNextResult instanceof UnmodifiableMapEntry);
    Entry<BaselineResizeBehavior, BaselineResizeBehavior> nextResult =
        inverseViewMapEntryIterator.next();
    assertTrue(nextResult instanceof UnmodifiableMapEntry);
    assertEquals("42", nextResult.getValue());
    assertEquals("Key", actualNextResult.getValue());
    assertEquals("Value", actualNextResult.getKey());
    assertEquals("foo", nextResult.getKey());
    assertFalse(inverseViewMapEntryIterator.hasNext());
  }

  /**
   * Test InverseViewMapEntryIterator {@link InverseViewMapEntryIterator#next()}.
   *
   * <ul>
   *   <li>Then return Value is {@code Key}.
   * </ul>
   *
   * <p>Method under test: {@link InverseViewMapEntryIterator#next()}
   */
  @Test
  @DisplayName("Test InverseViewMapEntryIterator next(); then return Value is 'Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Entry InverseViewMapEntryIterator.next()"})
  void testInverseViewMapEntryIteratorNext_thenReturnValueIsKey() {
    // Arrange
    TreeBidiMap treeBidiMap = new TreeBidiMap();
    treeBidiMap.put("Key", "Value");
    InverseViewMapEntryIterator inverseViewMapEntryIterator =
        treeBidiMap.new InverseViewMapEntryIterator();

    // Act
    Entry<BaselineResizeBehavior, BaselineResizeBehavior> actualNextResult =
        inverseViewMapEntryIterator.next();

    // Assert
    assertTrue(actualNextResult instanceof UnmodifiableMapEntry);
    assertEquals("Key", actualNextResult.getValue());
    assertEquals("Value", actualNextResult.getKey());
    assertFalse(inverseViewMapEntryIterator.hasNext());
  }

  /**
   * Test InverseViewMapEntryIterator {@link InverseViewMapEntryIterator#next()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link InverseViewMapEntryIterator#next()}
   */
  @Test
  @DisplayName("Test InverseViewMapEntryIterator next(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Entry InverseViewMapEntryIterator.next()"})
  void testInverseViewMapEntryIteratorNext_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> new TreeBidiMap().new InverseViewMapEntryIterator().next());
  }

  /**
   * Test InverseViewMapEntryIterator {@link InverseViewMapEntryIterator#previous()}.
   *
   * <p>Method under test: {@link InverseViewMapEntryIterator#previous()}
   */
  @Test
  @DisplayName("Test InverseViewMapEntryIterator previous()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Entry InverseViewMapEntryIterator.previous()"})
  void testInverseViewMapEntryIteratorPrevious() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> new TreeBidiMap().new InverseViewMapEntryIterator().previous());
  }

  /**
   * Test InverseViewMapIterator {@link InverseViewMapIterator#getKey()}.
   *
   * <p>Method under test: {@link InverseViewMapIterator#getKey()}
   */
  @Test
  @DisplayName("Test InverseViewMapIterator getKey()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable InverseViewMapIterator.getKey()"})
  void testInverseViewMapIteratorGetKey() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalStateException.class,
        () -> new TreeBidiMap().new InverseViewMapIterator(DataElement.KEY).getKey());
  }

  /**
   * Test InverseViewMapIterator {@link InverseViewMapIterator#getValue()}.
   *
   * <p>Method under test: {@link InverseViewMapIterator#getValue()}
   */
  @Test
  @DisplayName("Test InverseViewMapIterator getValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable InverseViewMapIterator.getValue()"})
  void testInverseViewMapIteratorGetValue() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalStateException.class,
        () -> new TreeBidiMap().new InverseViewMapIterator(DataElement.KEY).getValue());
  }

  /**
   * Test InverseViewMapIterator {@link InverseViewMapIterator#InverseViewMapIterator(TreeBidiMap,
   * DataElement)}.
   *
   * <ul>
   *   <li>Then return next is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link InverseViewMapIterator#InverseViewMapIterator(TreeBidiMap,
   * DataElement)}
   */
  @Test
  @DisplayName(
      "Test InverseViewMapIterator new InverseViewMapIterator(TreeBidiMap, DataElement); then return next is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseViewMapIterator.<init>(TreeBidiMap, DataElement)"})
  void testInverseViewMapIteratorNewInverseViewMapIterator_thenReturnNextIsValue() {
    // Arrange
    TreeBidiMap treeBidiMap = new TreeBidiMap();
    treeBidiMap.put("Key", "Value");

    // Act
    InverseViewMapIterator actualInverseViewMapIterator =
        treeBidiMap.new InverseViewMapIterator(DataElement.KEY);

    // Assert
    assertEquals("Value", actualInverseViewMapIterator.next());
    assertFalse(actualInverseViewMapIterator.hasNext());
  }

  /**
   * Test InverseViewMapIterator {@link InverseViewMapIterator#InverseViewMapIterator(TreeBidiMap,
   * DataElement)}.
   *
   * <ul>
   *   <li>When {@link TreeBidiMap#TreeBidiMap()}.
   * </ul>
   *
   * <p>Method under test: {@link InverseViewMapIterator#InverseViewMapIterator(TreeBidiMap,
   * DataElement)}
   */
  @Test
  @DisplayName(
      "Test InverseViewMapIterator new InverseViewMapIterator(TreeBidiMap, DataElement); when TreeBidiMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseViewMapIterator.<init>(TreeBidiMap, DataElement)"})
  void testInverseViewMapIteratorNewInverseViewMapIterator_whenTreeBidiMap() {
    // Arrange, Act and Assert
    assertFalse(new TreeBidiMap().new InverseViewMapIterator(DataElement.KEY).hasNext());
  }

  /**
   * Test InverseViewMapIterator {@link InverseViewMapIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()} IfAbsent {@code 42} is {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link InverseViewMapIterator#next()}
   */
  @Test
  @DisplayName(
      "Test InverseViewMapIterator next(); given TreeBidiMap() IfAbsent '42' is '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable InverseViewMapIterator.next()"})
  void testInverseViewMapIteratorNext_givenTreeBidiMapIfAbsent42Is42_thenReturn42() {
    // Arrange
    TreeBidiMap treeBidiMap = new TreeBidiMap();
    treeBidiMap.putIfAbsent("42", "42");
    treeBidiMap.put("Key", "Value");
    InverseViewMapIterator inverseViewMapIterator =
        treeBidiMap.new InverseViewMapIterator(DataElement.KEY);

    // Act and Assert
    assertEquals("42", inverseViewMapIterator.next());
    assertEquals("Value", inverseViewMapIterator.next());
    assertFalse(inverseViewMapIterator.hasNext());
  }

  /**
   * Test InverseViewMapIterator {@link InverseViewMapIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link InverseViewMapIterator#next()}
   */
  @Test
  @DisplayName(
      "Test InverseViewMapIterator next(); given TreeBidiMap() 'Key' is 'Value'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable InverseViewMapIterator.next()"})
  void testInverseViewMapIteratorNext_givenTreeBidiMapKeyIsValue_thenReturnValue() {
    // Arrange
    TreeBidiMap treeBidiMap = new TreeBidiMap();
    treeBidiMap.put("Key", "Value");
    InverseViewMapIterator inverseViewMapIterator =
        treeBidiMap.new InverseViewMapIterator(DataElement.KEY);

    // Act and Assert
    assertEquals("Value", inverseViewMapIterator.next());
    assertFalse(inverseViewMapIterator.hasNext());
  }

  /**
   * Test InverseViewMapIterator {@link InverseViewMapIterator#next()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link InverseViewMapIterator#next()}
   */
  @Test
  @DisplayName("Test InverseViewMapIterator next(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable InverseViewMapIterator.next()"})
  void testInverseViewMapIteratorNext_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> new TreeBidiMap().new InverseViewMapIterator(DataElement.KEY).next());
  }

  /**
   * Test InverseViewMapIterator {@link InverseViewMapIterator#previous()}.
   *
   * <p>Method under test: {@link InverseViewMapIterator#previous()}
   */
  @Test
  @DisplayName("Test InverseViewMapIterator previous()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable InverseViewMapIterator.previous()"})
  void testInverseViewMapIteratorPrevious() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> new TreeBidiMap().new InverseViewMapIterator(DataElement.KEY).previous());
  }

  /**
   * Test InverseViewMapIterator {@link InverseViewMapIterator#setValue(Comparable)} with {@code
   * BaselineResizeBehavior}.
   *
   * <p>Method under test: {@link InverseViewMapIterator#setValue(Comparable)}
   */
  @Test
  @DisplayName("Test InverseViewMapIterator setValue(Comparable) with 'BaselineResizeBehavior'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable InverseViewMapIterator.setValue(Comparable)"})
  void testInverseViewMapIteratorSetValueWithBaselineResizeBehavior() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            new TreeBidiMap().new InverseViewMapIterator(DataElement.KEY)
                .setValue(BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test KeyView {@link KeyView#KeyView(TreeBidiMap, DataElement)}.
   *
   * <p>Method under test: {@link KeyView#KeyView(TreeBidiMap, DataElement)}
   */
  @Test
  @DisplayName("Test KeyView new KeyView(TreeBidiMap, DataElement)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void KeyView.<init>(TreeBidiMap, DataElement)"})
  void testKeyViewNewKeyView() {
    // Arrange, Act and Assert
    assertTrue(new TreeBidiMap().new KeyView(DataElement.KEY).isEmpty());
  }

  /**
   * Test {@link TreeBidiMap#TreeBidiMap()}.
   *
   * <p>Method under test: {@link TreeBidiMap#TreeBidiMap()}
   */
  @Test
  @DisplayName("Test new TreeBidiMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TreeBidiMap.<init>()"})
  void testNewTreeBidiMap() {
    // Arrange and Act
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Assert
    assertTrue(actualBaselineResizeBehaviorBaselineResizeBehaviorMap.isEmpty());
  }

  /**
   * Test {@link TreeBidiMap#TreeBidiMap(Map)}.
   *
   * <ul>
   *   <li>Given {@code OTHER}.
   *   <li>When {@link HashMap#HashMap()} {@code OTHER} is {@code CENTER_OFFSET}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#TreeBidiMap(Map)}
   */
  @Test
  @DisplayName(
      "Test new TreeBidiMap(Map); given 'OTHER'; when HashMap() 'OTHER' is 'CENTER_OFFSET'; then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TreeBidiMap.<init>(Map)"})
  void testNewTreeBidiMap_givenOther_whenHashMapOtherIsCenterOffset_thenReturnHashMap() {
    // Arrange
    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.OTHER, BaselineResizeBehavior.CENTER_OFFSET);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>(map);

    // Assert
    assertEquals(map, actualBaselineResizeBehaviorBaselineResizeBehaviorMap);
  }

  /**
   * Test {@link TreeBidiMap#TreeBidiMap(Map)}.
   *
   * <ul>
   *   <li>Then return {@code CONSTANT_DESCENT} is {@code OTHER}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#TreeBidiMap(Map)}
   */
  @Test
  @DisplayName("Test new TreeBidiMap(Map); then return 'CONSTANT_DESCENT' is 'OTHER'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TreeBidiMap.<init>(Map)"})
  void testNewTreeBidiMap_thenReturnConstantDescentIsOther() {
    // Arrange
    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.OTHER, BaselineResizeBehavior.CONSTANT_ASCENT);
    map.put(BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CENTER_OFFSET);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.OTHER);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_DESCENT);

    // Act
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>(map);

    // Assert
    assertEquals(4, actualBaselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.OTHER));
    assertEquals(
        BaselineResizeBehavior.CONSTANT_DESCENT,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(
        BaselineResizeBehavior.OTHER,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CENTER_OFFSET));
  }

  /**
   * Test {@link TreeBidiMap#TreeBidiMap(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code CENTER_OFFSET} is {@code CENTER_OFFSET}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#TreeBidiMap(Map)}
   */
  @Test
  @DisplayName(
      "Test new TreeBidiMap(Map); when HashMap() 'CENTER_OFFSET' is 'CENTER_OFFSET'; then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TreeBidiMap.<init>(Map)"})
  void testNewTreeBidiMap_whenHashMapCenterOffsetIsCenterOffset_thenReturnHashMap() {
    // Arrange
    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CENTER_OFFSET);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>(map);

    // Assert
    assertEquals(map, actualBaselineResizeBehaviorBaselineResizeBehaviorMap);
  }

  /**
   * Test {@link TreeBidiMap#TreeBidiMap(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code CENTER_OFFSET} is {@code CONSTANT_ASCENT}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#TreeBidiMap(Map)}
   */
  @Test
  @DisplayName(
      "Test new TreeBidiMap(Map); when HashMap() 'CENTER_OFFSET' is 'CONSTANT_ASCENT'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TreeBidiMap.<init>(Map)"})
  void testNewTreeBidiMap_whenHashMapCenterOffsetIsConstantAscent_thenReturnSizeIsTwo() {
    // Arrange
    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CONSTANT_ASCENT);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>(map);

    // Assert
    assertEquals(2, actualBaselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(
        BaselineResizeBehavior.CONSTANT_DESCENT,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#TreeBidiMap(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code CENTER_OFFSET} is {@code OTHER}.
   *   <li>Then return {@code OTHER} is {@code CENTER_OFFSET}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#TreeBidiMap(Map)}
   */
  @Test
  @DisplayName(
      "Test new TreeBidiMap(Map); when HashMap() 'CENTER_OFFSET' is 'OTHER'; then return 'OTHER' is 'CENTER_OFFSET'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TreeBidiMap.<init>(Map)"})
  void testNewTreeBidiMap_whenHashMapCenterOffsetIsOther_thenReturnOtherIsCenterOffset() {
    // Arrange
    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.OTHER);
    map.put(BaselineResizeBehavior.OTHER, BaselineResizeBehavior.CENTER_OFFSET);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>(map);

    // Assert
    assertEquals(4, actualBaselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CENTER_OFFSET,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.OTHER));
    assertEquals(
        BaselineResizeBehavior.CONSTANT_DESCENT,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CONSTANT_DESCENT));
    assertEquals(
        BaselineResizeBehavior.OTHER,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CENTER_OFFSET));
    assertTrue(
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#TreeBidiMap(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code CENTER_OFFSET} is {@code OTHER}.
   *   <li>Then return {@code OTHER} is {@code CENTER_OFFSET}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#TreeBidiMap(Map)}
   */
  @Test
  @DisplayName(
      "Test new TreeBidiMap(Map); when HashMap() 'CENTER_OFFSET' is 'OTHER'; then return 'OTHER' is 'CENTER_OFFSET'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TreeBidiMap.<init>(Map)"})
  void testNewTreeBidiMap_whenHashMapCenterOffsetIsOther_thenReturnOtherIsCenterOffset2() {
    // Arrange
    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.OTHER);
    map.put(BaselineResizeBehavior.OTHER, BaselineResizeBehavior.CENTER_OFFSET);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>(map);

    // Assert
    assertEquals(4, actualBaselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CENTER_OFFSET,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.OTHER));
    assertEquals(
        BaselineResizeBehavior.CONSTANT_DESCENT,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CONSTANT_DESCENT));
    assertEquals(
        BaselineResizeBehavior.OTHER,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CENTER_OFFSET));
    assertTrue(
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#TreeBidiMap(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code CONSTANT_ASCENT} is {@code CONSTANT_ASCENT}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#TreeBidiMap(Map)}
   */
  @Test
  @DisplayName(
      "Test new TreeBidiMap(Map); when HashMap() 'CONSTANT_ASCENT' is 'CONSTANT_ASCENT'; then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TreeBidiMap.<init>(Map)"})
  void testNewTreeBidiMap_whenHashMapConstantAscentIsConstantAscent_thenReturnHashMap() {
    // Arrange
    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>(map);

    // Assert
    assertEquals(map, actualBaselineResizeBehaviorBaselineResizeBehaviorMap);
  }

  /**
   * Test {@link TreeBidiMap#TreeBidiMap(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code CONSTANT_DESCENT} is {@code CONSTANT_DESCENT}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#TreeBidiMap(Map)}
   */
  @Test
  @DisplayName(
      "Test new TreeBidiMap(Map); when HashMap() 'CONSTANT_DESCENT' is 'CONSTANT_DESCENT'; then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TreeBidiMap.<init>(Map)"})
  void testNewTreeBidiMap_whenHashMapConstantDescentIsConstantDescent_thenReturnHashMap() {
    // Arrange
    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>(map);

    // Assert
    assertEquals(map, actualBaselineResizeBehaviorBaselineResizeBehaviorMap);
  }

  /**
   * Test {@link TreeBidiMap#TreeBidiMap(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#TreeBidiMap(Map)}
   */
  @Test
  @DisplayName("Test new TreeBidiMap(Map); when HashMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TreeBidiMap.<init>(Map)"})
  void testNewTreeBidiMap_whenHashMap_thenReturnEmpty() {
    // Arrange and Act
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>(new HashMap<>());

    // Assert
    assertTrue(actualBaselineResizeBehaviorBaselineResizeBehaviorMap.isEmpty());
  }

  /**
   * Test {@link TreeBidiMap#containsKey(Object)}.
   *
   * <p>Method under test: {@link TreeBidiMap#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TreeBidiMap.containsKey(Object)"})
  void testContainsKey() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertFalse(baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey("Key"));
  }

  /**
   * Test {@link TreeBidiMap#containsValue(Object)}.
   *
   * <p>Method under test: {@link TreeBidiMap#containsValue(Object)}
   */
  @Test
  @DisplayName("Test containsValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TreeBidiMap.containsValue(Object)"})
  void testContainsValue() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertFalse(baselineResizeBehaviorBaselineResizeBehaviorMap.containsValue("Value"));
  }

  /**
   * Test {@link TreeBidiMap#entrySet()}.
   *
   * <p>Method under test: {@link TreeBidiMap#entrySet()}
   */
  @Test
  @DisplayName("Test entrySet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set TreeBidiMap.entrySet()"})
  void testEntrySet() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.entrySet().isEmpty());
  }

  /**
   * Test {@link TreeBidiMap#equals(Object)}, and {@link TreeBidiMap#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TreeBidiMap#equals(Object)}
   *   <li>{@link TreeBidiMap#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TreeBidiMap.equals(Object)", "int TreeBidiMap.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap2 = new TreeBidiMap<>();

    // Act and Assert
    assertEquals(
        baselineResizeBehaviorBaselineResizeBehaviorMap,
        baselineResizeBehaviorBaselineResizeBehaviorMap2);
    assertEquals(
        baselineResizeBehaviorBaselineResizeBehaviorMap.hashCode(),
        baselineResizeBehaviorBaselineResizeBehaviorMap2.hashCode());
  }

  /**
   * Test {@link TreeBidiMap#equals(Object)}, and {@link TreeBidiMap#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TreeBidiMap#equals(Object)}
   *   <li>{@link TreeBidiMap#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TreeBidiMap.equals(Object)", "int TreeBidiMap.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_DESCENT);

    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap2 = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap2.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_DESCENT);

    // Act and Assert
    assertEquals(
        baselineResizeBehaviorBaselineResizeBehaviorMap,
        baselineResizeBehaviorBaselineResizeBehaviorMap2);
    assertEquals(
        baselineResizeBehaviorBaselineResizeBehaviorMap.hashCode(),
        baselineResizeBehaviorBaselineResizeBehaviorMap2.hashCode());
  }

  /**
   * Test {@link TreeBidiMap#equals(Object)}, and {@link TreeBidiMap#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TreeBidiMap#equals(Object)}
   *   <li>{@link TreeBidiMap#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TreeBidiMap.equals(Object)", "int TreeBidiMap.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertEquals(
        baselineResizeBehaviorBaselineResizeBehaviorMap,
        baselineResizeBehaviorBaselineResizeBehaviorMap);
    int expectedHashCodeResult = baselineResizeBehaviorBaselineResizeBehaviorMap.hashCode();
    assertEquals(
        expectedHashCodeResult, baselineResizeBehaviorBaselineResizeBehaviorMap.hashCode());
  }

  /**
   * Test {@link TreeBidiMap#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TreeBidiMap.equals(Object)", "int TreeBidiMap.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNotEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, new TreeBidiMap<>());
  }

  /**
   * Test {@link TreeBidiMap#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TreeBidiMap.equals(Object)", "int TreeBidiMap.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap2 = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap2.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);

    // Act and Assert
    assertNotEquals(
        baselineResizeBehaviorBaselineResizeBehaviorMap,
        baselineResizeBehaviorBaselineResizeBehaviorMap2);
  }

  /**
   * Test {@link TreeBidiMap#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TreeBidiMap.equals(Object)", "int TreeBidiMap.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap2 = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap2.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_DESCENT);

    // Act and Assert
    assertNotEquals(
        baselineResizeBehaviorBaselineResizeBehaviorMap,
        baselineResizeBehaviorBaselineResizeBehaviorMap2);
  }

  /**
   * Test {@link TreeBidiMap#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TreeBidiMap.equals(Object)", "int TreeBidiMap.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CONSTANT_ASCENT);

    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap2 = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap2.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);

    // Act and Assert
    assertNotEquals(
        baselineResizeBehaviorBaselineResizeBehaviorMap,
        baselineResizeBehaviorBaselineResizeBehaviorMap2);
  }

  /**
   * Test {@link TreeBidiMap#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TreeBidiMap.equals(Object)", "int TreeBidiMap.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap2 = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap2.put(
        BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap2.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);

    // Act and Assert
    assertNotEquals(
        baselineResizeBehaviorBaselineResizeBehaviorMap,
        baselineResizeBehaviorBaselineResizeBehaviorMap2);
  }

  /**
   * Test {@link TreeBidiMap#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TreeBidiMap.equals(Object)", "int TreeBidiMap.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.OTHER, BaselineResizeBehavior.CONSTANT_ASCENT);

    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap2 = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap2.put(
        BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap2.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);

    // Act and Assert
    assertNotEquals(
        baselineResizeBehaviorBaselineResizeBehaviorMap,
        baselineResizeBehaviorBaselineResizeBehaviorMap2);
  }

  /**
   * Test {@link TreeBidiMap#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TreeBidiMap.equals(Object)", "int TreeBidiMap.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertNotEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, null);
  }

  /**
   * Test {@link TreeBidiMap#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TreeBidiMap.equals(Object)", "int TreeBidiMap.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertNotEquals(
        baselineResizeBehaviorBaselineResizeBehaviorMap, "Different type to TreeBidiMap");
  }

  /**
   * Test {@link TreeBidiMap#firstKey()}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()} {@code CONSTANT_DESCENT} is {@code
   *       CONSTANT_DESCENT}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#firstKey()}
   */
  @Test
  @DisplayName("Test firstKey(); given TreeBidiMap() 'CONSTANT_DESCENT' is 'CONSTANT_DESCENT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.firstKey()"})
  void testFirstKey_givenTreeBidiMapConstantDescentIsConstantDescent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.firstKey());
  }

  /**
   * Test {@link TreeBidiMap#firstKey()}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#firstKey()}
   */
  @Test
  @DisplayName("Test firstKey(); given TreeBidiMap(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.firstKey()"})
  void testFirstKey_givenTreeBidiMap_thenThrowNoSuchElementException() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> baselineResizeBehaviorBaselineResizeBehaviorMap.firstKey());
  }

  /**
   * Test {@link TreeBidiMap#firstKey()}.
   *
   * <ul>
   *   <li>Then return {@code CONSTANT_ASCENT}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#firstKey()}
   */
  @Test
  @DisplayName("Test firstKey(); then return 'CONSTANT_ASCENT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.firstKey()"})
  void testFirstKey_thenReturnConstantAscent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.firstKey());
  }

  /**
   * Test {@link TreeBidiMap#get(Object)}.
   *
   * <p>Method under test: {@link TreeBidiMap#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.get(Object)"})
  void testGet() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertNull(baselineResizeBehaviorBaselineResizeBehaviorMap.get("Key"));
  }

  /**
   * Test {@link TreeBidiMap#getKey(Object)}.
   *
   * <p>Method under test: {@link TreeBidiMap#getKey(Object)}
   */
  @Test
  @DisplayName("Test getKey(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.getKey(Object)"})
  void testGetKey() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertNull(baselineResizeBehaviorBaselineResizeBehaviorMap.getKey("Value"));
  }

  /**
   * Test {@link TreeBidiMap#inverseBidiMap()}.
   *
   * <p>Method under test: {@link TreeBidiMap#inverseBidiMap()}
   */
  @Test
  @DisplayName("Test inverseBidiMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"org.apache.commons.collections4.OrderedBidiMap TreeBidiMap.inverseBidiMap()"})
  void testInverseBidiMap() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.inverseBidiMap().isEmpty());
  }

  /**
   * Test {@link TreeBidiMap#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()} {@code CONSTANT_ASCENT} is {@code
   *       CONSTANT_ASCENT}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#isEmpty()}
   */
  @Test
  @DisplayName(
      "Test isEmpty(); given TreeBidiMap() 'CONSTANT_ASCENT' is 'CONSTANT_ASCENT'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TreeBidiMap.isEmpty()"})
  void testIsEmpty_givenTreeBidiMapConstantAscentIsConstantAscent_thenReturnFalse() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertFalse(baselineResizeBehaviorBaselineResizeBehaviorMap.isEmpty());
  }

  /**
   * Test {@link TreeBidiMap#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given TreeBidiMap(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TreeBidiMap.isEmpty()"})
  void testIsEmpty_givenTreeBidiMap_thenReturnTrue() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.isEmpty());
  }

  /**
   * Test {@link TreeBidiMap#keySet()}.
   *
   * <p>Method under test: {@link TreeBidiMap#keySet()}
   */
  @Test
  @DisplayName("Test keySet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set TreeBidiMap.keySet()"})
  void testKeySet() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.keySet().isEmpty());
  }

  /**
   * Test {@link TreeBidiMap#lastKey()}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()} {@code CENTER_OFFSET} is {@code CENTER_OFFSET}.
   *   <li>Then return {@code CENTER_OFFSET}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#lastKey()}
   */
  @Test
  @DisplayName(
      "Test lastKey(); given TreeBidiMap() 'CENTER_OFFSET' is 'CENTER_OFFSET'; then return 'CENTER_OFFSET'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.lastKey()"})
  void testLastKey_givenTreeBidiMapCenterOffsetIsCenterOffset_thenReturnCenterOffset() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(
        BaselineResizeBehavior.CENTER_OFFSET,
        baselineResizeBehaviorBaselineResizeBehaviorMap.lastKey());
  }

  /**
   * Test {@link TreeBidiMap#lastKey()}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#lastKey()}
   */
  @Test
  @DisplayName("Test lastKey(); given TreeBidiMap(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.lastKey()"})
  void testLastKey_givenTreeBidiMap_thenThrowNoSuchElementException() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> baselineResizeBehaviorBaselineResizeBehaviorMap.lastKey());
  }

  /**
   * Test {@link TreeBidiMap#lastKey()}.
   *
   * <ul>
   *   <li>Then return {@code CONSTANT_ASCENT}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#lastKey()}
   */
  @Test
  @DisplayName("Test lastKey(); then return 'CONSTANT_ASCENT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.lastKey()"})
  void testLastKey_thenReturnConstantAscent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.lastKey());
  }

  /**
   * Test {@link TreeBidiMap#mapIterator()}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()} All is {@link HashMap#HashMap()}.
   *   <li>Then return {@link EmptyOrderedMapIterator}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#mapIterator()}
   */
  @Test
  @DisplayName(
      "Test mapIterator(); given TreeBidiMap() All is HashMap(); then return EmptyOrderedMapIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OrderedMapIterator TreeBidiMap.mapIterator()"})
  void testMapIterator_givenTreeBidiMapAllIsHashMap_thenReturnEmptyOrderedMapIterator() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(new HashMap<>());

    // Act
    OrderedMapIterator<BaselineResizeBehavior, BaselineResizeBehavior> actualMapIteratorResult =
        baselineResizeBehaviorBaselineResizeBehaviorMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof EmptyOrderedMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
    assertSame(
        ((EmptyOrderedMapIterator) actualMapIteratorResult).INSTANCE, actualMapIteratorResult);
  }

  /**
   * Test {@link TreeBidiMap#mapIterator()}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()}.
   *   <li>Then return {@link EmptyOrderedMapIterator}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator(); given TreeBidiMap(); then return EmptyOrderedMapIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OrderedMapIterator TreeBidiMap.mapIterator()"})
  void testMapIterator_givenTreeBidiMap_thenReturnEmptyOrderedMapIterator() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act
    OrderedMapIterator<BaselineResizeBehavior, BaselineResizeBehavior> actualMapIteratorResult =
        baselineResizeBehaviorBaselineResizeBehaviorMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof EmptyOrderedMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
    assertSame(
        ((EmptyOrderedMapIterator) actualMapIteratorResult).INSTANCE, actualMapIteratorResult);
  }

  /**
   * Test {@link TreeBidiMap#mapIterator()}.
   *
   * <ul>
   *   <li>Then return next is {@code CONSTANT_DESCENT}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator(); then return next is 'CONSTANT_DESCENT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OrderedMapIterator TreeBidiMap.mapIterator()"})
  void testMapIterator_thenReturnNextIsConstantDescent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    OrderedMapIterator<BaselineResizeBehavior, BaselineResizeBehavior> actualMapIteratorResult =
        baselineResizeBehaviorBaselineResizeBehaviorMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof ViewMapIterator);
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT, actualMapIteratorResult.next());
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT, actualMapIteratorResult.next());
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link TreeBidiMap#mapIterator()}.
   *
   * <ul>
   *   <li>Then return {@link ViewMapIterator}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator(); then return ViewMapIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OrderedMapIterator TreeBidiMap.mapIterator()"})
  void testMapIterator_thenReturnViewMapIterator() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    OrderedMapIterator<BaselineResizeBehavior, BaselineResizeBehavior> actualMapIteratorResult =
        baselineResizeBehaviorBaselineResizeBehaviorMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof ViewMapIterator);
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT, actualMapIteratorResult.next());
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link TreeBidiMap#nextKey(Comparable)} with {@code BaselineResizeBehavior}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()}.
   *   <li>When {@code CONSTANT_ASCENT}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#nextKey(Comparable)}
   */
  @Test
  @DisplayName(
      "Test nextKey(Comparable) with 'BaselineResizeBehavior'; given TreeBidiMap(); when 'CONSTANT_ASCENT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.nextKey(Comparable)"})
  void testNextKeyWithBaselineResizeBehavior_givenTreeBidiMap_whenConstantAscent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertNull(
        baselineResizeBehaviorBaselineResizeBehaviorMap.nextKey(
            BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#nextKey(Comparable)} with {@code BaselineResizeBehavior}.
   *
   * <ul>
   *   <li>Then return {@code CENTER_OFFSET}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#nextKey(Comparable)}
   */
  @Test
  @DisplayName(
      "Test nextKey(Comparable) with 'BaselineResizeBehavior'; then return 'CENTER_OFFSET'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.nextKey(Comparable)"})
  void testNextKeyWithBaselineResizeBehavior_thenReturnCenterOffset() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(
        BaselineResizeBehavior.CENTER_OFFSET,
        baselineResizeBehaviorBaselineResizeBehaviorMap.nextKey(
            BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#nextKey(Comparable)} with {@code BaselineResizeBehavior}.
   *
   * <ul>
   *   <li>Then return {@code CONSTANT_DESCENT}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#nextKey(Comparable)}
   */
  @Test
  @DisplayName(
      "Test nextKey(Comparable) with 'BaselineResizeBehavior'; then return 'CONSTANT_DESCENT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.nextKey(Comparable)"})
  void testNextKeyWithBaselineResizeBehavior_thenReturnConstantDescent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(
        BaselineResizeBehavior.CONSTANT_DESCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.nextKey(
            BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#nextKey(Comparable)} with {@code BaselineResizeBehavior}.
   *
   * <ul>
   *   <li>When {@code CENTER_OFFSET}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#nextKey(Comparable)}
   */
  @Test
  @DisplayName("Test nextKey(Comparable) with 'BaselineResizeBehavior'; when 'CENTER_OFFSET'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.nextKey(Comparable)"})
  void testNextKeyWithBaselineResizeBehavior_whenCenterOffset() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNull(
        baselineResizeBehaviorBaselineResizeBehaviorMap.nextKey(
            BaselineResizeBehavior.CENTER_OFFSET));
  }

  /**
   * Test {@link TreeBidiMap#nextKey(Comparable)} with {@code BaselineResizeBehavior}.
   *
   * <ul>
   *   <li>When {@code CONSTANT_ASCENT}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#nextKey(Comparable)}
   */
  @Test
  @DisplayName(
      "Test nextKey(Comparable) with 'BaselineResizeBehavior'; when 'CONSTANT_ASCENT'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.nextKey(Comparable)"})
  void testNextKeyWithBaselineResizeBehavior_whenConstantAscent_thenReturnNull() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNull(
        baselineResizeBehaviorBaselineResizeBehaviorMap.nextKey(
            BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#nextKey(Comparable)} with {@code BaselineResizeBehavior}.
   *
   * <ul>
   *   <li>When {@code CONSTANT_DESCENT}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#nextKey(Comparable)}
   */
  @Test
  @DisplayName(
      "Test nextKey(Comparable) with 'BaselineResizeBehavior'; when 'CONSTANT_DESCENT'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.nextKey(Comparable)"})
  void testNextKeyWithBaselineResizeBehavior_whenConstantDescent_thenReturnNull() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNull(
        baselineResizeBehaviorBaselineResizeBehaviorMap.nextKey(
            BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test Node {@link Node#equals(Object)}, and {@link Node#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Node#equals(Object)}
   *   <li>{@link Node#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test Node equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Node.equals(Object)", "int Node.hashCode()"})
  void testNodeEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Node<BaselineResizeBehavior, BaselineResizeBehavior> node =
        new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);
    Node<BaselineResizeBehavior, BaselineResizeBehavior> node2 =
        new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(node, node2);
    assertEquals(node.hashCode(), node2.hashCode());
  }

  /**
   * Test Node {@link Node#equals(Object)}, and {@link Node#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Node#equals(Object)}
   *   <li>{@link Node#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test Node equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Node.equals(Object)", "int Node.hashCode()"})
  void testNodeEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Node<BaselineResizeBehavior, BaselineResizeBehavior> node =
        new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(node, node);
    int expectedHashCodeResult = node.hashCode();
    assertEquals(expectedHashCodeResult, node.hashCode());
  }

  /**
   * Test Node {@link Node#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Node#equals(Object)}
   */
  @Test
  @DisplayName("Test Node equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Node.equals(Object)", "int Node.hashCode()"})
  void testNodeEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Node<BaselineResizeBehavior, BaselineResizeBehavior> node =
        new Node<>(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNotEquals(
        node,
        new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test Node {@link Node#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Node#equals(Object)}
   */
  @Test
  @DisplayName("Test Node equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Node.equals(Object)", "int Node.hashCode()"})
  void testNodeEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Node<BaselineResizeBehavior, BaselineResizeBehavior> node =
        new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_DESCENT);

    // Act and Assert
    assertNotEquals(
        node,
        new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test Node {@link Node#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Node#equals(Object)}
   */
  @Test
  @DisplayName("Test Node equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Node.equals(Object)", "int Node.hashCode()"})
  void testNodeEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Node<BaselineResizeBehavior, BaselineResizeBehavior> node =
        new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNotEquals(node, new SimpleEntry<>("42", "42"));
  }

  /**
   * Test Node {@link Node#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then throw exception.
   * </ul>
   *
   * <p>Method under test: {@link Node#equals(Object)}
   */
  @Test
  @DisplayName("Test Node equals(Object); when other is different; then throw exception")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Node.equals(Object)", "int Node.hashCode()"})
  void testNodeEquals_whenOtherIsDifferent_thenThrowException() {
    // Arrange
    Node<BaselineResizeBehavior, BaselineResizeBehavior> node =
        new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    MapEntry<Object, Object> mapEntry = mock(MapEntry.class);
    when(mapEntry.getKey()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> node.equals(mapEntry));
  }

  /**
   * Test Node {@link Node#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Node#equals(Object)}
   */
  @Test
  @DisplayName("Test Node equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Node.equals(Object)", "int Node.hashCode()"})
  void testNodeEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Node<BaselineResizeBehavior, BaselineResizeBehavior> node =
        new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNotEquals(node, null);
  }

  /**
   * Test Node {@link Node#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Node#equals(Object)}
   */
  @Test
  @DisplayName("Test Node equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Node.equals(Object)", "int Node.hashCode()"})
  void testNodeEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Node<BaselineResizeBehavior, BaselineResizeBehavior> node =
        new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNotEquals(node, "Different type to Node");
  }

  /**
   * Test Node {@link Node#getKey()}.
   *
   * <p>Method under test: {@link Node#getKey()}
   */
  @Test
  @DisplayName("Test Node getKey()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable Node.getKey()"})
  void testNodeGetKey() {
    // Arrange
    Node<BaselineResizeBehavior, BaselineResizeBehavior> node =
        new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT, node.getKey());
  }

  /**
   * Test Node {@link Node#getValue()}.
   *
   * <p>Method under test: {@link Node#getValue()}
   */
  @Test
  @DisplayName("Test Node getValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable Node.getValue()"})
  void testNodeGetValue() {
    // Arrange
    Node<BaselineResizeBehavior, BaselineResizeBehavior> node =
        new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT, node.getValue());
  }

  /**
   * Test Node {@link Node#Node(Comparable, Comparable)}.
   *
   * <p>Method under test: {@link Node#Node(Comparable, Comparable)}
   */
  @Test
  @DisplayName("Test Node new Node(Comparable, Comparable)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Node.<init>(Comparable, Comparable)"})
  void testNodeNewNode() {
    // Arrange and Act
    Node<BaselineResizeBehavior, BaselineResizeBehavior> actualNode =
        new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Assert
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT, actualNode.getKey());
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT, actualNode.getValue());
  }

  /**
   * Test Node {@link Node#setValue(Comparable)} with {@code BaselineResizeBehavior}.
   *
   * <p>Method under test: {@link Node#setValue(Comparable)}
   */
  @Test
  @DisplayName("Test Node setValue(Comparable) with 'BaselineResizeBehavior'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable Node.setValue(Comparable)"})
  void testNodeSetValueWithBaselineResizeBehavior() throws UnsupportedOperationException {
    // Arrange
    Node<BaselineResizeBehavior, BaselineResizeBehavior> node =
        new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> node.setValue(BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#previousKey(Comparable)} with {@code BaselineResizeBehavior}.
   *
   * <p>Method under test: {@link TreeBidiMap#previousKey(Comparable)}
   */
  @Test
  @DisplayName("Test previousKey(Comparable) with 'BaselineResizeBehavior'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.previousKey(Comparable)"})
  void testPreviousKeyWithBaselineResizeBehavior() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNull(
        baselineResizeBehaviorBaselineResizeBehaviorMap.previousKey(
            BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#previousKey(Comparable)} with {@code BaselineResizeBehavior}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()}.
   *   <li>When {@code CONSTANT_ASCENT}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#previousKey(Comparable)}
   */
  @Test
  @DisplayName(
      "Test previousKey(Comparable) with 'BaselineResizeBehavior'; given TreeBidiMap(); when 'CONSTANT_ASCENT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.previousKey(Comparable)"})
  void testPreviousKeyWithBaselineResizeBehavior_givenTreeBidiMap_whenConstantAscent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertNull(
        baselineResizeBehaviorBaselineResizeBehaviorMap.previousKey(
            BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#previousKey(Comparable)} with {@code BaselineResizeBehavior}.
   *
   * <ul>
   *   <li>Then return {@code CONSTANT_ASCENT}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#previousKey(Comparable)}
   */
  @Test
  @DisplayName(
      "Test previousKey(Comparable) with 'BaselineResizeBehavior'; then return 'CONSTANT_ASCENT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.previousKey(Comparable)"})
  void testPreviousKeyWithBaselineResizeBehavior_thenReturnConstantAscent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.previousKey(
            BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#previousKey(Comparable)} with {@code BaselineResizeBehavior}.
   *
   * <ul>
   *   <li>Then return {@code CONSTANT_DESCENT}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#previousKey(Comparable)}
   */
  @Test
  @DisplayName(
      "Test previousKey(Comparable) with 'BaselineResizeBehavior'; then return 'CONSTANT_DESCENT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.previousKey(Comparable)"})
  void testPreviousKeyWithBaselineResizeBehavior_thenReturnConstantDescent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(
        BaselineResizeBehavior.CONSTANT_DESCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.previousKey(
            BaselineResizeBehavior.CENTER_OFFSET));
  }

  /**
   * Test {@link TreeBidiMap#previousKey(Comparable)} with {@code BaselineResizeBehavior}.
   *
   * <ul>
   *   <li>When {@code CONSTANT_ASCENT}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#previousKey(Comparable)}
   */
  @Test
  @DisplayName(
      "Test previousKey(Comparable) with 'BaselineResizeBehavior'; when 'CONSTANT_ASCENT'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.previousKey(Comparable)"})
  void testPreviousKeyWithBaselineResizeBehavior_whenConstantAscent_thenReturnNull() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNull(
        baselineResizeBehaviorBaselineResizeBehaviorMap.previousKey(
            BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#previousKey(Comparable)} with {@code BaselineResizeBehavior}.
   *
   * <ul>
   *   <li>When {@code CONSTANT_DESCENT}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#previousKey(Comparable)}
   */
  @Test
  @DisplayName(
      "Test previousKey(Comparable) with 'BaselineResizeBehavior'; when 'CONSTANT_DESCENT'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.previousKey(Comparable)"})
  void testPreviousKeyWithBaselineResizeBehavior_whenConstantDescent_thenReturnNull() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNull(
        baselineResizeBehaviorBaselineResizeBehaviorMap.previousKey(
            BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior},
   * {@code BaselineResizeBehavior}.
   *
   * <p>Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @DisplayName(
      "Test put(Comparable, Comparable) with 'BaselineResizeBehavior', 'BaselineResizeBehavior'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  void testPutWithBaselineResizeBehaviorBaselineResizeBehavior() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNull(
        baselineResizeBehaviorBaselineResizeBehaviorMap.put(
            BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(1, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior},
   * {@code BaselineResizeBehavior}.
   *
   * <p>Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @DisplayName(
      "Test put(Comparable, Comparable) with 'BaselineResizeBehavior', 'BaselineResizeBehavior'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  void testPutWithBaselineResizeBehaviorBaselineResizeBehavior2() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    BaselineResizeBehavior actualPutResult =
        baselineResizeBehaviorBaselineResizeBehaviorMap.put(
            BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Assert
    assertEquals(1, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT, actualPutResult);
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior},
   * {@code BaselineResizeBehavior}.
   *
   * <p>Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @DisplayName(
      "Test put(Comparable, Comparable) with 'BaselineResizeBehavior', 'BaselineResizeBehavior'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  void testPutWithBaselineResizeBehaviorBaselineResizeBehavior3() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNull(
        baselineResizeBehaviorBaselineResizeBehaviorMap.put(
            BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(1, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior},
   * {@code BaselineResizeBehavior}.
   *
   * <p>Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @DisplayName(
      "Test put(Comparable, Comparable) with 'BaselineResizeBehavior', 'BaselineResizeBehavior'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  void testPutWithBaselineResizeBehaviorBaselineResizeBehavior4() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNull(
        baselineResizeBehaviorBaselineResizeBehaviorMap.put(
            BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(2, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior},
   * {@code BaselineResizeBehavior}.
   *
   * <p>Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @DisplayName(
      "Test put(Comparable, Comparable) with 'BaselineResizeBehavior', 'BaselineResizeBehavior'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  void testPutWithBaselineResizeBehaviorBaselineResizeBehavior5() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNull(
        baselineResizeBehaviorBaselineResizeBehaviorMap.put(
            BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(2, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CENTER_OFFSET));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior},
   * {@code BaselineResizeBehavior}.
   *
   * <p>Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @DisplayName(
      "Test put(Comparable, Comparable) with 'BaselineResizeBehavior', 'BaselineResizeBehavior'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  void testPutWithBaselineResizeBehaviorBaselineResizeBehavior6() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.OTHER, BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNull(
        baselineResizeBehaviorBaselineResizeBehaviorMap.put(
            BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(3, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CENTER_OFFSET));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.OTHER));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior},
   * {@code BaselineResizeBehavior}.
   *
   * <p>Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @DisplayName(
      "Test put(Comparable, Comparable) with 'BaselineResizeBehavior', 'BaselineResizeBehavior'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  void testPutWithBaselineResizeBehaviorBaselineResizeBehavior7() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    BaselineResizeBehavior actualPutResult =
        baselineResizeBehaviorBaselineResizeBehaviorMap.put(
            BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CENTER_OFFSET);

    // Assert
    assertEquals(2, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CENTER_OFFSET,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT, actualPutResult);
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior},
   * {@code BaselineResizeBehavior}.
   *
   * <p>Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @DisplayName(
      "Test put(Comparable, Comparable) with 'BaselineResizeBehavior', 'BaselineResizeBehavior'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  void testPutWithBaselineResizeBehaviorBaselineResizeBehavior8() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.OTHER, BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    BaselineResizeBehavior actualPutResult =
        baselineResizeBehaviorBaselineResizeBehaviorMap.put(
            BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Assert
    assertEquals(2, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CENTER_OFFSET));
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT, actualPutResult);
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.OTHER));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior},
   * {@code BaselineResizeBehavior}.
   *
   * <p>Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @DisplayName(
      "Test put(Comparable, Comparable) with 'BaselineResizeBehavior', 'BaselineResizeBehavior'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  void testPutWithBaselineResizeBehaviorBaselineResizeBehavior9() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.OTHER, BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    BaselineResizeBehavior actualPutResult =
        baselineResizeBehaviorBaselineResizeBehaviorMap.put(
            BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Assert
    assertEquals(3, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CENTER_OFFSET));
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT, actualPutResult);
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.OTHER));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior},
   * {@code BaselineResizeBehavior}.
   *
   * <p>Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @DisplayName(
      "Test put(Comparable, Comparable) with 'BaselineResizeBehavior', 'BaselineResizeBehavior'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  void testPutWithBaselineResizeBehaviorBaselineResizeBehavior10() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.OTHER, BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_DESCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Assert
    assertEquals(3, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CENTER_OFFSET));
    assertEquals(
        BaselineResizeBehavior.CONSTANT_DESCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.OTHER));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior},
   * {@code BaselineResizeBehavior}.
   *
   * <p>Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @DisplayName(
      "Test put(Comparable, Comparable) with 'BaselineResizeBehavior', 'BaselineResizeBehavior'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  void testPutWithBaselineResizeBehaviorBaselineResizeBehavior11() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.OTHER, BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    BaselineResizeBehavior actualPutResult =
        baselineResizeBehaviorBaselineResizeBehaviorMap.put(
            BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Assert
    assertEquals(2, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CONSTANT_DESCENT));
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT, actualPutResult);
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.OTHER));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior},
   * {@code BaselineResizeBehavior}.
   *
   * <p>Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @DisplayName(
      "Test put(Comparable, Comparable) with 'BaselineResizeBehavior', 'BaselineResizeBehavior'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  void testPutWithBaselineResizeBehaviorBaselineResizeBehavior12() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.OTHER, BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.OTHER);

    // Assert
    assertEquals(4, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(
        BaselineResizeBehavior.OTHER,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CENTER_OFFSET));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.OTHER));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior},
   * {@code BaselineResizeBehavior}.
   *
   * <p>Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @DisplayName(
      "Test put(Comparable, Comparable) with 'BaselineResizeBehavior', 'BaselineResizeBehavior'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  void testPutWithBaselineResizeBehaviorBaselineResizeBehavior13() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.OTHER, BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    BaselineResizeBehavior actualPutResult =
        baselineResizeBehaviorBaselineResizeBehaviorMap.put(
            BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.OTHER);

    // Assert
    assertEquals(3, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT, actualPutResult);
    assertEquals(
        BaselineResizeBehavior.OTHER,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CENTER_OFFSET));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.OTHER));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior},
   * {@code BaselineResizeBehavior}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @DisplayName(
      "Test put(Comparable, Comparable) with 'BaselineResizeBehavior', 'BaselineResizeBehavior'; given TreeBidiMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  void testPutWithBaselineResizeBehaviorBaselineResizeBehavior_givenTreeBidiMap() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertNull(
        baselineResizeBehaviorBaselineResizeBehaviorMap.put(
            BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(1, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior},
   * {@code BaselineResizeBehavior}.
   *
   * <ul>
   *   <li>Then return {@code CONSTANT_ASCENT}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @DisplayName(
      "Test put(Comparable, Comparable) with 'BaselineResizeBehavior', 'BaselineResizeBehavior'; then return 'CONSTANT_ASCENT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  void testPutWithBaselineResizeBehaviorBaselineResizeBehavior_thenReturnConstantAscent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    BaselineResizeBehavior actualPutResult =
        baselineResizeBehaviorBaselineResizeBehaviorMap.put(
            BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Assert
    assertEquals(2, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT, actualPutResult);
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior},
   * {@code BaselineResizeBehavior}.
   *
   * <ul>
   *   <li>Then {@link TreeBidiMap#TreeBidiMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @DisplayName(
      "Test put(Comparable, Comparable) with 'BaselineResizeBehavior', 'BaselineResizeBehavior'; then TreeBidiMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  void testPutWithBaselineResizeBehaviorBaselineResizeBehavior_thenTreeBidiMapSizeIsOne() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    BaselineResizeBehavior actualPutResult =
        baselineResizeBehaviorBaselineResizeBehaviorMap.put(
            BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Assert
    assertEquals(1, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT, actualPutResult);
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   *
   * <ul>
   *   <li>Given {@code OTHER}.
   *   <li>Then {@link TreeBidiMap#TreeBidiMap()} {@code OTHER} is {@code CENTER_OFFSET}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map); given 'OTHER'; then TreeBidiMap() 'OTHER' is 'CENTER_OFFSET'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  void testPutAll_givenOther_thenTreeBidiMapOtherIsCenterOffset() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.OTHER, BaselineResizeBehavior.CENTER_OFFSET);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert
    assertEquals(3, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CENTER_OFFSET,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.OTHER));
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   *
   * <ul>
   *   <li>Given {@code OTHER}.
   *   <li>When {@link HashMap#HashMap()} {@code OTHER} is {@code CENTER_OFFSET}.
   *   <li>Then {@link HashMap#HashMap()} containsKey {@code OTHER}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @DisplayName(
      "Test putAll(Map); given 'OTHER'; when HashMap() 'OTHER' is 'CENTER_OFFSET'; then HashMap() containsKey 'OTHER'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  void testPutAll_givenOther_whenHashMapOtherIsCenterOffset_thenHashMapContainsKeyOther() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.OTHER, BaselineResizeBehavior.CENTER_OFFSET);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert
    assertEquals(3, map.size());
    assertEquals(3, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CENTER_OFFSET,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.OTHER));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.OTHER));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()} {@code CONSTANT_DESCENT} is {@code
   *       CONSTANT_DESCENT}.
   *   <li>Then {@link HashMap#HashMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @DisplayName(
      "Test putAll(Map); given TreeBidiMap() 'CONSTANT_DESCENT' is 'CONSTANT_DESCENT'; then HashMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  void testPutAll_givenTreeBidiMapConstantDescentIsConstantDescent_thenHashMapSizeIsOne() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert that nothing has changed
    assertEquals(1, map.size());
    assertEquals(2, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()}.
   *   <li>Then {@link HashMap#HashMap()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map); given TreeBidiMap(); then HashMap() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  void testPutAll_givenTreeBidiMap_thenHashMapSizeIsTwo() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert
    assertEquals(2, map.size());
    assertEquals(2, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()}.
   *   <li>Then {@link TreeBidiMap#TreeBidiMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map); given TreeBidiMap(); then TreeBidiMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  void testPutAll_givenTreeBidiMap_thenTreeBidiMapSizeIsOne() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert
    assertEquals(1, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, map);
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()}.
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then {@link HashMap#HashMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map); given TreeBidiMap(); when HashMap(); then HashMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  void testPutAll_givenTreeBidiMap_whenHashMap_thenHashMapEmpty() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert that nothing has changed
    assertTrue(map.isEmpty());
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.isEmpty());
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   *
   * <ul>
   *   <li>Then {@link HashMap#HashMap()} containsKey {@code CENTER_OFFSET}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map); then HashMap() containsKey 'CENTER_OFFSET'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  void testPutAll_thenHashMapContainsKeyCenterOffset() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CENTER_OFFSET);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert
    assertEquals(3, map.size());
    assertEquals(3, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CENTER_OFFSET,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CENTER_OFFSET));
    assertTrue(map.containsKey(BaselineResizeBehavior.CENTER_OFFSET));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   *
   * <ul>
   *   <li>Then {@link HashMap#HashMap()} is {@link TreeBidiMap#TreeBidiMap()}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map); then HashMap() is TreeBidiMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  void testPutAll_thenHashMapIsTreeBidiMap() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert that nothing has changed
    assertEquals(2, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_DESCENT));
    assertEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, map);
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   *
   * <ul>
   *   <li>Then {@link TreeBidiMap#TreeBidiMap()} {@code CENTER_OFFSET} is {@code CENTER_OFFSET}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map); then TreeBidiMap() 'CENTER_OFFSET' is 'CENTER_OFFSET'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  void testPutAll_thenTreeBidiMapCenterOffsetIsCenterOffset() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CENTER_OFFSET);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert
    assertEquals(3, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CENTER_OFFSET,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CENTER_OFFSET));
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   *
   * <ul>
   *   <li>Then {@link TreeBidiMap#TreeBidiMap()} {@code CONSTANT_DESCENT} is {@code
   *       CONSTANT_DESCENT}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map); then TreeBidiMap() 'CONSTANT_DESCENT' is 'CONSTANT_DESCENT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  void testPutAll_thenTreeBidiMapConstantDescentIsConstantDescent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert
    assertEquals(2, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CONSTANT_DESCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, map);
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   *
   * <ul>
   *   <li>Then {@link TreeBidiMap#TreeBidiMap()} containsKey {@code CENTER_OFFSET}.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map); then TreeBidiMap() containsKey 'CENTER_OFFSET'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  void testPutAll_thenTreeBidiMapContainsKeyCenterOffset() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert that nothing has changed
    assertEquals(2, map.size());
    assertEquals(3, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CENTER_OFFSET));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(
        baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(
            BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   *
   * <ul>
   *   <li>Then {@link TreeBidiMap#TreeBidiMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map); then TreeBidiMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  void testPutAll_thenTreeBidiMapSizeIsOne() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(
        BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert that nothing has changed
    assertEquals(1, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(
        BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(
            BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, map);
  }

  /**
   * Test {@link TreeBidiMap#remove(Object)} with {@code Object}.
   *
   * <p>Method under test: {@link TreeBidiMap#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object) with 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.remove(Object)"})
  void testRemoveWithObject() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertNull(baselineResizeBehaviorBaselineResizeBehaviorMap.remove("Key"));
  }

  /**
   * Test {@link TreeBidiMap#removeValue(Object)}.
   *
   * <p>Method under test: {@link TreeBidiMap#removeValue(Object)}
   */
  @Test
  @DisplayName("Test removeValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable TreeBidiMap.removeValue(Object)"})
  void testRemoveValue() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertNull(baselineResizeBehaviorBaselineResizeBehaviorMap.removeValue("Value"));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TreeBidiMap#toString()}
   *   <li>{@link TreeBidiMap#size()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int TreeBidiMap.size()", "String TreeBidiMap.toString()"})
  void testGettersAndSetters() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act
    String actualToStringResult = baselineResizeBehaviorBaselineResizeBehaviorMap.toString();

    // Assert
    assertEquals("{}", actualToStringResult);
    assertEquals(0, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
  }

  /**
   * Test ValueView {@link ValueView#ValueView(TreeBidiMap, DataElement)}.
   *
   * <p>Method under test: {@link ValueView#ValueView(TreeBidiMap, DataElement)}
   */
  @Test
  @DisplayName("Test ValueView new ValueView(TreeBidiMap, DataElement)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ValueView.<init>(TreeBidiMap, DataElement)"})
  void testValueViewNewValueView() {
    // Arrange, Act and Assert
    assertTrue(new TreeBidiMap().new ValueView(DataElement.KEY).isEmpty());
  }

  /**
   * Test {@link TreeBidiMap#values()}.
   *
   * <p>Method under test: {@link TreeBidiMap#values()}
   */
  @Test
  @DisplayName("Test values()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set TreeBidiMap.values()"})
  void testValues() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior>
        baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.values().isEmpty());
  }

  /**
   * Test ViewMapEntryIterator {@link ViewMapEntryIterator#ViewMapEntryIterator(TreeBidiMap)}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>Then return next Key is {@code Key}.
   * </ul>
   *
   * <p>Method under test: {@link ViewMapEntryIterator#ViewMapEntryIterator(TreeBidiMap)}
   */
  @Test
  @DisplayName(
      "Test ViewMapEntryIterator new ViewMapEntryIterator(TreeBidiMap); given 'Key'; then return next Key is 'Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ViewMapEntryIterator.<init>(TreeBidiMap)"})
  void testViewMapEntryIteratorNewViewMapEntryIterator_givenKey_thenReturnNextKeyIsKey() {
    // Arrange
    TreeBidiMap treeBidiMap = new TreeBidiMap();
    treeBidiMap.put("Key", "Value");

    // Act
    ViewMapEntryIterator actualViewMapEntryIterator = treeBidiMap.new ViewMapEntryIterator();

    // Assert
    Entry<BaselineResizeBehavior, BaselineResizeBehavior> nextResult =
        actualViewMapEntryIterator.next();
    assertTrue(nextResult instanceof Node);
    assertEquals("Key", nextResult.getKey());
    assertEquals("Value", nextResult.getValue());
    assertFalse(actualViewMapEntryIterator.hasNext());
  }

  /**
   * Test ViewMapEntryIterator {@link ViewMapEntryIterator#ViewMapEntryIterator(TreeBidiMap)}.
   *
   * <ul>
   *   <li>When {@link TreeBidiMap#TreeBidiMap()}.
   * </ul>
   *
   * <p>Method under test: {@link ViewMapEntryIterator#ViewMapEntryIterator(TreeBidiMap)}
   */
  @Test
  @DisplayName(
      "Test ViewMapEntryIterator new ViewMapEntryIterator(TreeBidiMap); when TreeBidiMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ViewMapEntryIterator.<init>(TreeBidiMap)"})
  void testViewMapEntryIteratorNewViewMapEntryIterator_whenTreeBidiMap() {
    // Arrange, Act and Assert
    assertFalse(new TreeBidiMap().new ViewMapEntryIterator().hasNext());
  }

  /**
   * Test ViewMapEntryIterator {@link ViewMapEntryIterator#next()}.
   *
   * <p>Method under test: {@link ViewMapEntryIterator#next()}
   */
  @Test
  @DisplayName("Test ViewMapEntryIterator next()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Entry ViewMapEntryIterator.next()"})
  void testViewMapEntryIteratorNext() {
    // Arrange
    TreeBidiMap treeBidiMap = new TreeBidiMap();
    treeBidiMap.put("Key", "Value");
    ViewMapEntryIterator viewMapEntryIterator = treeBidiMap.new ViewMapEntryIterator();

    // Act
    Entry<BaselineResizeBehavior, BaselineResizeBehavior> actualNextResult =
        viewMapEntryIterator.next();

    // Assert
    assertFalse(viewMapEntryIterator.hasNext());
    assertSame(viewMapEntryIterator.lastReturnedNode, actualNextResult);
  }

  /**
   * Test ViewMapEntryIterator {@link ViewMapEntryIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()} IfAbsent {@code 42} is {@code 42}.
   *   <li>Then return Key is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ViewMapEntryIterator#next()}
   */
  @Test
  @DisplayName(
      "Test ViewMapEntryIterator next(); given TreeBidiMap() IfAbsent '42' is '42'; then return Key is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Entry ViewMapEntryIterator.next()"})
  void testViewMapEntryIteratorNext_givenTreeBidiMapIfAbsent42Is42_thenReturnKeyIs42() {
    // Arrange
    TreeBidiMap treeBidiMap = new TreeBidiMap();
    treeBidiMap.putIfAbsent("42", "42");
    treeBidiMap.put("Key", "Value");
    ViewMapEntryIterator viewMapEntryIterator = treeBidiMap.new ViewMapEntryIterator();

    // Act
    Entry<BaselineResizeBehavior, BaselineResizeBehavior> actualNextResult =
        viewMapEntryIterator.next();

    // Assert
    assertTrue(actualNextResult instanceof Node);
    Entry<BaselineResizeBehavior, BaselineResizeBehavior> nextResult = viewMapEntryIterator.next();
    assertTrue(nextResult instanceof Node);
    assertEquals("42", actualNextResult.getKey());
    assertEquals("42", actualNextResult.getValue());
    assertEquals("Key", nextResult.getKey());
    assertEquals("Value", nextResult.getValue());
    assertFalse(viewMapEntryIterator.hasNext());
  }

  /**
   * Test ViewMapEntryIterator {@link ViewMapEntryIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()} IfAbsent {@code foo} is {@code 42}.
   *   <li>Then return {@code Key}.
   * </ul>
   *
   * <p>Method under test: {@link ViewMapEntryIterator#next()}
   */
  @Test
  @DisplayName(
      "Test ViewMapEntryIterator next(); given TreeBidiMap() IfAbsent 'foo' is '42'; then return 'Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Entry ViewMapEntryIterator.next()"})
  void testViewMapEntryIteratorNext_givenTreeBidiMapIfAbsentFooIs42_thenReturnKey() {
    // Arrange
    TreeBidiMap treeBidiMap = new TreeBidiMap();
    treeBidiMap.putIfAbsent("foo", "42");
    treeBidiMap.put("Key", "Value");
    ViewMapEntryIterator viewMapEntryIterator = treeBidiMap.new ViewMapEntryIterator();

    // Act
    Entry<BaselineResizeBehavior, BaselineResizeBehavior> actualNextResult =
        viewMapEntryIterator.next();

    // Assert
    assertTrue(actualNextResult instanceof Node);
    Entry<BaselineResizeBehavior, BaselineResizeBehavior> nextResult = viewMapEntryIterator.next();
    assertTrue(nextResult instanceof Node);
    assertEquals("42", nextResult.getValue());
    assertEquals("Key", actualNextResult.getKey());
    assertEquals("Value", actualNextResult.getValue());
    assertEquals("foo", nextResult.getKey());
    assertFalse(viewMapEntryIterator.hasNext());
  }

  /**
   * Test ViewMapEntryIterator {@link ViewMapEntryIterator#next()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link ViewMapEntryIterator#next()}
   */
  @Test
  @DisplayName("Test ViewMapEntryIterator next(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Entry ViewMapEntryIterator.next()"})
  void testViewMapEntryIteratorNext_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> new TreeBidiMap().new ViewMapEntryIterator().next());
  }

  /**
   * Test ViewMapEntryIterator {@link ViewMapEntryIterator#previous()}.
   *
   * <p>Method under test: {@link ViewMapEntryIterator#previous()}
   */
  @Test
  @DisplayName("Test ViewMapEntryIterator previous()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Entry ViewMapEntryIterator.previous()"})
  void testViewMapEntryIteratorPrevious() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> new TreeBidiMap().new ViewMapEntryIterator().previous());
  }

  /**
   * Test ViewMapIterator {@link ViewMapIterator#getKey()}.
   *
   * <p>Method under test: {@link ViewMapIterator#getKey()}
   */
  @Test
  @DisplayName("Test ViewMapIterator getKey()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable ViewMapIterator.getKey()"})
  void testViewMapIteratorGetKey() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalStateException.class,
        () -> new TreeBidiMap().new ViewMapIterator(DataElement.KEY).getKey());
  }

  /**
   * Test ViewMapIterator {@link ViewMapIterator#getValue()}.
   *
   * <p>Method under test: {@link ViewMapIterator#getValue()}
   */
  @Test
  @DisplayName("Test ViewMapIterator getValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable ViewMapIterator.getValue()"})
  void testViewMapIteratorGetValue() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalStateException.class,
        () -> new TreeBidiMap().new ViewMapIterator(DataElement.KEY).getValue());
  }

  /**
   * Test ViewMapIterator {@link ViewMapIterator#ViewMapIterator(TreeBidiMap, DataElement)}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>Then return next is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link ViewMapIterator#ViewMapIterator(TreeBidiMap, DataElement)}
   */
  @Test
  @DisplayName(
      "Test ViewMapIterator new ViewMapIterator(TreeBidiMap, DataElement); given 'foo'; then return next is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ViewMapIterator.<init>(TreeBidiMap, DataElement)"})
  void testViewMapIteratorNewViewMapIterator_givenFoo_thenReturnNextIsFoo() {
    // Arrange
    TreeBidiMap treeBidiMap = new TreeBidiMap();
    treeBidiMap.putIfAbsent("foo", "42");
    treeBidiMap.put("Key", "Value");

    // Act
    ViewMapIterator actualViewMapIterator = treeBidiMap.new ViewMapIterator(DataElement.KEY);

    // Assert
    assertEquals("Key", actualViewMapIterator.next());
    assertEquals("foo", actualViewMapIterator.next());
    assertFalse(actualViewMapIterator.hasNext());
  }

  /**
   * Test ViewMapIterator {@link ViewMapIterator#ViewMapIterator(TreeBidiMap, DataElement)}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>Then return next is {@code Key}.
   * </ul>
   *
   * <p>Method under test: {@link ViewMapIterator#ViewMapIterator(TreeBidiMap, DataElement)}
   */
  @Test
  @DisplayName(
      "Test ViewMapIterator new ViewMapIterator(TreeBidiMap, DataElement); given 'Key'; then return next is 'Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ViewMapIterator.<init>(TreeBidiMap, DataElement)"})
  void testViewMapIteratorNewViewMapIterator_givenKey_thenReturnNextIsKey() {
    // Arrange
    TreeBidiMap treeBidiMap = new TreeBidiMap();
    treeBidiMap.put("Key", "Value");

    // Act
    ViewMapIterator actualViewMapIterator = treeBidiMap.new ViewMapIterator(DataElement.KEY);

    // Assert
    assertEquals("Key", actualViewMapIterator.next());
    assertFalse(actualViewMapIterator.hasNext());
  }

  /**
   * Test ViewMapIterator {@link ViewMapIterator#ViewMapIterator(TreeBidiMap, DataElement)}.
   *
   * <ul>
   *   <li>When {@link TreeBidiMap#TreeBidiMap()}.
   * </ul>
   *
   * <p>Method under test: {@link ViewMapIterator#ViewMapIterator(TreeBidiMap, DataElement)}
   */
  @Test
  @DisplayName(
      "Test ViewMapIterator new ViewMapIterator(TreeBidiMap, DataElement); when TreeBidiMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ViewMapIterator.<init>(TreeBidiMap, DataElement)"})
  void testViewMapIteratorNewViewMapIterator_whenTreeBidiMap() {
    // Arrange, Act and Assert
    assertFalse(new TreeBidiMap().new ViewMapIterator(DataElement.KEY).hasNext());
  }

  /**
   * Test ViewMapIterator {@link ViewMapIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()} IfAbsent {@code 42} is {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ViewMapIterator#next()}
   */
  @Test
  @DisplayName(
      "Test ViewMapIterator next(); given TreeBidiMap() IfAbsent '42' is '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable ViewMapIterator.next()"})
  void testViewMapIteratorNext_givenTreeBidiMapIfAbsent42Is42_thenReturn42() {
    // Arrange
    TreeBidiMap treeBidiMap = new TreeBidiMap();
    treeBidiMap.putIfAbsent("42", "42");
    treeBidiMap.put("Key", "Value");
    ViewMapIterator viewMapIterator = treeBidiMap.new ViewMapIterator(DataElement.KEY);

    // Act and Assert
    assertEquals("42", viewMapIterator.next());
    assertEquals("Key", viewMapIterator.next());
    assertFalse(viewMapIterator.hasNext());
  }

  /**
   * Test ViewMapIterator {@link ViewMapIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()} IfAbsent {@code 42} is {@code foo}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ViewMapIterator#next()}
   */
  @Test
  @DisplayName(
      "Test ViewMapIterator next(); given TreeBidiMap() IfAbsent '42' is 'foo'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable ViewMapIterator.next()"})
  void testViewMapIteratorNext_givenTreeBidiMapIfAbsent42IsFoo_thenReturn42() {
    // Arrange
    TreeBidiMap treeBidiMap = new TreeBidiMap();
    treeBidiMap.putIfAbsent("42", "foo");
    treeBidiMap.putIfAbsent("foo", "42");
    treeBidiMap.put("Key", "Value");
    ViewMapIterator viewMapIterator = treeBidiMap.new ViewMapIterator(DataElement.KEY);

    // Act and Assert
    assertEquals("42", viewMapIterator.next());
    assertEquals("Key", viewMapIterator.next());
    assertEquals("foo", viewMapIterator.next());
    assertFalse(viewMapIterator.hasNext());
  }

  /**
   * Test ViewMapIterator {@link ViewMapIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()} IfAbsent {@code foo} is {@code 42}.
   *   <li>Then return {@code Key}.
   * </ul>
   *
   * <p>Method under test: {@link ViewMapIterator#next()}
   */
  @Test
  @DisplayName(
      "Test ViewMapIterator next(); given TreeBidiMap() IfAbsent 'foo' is '42'; then return 'Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable ViewMapIterator.next()"})
  void testViewMapIteratorNext_givenTreeBidiMapIfAbsentFooIs42_thenReturnKey() {
    // Arrange
    TreeBidiMap treeBidiMap = new TreeBidiMap();
    treeBidiMap.putIfAbsent("foo", "42");
    treeBidiMap.put("Key", "Value");
    ViewMapIterator viewMapIterator = treeBidiMap.new ViewMapIterator(DataElement.KEY);

    // Act and Assert
    assertEquals("Key", viewMapIterator.next());
    assertEquals("foo", viewMapIterator.next());
    assertFalse(viewMapIterator.hasNext());
  }

  /**
   * Test ViewMapIterator {@link ViewMapIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code Key}.
   * </ul>
   *
   * <p>Method under test: {@link ViewMapIterator#next()}
   */
  @Test
  @DisplayName(
      "Test ViewMapIterator next(); given TreeBidiMap() 'Key' is 'Value'; then return 'Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable ViewMapIterator.next()"})
  void testViewMapIteratorNext_givenTreeBidiMapKeyIsValue_thenReturnKey() {
    // Arrange
    TreeBidiMap treeBidiMap = new TreeBidiMap();
    treeBidiMap.put("Key", "Value");
    ViewMapIterator viewMapIterator = treeBidiMap.new ViewMapIterator(DataElement.KEY);

    // Act and Assert
    assertEquals("Key", viewMapIterator.next());
    assertFalse(viewMapIterator.hasNext());
  }

  /**
   * Test ViewMapIterator {@link ViewMapIterator#next()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link ViewMapIterator#next()}
   */
  @Test
  @DisplayName("Test ViewMapIterator next(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable ViewMapIterator.next()"})
  void testViewMapIteratorNext_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> new TreeBidiMap().new ViewMapIterator(DataElement.KEY).next());
  }

  /**
   * Test ViewMapIterator {@link ViewMapIterator#previous()}.
   *
   * <p>Method under test: {@link ViewMapIterator#previous()}
   */
  @Test
  @DisplayName("Test ViewMapIterator previous()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable ViewMapIterator.previous()"})
  void testViewMapIteratorPrevious() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> new TreeBidiMap().new ViewMapIterator(DataElement.KEY).previous());
  }

  /**
   * Test ViewMapIterator {@link ViewMapIterator#setValue(Comparable)} with {@code
   * BaselineResizeBehavior}.
   *
   * <p>Method under test: {@link ViewMapIterator#setValue(Comparable)}
   */
  @Test
  @DisplayName("Test ViewMapIterator setValue(Comparable) with 'BaselineResizeBehavior'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparable ViewMapIterator.setValue(Comparable)"})
  void testViewMapIteratorSetValueWithBaselineResizeBehavior() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            new TreeBidiMap().new ViewMapIterator(DataElement.KEY)
                .setValue(BaselineResizeBehavior.CONSTANT_ASCENT));
  }
}
