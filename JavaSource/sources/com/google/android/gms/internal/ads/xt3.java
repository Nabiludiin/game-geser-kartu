package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
public final class xt3 implements it3 {

    /* renamed from: a, reason: collision with root package name */
    private final List f19026a = new ArrayList();

    xt3() {
    }

    public final synchronized void a(List list) {
        List list2 = this.f19026a;
        list2.clear();
        list2.addAll(list);
    }

    @Override // com.google.android.gms.internal.ads.it3
    public final synchronized void d(Map map, Context context, View view) {
        List list = this.f19026a;
        map.put("vst", new ArrayList(list));
        list.clear();
    }

    @Override // com.google.android.gms.internal.ads.it3
    public final void b(Map map) {
    }

    @Override // com.google.android.gms.internal.ads.it3
    public final void c(Map map) {
    }
}
