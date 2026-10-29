package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class v82 extends xe3 {

    /* renamed from: q, reason: collision with root package name */
    private final Context f17437q;

    /* renamed from: r, reason: collision with root package name */
    private final z64 f17438r;

    public v82(Context context, z64 z64Var) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((Integer) s2.b0.c().d(uy.l9)).intValue(), ze3.f20155a);
        this.f17437q = context;
        this.f17438r = z64Var;
    }

    static /* synthetic */ Void j(w2.v vVar, SQLiteDatabase sQLiteDatabase) {
        n(sQLiteDatabase, vVar);
        return null;
    }

    static /* synthetic */ void k(SQLiteDatabase sQLiteDatabase, String str, w2.v vVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        n(sQLiteDatabase, vVar);
    }

    static final void m(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void n(SQLiteDatabase sQLiteDatabase, w2.v vVar) {
        SQLiteDatabase sQLiteDatabase2;
        String sb;
        sQLiteDatabase.beginTransaction();
        try {
            String[] strArr = {"timestamp", "url"};
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("event_state = ");
            sb2.append(1);
            String sb3 = sb2.toString();
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                Cursor query = sQLiteDatabase2.query("offline_buffered_pings", strArr, sb3, null, null, null, "timestamp ASC", null);
                int count = query.getCount();
                String[] strArr2 = new String[count];
                int i7 = 0;
                while (query.moveToNext()) {
                    int columnIndex = query.getColumnIndex("timestamp");
                    int columnIndex2 = query.getColumnIndex("url");
                    if (columnIndex2 != -1) {
                        long j7 = query.getLong(columnIndex);
                        String string = query.getString(columnIndex2);
                        if (string == null) {
                            sb = "";
                        } else {
                            Uri parse = Uri.parse(string);
                            long a8 = r2.t.o().a() - j7;
                            String encodedQuery = parse.getEncodedQuery();
                            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                            clearQuery.appendQueryParameter("bd", Long.toString(a8));
                            String valueOf = String.valueOf(clearQuery.build());
                            StringBuilder sb4 = new StringBuilder(valueOf.length() + 1 + String.valueOf(encodedQuery).length());
                            sb4.append(valueOf);
                            sb4.append("&");
                            sb4.append(encodedQuery);
                            sb = sb4.toString();
                        }
                        strArr2[i7] = sb;
                    }
                    i7++;
                }
                query.close();
                sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                sQLiteDatabase2.setTransactionSuccessful();
                sQLiteDatabase2.endTransaction();
                for (int i8 = 0; i8 < count; i8++) {
                    vVar.c(strArr2[i8], null);
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                sQLiteDatabase2.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase2 = sQLiteDatabase;
        }
    }

    final void a(j43 j43Var) {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.u82
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return v82.this.getWritableDatabase();
            }
        };
        z64 z64Var = this.f17438r;
        p64.r(z64Var.B0(callable), new o82(this, j43Var), z64Var);
    }

    final void c(final SQLiteDatabase sQLiteDatabase, final w2.v vVar, final String str) {
        this.f17438r.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.p82
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                v82.k(sQLiteDatabase, str, vVar);
            }
        });
    }

    public final void e(final w2.v vVar, final String str) {
        a(new j43() { // from class: com.google.android.gms.internal.ads.q82
            @Override // com.google.android.gms.internal.ads.j43
            public final /* synthetic */ Object d(Object obj) {
                v82.this.c((SQLiteDatabase) obj, vVar, str);
                return null;
            }
        });
    }

    public final void g(final String str) {
        a(new j43(this) { // from class: com.google.android.gms.internal.ads.r82
            @Override // com.google.android.gms.internal.ads.j43
            public final /* synthetic */ Object d(Object obj) {
                v82.m((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void h(final z82 z82Var) {
        a(new j43() { // from class: com.google.android.gms.internal.ads.s82
            @Override // com.google.android.gms.internal.ads.j43
            public final /* synthetic */ Object d(Object obj) {
                v82.this.l(z82Var, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    final /* synthetic */ Void l(z82 z82Var, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(z82Var.f20063a));
        contentValues.put("gws_query_id", z82Var.f20064b);
        contentValues.put("url", z82Var.f20065c);
        contentValues.put("event_state", Integer.valueOf(z82Var.f20066d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        r2.t.g();
        Context context = this.f17437q;
        v2.q0 d8 = v2.f2.d(context);
        if (d8 != null) {
            try {
                d8.zzf(w3.b.C1(context));
            } catch (RemoteException e8) {
                v2.n1.l("Failed to schedule offline ping sender.", e8);
            }
        }
        return null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
