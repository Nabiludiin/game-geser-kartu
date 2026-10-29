package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: MyApplication */
public final class g60 implements y50 {

    /* renamed from: d, reason: collision with root package name */
    static final Map f8662d = com.google.android.gms.common.util.f.d(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: a, reason: collision with root package name */
    private final r2.b f8663a;

    /* renamed from: b, reason: collision with root package name */
    private final ge0 f8664b;

    /* renamed from: c, reason: collision with root package name */
    private final ne0 f8665c;

    public g60(r2.b bVar, ge0 ge0Var, ne0 ne0Var) {
        this.f8663a = bVar;
        this.f8664b = ge0Var;
        this.f8665c = ne0Var;
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        mr0 mr0Var = (mr0) obj;
        int intValue = ((Integer) f8662d.get((String) map.get("a"))).intValue();
        int i7 = 6;
        if (intValue != 5) {
            if (intValue != 7) {
                r2.b bVar = this.f8663a;
                if (!bVar.b()) {
                    bVar.c(null);
                    return;
                }
                if (intValue == 1) {
                    this.f8664b.h(map);
                    return;
                }
                if (intValue == 3) {
                    new je0(mr0Var, map).h();
                    return;
                }
                if (intValue == 4) {
                    new de0(mr0Var, map).h();
                    return;
                }
                if (intValue != 5) {
                    if (intValue == 6) {
                        this.f8664b.i(true);
                        return;
                    } else if (intValue != 7) {
                        int i8 = v2.n1.f26802b;
                        w2.p.e("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.f8665c.d();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean parseBoolean = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (mr0Var == null) {
            int i9 = v2.n1.f26802b;
            w2.p.f("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i7 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i7 = parseBoolean ? -1 : 14;
        }
        mr0Var.J0(i7);
    }
}
