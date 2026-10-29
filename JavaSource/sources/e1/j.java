package e1;

import android.util.Log;

/* compiled from: MyApplication */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static j f23167a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final int f23168b = 20;

    /* compiled from: MyApplication */
    public static class a extends j {

        /* renamed from: c, reason: collision with root package name */
        private int f23169c;

        public a(int i7) {
            super(i7);
            this.f23169c = i7;
        }

        @Override // e1.j
        public void a(String str, String str2, Throwable... thArr) {
            if (this.f23169c <= 3) {
                if (thArr == null || thArr.length < 1) {
                    Log.d(str, str2);
                } else {
                    Log.d(str, str2, thArr[0]);
                }
            }
        }

        @Override // e1.j
        public void b(String str, String str2, Throwable... thArr) {
            if (this.f23169c <= 6) {
                if (thArr == null || thArr.length < 1) {
                    Log.e(str, str2);
                } else {
                    Log.e(str, str2, thArr[0]);
                }
            }
        }

        @Override // e1.j
        public void d(String str, String str2, Throwable... thArr) {
            if (this.f23169c <= 4) {
                if (thArr == null || thArr.length < 1) {
                    Log.i(str, str2);
                } else {
                    Log.i(str, str2, thArr[0]);
                }
            }
        }

        @Override // e1.j
        public void g(String str, String str2, Throwable... thArr) {
            if (this.f23169c <= 2) {
                if (thArr == null || thArr.length < 1) {
                    Log.v(str, str2);
                } else {
                    Log.v(str, str2, thArr[0]);
                }
            }
        }

        @Override // e1.j
        public void h(String str, String str2, Throwable... thArr) {
            if (this.f23169c <= 5) {
                if (thArr == null || thArr.length < 1) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, thArr[0]);
                }
            }
        }
    }

    public j(int i7) {
    }

    public static synchronized j c() {
        j jVar;
        synchronized (j.class) {
            try {
                if (f23167a == null) {
                    f23167a = new a(3);
                }
                jVar = f23167a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public static synchronized void e(j jVar) {
        synchronized (j.class) {
            f23167a = jVar;
        }
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i7 = f23168b;
        if (length >= i7) {
            sb.append(str.substring(0, i7));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}
