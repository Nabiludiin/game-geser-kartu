package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public abstract class bq implements Callable {

    /* renamed from: a, reason: collision with root package name */
    protected final ko f5895a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f5896b;

    /* renamed from: c, reason: collision with root package name */
    protected final String f5897c;

    /* renamed from: d, reason: collision with root package name */
    protected final ak f5898d;

    /* renamed from: e, reason: collision with root package name */
    protected Method f5899e;

    /* renamed from: f, reason: collision with root package name */
    protected final int f5900f;

    /* renamed from: g, reason: collision with root package name */
    protected final int f5901g;

    public bq(ko koVar, String str, String str2, ak akVar, int i7, int i8) {
        this.f5895a = koVar;
        this.f5896b = str;
        this.f5897c = str2;
        this.f5898d = akVar;
        this.f5900f = i7;
        this.f5901g = i8;
    }

    protected abstract void a();

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        int i7;
        try {
            long nanoTime = System.nanoTime();
            ko koVar = this.f5895a;
            Method o7 = koVar.o(this.f5896b, this.f5897c);
            this.f5899e = o7;
            if (o7 == null) {
                return null;
            }
            a();
            ym h8 = koVar.h();
            if (h8 == null || (i7 = this.f5900f) == Integer.MIN_VALUE) {
                return null;
            }
            h8.a(this.f5901g, i7, (System.nanoTime() - nanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
