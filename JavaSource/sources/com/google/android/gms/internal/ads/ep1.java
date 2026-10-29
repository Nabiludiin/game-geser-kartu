package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class ep1 {

    /* renamed from: a, reason: collision with root package name */
    private final ku1 f7742a;

    /* renamed from: b, reason: collision with root package name */
    private final xs1 f7743b;

    /* renamed from: c, reason: collision with root package name */
    private final l11 f7744c;

    /* renamed from: d, reason: collision with root package name */
    private final xn1 f7745d;

    public ep1(ku1 ku1Var, xs1 xs1Var, l11 l11Var, xn1 xn1Var) {
        this.f7742a = ku1Var;
        this.f7743b = xs1Var;
        this.f7744c = l11Var;
        this.f7745d = xn1Var;
    }

    public final View a() {
        mr0 a8 = this.f7742a.a(s2.g5.N0(), null, null);
        a8.Z().setVisibility(8);
        a8.O0("/sendMessageToSdk", new y50() { // from class: com.google.android.gms.internal.ads.dp1
            @Override // com.google.android.gms.internal.ads.y50
            public final /* synthetic */ void a(Object obj, Map map) {
                ep1.this.b((mr0) obj, map);
            }
        });
        a8.O0("/adMuted", new y50() { // from class: com.google.android.gms.internal.ads.xo1
            @Override // com.google.android.gms.internal.ads.y50
            public final /* synthetic */ void a(Object obj, Map map) {
                ep1.this.c((mr0) obj, map);
            }
        });
        WeakReference weakReference = new WeakReference(a8);
        y50 y50Var = new y50() { // from class: com.google.android.gms.internal.ads.yo1
            @Override // com.google.android.gms.internal.ads.y50
            public final /* synthetic */ void a(Object obj, final Map map) {
                mr0 mr0Var = (mr0) obj;
                ot0 s02 = mr0Var.s0();
                final ep1 ep1Var = ep1.this;
                s02.g1(new mt0() { // from class: com.google.android.gms.internal.ads.cp1
                    @Override // com.google.android.gms.internal.ads.mt0
                    public final /* synthetic */ void a(boolean z7, int i7, String str, String str2) {
                        ep1.this.f(map, z7, i7, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    mr0Var.loadData(str, "text/html", "UTF-8");
                } else {
                    mr0Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        };
        xs1 xs1Var = this.f7743b;
        xs1Var.h(weakReference, "/loadHtml", y50Var);
        xs1Var.h(new WeakReference(a8), "/showOverlay", new y50() { // from class: com.google.android.gms.internal.ads.zo1
            @Override // com.google.android.gms.internal.ads.y50
            public final /* synthetic */ void a(Object obj, Map map) {
                ep1.this.d((mr0) obj, map);
            }
        });
        xs1Var.h(new WeakReference(a8), "/hideOverlay", new y50() { // from class: com.google.android.gms.internal.ads.bp1
            @Override // com.google.android.gms.internal.ads.y50
            public final /* synthetic */ void a(Object obj, Map map) {
                ep1.this.e((mr0) obj, map);
            }
        });
        return a8.Z();
    }

    final /* synthetic */ void b(mr0 mr0Var, Map map) {
        this.f7743b.f("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void c(mr0 mr0Var, Map map) {
        this.f7745d.r();
    }

    final /* synthetic */ void d(mr0 mr0Var, Map map) {
        int i7 = v2.n1.f26802b;
        w2.p.e("Showing native ads overlay.");
        mr0Var.Z().setVisibility(0);
        this.f7744c.d(true);
    }

    final /* synthetic */ void e(mr0 mr0Var, Map map) {
        int i7 = v2.n1.f26802b;
        w2.p.e("Hiding native ads overlay.");
        mr0Var.Z().setVisibility(8);
        this.f7744c.d(false);
    }

    final /* synthetic */ void f(Map map, boolean z7, int i7, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f7743b.f("sendMessageToNativeJs", hashMap);
    }
}
