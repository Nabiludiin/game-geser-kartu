package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
public abstract class sn0 {

    /* renamed from: q, reason: collision with root package name */
    private static final AtomicInteger f15722q = new AtomicInteger(0);

    /* renamed from: r, reason: collision with root package name */
    private static final AtomicInteger f15723r = new AtomicInteger(0);

    public static int G() {
        return f15722q.get();
    }

    public static int H() {
        return f15723r.get();
    }

    protected static AtomicInteger I() {
        return f15722q;
    }

    protected static AtomicInteger J() {
        return f15723r;
    }

    public abstract long A();

    public abstract long B();

    public abstract int C();

    public abstract void D(boolean z7);

    public abstract long E();

    public abstract long F();

    public abstract Integer K();

    public abstract void L(Integer num);

    public abstract void M(Uri[] uriArr, String str);

    public abstract void N(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z7);

    public abstract void O(rn0 rn0Var);

    public abstract void P();

    public abstract void Q(Surface surface, boolean z7);

    public abstract void R(float f8, boolean z7);

    public abstract void S();

    public abstract void T(long j7);

    public abstract void U(int i7);

    public abstract void V(int i7);

    public abstract void r(int i7);

    public abstract boolean s();

    public abstract int t();

    public abstract long u();

    public abstract void v(boolean z7);

    public abstract void w(int i7);

    public abstract void x(int i7);

    public abstract long y();

    public abstract long z();
}
