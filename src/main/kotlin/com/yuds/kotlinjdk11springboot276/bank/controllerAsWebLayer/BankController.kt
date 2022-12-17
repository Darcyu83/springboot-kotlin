package com.yuds.kotlinjdk11springboot276.bank.controllerAsWebLayer

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/bank")
class BankController {

    @GetMapping("")
    fun getBankList(): List<String> {
        return listOf("Skia bank", "haha bank")    }

}