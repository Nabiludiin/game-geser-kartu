package v2;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: MyApplication */
final class y0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final String f26893a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b1 f26894b;

    public y0(b1 b1Var, String str) {
        Objects.requireNonNull(b1Var);
        this.f26894b = b1Var;
        this.f26893a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        b1 b1Var = this.f26894b;
        synchronized (b1Var) {
            try {
                Iterator it = b1Var.d().iterator();
                while (it.hasNext()) {
                    ((z0) it.next()).a(sharedPreferences, this.f26893a, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
