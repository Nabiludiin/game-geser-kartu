package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class n73 {

    /* renamed from: a, reason: collision with root package name */
    private final w2.y f12610a;

    /* renamed from: b, reason: collision with root package name */
    private final w2.v f12611b;

    /* renamed from: c, reason: collision with root package name */
    private final a74 f12612c;

    /* renamed from: d, reason: collision with root package name */
    private final o73 f12613d;

    /* renamed from: e, reason: collision with root package name */
    private final du0 f12614e;

    public n73(w2.y yVar, w2.v vVar, a74 a74Var, o73 o73Var, du0 du0Var) {
        this.f12610a = yVar;
        this.f12611b = vVar;
        this.f12612c = a74Var;
        this.f12613d = o73Var;
        this.f12614e = du0Var;
    }

    private final a5.d e(final String str, final long j7, final int i7) {
        final String str2;
        w2.y yVar = this.f12610a;
        if (i7 > yVar.a()) {
            o73 o73Var = this.f12613d;
            if (o73Var == null || !yVar.d()) {
                return p64.a(w2.u.RETRIABLE_FAILURE);
            }
            o73Var.a(str, "", 2);
            return p64.a(w2.u.BUFFERED);
        }
        if (((Boolean) s2.b0.c().d(uy.w9)).booleanValue()) {
            Uri parse = Uri.parse(str);
            String encodedQuery = parse.getEncodedQuery();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            clearQuery.appendQueryParameter("pa", Integer.toString(i7));
            String valueOf = String.valueOf(clearQuery.build());
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + String.valueOf(encodedQuery).length());
            sb.append(valueOf);
            sb.append("&");
            sb.append(encodedQuery);
            str2 = sb.toString();
        } else {
            str2 = str;
        }
        w54 w54Var = new w54() { // from class: com.google.android.gms.internal.ads.m73
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return n73.this.b(i7, j7, str, (w2.u) obj);
            }
        };
        if (j7 == 0) {
            a74 a74Var = this.f12612c;
            return p64.j(a74Var.B0(new Callable() { // from class: com.google.android.gms.internal.ads.l73
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return n73.this.d(str2);
                }
            }), w54Var, a74Var);
        }
        a74 a74Var2 = this.f12612c;
        return p64.j(a74Var2.schedule(new Callable() { // from class: com.google.android.gms.internal.ads.k73
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return n73.this.c(str2);
            }
        }, j7, TimeUnit.MILLISECONDS), w54Var, a74Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final w2.u d(String str) {
        du0 du0Var;
        if (!((Boolean) s2.b0.c().d(uy.O9)).booleanValue() || (du0Var = this.f12614e) == null || (!r2.t.g().U(str) && !r2.t.g().V(str))) {
            return this.f12611b.c(str, null);
        }
        String b8 = du0Var.b();
        HashMap hashMap = new HashMap();
        if (b8 != null) {
            hashMap.put((String) s2.b0.c().d(uy.P9), b8);
        }
        return this.f12611b.c(str, hashMap);
    }

    public final a5.d a(String str) {
        if (str != null) {
            if (!((Boolean) s2.b0.c().d(uy.f17090f)).booleanValue() || !str.isEmpty()) {
                try {
                    return e(str, 0L, 1);
                } catch (NullPointerException | RejectedExecutionException unused) {
                    return p64.a(w2.u.PERMANENT_FAILURE);
                }
            }
        }
        return p64.a(w2.u.PERMANENT_FAILURE);
    }

    final /* synthetic */ a5.d b(int i7, long j7, String str, w2.u uVar) {
        if (uVar != w2.u.RETRIABLE_FAILURE) {
            return p64.a(uVar);
        }
        w2.y yVar = this.f12610a;
        long b8 = yVar.b();
        if (i7 != 1) {
            b8 = (long) (yVar.c() * j7);
        }
        return e(str, b8, i7 + 1);
    }
}
