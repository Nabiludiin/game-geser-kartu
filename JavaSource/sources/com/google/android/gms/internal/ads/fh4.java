package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: MyApplication */
public final class fh4 {

    /* renamed from: b, reason: collision with root package name */
    public static final fh4 f8261b = new eh4().a();

    /* renamed from: a, reason: collision with root package name */
    private final Map f8262a;

    public final boolean a() {
        return this.f8262a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fh4) {
            return this.f8262a.equals(((fh4) obj).f8262a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8262a.hashCode();
    }

    public final String toString() {
        return this.f8262a.toString();
    }
}
