package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: MyApplication */
public final class nb3 {

    /* renamed from: a, reason: collision with root package name */
    private final na3 f12662a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f12663b;

    public nb3(na3 na3Var, String str) {
        ArrayList arrayList = new ArrayList();
        this.f12663b = arrayList;
        this.f12662a = na3Var;
        arrayList.add(str);
    }

    public final void a(String str) {
        this.f12663b.add(str);
    }

    public final na3 b() {
        return this.f12662a;
    }

    public final ArrayList c() {
        return this.f12663b;
    }
}
