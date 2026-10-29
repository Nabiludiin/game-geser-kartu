package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
public final class oz0 implements ry0 {

    /* renamed from: a, reason: collision with root package name */
    private final CookieManager f13556a;

    public oz0(Context context) {
        this.f13556a = r2.t.j().a(context);
    }

    @Override // com.google.android.gms.internal.ads.ry0
    public final void a(Map map) {
        CookieManager cookieManager = this.f13556a;
        if (cookieManager == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            cookieManager.setCookie((String) s2.b0.c().d(uy.f17092f1), str);
            return;
        }
        String str2 = (String) s2.b0.c().d(uy.f17092f1);
        String cookie = cookieManager.getCookie(str2);
        if (cookie != null) {
            List e8 = gy3.a(ex3.b(';')).e(cookie);
            for (int i7 = 0; i7 < e8.size(); i7++) {
                Iterator it = gy3.a(ex3.b('=')).d((String) e8.get(i7)).iterator();
                it.getClass();
                if (!it.hasNext()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 70);
                    sb.append("position (0) must be less than the number of elements that remained (");
                    sb.append(0);
                    sb.append(")");
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) s2.b0.c().d(uy.R0))));
            }
        }
    }
}
