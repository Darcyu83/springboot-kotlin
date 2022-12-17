package com.yuds.kotlinjdk11springboot276.bank.datasource

import com.yuds.kotlinjdk11springboot276.bank.modelAsDtoAsDataLayer.BankDTO

interface BankDataSource {

    fun getBanks() :Collection<BankDTO>
}