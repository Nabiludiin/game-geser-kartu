package androidx.core.view.accessibility;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: MyApplication */
public class u {

    /* renamed from: d, reason: collision with root package name */
    private static int f1824d;

    /* renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f1825a;

    /* renamed from: b, reason: collision with root package name */
    public int f1826b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f1827c = -1;

    /* compiled from: MyApplication */
    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;

        /* renamed from: d, reason: collision with root package name */
        public static final a f1828d = new a(1, null);

        /* renamed from: e, reason: collision with root package name */
        public static final a f1829e = new a(2, null);

        /* renamed from: f, reason: collision with root package name */
        public static final a f1830f = new a(4, null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f1831g = new a(8, null);

        /* renamed from: h, reason: collision with root package name */
        public static final a f1832h = new a(16, null);

        /* renamed from: i, reason: collision with root package name */
        public static final a f1833i = new a(32, null);

        /* renamed from: j, reason: collision with root package name */
        public static final a f1834j = new a(64, null);

        /* renamed from: k, reason: collision with root package name */
        public static final a f1835k = new a(128, null);

        /* renamed from: l, reason: collision with root package name */
        public static final a f1836l = new a(256, null, x.b.class);

        /* renamed from: m, reason: collision with root package name */
        public static final a f1837m = new a(512, null, x.b.class);

        /* renamed from: n, reason: collision with root package name */
        public static final a f1838n = new a(1024, null, x.c.class);

        /* renamed from: o, reason: collision with root package name */
        public static final a f1839o = new a(2048, null, x.c.class);

        /* renamed from: p, reason: collision with root package name */
        public static final a f1840p = new a(4096, null);

        /* renamed from: q, reason: collision with root package name */
        public static final a f1841q = new a(8192, null);

        /* renamed from: r, reason: collision with root package name */
        public static final a f1842r = new a(16384, null);

        /* renamed from: s, reason: collision with root package name */
        public static final a f1843s = new a(32768, null);

        /* renamed from: t, reason: collision with root package name */
        public static final a f1844t = new a(65536, null);

        /* renamed from: u, reason: collision with root package name */
        public static final a f1845u = new a(131072, null, x.g.class);

        /* renamed from: v, reason: collision with root package name */
        public static final a f1846v = new a(262144, null);

        /* renamed from: w, reason: collision with root package name */
        public static final a f1847w = new a(524288, null);

        /* renamed from: x, reason: collision with root package name */
        public static final a f1848x = new a(1048576, null);

        /* renamed from: y, reason: collision with root package name */
        public static final a f1849y = new a(2097152, null, x.h.class);

        /* renamed from: z, reason: collision with root package name */
        public static final a f1850z;

        /* renamed from: a, reason: collision with root package name */
        final Object f1851a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1852b;

        /* renamed from: c, reason: collision with root package name */
        private final Class f1853c;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            int i7 = Build.VERSION.SDK_INT;
            f1850z = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, x.e.class);
            B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            F = new a(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            if (i7 >= 29) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction = accessibilityAction20;
            } else {
                accessibilityAction = null;
            }
            G = new a(accessibilityAction, R.id.accessibilityActionPageDown, null, null, null);
            if (i7 >= 29) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction2 = accessibilityAction19;
            } else {
                accessibilityAction2 = null;
            }
            H = new a(accessibilityAction2, R.id.accessibilityActionPageLeft, null, null, null);
            if (i7 >= 29) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction3 = accessibilityAction18;
            } else {
                accessibilityAction3 = null;
            }
            I = new a(accessibilityAction3, R.id.accessibilityActionPageRight, null, null, null);
            J = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            if (i7 >= 24) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
                accessibilityAction4 = accessibilityAction17;
            } else {
                accessibilityAction4 = null;
            }
            K = new a(accessibilityAction4, R.id.accessibilityActionSetProgress, null, null, x.f.class);
            L = new a(i7 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, x.d.class);
            M = new a(i7 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            if (i7 >= 28) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction5 = accessibilityAction16;
            } else {
                accessibilityAction5 = null;
            }
            N = new a(accessibilityAction5, R.id.accessibilityActionHideTooltip, null, null, null);
            if (i7 >= 30) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction6 = accessibilityAction15;
            } else {
                accessibilityAction6 = null;
            }
            O = new a(accessibilityAction6, R.id.accessibilityActionPressAndHold, null, null, null);
            if (i7 >= 30) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction7 = accessibilityAction14;
            } else {
                accessibilityAction7 = null;
            }
            P = new a(accessibilityAction7, R.id.accessibilityActionImeEnter, null, null, null);
            if (i7 >= 32) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
                accessibilityAction8 = accessibilityAction13;
            } else {
                accessibilityAction8 = null;
            }
            Q = new a(accessibilityAction8, R.id.accessibilityActionDragStart, null, null, null);
            if (i7 >= 32) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
                accessibilityAction9 = accessibilityAction12;
            } else {
                accessibilityAction9 = null;
            }
            R = new a(accessibilityAction9, R.id.accessibilityActionDragDrop, null, null, null);
            if (i7 >= 32) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
                accessibilityAction10 = accessibilityAction11;
            } else {
                accessibilityAction10 = null;
            }
            S = new a(accessibilityAction10, R.id.accessibilityActionDragCancel, null, null, null);
            T = new a(i7 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        }

        public a(int i7, CharSequence charSequence) {
            this(null, i7, charSequence, null, null);
        }

        public int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f1851a).getId();
        }

        public CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f1851a).getLabel();
        }

        public boolean c(View view, Bundle bundle) {
            return false;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f1851a;
            return obj2 == null ? aVar.f1851a == null : obj2.equals(aVar.f1851a);
        }

        public int hashCode() {
            Object obj = this.f1851a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String g8 = u.g(this.f1852b);
            if (g8.equals("ACTION_UNKNOWN") && b() != null) {
                g8 = b().toString();
            }
            sb.append(g8);
            return sb.toString();
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i7, CharSequence charSequence, Class cls) {
            this(null, i7, charSequence, null, cls);
        }

        a(Object obj, int i7, CharSequence charSequence, x xVar, Class cls) {
            this.f1852b = i7;
            if (obj == null) {
                this.f1851a = new AccessibilityNodeInfo.AccessibilityAction(i7, charSequence);
            } else {
                this.f1851a = obj;
            }
            this.f1853c = cls;
        }
    }

    /* compiled from: MyApplication */
    private static class b {
        public static Bundle a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    private u(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1825a = accessibilityNodeInfo;
    }

    private void G(View view) {
        SparseArray p7 = p(view);
        if (p7 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < p7.size(); i7++) {
                if (((WeakReference) p7.valueAt(i7)).get() == null) {
                    arrayList.add(Integer.valueOf(i7));
                }
            }
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                p7.remove(((Integer) arrayList.get(i8)).intValue());
            }
        }
    }

    private void H(int i7, boolean z7) {
        Bundle m7 = m();
        if (m7 != null) {
            int i8 = m7.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i7);
            if (!z7) {
                i7 = 0;
            }
            m7.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i7 | i8);
        }
    }

    public static u P(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new u(accessibilityNodeInfo);
    }

    private void b(ClickableSpan clickableSpan, Spanned spanned, int i7) {
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i7));
    }

    private void d() {
        b.a(this.f1825a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        b.a(this.f1825a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        b.a(this.f1825a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        b.a(this.f1825a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List e(String str) {
        ArrayList<Integer> integerArrayList = b.a(this.f1825a).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        b.a(this.f1825a).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String g(int i7) {
        if (i7 == 1) {
            return "ACTION_FOCUS";
        }
        if (i7 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i7) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i7) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i7) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i7) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static ClickableSpan[] k(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray n(View view) {
        SparseArray p7 = p(view);
        if (p7 != null) {
            return p7;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(y.c.I, sparseArray);
        return sparseArray;
    }

    private SparseArray p(View view) {
        return (SparseArray) view.getTag(y.c.I);
    }

    private boolean t() {
        return !e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int u(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i7)).get())) {
                    return sparseArray.keyAt(i7);
                }
            }
        }
        int i8 = f1824d;
        f1824d = i8 + 1;
        return i8;
    }

    public boolean A() {
        return this.f1825a.isFocused();
    }

    public boolean B() {
        return this.f1825a.isLongClickable();
    }

    public boolean C() {
        return this.f1825a.isPassword();
    }

    public boolean D() {
        return this.f1825a.isScrollable();
    }

    public boolean E() {
        return this.f1825a.isSelected();
    }

    public boolean F(int i7, Bundle bundle) {
        return this.f1825a.performAction(i7, bundle);
    }

    public void I(CharSequence charSequence) {
        this.f1825a.setClassName(charSequence);
    }

    public void J(boolean z7) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1825a.setHeading(z7);
        } else {
            H(2, z7);
        }
    }

    public void K(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1825a.setPaneTitle(charSequence);
        } else {
            b.a(this.f1825a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void L(boolean z7) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1825a.setScreenReaderFocusable(z7);
        } else {
            H(1, z7);
        }
    }

    public void M(boolean z7) {
        this.f1825a.setScrollable(z7);
    }

    public void N(CharSequence charSequence) {
        if (androidx.core.os.b.b()) {
            this.f1825a.setStateDescription(charSequence);
        } else {
            b.a(this.f1825a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public AccessibilityNodeInfo O() {
        return this.f1825a;
    }

    public void a(a aVar) {
        this.f1825a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f1851a);
    }

    public void c(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            d();
            G(view);
            ClickableSpan[] k7 = k(charSequence);
            if (k7 == null || k7.length <= 0) {
                return;
            }
            m().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", y.c.f27471a);
            SparseArray n7 = n(view);
            for (int i7 = 0; i7 < k7.length; i7++) {
                int u7 = u(k7[i7], n7);
                n7.put(u7, new WeakReference(k7[i7]));
                b(k7[i7], (Spanned) charSequence, u7);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1825a;
        if (accessibilityNodeInfo == null) {
            if (uVar.f1825a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(uVar.f1825a)) {
            return false;
        }
        return this.f1827c == uVar.f1827c && this.f1826b == uVar.f1826b;
    }

    public List f() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f1825a.getActionList();
        if (actionList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(new a(actionList.get(i7)));
        }
        return arrayList;
    }

    public void h(Rect rect) {
        this.f1825a.getBoundsInParent(rect);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1825a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i(Rect rect) {
        this.f1825a.getBoundsInScreen(rect);
    }

    public CharSequence j() {
        return this.f1825a.getClassName();
    }

    public CharSequence l() {
        return this.f1825a.getContentDescription();
    }

    public Bundle m() {
        return b.a(this.f1825a);
    }

    public CharSequence o() {
        return this.f1825a.getPackageName();
    }

    public CharSequence q() {
        if (!t()) {
            return this.f1825a.getText();
        }
        List e8 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List e9 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List e10 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List e11 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f1825a.getText(), 0, this.f1825a.getText().length()));
        for (int i7 = 0; i7 < e8.size(); i7++) {
            spannableString.setSpan(new androidx.core.view.accessibility.a(((Integer) e11.get(i7)).intValue(), this, m().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) e8.get(i7)).intValue(), ((Integer) e9.get(i7)).intValue(), ((Integer) e10.get(i7)).intValue());
        }
        return spannableString;
    }

    public String r() {
        String uniqueId;
        if (!androidx.core.os.b.d()) {
            return b.a(this.f1825a).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        uniqueId = this.f1825a.getUniqueId();
        return uniqueId;
    }

    public String s() {
        return this.f1825a.getViewIdResourceName();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        h(rect);
        sb.append("; boundsInParent: " + rect);
        i(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(o());
        sb.append("; className: ");
        sb.append(j());
        sb.append("; text: ");
        sb.append(q());
        sb.append("; contentDescription: ");
        sb.append(l());
        sb.append("; viewId: ");
        sb.append(s());
        sb.append("; uniqueId: ");
        sb.append(r());
        sb.append("; checkable: ");
        sb.append(v());
        sb.append("; checked: ");
        sb.append(w());
        sb.append("; focusable: ");
        sb.append(z());
        sb.append("; focused: ");
        sb.append(A());
        sb.append("; selected: ");
        sb.append(E());
        sb.append("; clickable: ");
        sb.append(x());
        sb.append("; longClickable: ");
        sb.append(B());
        sb.append("; enabled: ");
        sb.append(y());
        sb.append("; password: ");
        sb.append(C());
        sb.append("; scrollable: " + D());
        sb.append("; [");
        List f8 = f();
        for (int i7 = 0; i7 < f8.size(); i7++) {
            a aVar = (a) f8.get(i7);
            String g8 = g(aVar.a());
            if (g8.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                g8 = aVar.b().toString();
            }
            sb.append(g8);
            if (i7 != f8.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean v() {
        return this.f1825a.isCheckable();
    }

    public boolean w() {
        return this.f1825a.isChecked();
    }

    public boolean x() {
        return this.f1825a.isClickable();
    }

    public boolean y() {
        return this.f1825a.isEnabled();
    }

    public boolean z() {
        return this.f1825a.isFocusable();
    }
}
