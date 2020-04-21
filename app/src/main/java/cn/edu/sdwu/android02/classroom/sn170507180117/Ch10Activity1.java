package cn.edu.sdwu.android02.classroom.sn170507180117;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Ch10Activity1 extends AppCompatActivity {
private  Integer count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch10_1);
        Log.i(Ch10Activity1.class.toString(),"onCreate");
        count=0;
    }
public void finishClick(View view){
    finish();//关闭界面
}

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Ch10Activity1.class.toString(),"onStart");
    }

//计数的方法
    public void counter (View view){
        count++;
        Log.i(Ch10Activity1.class.toString(),"counter:"+count);
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        //使用本方法保存一些界面的状态信息
        //数据保存到Bundle对象中
        outState.putInt("count",count);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        //恢复之前保存的状态信息
        count=savedInstanceState.getInt("count");
        Log.i(Ch10Activity1.class.toString(),"onRestoreInstanceState");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Ch10Activity1.class.toString(),"onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Ch10Activity1.class.toString(),"onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Ch10Activity1.class.toString(),"onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Ch10Activity1.class.toString(),"onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Ch10Activity1.class.toString(),"onResume");
    }

}
