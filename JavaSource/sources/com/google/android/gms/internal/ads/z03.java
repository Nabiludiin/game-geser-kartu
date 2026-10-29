package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: MyApplication */
public final class z03 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f19935a;

    public z03(JSONObject jSONObject) {
        this.f19935a = jSONObject;
    }

    public final String a() {
        if (c() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final boolean b() {
        return this.f19935a.optBoolean((String) s2.b0.c().d(uy.U5), true);
    }

    public final int c() {
        int optInt = this.f19935a.optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
