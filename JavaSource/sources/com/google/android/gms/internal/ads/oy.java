package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Objects;

/* compiled from: MyApplication */
final class oy implements m10 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SharedPreferences f13550a;

    oy(sy syVar, SharedPreferences sharedPreferences) {
        this.f13550a = sharedPreferences;
        Objects.requireNonNull(syVar);
    }

    @Override // com.google.android.gms.internal.ads.m10
    public final String a(String str, String str2) {
        return this.f13550a.getString(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.m10
    public final Long b(String str, long j7) {
        try {
            return Long.valueOf(this.f13550a.getLong(str, j7));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.f13550a.getInt(str, (int) j7));
        }
    }

    @Override // com.google.android.gms.internal.ads.m10
    public final Double c(String str, double d8) {
        try {
            return Double.valueOf(this.f13550a.getFloat(str, (float) d8));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.f13550a.getString(str, String.valueOf(d8)));
        }
    }

    @Override // com.google.android.gms.internal.ads.m10
    public final Boolean d(String str, boolean z7) {
        try {
            return Boolean.valueOf(this.f13550a.getBoolean(str, z7));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.f13550a.getString(str, String.valueOf(z7)));
        }
    }
}
