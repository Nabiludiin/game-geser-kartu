package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class bj4 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f5830a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f5831b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f5832c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f5833d;

    /* synthetic */ bj4(yi4 yi4Var, byte[] bArr) {
        this.f5830a = new HashMap(yi4Var.e());
        this.f5831b = new HashMap(yi4Var.f());
        this.f5832c = new HashMap(yi4Var.g());
        this.f5833d = new HashMap(yi4Var.h());
    }

    public final boolean a(xi4 xi4Var) {
        return this.f5831b.containsKey(new zi4(xi4Var.getClass(), xi4Var.e(), null));
    }

    public final b84 b(xi4 xi4Var, w84 w84Var) {
        zi4 zi4Var = new zi4(xi4Var.getClass(), xi4Var.e(), null);
        Map map = this.f5831b;
        if (map.containsKey(zi4Var)) {
            return ((sg4) map.get(zi4Var)).a(xi4Var, w84Var);
        }
        String obj = zi4Var.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 47);
        sb.append("No Key Parser for requested key type ");
        sb.append(obj);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final xi4 c(b84 b84Var, Class cls, w84 w84Var) {
        aj4 aj4Var = new aj4(b84Var.getClass(), cls, null);
        Map map = this.f5830a;
        if (map.containsKey(aj4Var)) {
            return ((wg4) map.get(aj4Var)).a(b84Var, w84Var);
        }
        String obj = aj4Var.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 32);
        sb.append("No Key serializer for ");
        sb.append(obj);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final boolean d(xi4 xi4Var) {
        return this.f5833d.containsKey(new zi4(xi4Var.getClass(), xi4Var.e(), null));
    }

    public final s84 e(xi4 xi4Var) {
        zi4 zi4Var = new zi4(xi4Var.getClass(), xi4Var.e(), null);
        Map map = this.f5833d;
        if (map.containsKey(zi4Var)) {
            return ((ai4) map.get(zi4Var)).a(xi4Var);
        }
        String obj = zi4Var.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 54);
        sb.append("No Parameters Parser for requested key type ");
        sb.append(obj);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final xi4 f(s84 s84Var, Class cls) {
        aj4 aj4Var = new aj4(s84Var.getClass(), cls, null);
        Map map = this.f5832c;
        if (map.containsKey(aj4Var)) {
            return ((di4) map.get(aj4Var)).a(s84Var);
        }
        String obj = aj4Var.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 39);
        sb.append("No Key Format serializer for ");
        sb.append(obj);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    final /* synthetic */ Map g() {
        return this.f5830a;
    }

    final /* synthetic */ Map h() {
        return this.f5831b;
    }

    final /* synthetic */ Map i() {
        return this.f5832c;
    }

    final /* synthetic */ Map j() {
        return this.f5833d;
    }
}
