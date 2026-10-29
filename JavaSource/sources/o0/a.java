package o0;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* compiled from: MyApplication */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f25040a = new a();

    /* compiled from: MyApplication */
    /* renamed from: o0.a$a, reason: collision with other inner class name */
    private static final class C0116a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0116a f25041a = new C0116a();

        private C0116a() {
        }

        public final int a() {
            int extensionVersion;
            extensionVersion = SdkExtensions.getExtensionVersion(31);
            return extensionVersion;
        }
    }

    /* compiled from: MyApplication */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f25042a = new b();

        private b() {
        }

        public final int a() {
            int extensionVersion;
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            return extensionVersion;
        }
    }

    private a() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return b.f25042a.a();
        }
        return 0;
    }

    public final int b() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 == 31 || i7 == 32) {
            return C0116a.f25041a.a();
        }
        return 0;
    }
}
