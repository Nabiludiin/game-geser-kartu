package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: MyApplication */
class l implements LayoutInflater.Factory2 {

    /* renamed from: q, reason: collision with root package name */
    final n f2278q;

    l(n nVar) {
        this.f2278q = nVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        t u7;
        if (h.class.getName().equals(str)) {
            return new h(context, attributeSet, this.f2278q);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k0.c.f24340d);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(k0.c.f24341e);
        }
        int resourceId = obtainStyledAttributes.getResourceId(k0.c.f24342f, -1);
        String string = obtainStyledAttributes.getString(k0.c.f24343g);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !j.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment f02 = resourceId != -1 ? this.f2278q.f0(resourceId) : null;
        if (f02 == null && string != null) {
            f02 = this.f2278q.g0(string);
        }
        if (f02 == null && id != -1) {
            f02 = this.f2278q.f0(id);
        }
        if (f02 == null) {
            f02 = this.f2278q.o0().a(context.getClassLoader(), attributeValue);
            f02.D = true;
            f02.M = resourceId != 0 ? resourceId : id;
            f02.N = id;
            f02.O = string;
            f02.E = true;
            n nVar = this.f2278q;
            f02.I = nVar;
            f02.J = nVar.r0();
            f02.x0(this.f2278q.r0().i(), attributeSet, f02.f2104r);
            u7 = this.f2278q.g(f02);
            if (n.D0(2)) {
                Log.v("FragmentManager", "Fragment " + f02 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (f02.E) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            f02.E = true;
            n nVar2 = this.f2278q;
            f02.I = nVar2;
            f02.J = nVar2.r0();
            f02.x0(this.f2278q.r0().i(), attributeSet, f02.f2104r);
            u7 = this.f2278q.u(f02);
            if (n.D0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + f02 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        f02.W = (ViewGroup) view;
        u7.m();
        u7.j();
        View view2 = f02.X;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (f02.X.getTag() == null) {
            f02.X.setTag(string);
        }
        f02.X.addOnAttachStateChangeListener(new a(u7));
        return f02.X;
    }

    /* compiled from: MyApplication */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ t f2279q;

        a(t tVar) {
            this.f2279q = tVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment k7 = this.f2279q.k();
            this.f2279q.m();
            b0.n((ViewGroup) k7.X.getParent(), l.this.f2278q).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
