package com.yuds.kotlinjdk11springboot276.bank.datasource.mock


import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest{


    private val mockDataSource = MockBankDataSource()
     
     @Test
     fun `sould provide a collection of banks`() {
         // given
     
     
         // when
        val banks = mockDataSource.getBanks()
     
         // then

         assertThat(banks).isNotEmpty
     }


         @Test
         fun `sould provide some mock data`() {
             // given


             // when

             val banks = mockDataSource.getBanks()

             // then

             assertThat(banks).allMatch { it.accountNum.isNotBlank() }
             assertThat(banks).anyMatch { it.trust != 0.0 }
             assertThat(banks).anyMatch { it.transactionFee != 0 }

         }
}