package l;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import r.h;

/* compiled from: MyApplication */
abstract class b {

    /* renamed from: a, reason: collision with root package name */
    final Context f24572a;

    /* renamed from: b, reason: collision with root package name */
    private h f24573b;

    /* renamed from: c, reason: collision with root package name */
    private h f24574c;

    b(Context context) {
        this.f24572a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof z.b)) {
            return menuItem;
        }
        z.b bVar = (z.b) menuItem;
        if (this.f24573b == null) {
            this.f24573b = new h();
        }
        MenuItem menuItem2 = (MenuItem) this.f24573b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f24572a, bVar);
        this.f24573b.put(bVar, cVar);
        return cVar;
    }

    final void e() {
        h hVar = this.f24573b;
        if (hVar != null) {
            hVar.clear();
        }
        h hVar2 = this.f24574c;
        if (hVar2 != null) {
            hVar2.clear();
        }
    }

    final void f(int i7) {
        if (this.f24573b == null) {
            return;
        }
        int i8 = 0;
        while (i8 < this.f24573b.size()) {
            if (((z.b) this.f24573b.i(i8)).getGroupId() == i7) {
                this.f24573b.k(i8);
                i8--;
            }
            i8++;
        }
    }

    final void g(int i7) {
        if (this.f24573b == null) {
            return;
        }
        for (int i8 = 0; i8 < this.f24573b.size(); i8++) {
            if (((z.b) this.f24573b.i(i8)).getItemId() == i7) {
                this.f24573b.k(i8);
                return;
            }
        }
    }

    final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }
}
