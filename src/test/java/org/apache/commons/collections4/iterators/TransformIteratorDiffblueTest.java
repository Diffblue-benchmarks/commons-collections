package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.ChainedTransformer;
import org.apache.commons.collections4.functors.ClosureTransformer;
import org.junit.Test;

public class TransformIteratorDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link TransformIterator#TransformIterator()}
   *   <li>{@link TransformIterator#setIterator(Iterator)}
   *   <li>{@link TransformIterator#setTransformer(Transformer)}
   *   <li>{@link TransformIterator#getIterator()}
   *   <li>{@link TransformIterator#getTransformer()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    TransformIterator<Object, Object> actualTransformIterator = new TransformIterator<>();
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();
    actualTransformIterator.setIterator(iterator);
    ChainedTransformer<? super Object> transformer = new ChainedTransformer<>(new ClosureTransformer<>(null));
    actualTransformIterator.setTransformer(transformer);
    Iterator<?> actualIterator = actualTransformIterator.getIterator();
    Transformer<? super Object, ?> actualTransformer = actualTransformIterator.getTransformer();

    // Assert that nothing has changed
    assertFalse(actualIterator.hasNext());
    assertSame(transformer, actualTransformer);
    assertSame(iterator, actualIterator);
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link TransformIterator#TransformIterator(Iterator)}
   *   <li>{@link TransformIterator#setIterator(Iterator)}
   *   <li>{@link TransformIterator#setTransformer(Transformer)}
   *   <li>{@link TransformIterator#getIterator()}
   *   <li>{@link TransformIterator#getTransformer()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    TransformIterator<Object, Object> actualTransformIterator = new TransformIterator<>(objectList.iterator());
    ArrayList<Object> objectList2 = new ArrayList<>();
    Iterator<Object> iterator = objectList2.iterator();
    actualTransformIterator.setIterator(iterator);
    ChainedTransformer<? super Object> transformer = new ChainedTransformer<>(new ClosureTransformer<>(null));
    actualTransformIterator.setTransformer(transformer);
    Iterator<?> actualIterator = actualTransformIterator.getIterator();
    Transformer<? super Object, ?> actualTransformer = actualTransformIterator.getTransformer();

    // Assert that nothing has changed
    assertFalse(actualIterator.hasNext());
    assertSame(transformer, actualTransformer);
    assertSame(iterator, actualIterator);
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link TransformIterator#TransformIterator(Iterator, Transformer)}
   *   <li>{@link TransformIterator#setIterator(Iterator)}
   *   <li>{@link TransformIterator#setTransformer(Transformer)}
   *   <li>{@link TransformIterator#getIterator()}
   *   <li>{@link TransformIterator#getTransformer()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    TransformIterator<Object, Object> actualTransformIterator = new TransformIterator<>(iterator,
        new ChainedTransformer<>(new ClosureTransformer<>(null)));
    ArrayList<Object> objectList2 = new ArrayList<>();
    Iterator<Object> iterator2 = objectList2.iterator();
    actualTransformIterator.setIterator(iterator2);
    ChainedTransformer<? super Object> transformer = new ChainedTransformer<>(new ClosureTransformer<>(null));
    actualTransformIterator.setTransformer(transformer);
    Iterator<?> actualIterator = actualTransformIterator.getIterator();
    Transformer<? super Object, ?> actualTransformer = actualTransformIterator.getTransformer();

    // Assert that nothing has changed
    assertFalse(actualIterator.hasNext());
    assertSame(transformer, actualTransformer);
    assertSame(iterator2, actualIterator);
  }
}
