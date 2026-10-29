package p3;

import android.os.Bundle;
import l3.a;

/* compiled from: MyApplication */
public class v implements a.d {

    /* renamed from: c, reason: collision with root package name */
    public static final v f25275c = b().a();

    /* renamed from: b, reason: collision with root package name */
    private final String f25276b;

    /* compiled from: MyApplication */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f25277a;

        /* synthetic */ a(x xVar) {
        }

        public v a() {
            return new v(this.f25277a, null);
        }

        public a b(String str) {
            this.f25277a = str;
            return this;
        }
    }

    /* synthetic */ v(String str, y yVar) {
        this.f25276b = str;
    }

    public static a b() {
        return new a(null);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        String str = this.f25276b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            return n.a(this.f25276b, ((v) obj).f25276b);
        }
        return false;
    }

    public final int hashCode() {
        return n.b(this.f25276b);
    }
}
