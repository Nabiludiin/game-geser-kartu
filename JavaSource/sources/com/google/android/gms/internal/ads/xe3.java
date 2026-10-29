package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: MyApplication */
public abstract class xe3 extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe3(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i7, ze3 ze3Var) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, i7);
        se3.a();
    }
}
