package w5;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MyApplication */
public abstract class b implements w5.c {

    /* renamed from: q, reason: collision with root package name */
    public static final b f27153q;

    /* renamed from: r, reason: collision with root package name */
    public static final b f27154r;

    /* renamed from: s, reason: collision with root package name */
    public static final b f27155s;

    /* renamed from: t, reason: collision with root package name */
    public static final b f27156t;

    /* renamed from: u, reason: collision with root package name */
    public static final b f27157u;

    /* renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ b[] f27158v;

    /* compiled from: MyApplication */
    enum a extends b {
        a(String str, int i7) {
            super(str, i7, null);
        }

        @Override // w5.c
        public String c(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f27153q = aVar;
        b bVar = new b("UPPER_CAMEL_CASE", 1) { // from class: w5.b.b
            {
                a aVar2 = null;
            }

            @Override // w5.c
            public String c(Field field) {
                return b.m(field.getName());
            }
        };
        f27154r = bVar;
        b bVar2 = new b("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: w5.b.c
            {
                a aVar2 = null;
            }

            @Override // w5.c
            public String c(Field field) {
                return b.m(b.l(field.getName(), " "));
            }
        };
        f27155s = bVar2;
        b bVar3 = new b("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: w5.b.d
            {
                a aVar2 = null;
            }

            @Override // w5.c
            public String c(Field field) {
                return b.l(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        f27156t = bVar3;
        b bVar4 = new b("LOWER_CASE_WITH_DASHES", 4) { // from class: w5.b.e
            {
                a aVar2 = null;
            }

            @Override // w5.c
            public String c(Field field) {
                return b.l(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        f27157u = bVar4;
        f27158v = new b[]{aVar, bVar, bVar2, bVar3, bVar4};
    }

    private b(String str, int i7) {
    }

    private static String k(char c8, String str, int i7) {
        if (i7 >= str.length()) {
            return String.valueOf(c8);
        }
        return c8 + str.substring(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String l(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String m(String str) {
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        char charAt = str.charAt(0);
        while (i7 < str.length() - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i7++;
            charAt = str.charAt(i7);
        }
        if (i7 == str.length()) {
            return sb.toString();
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        sb.append(k(Character.toUpperCase(charAt), str, i7 + 1));
        return sb.toString();
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f27158v.clone();
    }

    /* synthetic */ b(String str, int i7, a aVar) {
        this(str, i7);
    }
}
