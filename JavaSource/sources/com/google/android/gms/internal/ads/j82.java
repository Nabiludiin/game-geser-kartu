package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import java.util.ArrayList;

/* compiled from: MyApplication */
public final class j82 {

    /* renamed from: a, reason: collision with root package name */
    private final iu f10393a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f10394b;

    /* renamed from: c, reason: collision with root package name */
    private final n72 f10395c;

    /* renamed from: d, reason: collision with root package name */
    private final w2.a f10396d;

    public j82(Context context, w2.a aVar, iu iuVar, n72 n72Var) {
        this.f10394b = context;
        this.f10396d = aVar;
        this.f10393a = iuVar;
        this.f10395c = n72Var;
    }

    public final void a(final boolean z7) {
        try {
            this.f10395c.a(new j43() { // from class: com.google.android.gms.internal.ads.i82
                @Override // com.google.android.gms.internal.ads.j43
                public final /* synthetic */ Object d(Object obj) {
                    j82.this.b(z7, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e8) {
            String valueOf = String.valueOf(e8.getMessage());
            int i7 = v2.n1.f26802b;
            w2.p.c("Error in offline signals database startup: ".concat(valueOf));
        }
    }

    final /* synthetic */ Void b(boolean z7, SQLiteDatabase sQLiteDatabase) {
        if (z7) {
            this.f10394b.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(av.H0(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (e05 e8) {
                    int i7 = v2.n1.f26802b;
                    w2.p.c("Unable to deserialize proto from offline signals database:");
                    w2.p.c(e8.getMessage());
                }
            }
            query.close();
            Context context = this.f10394b;
            cv d02 = fv.d0();
            d02.E(context.getPackageName());
            d02.F(Build.MODEL);
            d02.J(d82.c(sQLiteDatabase, 0));
            d02.I(arrayList);
            d02.K(d82.c(sQLiteDatabase, 1));
            d02.H(d82.c(sQLiteDatabase, 3));
            d02.L(r2.t.o().a());
            d02.G(d82.d(sQLiteDatabase, 2));
            final fv fvVar = (fv) d02.A();
            int size = arrayList.size();
            long j7 = 0;
            for (int i8 = 0; i8 < size; i8++) {
                av avVar = (av) arrayList.get(i8);
                if (avVar.G0() == ox.ENUM_TRUE && avVar.z0() > j7) {
                    j7 = avVar.z0();
                }
            }
            if (j7 != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", Long.valueOf(j7));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            iu iuVar = this.f10393a;
            iuVar.b(new hu() { // from class: com.google.android.gms.internal.ads.g82
                @Override // com.google.android.gms.internal.ads.hu
                public final /* synthetic */ void a(qx qxVar) {
                    qxVar.K(fv.this);
                }
            });
            w2.a aVar = this.f10396d;
            qv i02 = rv.i0();
            i02.E(aVar.f27052r);
            i02.F(aVar.f27053s);
            i02.G(true == aVar.f27054t ? 0 : 2);
            final rv rvVar = (rv) i02.A();
            iuVar.b(new hu() { // from class: com.google.android.gms.internal.ads.h82
                @Override // com.google.android.gms.internal.ads.hu
                public final /* synthetic */ void a(qx qxVar) {
                    ix ixVar = (ix) qxVar.G().Q();
                    ixVar.F(rv.this);
                    qxVar.H(ixVar);
                }
            });
            iuVar.c(10004);
            d82.b(sQLiteDatabase);
        }
        return null;
    }
}
