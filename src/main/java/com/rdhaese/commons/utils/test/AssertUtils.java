package com.rdhaese.commons.utils.test;

import org.junit.Assert;

/**
 * Created on 14/07/2017.
 * <p>
 * Class containing several utility methods for test assertions.
 * <p>
 * Assertions are made with {@link Assert}.
 *
 * @author Robin D'Haese
 * @see org.junit.Assert
 */
public final class AssertUtils {

    /**
     * Utility class -> should not be able to instantiate
     */
    private AssertUtils() {
    }

    /**
     * Asserts if the equals method is implemented correctly.
     * Objects must be equal in both ways,
     * .equals(null) and .equals(otherType) must resolve to Boolean.FALSE.
     *
     * Mainly for use in the {@link #assertEqualsAndHashCode(Object, Object)} method,
     * but can be used separately.
     *
     * Using the {@link #assertEqualsAndHashCode(Object, Object)} method is advised,
     * as it tests the equals and hashCode contract.
     *
     * @param o1 First object to use in the comparison
     * @param o2 Second object to use in the comparison
     * @see org.junit.Assert
     * @see #assertEqualsAndHashCode(Object, Object)
     */
    public static void assertEqualsMethod(Object o1, Object o2) {
        //Should be true from both ways
        Assert.assertEquals(o1, o2);
        Assert.assertEquals(o2, o1);
        //Should be false for null
        Assert.assertNotEquals(o1, null);
        //Should be false for other type
        Assert.assertNotEquals(o1, new OtherClass());
    }

    /**
     * Asserts if the hashCode of o1 and o2 are equal.
     * Mainly for use in the {@link #assertEqualsAndHashCode(Object, Object)} method,
     * but can be used separately.
     *
     * Using the {@link #assertEqualsAndHashCode(Object, Object)} method is advised,
     * as it tests the equals and hashCode contract.
     *
     * @param o1 First object to use its hashCode in the comparison
     * @param o2 Second object to use its hashCode in the comparison
     * @see org.junit.Assert
     * @see #assertEqualsAndHashCode(Object, Object)
     */
    public static void assertHashCodeMethod(Object o1, Object o2) {
        Assert.assertEquals(o1.hashCode(), o2.hashCode());
    }

    /**
     * Asserts if the equals method is implemented correctly using {@link #assertEqualsMethod(Object, Object)}
     * and the hashCodes are equal using {@link #assertHashCodeMethod(Object, Object)}.
     *
     * By using this method you also test the equals and hashCode contract.
     *
     * @param o1 First object to use in the comparison
     * @param o2 Second object to use in the comparison
     * @see #assertEqualsMethod(Object, Object)
     * @see #assertHashCodeMethod(Object, Object)
     */
    public static void assertEqualsAndHashCode(Object o1, Object o2) {
        assertEqualsMethod(o1, o2);
        assertHashCodeMethod(o1, o2);
    }

    /**
     * Class used to compare with and assert that the comparison resolves to Boolean.FALSE.
     * Therefor should not be accessible from the outside. No implementation needed.
     */
    private static class OtherClass {
    }
}
