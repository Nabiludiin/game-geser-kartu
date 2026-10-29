package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: MyApplication */
public final class fi3 {

    /* renamed from: a, reason: collision with root package name */
    private final gk3 f8269a;

    /* renamed from: b, reason: collision with root package name */
    private final jl3 f8270b;

    /* renamed from: c, reason: collision with root package name */
    private final ft3 f8271c;

    /* renamed from: d, reason: collision with root package name */
    private final nu3 f8272d;

    /* renamed from: e, reason: collision with root package name */
    private final long f8273e;

    /* renamed from: f, reason: collision with root package name */
    private final h85 f8274f;

    /* renamed from: g, reason: collision with root package name */
    private final long f8275g;

    /* renamed from: h, reason: collision with root package name */
    private final long f8276h = System.currentTimeMillis();

    /* renamed from: i, reason: collision with root package name */
    private final boolean f8277i;

    /* renamed from: j, reason: collision with root package name */
    private final long f8278j;

    fi3(gk3 gk3Var, jl3 jl3Var, ft3 ft3Var, nu3 nu3Var, h85 h85Var, li3 li3Var) {
        this.f8269a = gk3Var;
        this.f8270b = jl3Var;
        this.f8271c = ft3Var;
        this.f8272d = nu3Var;
        this.f8273e = li3Var.n0();
        this.f8274f = h85Var;
        this.f8275g = li3Var.m0();
        this.f8277i = li3Var.w0();
        this.f8278j = li3Var.v0();
    }

    public final a5.d a() {
        return this.f8269a.a();
    }

    public final String b(Context context) {
        String num;
        boolean z7 = false;
        if (this.f8277i) {
            if (System.currentTimeMillis() - this.f8276h <= this.f8278j) {
                z7 = true;
            }
        }
        lu3 a8 = this.f8272d.a(3);
        try {
            try {
                try {
                    try {
                        a8.a();
                        num = (String) p64.j(this.f8269a.b(), new ci3(this, context), g74.a()).get(z7 ? this.f8275g : this.f8273e, TimeUnit.MILLISECONDS);
                    } catch (TimeoutException e8) {
                        a8.b(e8);
                        num = z7 ? ((po3) this.f8274f.b()).a(true, this.f8276h) : Integer.toString(17);
                    }
                } catch (InterruptedException e9) {
                    Thread.currentThread().interrupt();
                    a8.b(e9);
                    num = "";
                }
            } catch (ExecutionException e10) {
                e = e10;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                a8.b(e);
                num = Integer.toString(3);
            } catch (Throwable th) {
                a8.b(th);
                throw th;
            }
            a8.c();
            return num;
        } catch (Throwable th2) {
            a8.c();
            throw th2;
        }
    }

    public final String c(Context context, String str, View view, Activity activity) {
        String num;
        lu3 a8 = this.f8272d.a(4);
        try {
            try {
                a8.a();
                try {
                    num = (String) p64.j(this.f8269a.b(), new di3(this, context, null, view, activity), g74.a()).get(this.f8273e, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e8) {
                    e = e8;
                    InterruptedException interruptedException = e;
                    Thread.currentThread().interrupt();
                    a8.b(interruptedException);
                    num = "";
                    a8.c();
                    return num;
                } catch (ExecutionException e9) {
                    e = e9;
                    Throwable th = e;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    a8.b(th);
                    num = Integer.toString(3);
                    a8.c();
                    return num;
                } catch (TimeoutException e10) {
                    e = e10;
                    a8.b(e);
                    num = Integer.toString(17);
                    a8.c();
                    return num;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    a8.b(th3);
                    throw th3;
                }
            } catch (Throwable th4) {
                a8.c();
                throw th4;
            }
        } catch (InterruptedException e11) {
            e = e11;
        } catch (ExecutionException e12) {
            e = e12;
        } catch (TimeoutException e13) {
            e = e13;
        } catch (Throwable th5) {
            th = th5;
        }
        a8.c();
        return num;
    }

    public final String d(Context context, String str, View view, Activity activity) {
        String num;
        lu3 a8 = this.f8272d.a(5);
        try {
            try {
                a8.a();
                try {
                    num = (String) p64.j(this.f8269a.b(), new ei3(this, context, str, view, null), g74.a()).get(this.f8273e, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e8) {
                    e = e8;
                    InterruptedException interruptedException = e;
                    Thread.currentThread().interrupt();
                    a8.b(interruptedException);
                    num = "";
                    a8.c();
                    return num;
                } catch (ExecutionException e9) {
                    e = e9;
                    Throwable th = e;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    a8.b(th);
                    num = Integer.toString(3);
                    a8.c();
                    return num;
                } catch (TimeoutException e10) {
                    e = e10;
                    a8.b(e);
                    num = Integer.toString(17);
                    a8.c();
                    return num;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    a8.b(th3);
                    throw th3;
                }
            } catch (Throwable th4) {
                a8.c();
                throw th4;
            }
        } catch (InterruptedException e11) {
            e = e11;
        } catch (ExecutionException e12) {
            e = e12;
        } catch (TimeoutException e13) {
            e = e13;
        } catch (Throwable th5) {
            th = th5;
        }
        a8.c();
        return num;
    }

    public final void e(List list) {
        this.f8271c.a(list);
    }

    public final void f(InputEvent inputEvent) {
        this.f8270b.e(inputEvent);
    }

    final /* synthetic */ jl3 g() {
        return this.f8270b;
    }

    public final int h() {
        return this.f8270b.h();
    }
}
