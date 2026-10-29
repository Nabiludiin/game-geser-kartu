package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
final /* synthetic */ class n50 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ n50 f12572a = new n50();

    private /* synthetic */ n50() {
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final /* synthetic */ void a(Object obj, Map map) {
        at0 at0Var = (at0) obj;
        y50 y50Var = x50.f18542a;
        if (!((Boolean) s2.b0.c().d(uy.e9)).booleanValue()) {
            int i7 = v2.n1.f26802b;
            w2.p.f("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            int i8 = v2.n1.f26802b;
            w2.p.f("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        Boolean valueOf = Boolean.valueOf(at0Var.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        hashMap.put(str, valueOf);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + valueOf.toString().length());
        sb.append("/canOpenApp;");
        sb.append(str);
        sb.append(";");
        sb.append(valueOf);
        v2.n1.k(sb.toString());
        ((q80) at0Var).B("openableApp", hashMap);
    }
}
