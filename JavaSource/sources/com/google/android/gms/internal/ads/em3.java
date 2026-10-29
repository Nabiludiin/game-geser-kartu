package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class em3 {

    /* renamed from: a, reason: collision with root package name */
    private final z64 f7702a;

    /* renamed from: b, reason: collision with root package name */
    private final jm3 f7703b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f7704c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7705d;

    /* renamed from: e, reason: collision with root package name */
    private final ak f7706e;

    /* renamed from: f, reason: collision with root package name */
    private final dn3 f7707f;

    /* renamed from: g, reason: collision with root package name */
    private final nu3 f7708g;

    em3(z64 z64Var, jm3 jm3Var, dn3 dn3Var, jj3 jj3Var, String str, ak akVar, b95 b95Var, b95 b95Var2, b95 b95Var3, nu3 nu3Var) {
        this.f7702a = z64Var;
        this.f7703b = jm3Var;
        this.f7705d = str;
        this.f7707f = dn3Var;
        this.f7706e = akVar;
        this.f7708g = nu3Var;
        int ordinal = jj3Var.ordinal();
        if (ordinal == 0) {
            this.f7704c = ((z85) b95Var).b();
        } else if (ordinal == 1) {
            this.f7704c = ((z85) b95Var2).b();
        } else {
            if (ordinal != 2) {
                throw new IllegalStateException();
            }
            this.f7704c = ((z85) b95Var3).b();
        }
    }

    final a5.d a() {
        if (!this.f7703b.c()) {
            return p64.a(Integer.toString(7));
        }
        if (!this.f7707f.b()) {
            return p64.d(new Callable() { // from class: com.google.android.gms.internal.ads.dm3
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return em3.this.b();
                }
            }, this.f7702a);
        }
        Set set = this.f7704c;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f7702a.B0((ho3) it.next()));
        }
        return p64.n(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.bm3
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return em3.this.c();
            }
        }, g74.a());
    }

    final /* synthetic */ String b() {
        return this.f7703b.g(16384, this.f7705d);
    }

    final /* synthetic */ String c() {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.cm3
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return em3.this.d();
            }
        };
        lu3 a8 = this.f7708g.a(101);
        try {
            a8.a();
            Object call = callable.call();
            a8.c();
            return (String) call;
        } finally {
        }
    }

    final /* synthetic */ String d() {
        xk xkVar = (xk) this.f7706e.A();
        String str = this.f7705d;
        jm3 jm3Var = this.f7703b;
        try {
            return Base64.encodeToString(((pl) jm3Var.f(xkVar.e(), str).A()).e(), 11);
        } catch (IllegalArgumentException unused) {
            return jm3Var.g(4096, str);
        }
    }
}
