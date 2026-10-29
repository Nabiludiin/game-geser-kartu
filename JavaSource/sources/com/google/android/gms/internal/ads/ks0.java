package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class ks0 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ rs0 f11219a;

    ks0(rs0 rs0Var) {
        Objects.requireNonNull(rs0Var);
        this.f11219a = rs0Var;
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                rs0 rs0Var = this.f11219a;
                synchronized (rs0Var) {
                    try {
                        if (rs0Var.A1() != parseInt) {
                            rs0Var.B1(parseInt);
                            rs0Var.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e8) {
                int i7 = v2.n1.f26802b;
                w2.p.g("Exception occurred while getting webview content height", e8);
            }
        }
    }
}
