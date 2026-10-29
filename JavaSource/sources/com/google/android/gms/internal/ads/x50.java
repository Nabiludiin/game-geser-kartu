package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public abstract class x50 {

    /* renamed from: a, reason: collision with root package name */
    public static final y50 f18542a = w50.f18037a;

    /* renamed from: b, reason: collision with root package name */
    public static final y50 f18543b = n50.f12572a;

    /* renamed from: c, reason: collision with root package name */
    public static final y50 f18544c = o50.f13197a;

    /* renamed from: d, reason: collision with root package name */
    public static final y50 f18545d = new f50();

    /* renamed from: e, reason: collision with root package name */
    public static final y50 f18546e = new g50();

    /* renamed from: f, reason: collision with root package name */
    public static final y50 f18547f = t50.f15976a;

    /* renamed from: g, reason: collision with root package name */
    public static final y50 f18548g = new h50();

    /* renamed from: h, reason: collision with root package name */
    public static final y50 f18549h = new i50();

    /* renamed from: i, reason: collision with root package name */
    public static final y50 f18550i = u50.f16584a;

    /* renamed from: j, reason: collision with root package name */
    public static final y50 f18551j = new j50();

    /* renamed from: k, reason: collision with root package name */
    public static final y50 f18552k = new k50();

    /* renamed from: l, reason: collision with root package name */
    public static final y50 f18553l = new dp0();

    /* renamed from: m, reason: collision with root package name */
    public static final y50 f18554m = new ep0();

    /* renamed from: n, reason: collision with root package name */
    public static final y50 f18555n = new q40();

    /* renamed from: o, reason: collision with root package name */
    public static final q60 f18556o = new q60();

    /* renamed from: p, reason: collision with root package name */
    public static final y50 f18557p = new l50();

    /* renamed from: q, reason: collision with root package name */
    public static final y50 f18558q = new m50();

    /* renamed from: r, reason: collision with root package name */
    public static final y50 f18559r = new r40();

    /* renamed from: s, reason: collision with root package name */
    public static final y50 f18560s = new s40();

    /* renamed from: t, reason: collision with root package name */
    public static final y50 f18561t = new t40();

    /* renamed from: u, reason: collision with root package name */
    public static final y50 f18562u = new u40();

    /* renamed from: v, reason: collision with root package name */
    public static final y50 f18563v = new v40();

    /* renamed from: w, reason: collision with root package name */
    public static final y50 f18564w = new w40();

    /* renamed from: x, reason: collision with root package name */
    public static final y50 f18565x = new x40();

    /* renamed from: y, reason: collision with root package name */
    public static final y50 f18566y = new y40();

    /* renamed from: z, reason: collision with root package name */
    public static final y50 f18567z = new z40();
    public static final y50 A = new b50();
    public static final y50 B = new d50();
    public static final y50 C = new e50();

    public static a5.d a(mr0 mr0Var, String str) {
        Uri parse = Uri.parse(str);
        try {
            fn P = mr0Var.P();
            a13 C0 = mr0Var.C0();
            if (!((Boolean) s2.b0.c().d(uy.Zc)).booleanValue() || C0 == null) {
                if (P != null && P.a(parse)) {
                    parse = P.d(parse, mr0Var.getContext(), mr0Var.Z(), mr0Var.i());
                }
            } else if (P != null && P.a(parse)) {
                parse = C0.a(parse, mr0Var.getContext(), mr0Var.Z(), mr0Var.i());
            }
        } catch (gn unused) {
            String concat = "Unable to append parameter to URL: ".concat(str);
            int i7 = v2.n1.f26802b;
            w2.p.f(concat);
        }
        Map hashMap = new HashMap();
        if (mr0Var.T() != null) {
            hashMap = mr0Var.T().f6195w0;
        }
        final String b8 = lk0.b(parse, mr0Var.getContext(), hashMap);
        long longValue = ((Long) v00.f17303e.e()).longValue();
        if (longValue <= 0 || longValue > 253830000) {
            return p64.a(b8);
        }
        h64 C2 = h64.C(mr0Var.R0());
        p50 p50Var = p50.f13673a;
        z64 z64Var = cm0.f6506g;
        return (h64) p64.g((h64) p64.k((h64) p64.g(C2, Throwable.class, p50Var, z64Var), new hx3() { // from class: com.google.android.gms.internal.ads.q50
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                String str2 = (String) obj;
                y50 y50Var = x50.f18542a;
                String str3 = b8;
                if (str2 != null) {
                    if (((Boolean) v00.f17304f.e()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(str3).getHost();
                        for (int i8 = 0; i8 < 3; i8++) {
                            if (!host.endsWith(strArr[i8])) {
                            }
                        }
                    }
                    String str4 = (String) v00.f17299a.e();
                    String str5 = (String) v00.f17300b.e();
                    if (!TextUtils.isEmpty(str4)) {
                        str3 = str3.replace(str4, str2);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        Uri parse2 = Uri.parse(str3);
                        if (TextUtils.isEmpty(parse2.getQueryParameter(str5))) {
                            return parse2.buildUpon().appendQueryParameter(str5, str2).toString();
                        }
                    }
                }
                return str3;
            }
        }, z64Var), Throwable.class, new hx3() { // from class: com.google.android.gms.internal.ads.r50
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                y50 y50Var = x50.f18542a;
                if (((Boolean) v00.f17307i.e()).booleanValue()) {
                    r2.t.l().i(th, "prepareClickUrl.attestation2");
                }
                return b8;
            }
        }, z64Var);
    }

    public static y50 b(final pi1 pi1Var, final d01 d01Var) {
        return new y50() { // from class: com.google.android.gms.internal.ads.s50
            @Override // com.google.android.gms.internal.ads.y50
            public final /* synthetic */ void a(Object obj, Map map) {
                mr0 mr0Var = (mr0) obj;
                x50.c(map, pi1.this);
                final String str = (String) map.get("u");
                if (str == null) {
                    int i7 = v2.n1.f26802b;
                    w2.p.f("URL missing from click GMSG.");
                    return;
                }
                final d01 d01Var2 = d01Var;
                h64 C2 = h64.C(x50.a(mr0Var, str));
                w54 w54Var = new w54() { // from class: com.google.android.gms.internal.ads.v50
                    @Override // com.google.android.gms.internal.ads.w54
                    public final /* synthetic */ a5.d d(Object obj2) {
                        d01 d01Var3;
                        String str2 = (String) obj2;
                        y50 y50Var = x50.f18542a;
                        return (((Boolean) s2.b0.c().d(uy.cb)).booleanValue() && (d01Var3 = d01.this) != null && d01.c(str)) ? d01Var3.b(str2, s2.z.e()) : p64.a(str2);
                    }
                };
                z64 z64Var = cm0.f6500a;
                p64.r((h64) p64.j(C2, w54Var, z64Var), new c50(mr0Var), z64Var);
            }
        };
    }

    public static void c(Map map, pi1 pi1Var) {
        if (((Boolean) s2.b0.c().d(uy.Mb)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && pi1Var != null) {
            pi1Var.z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(14:(3:10|11|12)|(12:50|51|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:10|11|12|(12:50|51|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:
    
        r7 = v2.n1.f26802b;
        w2.p.d("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cc, code lost:
    
        r2.t.l().i(r0, r8.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void e(com.google.android.gms.internal.ads.at0 r16, java.util.Map r17) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x50.e(com.google.android.gms.internal.ads.at0, java.util.Map):void");
    }
}
