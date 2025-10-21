package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UnmodifiableIteratorDiffblueTest {
  /**
   * Test {@link UnmodifiableIterator#unmodifiableIterator(Iterator)}.
   * <p>
   * Method under test: {@link UnmodifiableIterator#unmodifiableIterator(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator UnmodifiableIterator.unmodifiableIterator(Iterator)"})
  public void testUnmodifiableIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualUnmodifiableIteratorResult = UnmodifiableIterator
        .unmodifiableIterator(objectList.iterator());

    // Assert
    assertTrue(actualUnmodifiableIteratorResult instanceof UnmodifiableIterator);
    assertFalse(actualUnmodifiableIteratorResult.hasNext());
  }
}
