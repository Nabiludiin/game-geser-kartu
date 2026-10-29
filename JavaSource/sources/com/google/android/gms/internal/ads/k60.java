package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class k60 implements u2.b {

    /* renamed from: a, reason: collision with root package name */
    boolean f10901a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f10902b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ s2.a f10903c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Map f10904d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Map f10905e;

    k60(m60 m60Var, boolean z7, s2.a aVar, Map map, Map map2) {
        this.f10902b = z7;
        this.f10903c = aVar;
        this.f10904d = map;
        this.f10905e = map2;
        Objects.requireNonNull(m60Var);
        this.f10901a = false;
    }

    @Override // u2.b
    public final void r0(boolean z7) {
        if (this.f10901a) {
            return;
        }
        if (z7 && this.f10902b) {
            ((pi1) this.f10903c).z();
        }
        this.f10901a = true;
        Map map = this.f10904d;
        map.put((String) this.f10905e.get("event_id"), Boolean.valueOf(z7));
        ((q80) this.f10903c).B("openIntentAsync", map);
    }

    @Override // u2.b
    public final void b(int i7) {
    }
}
