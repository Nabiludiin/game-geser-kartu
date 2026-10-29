package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: MyApplication */
public abstract class oz4 extends zx4 {

    /* renamed from: q, reason: collision with root package name */
    private final sz4 f13563q;

    /* renamed from: r, reason: collision with root package name */
    protected sz4 f13564r;

    protected oz4(sz4 sz4Var) {
        this.f13563q = sz4Var;
        if (sz4Var.q()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f13564r = s();
    }

    private sz4 s() {
        return this.f13563q.M();
    }

    private static void v(Object obj, Object obj2) {
        f15.a().b(obj.getClass()).h(obj, obj2);
    }

    public final sz4 A() {
        sz4 c8 = c();
        if (c8.a()) {
            return c8;
        }
        throw zx4.i(c8);
    }

    public oz4 B(sz4 sz4Var) {
        if (D().equals(sz4Var)) {
            return this;
        }
        w();
        v(this.f13564r, sz4Var);
        return this;
    }

    public oz4 C(byte[] bArr, int i7, int i8, ez4 ez4Var) {
        w();
        try {
            f15.a().b(this.f13564r.getClass()).m(this.f13564r, bArr, i7, i7 + i8, new ey4(ez4Var));
            return this;
        } catch (e05 e8) {
            throw e8;
        } catch (IOException e9) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e9);
        } catch (IndexOutOfBoundsException unused) {
            throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public sz4 D() {
        return this.f13563q;
    }

    @Override // com.google.android.gms.internal.ads.x05
    public final boolean a() {
        boolean Z;
        Z = sz4.Z(this.f13564r, false);
        return Z;
    }

    @Override // com.google.android.gms.internal.ads.zx4
    public /* bridge */ /* synthetic */ zx4 g(byte[] bArr, int i7, int i8, ez4 ez4Var) {
        C(bArr, i7, i8, ez4Var);
        return this;
    }

    protected final void w() {
        if (this.f13564r.q()) {
            return;
        }
        x();
    }

    protected void x() {
        sz4 s7 = s();
        v(s7, this.f13564r);
        this.f13564r = s7;
    }

    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public oz4 clone() {
        oz4 l7 = D().l();
        l7.f13564r = c();
        return l7;
    }

    @Override // com.google.android.gms.internal.ads.u05
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public sz4 c() {
        if (!this.f13564r.q()) {
            return this.f13564r;
        }
        this.f13564r.O();
        return this.f13564r;
    }
}
