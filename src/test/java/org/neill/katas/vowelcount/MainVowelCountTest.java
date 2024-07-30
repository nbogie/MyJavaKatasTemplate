package org.neill.katas.vowelcount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainVowelCountTest {

    @Test
    void basic() {
        assertEquals(3, MainVowelCount.getCount("hello world"));
    }

    @Test
    void repeatedVowel() {
        assertEquals(3, MainVowelCount.getCount("bb bbaAac"));
    }

    @Test
    void repeatedConsonant() {
        assertEquals(1, MainVowelCount.getCount("dddDF dfeff fd"));
    }

    @Test
    void noVowels() {
        assertEquals(0, MainVowelCount.getCount("B BbBCD fghj klmNPR sTVwxY YYz"));
    }

    @Test
    void onlyVowels() {
        assertEquals(1, MainVowelCount.getCount("u"));
        assertEquals(3, MainVowelCount.getCount("uUU"));
        assertEquals(12, MainVowelCount.getCount("uuio aeiae iou"));
    }
}