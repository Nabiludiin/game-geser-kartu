package b2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import y1.l;

/* compiled from: MyApplication */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static final a f3147e = new C0062a().b();

    /* renamed from: a, reason: collision with root package name */
    private final f f3148a;

    /* renamed from: b, reason: collision with root package name */
    private final List f3149b;

    /* renamed from: c, reason: collision with root package name */
    private final b f3150c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3151d;

    /* compiled from: MyApplication */
    /* renamed from: b2.a$a, reason: collision with other inner class name */
    public static final class C0062a {

        /* renamed from: a, reason: collision with root package name */
        private f f3152a = null;

        /* renamed from: b, reason: collision with root package name */
        private List f3153b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private b f3154c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f3155d = "";

        C0062a() {
        }

        public C0062a a(d dVar) {
            this.f3153b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f3152a, Collections.unmodifiableList(this.f3153b), this.f3154c, this.f3155d);
        }

        public C0062a c(String str) {
            this.f3155d = str;
            return this;
        }

        public C0062a d(b bVar) {
            this.f3154c = bVar;
            return this;
        }

        public C0062a e(f fVar) {
            this.f3152a = fVar;
            return this;
        }
    }

    a(f fVar, List list, b bVar, String str) {
        this.f3148a = fVar;
        this.f3149b = list;
        this.f3150c = bVar;
        this.f3151d = str;
    }

    public static C0062a e() {
        return new C0062a();
    }

    public String a() {
        return this.f3151d;
    }

    public b b() {
        return this.f3150c;
    }

    public List c() {
        return this.f3149b;
    }

    public f d() {
        return this.f3148a;
    }

    public byte[] f() {
        return l.a(this);
    }
}
