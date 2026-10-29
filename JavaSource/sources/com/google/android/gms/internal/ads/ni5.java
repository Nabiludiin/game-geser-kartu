package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;
import java.util.Objects;

/* compiled from: MyApplication */
public final class ni5 {

    /* renamed from: d, reason: collision with root package name */
    public static final ni5 f12747d;

    /* renamed from: a, reason: collision with root package name */
    public final String f12748a;

    /* renamed from: b, reason: collision with root package name */
    private final li5 f12749b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f12750c;

    static {
        new ni5("");
        f12747d = new ni5("preload");
    }

    public ni5(String str) {
        this.f12748a = str;
        this.f12749b = Build.VERSION.SDK_INT >= 31 ? new li5() : null;
        this.f12750c = new Object();
    }

    public final synchronized LogSessionId a() {
        li5 li5Var;
        li5Var = this.f12749b;
        if (li5Var == null) {
            throw null;
        }
        return li5Var.f11621a;
    }

    public final synchronized void b(LogSessionId logSessionId) {
        LogSessionId logSessionId2;
        boolean equals;
        li5 li5Var = this.f12749b;
        if (li5Var == null) {
            throw null;
        }
        LogSessionId logSessionId3 = li5Var.f11621a;
        logSessionId2 = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId3.equals(logSessionId2);
        rx3.h(equals);
        li5Var.f11621a = logSessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni5)) {
            return false;
        }
        ni5 ni5Var = (ni5) obj;
        return Objects.equals(this.f12748a, ni5Var.f12748a) && Objects.equals(this.f12749b, ni5Var.f12749b) && Objects.equals(this.f12750c, ni5Var.f12750c);
    }

    public final int hashCode() {
        return Objects.hash(this.f12748a, this.f12749b, this.f12750c);
    }
}
