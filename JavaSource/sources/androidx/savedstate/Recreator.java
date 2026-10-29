package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: MyApplication */
final class Recreator implements i {

    /* renamed from: a, reason: collision with root package name */
    private final c f2820a;

    /* compiled from: MyApplication */
    static final class a implements SavedStateRegistry.b {

        /* renamed from: a, reason: collision with root package name */
        final Set f2821a = new HashSet();

        a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.d("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f2821a));
            return bundle;
        }

        void b(String str) {
            this.f2821a.add(str);
        }
    }

    Recreator(c cVar) {
        this.f2820a = cVar;
    }

    private void h(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.a.class);
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.a) declaredConstructor.newInstance(null)).a(this.f2820a);
                } catch (Exception e8) {
                    throw new RuntimeException("Failed to instantiate " + str, e8);
                }
            } catch (NoSuchMethodException e9) {
                throw new IllegalStateException("Class" + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e9);
            }
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("Class " + str + " wasn't found", e10);
        }
    }

    @Override // androidx.lifecycle.i
    public void c(k kVar, g.b bVar) {
        if (bVar != g.b.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        kVar.t().c(this);
        Bundle a8 = this.f2820a.j().a("androidx.savedstate.Restarter");
        if (a8 == null) {
            return;
        }
        ArrayList<String> stringArrayList = a8.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        int size = stringArrayList.size();
        int i7 = 0;
        while (i7 < size) {
            String str = stringArrayList.get(i7);
            i7++;
            h(str);
        }
    }
}
