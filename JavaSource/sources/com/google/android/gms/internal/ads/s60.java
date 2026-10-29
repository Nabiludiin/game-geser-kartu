package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: MyApplication */
public final class s60 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    private final r60 f15473a;

    public s60(r60 r60Var) {
        this.f15473a = r60Var;
    }

    public static void b(mr0 mr0Var, r60 r60Var) {
        mr0Var.O0("/reward", new s60(r60Var));
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final void a(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.f15473a.a();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.f15473a.d();
                    return;
                }
                return;
            }
        }
        di0 di0Var = null;
        try {
            int parseInt = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                di0Var = new di0(str2, parseInt);
            }
        } catch (NumberFormatException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.g("Unable to parse reward amount.", e8);
        }
        this.f15473a.d0(di0Var);
    }
}
