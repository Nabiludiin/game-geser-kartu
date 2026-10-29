package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: MyApplication */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public static final Status f4536c = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: a, reason: collision with root package name */
    final Set f4537a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b, reason: collision with root package name */
    private final y f4538b = new y(this);

    final void a(BasePendingResult basePendingResult) {
        this.f4537a.add(basePendingResult);
        basePendingResult.q(this.f4538b);
    }

    public final void b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f4537a.toArray(new BasePendingResult[0])) {
            basePendingResult.q(null);
            if (basePendingResult.p()) {
                this.f4537a.remove(basePendingResult);
            }
        }
    }
}
