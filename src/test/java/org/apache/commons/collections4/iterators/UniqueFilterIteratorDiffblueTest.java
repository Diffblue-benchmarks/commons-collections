package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UniqueFilterIteratorDiffblueTest {
  /**
   * Test {@link UniqueFilterIterator#UniqueFilterIterator(Iterator)}.
   * <p>
   * Method under test: {@link UniqueFilterIterator#UniqueFilterIterator(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void UniqueFilterIterator.<init>(Iterator)"})
  public void testNewUniqueFilterIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    UniqueFilterIterator<Object> actualUniqueFilterIterator = new UniqueFilterIterator<>(objectList.iterator());

    // Assert
    assertFalse(actualUniqueFilterIterator.hasNext());
  }
}
