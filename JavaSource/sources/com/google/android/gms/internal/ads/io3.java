package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* compiled from: MyApplication */
public abstract class io3 implements ho3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f10107a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10108b;

    /* renamed from: c, reason: collision with root package name */
    private final dn3 f10109c;

    /* renamed from: d, reason: collision with root package name */
    private final ak f10110d;

    /* renamed from: e, reason: collision with root package name */
    private final lu3 f10111e;

    public io3(String str, String str2, ak akVar, dn3 dn3Var, lu3 lu3Var) {
        this.f10107a = str;
        this.f10108b = str2;
        this.f10110d = akVar;
        this.f10109c = dn3Var;
        this.f10111e = lu3Var;
    }

    protected abstract void a(Method method, ak akVar);

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        try {
            this.f10111e.a();
            Method h8 = this.f10109c.h(this.f10107a, this.f10108b);
            if (h8 != null) {
                a(h8, this.f10110d);
            }
            this.f10111e.c();
            return null;
        } catch (Throwable th) {
            try {
                this.f10111e.b(th);
                throw th;
            } catch (Throwable th2) {
                this.f10111e.c();
                throw th2;
            }
        }
    }
}
