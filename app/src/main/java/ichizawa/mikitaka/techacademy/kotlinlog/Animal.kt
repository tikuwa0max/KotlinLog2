package ichizawa.mikitaka.techacademy.kotlinlog

import android.util.Log

abstract class Animal {
    var name: String
    var age: Int


    // 引数付きコンストラクタ
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age

    }

    abstract fun say()
}