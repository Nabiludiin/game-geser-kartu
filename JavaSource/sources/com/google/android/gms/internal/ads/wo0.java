package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: MyApplication */
public final class wo0 implements yl3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18342a;

    /* renamed from: b, reason: collision with root package name */
    private final yl3 f18343b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18344c;

    /* renamed from: d, reason: collision with root package name */
    private final int f18345d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f18346e;

    /* renamed from: f, reason: collision with root package name */
    private InputStream f18347f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f18348g;

    /* renamed from: h, reason: collision with root package name */
    private Uri f18349h;

    /* renamed from: i, reason: collision with root package name */
    private volatile ut f18350i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18351j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18352k = false;

    /* renamed from: l, reason: collision with root package name */
    private cq3 f18353l;

    public wo0(Context context, yl3 yl3Var, String str, int i7, kb4 kb4Var, vo0 vo0Var) {
        this.f18342a = context;
        this.f18343b = yl3Var;
        this.f18344c = str;
        this.f18345d = i7;
        new AtomicLong(-1L);
        this.f18346e = ((Boolean) s2.b0.c().d(uy.f17111h2)).booleanValue();
    }

    private final boolean c() {
        if (!this.f18346e) {
            return false;
        }
        if (!((Boolean) s2.b0.c().d(uy.V4)).booleanValue() || this.f18351j) {
            return ((Boolean) s2.b0.c().d(uy.W4)).booleanValue() && !this.f18352k;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final long b(cq3 cq3Var) {
        Long l7;
        if (this.f18348g) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.f18348g = true;
        Uri uri = cq3Var.f6571a;
        this.f18349h = uri;
        this.f18353l = cq3Var;
        this.f18350i = ut.M0(uri);
        rt rtVar = null;
        if (!((Boolean) s2.b0.c().d(uy.S4)).booleanValue()) {
            if (this.f18350i != null) {
                this.f18350i.f16977x = cq3Var.f6575e;
                this.f18350i.f16978y = iy3.a(this.f18344c);
                this.f18350i.f16979z = this.f18345d;
                rtVar = r2.t.n().c(this.f18350i);
            }
            if (rtVar != null && rtVar.a()) {
                this.f18351j = rtVar.Q0();
                this.f18352k = rtVar.O0();
                if (!c()) {
                    this.f18347f = rtVar.M0();
                    return -1L;
                }
            }
        } else if (this.f18350i != null) {
            this.f18350i.f16977x = cq3Var.f6575e;
            this.f18350i.f16978y = iy3.a(this.f18344c);
            this.f18350i.f16979z = this.f18345d;
            if (this.f18350i.f16976w) {
                l7 = (Long) s2.b0.c().d(uy.U4);
            } else {
                l7 = (Long) s2.b0.c().d(uy.T4);
            }
            long longValue = l7.longValue();
            r2.t.o().b();
            r2.t.D();
            Future a8 = fu.a(this.f18342a, this.f18350i);
            try {
                try {
                    gu guVar = (gu) a8.get(longValue, TimeUnit.MILLISECONDS);
                    guVar.c();
                    this.f18351j = guVar.d();
                    this.f18352k = guVar.f();
                    guVar.e();
                    if (!c()) {
                        this.f18347f = guVar.b();
                    }
                } catch (InterruptedException unused) {
                    a8.cancel(false);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused2) {
                    a8.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            r2.t.o().b();
            throw null;
        }
        if (this.f18350i != null) {
            bp3 b8 = cq3Var.b();
            b8.a(Uri.parse(this.f18350i.f16970q));
            this.f18353l = b8.e();
        }
        return this.f18343b.b(this.f18353l);
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final Uri d() {
        return this.f18349h;
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final void h() {
        if (!this.f18348g) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f18348g = false;
        this.f18349h = null;
        InputStream inputStream = this.f18347f;
        if (inputStream == null) {
            this.f18343b.h();
        } else {
            com.google.android.gms.common.util.l.a(inputStream);
            this.f18347f = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.yl3, com.google.android.gms.internal.ads.g64
    public /* synthetic */ Map i() {
        return xl3.a(this);
    }

    @Override // com.google.android.gms.internal.ads.y95
    public final int r(byte[] bArr, int i7, int i8) {
        if (!this.f18348g) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f18347f;
        return inputStream != null ? inputStream.read(bArr, i7, i8) : this.f18343b.r(bArr, i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final void a(kb4 kb4Var) {
    }
}
