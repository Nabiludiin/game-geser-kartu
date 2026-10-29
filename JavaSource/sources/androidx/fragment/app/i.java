package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* compiled from: MyApplication */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final k f2271a;

    private i(k kVar) {
        this.f2271a = kVar;
    }

    public static i b(k kVar) {
        return new i((k) androidx.core.util.e.g(kVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        k kVar = this.f2271a;
        kVar.f2277u.j(kVar, kVar, fragment);
    }

    public void c() {
        this.f2271a.f2277u.x();
    }

    public void d(Configuration configuration) {
        this.f2271a.f2277u.z(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f2271a.f2277u.A(menuItem);
    }

    public void f() {
        this.f2271a.f2277u.B();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f2271a.f2277u.C(menu, menuInflater);
    }

    public void h() {
        this.f2271a.f2277u.D();
    }

    public void i() {
        this.f2271a.f2277u.F();
    }

    public void j(boolean z7) {
        this.f2271a.f2277u.G(z7);
    }

    public boolean k(MenuItem menuItem) {
        return this.f2271a.f2277u.I(menuItem);
    }

    public void l(Menu menu) {
        this.f2271a.f2277u.J(menu);
    }

    public void m() {
        this.f2271a.f2277u.L();
    }

    public void n(boolean z7) {
        this.f2271a.f2277u.M(z7);
    }

    public boolean o(Menu menu) {
        return this.f2271a.f2277u.N(menu);
    }

    public void p() {
        this.f2271a.f2277u.P();
    }

    public void q() {
        this.f2271a.f2277u.Q();
    }

    public void r() {
        this.f2271a.f2277u.S();
    }

    public boolean s() {
        return this.f2271a.f2277u.Z(true);
    }

    public n t() {
        return this.f2271a.f2277u;
    }

    public void u() {
        this.f2271a.f2277u.P0();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2271a.f2277u.s0().onCreateView(view, str, context, attributeSet);
    }

    public void w(Parcelable parcelable) {
        k kVar = this.f2271a;
        if (!(kVar instanceof androidx.lifecycle.z)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        kVar.f2277u.b1(parcelable);
    }

    public Parcelable x() {
        return this.f2271a.f2277u.d1();
    }
}
