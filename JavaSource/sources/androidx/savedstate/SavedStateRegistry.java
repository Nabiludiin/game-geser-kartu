package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.savedstate.Recreator;
import java.util.Map;
import n.b;

/* compiled from: MyApplication */
public final class SavedStateRegistry {

    /* renamed from: b, reason: collision with root package name */
    private Bundle f2823b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2824c;

    /* renamed from: d, reason: collision with root package name */
    private Recreator.a f2825d;

    /* renamed from: a, reason: collision with root package name */
    private n.b f2822a = new n.b();

    /* renamed from: e, reason: collision with root package name */
    boolean f2826e = true;

    /* compiled from: MyApplication */
    public interface a {
        void a(c cVar);
    }

    /* compiled from: MyApplication */
    public interface b {
        Bundle a();
    }

    SavedStateRegistry() {
    }

    public Bundle a(String str) {
        if (!this.f2824c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f2823b;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        this.f2823b.remove(str);
        if (this.f2823b.isEmpty()) {
            this.f2823b = null;
        }
        return bundle2;
    }

    void b(g gVar, Bundle bundle) {
        if (this.f2824c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            this.f2823b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        gVar.a(new i() { // from class: androidx.savedstate.SavedStateRegistry.1
            @Override // androidx.lifecycle.i
            public void c(k kVar, g.b bVar) {
                if (bVar == g.b.ON_START) {
                    SavedStateRegistry.this.f2826e = true;
                } else if (bVar == g.b.ON_STOP) {
                    SavedStateRegistry.this.f2826e = false;
                }
            }
        });
        this.f2824c = true;
    }

    void c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f2823b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        b.d g8 = this.f2822a.g();
        while (g8.hasNext()) {
            Map.Entry entry = (Map.Entry) g8.next();
            bundle2.putBundle((String) entry.getKey(), ((b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void d(String str, b bVar) {
        if (((b) this.f2822a.j(str, bVar)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void e(Class cls) {
        if (!this.f2826e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f2825d == null) {
            this.f2825d = new Recreator.a(this);
        }
        try {
            cls.getDeclaredConstructor(null);
            this.f2825d.b(cls.getName());
        } catch (NoSuchMethodException e8) {
            throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
        }
    }
}
