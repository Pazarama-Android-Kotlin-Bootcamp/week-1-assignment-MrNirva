package com.arcapp.kotlinweek1

import org.junit.Assert
import org.junit.Test

class HomeworkUnitTest {


    // Homework - 1
    @Test
    fun testUsernameValidation() {

        val actual = usernameValidation("u__hello_world123")
        Assert.assertEquals(true, actual)

    }


    // Homework - 2
    @Test
    fun testAVeryBigSum(){

        val list = listOf<Long>(100000000, 100000001, 100000002, 100000003, 100000004)
        val actual = aVeryBigSum(list)
        Assert.assertEquals(500000010, actual)

    }


    // Homework - 4
    @Test
    fun testFirstFactorial(){

        val actual = firstFactorial(8)
        Assert.assertEquals(40320, actual)

    }


    // Homework - 5
    @Test
    fun testQuestionsMarks(){

        val actual = questionsMarks("acc?7??sss?3rr1??????5")
        Assert.assertEquals("true", actual)

    }

}