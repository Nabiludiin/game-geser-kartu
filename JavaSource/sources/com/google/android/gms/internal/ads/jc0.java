package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class jc0 implements y2.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ qb0 f10478a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ lc0 f10479b;

    jc0(lc0 lc0Var, qb0 qb0Var) {
        this.f10478a = qb0Var;
        Objects.requireNonNull(lc0Var);
        this.f10479b = lc0Var;
    }

    @Override // y2.d
    public final void a(k2.b bVar) {
        try {
            String canonicalName = this.f10479b.n8().getClass().getCanonicalName();
            int a8 = bVar.a();
            String c8 = bVar.c();
            String b8 = bVar.b();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(a8).length() + 17 + String.valueOf(c8).length() + 16 + String.valueOf(b8).length());
            sb.append(canonicalName);
            sb.append("failed to load mediation ad: ErrorCode = ");
            sb.append(a8);
            sb.append(". ErrorMessage = ");
            sb.append(c8);
            sb.append(". ErrorDomain = ");
            sb.append(b8);
            w2.p.a(sb.toString());
            qb0 qb0Var = this.f10478a;
            qb0Var.i1(bVar.d());
            qb0Var.a8(bVar.a(), bVar.c());
            qb0Var.b0(bVar.a());
        } catch (RemoteException e8) {
            w2.p.d("", e8);
        }
    }
}
