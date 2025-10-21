package org.apache.commons.collections4.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import org.apache.commons.collections4.iterators.IteratorChain;
import org.apache.commons.collections4.set.CompositeSet.SetMutator;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class CompositeSetDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompositeSet#CompositeSet()}
   *   <li>{@link CompositeSet#setMutator(SetMutator)}
   *   <li>{@link CompositeSet#getMutator()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.<init>()", "SetMutator CompositeSet.getMutator()",
      "void CompositeSet.setMutator(SetMutator)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>();
    actualObjectSet.setMutator(null);

    // Assert
    assertNull(actualObjectSet.getMutator());
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set[])}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then throw {@link UnsupportedOperationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#CompositeSet(Set[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.<init>(Set[])"})
  public void testNewCompositeSet_given42_thenThrowUnsupportedOperationException() {
    // Arrange
    HashSet<Object> objectSet = new HashSet<>();
    objectSet.add("42");

    HashSet<Object> objectSet2 = new HashSet<>();
    objectSet2.add("42");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> new CompositeSet<>(objectSet, objectSet2));
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#CompositeSet(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.<init>(Set)"})
  public void testNewCompositeSet_given42_whenHashSetAdd42_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act and Assert
    assertEquals(set, new CompositeSet<>(set));
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set[])}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#CompositeSet(Set[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.<init>(Set[])"})
  public void testNewCompositeSet_given42_whenHashSetAdd42_thenReturnSizeIsOne() {
    // Arrange
    HashSet<Object> objectSet = new HashSet<>();
    objectSet.add("42");

    // Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>(objectSet, new HashSet<>());

    // Assert
    assertEquals(1, actualObjectSet.size());
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#CompositeSet(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.<init>(Set)"})
  public void testNewCompositeSet_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act and Assert
    assertEquals(set, new CompositeSet<>(set));
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set[])}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()} and {@link HashSet#HashSet()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#CompositeSet(Set[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.<init>(Set[])"})
  public void testNewCompositeSet_whenHashSetAndHashSet_thenReturnEmpty() {
    // Arrange
    HashSet<Object> objectSet = new HashSet<>();

    // Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>(objectSet, new HashSet<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set[])}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#CompositeSet(Set[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.<init>(Set[])"})
  public void testNewCompositeSet_whenHashSet_thenReturnEmpty() {
    // Arrange and Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>(new HashSet<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#CompositeSet(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.<init>(Set)"})
  public void testNewCompositeSet_whenHashSet_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    // Act and Assert
    assertEquals(set, new CompositeSet<>(set));
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#CompositeSet(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.<init>(Set)"})
  public void testNewCompositeSet_whenNull_thenReturnEmpty() {
    // Arrange and Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>((Set<Object>) null);

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set[])}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#CompositeSet(Set[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.<init>(Set[])"})
  public void testNewCompositeSet_whenNull_thenReturnEmpty2() {
    // Arrange and Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>((Set<Object>[]) null);

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#add(Object)}.
   * <p>
   * Method under test: {@link CompositeSet#add(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.add(Object)"})
  public void testAdd() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectSet.add("Obj"));
  }

  /**
   * Test {@link CompositeSet#addAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.addAll(Collection)"})
  public void testAddAll_given42_whenArrayListAdd42() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectSet.addAll(coll));
  }

  /**
   * Test {@link CompositeSet#addAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.addAll(Collection)"})
  public void testAddAll_given42_whenArrayListAdd422() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectSet.addAll(coll));
  }

  /**
   * Test {@link CompositeSet#addAll(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.addAll(Collection)"})
  public void testAddAll_whenArrayList() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectSet.addAll(new ArrayList<>()));
  }

  /**
   * Test {@link CompositeSet#addComposited(Set, Set)} with {@code set1}, {@code set2}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then throw {@link UnsupportedOperationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addComposited(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.addComposited(Set, Set)"})
  public void testAddCompositedWithSet1Set2_given42_thenThrowUnsupportedOperationException() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    HashSet<Object> set1 = new HashSet<>();
    set1.add("42");

    HashSet<Object> set2 = new HashSet<>();
    set2.add("42");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectSet.addComposited(set1, set2));
  }

  /**
   * Test {@link CompositeSet#addComposited(Set, Set)} with {@code set1}, {@code set2}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then {@link CompositeSet#CompositeSet()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addComposited(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.addComposited(Set, Set)"})
  public void testAddCompositedWithSet1Set2_given42_whenHashSetAdd42_thenCompositeSetSizeIsOne() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    HashSet<Object> set1 = new HashSet<>();
    set1.add("42");

    // Act
    objectSet.addComposited(set1, new HashSet<>());

    // Assert
    assertEquals(1, objectSet.size());
    assertEquals(objectSet, set1);
  }

  /**
   * Test {@link CompositeSet#addComposited(Set, Set)} with {@code set1}, {@code set2}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then {@link CompositeSet#CompositeSet()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addComposited(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.addComposited(Set, Set)"})
  public void testAddCompositedWithSet1Set2_given42_whenHashSet_thenCompositeSetSizeIsOne() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    HashSet<Object> set1 = new HashSet<>();

    HashSet<Object> set2 = new HashSet<>();
    set2.add("42");

    // Act
    objectSet.addComposited(set1, set2);

    // Assert
    assertEquals(1, objectSet.size());
    assertTrue(set1.isEmpty());
  }

  /**
   * Test {@link CompositeSet#addComposited(Set, Set)} with {@code set1}, {@code set2}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>Then {@link CompositeSet#CompositeSet()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addComposited(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.addComposited(Set, Set)"})
  public void testAddCompositedWithSet1Set2_givenTwo_thenCompositeSetSizeIsTwo() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    HashSet<Object> set1 = new HashSet<>();
    set1.add(2);
    set1.add("42");

    // Act
    objectSet.addComposited(set1, new HashSet<>());

    // Assert
    assertEquals(2, objectSet.size());
    assertEquals(objectSet, set1);
  }

  /**
   * Test {@link CompositeSet#addComposited(Set, Set)} with {@code set1}, {@code set2}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>Then {@link CompositeSet#CompositeSet()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addComposited(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.addComposited(Set, Set)"})
  public void testAddCompositedWithSet1Set2_givenTwo_thenCompositeSetSizeIsTwo2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    HashSet<Object> set1 = new HashSet<>();

    HashSet<Object> set2 = new HashSet<>();
    set2.add(2);
    set2.add("42");

    // Act
    objectSet.addComposited(set1, set2);

    // Assert
    assertEquals(2, objectSet.size());
    assertTrue(set1.isEmpty());
  }

  /**
   * Test {@link CompositeSet#addComposited(Set, Set)} with {@code set1}, {@code set2}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then {@link CompositeSet#CompositeSet()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addComposited(Set, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.addComposited(Set, Set)"})
  public void testAddCompositedWithSet1Set2_whenHashSet_thenCompositeSetEmpty() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    HashSet<Object> set1 = new HashSet<>();

    // Act
    objectSet.addComposited(set1, new HashSet<>());

    // Assert that nothing has changed
    assertTrue(objectSet.isEmpty());
    assertEquals(objectSet, set1);
  }

  /**
   * Test {@link CompositeSet#addComposited(Set)} with {@code set}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then {@link CompositeSet#CompositeSet()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addComposited(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.addComposited(Set)"})
  public void testAddCompositedWithSet_given42_whenHashSetAdd42_thenCompositeSetSizeIsOne() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    objectSet.addComposited(set);

    // Assert
    assertEquals(1, objectSet.size());
    assertEquals(objectSet, set);
  }

  /**
   * Test {@link CompositeSet#addComposited(Set)} with {@code set}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   *   <li>Then {@link CompositeSet#CompositeSet()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addComposited(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.addComposited(Set)"})
  public void testAddCompositedWithSet_givenTwo_whenHashSetAddTwo_thenCompositeSetSizeIsTwo() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    objectSet.addComposited(set);

    // Assert
    assertEquals(2, objectSet.size());
    assertEquals(objectSet, set);
  }

  /**
   * Test {@link CompositeSet#addComposited(Set)} with {@code set}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then {@link CompositeSet#CompositeSet()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addComposited(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.addComposited(Set)"})
  public void testAddCompositedWithSet_whenHashSet_thenCompositeSetEmpty() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    HashSet<Object> set = new HashSet<>();

    // Act
    objectSet.addComposited(set);

    // Assert that nothing has changed
    assertTrue(objectSet.isEmpty());
    assertEquals(objectSet, set);
  }

  /**
   * Test {@link CompositeSet#addComposited(Set[])} with {@code sets}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then throw {@link UnsupportedOperationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addComposited(Set[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.addComposited(Set[])"})
  public void testAddCompositedWithSets_given42_thenThrowUnsupportedOperationException() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    HashSet<Object> objectSet2 = new HashSet<>();
    objectSet2.add("42");

    HashSet<Object> objectSet3 = new HashSet<>();
    objectSet3.add("42");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectSet.addComposited(objectSet2, objectSet3));
  }

  /**
   * Test {@link CompositeSet#addComposited(Set[])} with {@code sets}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then {@link CompositeSet#CompositeSet()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addComposited(Set[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.addComposited(Set[])"})
  public void testAddCompositedWithSets_given42_whenHashSetAdd42_thenCompositeSetSizeIsOne() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    HashSet<Object> objectSet2 = new HashSet<>();
    objectSet2.add("42");
    Set<Object>[] sets = new Set[]{objectSet2, new HashSet<>()};

    // Act
    objectSet.addComposited(sets);

    // Assert
    assertEquals(1, objectSet.size());
    assertEquals(2, sets.length);
    assertSame(objectSet2, sets[0]);
  }

  /**
   * Test {@link CompositeSet#addComposited(Set[])} with {@code sets}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()} and {@link HashSet#HashSet()}.</li>
   *   <li>Then array length is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addComposited(Set[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.addComposited(Set[])"})
  public void testAddCompositedWithSets_whenHashSetAndHashSet_thenArrayLengthIsTwo() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    HashSet<Object> objectSet2 = new HashSet<>();
    Set<Object>[] sets = new Set[]{objectSet2, new HashSet<>()};

    // Act
    objectSet.addComposited(sets);

    // Assert that nothing has changed
    assertEquals(2, sets.length);
    assertTrue((sets[0]).isEmpty());
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#addComposited(Set[])} with {@code sets}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then array length is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addComposited(Set[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.addComposited(Set[])"})
  public void testAddCompositedWithSets_whenHashSet_thenArrayLengthIsOne() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    Set<Object>[] sets = new Set[]{new HashSet<>()};

    // Act
    objectSet.addComposited(sets);

    // Assert that nothing has changed
    assertEquals(1, sets.length);
    assertTrue((sets[0]).isEmpty());
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#addComposited(Set[])} with {@code sets}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@link CompositeSet#CompositeSet()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addComposited(Set[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeSet.addComposited(Set[])"})
  public void testAddCompositedWithSets_whenNull_thenCompositeSetEmpty() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act
    objectSet.addComposited((Set<Object>[]) null);

    // Assert that nothing has changed
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#contains(Object)}.
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()} addComposited {@link HashSet#HashSet()}.</li>
   *   <li>When {@code Obj}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.contains(Object)"})
  public void testContains_givenCompositeSetAddCompositedHashSet_whenObj_thenReturnFalse() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertFalse(objectSet.contains("Obj"));
  }

  /**
   * Test {@link CompositeSet#contains(Object)}.
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.</li>
   *   <li>When {@code Obj}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.contains(Object)"})
  public void testContains_givenCompositeSet_whenObj_thenReturnFalse() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertFalse(objectSet.contains("Obj"));
  }

  /**
   * Test {@link CompositeSet#contains(Object)}.
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.contains(Object)"})
  public void testContains_givenHashSetAdd42_when42_thenReturnTrue() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);

    // Act and Assert
    assertTrue(objectSet.contains("42"));
  }

  /**
   * Test {@link CompositeSet#contains(Object)}.
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add zero.</li>
   *   <li>When {@link CompositeSet#CompositeSet()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.contains(Object)"})
  public void testContains_givenHashSetAddZero_whenCompositeSet_thenReturnFalse() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(0);

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);

    // Act and Assert
    assertFalse(objectSet.contains(new CompositeSet<>()));
  }

  /**
   * Test {@link CompositeSet#contains(Object)}.
   * <ul>
   *   <li>When {@link CompositeSet#CompositeSet()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.contains(Object)"})
  public void testContains_whenCompositeSet_thenReturnFalse() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertFalse(objectSet.contains(new CompositeSet<>()));
  }

  /**
   * Test {@link CompositeSet#containsAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#containsAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.containsAll(Collection)"})
  public void testContainsAll_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.containsAll(coll));
  }

  /**
   * Test {@link CompositeSet#containsAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#containsAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.containsAll(Collection)"})
  public void testContainsAll_given42_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.containsAll(coll));
  }

  /**
   * Test {@link CompositeSet#containsAll(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#containsAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.containsAll(Collection)"})
  public void testContainsAll_whenArrayList_thenReturnTrue() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertTrue(objectSet.containsAll(new ArrayList<>()));
  }

  /**
   * Test {@link CompositeSet#equals(Object)}, and {@link CompositeSet#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompositeSet#equals(Object)}
   *   <li>{@link CompositeSet#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.equals(Object)", "int CompositeSet.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    CompositeSet<Object> objectSet2 = new CompositeSet<>();

    // Act and Assert
    assertEquals(objectSet, objectSet2);
    int expectedHashCodeResult = objectSet.hashCode();
    assertEquals(expectedHashCodeResult, objectSet2.hashCode());
  }

  /**
   * Test {@link CompositeSet#equals(Object)}, and {@link CompositeSet#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompositeSet#equals(Object)}
   *   <li>{@link CompositeSet#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.equals(Object)", "int CompositeSet.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());
    CompositeSet<Object> objectSet2 = new CompositeSet<>();

    // Act and Assert
    assertEquals(objectSet, objectSet2);
    int expectedHashCodeResult = objectSet.hashCode();
    assertEquals(expectedHashCodeResult, objectSet2.hashCode());
  }

  /**
   * Test {@link CompositeSet#equals(Object)}, and {@link CompositeSet#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompositeSet#equals(Object)}
   *   <li>{@link CompositeSet#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.equals(Object)", "int CompositeSet.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());
    objectSet.addComposited(new HashSet<>());
    CompositeSet<Object> objectSet2 = new CompositeSet<>();

    // Act and Assert
    assertEquals(objectSet, objectSet2);
    int expectedHashCodeResult = objectSet.hashCode();
    assertEquals(expectedHashCodeResult, objectSet2.hashCode());
  }

  /**
   * Test {@link CompositeSet#equals(Object)}, and {@link CompositeSet#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompositeSet#equals(Object)}
   *   <li>{@link CompositeSet#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.equals(Object)", "int CompositeSet.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertEquals(objectSet, objectSet);
    int expectedHashCodeResult = objectSet.hashCode();
    assertEquals(expectedHashCodeResult, objectSet.hashCode());
  }

  /**
   * Test {@link CompositeSet#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.equals(Object)", "int CompositeSet.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);

    // Act and Assert
    assertNotEquals(objectSet, new CompositeSet<>());
  }

  /**
   * Test {@link CompositeSet#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.equals(Object)", "int CompositeSet.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertNotEquals(objectSet, null);
  }

  /**
   * Test {@link CompositeSet#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.equals(Object)", "int CompositeSet.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertNotEquals(objectSet, "Different type to CompositeSet");
  }

  /**
   * Test {@link CompositeSet#getSets()}.
   * <p>
   * Method under test: {@link CompositeSet#getSets()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.List CompositeSet.getSets()"})
  public void testGetSets() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertTrue(objectSet.getSets().isEmpty());
  }

  /**
   * Test {@link CompositeSet#isEmpty()}.
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()} addComposited {@link HashSet#HashSet()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.isEmpty()"})
  public void testIsEmpty_givenCompositeSetAddCompositedHashSet_thenReturnTrue() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#isEmpty()}.
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.isEmpty()"})
  public void testIsEmpty_givenCompositeSet_thenReturnTrue() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#isEmpty()}.
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.isEmpty()"})
  public void testIsEmpty_givenHashSetAdd42_thenReturnFalse() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);

    // Act and Assert
    assertFalse(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#iterator()}.
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()} addComposited {@link HashSet#HashSet()}.</li>
   *   <li>Then return {@link IteratorChain}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#iterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator CompositeSet.iterator()"})
  public void testIterator_givenCompositeSetAddCompositedHashSet_thenReturnIteratorChain() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act
    Iterator<Object> actualIteratorResult = objectSet.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof IteratorChain);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link CompositeSet#iterator()}.
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()} addComposited {@link HashSet#HashSet()}.</li>
   *   <li>Then return {@link IteratorChain}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#iterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator CompositeSet.iterator()"})
  public void testIterator_givenCompositeSetAddCompositedHashSet_thenReturnIteratorChain2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());
    objectSet.addComposited(new HashSet<>());

    // Act
    Iterator<Object> actualIteratorResult = objectSet.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof IteratorChain);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link CompositeSet#remove(Object)}.
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()} addComposited {@link HashSet#HashSet()}.</li>
   *   <li>When {@code Obj}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.remove(Object)"})
  public void testRemove_givenCompositeSetAddCompositedHashSet_whenObj_thenReturnFalse() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertFalse(objectSet.remove("Obj"));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#remove(Object)}.
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.</li>
   *   <li>When {@code Obj}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.remove(Object)"})
  public void testRemove_givenCompositeSet_whenObj_thenReturnFalse() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertFalse(objectSet.remove("Obj"));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#remove(Object)}.
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.remove(Object)"})
  public void testRemove_givenHashSetAdd42_when42_thenReturnTrue() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);

    // Act
    boolean actualRemoveResult = objectSet.remove("42");

    // Assert
    assertTrue(objectSet.isEmpty());
    assertTrue(actualRemoveResult);
  }

  /**
   * Test {@link CompositeSet#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.removeAll(Collection)"})
  public void testRemoveAll_given42_whenArrayListAdd42() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.removeAll(coll));
  }

  /**
   * Test {@link CompositeSet#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.removeAll(Collection)"})
  public void testRemoveAll_given42_whenArrayListAdd422() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.removeAll(coll));
  }

  /**
   * Test {@link CompositeSet#removeAll(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.removeAll(Collection)"})
  public void testRemoveAll_whenArrayList() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertFalse(objectSet.removeAll(new ArrayList<>()));
  }

  /**
   * Test {@link CompositeSet#removeIf(Predicate)}.
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()} addComposited {@link HashSet#HashSet()}.</li>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#removeIf(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.removeIf(Predicate)"})
  public void testRemoveIf_givenCompositeSetAddCompositedHashSet_whenPredicate_thenReturnFalse() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertFalse(objectSet.removeIf(mock(Predicate.class)));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#removeIf(Predicate)}.
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#removeIf(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.removeIf(Predicate)"})
  public void testRemoveIf_givenCompositeSet_whenNull_thenReturnFalse() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertFalse(objectSet.removeIf(null));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#removeIf(Predicate)}.
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.</li>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#removeIf(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.removeIf(Predicate)"})
  public void testRemoveIf_givenCompositeSet_whenPredicate_thenReturnFalse() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertFalse(objectSet.removeIf(mock(Predicate.class)));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#removeIf(Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#removeIf(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.removeIf(Predicate)"})
  public void testRemoveIf_givenTrue_whenPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);
    Predicate<Object> filter = mock(Predicate.class);
    when(filter.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualRemoveIfResult = objectSet.removeIf(filter);

    // Assert
    verify(filter).test(isA(Object.class));
    assertTrue(objectSet.isEmpty());
    assertTrue(actualRemoveIfResult);
  }

  /**
   * Test {@link CompositeSet#retainAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#retainAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.retainAll(Collection)"})
  public void testRetainAll_given42_whenArrayListAdd42() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.retainAll(coll));
  }

  /**
   * Test {@link CompositeSet#retainAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#retainAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.retainAll(Collection)"})
  public void testRetainAll_given42_whenArrayListAdd422() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.retainAll(coll));
  }

  /**
   * Test {@link CompositeSet#retainAll(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#retainAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeSet.retainAll(Collection)"})
  public void testRetainAll_whenArrayList() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertFalse(objectSet.retainAll(new ArrayList<>()));
  }

  /**
   * Test {@link CompositeSet#size()}.
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#size()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CompositeSet.size()"})
  public void testSize_givenCompositeSet() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertEquals(0, objectSet.size());
  }

  /**
   * Test {@link CompositeSet#size()}.
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()} addComposited {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#size()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CompositeSet.size()"})
  public void testSize_givenCompositeSetAddCompositedHashSet() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertEquals(0, objectSet.size());
  }

  /**
   * Test {@link CompositeSet#toArray(Object[])} with {@code Object[]}.
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add two.</li>
   *   <li>Then return second element is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#toArray(Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object[] CompositeSet.toArray(Object[])"})
  public void testToArrayWithObject_givenHashSetAddTwo_thenReturnSecondElementIs42() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);

    // Act
    Object[] actualToArrayResult = objectSet.toArray(new Object[]{"Array"});

    // Assert
    assertEquals("42", actualToArrayResult[1]);
    assertEquals(2, ((Integer) actualToArrayResult[0]).intValue());
    assertEquals(2, actualToArrayResult.length);
  }

  /**
   * Test {@link CompositeSet#toArray(Object[])} with {@code Object[]}.
   * <ul>
   *   <li>When empty array of {@link Object}.</li>
   *   <li>Then return array length is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#toArray(Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object[] CompositeSet.toArray(Object[])"})
  public void testToArrayWithObject_whenEmptyArrayOfObject_thenReturnArrayLengthIsZero() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertEquals(0, objectSet.toArray(new Object[]{}).length);
  }

  /**
   * Test {@link CompositeSet#toSet()}.
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#toSet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set CompositeSet.toSet()"})
  public void testToSet_givenCompositeSet() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertTrue(objectSet.toSet().isEmpty());
  }

  /**
   * Test {@link CompositeSet#toSet()}.
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()} addComposited {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#toSet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set CompositeSet.toSet()"})
  public void testToSet_givenCompositeSetAddCompositedHashSet() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertTrue(objectSet.toSet().isEmpty());
  }

  /**
   * Test {@link CompositeSet#toSet()}.
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()} addComposited {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#toSet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set CompositeSet.toSet()"})
  public void testToSet_givenCompositeSetAddCompositedHashSet2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertTrue(objectSet.toSet().isEmpty());
  }
}
