package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class cc0 implements y2.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ qb0 f6362a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y2.a f6363b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ lc0 f6364c;

    cc0(lc0 lc0Var, qb0 qb0Var, y2.a aVar) {
        this.f6362a = qb0Var;
        this.f6363b = aVar;
        Objects.requireNonNull(lc0Var);
        this.f6364c = lc0Var;
    }

    @Override // y2.d
    public final void a(k2.b bVar) {
        try {
            String canonicalName = this.f6363b.getClass().getCanonicalName();
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
            qb0 qb0Var = this.f6362a;
            qb0Var.i1(bVar.d());
            qb0Var.a8(bVar.a(), bVar.c());
            qb0Var.b0(bVar.a());
        } catch (RemoteException e8) {
            w2.p.d("", e8);
        }
    }
}
