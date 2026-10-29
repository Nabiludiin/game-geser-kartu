package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;

/* compiled from: MyApplication */
public final class t60 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15998a;

    public t60(Context context) {
        this.f15998a = context;
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final void a(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        v2.n1.k("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey("title")) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
        }
        try {
            r2.t.g();
            v2.f2.z(this.f15998a, intent);
        } catch (RuntimeException e8) {
            w2.p.g("Failed to open Share Sheet", e8);
            r2.t.l().i(e8, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
