package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final String f22592a;

    /* renamed from: b, reason: collision with root package name */
    private long f22593b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f22594c;

    public s(u uVar, String str) {
        Objects.requireNonNull(uVar);
        this.f22594c = uVar;
        p3.o.g(str);
        this.f22592a = str;
        this.f22593b = -1L;
    }

    public final List a() {
        List arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = this.f22594c.u0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.f22592a, String.valueOf(this.f22593b)}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        long j7 = cursor.getLong(0);
                        long j8 = cursor.getLong(3);
                        boolean z7 = cursor.getLong(5) == 1;
                        byte[] blob = cursor.getBlob(4);
                        if (j7 > this.f22593b) {
                            this.f22593b = j7;
                        }
                        try {
                            com.google.android.gms.internal.measurement.h6 h6Var = (com.google.android.gms.internal.measurement.h6) td.W(com.google.android.gms.internal.measurement.i6.P(), blob);
                            String string = cursor.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            h6Var.I(string);
                            h6Var.L(cursor.getLong(2));
                            arrayList.add(new r(j7, j8, z7, (com.google.android.gms.internal.measurement.i6) h6Var.s()));
                        } catch (IOException e8) {
                            this.f22594c.f22928a.a().o().c("Data loss. Failed to merge raw event. appId", p5.x(this.f22592a), e8);
                        }
                    } while (cursor.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e9) {
                this.f22594c.f22928a.a().o().c("Data loss. Error querying raw events batch. appId", p5.x(this.f22592a), e9);
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursor.close();
            }
        }
    }

    public s(u uVar, String str, long j7) {
        Objects.requireNonNull(uVar);
        this.f22594c = uVar;
        p3.o.g(str);
        this.f22592a = str;
        this.f22593b = uVar.b0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j7)}, -1L);
    }
}
