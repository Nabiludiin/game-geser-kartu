package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: MyApplication */
public final class kc5 {

    /* renamed from: a, reason: collision with root package name */
    private final jc5 f10970a;

    /* renamed from: b, reason: collision with root package name */
    private final ic5 f10971b;

    /* renamed from: c, reason: collision with root package name */
    private final az f10972c;

    /* renamed from: d, reason: collision with root package name */
    private int f10973d;

    /* renamed from: e, reason: collision with root package name */
    private Object f10974e;

    /* renamed from: f, reason: collision with root package name */
    private final Looper f10975f;

    /* renamed from: g, reason: collision with root package name */
    private final int f10976g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10977h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f10978i;

    public kc5(ic5 ic5Var, jc5 jc5Var, az azVar, int i7, pd1 pd1Var, Looper looper) {
        this.f10971b = ic5Var;
        this.f10970a = jc5Var;
        this.f10972c = azVar;
        this.f10975f = looper;
        this.f10976g = i7;
    }

    public final jc5 a() {
        return this.f10970a;
    }

    public final kc5 b(int i7) {
        rx3.h(!this.f10977h);
        this.f10973d = i7;
        return this;
    }

    public final int c() {
        return this.f10973d;
    }

    public final kc5 d(Object obj) {
        rx3.h(!this.f10977h);
        this.f10974e = obj;
        return this;
    }

    public final Object e() {
        return this.f10974e;
    }

    public final Looper f() {
        return this.f10975f;
    }

    public final kc5 g() {
        rx3.h(!this.f10977h);
        this.f10977h = true;
        this.f10971b.a(this);
        return this;
    }

    public final synchronized boolean h() {
        return false;
    }

    public final synchronized void i(boolean z7) {
        this.f10978i = z7 | this.f10978i;
        notifyAll();
    }
}
