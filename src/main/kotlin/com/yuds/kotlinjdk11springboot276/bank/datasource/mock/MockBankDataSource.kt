package com.yuds.kotlinjdk11springboot276.bank.datasource.mock

import com.yuds.kotlinjdk11springboot276.bank.datasource.BankDataSource
import com.yuds.kotlinjdk11springboot276.bank.modelAsDtoAsDataLayer.BankDTO
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource{

    val banks =  listOf(BankDTO("accNum1",0.1,3))
    var any : String = "aa"
    override fun getBanks(): Collection<BankDTO> = banks


}