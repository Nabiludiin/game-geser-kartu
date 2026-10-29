package androidx.privacysandbox.ads.adservices.topics;

/* compiled from: MyApplication */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f2575a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2576b;

    /* compiled from: MyApplication */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f2577a = "";

        /* renamed from: b, reason: collision with root package name */
        private boolean f2578b = true;

        public final c a() {
            return new c(this.f2577a, this.f2578b);
        }

        public final a b(String str) {
            q6.i.e(str, "adsSdkName");
            if (str.length() <= 0) {
                throw new IllegalStateException("adsSdkName must be set");
            }
            this.f2577a = str;
            return this;
        }

        public final a c(boolean z7) {
            this.f2578b = z7;
            return this;
        }
    }

    public c(String str, boolean z7) {
        q6.i.e(str, "adsSdkName");
        this.f2575a = str;
        this.f2576b = z7;
    }

    public final String a() {
        return this.f2575a;
    }

    public final boolean b() {
        return this.f2576b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return q6.i.a(this.f2575a, cVar.f2575a) && this.f2576b == cVar.f2576b;
    }

    public int hashCode() {
        return (this.f2575a.hashCode() * 31) + b.a(this.f2576b);
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f2575a + ", shouldRecordObservation=" + this.f2576b;
    }
}
