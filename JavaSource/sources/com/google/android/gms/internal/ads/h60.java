package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: MyApplication */
public final class h60 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    private final vy1 f9350a;

    public h60(vy1 vy1Var) {
        this.f9350a = vy1Var;
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final void a(Object obj, Map map) {
        if (map == null || !map.containsKey("id") || TextUtils.isEmpty((CharSequence) map.get("id")) || !map.containsKey("event_type") || TextUtils.isEmpty((CharSequence) map.get("event_type"))) {
            v2.n1.k("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
            return;
        }
        try {
            this.f9350a.a(Long.parseLong((String) map.get("id")), Integer.parseInt((String) map.get("event_type")), r2.t.o().a());
        } catch (NumberFormatException e8) {
            v2.n1.l("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e8);
        }
    }
}
