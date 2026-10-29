package j0;

import android.text.Editable;
import androidx.emoji2.text.m;

/* compiled from: MyApplication */
final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f24213a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile Editable.Factory f24214b;

    /* renamed from: c, reason: collision with root package name */
    private static Class f24215c;

    private b() {
        try {
            f24215c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f24214b == null) {
            synchronized (f24213a) {
                try {
                    if (f24214b == null) {
                        f24214b = new b();
                    }
                } finally {
                }
            }
        }
        return f24214b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f24215c;
        return cls != null ? m.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
