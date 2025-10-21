package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class TransformIteratorDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformIterator.<init>()", "void TransformIterator.<init>(Iterator)",
      "void TransformIterator.<init>(Iterator, Transformer)", "Iterator TransformIterator.getIterator()",
      "Transformer TransformIterator.getTransformer()", "void TransformIterator.setIterator(Iterator)",
      "void TransformIterator.setTransformer(Transformer)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    TransformIterator<Object, Object> actualTransformIterator = new TransformIterator<>();
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();
    actualTransformIterator.setIterator(iterator);
    Transformer<Object, Object> transformer = mock(Transformer.class);
    actualTransformIterator.setTransformer(transformer);
    Iterator<?> actualIterator = actualTransformIterator.getIterator();
    Transformer<? super Object, ?> actualTransformer = actualTransformIterator.getTransformer();

    // Assert
    assertFalse(actualIterator.hasNext());
    assertSame(iterator, actualIterator);
    assertSame(transformer, actualTransformer);
  }

  /**
   * Test getters and setters.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformIterator.<init>()", "void TransformIterator.<init>(Iterator)",
      "void TransformIterator.<init>(Iterator, Transformer)", "Iterator TransformIterator.getIterator()",
      "Transformer TransformIterator.getTransformer()", "void TransformIterator.setIterator(Iterator)",
      "void TransformIterator.setTransformer(Transformer)"})
  public void testGettersAndSetters_whenArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    TransformIterator<Object, Object> actualTransformIterator = new TransformIterator<>(objectList.iterator());
    ArrayList<Object> objectList2 = new ArrayList<>();
    Iterator<Object> iterator = objectList2.iterator();
    actualTransformIterator.setIterator(iterator);
    Transformer<Object, Object> transformer = mock(Transformer.class);
    actualTransformIterator.setTransformer(transformer);
    Iterator<?> actualIterator = actualTransformIterator.getIterator();
    Transformer<? super Object, ?> actualTransformer = actualTransformIterator.getTransformer();

    // Assert
    assertFalse(actualIterator.hasNext());
    assertSame(iterator, actualIterator);
    assertSame(transformer, actualTransformer);
  }

  /**
   * Test getters and setters.
   * <ul>
   *   <li>When {@link Transformer}.</li>
   * </ul>
   * <p>
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformIterator.<init>()", "void TransformIterator.<init>(Iterator)",
      "void TransformIterator.<init>(Iterator, Transformer)", "Iterator TransformIterator.getIterator()",
      "Transformer TransformIterator.getTransformer()", "void TransformIterator.setIterator(Iterator)",
      "void TransformIterator.setTransformer(Transformer)"})
  public void testGettersAndSetters_whenTransformer() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    TransformIterator<Object, Object> actualTransformIterator = new TransformIterator<>(objectList.iterator(),
        mock(Transformer.class));
    ArrayList<Object> objectList2 = new ArrayList<>();
    Iterator<Object> iterator = objectList2.iterator();
    actualTransformIterator.setIterator(iterator);
    Transformer<Object, Object> transformer = mock(Transformer.class);
    actualTransformIterator.setTransformer(transformer);
    Iterator<?> actualIterator = actualTransformIterator.getIterator();
    Transformer<? super Object, ?> actualTransformer = actualTransformIterator.getTransformer();

    // Assert
    assertFalse(actualIterator.hasNext());
    assertSame(iterator, actualIterator);
    assertSame(transformer, actualTransformer);
  }

  /**
   * Test {@link TransformIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TransformIterator.hasNext()"})
  public void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    TransformIterator<Object, Object> transformIterator = new TransformIterator<>();
    transformIterator.setIterator(iterator);

    // Act and Assert
    assertTrue(transformIterator.hasNext());
  }

  /**
   * Test {@link TransformIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link TransformIterator#TransformIterator()} Iterator is {@link ArrayList#ArrayList()} iterator.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TransformIterator.hasNext()"})
  public void testHasNext_givenTransformIteratorIteratorIsArrayListIterator_thenReturnFalse() {
    // Arrange
    TransformIterator<Object, Object> transformIterator = new TransformIterator<>();

    ArrayList<Object> objectList = new ArrayList<>();
    transformIterator.setIterator(objectList.iterator());

    // Act and Assert
    assertFalse(transformIterator.hasNext());
  }

  /**
   * Test {@link TransformIterator#next()}.
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@code Apply}.</li>
   *   <li>Then return {@code Apply}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TransformIterator.next()"})
  public void testNext_givenTransformerApplyReturnApply_thenReturnApply() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    ArrayList<Object> objectList2 = new ArrayList<>();

    TransformIterator<Object, Object> transformIterator = new TransformIterator<>(objectList2.iterator(), transformer);
    transformIterator.setIterator(iterator);

    // Act
    Object actualNextResult = transformIterator.next();

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals("Apply", actualNextResult);
    assertFalse(transformIterator.hasNext());
  }

  /**
   * Test {@link TransformIterator#transform(Object)}.
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@code Apply}.</li>
   *   <li>Then return {@code Apply}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformIterator#transform(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TransformIterator.transform(Object)"})
  public void testTransform_givenTransformerApplyReturnApply_thenReturnApply() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    ArrayList<Object> objectList = new ArrayList<>();
    TransformIterator<Object, Object> transformIterator = new TransformIterator<>(objectList.iterator(), transformer);

    // Act
    Object actualTransformResult = transformIterator.transform("Source");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals("Apply", actualTransformResult);
  }
}
