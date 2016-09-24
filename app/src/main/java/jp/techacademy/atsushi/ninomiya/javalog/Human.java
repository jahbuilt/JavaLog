package jp.techacademy.atsushi.ninomiya.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable{

    // コンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。年齢は、" + this.age + "歳です。" );
    }

    // メンバ関数
    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える。");
    }

}
