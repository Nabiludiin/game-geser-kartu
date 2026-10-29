package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: MyApplication */
final class fo3 extends io3 {

    /* renamed from: i, reason: collision with root package name */
    private static final Long f8367i = -1L;

    /* renamed from: f, reason: collision with root package name */
    private final jj3 f8368f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f8369g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f8370h;

    fo3(ak akVar, dn3 dn3Var, jj3 jj3Var, Context context, Map map, nu3 nu3Var) {
        super("3U4DEAJT9Pq66npH/ZEsiPizUaU6oaGuzbq27Rp3Iz/R6ssq6OsViFqc+1XsG+SQ", "oHImj5OTIs8LNvX9EwNQkQ3bSJ9XioOM1m8VTLsnF8I=", akVar, dn3Var, nu3Var.a(121));
        this.f8368f = jj3Var;
        this.f8369g = context;
        this.f8370h = map;
    }

    @Override // com.google.android.gms.internal.ads.io3
    protected final void a(Method method, ak akVar) {
        jj3 jj3Var = this.f8368f;
        Object[] objArr = (Object[]) method.invoke("", Integer.valueOf(jj3Var.ordinal()), this.f8369g, ox3.a(this.f8370h.get("up"), Boolean.TRUE));
        objArr.getClass();
        synchronized (akVar) {
            try {
                if (jj3Var == jj3.QUERY) {
                    Object obj = objArr[0];
                    Long l7 = f8367i;
                    akVar.E0(((Long) ox3.a(obj, l7)).longValue());
                    akVar.F0(((Long) ox3.a(objArr[1], l7)).longValue());
                }
                akVar.u0(((Long) objArr[2]).longValue());
                akVar.U(((Long) objArr[3]).longValue());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
