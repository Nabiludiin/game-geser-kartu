package e6;

import java.io.Serializable;

/* compiled from: MyApplication */
public abstract class m implements Serializable {

    /* renamed from: q, reason: collision with root package name */
    public static final a f23247q = new a(null);

    /* compiled from: MyApplication */
    public static final class a {
        public /* synthetic */ a(q6.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: MyApplication */
    public static final class b implements Serializable {

        /* renamed from: q, reason: collision with root package name */
        public final Throwable f23248q;

        public b(Throwable th) {
            q6.i.e(th, "exception");
            this.f23248q = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && q6.i.a(this.f23248q, ((b) obj).f23248q);
        }

        public int hashCode() {
            return this.f23248q.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f23248q + ')';
        }
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f23248q;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static Object a(Object obj) {
        return obj;
    }
}
