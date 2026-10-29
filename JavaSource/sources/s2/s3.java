package s2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.b80;
import com.google.android.gms.internal.ads.c80;
import com.google.android.gms.internal.ads.t70;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k2.t;

/* compiled from: MyApplication */
public final class s3 {

    /* renamed from: l, reason: collision with root package name */
    public static final Set f26218l = new HashSet(Arrays.asList(k2.c.APP_OPEN_AD, k2.c.INTERSTITIAL, k2.c.REWARDED));

    /* renamed from: m, reason: collision with root package name */
    private static s3 f26219m;

    /* renamed from: a, reason: collision with root package name */
    private n3 f26220a;

    /* renamed from: b, reason: collision with root package name */
    private x3 f26221b;

    /* renamed from: c, reason: collision with root package name */
    private m3 f26222c;

    /* renamed from: j, reason: collision with root package name */
    private z1 f26229j;

    /* renamed from: d, reason: collision with root package name */
    private final Object f26223d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Object f26224e = new Object();

    /* renamed from: g, reason: collision with root package name */
    private boolean f26226g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f26227h = false;

    /* renamed from: i, reason: collision with root package name */
    private final Object f26228i = new Object();

    /* renamed from: k, reason: collision with root package name */
    private k2.t f26230k = new t.a().a();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList f26225f = new ArrayList();

    private s3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static q2.b a(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t70 t70Var = (t70) it.next();
            hashMap.put(t70Var.f16007q, new b80(t70Var.f16008r ? q2.a.READY : q2.a.NOT_READY, t70Var.f16010t, t70Var.f16009s));
        }
        return new c80(hashMap);
    }

    private final void b(k2.t tVar) {
        try {
            this.f26229j.m7(new o4(tVar));
        } catch (RemoteException e8) {
            w2.p.d("Unable to set request configuration parcel.", e8);
        }
    }

    private final void c(Context context) {
        if (this.f26229j == null) {
            this.f26229j = (z1) new t(z.b(), context).d(context, false);
        }
    }

    private final void d(String str) {
        try {
            this.f26229j.c();
            this.f26229j.b5(null, w3.b.C1(null));
        } catch (RemoteException e8) {
            w2.p.g("MobileAdsSettingManager initialization failed", e8);
        }
    }

    public static s3 e() {
        s3 s3Var;
        synchronized (s3.class) {
            try {
                if (f26219m == null) {
                    f26219m = new s3();
                }
                s3Var = f26219m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return s3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, RemoteException -> 0x0060, blocks: (B:26:0x0034, B:28:0x0054, B:31:0x006d, B:33:0x007e, B:35:0x0090, B:36:0x00d3, B:37:0x00e8, B:40:0x00a0, B:42:0x00ae, B:44:0x00c0, B:45:0x00cb, B:46:0x0062, B:50:0x0068), top: B:25:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, RemoteException -> 0x0060, blocks: (B:26:0x0034, B:28:0x0054, B:31:0x006d, B:33:0x007e, B:35:0x0090, B:36:0x00d3, B:37:0x00e8, B:40:0x00a0, B:42:0x00ae, B:44:0x00c0, B:45:0x00cb, B:46:0x0062, B:50:0x0068), top: B:25:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.content.Context r3, java.lang.String r4, q2.c r5) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.s3.f(android.content.Context, java.lang.String, q2.c):void");
    }

    public final q2.b g() {
        q2.b a8;
        synchronized (this.f26228i) {
            try {
                p3.o.q(this.f26229j != null, "MobileAds.initialize() must be called prior to getting initialization status.");
                try {
                    a8 = a(this.f26229j.m());
                } catch (RemoteException unused) {
                    w2.p.c("Unable to get Initialization status.");
                    return new q2.b() { // from class: s2.p3
                    };
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a8;
    }

    public final k2.t h() {
        return this.f26230k;
    }

    public final void i(String str) {
        synchronized (this.f26228i) {
            p3.o.q(this.f26229j != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.f26229j.i0(str);
            } catch (RemoteException e8) {
                w2.p.d("Unable to set plugin.", e8);
            }
        }
    }

    final /* synthetic */ void j(String str) {
        synchronized (this.f26228i) {
            d(null);
        }
    }

    final /* synthetic */ void k(String str) {
        synchronized (this.f26228i) {
            d(null);
        }
    }

    final /* synthetic */ Object m() {
        return this.f26223d;
    }

    final /* synthetic */ ArrayList n() {
        return this.f26225f;
    }

    final /* synthetic */ void o(boolean z7) {
        this.f26226g = false;
    }

    final /* synthetic */ void p(boolean z7) {
        this.f26227h = true;
    }
}
