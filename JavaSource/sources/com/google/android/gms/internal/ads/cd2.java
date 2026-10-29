package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
final class cd2 implements zn1 {

    /* renamed from: b, reason: collision with root package name */
    private static final List f6382b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    private final Handler f6383a;

    public cd2(Handler handler) {
        this.f6383a = handler;
    }

    static /* synthetic */ void f(bc2 bc2Var) {
        List list = f6382b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bc2Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static bc2 g() {
        bc2 bc2Var;
        List list = f6382b;
        synchronized (list) {
            try {
                bc2Var = list.isEmpty() ? new bc2(null) : (bc2) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bc2Var;
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final boolean F(int i7) {
        return this.f6383a.sendEmptyMessage(i7);
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void P(int i7) {
        this.f6383a.removeMessages(i7);
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final ym1 R(int i7) {
        Handler handler = this.f6383a;
        bc2 g8 = g();
        g8.b(handler.obtainMessage(i7), this);
        return g8;
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final Looper a() {
        return this.f6383a.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final boolean b(int i7) {
        return this.f6383a.hasMessages(1);
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final boolean c(int i7, long j7) {
        return this.f6383a.sendEmptyMessageAtTime(2, j7);
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final boolean d(int i7, int i8) {
        return this.f6383a.sendEmptyMessageDelayed(i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final ym1 e(int i7, int i8, int i9) {
        Handler handler = this.f6383a;
        bc2 g8 = g();
        g8.b(handler.obtainMessage(i7, i8, i9), this);
        return g8;
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void i(Object obj) {
        this.f6383a.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final boolean j(Runnable runnable) {
        return this.f6383a.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final ym1 k(int i7, Object obj) {
        Handler handler = this.f6383a;
        bc2 g8 = g();
        g8.b(handler.obtainMessage(i7, obj), this);
        return g8;
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final boolean l(ym1 ym1Var) {
        return ((bc2) ym1Var).c(this.f6383a);
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final ym1 m(int i7, int i8, int i9, Object obj) {
        Handler handler = this.f6383a;
        bc2 g8 = g();
        g8.b(handler.obtainMessage(31, 0, 0, obj), this);
        return g8;
    }
}
