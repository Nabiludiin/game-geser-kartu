package m6;

import r6.c;

/* compiled from: MyApplication */
public class a extends l6.a {

    /* compiled from: MyApplication */
    /* renamed from: m6.a$a, reason: collision with other inner class name */
    private static final class C0113a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0113a f24911a = new C0113a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f24912b;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                f24912b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f24912b = num2;
        }

        private C0113a() {
        }
    }

    private final boolean c(int i7) {
        Integer num = C0113a.f24912b;
        return num == null || num.intValue() >= i7;
    }

    @Override // k6.a
    public c b() {
        return c(34) ? new s6.a() : super.b();
    }
}
