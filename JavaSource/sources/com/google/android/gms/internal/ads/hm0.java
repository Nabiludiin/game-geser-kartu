package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public final class hm0 {

    /* renamed from: a, reason: collision with root package name */
    private final w04 f9574a;

    /* renamed from: b, reason: collision with root package name */
    private final List f9575b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f9576c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    private boolean f9577d;

    public hm0(w04 w04Var) {
        this.f9574a = w04Var;
        jn0 jn0Var = jn0.f10652e;
        this.f9577d = false;
    }

    private final void i(ByteBuffer byteBuffer) {
        boolean z7;
        do {
            int i7 = 0;
            z7 = false;
            while (i7 <= j()) {
                if (!this.f9576c[i7].hasRemaining()) {
                    List list = this.f9575b;
                    nq0 nq0Var = (nq0) list.get(i7);
                    if (!nq0Var.f()) {
                        ByteBuffer byteBuffer2 = i7 > 0 ? this.f9576c[i7 - 1] : byteBuffer.hasRemaining() ? byteBuffer : nq0.f12841a;
                        long remaining = byteBuffer2.remaining();
                        nq0Var.a(byteBuffer2);
                        this.f9576c[i7] = nq0Var.e();
                        boolean z8 = true;
                        if (remaining - byteBuffer2.remaining() <= 0 && !this.f9576c[i7].hasRemaining()) {
                            z8 = false;
                        }
                        z7 |= z8;
                    } else if (!this.f9576c[i7].hasRemaining() && i7 < j()) {
                        ((nq0) list.get(i7 + 1)).c();
                    }
                }
                i7++;
            }
        } while (z7);
    }

    private final int j() {
        return this.f9576c.length - 1;
    }

    public final jn0 a(jn0 jn0Var) {
        if (jn0Var.equals(jn0.f10652e)) {
            throw new lp0("Unhandled input format:", jn0Var);
        }
        int i7 = 0;
        while (true) {
            w04 w04Var = this.f9574a;
            if (i7 >= w04Var.size()) {
                return jn0Var;
            }
            nq0 nq0Var = (nq0) w04Var.get(i7);
            jn0 g8 = nq0Var.g(jn0Var);
            if (nq0Var.d()) {
                rx3.h(!g8.equals(r0));
                jn0Var = g8;
            }
            i7++;
        }
    }

    public final void b(ko0 ko0Var) {
        List list = this.f9575b;
        list.clear();
        this.f9577d = false;
        long j7 = ko0Var.f11168a;
        int i7 = 0;
        while (true) {
            w04 w04Var = this.f9574a;
            if (i7 >= w04Var.size()) {
                break;
            }
            nq0 nq0Var = (nq0) w04Var.get(i7);
            nq0Var.b(new ko0(j7));
            if (nq0Var.d()) {
                j7 = nq0Var.K(j7);
                rx3.h(j7 >= 0);
                list.add(nq0Var);
            }
            i7++;
        }
        this.f9576c = new ByteBuffer[list.size()];
        for (int i8 = 0; i8 <= j(); i8++) {
            this.f9576c[i8] = ((nq0) list.get(i8)).e();
        }
    }

    public final boolean c() {
        return !this.f9575b.isEmpty();
    }

    public final void d(ByteBuffer byteBuffer) {
        if (!c() || this.f9577d) {
            return;
        }
        i(byteBuffer);
    }

    public final ByteBuffer e() {
        if (!c()) {
            return nq0.f12841a;
        }
        ByteBuffer byteBuffer = this.f9576c[j()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        i(nq0.f12841a);
        return this.f9576c[j()];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm0)) {
            return false;
        }
        w04 w04Var = this.f9574a;
        int size = w04Var.size();
        w04 w04Var2 = ((hm0) obj).f9574a;
        if (size != w04Var2.size()) {
            return false;
        }
        for (int i7 = 0; i7 < w04Var.size(); i7++) {
            if (w04Var.get(i7) != w04Var2.get(i7)) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        if (!c() || this.f9577d) {
            return;
        }
        this.f9577d = true;
        ((nq0) this.f9575b.get(0)).c();
    }

    public final boolean g() {
        return this.f9577d && ((nq0) this.f9575b.get(j())).f() && !this.f9576c[j()].hasRemaining();
    }

    public final void h() {
        int i7 = 0;
        while (true) {
            w04 w04Var = this.f9574a;
            if (i7 >= w04Var.size()) {
                this.f9576c = new ByteBuffer[0];
                jn0 jn0Var = jn0.f10652e;
                this.f9577d = false;
                return;
            } else {
                nq0 nq0Var = (nq0) w04Var.get(i7);
                nq0Var.b(ko0.f11167b);
                nq0Var.i();
                i7++;
            }
        }
    }

    public final int hashCode() {
        return this.f9574a.hashCode();
    }
}
