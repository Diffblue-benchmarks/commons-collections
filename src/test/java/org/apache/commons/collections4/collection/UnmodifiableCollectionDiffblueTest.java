package org.apache.commons.collections4.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UnmodifiableCollectionDiffblueTest {
  /**
   * Test {@link UnmodifiableCollection#unmodifiableCollection(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableCollection#unmodifiableCollection(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection UnmodifiableCollection.unmodifiableCollection(Collection)"})
  public void testUnmodifiableCollection_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    Collection<Object> actualUnmodifiableCollectionResult = UnmodifiableCollection.unmodifiableCollection(coll);

    // Assert
    assertEquals(1, actualUnmodifiableCollectionResult.size());
  }

  /**
   * Test {@link UnmodifiableCollection#unmodifiableCollection(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableCollection#unmodifiableCollection(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection UnmodifiableCollection.unmodifiableCollection(Collection)"})
  public void testUnmodifiableCollection_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    Collection<Object> actualUnmodifiableCollectionResult = UnmodifiableCollection.unmodifiableCollection(coll);

    // Assert
    assertEquals(2, actualUnmodifiableCollectionResult.size());
  }

  /**
   * Test {@link UnmodifiableCollection#unmodifiableCollection(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableCollection#unmodifiableCollection(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection UnmodifiableCollection.unmodifiableCollection(Collection)"})
  public void testUnmodifiableCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    Collection<Object> actualUnmodifiableCollectionResult = UnmodifiableCollection
        .unmodifiableCollection(new ArrayList<>());

    // Assert
    assertTrue(actualUnmodifiableCollectionResult.isEmpty());
  }
}
