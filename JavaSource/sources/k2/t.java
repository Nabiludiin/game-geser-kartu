package k2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: MyApplication */
public class t {

    /* renamed from: f, reason: collision with root package name */
    public static final List f24428f = Arrays.asList("MA", "T", "PG", "G");

    /* renamed from: a, reason: collision with root package name */
    private final int f24429a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24430b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24431c;

    /* renamed from: d, reason: collision with root package name */
    private final List f24432d;

    /* renamed from: e, reason: collision with root package name */
    private final b f24433e;

    /* compiled from: MyApplication */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f24434a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f24435b = -1;

        /* renamed from: c, reason: collision with root package name */
        private String f24436c = null;

        /* renamed from: d, reason: collision with root package name */
        private final List f24437d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private b f24438e = b.DEFAULT;

        public t a() {
            return new t(this.f24434a, this.f24435b, this.f24436c, this.f24437d, this.f24438e, null);
        }
    }

    /* compiled from: MyApplication */
    public enum b {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);


        /* renamed from: q, reason: collision with root package name */
        private final int f24443q;

        b(int i7) {
            this.f24443q = i7;
        }

        public int c() {
            return this.f24443q;
        }
    }

    /* synthetic */ t(int i7, int i8, String str, List list, b bVar, byte[] bArr) {
        this.f24429a = i7;
        this.f24430b = i8;
        this.f24431c = str;
        this.f24432d = list;
        this.f24433e = bVar;
    }

    public String a() {
        String str = this.f24431c;
        return str == null ? "" : str;
    }

    public b b() {
        return this.f24433e;
    }

    public int c() {
        return this.f24429a;
    }

    public int d() {
        return this.f24430b;
    }

    public List e() {
        return new ArrayList(this.f24432d);
    }
}
