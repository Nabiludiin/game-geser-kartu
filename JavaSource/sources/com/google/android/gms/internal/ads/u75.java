package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: MyApplication */
public abstract class u75 extends x75 implements rg {

    /* renamed from: x, reason: collision with root package name */
    protected final String f16627x = "moov";

    public u75(String str) {
    }

    @Override // com.google.android.gms.internal.ads.rg
    public final String a() {
        return this.f16627x;
    }

    @Override // com.google.android.gms.internal.ads.rg
    public final void e(y75 y75Var, ByteBuffer byteBuffer, long j7, og ogVar) {
        y75Var.d();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.f18655r = y75Var;
        this.f18657t = y75Var.d();
        y75Var.f(y75Var.d() + j7);
        this.f18658u = y75Var.d();
        this.f18654q = ogVar;
    }
}
