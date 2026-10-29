package e1;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* compiled from: MyApplication */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Set f23155a = new HashSet();

    /* compiled from: MyApplication */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f23156a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f23157b;

        a(Uri uri, boolean z7) {
            this.f23156a = uri;
            this.f23157b = z7;
        }

        public Uri a() {
            return this.f23156a;
        }

        public boolean b() {
            return this.f23157b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f23157b == aVar.f23157b && this.f23156a.equals(aVar.f23156a)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f23156a.hashCode() * 31) + (this.f23157b ? 1 : 0);
        }
    }

    public void a(Uri uri, boolean z7) {
        this.f23155a.add(new a(uri, z7));
    }

    public Set b() {
        return this.f23155a;
    }

    public int c() {
        return this.f23155a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f23155a.equals(((c) obj).f23155a);
    }

    public int hashCode() {
        return this.f23155a.hashCode();
    }
}
