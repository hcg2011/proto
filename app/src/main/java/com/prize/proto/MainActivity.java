package com.prize.proto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //    public static void gotoActivity(Class<?> clz, Activity activity) {
    //        Intent intent = new Intent(activity, clz);
    //        if (clz.getSimpleName().contains("MainActivity")) {
    //            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
    //        }
    //        activity.startActivity(intent);
    //        activity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    //
    //    }

}
