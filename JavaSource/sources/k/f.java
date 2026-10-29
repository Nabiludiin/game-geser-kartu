package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import k.b;

/* compiled from: MyApplication */
public class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    final Context f24277a;

    /* renamed from: b, reason: collision with root package name */
    final b f24278b;

    /* compiled from: MyApplication */
    public static class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f24279a;

        /* renamed from: b, reason: collision with root package name */
        final Context f24280b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList f24281c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        final r.h f24282d = new r.h();

        public a(Context context, ActionMode.Callback callback) {
            this.f24280b = context;
            this.f24279a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f24282d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            l.d dVar = new l.d(this.f24280b, (z.a) menu);
            this.f24282d.put(menu, dVar);
            return dVar;
        }

        @Override // k.b.a
        public boolean a(b bVar, MenuItem menuItem) {
            return this.f24279a.onActionItemClicked(e(bVar), new l.c(this.f24280b, (z.b) menuItem));
        }

        @Override // k.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f24279a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // k.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f24279a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // k.b.a
        public void d(b bVar) {
            this.f24279a.onDestroyActionMode(e(bVar));
        }

        public ActionMode e(b bVar) {
            int size = this.f24281c.size();
            for (int i7 = 0; i7 < size; i7++) {
                f fVar = (f) this.f24281c.get(i7);
                if (fVar != null && fVar.f24278b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f24280b, bVar);
            this.f24281c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f24277a = context;
        this.f24278b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f24278b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f24278b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new l.d(this.f24277a, (z.a) this.f24278b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f24278b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f24278b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f24278b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f24278b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f24278b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f24278b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f24278b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f24278b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f24278b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f24278b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f24278b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z7) {
        this.f24278b.s(z7);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i7) {
        this.f24278b.n(i7);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i7) {
        this.f24278b.q(i7);
    }
}
