package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public abstract class x43 {

    /* renamed from: d, reason: collision with root package name */
    private static final a5.d f18533d = p64.a(null);

    /* renamed from: a, reason: collision with root package name */
    private final z64 f18534a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f18535b;

    /* renamed from: c, reason: collision with root package name */
    private final y43 f18536c;

    public x43(z64 z64Var, ScheduledExecutorService scheduledExecutorService, y43 y43Var) {
        this.f18534a = z64Var;
        this.f18535b = scheduledExecutorService;
        this.f18536c = y43Var;
    }

    public final w43 a(Object obj, a5.d dVar) {
        return new w43(this, obj, null, dVar, Collections.singletonList(dVar), dVar, null);
    }

    public final o43 b(Object obj, a5.d... dVarArr) {
        return new o43(this, obj, Arrays.asList(dVarArr), null);
    }

    protected abstract String c(Object obj);

    final /* synthetic */ z64 e() {
        return this.f18534a;
    }

    final /* synthetic */ ScheduledExecutorService f() {
        return this.f18535b;
    }

    final /* synthetic */ y43 g() {
        return this.f18536c;
    }
}
