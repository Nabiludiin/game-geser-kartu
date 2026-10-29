package y1;

import android.util.Base64;
import y1.d;

/* compiled from: MyApplication */
public abstract class o {

    /* compiled from: MyApplication */
    public static abstract class a {
        public abstract o a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(w1.d dVar);
    }

    public static a a() {
        return new d.b().d(w1.d.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract w1.d d();

    public boolean e() {
        return c() != null;
    }

    public o f(w1.d dVar) {
        return a().b(b()).d(dVar).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? "" : Base64.encodeToString(c(), 2));
    }
}
