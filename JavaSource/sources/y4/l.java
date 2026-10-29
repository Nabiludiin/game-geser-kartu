package y4;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: MyApplication */
public abstract class l {

    /* compiled from: MyApplication */
    static class a implements k, Serializable {

        /* renamed from: q, reason: collision with root package name */
        final k f27728q;

        /* renamed from: r, reason: collision with root package name */
        volatile transient boolean f27729r;

        /* renamed from: s, reason: collision with root package name */
        transient Object f27730s;

        a(k kVar) {
            this.f27728q = (k) h.h(kVar);
        }

        @Override // y4.k
        public Object get() {
            if (!this.f27729r) {
                synchronized (this) {
                    try {
                        if (!this.f27729r) {
                            Object obj = this.f27728q.get();
                            this.f27730s = obj;
                            this.f27729r = true;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return e.a(this.f27730s);
        }

        public String toString() {
            Object obj;
            if (this.f27729r) {
                String valueOf = String.valueOf(this.f27730s);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(valueOf);
                sb.append(">");
                obj = sb.toString();
            } else {
                obj = this.f27728q;
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* compiled from: MyApplication */
    static class b implements k {

        /* renamed from: q, reason: collision with root package name */
        volatile k f27731q;

        /* renamed from: r, reason: collision with root package name */
        volatile boolean f27732r;

        /* renamed from: s, reason: collision with root package name */
        Object f27733s;

        b(k kVar) {
            this.f27731q = (k) h.h(kVar);
        }

        @Override // y4.k
        public Object get() {
            if (!this.f27732r) {
                synchronized (this) {
                    try {
                        if (!this.f27732r) {
                            k kVar = this.f27731q;
                            Objects.requireNonNull(kVar);
                            Object obj = kVar.get();
                            this.f27733s = obj;
                            this.f27732r = true;
                            this.f27731q = null;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return e.a(this.f27733s);
        }

        public String toString() {
            Object obj = this.f27731q;
            if (obj == null) {
                String valueOf = String.valueOf(this.f27733s);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(valueOf);
                sb.append(">");
                obj = sb.toString();
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* compiled from: MyApplication */
    private static class c implements k, Serializable {

        /* renamed from: q, reason: collision with root package name */
        final Object f27734q;

        c(Object obj) {
            this.f27734q = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return f.a(this.f27734q, ((c) obj).f27734q);
            }
            return false;
        }

        @Override // y4.k
        public Object get() {
            return this.f27734q;
        }

        public int hashCode() {
            return f.b(this.f27734q);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27734q);
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Suppliers.ofInstance(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static k a(k kVar) {
        return !(kVar instanceof b) ? kVar instanceof a ? kVar : kVar instanceof Serializable ? new a(kVar) : new b(kVar) : kVar;
    }

    public static k b(Object obj) {
        return new c(obj);
    }
}
