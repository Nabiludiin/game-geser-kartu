package b2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: MyApplication */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    private static final d f3173c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final String f3174a;

    /* renamed from: b, reason: collision with root package name */
    private final List f3175b;

    /* compiled from: MyApplication */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f3176a = "";

        /* renamed from: b, reason: collision with root package name */
        private List f3177b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f3176a, Collections.unmodifiableList(this.f3177b));
        }

        public a b(List list) {
            this.f3177b = list;
            return this;
        }

        public a c(String str) {
            this.f3176a = str;
            return this;
        }
    }

    d(String str, List list) {
        this.f3174a = str;
        this.f3175b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f3175b;
    }

    public String b() {
        return this.f3174a;
    }
}
