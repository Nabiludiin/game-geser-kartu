package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class i5 {

    /* renamed from: b, reason: collision with root package name */
    protected static final AtomicReference f22235b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    protected static final AtomicReference f22236c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    protected static final AtomicReference f22237d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    private final t4.l f22238a;

    public i5(t4.l lVar) {
        this.f22238a = lVar;
    }

    private static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        p3.o.m(strArr);
        p3.o.m(strArr2);
        p3.o.m(atomicReference);
        p3.o.a(strArr.length == strArr2.length);
        for (int i7 = 0; i7 < strArr.length; i7++) {
            if (Objects.equals(str, strArr[i7])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i7];
                        if (str2 == null) {
                            str2 = strArr2[i7] + "(" + strArr[i7] + ")";
                            strArr3[i7] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f22238a.a() ? str : g(str, t4.w.f26431c, t4.w.f26429a, f22235b);
    }

    protected final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f22238a.a() ? str : g(str, t4.x.f26434b, t4.x.f26433a, f22236c);
    }

    protected final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f22238a.a()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return g(str, t4.y.f26438b, t4.y.f26437a, f22237d);
        }
        return "experiment_id(" + str + ")";
    }

    protected final String d(g0 g0Var) {
        t4.l lVar = this.f22238a;
        if (!lVar.a()) {
            return g0Var.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(g0Var.f22162s);
        sb.append(",name=");
        sb.append(a(g0Var.f22160q));
        sb.append(",params=");
        e0 e0Var = g0Var.f22161r;
        sb.append(e0Var == null ? null : !lVar.a() ? e0Var.toString() : e(e0Var.R0()));
        return sb.toString();
    }

    protected final String e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f22238a.a()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(b(str));
            sb.append("=");
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? f(new Object[]{obj}) : obj instanceof Object[] ? f((Object[]) obj) : obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    protected final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String e8 = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (e8 != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(e8);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
