package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
public final class ck0 {

    /* renamed from: e, reason: collision with root package name */
    public static final ck0 f6475e = new ck0(null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: f, reason: collision with root package name */
    private static final a f6476f = new a(0).b(0);

    /* renamed from: d, reason: collision with root package name */
    private final a[] f6480d;

    /* renamed from: b, reason: collision with root package name */
    public final long f6478b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f6477a = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f6479c = 0;

    static {
        String str = hi2.f9535a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    private ck0(Object obj, a[] aVarArr, long j7, long j8, int i7) {
        this.f6480d = aVarArr;
    }

    public final a a(int i7) {
        return i7 < 0 ? f6476f : this.f6480d[i7];
    }

    public final boolean b(int i7) {
        a(-1);
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ck0.class == obj.getClass() && Arrays.equals(this.f6480d, ((ck0) obj).f6480d);
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.f6480d);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }
}
