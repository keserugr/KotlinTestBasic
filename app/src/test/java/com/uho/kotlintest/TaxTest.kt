package com.uho.kotlintest

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class TaxTest {

    private lateinit var tax: Tax

    @Before
    fun setUp(){
        tax = Tax()
    }

    @After
    fun teardown(){

    }

    @Test
    fun calculateTax(){
        val netTax = tax.calculateTax(100.0,0.2)

        assertThat(netTax).isEqualTo(20)
    }

    @Test
    fun calculateIncome(){
        val income = tax.calculateIncome(100.0,0.2)

        assertThat(income).isEqualTo(80)
    }
}