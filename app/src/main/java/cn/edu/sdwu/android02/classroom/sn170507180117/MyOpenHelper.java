package cn.edu.sdwu.android02.classroom.sn170507180117;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by 玲 on 2020/4/29.
 */

public class MyOpenHelper extends SQLiteOpenHelper {
    private String STUDENT_TB_SQL="create table student(id integer primary key autoincrement,stuname text,stutel text)";
   public MyOpenHelper(Context context){
       //Context context, String name, CursorFactory factory, int version
       super(context,"stud.db",null,2);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //当打开数据库是，发现数据库并不存在，此时会自动创建数据库，然后调用oncreate方法
        //在本方法中完成数据库对象（表、视图、索引）的创建
        //通过SQLiteDatabase对象，完成SQL的执行
        sqLiteDatabase.execSQL(STUDENT_TB_SQL);
        Log.i(MyOpenHelper.class.toString(),"onCreate");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
//当构造方法中指定的版本号，与手机中已有数据库的版本号更新的时候，调用本方法
        sqLiteDatabase.execSQL("alter table student add column stuadd text");
    }
}
