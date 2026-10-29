package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: MyApplication */
public abstract class pw4 {
    public String c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final rw4 e() {
        if (this instanceof rw4) {
            return (rw4) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final ow4 g() {
        if (this instanceof ow4) {
            return (ow4) this;
        }
        throw new IllegalStateException("Not a JSON Array: ".concat(toString()));
    }

    public final tw4 h() {
        if (this instanceof tw4) {
            return (tw4) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            xx4 xx4Var = new xx4(lx4.a(sb));
            xx4Var.a(uw4.LENIENT);
            tx4.f16484a.a(xx4Var, this);
            return sb.toString();
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }
}
