package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnmodifiableIteratorDiffblueTest {
  /**
   * Test {@link UnmodifiableIterator#unmodifiableIterator(Iterator)}.
   * <p>
   * Method under test: {@link UnmodifiableIterator#unmodifiableIterator(Iterator)}
   */
  @Test
  @DisplayName("Test unmodifiableIterator(Iterator)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Iterator UnmodifiableIterator.unmodifiableIterator(Iterator)"})
  void testUnmodifiableIterator() {
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
