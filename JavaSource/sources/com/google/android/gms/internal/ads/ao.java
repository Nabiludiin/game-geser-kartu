package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: MyApplication */
public final class ao {

    /* renamed from: a, reason: collision with root package name */
    private List f5168a = Collections.EMPTY_LIST;

    public final void a(List list) {
        this.f5168a = new ArrayList(list);
    }

    public final List b() {
        List list = this.f5168a;
        this.f5168a = Collections.EMPTY_LIST;
        return list;
    }
}
