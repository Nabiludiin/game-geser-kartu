package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.j;

/* compiled from: MyApplication */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: q, reason: collision with root package name */
    private e f477q;

    /* renamed from: r, reason: collision with root package name */
    private androidx.appcompat.app.b f478r;

    /* renamed from: s, reason: collision with root package name */
    c f479s;

    /* renamed from: t, reason: collision with root package name */
    private j.a f480t;

    public f(e eVar) {
        this.f477q = eVar;
    }

    public void a() {
        androidx.appcompat.app.b bVar = this.f478r;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void b(e eVar, boolean z7) {
        if (z7 || eVar == this.f477q) {
            a();
        }
        j.a aVar = this.f480t;
        if (aVar != null) {
            aVar.b(eVar, z7);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean c(e eVar) {
        j.a aVar = this.f480t;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        e eVar = this.f477q;
        b.a aVar = new b.a(eVar.u());
        c cVar = new c(aVar.b(), f.g.f23417j);
        this.f479s = cVar;
        cVar.g(this);
        this.f477q.b(this.f479s);
        aVar.c(this.f479s.a(), this);
        View y7 = eVar.y();
        if (y7 != null) {
            aVar.d(y7);
        } else {
            aVar.e(eVar.w()).h(eVar.x());
        }
        aVar.f(this);
        androidx.appcompat.app.b a8 = aVar.a();
        this.f478r = a8;
        a8.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f478r.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f478r.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i7) {
        this.f477q.L((g) this.f479s.a().getItem(i7), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f479s.b(this.f477q, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i7 == 82 || i7 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f478r.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f478r.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f477q.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f477q.performShortcut(i7, keyEvent, 0);
    }
}
