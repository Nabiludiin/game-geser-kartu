package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.u;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: MyApplication */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final View.AccessibilityDelegate f1817c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    private final View.AccessibilityDelegate f1818a;

    /* renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f1819b;

    /* compiled from: MyApplication */
    /* renamed from: androidx.core.view.a$a, reason: collision with other inner class name */
    static final class C0030a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        final a f1820a;

        C0030a(a aVar) {
            this.f1820a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f1820a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            androidx.core.view.accessibility.v b8 = this.f1820a.b(view);
            if (b8 != null) {
                return (AccessibilityNodeProvider) b8.a();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1820a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            androidx.core.view.accessibility.u P = androidx.core.view.accessibility.u.P(accessibilityNodeInfo);
            P.L(e0.C(view));
            P.J(e0.z(view));
            P.K(e0.m(view));
            P.N(e0.v(view));
            this.f1820a.g(view, P);
            P.c(accessibilityNodeInfo.getText(), view);
            List c8 = a.c(view);
            for (int i7 = 0; i7 < c8.size(); i7++) {
                P.a((u.a) c8.get(i7));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1820a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f1820a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
            return this.f1820a.j(view, i7, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i7) {
            this.f1820a.l(view, i7);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f1820a.m(view, accessibilityEvent);
        }
    }

    /* compiled from: MyApplication */
    static class b {
        static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i7, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i7, bundle);
        }
    }

    public a() {
        this(f1817c);
    }

    static List c(View view) {
        List list = (List) view.getTag(y.c.H);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] k7 = androidx.core.view.accessibility.u.k(view.createAccessibilityNodeInfo().getText());
            for (int i7 = 0; k7 != null && i7 < k7.length; i7++) {
                if (clickableSpan.equals(k7[i7])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i7, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(y.c.I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i7)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1818a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public androidx.core.view.accessibility.v b(View view) {
        AccessibilityNodeProvider a8 = b.a(this.f1818a, view);
        if (a8 != null) {
            return new androidx.core.view.accessibility.v(a8);
        }
        return null;
    }

    View.AccessibilityDelegate d() {
        return this.f1819b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f1818a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, androidx.core.view.accessibility.u uVar) {
        this.f1818a.onInitializeAccessibilityNodeInfo(view, uVar.O());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f1818a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1818a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i7, Bundle bundle) {
        List c8 = c(view);
        boolean z7 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= c8.size()) {
                break;
            }
            u.a aVar = (u.a) c8.get(i8);
            if (aVar.a() == i7) {
                z7 = aVar.c(view, bundle);
                break;
            }
            i8++;
        }
        if (!z7) {
            z7 = b.b(this.f1818a, view, i7, bundle);
        }
        return (z7 || i7 != y.c.f27471a || bundle == null) ? z7 : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i7) {
        this.f1818a.sendAccessibilityEvent(view, i7);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f1818a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1818a = accessibilityDelegate;
        this.f1819b = new C0030a(this);
    }
}
