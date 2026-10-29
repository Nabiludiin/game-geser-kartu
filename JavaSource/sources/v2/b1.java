package v2;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.uy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: MyApplication */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f26726a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List f26727b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Context f26728c;

    b1(Context context) {
        this.f26728c = context;
    }

    public final void a() {
        if (((Boolean) s2.b0.c().d(uy.vb)).booleanValue()) {
            r2.t.g();
            final Map l02 = f2.l0((String) s2.b0.c().d(uy.Ab));
            Iterator it = l02.keySet().iterator();
            while (it.hasNext()) {
                c((String) it.next());
            }
            b(new z0() { // from class: v2.a1
                @Override // v2.z0
                public final /* synthetic */ void a(SharedPreferences sharedPreferences, String str, String str2) {
                    Map map = l02;
                    if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
                        r2.t.l().q().s(false);
                    }
                }
            });
        }
    }

    final synchronized void b(z0 z0Var) {
        this.f26727b.add(z0Var);
    }

    final synchronized void c(String str) {
        try {
            Map map = this.f26726a;
            if (map.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f26728c) : this.f26728c.getSharedPreferences(str, 0);
            y0 y0Var = new y0(this, str);
            map.put(str, y0Var);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(y0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ List d() {
        return this.f26727b;
    }
}
