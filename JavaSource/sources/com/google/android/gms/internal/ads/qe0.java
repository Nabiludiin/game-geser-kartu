package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: MyApplication */
public final class qe0 extends NativeAd {

    /* renamed from: a, reason: collision with root package name */
    private final e40 f14398a;

    /* renamed from: c, reason: collision with root package name */
    private final pe0 f14400c;

    /* renamed from: d, reason: collision with root package name */
    private final NativeAd.a f14401d;

    /* renamed from: b, reason: collision with root package name */
    private final List f14399b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final List f14402e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicLong f14403f = new AtomicLong();

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(3:2|3|(2:5|(5:8|(1:10)(1:17)|(3:12|13|14)(1:16)|15|6)))|(3:19|20|(2:22|(5:25|(1:27)(1:34)|(3:29|30|31)(1:33)|32|23)))|36|37|(7:39|40|41|42|(2:44|45)|47|48)|53|40|41|42|(0)|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b0, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:
    
        w2.p.d("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3 A[Catch: RemoteException -> 0x00b0, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00b0, blocks: (B:42:0x009b, B:44:0x00a3), top: B:41:0x009b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qe0(com.google.android.gms.internal.ads.e40 r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f14399b = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f14402e = r1
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
            r1.<init>()
            r5.f14403f = r1
            r5.f14398a = r6
            r1 = 0
            java.util.List r6 = r6.e()     // Catch: android.os.RemoteException -> L3c
            if (r6 == 0) goto L4f
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L3c
        L27:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L3c
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L3c
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L3c
            if (r3 == 0) goto L3e
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L3c
            com.google.android.gms.internal.ads.l20 r2 = com.google.android.gms.internal.ads.k20.j8(r2)     // Catch: android.os.RemoteException -> L3c
            goto L3f
        L3c:
            r6 = move-exception
            goto L4c
        L3e:
            r2 = r1
        L3f:
            if (r2 == 0) goto L27
            java.util.List r3 = r5.f14399b     // Catch: android.os.RemoteException -> L3c
            com.google.android.gms.internal.ads.pe0 r4 = new com.google.android.gms.internal.ads.pe0     // Catch: android.os.RemoteException -> L3c
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L3c
            r3.add(r4)     // Catch: android.os.RemoteException -> L3c
            goto L27
        L4c:
            w2.p.d(r0, r6)
        L4f:
            com.google.android.gms.internal.ads.e40 r6 = r5.f14398a     // Catch: android.os.RemoteException -> L70
            java.util.List r6 = r6.x()     // Catch: android.os.RemoteException -> L70
            if (r6 == 0) goto L83
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L70
        L5b:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L70
            if (r2 == 0) goto L83
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L70
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L70
            if (r3 == 0) goto L72
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L70
            s2.g2 r2 = s2.f2.j8(r2)     // Catch: android.os.RemoteException -> L70
            goto L73
        L70:
            r6 = move-exception
            goto L80
        L72:
            r2 = r1
        L73:
            if (r2 == 0) goto L5b
            java.util.List r3 = r5.f14402e     // Catch: android.os.RemoteException -> L70
            s2.h2 r4 = new s2.h2     // Catch: android.os.RemoteException -> L70
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L70
            r3.add(r4)     // Catch: android.os.RemoteException -> L70
            goto L5b
        L80:
            w2.p.d(r0, r6)
        L83:
            com.google.android.gms.internal.ads.e40 r6 = r5.f14398a     // Catch: android.os.RemoteException -> L91
            com.google.android.gms.internal.ads.l20 r6 = r6.g()     // Catch: android.os.RemoteException -> L91
            if (r6 == 0) goto L93
            com.google.android.gms.internal.ads.pe0 r2 = new com.google.android.gms.internal.ads.pe0     // Catch: android.os.RemoteException -> L91
            r2.<init>(r6)     // Catch: android.os.RemoteException -> L91
            goto L99
        L91:
            r6 = move-exception
            goto L95
        L93:
            r2 = r1
            goto L99
        L95:
            w2.p.d(r0, r6)
            goto L93
        L99:
            r5.f14400c = r2
            com.google.android.gms.internal.ads.e40 r6 = r5.f14398a     // Catch: android.os.RemoteException -> Lb0
            com.google.android.gms.internal.ads.e20 r6 = r6.m()     // Catch: android.os.RemoteException -> Lb0
            if (r6 == 0) goto Lb4
            com.google.android.gms.internal.ads.oe0 r6 = new com.google.android.gms.internal.ads.oe0     // Catch: android.os.RemoteException -> Lb0
            com.google.android.gms.internal.ads.e40 r2 = r5.f14398a     // Catch: android.os.RemoteException -> Lb0
            com.google.android.gms.internal.ads.e20 r2 = r2.m()     // Catch: android.os.RemoteException -> Lb0
            r6.<init>(r2)     // Catch: android.os.RemoteException -> Lb0
            r1 = r6
            goto Lb4
        Lb0:
            r6 = move-exception
            w2.p.d(r0, r6)
        Lb4:
            r5.f14401d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qe0.<init>(com.google.android.gms.internal.ads.e40):void");
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String a() {
        try {
            return this.f14398a.f();
        } catch (RemoteException e8) {
            w2.p.d("", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String b() {
        try {
            return this.f14398a.c();
        } catch (RemoteException e8) {
            w2.p.d("", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final k2.u c() {
        s2.y2 y2Var;
        try {
            y2Var = this.f14398a.M();
        } catch (RemoteException e8) {
            w2.p.d("", e8);
            y2Var = null;
        }
        return k2.u.e(y2Var);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    protected final /* bridge */ /* synthetic */ Object d() {
        try {
            return this.f14398a.t();
        } catch (RemoteException e8) {
            w2.p.d("", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    protected final void recordEvent(Bundle bundle) {
        try {
            this.f14398a.f5(bundle);
        } catch (RemoteException e8) {
            w2.p.d("Failed to record native event", e8);
        }
    }
}
