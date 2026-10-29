package l6;

import q6.i;

/* compiled from: MyApplication */
public abstract class a extends k6.a {

    /* compiled from: MyApplication */
    /* renamed from: l6.a$a, reason: collision with other inner class name */
    private static final class C0110a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0110a f24663a = new C0110a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f24664b;

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
                f24664b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f24664b = num2;
        }

        private C0110a() {
        }
    }

    private final boolean c(int i7) {
        Integer num = C0110a.f24664b;
        return num == null || num.intValue() >= i7;
    }

    @Override // k6.a
    public void a(Throwable th, Throwable th2) {
        i.e(th, "cause");
        i.e(th2, "exception");
        if (c(19)) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
