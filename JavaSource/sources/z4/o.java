package z4;

import java.util.Map;

/* compiled from: MyApplication */
public abstract class o {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MyApplication */
    private static abstract class a implements y4.c {

        /* renamed from: q, reason: collision with root package name */
        public static final a f27875q = new C0162a("KEY", 0);

        /* renamed from: r, reason: collision with root package name */
        public static final a f27876r = new b("VALUE", 1);

        /* renamed from: s, reason: collision with root package name */
        private static final /* synthetic */ a[] f27877s = c();

        /* compiled from: MyApplication */
        /* renamed from: z4.o$a$a, reason: collision with other inner class name */
        enum C0162a extends a {
            C0162a(String str, int i7) {
                super(str, i7, null);
            }

            @Override // y4.c
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        /* compiled from: MyApplication */
        enum b extends a {
            b(String str, int i7) {
                super(str, i7, null);
            }

            @Override // y4.c
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        private a(String str, int i7) {
        }

        private static /* synthetic */ a[] c() {
            return new a[]{f27875q, f27876r};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f27877s.clone();
        }

        /* synthetic */ a(String str, int i7, n nVar) {
            this(str, i7);
        }
    }

    static boolean a(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    static String b(Map map) {
        StringBuilder a8 = e.a(map.size());
        a8.append('{');
        boolean z7 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z7) {
                a8.append(", ");
            }
            a8.append(entry.getKey());
            a8.append('=');
            a8.append(entry.getValue());
            z7 = false;
        }
        a8.append('}');
        return a8.toString();
    }

    static y4.c c() {
        return a.f27876r;
    }
}
