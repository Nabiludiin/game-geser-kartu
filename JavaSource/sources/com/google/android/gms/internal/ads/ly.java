package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: MyApplication */
public abstract class ly {

    /* renamed from: a, reason: collision with root package name */
    private final int f11935a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11936b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f11937c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f11938d;

    /* synthetic */ ly(int i7, String str, Object obj, Object obj2, byte[] bArr) {
        this.f11935a = i7;
        this.f11936b = str;
        this.f11937c = obj;
        this.f11938d = obj2;
        s2.b0.b().a(this);
    }

    public static ly h(int i7, String str, int i8, int i9) {
        return new hy(1, str, Integer.valueOf(i8), Integer.valueOf(i9));
    }

    public static ly i(int i7, String str, long j7, long j8) {
        return new iy(1, str, Long.valueOf(j7), Long.valueOf(j8));
    }

    public static ly j(int i7, String str, float f8, float f9) {
        return new jy(1, str, Float.valueOf(f8), Float.valueOf(f9));
    }

    public static ly k(int i7, String str) {
        ky kyVar = new ky(1, "gads:sdk_core_constants:experiment_id", null, null);
        s2.b0.b().b(kyVar);
        return kyVar;
    }

    public static ly l(int i7, String str) {
        ky kyVar = new ky(1, "gads:sdk_core_constants_service:experiment_id", null, null);
        s2.b0.b().c(kyVar);
        return kyVar;
    }

    public abstract Object a(Bundle bundle);

    public abstract void b(SharedPreferences.Editor editor, Object obj);

    protected abstract Object c(JSONObject jSONObject);

    protected abstract Object d(SharedPreferences sharedPreferences);

    public final String e() {
        return this.f11936b;
    }

    public final Object f() {
        return s2.b0.c().b() ? this.f11938d : this.f11937c;
    }

    public final Object g() {
        return s2.b0.c().d(this);
    }

    public final int m() {
        return this.f11935a;
    }
}
