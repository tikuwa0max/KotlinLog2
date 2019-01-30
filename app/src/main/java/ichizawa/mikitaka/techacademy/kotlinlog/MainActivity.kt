package ichizawa.mikitaka.techacademy.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dog = Dog("ポチ", 3, "run")      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        dog.move()
        dog.say()  // ポチが吠えます（ログ出力）

        val human1 = Human("太郎", 17, "野球観戦")

        human1.say()
        human1.think()

        val human2 = Human("花子", 8, "縄跳び" )

        human2.say()
        human2.think()

    }


}
