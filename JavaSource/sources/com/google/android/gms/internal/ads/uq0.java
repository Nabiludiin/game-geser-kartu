package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
public final class uq0 extends sn0 implements kb4, qd5 {
    public static final /* synthetic */ int M = 0;
    private boolean A;
    private rn0 B;
    private int C;
    private int D;
    private long E;
    private final String F;
    private final int G;
    private Integer I;
    private final ArrayList J;
    private volatile fq0 K;

    /* renamed from: s, reason: collision with root package name */
    private final Context f16888s;

    /* renamed from: t, reason: collision with root package name */
    private final cq0 f16889t;

    /* renamed from: u, reason: collision with root package name */
    private final xt5 f16890u;

    /* renamed from: v, reason: collision with root package name */
    private final ao0 f16891v;

    /* renamed from: w, reason: collision with root package name */
    private final WeakReference f16892w;

    /* renamed from: x, reason: collision with root package name */
    private final hr5 f16893x;

    /* renamed from: y, reason: collision with root package name */
    private k95 f16894y;

    /* renamed from: z, reason: collision with root package name */
    private ByteBuffer f16895z;
    private final Object H = new Object();
    private final Set L = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e3, code lost:
    
        if (((java.lang.Boolean) s2.b0.c().d(com.google.android.gms.internal.ads.uy.f17111h2)).booleanValue() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e6, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ef, code lost:
    
        if (r5.f5180l == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f1, code lost:
    
        r6 = new com.google.android.gms.internal.ads.iq0(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0108, code lost:
    
        if (r5.f5177i == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010a, code lost:
    
        r5 = new com.google.android.gms.internal.ads.lq0(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0112, code lost:
    
        r4 = r3.f16895z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0114, code lost:
    
        if (r4 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011a, code lost:
    
        if (r4.limit() <= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011c, code lost:
    
        r4 = new byte[r3.f16895z.limit()];
        r3.f16895z.get(r4);
        r5 = new com.google.android.gms.internal.ads.oq0(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0111, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f9, code lost:
    
        if (r5.f5176h <= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fb, code lost:
    
        r6 = new com.google.android.gms.internal.ads.kq0(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0101, code lost:
    
        r6 = new com.google.android.gms.internal.ads.jq0(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ea, code lost:
    
        if (r5.f5177i == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public uq0(android.content.Context r4, com.google.android.gms.internal.ads.ao0 r5, com.google.android.gms.internal.ads.bo0 r6, java.lang.Integer r7) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uq0.<init>(android.content.Context, com.google.android.gms.internal.ads.ao0, com.google.android.gms.internal.ads.bo0, java.lang.Integer):void");
    }

    private final boolean d0() {
        return this.K != null && this.K.l();
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final long A() {
        if (d0() && this.K.m()) {
            return Math.min(this.C, this.K.q());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final long B() {
        if (d0()) {
            return this.K.y();
        }
        synchronized (this.H) {
            while (true) {
                ArrayList arrayList = this.J;
                if (!arrayList.isEmpty()) {
                    long j7 = this.E;
                    Map i7 = ((g64) arrayList.remove(0)).i();
                    long j8 = 0;
                    if (i7 != null) {
                        Iterator it = i7.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zw3.e("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j8 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.E = j7 + j8;
                }
            }
        }
        return this.E;
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final int C() {
        return this.D;
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final void D(boolean z7) {
        if (this.f16894y == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            this.f16894y.D();
            if (i7 >= 2) {
                return;
            }
            xt5 xt5Var = this.f16890u;
            ys5 d8 = xt5Var.l().d();
            d8.H(i7, !z7);
            xt5Var.m(d8);
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final long E() {
        return this.f16894y.z();
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final long F() {
        return this.C;
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final Integer K() {
        return this.I;
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final void L(Integer num) {
        this.I = num;
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final void M(Uri[] uriArr, String str) {
        N(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final void N(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z7) {
        aq5 qq5Var;
        if (this.f16894y != null) {
            this.f16895z = byteBuffer;
            this.A = z7;
            int length = uriArr.length;
            if (length == 1) {
                qq5Var = W(uriArr[0]);
            } else {
                aq5[] aq5VarArr = new aq5[length];
                for (int i7 = 0; i7 < uriArr.length; i7++) {
                    aq5VarArr[i7] = W(uriArr[i7]);
                }
                qq5Var = new qq5(false, false, new ip5(), aq5VarArr);
            }
            this.f16894y.c(qq5Var);
            this.f16894y.f();
            sn0.J().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final void O(rn0 rn0Var) {
        this.B = rn0Var;
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final void P() {
        k95 k95Var = this.f16894y;
        if (k95Var != null) {
            k95Var.e(this);
            this.f16894y.M();
            this.f16894y = null;
            sn0.J().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final void Q(Surface surface, boolean z7) {
        k95 k95Var = this.f16894y;
        if (k95Var != null) {
            k95Var.N(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final void R(float f8, boolean z7) {
        k95 k95Var = this.f16894y;
        if (k95Var != null) {
            k95Var.I(f8);
        }
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final void S() {
        this.f16894y.q();
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final void T(long j7) {
        this.f16894y.b(j7);
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final void U(int i7) {
        this.f16889t.m(i7);
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final void V(int i7) {
        this.f16889t.n(i7);
    }

    final aq5 W(Uri uri) {
        pu5 pu5Var = new pu5();
        pu5Var.b(uri);
        j9 c8 = pu5Var.c();
        hr5 hr5Var = this.f16893x;
        hr5Var.a(this.f16891v.f5174f);
        return hr5Var.b(c8);
    }

    final /* synthetic */ yl3 X(String str, boolean z7) {
        uq0 uq0Var = true != z7 ? null : this;
        ao0 ao0Var = this.f16891v;
        return new xq0(str, uq0Var, ao0Var.f5172d, ao0Var.f5173e, ao0Var.f5181m, ao0Var.f5182n);
    }

    final /* synthetic */ yl3 Y(String str, boolean z7) {
        ht3 ht3Var = new ht3();
        ht3Var.b(str);
        ht3Var.f(true != z7 ? null : this);
        ao0 ao0Var = this.f16891v;
        ht3Var.c(ao0Var.f5172d);
        ht3Var.d(ao0Var.f5173e);
        ht3Var.e(true);
        return ht3Var.a();
    }

    final /* synthetic */ yl3 Z(String str, boolean z7) {
        uq0 uq0Var = true != z7 ? null : this;
        ao0 ao0Var = this.f16891v;
        bq0 bq0Var = new bq0(str, uq0Var, ao0Var.f5172d, ao0Var.f5173e, ao0Var.f5176h);
        this.L.add(new WeakReference(bq0Var));
        return bq0Var;
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public final void a(nd5 nd5Var, int i7) {
        rn0 rn0Var = this.B;
        if (rn0Var != null) {
            rn0Var.N(i7);
        }
    }

    final /* synthetic */ yl3 a0(wk3 wk3Var) {
        yl3 a8 = wk3Var.a();
        dq0 dq0Var = new dq0() { // from class: com.google.android.gms.internal.ads.sq0
            @Override // com.google.android.gms.internal.ads.dq0
            public final /* synthetic */ void a(boolean z7, long j7) {
                uq0.this.c0(z7, j7);
            }
        };
        return new fq0(this.f16888s, a8, this.F, this.G, this, dq0Var);
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public final void b(nd5 nd5Var, eq5 eq5Var, iw4 iw4Var) {
        bo0 bo0Var = (bo0) this.f16892w.get();
        if (!((Boolean) s2.b0.c().d(uy.f17111h2)).booleanValue() || bo0Var == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(eq5Var.f7786z));
        hashMap.put("bitRate", String.valueOf(eq5Var.f7770j));
        int i7 = eq5Var.f7782v;
        int i8 = eq5Var.f7783w;
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 1 + String.valueOf(i8).length());
        sb.append(i7);
        sb.append("x");
        sb.append(i8);
        hashMap.put("resolution", sb.toString());
        String str = eq5Var.f7774n;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        String str2 = eq5Var.f7775o;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        String str3 = eq5Var.f7771k;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        bo0Var.B("onMetadataEvent", hashMap);
    }

    final /* synthetic */ pc5[] b0(Handler handler, z0 z0Var, vj5 vj5Var, ds5 ds5Var, vo5 vo5Var) {
        fo5 fo5Var = fo5.f8371a;
        Context context = this.f16888s;
        wl5 wl5Var = new wl5(context, new an5(context, null, null), fo5Var, false, handler, vj5Var, new mk5(context).a());
        n nVar = new n(context);
        nVar.a(fo5Var);
        nVar.b(handler);
        nVar.c(z0Var);
        return new pc5[]{wl5Var, nVar.d()};
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public final void c(nd5 nd5Var, te0 te0Var) {
        rn0 rn0Var = this.B;
        if (rn0Var != null) {
            rn0Var.c(te0Var.f16149a, te0Var.f16150b);
        }
    }

    final /* synthetic */ void c0(boolean z7, long j7) {
        rn0 rn0Var = this.B;
        if (rn0Var != null) {
            rn0Var.f(z7, j7);
        }
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public final void e(nd5 nd5Var, eq5 eq5Var, iw4 iw4Var) {
        bo0 bo0Var = (bo0) this.f16892w.get();
        if (!((Boolean) s2.b0.c().d(uy.f17111h2)).booleanValue() || bo0Var == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = eq5Var.f7774n;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        String str2 = eq5Var.f7775o;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        String str3 = eq5Var.f7771k;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        bo0Var.B("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public final void f(nd5 nd5Var, xj xjVar) {
        rn0 rn0Var = this.B;
        if (rn0Var != null) {
            rn0Var.e("onPlayerError", xjVar);
        }
    }

    public final void finalize() {
        sn0.I().decrementAndGet();
        if (v2.n1.m()) {
            v2.n1.k("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public /* synthetic */ void g(nd5 nd5Var, hv4 hv4Var) {
        pd5.d(this, nd5Var, hv4Var);
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public /* synthetic */ void h(nd5 nd5Var, tp5 tp5Var) {
        pd5.b(this, nd5Var, tp5Var);
    }

    @Override // com.google.android.gms.internal.ads.kb4
    public final void i(yl3 yl3Var, cq3 cq3Var, boolean z7, int i7) {
        this.C += i7;
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public final void j(nd5 nd5Var, int i7, long j7) {
        this.D += i7;
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public /* synthetic */ void k(nd5 nd5Var, lq lqVar, lq lqVar2, int i7) {
        pd5.a(this, nd5Var, lqVar, lqVar2, i7);
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public /* synthetic */ void m(nd5 nd5Var, int i7, long j7, long j8) {
        pd5.c(this, nd5Var, i7, j7, j8);
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public final void n(nd5 nd5Var, Object obj, long j7) {
        rn0 rn0Var = this.B;
        if (rn0Var != null) {
            rn0Var.Q();
        }
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public /* synthetic */ void o(mr mrVar, od5 od5Var) {
        pd5.e(this, mrVar, od5Var);
    }

    @Override // com.google.android.gms.internal.ads.kb4
    public final void p(yl3 yl3Var, cq3 cq3Var, boolean z7) {
        if (yl3Var instanceof g64) {
            synchronized (this.H) {
                this.J.add((g64) yl3Var);
            }
        } else if (yl3Var instanceof fq0) {
            this.K = (fq0) yl3Var;
            final bo0 bo0Var = (bo0) this.f16892w.get();
            if (((Boolean) s2.b0.c().d(uy.f17111h2)).booleanValue() && bo0Var != null && this.K.j()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.K.m()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.K.p()));
                v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.tq0
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        int i7 = uq0.M;
                        bo0.this.B("onGcacheInfoEvent", hashMap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public final void q(nd5 nd5Var, op5 op5Var, tp5 tp5Var, IOException iOException, boolean z7) {
        rn0 rn0Var = this.B;
        if (rn0Var != null) {
            if (this.f16891v.f5178j) {
                rn0Var.b("onLoadException", iOException);
            } else {
                rn0Var.e("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final void r(int i7) {
        Iterator it = this.L.iterator();
        while (it.hasNext()) {
            bq0 bq0Var = (bq0) ((WeakReference) it.next()).get();
            if (bq0Var != null) {
                bq0Var.P(i7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final boolean s() {
        return this.f16894y != null;
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final int t() {
        return this.f16894y.g();
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final long u() {
        return this.f16894y.t();
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final void v(boolean z7) {
        this.f16894y.J(z7);
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final void w(int i7) {
        this.f16889t.k(i7);
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final void x(int i7) {
        this.f16889t.l(i7);
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final long y() {
        return this.f16894y.r();
    }

    @Override // com.google.android.gms.internal.ads.sn0
    public final long z() {
        if (d0()) {
            return 0L;
        }
        return this.C;
    }

    @Override // com.google.android.gms.internal.ads.kb4
    public final void d(yl3 yl3Var, cq3 cq3Var, boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.kb4
    public final void l(yl3 yl3Var, cq3 cq3Var, boolean z7) {
    }
}
