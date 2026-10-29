package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: MyApplication */
public abstract class d82 {
    public static void a(SQLiteDatabase sQLiteDatabase) {
        i(sQLiteDatabase, "failed_requests", 0);
        i(sQLiteDatabase, "total_requests", 0);
        i(sQLiteDatabase, "completed_requests", 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", "last_successful_request_time");
        contentValues.put("value", (Long) 0L);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        h(sQLiteDatabase, "failed_requests", 0);
        h(sQLiteDatabase, "total_requests", 0);
        h(sQLiteDatabase, "completed_requests", 0);
    }

    public static int c(SQLiteDatabase sQLiteDatabase, int i7) {
        int i8 = 0;
        if (i7 == 2) {
            return 0;
        }
        Cursor g8 = g(sQLiteDatabase, i7);
        if (g8.getCount() > 0) {
            g8.moveToNext();
            i8 = g8.getInt(g8.getColumnIndexOrThrow("value"));
        }
        g8.close();
        return i8;
    }

    public static long d(SQLiteDatabase sQLiteDatabase, int i7) {
        long j7;
        Cursor g8 = g(sQLiteDatabase, 2);
        if (g8.getCount() > 0) {
            g8.moveToNext();
            j7 = g8.getLong(g8.getColumnIndexOrThrow("value"));
        } else {
            j7 = 0;
        }
        g8.close();
        return j7;
    }

    public static void e(SQLiteDatabase sQLiteDatabase, long j7, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j7));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j7)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static void f(SQLiteDatabase sQLiteDatabase, boolean z7, boolean z8) {
        if (!z8) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
            return;
        }
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "completed_requests"));
        if (z7) {
            return;
        }
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
    }

    private static Cursor g(SQLiteDatabase sQLiteDatabase, int i7) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i7 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i7 == 1) {
            strArr2[0] = "total_requests";
        } else if (i7 != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    private static void h(SQLiteDatabase sQLiteDatabase, String str, int i7) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    private static void i(SQLiteDatabase sQLiteDatabase, String str, int i7) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }
}
