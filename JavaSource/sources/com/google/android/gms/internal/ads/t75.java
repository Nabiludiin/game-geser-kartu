package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: MyApplication */
public abstract class t75 implements rg {

    /* renamed from: x, reason: collision with root package name */
    private static final e85 f16021x = e85.b(t75.class);

    /* renamed from: q, reason: collision with root package name */
    protected final String f16022q;

    /* renamed from: t, reason: collision with root package name */
    private ByteBuffer f16025t;

    /* renamed from: u, reason: collision with root package name */
    long f16026u;

    /* renamed from: w, reason: collision with root package name */
    y75 f16028w;

    /* renamed from: v, reason: collision with root package name */
    long f16027v = -1;

    /* renamed from: s, reason: collision with root package name */
    boolean f16024s = true;

    /* renamed from: r, reason: collision with root package name */
    boolean f16023r = true;

    protected t75(String str) {
        this.f16022q = str;
    }

    private final synchronized void b() {
        try {
            if (this.f16024s) {
                return;
            }
            try {
                e85 e85Var = f16021x;
                String str = this.f16022q;
                e85Var.a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.f16025t = this.f16028w.i(this.f16026u, this.f16027v);
                this.f16024s = true;
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.rg
    public final String a() {
        return this.f16022q;
    }

    protected abstract void c(ByteBuffer byteBuffer);

    public final synchronized void d() {
        try {
            b();
            e85 e85Var = f16021x;
            String str = this.f16022q;
            e85Var.a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.f16025t;
            if (byteBuffer != null) {
                this.f16023r = true;
                byteBuffer.rewind();
                c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.f16025t = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.rg
    public final void e(y75 y75Var, ByteBuffer byteBuffer, long j7, og ogVar) {
        this.f16026u = y75Var.d();
        byteBuffer.remaining();
        this.f16027v = j7;
        this.f16028w = y75Var;
        y75Var.f(y75Var.d() + j7);
        this.f16024s = false;
        this.f16023r = false;
        d();
    }
}
