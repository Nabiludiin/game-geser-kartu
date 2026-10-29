package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: MyApplication */
public final class xv4 implements r84 {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f19189e = {0};

    /* renamed from: a, reason: collision with root package name */
    private final il4 f19190a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19191b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f19192c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f19193d;

    private xv4(gj4 gj4Var) {
        this.f19190a = uv4.b(gl4.c(hl4.b(gj4Var.f().c()), gj4Var.e()));
        this.f19191b = gj4Var.f().d();
        this.f19192c = gj4Var.c().c();
        if (gj4Var.f().f().equals(mj4.f12280d)) {
            this.f19193d = Arrays.copyOf(f19189e, 1);
        } else {
            this.f19193d = new byte[0];
        }
    }

    public static r84 a(gj4 gj4Var) {
        return new xv4(gj4Var);
    }

    public static r84 b(sj4 sj4Var) {
        return new xv4(sj4Var);
    }

    public final byte[] c(byte[] bArr) {
        byte[] bArr2 = this.f19193d;
        return bArr2.length > 0 ? tu4.a(this.f19192c, this.f19190a.a(tu4.a(bArr, bArr2), this.f19191b)) : tu4.a(this.f19192c, this.f19190a.a(bArr, this.f19191b));
    }

    private xv4(sj4 sj4Var) {
        String valueOf = String.valueOf(sj4Var.f().g());
        this.f19190a = new wv4("HMAC".concat(valueOf), new SecretKeySpec(sj4Var.e().c(z74.a()), "HMAC"));
        this.f19191b = sj4Var.f().d();
        this.f19192c = sj4Var.c().c();
        if (sj4Var.f().f().equals(bk4.f5842d)) {
            this.f19193d = Arrays.copyOf(f19189e, 1);
        } else {
            this.f19193d = new byte[0];
        }
    }

    public xv4(il4 il4Var, int i7) {
        this.f19190a = il4Var;
        this.f19191b = i7;
        this.f19192c = new byte[0];
        this.f19193d = new byte[0];
        il4Var.a(new byte[0], i7);
    }
}
