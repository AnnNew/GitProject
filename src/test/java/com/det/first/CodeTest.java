package com.det.first;

import com.ret.second.ReplaceCharFromString;
import org.junit.Assert;
import org.junit.Test;

public class CodeTest {

    @org.junit.Test
    public void testEmptyString() {
        Interview interview = new Interview();
        Assert.assertEquals("", interview.reverseString(""));
    }

    @org.junit.Test
    public void testHappyPath() {
        Interview interview = new Interview();
        Assert.assertEquals("ulom", interview.reverseString("molu"));
        Assert.assertEquals("uddug", interview.reverseString("guddu"));
        Assert.assertNotEquals("akjdhsahd", interview.reverseString("asdhsd"));
    }

    @org.junit.Test
    public void testNullInput() {
        Interview interview = new Interview();
        try {
            interview.reverseString(null);
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Please provide a valid input", e.getMessage());
        }
    }

    @org.junit.Test
    public void testInput() {
        ReplaceCharFromString rc = new ReplaceCharFromString();
        Assert.assertEquals("bbnbnb", rc.replaceCharFromString("banana"));
    }

    @org.junit.Test
    public void testNullForReplaceInput() {
        try {
            ReplaceCharFromString.replaceCharFromString(null);
        } catch (Exception e) {
            Assert.assertTrue(e instanceof IllegalArgumentException);
            Assert.assertEquals("invalid", e.getMessage());
        }
    }
}
