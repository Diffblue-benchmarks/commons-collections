package org.apache.commons.collections4.bag;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.AbstractMapBag.BagIterator;
import org.apache.commons.collections4.bag.AbstractMapBag.MutableInteger;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AbstractMapBagDiffblueTest {
  /**
   * Test {@link AbstractMapBag#add(Object, int)} with {@code object}, {@code nCopies}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>When two.</li>
   *   <li>Then {@link HashBag#HashBag()} size is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#add(Object, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.add(Object, int)"})
  public void testAddWithObjectNCopies_givenHashBagAddObject_whenTwo_thenHashBagSizeIsThree() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act
    boolean actualAddResult = hashBag.add("Object", 2);

    // Assert
    assertEquals(3, hashBag.size());
    assertFalse(actualAddResult);
  }

  /**
   * Test {@link AbstractMapBag#add(Object, int)} with {@code object}, {@code nCopies}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When two.</li>
   *   <li>Then {@link HashBag#HashBag()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#add(Object, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.add(Object, int)"})
  public void testAddWithObjectNCopies_givenHashBag_whenTwo_thenHashBagSizeIsTwo() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act
    boolean actualAddResult = hashBag.add("Object", 2);

    // Assert
    assertEquals(2, hashBag.size());
    assertTrue(actualAddResult);
  }

  /**
   * Test {@link AbstractMapBag#add(Object, int)} with {@code object}, {@code nCopies}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When zero.</li>
   *   <li>Then {@link HashBag#HashBag()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#add(Object, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.add(Object, int)"})
  public void testAddWithObjectNCopies_givenHashBag_whenZero_thenHashBagEmpty() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.add("Object", 0));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#add(Object)} with {@code object}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then {@link HashBag#HashBag()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#add(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.add(Object)"})
  public void testAddWithObject_givenHashBagAddObject_thenHashBagSizeIsTwo() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act
    boolean actualAddResult = hashBag.add("Object");

    // Assert
    assertEquals(2, hashBag.size());
    assertFalse(actualAddResult);
  }

  /**
   * Test {@link AbstractMapBag#add(Object)} with {@code object}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>Then {@link HashBag#HashBag()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#add(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.add(Object)"})
  public void testAddWithObject_givenHashBag_thenHashBagSizeIsOne() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act
    boolean actualAddResult = hashBag.add("Object");

    // Assert
    assertEquals(1, hashBag.size());
    assertTrue(actualAddResult);
  }

  /**
   * Test {@link AbstractMapBag#addAll(Collection)}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link HashBag#HashBag()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.addAll(Collection)"})
  public void testAddAll_givenHashBagAdd42_whenArrayListAdd42_thenHashBagSizeIsTwo() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualAddAllResult = hashBag.addAll(coll);

    // Assert
    assertEquals(2, hashBag.size());
    assertFalse(actualAddAllResult);
  }

  /**
   * Test {@link AbstractMapBag#addAll(Collection)}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link HashBag#HashBag()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.addAll(Collection)"})
  public void testAddAll_givenHashBag_whenArrayListAdd42_thenHashBagSizeIsOne() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualAddAllResult = hashBag.addAll(coll);

    // Assert
    assertEquals(1, hashBag.size());
    assertTrue(actualAddAllResult);
  }

  /**
   * Test {@link AbstractMapBag#addAll(Collection)}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link HashBag#HashBag()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.addAll(Collection)"})
  public void testAddAll_givenHashBag_whenArrayListAdd42_thenHashBagSizeIsTwo() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualAddAllResult = hashBag.addAll(coll);

    // Assert
    assertEquals(2, hashBag.size());
    assertTrue(actualAddAllResult);
  }

  /**
   * Test {@link AbstractMapBag#addAll(Collection)}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then {@link HashBag#HashBag()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.addAll(Collection)"})
  public void testAddAll_givenHashBag_whenArrayList_thenHashBagEmpty() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.addAll(new ArrayList<>()));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test BagIterator {@link BagIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BagIterator.hasNext()"})
  public void testBagIteratorHasNext_givenHashBagAddObject_thenReturnTrue() {
    // Arrange
    HashBag<Object> parent = new HashBag<>();
    parent.add("Object");
    BagIterator<Object> bagIterator = new BagIterator<>(parent);

    // Act and Assert
    assertTrue(bagIterator.hasNext());
  }

  /**
   * Test BagIterator {@link BagIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BagIterator.hasNext()"})
  public void testBagIteratorHasNext_thenReturnFalse() {
    // Arrange
    BagIterator<Object> bagIterator = new BagIterator<>(new HashBag<>());

    // Act and Assert
    assertFalse(bagIterator.hasNext());
  }

  /**
   * Test BagIterator {@link BagIterator#BagIterator(AbstractMapBag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>Then return next is {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagIterator#BagIterator(AbstractMapBag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void BagIterator.<init>(AbstractMapBag)"})
  public void testBagIteratorNewBagIterator_givenObject_thenReturnNextIsObject() {
    // Arrange
    HashBag<Object> parent = new HashBag<>();
    parent.add("Object");

    // Act
    BagIterator<Object> actualBagIterator = new BagIterator<>(parent);

    // Assert
    assertEquals("Object", actualBagIterator.next());
    assertFalse(actualBagIterator.hasNext());
  }

  /**
   * Test BagIterator {@link BagIterator#BagIterator(AbstractMapBag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>Then return next is {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagIterator#BagIterator(AbstractMapBag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void BagIterator.<init>(AbstractMapBag)"})
  public void testBagIteratorNewBagIterator_givenObject_thenReturnNextIsObject2() {
    // Arrange
    HashBag<Object> parent = new HashBag<>();
    parent.add("Object");
    parent.add("Object");

    // Act
    BagIterator<Object> actualBagIterator = new BagIterator<>(parent);

    // Assert
    assertEquals("Object", actualBagIterator.next());
    assertEquals("Object", actualBagIterator.next());
    assertFalse(actualBagIterator.hasNext());
  }

  /**
   * Test BagIterator {@link BagIterator#BagIterator(AbstractMapBag)}.
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagIterator#BagIterator(AbstractMapBag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void BagIterator.<init>(AbstractMapBag)"})
  public void testBagIteratorNewBagIterator_whenHashBag() {
    // Arrange and Act
    BagIterator<Object> actualBagIterator = new BagIterator<>(new HashBag<>());

    // Assert
    assertFalse(actualBagIterator.hasNext());
  }

  /**
   * Test BagIterator {@link BagIterator#next()}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then return {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object BagIterator.next()"})
  public void testBagIteratorNext_givenHashBagAddObject_thenReturnObject() {
    // Arrange
    HashBag<Object> parent = new HashBag<>();
    parent.add("Object");
    BagIterator<Object> bagIterator = new BagIterator<>(parent);

    // Act and Assert
    assertEquals("Object", bagIterator.next());
    assertFalse(bagIterator.hasNext());
  }

  /**
   * Test BagIterator {@link BagIterator#remove()}.
   * <p>
   * Method under test: {@link BagIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void BagIterator.remove()"})
  public void testBagIteratorRemove() {
    // Arrange
    BagIterator<Object> bagIterator = new BagIterator<>(new HashBag<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bagIterator.remove());
  }

  /**
   * Test {@link AbstractMapBag#contains(Object)}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.contains(Object)"})
  public void testContains_givenHashBagAddObject_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act and Assert
    assertTrue(hashBag.contains("Object"));
  }

  /**
   * Test {@link AbstractMapBag#contains(Object)}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.contains(Object)"})
  public void testContains_givenHashBag_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.contains("Object"));
  }

  /**
   * Test {@link AbstractMapBag#containsAll(Collection)} with {@code coll}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#containsAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.containsAll(Collection)"})
  public void testContainsAllWithColl_givenHashBagAdd42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertTrue(hashBag.containsAll(coll));
  }

  /**
   * Test {@link AbstractMapBag#containsAll(Collection)} with {@code coll}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#containsAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.containsAll(Collection)"})
  public void testContainsAllWithColl_givenHashBag_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(hashBag.containsAll(coll));
  }

  /**
   * Test {@link AbstractMapBag#containsAll(Collection)} with {@code coll}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#containsAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.containsAll(Collection)"})
  public void testContainsAllWithColl_givenHashBag_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(hashBag.containsAll(coll));
  }

  /**
   * Test {@link AbstractMapBag#containsAll(Collection)} with {@code coll}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#containsAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.containsAll(Collection)"})
  public void testContainsAllWithColl_givenHashBag_whenArrayList_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertTrue(hashBag.containsAll(new ArrayList<>()));
  }

  /**
   * Test {@link AbstractMapBag#containsAll(Bag)} with {@code other}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#containsAll(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.containsAll(Bag)"})
  public void testContainsAllWithOther_givenHashBagAddObject_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    HashBag<Object> other = new HashBag<>();
    other.add("Object");

    // Act and Assert
    assertTrue(hashBag.containsAll(other));
  }

  /**
   * Test {@link AbstractMapBag#containsAll(Bag)} with {@code other}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#containsAll(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.containsAll(Bag)"})
  public void testContainsAllWithOther_givenHashBag_whenHashBagAddObject_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    HashBag<Object> other = new HashBag<>();
    other.add("Object");

    // Act and Assert
    assertFalse(hashBag.containsAll(other));
  }

  /**
   * Test {@link AbstractMapBag#containsAll(Bag)} with {@code other}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#containsAll(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.containsAll(Bag)"})
  public void testContainsAllWithOther_givenHashBag_whenHashBagAddObject_thenReturnFalse2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    HashBag<Object> other = new HashBag<>();
    other.add("Object");
    other.add("Object");

    // Act and Assert
    assertFalse(hashBag.containsAll(other));
  }

  /**
   * Test {@link AbstractMapBag#containsAll(Bag)} with {@code other}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When {@link HashBag#HashBag()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#containsAll(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.containsAll(Bag)"})
  public void testContainsAllWithOther_givenHashBag_whenHashBag_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertTrue(hashBag.containsAll(new HashBag<>()));
  }

  /**
   * Test {@link AbstractMapBag#doReadObject(Map, ObjectInputStream)}.
   * <ul>
   *   <li>Given {@link IOException#IOException(String)} with {@code foo}.</li>
   *   <li>Then throw {@link IOException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#doReadObject(Map, ObjectInputStream)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractMapBag.doReadObject(Map, ObjectInputStream)"})
  public void testDoReadObject_givenIOExceptionWithFoo_thenThrowIOException()
      throws IOException, ClassNotFoundException {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    HashMap<Object, MutableInteger> map = new HashMap<>();
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenThrow(new IOException("foo"));
    when(in.readInt()).thenReturn(1);

    // Act and Assert
    assertThrows(IOException.class, () -> hashBag.doReadObject(map, in));
    verify(in).readInt();
    verify(in).readObject();
  }

  /**
   * Test {@link AbstractMapBag#doReadObject(Map, ObjectInputStream)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>Then {@link HashMap#HashMap()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#doReadObject(Map, ObjectInputStream)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractMapBag.doReadObject(Map, ObjectInputStream)"})
  public void testDoReadObject_givenObject_thenHashMapSizeIsOne() throws IOException, ClassNotFoundException {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    HashMap<Object, MutableInteger> map = new HashMap<>();
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn("Object");
    when(in.readInt()).thenReturn(1);

    // Act
    hashBag.doReadObject(map, in);

    // Assert
    verify(in, atLeast(1)).readInt();
    verify(in).readObject();
    assertEquals(1, map.size());
    assertEquals(1, hashBag.size());
    assertEquals(1, map.get("Object").value);
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}, and {@link AbstractMapBag#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMapBag#equals(Object)}
   *   <li>{@link AbstractMapBag#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    HashBag<Object> hashBag2 = new HashBag<>();

    // Act and Assert
    assertEquals(hashBag, hashBag2);
    int expectedHashCodeResult = hashBag.hashCode();
    assertEquals(expectedHashCodeResult, hashBag2.hashCode());
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}, and {@link AbstractMapBag#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMapBag#equals(Object)}
   *   <li>{@link AbstractMapBag#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add("Object");

    // Act and Assert
    assertEquals(hashBag, hashBag2);
    int expectedHashCodeResult = hashBag.hashCode();
    assertEquals(expectedHashCodeResult, hashBag2.hashCode());
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}, and {@link AbstractMapBag#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMapBag#equals(Object)}
   *   <li>{@link AbstractMapBag#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertEquals(hashBag, hashBag);
    int expectedHashCodeResult = hashBag.hashCode();
    assertEquals(expectedHashCodeResult, hashBag.hashCode());
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act and Assert
    assertNotEquals(hashBag, new HashBag<>());
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add(2);

    // Act and Assert
    assertNotEquals(hashBag, hashBag2);
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(new HashBag<>());

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add("Object");

    // Act and Assert
    assertNotEquals(hashBag, hashBag2);
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add(hashBag);

    HashBag<Object> hashBag3 = new HashBag<>();
    hashBag3.add("Object");

    // Act and Assert
    assertNotEquals(hashBag2, hashBag3);
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(null);

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add(hashBag);

    HashBag<Object> hashBag3 = new HashBag<>();
    hashBag3.add("Object");

    // Act and Assert
    assertNotEquals(hashBag2, hashBag3);
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(new HashBag<>());

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add(hashBag);

    HashBag<Object> hashBag3 = new HashBag<>();
    hashBag3.add("Object");

    // Act and Assert
    assertNotEquals(hashBag2, hashBag3);
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(0);
    hashBag.add("Object");

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add(hashBag);

    HashBag<Object> hashBag3 = new HashBag<>();
    hashBag3.add("Object");

    // Act and Assert
    assertNotEquals(hashBag2, hashBag3);
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertNotEquals(hashBag, null);
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertNotEquals(hashBag, "Different type to AbstractMapBag");
  }

  /**
   * Test {@link AbstractMapBag#getCount(Object)}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#getCount(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMapBag.getCount(Object)"})
  public void testGetCount_givenHashBagAddObject_thenReturnOne() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act and Assert
    assertEquals(1, hashBag.getCount("Object"));
  }

  /**
   * Test {@link AbstractMapBag#getCount(Object)}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#getCount(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMapBag.getCount(Object)"})
  public void testGetCount_givenHashBag_thenReturnZero() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertEquals(0, hashBag.getCount("Object"));
  }

  /**
   * Test {@link AbstractMapBag#getMap()}.
   * <p>
   * Method under test: {@link AbstractMapBag#getMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Map AbstractMapBag.getMap()"})
  public void testGetMap() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertTrue(hashBag.getMap().isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#isEmpty()}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.isEmpty()"})
  public void testIsEmpty_givenHashBagAddObject_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act and Assert
    assertFalse(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#isEmpty()}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.isEmpty()"})
  public void testIsEmpty_givenHashBag_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#iterator()}.
   * <p>
   * Method under test: {@link AbstractMapBag#iterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator AbstractMapBag.iterator()"})
  public void testIterator() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act
    Iterator<Object> actualIteratorResult = hashBag.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof BagIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test MutableInteger {@link MutableInteger#equals(Object)}, and {@link MutableInteger#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link MutableInteger#equals(Object)}
   *   <li>{@link MutableInteger#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean MutableInteger.equals(Object)", "int MutableInteger.hashCode()"})
  public void testMutableIntegerEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MutableInteger mutableInteger = new MutableInteger(42);
    MutableInteger mutableInteger2 = new MutableInteger(42);

    // Act and Assert
    assertEquals(mutableInteger, mutableInteger2);
    int expectedHashCodeResult = mutableInteger.hashCode();
    assertEquals(expectedHashCodeResult, mutableInteger2.hashCode());
  }

  /**
   * Test MutableInteger {@link MutableInteger#equals(Object)}, and {@link MutableInteger#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link MutableInteger#equals(Object)}
   *   <li>{@link MutableInteger#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean MutableInteger.equals(Object)", "int MutableInteger.hashCode()"})
  public void testMutableIntegerEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MutableInteger mutableInteger = new MutableInteger(42);

    // Act and Assert
    assertEquals(mutableInteger, mutableInteger);
    int expectedHashCodeResult = mutableInteger.hashCode();
    assertEquals(expectedHashCodeResult, mutableInteger.hashCode());
  }

  /**
   * Test MutableInteger {@link MutableInteger#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MutableInteger#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean MutableInteger.equals(Object)", "int MutableInteger.hashCode()"})
  public void testMutableIntegerEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MutableInteger mutableInteger = new MutableInteger(1);

    // Act and Assert
    assertNotEquals(mutableInteger, new MutableInteger(42));
  }

  /**
   * Test MutableInteger {@link MutableInteger#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MutableInteger#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean MutableInteger.equals(Object)", "int MutableInteger.hashCode()"})
  public void testMutableIntegerEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MutableInteger(42), null);
  }

  /**
   * Test MutableInteger {@link MutableInteger#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MutableInteger#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean MutableInteger.equals(Object)", "int MutableInteger.hashCode()"})
  public void testMutableIntegerEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MutableInteger(42), "Different type to MutableInteger");
  }

  /**
   * Test MutableInteger {@link MutableInteger#MutableInteger(int)}.
   * <p>
   * Method under test: {@link MutableInteger#MutableInteger(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void MutableInteger.<init>(int)"})
  public void testMutableIntegerNewMutableInteger() {
    // Arrange, Act and Assert
    assertEquals(42, (new MutableInteger(42)).value);
  }

  /**
   * Test {@link AbstractMapBag#remove(Object, int)} with {@code object}, {@code nCopies}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>When one.</li>
   *   <li>Then {@link HashBag#HashBag()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#remove(Object, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.remove(Object, int)"})
  public void testRemoveWithObjectNCopies_givenHashBagAddObject_whenOne_thenHashBagEmpty() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act
    boolean actualRemoveResult = hashBag.remove("Object", 1);

    // Assert
    assertTrue(hashBag.isEmpty());
    assertTrue(actualRemoveResult);
  }

  /**
   * Test {@link AbstractMapBag#remove(Object, int)} with {@code object}, {@code nCopies}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>When one.</li>
   *   <li>Then {@link HashBag#HashBag()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#remove(Object, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.remove(Object, int)"})
  public void testRemoveWithObjectNCopies_givenHashBagAddObject_whenOne_thenHashBagSizeIsOne() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");
    hashBag.add("Object");

    // Act
    boolean actualRemoveResult = hashBag.remove("Object", 1);

    // Assert
    assertEquals(1, hashBag.size());
    assertTrue(actualRemoveResult);
  }

  /**
   * Test {@link AbstractMapBag#remove(Object, int)} with {@code object}, {@code nCopies}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>When zero.</li>
   *   <li>Then {@link HashBag#HashBag()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#remove(Object, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.remove(Object, int)"})
  public void testRemoveWithObjectNCopies_givenHashBagAddObject_whenZero_thenHashBagSizeIsOne() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act
    boolean actualRemoveResult = hashBag.remove("Object", 0);

    // Assert
    assertEquals(1, hashBag.size());
    assertFalse(actualRemoveResult);
  }

  /**
   * Test {@link AbstractMapBag#remove(Object, int)} with {@code object}, {@code nCopies}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When one.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#remove(Object, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.remove(Object, int)"})
  public void testRemoveWithObjectNCopies_givenHashBag_whenOne_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.remove("Object", 1));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#remove(Object)} with {@code object}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.remove(Object)"})
  public void testRemoveWithObject_givenHashBagAddObject_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act
    boolean actualRemoveResult = hashBag.remove("Object");

    // Assert
    assertTrue(hashBag.isEmpty());
    assertTrue(actualRemoveResult);
  }

  /**
   * Test {@link AbstractMapBag#remove(Object)} with {@code object}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.remove(Object)"})
  public void testRemoveWithObject_givenHashBag_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.remove("Object"));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link HashBag#HashBag()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.removeAll(Collection)"})
  public void testRemoveAll_givenHashBagAdd42_whenArrayListAdd42_thenHashBagSizeIsOne() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("42");
    hashBag.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualRemoveAllResult = hashBag.removeAll(coll);

    // Assert
    assertEquals(1, hashBag.size());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link AbstractMapBag#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.removeAll(Collection)"})
  public void testRemoveAll_givenHashBagAdd42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualRemoveAllResult = hashBag.removeAll(coll);

    // Assert
    assertTrue(hashBag.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link AbstractMapBag#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.removeAll(Collection)"})
  public void testRemoveAll_givenHashBagAdd42_whenArrayListAdd42_thenReturnTrue2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualRemoveAllResult = hashBag.removeAll(coll);

    // Assert
    assertTrue(hashBag.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link AbstractMapBag#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.removeAll(Collection)"})
  public void testRemoveAll_givenHashBag_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(hashBag.removeAll(coll));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.removeAll(Collection)"})
  public void testRemoveAll_givenHashBag_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(hashBag.removeAll(coll));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.removeAll(Collection)"})
  public void testRemoveAll_givenHashBag_whenArrayList_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.removeAll(new ArrayList<>()));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Collection)} with {@code coll}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link HashBag#HashBag()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#retainAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Collection)"})
  public void testRetainAllWithColl_givenHashBagAdd42_whenArrayListAdd42_thenHashBagSizeIsTwo() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("42");
    hashBag.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualRetainAllResult = hashBag.retainAll(coll);

    // Assert
    assertEquals(2, hashBag.size());
    assertFalse(actualRetainAllResult);
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Collection)} with {@code coll}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#retainAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Collection)"})
  public void testRetainAllWithColl_givenHashBagAdd42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualRetainAllResult = hashBag.retainAll(coll);

    // Assert
    assertTrue(hashBag.isEmpty());
    assertTrue(actualRetainAllResult);
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Collection)} with {@code coll}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#retainAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Collection)"})
  public void testRetainAllWithColl_givenHashBagAddObject_whenArrayList_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act
    boolean actualRetainAllResult = hashBag.retainAll(new ArrayList<>());

    // Assert
    assertTrue(hashBag.isEmpty());
    assertTrue(actualRetainAllResult);
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Collection)} with {@code coll}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#retainAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Collection)"})
  public void testRetainAllWithColl_givenHashBagAddObject_whenArrayList_thenReturnTrue2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");
    hashBag.add("Object");

    // Act
    boolean actualRetainAllResult = hashBag.retainAll(new ArrayList<>());

    // Assert
    assertTrue(hashBag.isEmpty());
    assertTrue(actualRetainAllResult);
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Collection)} with {@code coll}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#retainAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Collection)"})
  public void testRetainAllWithColl_givenHashBag_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(hashBag.retainAll(coll));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Collection)} with {@code coll}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#retainAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Collection)"})
  public void testRetainAllWithColl_givenHashBag_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(hashBag.retainAll(coll));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Collection)} with {@code coll}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#retainAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Collection)"})
  public void testRetainAllWithColl_givenHashBag_whenArrayList_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.retainAll(new ArrayList<>()));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Bag)} with {@code other}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then {@link HashBag#HashBag()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#retainAll(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Bag)"})
  public void testRetainAllWithOther_givenHashBagAddObject_thenHashBagSizeIsTwo() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    HashBag<Object> other = new HashBag<>();
    other.add("Object");
    other.add("Object");

    // Act
    boolean actualRetainAllResult = hashBag.retainAll(other);

    // Assert
    assertEquals(2, other.size());
    assertTrue(actualRetainAllResult);
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Bag)} with {@code other}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#retainAll(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Bag)"})
  public void testRetainAllWithOther_givenHashBagAddObject_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    HashBag<Object> other = new HashBag<>();
    other.add("Object");

    // Act and Assert
    assertFalse(hashBag.retainAll(other));
    assertEquals(hashBag, other);
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Bag)} with {@code other}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#retainAll(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Bag)"})
  public void testRetainAllWithOther_givenHashBagAddObject_whenHashBag_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");
    HashBag<Object> other = new HashBag<>();

    // Act and Assert
    assertTrue(hashBag.retainAll(other));
    assertEquals(hashBag, other);
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Bag)} with {@code other}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#retainAll(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Bag)"})
  public void testRetainAllWithOther_givenHashBagAddObject_whenHashBag_thenReturnTrue2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");
    hashBag.add("Object");
    HashBag<Object> other = new HashBag<>();

    // Act and Assert
    assertTrue(hashBag.retainAll(other));
    assertEquals(hashBag, other);
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Bag)} with {@code other}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then {@link HashBag#HashBag()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#retainAll(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Bag)"})
  public void testRetainAllWithOther_givenHashBag_whenHashBagAddObject_thenHashBagSizeIsOne() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    HashBag<Object> other = new HashBag<>();
    other.add("Object");

    // Act
    boolean actualRetainAllResult = hashBag.retainAll(other);

    // Assert
    assertEquals(1, other.size());
    assertFalse(actualRetainAllResult);
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Bag)} with {@code other}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then {@link HashBag#HashBag()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#retainAll(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Bag)"})
  public void testRetainAllWithOther_givenHashBag_whenHashBagAddObject_thenHashBagSizeIsTwo() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    HashBag<Object> other = new HashBag<>();
    other.add("Object");
    other.add("Object");

    // Act
    boolean actualRetainAllResult = hashBag.retainAll(other);

    // Assert
    assertEquals(2, other.size());
    assertFalse(actualRetainAllResult);
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Bag)} with {@code other}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When {@link HashBag#HashBag()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#retainAll(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Bag)"})
  public void testRetainAllWithOther_givenHashBag_whenHashBag_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    HashBag<Object> other = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.retainAll(other));
    assertEquals(hashBag, other);
  }

  /**
   * Test {@link AbstractMapBag#size()}.
   * <p>
   * Method under test: {@link AbstractMapBag#size()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMapBag.size()"})
  public void testSize() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertEquals(0, hashBag.size());
  }

  /**
   * Test {@link AbstractMapBag#toArray(Object[])} with {@code Object[]}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then first element is {@code Array}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#toArray(Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object[] AbstractMapBag.toArray(Object[])"})
  public void testToArrayWithObject_givenHashBagAddObject_thenFirstElementIsArray() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");
    hashBag.add("Object");
    Object[] array = new Object[]{"Array"};

    // Act
    Object[] actualToArrayResult = hashBag.toArray(array);

    // Assert
    assertEquals("Array", array[0]);
    assertEquals("Object", actualToArrayResult[0]);
    assertEquals("Object", actualToArrayResult[1]);
    assertEquals(1, array.length);
    assertEquals(2, actualToArrayResult.length);
  }

  /**
   * Test {@link AbstractMapBag#toString()}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then return {@code [1:Object]}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String AbstractMapBag.toString()"})
  public void testToString_givenHashBagAddObject_thenReturn1Object() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act and Assert
    assertEquals("[1:Object]", hashBag.toString());
  }

  /**
   * Test {@link AbstractMapBag#toString()}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add two.</li>
   *   <li>Then return {@code [1:2,1:Object]}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String AbstractMapBag.toString()"})
  public void testToString_givenHashBagAddTwo_thenReturn121Object() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(2);
    hashBag.add("Object");

    // Act and Assert
    assertEquals("[1:2,1:Object]", hashBag.toString());
  }

  /**
   * Test {@link AbstractMapBag#toString()}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>Then return {@code []}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapBag#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String AbstractMapBag.toString()"})
  public void testToString_givenHashBag_thenReturnLeftSquareBracketRightSquareBracket() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertEquals("[]", hashBag.toString());
  }

  /**
   * Test {@link AbstractMapBag#uniqueSet()}.
   * <p>
   * Method under test: {@link AbstractMapBag#uniqueSet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set AbstractMapBag.uniqueSet()"})
  public void testUniqueSet() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertTrue(hashBag.uniqueSet().isEmpty());
  }
}
