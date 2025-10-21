package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.multiset.HashMultiSet;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class MultiSetUtilsDiffblueTest {
  /**
   * Test {@link MultiSetUtils#emptyMultiSet()}.
   * <p>
   * Method under test: {@link MultiSetUtils#emptyMultiSet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiSet MultiSetUtils.emptyMultiSet()"})
  public void testEmptyMultiSet() {
    // Arrange and Act
    MultiSet<Object> actualEmptyMultiSetResult = MultiSetUtils.emptyMultiSet();

    // Assert
    assertTrue(actualEmptyMultiSetResult.isEmpty());
  }

  /**
   * Test {@link MultiSetUtils#predicatedMultiSet(MultiSet, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiSetUtils#predicatedMultiSet(MultiSet, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiSet MultiSetUtils.predicatedMultiSet(MultiSet, Predicate)"})
  public void testPredicatedMultiSet_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    MultiSet<Object> actualPredicatedMultiSetResult = MultiSetUtils.predicatedMultiSet(multiset, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(multiset, actualPredicatedMultiSetResult);
  }

  /**
   * Test {@link MultiSetUtils#predicatedMultiSet(MultiSet, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiSetUtils#predicatedMultiSet(MultiSet, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiSet MultiSetUtils.predicatedMultiSet(MultiSet, Predicate)"})
  public void testPredicatedMultiSet_givenTrue_whenPredicateTestReturnTrue_thenCallsTest2() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");
    multiset.add("Object");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    MultiSet<Object> actualPredicatedMultiSetResult = MultiSetUtils.predicatedMultiSet(multiset, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(multiset, actualPredicatedMultiSetResult);
  }

  /**
   * Test {@link MultiSetUtils#predicatedMultiSet(MultiSet, Predicate)}.
   * <ul>
   *   <li>When {@link HashMultiSet#HashMultiSet()}.</li>
   *   <li>Then return {@link HashMultiSet#HashMultiSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiSetUtils#predicatedMultiSet(MultiSet, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiSet MultiSetUtils.predicatedMultiSet(MultiSet, Predicate)"})
  public void testPredicatedMultiSet_whenHashMultiSet_thenReturnHashMultiSet() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();

    // Act
    MultiSet<Object> actualPredicatedMultiSetResult = MultiSetUtils.predicatedMultiSet(multiset, mock(Predicate.class));

    // Assert
    assertEquals(multiset, actualPredicatedMultiSetResult);
  }

  /**
   * Test {@link MultiSetUtils#synchronizedMultiSet(MultiSet)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiSetUtils#synchronizedMultiSet(MultiSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiSet MultiSetUtils.synchronizedMultiSet(MultiSet)"})
  public void testSynchronizedMultiSet_givenObject_whenHashMultiSetAddObject() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");

    // Act
    MultiSet<Object> actualSynchronizedMultiSetResult = MultiSetUtils.synchronizedMultiSet(multiset);

    // Assert
    assertEquals(multiset, actualSynchronizedMultiSetResult);
  }

  /**
   * Test {@link MultiSetUtils#synchronizedMultiSet(MultiSet)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiSetUtils#synchronizedMultiSet(MultiSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiSet MultiSetUtils.synchronizedMultiSet(MultiSet)"})
  public void testSynchronizedMultiSet_givenObject_whenHashMultiSetAddObject2() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");
    multiset.add("Object");

    // Act
    MultiSet<Object> actualSynchronizedMultiSetResult = MultiSetUtils.synchronizedMultiSet(multiset);

    // Assert
    assertEquals(multiset, actualSynchronizedMultiSetResult);
  }

  /**
   * Test {@link MultiSetUtils#synchronizedMultiSet(MultiSet)}.
   * <ul>
   *   <li>When {@link HashMultiSet#HashMultiSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiSetUtils#synchronizedMultiSet(MultiSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiSet MultiSetUtils.synchronizedMultiSet(MultiSet)"})
  public void testSynchronizedMultiSet_whenHashMultiSet() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();

    // Act
    MultiSet<Object> actualSynchronizedMultiSetResult = MultiSetUtils.synchronizedMultiSet(multiset);

    // Assert
    assertEquals(multiset, actualSynchronizedMultiSetResult);
  }

  /**
   * Test {@link MultiSetUtils#unmodifiableMultiSet(MultiSet)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiSetUtils#unmodifiableMultiSet(MultiSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiSet MultiSetUtils.unmodifiableMultiSet(MultiSet)"})
  public void testUnmodifiableMultiSet_givenObject_whenHashMultiSetAddObject() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");

    // Act
    MultiSet<Object> actualUnmodifiableMultiSetResult = MultiSetUtils.unmodifiableMultiSet(multiset);

    // Assert
    assertEquals(multiset, actualUnmodifiableMultiSetResult);
  }

  /**
   * Test {@link MultiSetUtils#unmodifiableMultiSet(MultiSet)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiSetUtils#unmodifiableMultiSet(MultiSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiSet MultiSetUtils.unmodifiableMultiSet(MultiSet)"})
  public void testUnmodifiableMultiSet_givenObject_whenHashMultiSetAddObject2() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");
    multiset.add("Object");

    // Act
    MultiSet<Object> actualUnmodifiableMultiSetResult = MultiSetUtils.unmodifiableMultiSet(multiset);

    // Assert
    assertEquals(multiset, actualUnmodifiableMultiSetResult);
  }

  /**
   * Test {@link MultiSetUtils#unmodifiableMultiSet(MultiSet)}.
   * <ul>
   *   <li>When {@link HashMultiSet#HashMultiSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiSetUtils#unmodifiableMultiSet(MultiSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiSet MultiSetUtils.unmodifiableMultiSet(MultiSet)"})
  public void testUnmodifiableMultiSet_whenHashMultiSet() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();

    // Act
    MultiSet<Object> actualUnmodifiableMultiSetResult = MultiSetUtils.unmodifiableMultiSet(multiset);

    // Assert
    assertEquals(multiset, actualUnmodifiableMultiSetResult);
  }
}
