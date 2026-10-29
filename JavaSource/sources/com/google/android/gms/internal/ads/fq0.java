package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: MyApplication */
public final class fq0 extends ud3 {

    /* renamed from: e, reason: collision with root package name */
    private final Context f8388e;

    /* renamed from: f, reason: collision with root package name */
    private final yl3 f8389f;

    /* renamed from: g, reason: collision with root package name */
    private final dq0 f8390g;

    /* renamed from: h, reason: collision with root package name */
    private final String f8391h;

    /* renamed from: i, reason: collision with root package name */
    private final int f8392i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f8393j;

    /* renamed from: k, reason: collision with root package name */
    private InputStream f8394k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f8395l;

    /* renamed from: m, reason: collision with root package name */
    private Uri f8396m;

    /* renamed from: n, reason: collision with root package name */
    private volatile ut f8397n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f8398o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f8399p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f8400q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f8401r;

    /* renamed from: s, reason: collision with root package name */
    private long f8402s;

    /* renamed from: t, reason: collision with root package name */
    private a5.d f8403t;

    /* renamed from: u, reason: collision with root package name */
    private final AtomicLong f8404u;

    public fq0(Context context, yl3 yl3Var, String str, int i7, kb4 kb4Var, dq0 dq0Var) {
        super(false);
        this.f8388e = context;
        this.f8389f = yl3Var;
        this.f8390g = dq0Var;
        this.f8391h = str;
        this.f8392i = i7;
        this.f8398o = false;
        this.f8399p = false;
        this.f8400q = false;
        this.f8401r = false;
        this.f8402s = 0L;
        this.f8404u = new AtomicLong(-1L);
        this.f8403t = null;
        this.f8393j = ((Boolean) s2.b0.c().d(uy.f17111h2)).booleanValue();
        a(kb4Var);
    }

    private final boolean A() {
        if (!this.f8393j) {
            return false;
        }
        if (!((Boolean) s2.b0.c().d(uy.V4)).booleanValue() || this.f8400q) {
            return ((Boolean) s2.b0.c().d(uy.W4)).booleanValue() && !this.f8401r;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0209  */
    @Override // com.google.android.gms.internal.ads.yl3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(com.google.android.gms.internal.ads.cq3 r15) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fq0.b(com.google.android.gms.internal.ads.cq3):long");
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final Uri d() {
        return this.f8396m;
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final void h() {
        if (!this.f8395l) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.f8395l = false;
        this.f8396m = null;
        boolean z7 = (this.f8393j && this.f8394k == null) ? false : true;
        InputStream inputStream = this.f8394k;
        if (inputStream != null) {
            com.google.android.gms.common.util.l.a(inputStream);
            this.f8394k = null;
        } else {
            this.f8389f.h();
        }
        if (z7) {
            g();
        }
    }

    public final boolean j() {
        return this.f8398o;
    }

    public final boolean l() {
        return this.f8399p;
    }

    public final boolean m() {
        return this.f8400q;
    }

    public final boolean p() {
        return this.f8401r;
    }

    public final long q() {
        return this.f8402s;
    }

    @Override // com.google.android.gms.internal.ads.y95
    public final int r(byte[] bArr, int i7, int i8) {
        if (!this.f8395l) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.f8394k;
        int read = inputStream != null ? inputStream.read(bArr, i7, i8) : this.f8389f.r(bArr, i7, i8);
        if (this.f8393j && this.f8394k == null) {
            return read;
        }
        f(read);
        return read;
    }

    public final long y() {
        if (this.f8397n != null) {
            AtomicLong atomicLong = this.f8404u;
            if (atomicLong.get() != -1) {
                return atomicLong.get();
            }
            synchronized (this) {
                try {
                    if (this.f8403t == null) {
                        this.f8403t = cm0.f6500a.B0(new Callable() { // from class: com.google.android.gms.internal.ads.eq0
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                return fq0.this.z();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f8403t.isDone()) {
                try {
                    this.f8404u.compareAndSet(-1L, ((Long) this.f8403t.get()).longValue());
                    return this.f8404u.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    final /* synthetic */ Long z() {
        return Long.valueOf(r2.t.n().d(this.f8397n));
    }
}
