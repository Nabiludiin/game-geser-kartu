package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
public final class hi4 {

    /* renamed from: b, reason: collision with root package name */
    private static final hw4 f9547b = hw4.a(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    private final Map f9548a;

    public final Iterable a(byte[] bArr) {
        Map map = this.f9548a;
        List list = (List) map.get(f9547b);
        List list2 = bArr.length >= 5 ? (List) map.get(hw4.b(bArr, 0, 5)) : null;
        return (list == null && list2 == null) ? new ArrayList() : list == null ? list2 : list2 == null ? list : new ei4(this, list2, list);
    }
}
