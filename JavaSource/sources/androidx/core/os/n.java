package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: MyApplication */
final class n implements i {

    /* renamed from: a, reason: collision with root package name */
    private final LocaleList f1762a;

    n(Object obj) {
        this.f1762a = m.a(obj);
    }

    @Override // androidx.core.os.i
    public Object a() {
        return this.f1762a;
    }

    public boolean equals(Object obj) {
        boolean equals;
        equals = this.f1762a.equals(((i) obj).a());
        return equals;
    }

    @Override // androidx.core.os.i
    public Locale get(int i7) {
        Locale locale;
        locale = this.f1762a.get(i7);
        return locale;
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.f1762a.hashCode();
        return hashCode;
    }

    public String toString() {
        String localeList;
        localeList = this.f1762a.toString();
        return localeList;
    }
}
