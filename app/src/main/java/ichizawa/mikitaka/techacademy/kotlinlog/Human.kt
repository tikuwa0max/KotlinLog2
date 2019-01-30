package ichizawa.mikitaka.techacademy.kotlinlog

import android.util.Log

open class Human : Animal,Thinkable {

    var hobby: String　= ""


    constructor(name: String, age: Int, hobby: String): super(name, age, hobby) {

    }


    // メソッド
    override fun say() {
        Log.d("kotlintest", "「私の名前は"+ this.name + "です。歳は" + this.age + "歳です」" )
    }

    override fun think() {
        Log.d("kotlintest", "「私は" + this.hobby + "について考える。")
    }
}