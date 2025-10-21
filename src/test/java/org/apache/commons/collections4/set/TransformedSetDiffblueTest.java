package org.apache.commons.collections4.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class TransformedSetDiffblueTest {
  /**
   * Test {@link TransformedSet#transformedSet(Set, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedSet#transformedSet(Set, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set TransformedSet.transformedSet(Set, Transformer)"})
  public void testTransformedSet_given42_whenHashSetAdd42_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Set<Object> actualTransformedSetResult = TransformedSet.transformedSet(set, transformer);

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals(set, actualTransformedSetResult);
  }

  /**
   * Test {@link TransformedSet#transformedSet(Set, Transformer)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedSet#transformedSet(Set, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set TransformedSet.transformedSet(Set, Transformer)"})
  public void testTransformedSet_whenHashSet_thenReturnEmpty() {
    // Arrange and Act
    Set<Object> actualTransformedSetResult = TransformedSet.transformedSet(new HashSet<>(), mock(Transformer.class));

    // Assert
    assertTrue(actualTransformedSetResult.isEmpty());
  }

  /**
   * Test {@link TransformedSet#transformingSet(Set, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedSet#transformingSet(Set, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TransformedSet TransformedSet.transformingSet(Set, Transformer)"})
  public void testTransformingSet_given42_whenHashSetAdd42_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    TransformedSet<Object> actualTransformingSetResult = TransformedSet.transformingSet(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformingSetResult);
  }

  /**
   * Test {@link TransformedSet#transformingSet(Set, Transformer)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedSet#transformingSet(Set, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TransformedSet TransformedSet.transformingSet(Set, Transformer)"})
  public void testTransformingSet_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    TransformedSet<Object> actualTransformingSetResult = TransformedSet.transformingSet(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformingSetResult);
  }

  /**
   * Test {@link TransformedSet#transformingSet(Set, Transformer)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedSet#transformingSet(Set, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TransformedSet TransformedSet.transformingSet(Set, Transformer)"})
  public void testTransformingSet_whenHashSet_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    // Act
    TransformedSet<Object> actualTransformingSetResult = TransformedSet.transformingSet(set, mock(Transformer.class));

    // Assert
    assertEquals(set, actualTransformingSetResult);
  }

  /**
   * Test {@link TransformedSet#TransformedSet(Set, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedSet#TransformedSet(Set, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformedSet.<init>(Set, Transformer)"})
  public void testNewTransformedSet_given42_whenHashSetAdd42_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act and Assert
    assertEquals(set, new TransformedSet<>(set, mock(Transformer.class)));
  }

  /**
   * Test {@link TransformedSet#TransformedSet(Set, Transformer)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedSet#TransformedSet(Set, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformedSet.<init>(Set, Transformer)"})
  public void testNewTransformedSet_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act and Assert
    assertEquals(set, new TransformedSet<>(set, mock(Transformer.class)));
  }

  /**
   * Test {@link TransformedSet#TransformedSet(Set, Transformer)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedSet#TransformedSet(Set, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformedSet.<init>(Set, Transformer)"})
  public void testNewTransformedSet_whenHashSet_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    // Act and Assert
    assertEquals(set, new TransformedSet<>(set, mock(Transformer.class)));
  }
}
