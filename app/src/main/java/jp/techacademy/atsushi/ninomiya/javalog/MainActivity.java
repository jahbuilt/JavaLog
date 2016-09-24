package jp.techacademy.atsushi.ninomiya.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("あつし", 30, "レゲエ");     // 名前をあつし、年齢30歳、趣味はレゲエで、Humanのインスタンスを作る

        human.say();
        human.think();
    }

}


