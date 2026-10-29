package androidx.core.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.a;
import androidx.core.view.p0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
public abstract class e0 {

    /* renamed from: c, reason: collision with root package name */
    private static Field f1877c;

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f1875a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    private static WeakHashMap f1876b = null;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f1878d = false;

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f1879e = {y.c.f27472b, y.c.f27473c, y.c.f27484n, y.c.f27495y, y.c.B, y.c.C, y.c.D, y.c.E, y.c.F, y.c.G, y.c.f27474d, y.c.f27475e, y.c.f27476f, y.c.f27477g, y.c.f27478h, y.c.f27479i, y.c.f27480j, y.c.f27481k, y.c.f27482l, y.c.f27483m, y.c.f27485o, y.c.f27486p, y.c.f27487q, y.c.f27488r, y.c.f27489s, y.c.f27490t, y.c.f27491u, y.c.f27492v, y.c.f27493w, y.c.f27494x, y.c.f27496z, y.c.A};

    /* renamed from: f, reason: collision with root package name */
    private static final b0 f1880f = new b0() { // from class: androidx.core.view.d0
        @Override // androidx.core.view.b0
        public final d a(d dVar) {
            return e0.a(dVar);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private static final e f1881g = new e();

    /* compiled from: MyApplication */
    class a extends f {
        a(int i7, Class cls, int i8) {
            super(i7, cls, i8);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.e0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(n.d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.e0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            n.i(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.e0.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* compiled from: MyApplication */
    class b extends f {
        b(int i7, Class cls, int i8, int i9) {
            super(i7, cls, i8, i9);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.e0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return n.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.e0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            n.h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.e0.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* compiled from: MyApplication */
    class c extends f {
        c(int i7, Class cls, int i8, int i9) {
            super(i7, cls, i8, i9);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.e0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return p.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.e0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            p.b(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.e0.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* compiled from: MyApplication */
    class d extends f {
        d(int i7, Class cls, int i8) {
            super(i7, cls, i8);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.e0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(n.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.e0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            n.g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.e0.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* compiled from: MyApplication */
    static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        private final int f1883a;

        /* renamed from: b, reason: collision with root package name */
        private final Class f1884b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1885c;

        /* renamed from: d, reason: collision with root package name */
        private final int f1886d;

        f(int i7, Class cls, int i8) {
            this(i7, cls, 0, i8);
        }

        private boolean b() {
            return true;
        }

        private boolean c() {
            return Build.VERSION.SDK_INT >= this.f1885c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract Object d(View view);

        abstract void e(View view, Object obj);

        Object f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            Object tag = view.getTag(this.f1883a);
            if (this.f1884b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        void g(View view, Object obj) {
            if (c()) {
                e(view, obj);
            } else if (b() && h(f(view), obj)) {
                e0.h(view);
                view.setTag(this.f1883a, obj);
                e0.D(view, this.f1886d);
            }
        }

        abstract boolean h(Object obj, Object obj2);

        f(int i7, Class cls, int i8, int i9) {
            this.f1883a = i7;
            this.f1884b = cls;
            this.f1886d = i8;
            this.f1885c = i9;
        }
    }

    /* compiled from: MyApplication */
    static class g {
        static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* compiled from: MyApplication */
    static class h {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static boolean j(View view, int i7, Bundle bundle) {
            return view.performAccessibilityAction(i7, bundle);
        }

        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        static void l(View view, int i7, int i8, int i9, int i10) {
            view.postInvalidateOnAnimation(i7, i8, i9, i10);
        }

        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void n(View view, Runnable runnable, long j7) {
            view.postOnAnimationDelayed(runnable, j7);
        }

        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static void p(View view) {
            view.requestFitSystemWindows();
        }

        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void r(View view, boolean z7) {
            view.setHasTransientState(z7);
        }

        static void s(View view, int i7) {
            view.setImportantForAccessibility(i7);
        }
    }

    /* compiled from: MyApplication */
    static class i {
        static int a() {
            return View.generateViewId();
        }

        static Display b(View view) {
            return view.getDisplay();
        }

        static int c(View view) {
            return view.getLabelFor();
        }

        static int d(View view) {
            return view.getLayoutDirection();
        }

        static int e(View view) {
            return view.getPaddingEnd();
        }

        static int f(View view) {
            return view.getPaddingStart();
        }

        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        static void h(View view, int i7) {
            view.setLabelFor(i7);
        }

        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        static void j(View view, int i7) {
            view.setLayoutDirection(i7);
        }

        static void k(View view, int i7, int i8, int i9, int i10) {
            view.setPaddingRelative(i7, i8, i9, i10);
        }
    }

    /* compiled from: MyApplication */
    static class j {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(View view) {
            return view.isLaidOut();
        }

        static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        static void e(ViewParent viewParent, View view, View view2, int i7) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i7);
        }

        static void f(View view, int i7) {
            view.setAccessibilityLiveRegion(i7);
        }

        static void g(AccessibilityEvent accessibilityEvent, int i7) {
            accessibilityEvent.setContentChangeTypes(i7);
        }
    }

    /* compiled from: MyApplication */
    static class k {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* compiled from: MyApplication */
    private static class l {

        /* compiled from: MyApplication */
        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            p0 f1887a = null;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f1888b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z f1889c;

            a(View view, z zVar) {
                this.f1888b = view;
                this.f1889c = zVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                p0 v7 = p0.v(windowInsets, view);
                int i7 = Build.VERSION.SDK_INT;
                if (i7 < 30) {
                    l.a(windowInsets, this.f1888b);
                    if (v7.equals(this.f1887a)) {
                        return this.f1889c.a(view, v7).t();
                    }
                }
                this.f1887a = v7;
                p0 a8 = this.f1889c.a(view, v7);
                if (i7 >= 30) {
                    return a8.t();
                }
                e0.K(view);
                return a8.t();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(y.c.S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static p0 b(View view, p0 p0Var, Rect rect) {
            WindowInsets t7 = p0Var.t();
            if (t7 != null) {
                return p0.v(view.computeSystemWindowInsets(t7, rect), view);
            }
            rect.setEmpty();
            return p0Var;
        }

        static boolean c(View view, float f8, float f9, boolean z7) {
            return view.dispatchNestedFling(f8, f9, z7);
        }

        static boolean d(View view, float f8, float f9) {
            return view.dispatchNestedPreFling(f8, f9);
        }

        static boolean e(View view, int i7, int i8, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i7, i8, iArr, iArr2);
        }

        static boolean f(View view, int i7, int i8, int i9, int i10, int[] iArr) {
            return view.dispatchNestedScroll(i7, i8, i9, i10, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static p0 j(View view) {
            return p0.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f8) {
            view.setElevation(f8);
        }

        static void t(View view, boolean z7) {
            view.setNestedScrollingEnabled(z7);
        }

        static void u(View view, z zVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(y.c.L, zVar);
            }
            if (zVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(y.c.S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, zVar));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f8) {
            view.setTranslationZ(f8);
        }

        static void x(View view, float f8) {
            view.setZ(f8);
        }

        static boolean y(View view, int i7) {
            return view.startNestedScroll(i7);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: MyApplication */
    private static class m {
        public static p0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            p0 u7 = p0.u(rootWindowInsets);
            u7.r(u7);
            u7.d(view.getRootView());
            return u7;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i7) {
            view.setScrollIndicators(i7);
        }

        static void d(View view, int i7, int i8) {
            view.setScrollIndicators(i7, i8);
        }
    }

    /* compiled from: MyApplication */
    static class n {
        static void a(View view, final s sVar) {
            int i7 = y.c.R;
            r.h hVar = (r.h) view.getTag(i7);
            if (hVar == null) {
                hVar = new r.h();
                view.setTag(i7, hVar);
            }
            Objects.requireNonNull(sVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener(sVar) { // from class: androidx.core.view.f0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    throw null;
                }
            };
            hVar.put(sVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, s sVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            r.h hVar = (r.h) view.getTag(y.c.R);
            if (hVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) hVar.get(sVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i7) {
            return (T) view.requireViewById(i7);
        }

        static void g(View view, boolean z7) {
            view.setAccessibilityHeading(z7);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void i(View view, boolean z7) {
            view.setScreenReaderFocusable(z7);
        }
    }

    /* compiled from: MyApplication */
    private static class o {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7, int i8) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i7, i8);
        }

        static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* compiled from: MyApplication */
    private static class p {
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: MyApplication */
    private static final class q {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static androidx.core.view.d b(View view, androidx.core.view.d dVar) {
            ContentInfo f8 = dVar.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f8);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == f8 ? dVar : androidx.core.view.d.g(performReceiveContent);
        }

        public static void c(View view, String[] strArr, a0 a0Var) {
            if (a0Var == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new r(a0Var));
            }
        }
    }

    /* compiled from: MyApplication */
    private static final class r implements OnReceiveContentListener {

        /* renamed from: a, reason: collision with root package name */
        private final a0 f1890a;

        r(a0 a0Var) {
            this.f1890a = a0Var;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            androidx.core.view.d g8 = androidx.core.view.d.g(contentInfo);
            androidx.core.view.d a8 = this.f1890a.a(view, g8);
            if (a8 == null) {
                return null;
            }
            return a8 == g8 ? contentInfo : a8.f();
        }
    }

    /* compiled from: MyApplication */
    public interface s {
    }

    /* compiled from: MyApplication */
    static class t {

        /* renamed from: d, reason: collision with root package name */
        private static final ArrayList f1891d = new ArrayList();

        /* renamed from: a, reason: collision with root package name */
        private WeakHashMap f1892a = null;

        /* renamed from: b, reason: collision with root package name */
        private SparseArray f1893b = null;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference f1894c = null;

        t() {
        }

        static t a(View view) {
            int i7 = y.c.Q;
            t tVar = (t) view.getTag(i7);
            if (tVar != null) {
                return tVar;
            }
            t tVar2 = new t();
            view.setTag(i7, tVar2);
            return tVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f1892a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c8 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c8 != null) {
                            return c8;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray d() {
            if (this.f1893b == null) {
                this.f1893b = new SparseArray();
            }
            return this.f1893b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(y.c.R);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            android.support.v4.media.session.b.a(arrayList.get(size));
            throw null;
        }

        private void g() {
            WeakHashMap weakHashMap = this.f1892a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f1891d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f1892a == null) {
                        this.f1892a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f1891d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f1892a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f1892a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c8 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c8 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(c8));
                }
            }
            return c8 != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int indexOfKey;
            WeakReference weakReference2 = this.f1894c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f1894c = new WeakReference(keyEvent);
            SparseArray d8 = d();
            if (keyEvent.getAction() != 1 || (indexOfKey = d8.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) d8.valueAt(indexOfKey);
                d8.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) d8.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && e0.A(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    public static boolean A(View view) {
        return j.b(view);
    }

    public static boolean B(View view) {
        return j.c(view);
    }

    public static boolean C(View view) {
        Boolean bool = (Boolean) M().f(view);
        return bool != null && bool.booleanValue();
    }

    static void D(View view, int i7) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z7 = m(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (l(view) != 0 || z7) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z7 ? 32 : 2048);
                j.g(obtain, i7);
                if (z7) {
                    obtain.getText().add(m(view));
                    a0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i7 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                j.g(obtain2, i7);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    j.e(view.getParent(), view, view, i7);
                } catch (AbstractMethodError e8) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e8);
                }
            }
        }
    }

    public static p0 E(View view, p0 p0Var) {
        WindowInsets t7 = p0Var.t();
        if (t7 != null) {
            WindowInsets b8 = k.b(view, t7);
            if (!b8.equals(t7)) {
                return p0.v(b8, view);
            }
        }
        return p0Var;
    }

    private static f F() {
        return new b(y.c.K, CharSequence.class, 8, 28);
    }

    public static androidx.core.view.d G(View view, androidx.core.view.d dVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + dVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return q.b(view, dVar);
        }
        a0 a0Var = (a0) view.getTag(y.c.M);
        if (a0Var == null) {
            return p(view).a(dVar);
        }
        androidx.core.view.d a8 = a0Var.a(view, dVar);
        if (a8 == null) {
            return null;
        }
        return p(view).a(a8);
    }

    public static void H(View view) {
        h.k(view);
    }

    public static void I(View view, Runnable runnable) {
        h.m(view, runnable);
    }

    public static void J(View view, Runnable runnable, long j7) {
        h.n(view, runnable, j7);
    }

    public static void K(View view) {
        k.c(view);
    }

    public static void L(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7, int i8) {
        if (Build.VERSION.SDK_INT >= 29) {
            o.c(view, context, iArr, attributeSet, typedArray, i7, i8);
        }
    }

    private static f M() {
        return new a(y.c.O, Boolean.class, 28);
    }

    public static void N(View view, androidx.core.view.a aVar) {
        if (aVar == null && (j(view) instanceof a.C0030a)) {
            aVar = new androidx.core.view.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static void O(View view, boolean z7) {
        b().g(view, Boolean.valueOf(z7));
    }

    public static void P(View view, CharSequence charSequence) {
        F().g(view, charSequence);
        if (charSequence != null) {
            f1881g.a(view);
        } else {
            f1881g.d(view);
        }
    }

    public static void Q(View view, Drawable drawable) {
        h.q(view, drawable);
    }

    public static void R(View view, ColorStateList colorStateList) {
        l.q(view, colorStateList);
    }

    public static void S(View view, PorterDuff.Mode mode) {
        l.r(view, mode);
    }

    public static void T(View view, float f8) {
        l.s(view, f8);
    }

    public static void U(View view, int i7) {
        h.s(view, i7);
    }

    public static void V(View view, z zVar) {
        l.u(view, zVar);
    }

    public static void W(View view, boolean z7) {
        M().g(view, Boolean.valueOf(z7));
    }

    public static void X(View view, int i7, int i8) {
        m.d(view, i7, i8);
    }

    public static void Y(View view, String str) {
        l.v(view, str);
    }

    public static void Z(View view, float f8) {
        l.w(view, f8);
    }

    private static void a0(View view) {
        if (q(view) == 0) {
            U(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (q((View) parent) == 4) {
                U(view, 2);
                return;
            }
        }
    }

    private static f b() {
        return new d(y.c.J, Boolean.class, 28);
    }

    private static f b0() {
        return new c(y.c.P, CharSequence.class, 64, 30);
    }

    public static k0 c(View view) {
        if (f1876b == null) {
            f1876b = new WeakHashMap();
        }
        k0 k0Var = (k0) f1876b.get(view);
        if (k0Var != null) {
            return k0Var;
        }
        k0 k0Var2 = new k0(view);
        f1876b.put(view, k0Var2);
        return k0Var2;
    }

    public static void c0(View view) {
        l.z(view);
    }

    public static p0 d(View view, p0 p0Var, Rect rect) {
        return l.b(view, p0Var, rect);
    }

    public static p0 e(View view, p0 p0Var) {
        WindowInsets t7 = p0Var.t();
        if (t7 != null) {
            WindowInsets a8 = k.a(view, t7);
            if (!a8.equals(t7)) {
                return p0.v(a8, view);
            }
        }
        return p0Var;
    }

    static boolean f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return t.a(view).b(view, keyEvent);
    }

    static boolean g(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return t.a(view).f(keyEvent);
    }

    static void h(View view) {
        androidx.core.view.a i7 = i(view);
        if (i7 == null) {
            i7 = new androidx.core.view.a();
        }
        N(view, i7);
    }

    public static androidx.core.view.a i(View view) {
        View.AccessibilityDelegate j7 = j(view);
        if (j7 == null) {
            return null;
        }
        return j7 instanceof a.C0030a ? ((a.C0030a) j7).f1820a : new androidx.core.view.a(j7);
    }

    private static View.AccessibilityDelegate j(View view) {
        return Build.VERSION.SDK_INT >= 29 ? o.a(view) : k(view);
    }

    private static View.AccessibilityDelegate k(View view) {
        if (f1878d) {
            return null;
        }
        if (f1877c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1877c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1878d = true;
                return null;
            }
        }
        try {
            Object obj = f1877c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f1878d = true;
            return null;
        }
    }

    public static int l(View view) {
        return j.a(view);
    }

    public static CharSequence m(View view) {
        return (CharSequence) F().f(view);
    }

    public static ColorStateList n(View view) {
        return l.g(view);
    }

    public static PorterDuff.Mode o(View view) {
        return l.h(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static b0 p(View view) {
        return view instanceof b0 ? (b0) view : f1880f;
    }

    public static int q(View view) {
        return h.c(view);
    }

    public static int r(View view) {
        return i.d(view);
    }

    public static int s(View view) {
        return h.d(view);
    }

    public static String[] t(View view) {
        return Build.VERSION.SDK_INT >= 31 ? q.a(view) : (String[]) view.getTag(y.c.N);
    }

    public static p0 u(View view) {
        return m.a(view);
    }

    public static CharSequence v(View view) {
        return (CharSequence) b0().f(view);
    }

    public static String w(View view) {
        return l.k(view);
    }

    public static int x(View view) {
        return h.g(view);
    }

    public static boolean y(View view) {
        return g.a(view);
    }

    public static boolean z(View view) {
        Boolean bool = (Boolean) b().f(view);
        return bool != null && bool.booleanValue();
    }

    /* compiled from: MyApplication */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: q, reason: collision with root package name */
        private final WeakHashMap f1882q = new WeakHashMap();

        e() {
        }

        private void b(View view, boolean z7) {
            boolean z8 = view.isShown() && view.getWindowVisibility() == 0;
            if (z7 != z8) {
                e0.D(view, z8 ? 16 : 32);
                this.f1882q.put(view, Boolean.valueOf(z8));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            h.o(view.getViewTreeObserver(), this);
        }

        void a(View view) {
            this.f1882q.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (j.b(view)) {
                c(view);
            }
        }

        void d(View view) {
            this.f1882q.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry entry : this.f1882q.entrySet()) {
                    b((View) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ androidx.core.view.d a(androidx.core.view.d dVar) {
        return dVar;
    }
}
