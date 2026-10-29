package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;

/* compiled from: MyApplication */
public final class ds0 {
    public static final mr0 a(final Context context, final bu0 bu0Var, final String str, final boolean z7, final boolean z8, final fn fnVar, final d00 d00Var, final w2.a aVar, kz kzVar, final r2.n nVar, final r2.a aVar2, final iu iuVar, final c03 c03Var, final f03 f03Var, final i92 i92Var, final a13 a13Var, final rx1 rx1Var) {
        uy.a(context);
        try {
            final kz kzVar2 = null;
            jy3 jy3Var = new jy3(context, bu0Var, str, z7, z8, fnVar, d00Var, aVar, kzVar2, nVar, aVar2, iuVar, c03Var, f03Var, a13Var, rx1Var, i92Var) { // from class: com.google.android.gms.internal.ads.zr0
                private final /* synthetic */ iu A;
                private final /* synthetic */ c03 B;
                private final /* synthetic */ f03 C;
                private final /* synthetic */ a13 D;
                private final /* synthetic */ rx1 E;
                private final /* synthetic */ i92 F;

                /* renamed from: q, reason: collision with root package name */
                private final /* synthetic */ Context f20289q;

                /* renamed from: r, reason: collision with root package name */
                private final /* synthetic */ bu0 f20290r;

                /* renamed from: s, reason: collision with root package name */
                private final /* synthetic */ String f20291s;

                /* renamed from: t, reason: collision with root package name */
                private final /* synthetic */ boolean f20292t;

                /* renamed from: u, reason: collision with root package name */
                private final /* synthetic */ boolean f20293u;

                /* renamed from: v, reason: collision with root package name */
                private final /* synthetic */ fn f20294v;

                /* renamed from: w, reason: collision with root package name */
                private final /* synthetic */ d00 f20295w;

                /* renamed from: x, reason: collision with root package name */
                private final /* synthetic */ w2.a f20296x;

                /* renamed from: y, reason: collision with root package name */
                private final /* synthetic */ r2.n f20297y;

                /* renamed from: z, reason: collision with root package name */
                private final /* synthetic */ r2.a f20298z;

                {
                    this.f20297y = nVar;
                    this.f20298z = aVar2;
                    this.A = iuVar;
                    this.B = c03Var;
                    this.C = f03Var;
                    this.D = a13Var;
                    this.E = rx1Var;
                    this.F = i92Var;
                }

                @Override // com.google.android.gms.internal.ads.jy3
                public final /* synthetic */ Object a() {
                    bu0 bu0Var2 = this.f20290r;
                    String str2 = this.f20291s;
                    boolean z9 = this.f20292t;
                    boolean z10 = this.f20293u;
                    i92 i92Var2 = this.F;
                    rx1 rx1Var2 = this.E;
                    r2.n nVar2 = this.f20297y;
                    r2.a aVar3 = this.f20298z;
                    iu iuVar2 = this.A;
                    c03 c03Var2 = this.B;
                    f03 f03Var2 = this.C;
                    a13 a13Var2 = this.D;
                    fn fnVar2 = this.f20294v;
                    d00 d00Var2 = this.f20295w;
                    w2.a aVar4 = this.f20296x;
                    Context context2 = this.f20289q;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i7 = rs0.f15175s0;
                        js0 js0Var = new js0(new rs0(new tt0(context2), bu0Var2, str2, z9, z10, fnVar2, d00Var2, aVar4, null, nVar2, aVar3, iuVar2, c03Var2, f03Var2, a13Var2), rx1Var2);
                        js0Var.setWebViewClient(r2.t.j().b(js0Var, iuVar2, z10, i92Var2));
                        js0Var.setWebChromeClient(new lr0(js0Var));
                        return js0Var;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object a8 = jy3Var.a();
                StrictMode.setThreadPolicy(threadPolicy);
                return (mr0) a8;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (Throwable th2) {
            throw new cs0("Webview initialization failed.", th2);
        }
    }

    public static final a5.d b(final Context context, final w2.a aVar, final String str, final fn fnVar, final r2.a aVar2, final i92 i92Var, final a13 a13Var, final rx1 rx1Var) {
        return p64.f(new v54() { // from class: com.google.android.gms.internal.ads.bs0
            @Override // com.google.android.gms.internal.ads.v54
            public final /* synthetic */ a5.d a() {
                r2.t.h();
                Context context2 = context;
                bu0 b8 = bu0.b();
                r2.a aVar3 = aVar2;
                iu a8 = iu.a();
                i92 i92Var2 = i92Var;
                a13 a13Var2 = a13Var;
                rx1 rx1Var2 = rx1Var;
                mr0 a9 = ds0.a(context2, b8, "", false, false, fnVar, null, aVar, null, null, aVar3, a8, null, null, i92Var2, a13Var2, rx1Var2);
                final gm0 f8 = gm0.f(a9);
                a9.s0().g1(new mt0() { // from class: com.google.android.gms.internal.ads.as0
                    @Override // com.google.android.gms.internal.ads.mt0
                    public final /* synthetic */ void a(boolean z7, int i7, String str2, String str3) {
                        gm0.this.g();
                    }
                });
                a9.loadUrl(str);
                return f8;
            }
        }, cm0.f6505f);
    }
}
