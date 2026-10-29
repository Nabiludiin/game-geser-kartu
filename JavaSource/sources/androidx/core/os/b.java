package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* compiled from: MyApplication */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f1741a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f1742b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1743c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f1744d;

    /* compiled from: MyApplication */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final int f1745a;

        /* renamed from: b, reason: collision with root package name */
        static final int f1746b;

        /* renamed from: c, reason: collision with root package name */
        static final int f1747c;

        /* renamed from: d, reason: collision with root package name */
        static final int f1748d;

        static {
            int extensionVersion;
            int extensionVersion2;
            int extensionVersion3;
            int extensionVersion4;
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            f1745a = extensionVersion;
            extensionVersion2 = SdkExtensions.getExtensionVersion(31);
            f1746b = extensionVersion2;
            extensionVersion3 = SdkExtensions.getExtensionVersion(33);
            f1747c = extensionVersion3;
            extensionVersion4 = SdkExtensions.getExtensionVersion(1000000);
            f1748d = extensionVersion4;
        }
    }

    static {
        int i7 = Build.VERSION.SDK_INT;
        f1741a = i7 >= 30 ? a.f1745a : 0;
        f1742b = i7 >= 30 ? a.f1746b : 0;
        f1743c = i7 >= 30 ? a.f1747c : 0;
        f1744d = i7 >= 30 ? a.f1748d : 0;
    }

    protected static boolean a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean c() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 31) {
            return i7 >= 30 && a("S", Build.VERSION.CODENAME);
        }
        return true;
    }

    public static boolean d() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 33) {
            return i7 >= 32 && a("Tiramisu", Build.VERSION.CODENAME);
        }
        return true;
    }
}
