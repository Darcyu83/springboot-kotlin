package com.yuds.kotlinjdk11springboot276.bank.modelAsDtoAsDataLayer

data class BankDTO(
     val accountNum: String,
     val trust: Double,
     var transactionFee: Int,
)