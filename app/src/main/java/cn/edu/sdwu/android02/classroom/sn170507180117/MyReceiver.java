package cn.edu.sdwu.android02.classroom.sn170507180117;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        //当接受到广播时，自动调用本方法
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
      //获取广播的内容
        String content=intent.getStringExtra("key1");
        Toast.makeText(context,content,Toast.LENGTH_SHORT).show();
    }
}
