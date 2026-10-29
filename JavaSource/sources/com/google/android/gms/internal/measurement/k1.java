package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: MyApplication */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f21068a = new j1();

    public static SharedPreferences a(Context context, String str, int i7, f1 f1Var) {
        z0.a();
        i1 i1Var = str.equals("") ? new i1() : null;
        if (i1Var != null) {
            return i1Var;
        }
        ThreadLocal threadLocal = f21068a;
        y4.h.d(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(Boolean.TRUE);
            return sharedPreferences;
        } catch (Throwable th) {
            f21068a.set(Boolean.TRUE);
            throw th;
        }
    }
}
