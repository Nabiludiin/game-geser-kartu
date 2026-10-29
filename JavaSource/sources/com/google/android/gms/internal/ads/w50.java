package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
final /* synthetic */ class w50 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ w50 f18037a = new w50();

    private /* synthetic */ w50() {
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final /* synthetic */ void a(Object obj, Map map) {
        at0 at0Var = (at0) obj;
        y50 y50Var = x50.f18542a;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            int i7 = v2.n1.f26802b;
            w2.p.f("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = at0Var.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z7 = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z7 = false;
            }
            Boolean valueOf = Boolean.valueOf(z7);
            hashMap.put(str2, valueOf);
            StringBuilder sb = new StringBuilder(str2.length() + 14 + valueOf.toString().length());
            sb.append("/canOpenURLs;");
            sb.append(str2);
            sb.append(";");
            sb.append(valueOf);
            v2.n1.k(sb.toString());
        }
        ((q80) at0Var).B("openableURLs", hashMap);
    }
}
