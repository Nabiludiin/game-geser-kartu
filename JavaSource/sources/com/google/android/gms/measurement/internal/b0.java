package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* compiled from: MyApplication */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    final String f21873a;

    /* renamed from: b, reason: collision with root package name */
    final String f21874b;

    /* renamed from: c, reason: collision with root package name */
    final String f21875c;

    /* renamed from: d, reason: collision with root package name */
    final long f21876d;

    /* renamed from: e, reason: collision with root package name */
    final long f21877e;

    /* renamed from: f, reason: collision with root package name */
    final e0 f21878f;

    b0(w6 w6Var, String str, String str2, String str3, long j7, long j8, Bundle bundle) {
        e0 e0Var;
        p3.o.g(str2);
        p3.o.g(str3);
        this.f21873a = str2;
        this.f21874b = str3;
        this.f21875c = true == TextUtils.isEmpty(str) ? null : str;
        this.f21876d = j7;
        this.f21877e = j8;
        if (j8 != 0 && j8 > j7) {
            w6Var.a().r().b("Event created with reverse previous/current timestamps. appId", p5.x(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            e0Var = new e0(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    w6Var.a().o().a("Param name can't be null");
                    it.remove();
                } else {
                    Object s7 = w6Var.C().s(next, bundle2.get(next));
                    if (s7 == null) {
                        w6Var.a().r().b("Param value can't be null", w6Var.D().b(next));
                        it.remove();
                    } else {
                        w6Var.C().A(bundle2, next, s7);
                    }
                }
            }
            e0Var = new e0(bundle2);
        }
        this.f21878f = e0Var;
    }

    final b0 a(w6 w6Var, long j7) {
        return new b0(w6Var, this.f21875c, this.f21873a, this.f21874b, this.f21876d, j7, this.f21878f);
    }

    public final String toString() {
        String obj = this.f21878f.toString();
        String str = this.f21873a;
        int length = String.valueOf(str).length();
        String str2 = this.f21874b;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + obj.length() + 1);
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    private b0(w6 w6Var, String str, String str2, String str3, long j7, long j8, e0 e0Var) {
        p3.o.g(str2);
        p3.o.g(str3);
        p3.o.m(e0Var);
        this.f21873a = str2;
        this.f21874b = str3;
        this.f21875c = true == TextUtils.isEmpty(str) ? null : str;
        this.f21876d = j7;
        this.f21877e = j8;
        if (j8 != 0 && j8 > j7) {
            w6Var.a().r().c("Event created with reverse previous/current timestamps. appId, name", p5.x(str2), p5.x(str3));
        }
        this.f21878f = e0Var;
    }
}
