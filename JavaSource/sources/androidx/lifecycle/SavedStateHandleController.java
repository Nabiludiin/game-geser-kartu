package androidx.lifecycle;

import androidx.lifecycle.g;
import androidx.savedstate.SavedStateRegistry;
import java.util.Iterator;

/* compiled from: MyApplication */
final class SavedStateHandleController implements i {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2495a;

    /* compiled from: MyApplication */
    static final class a implements SavedStateRegistry.a {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.a
        public void a(androidx.savedstate.c cVar) {
            if (!(cVar instanceof z)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
            }
            y h8 = ((z) cVar).h();
            SavedStateRegistry j7 = cVar.j();
            Iterator it = h8.c().iterator();
            while (it.hasNext()) {
                SavedStateHandleController.h(h8.b((String) it.next()), j7, cVar.t());
            }
            if (h8.c().isEmpty()) {
                return;
            }
            j7.e(a.class);
        }
    }

    static void h(w wVar, SavedStateRegistry savedStateRegistry, g gVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) wVar.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.j()) {
            return;
        }
        savedStateHandleController.i(savedStateRegistry, gVar);
        k(savedStateRegistry, gVar);
    }

    private static void k(final SavedStateRegistry savedStateRegistry, final g gVar) {
        g.c b8 = gVar.b();
        if (b8 == g.c.INITIALIZED || b8.c(g.c.STARTED)) {
            savedStateRegistry.e(a.class);
        } else {
            gVar.a(new i() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // androidx.lifecycle.i
                public void c(k kVar, g.b bVar) {
                    if (bVar == g.b.ON_START) {
                        g.this.c(this);
                        savedStateRegistry.e(a.class);
                    }
                }
            });
        }
    }

    @Override // androidx.lifecycle.i
    public void c(k kVar, g.b bVar) {
        if (bVar == g.b.ON_DESTROY) {
            this.f2495a = false;
            kVar.t().c(this);
        }
    }

    void i(SavedStateRegistry savedStateRegistry, g gVar) {
        if (this.f2495a) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f2495a = true;
        gVar.a(this);
        throw null;
    }

    boolean j() {
        return this.f2495a;
    }
}
