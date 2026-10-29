package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.cm0;
import com.google.android.gms.internal.ads.ka1;
import com.google.android.gms.internal.ads.mr0;
import com.google.android.gms.internal.ads.n40;
import com.google.android.gms.internal.ads.p40;
import com.google.android.gms.internal.ads.pi1;
import com.google.android.gms.internal.ads.uy;
import com.google.android.gms.internal.ads.ve0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import r2.l;
import r2.t;
import s2.b0;
import u2.c0;
import u2.e;
import u2.m;
import w3.a;

/* compiled from: MyApplication */
public final class AdOverlayInfoParcel extends q3.a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new a();
    private static final AtomicLong O = new AtomicLong(0);
    private static final ConcurrentHashMap P = new ConcurrentHashMap();
    public final int A;
    public final String B;
    public final w2.a C;
    public final String D;
    public final l E;
    public final n40 F;
    public final String G;
    public final String H;
    public final String I;
    public final ka1 J;
    public final pi1 K;
    public final ve0 L;
    public final boolean M;
    public final long N;

    /* renamed from: q, reason: collision with root package name */
    public final m f4340q;

    /* renamed from: r, reason: collision with root package name */
    public final s2.a f4341r;

    /* renamed from: s, reason: collision with root package name */
    public final c0 f4342s;

    /* renamed from: t, reason: collision with root package name */
    public final mr0 f4343t;

    /* renamed from: u, reason: collision with root package name */
    public final p40 f4344u;

    /* renamed from: v, reason: collision with root package name */
    public final String f4345v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f4346w;

    /* renamed from: x, reason: collision with root package name */
    public final String f4347x;

    /* renamed from: y, reason: collision with root package name */
    public final e f4348y;

    /* renamed from: z, reason: collision with root package name */
    public final int f4349z;

    public AdOverlayInfoParcel(s2.a aVar, c0 c0Var, n40 n40Var, p40 p40Var, e eVar, mr0 mr0Var, boolean z7, int i7, String str, w2.a aVar2, pi1 pi1Var, ve0 ve0Var, boolean z8) {
        this.f4340q = null;
        this.f4341r = aVar;
        this.f4342s = c0Var;
        this.f4343t = mr0Var;
        this.F = n40Var;
        this.f4344u = p40Var;
        this.f4345v = null;
        this.f4346w = z7;
        this.f4347x = null;
        this.f4348y = eVar;
        this.f4349z = i7;
        this.A = 3;
        this.B = str;
        this.C = aVar2;
        this.D = null;
        this.E = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = pi1Var;
        this.L = ve0Var;
        this.M = z8;
        this.N = O.getAndIncrement();
    }

    public static AdOverlayInfoParcel M0(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e8) {
            if (!((Boolean) b0.c().d(uy.Xd)).booleanValue()) {
                return null;
            }
            t.l().i(e8, "AdOverlayInfoParcel.getFromIntent");
            return null;
        }
    }

    private static final IBinder O0(Object obj) {
        if (((Boolean) b0.c().d(uy.Xd)).booleanValue()) {
            return null;
        }
        return w3.b.C1(obj).asBinder();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.q(parcel, 2, this.f4340q, i7, false);
        s2.a aVar = this.f4341r;
        q3.c.k(parcel, 3, O0(aVar), false);
        c0 c0Var = this.f4342s;
        q3.c.k(parcel, 4, O0(c0Var), false);
        mr0 mr0Var = this.f4343t;
        q3.c.k(parcel, 5, O0(mr0Var), false);
        p40 p40Var = this.f4344u;
        q3.c.k(parcel, 6, O0(p40Var), false);
        q3.c.r(parcel, 7, this.f4345v, false);
        q3.c.c(parcel, 8, this.f4346w);
        q3.c.r(parcel, 9, this.f4347x, false);
        e eVar = this.f4348y;
        q3.c.k(parcel, 10, O0(eVar), false);
        q3.c.l(parcel, 11, this.f4349z);
        q3.c.l(parcel, 12, this.A);
        q3.c.r(parcel, 13, this.B, false);
        q3.c.q(parcel, 14, this.C, i7, false);
        q3.c.r(parcel, 16, this.D, false);
        q3.c.q(parcel, 17, this.E, i7, false);
        n40 n40Var = this.F;
        q3.c.k(parcel, 18, O0(n40Var), false);
        q3.c.r(parcel, 19, this.G, false);
        q3.c.r(parcel, 24, this.H, false);
        q3.c.r(parcel, 25, this.I, false);
        ka1 ka1Var = this.J;
        q3.c.k(parcel, 26, O0(ka1Var), false);
        pi1 pi1Var = this.K;
        q3.c.k(parcel, 27, O0(pi1Var), false);
        ve0 ve0Var = this.L;
        q3.c.k(parcel, 28, O0(ve0Var), false);
        q3.c.c(parcel, 29, this.M);
        long j7 = this.N;
        q3.c.o(parcel, 30, j7);
        q3.c.b(parcel, a8);
        if (((Boolean) b0.c().d(uy.Xd)).booleanValue()) {
            P.put(Long.valueOf(j7), new b(aVar, c0Var, mr0Var, n40Var, p40Var, eVar, ka1Var, pi1Var, ve0Var, cm0.f6503d.schedule(new c(j7), ((Integer) b0.c().d(uy.Zd)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(s2.a aVar, c0 c0Var, n40 n40Var, p40 p40Var, e eVar, mr0 mr0Var, boolean z7, int i7, String str, String str2, w2.a aVar2, pi1 pi1Var, ve0 ve0Var) {
        this.f4340q = null;
        this.f4341r = aVar;
        this.f4342s = c0Var;
        this.f4343t = mr0Var;
        this.F = n40Var;
        this.f4344u = p40Var;
        this.f4345v = str2;
        this.f4346w = z7;
        this.f4347x = str;
        this.f4348y = eVar;
        this.f4349z = i7;
        this.A = 3;
        this.B = null;
        this.C = aVar2;
        this.D = null;
        this.E = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = pi1Var;
        this.L = ve0Var;
        this.M = false;
        this.N = O.getAndIncrement();
    }

    public AdOverlayInfoParcel(s2.a aVar, c0 c0Var, e eVar, mr0 mr0Var, int i7, w2.a aVar2, String str, l lVar, String str2, String str3, String str4, ka1 ka1Var, ve0 ve0Var, String str5) {
        this.f4340q = null;
        this.f4341r = null;
        this.f4342s = c0Var;
        this.f4343t = mr0Var;
        this.F = null;
        this.f4344u = null;
        this.f4346w = false;
        if (((Boolean) b0.c().d(uy.f17047a1)).booleanValue()) {
            this.f4345v = null;
            this.f4347x = null;
        } else {
            this.f4345v = str2;
            this.f4347x = str3;
        }
        this.f4348y = null;
        this.f4349z = i7;
        this.A = 1;
        this.B = null;
        this.C = aVar2;
        this.D = str;
        this.E = lVar;
        this.G = str5;
        this.H = null;
        this.I = str4;
        this.J = ka1Var;
        this.K = null;
        this.L = ve0Var;
        this.M = false;
        this.N = O.getAndIncrement();
    }

    public AdOverlayInfoParcel(s2.a aVar, c0 c0Var, e eVar, mr0 mr0Var, boolean z7, int i7, w2.a aVar2, pi1 pi1Var, ve0 ve0Var) {
        this.f4340q = null;
        this.f4341r = aVar;
        this.f4342s = c0Var;
        this.f4343t = mr0Var;
        this.F = null;
        this.f4344u = null;
        this.f4345v = null;
        this.f4346w = z7;
        this.f4347x = null;
        this.f4348y = eVar;
        this.f4349z = i7;
        this.A = 2;
        this.B = null;
        this.C = aVar2;
        this.D = null;
        this.E = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = pi1Var;
        this.L = ve0Var;
        this.M = false;
        this.N = O.getAndIncrement();
    }

    AdOverlayInfoParcel(m mVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z7, String str2, IBinder iBinder5, int i7, int i8, String str3, w2.a aVar, String str4, l lVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z8, long j7) {
        this.f4340q = mVar;
        this.f4345v = str;
        this.f4346w = z7;
        this.f4347x = str2;
        this.f4349z = i7;
        this.A = i8;
        this.B = str3;
        this.C = aVar;
        this.D = str4;
        this.E = lVar;
        this.G = str5;
        this.H = str6;
        this.I = str7;
        this.M = z8;
        this.N = j7;
        if (((Boolean) b0.c().d(uy.Xd)).booleanValue()) {
            b bVar = (b) P.remove(Long.valueOf(j7));
            if (bVar != null) {
                this.f4341r = bVar.a();
                this.f4342s = bVar.b();
                this.f4343t = bVar.c();
                this.F = bVar.d();
                this.f4344u = bVar.e();
                this.J = bVar.g();
                this.K = bVar.h();
                this.L = bVar.i();
                this.f4348y = bVar.f();
                bVar.j().cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.f4341r = (s2.a) w3.b.r0(a.AbstractBinderC0140a.O(iBinder));
        this.f4342s = (c0) w3.b.r0(a.AbstractBinderC0140a.O(iBinder2));
        this.f4343t = (mr0) w3.b.r0(a.AbstractBinderC0140a.O(iBinder3));
        this.F = (n40) w3.b.r0(a.AbstractBinderC0140a.O(iBinder6));
        this.f4344u = (p40) w3.b.r0(a.AbstractBinderC0140a.O(iBinder4));
        this.f4348y = (e) w3.b.r0(a.AbstractBinderC0140a.O(iBinder5));
        this.J = (ka1) w3.b.r0(a.AbstractBinderC0140a.O(iBinder7));
        this.K = (pi1) w3.b.r0(a.AbstractBinderC0140a.O(iBinder8));
        this.L = (ve0) w3.b.r0(a.AbstractBinderC0140a.O(iBinder9));
    }

    public AdOverlayInfoParcel(m mVar, s2.a aVar, c0 c0Var, e eVar, w2.a aVar2, mr0 mr0Var, pi1 pi1Var, String str) {
        this.f4340q = mVar;
        this.f4341r = aVar;
        this.f4342s = c0Var;
        this.f4343t = mr0Var;
        this.F = null;
        this.f4344u = null;
        this.f4345v = null;
        this.f4346w = false;
        this.f4347x = null;
        this.f4348y = eVar;
        this.f4349z = -1;
        this.A = 4;
        this.B = null;
        this.C = aVar2;
        this.D = null;
        this.E = null;
        this.G = str;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = pi1Var;
        this.L = null;
        this.M = false;
        this.N = O.getAndIncrement();
    }

    public AdOverlayInfoParcel(c0 c0Var, mr0 mr0Var, int i7, w2.a aVar) {
        this.f4342s = c0Var;
        this.f4343t = mr0Var;
        this.f4349z = 1;
        this.C = aVar;
        this.f4340q = null;
        this.f4341r = null;
        this.F = null;
        this.f4344u = null;
        this.f4345v = null;
        this.f4346w = false;
        this.f4347x = null;
        this.f4348y = null;
        this.A = 1;
        this.B = null;
        this.D = null;
        this.E = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = false;
        this.N = O.getAndIncrement();
    }

    public AdOverlayInfoParcel(mr0 mr0Var, w2.a aVar, String str, String str2, int i7, ve0 ve0Var) {
        this.f4340q = null;
        this.f4341r = null;
        this.f4342s = null;
        this.f4343t = mr0Var;
        this.F = null;
        this.f4344u = null;
        this.f4345v = null;
        this.f4346w = false;
        this.f4347x = null;
        this.f4348y = null;
        this.f4349z = 14;
        this.A = 5;
        this.B = null;
        this.C = aVar;
        this.D = null;
        this.E = null;
        this.G = str;
        this.H = str2;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = ve0Var;
        this.M = false;
        this.N = O.getAndIncrement();
    }
}
