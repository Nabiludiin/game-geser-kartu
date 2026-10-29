package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MyApplication */
public class e implements z.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    private final Context f451a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f452b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f453c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f454d;

    /* renamed from: e, reason: collision with root package name */
    private a f455e;

    /* renamed from: m, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f463m;

    /* renamed from: n, reason: collision with root package name */
    CharSequence f464n;

    /* renamed from: o, reason: collision with root package name */
    Drawable f465o;

    /* renamed from: p, reason: collision with root package name */
    View f466p;

    /* renamed from: x, reason: collision with root package name */
    private g f474x;

    /* renamed from: z, reason: collision with root package name */
    private boolean f476z;

    /* renamed from: l, reason: collision with root package name */
    private int f462l = 0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f467q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f468r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f469s = false;

    /* renamed from: t, reason: collision with root package name */
    private boolean f470t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f471u = false;

    /* renamed from: v, reason: collision with root package name */
    private ArrayList f472v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList f473w = new CopyOnWriteArrayList();

    /* renamed from: y, reason: collision with root package name */
    private boolean f475y = false;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f456f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f457g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private boolean f458h = true;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f459i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f460j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private boolean f461k = true;

    /* compiled from: MyApplication */
    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    /* compiled from: MyApplication */
    public interface b {
        boolean a(g gVar);
    }

    public e(Context context) {
        this.f451a = context;
        this.f452b = context.getResources();
        b0(true);
    }

    private static int B(int i7) {
        int i8 = ((-65536) & i7) >> 16;
        if (i8 >= 0) {
            int[] iArr = A;
            if (i8 < iArr.length) {
                return (i7 & 65535) | (iArr[i8] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void N(int i7, boolean z7) {
        if (i7 < 0 || i7 >= this.f456f.size()) {
            return;
        }
        this.f456f.remove(i7);
        if (z7) {
            K(true);
        }
    }

    private void W(int i7, CharSequence charSequence, int i8, Drawable drawable, View view) {
        Resources C = C();
        if (view != null) {
            this.f466p = view;
            this.f464n = null;
            this.f465o = null;
        } else {
            if (i7 > 0) {
                this.f464n = C.getText(i7);
            } else if (charSequence != null) {
                this.f464n = charSequence;
            }
            if (i8 > 0) {
                this.f465o = androidx.core.content.a.e(u(), i8);
            } else if (drawable != null) {
                this.f465o = drawable;
            }
            this.f466p = null;
        }
        K(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (androidx.core.view.g0.b(android.view.ViewConfiguration.get(r2.f451a), r2.f451a) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f452b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f451a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f451a
            boolean r3 = androidx.core.view.g0.b(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f454d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.b0(boolean):void");
    }

    private g g(int i7, int i8, int i9, int i10, CharSequence charSequence, int i11) {
        return new g(this, i7, i8, i9, i10, charSequence, i11);
    }

    private void i(boolean z7) {
        if (this.f473w.isEmpty()) {
            return;
        }
        d0();
        Iterator it = this.f473w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f473w.remove(weakReference);
            } else {
                jVar.c(z7);
            }
        }
        c0();
    }

    private boolean j(m mVar, j jVar) {
        if (this.f473w.isEmpty()) {
            return false;
        }
        boolean k7 = jVar != null ? jVar.k(mVar) : false;
        Iterator it = this.f473w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            j jVar2 = (j) weakReference.get();
            if (jVar2 == null) {
                this.f473w.remove(weakReference);
            } else if (!k7) {
                k7 = jVar2.k(mVar);
            }
        }
        return k7;
    }

    private static int n(ArrayList arrayList, int i7) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((g) arrayList.get(size)).f() <= i7) {
                return size + 1;
            }
        }
        return 0;
    }

    boolean A() {
        return this.f470t;
    }

    Resources C() {
        return this.f452b;
    }

    public ArrayList E() {
        if (!this.f458h) {
            return this.f457g;
        }
        this.f457g.clear();
        int size = this.f456f.size();
        for (int i7 = 0; i7 < size; i7++) {
            g gVar = (g) this.f456f.get(i7);
            if (gVar.isVisible()) {
                this.f457g.add(gVar);
            }
        }
        this.f458h = false;
        this.f461k = true;
        return this.f457g;
    }

    public boolean F() {
        return this.f475y;
    }

    boolean G() {
        return this.f453c;
    }

    public boolean H() {
        return this.f454d;
    }

    void I(g gVar) {
        this.f461k = true;
        K(true);
    }

    void J(g gVar) {
        this.f458h = true;
        K(true);
    }

    public void K(boolean z7) {
        if (this.f467q) {
            this.f468r = true;
            if (z7) {
                this.f469s = true;
                return;
            }
            return;
        }
        if (z7) {
            this.f458h = true;
            this.f461k = true;
        }
        i(z7);
    }

    public boolean L(MenuItem menuItem, int i7) {
        return M(menuItem, null, i7);
    }

    public boolean M(MenuItem menuItem, j jVar, int i7) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean k7 = gVar.k();
        androidx.core.view.b b8 = gVar.b();
        boolean z7 = b8 != null && b8.a();
        if (gVar.j()) {
            boolean expandActionView = gVar.expandActionView() | k7;
            if (expandActionView) {
                e(true);
            }
            return expandActionView;
        }
        if (!gVar.hasSubMenu() && !z7) {
            if ((i7 & 1) == 0) {
                e(true);
            }
            return k7;
        }
        if ((i7 & 4) == 0) {
            e(false);
        }
        if (!gVar.hasSubMenu()) {
            gVar.x(new m(u(), this, gVar));
        }
        m mVar = (m) gVar.getSubMenu();
        if (z7) {
            b8.e(mVar);
        }
        boolean j7 = j(mVar, jVar) | k7;
        if (!j7) {
            e(true);
        }
        return j7;
    }

    public void O(j jVar) {
        Iterator it = this.f473w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            j jVar2 = (j) weakReference.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f473w.remove(weakReference);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).P(bundle);
            }
        }
        int i8 = bundle.getInt("android:menu:expandedactionview");
        if (i8 <= 0 || (findItem = findItem(i8)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f455e = aVar;
    }

    public e S(int i7) {
        this.f462l = i7;
        return this;
    }

    void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f456f.size();
        d0();
        for (int i7 = 0; i7 < size; i7++) {
            g gVar = (g) this.f456f.get(i7);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        c0();
    }

    protected e U(int i7) {
        W(0, null, i7, null, null);
        return this;
    }

    protected e V(Drawable drawable) {
        W(0, null, 0, drawable, null);
        return this;
    }

    protected e X(int i7) {
        W(i7, null, 0, null, null);
        return this;
    }

    protected e Y(CharSequence charSequence) {
        W(0, charSequence, 0, null, null);
        return this;
    }

    protected e Z(View view) {
        W(0, null, 0, null, view);
        return this;
    }

    protected MenuItem a(int i7, int i8, int i9, CharSequence charSequence) {
        int B = B(i9);
        g g8 = g(i7, i8, i9, B, charSequence, this.f462l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f463m;
        if (contextMenuInfo != null) {
            g8.v(contextMenuInfo);
        }
        ArrayList arrayList = this.f456f;
        arrayList.add(n(arrayList, B), g8);
        K(true);
        return g8;
    }

    public void a0(boolean z7) {
        this.f476z = z7;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i7, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        int i11;
        PackageManager packageManager = this.f451a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i10 & 1) == 0) {
            removeGroup(i7);
        }
        for (int i12 = 0; i12 < size; i12++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i12);
            int i13 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i13 < 0 ? intent : intentArr[i13]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i7, i8, i9, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i11 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i11] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f451a);
    }

    public void c(j jVar, Context context) {
        this.f473w.add(new WeakReference(jVar));
        jVar.i(context, this);
        this.f461k = true;
    }

    public void c0() {
        this.f467q = false;
        if (this.f468r) {
            this.f468r = false;
            K(this.f469s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f474x;
        if (gVar != null) {
            f(gVar);
        }
        this.f456f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f465o = null;
        this.f464n = null;
        this.f466p = null;
        K(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f455e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        if (this.f467q) {
            return;
        }
        this.f467q = true;
        this.f468r = false;
        this.f469s = false;
    }

    public final void e(boolean z7) {
        if (this.f471u) {
            return;
        }
        this.f471u = true;
        Iterator it = this.f473w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f473w.remove(weakReference);
            } else {
                jVar.b(this, z7);
            }
        }
        this.f471u = false;
    }

    public boolean f(g gVar) {
        boolean z7 = false;
        if (!this.f473w.isEmpty() && this.f474x == gVar) {
            d0();
            Iterator it = this.f473w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                j jVar = (j) weakReference.get();
                if (jVar == null) {
                    this.f473w.remove(weakReference);
                } else {
                    z7 = jVar.e(this, gVar);
                    if (z7) {
                        break;
                    }
                }
            }
            c0();
            if (z7) {
                this.f474x = null;
            }
        }
        return z7;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i7) {
        MenuItem findItem;
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            g gVar = (g) this.f456f.get(i8);
            if (gVar.getItemId() == i7) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.getSubMenu().findItem(i7)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i7) {
        return (MenuItem) this.f456f.get(i7);
    }

    boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f455e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f476z) {
            return true;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((g) this.f456f.get(i7)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return p(i7, keyEvent) != null;
    }

    public boolean k(g gVar) {
        boolean z7 = false;
        if (this.f473w.isEmpty()) {
            return false;
        }
        d0();
        Iterator it = this.f473w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f473w.remove(weakReference);
            } else {
                z7 = jVar.f(this, gVar);
                if (z7) {
                    break;
                }
            }
        }
        c0();
        if (z7) {
            this.f474x = gVar;
        }
        return z7;
    }

    public int l(int i7) {
        return m(i7, 0);
    }

    public int m(int i7, int i8) {
        int size = size();
        if (i8 < 0) {
            i8 = 0;
        }
        while (i8 < size) {
            if (((g) this.f456f.get(i8)).getGroupId() == i7) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public int o(int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (((g) this.f456f.get(i8)).getItemId() == i7) {
                return i8;
            }
        }
        return -1;
    }

    g p(int i7, KeyEvent keyEvent) {
        ArrayList arrayList = this.f472v;
        arrayList.clear();
        q(arrayList, i7, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (g) arrayList.get(0);
        }
        boolean G = G();
        for (int i8 = 0; i8 < size; i8++) {
            g gVar = (g) arrayList.get(i8);
            char alphabeticShortcut = G ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (G && alphabeticShortcut == '\b' && i7 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i7, int i8) {
        return L(findItem(i7), i8);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i7, KeyEvent keyEvent, int i8) {
        g p7 = p(i7, keyEvent);
        boolean L = p7 != null ? L(p7, i8) : false;
        if ((i8 & 2) != 0) {
            e(true);
        }
        return L;
    }

    void q(List list, int i7, KeyEvent keyEvent) {
        boolean G = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i7 == 67) {
            int size = this.f456f.size();
            for (int i8 = 0; i8 < size; i8++) {
                g gVar = (g) this.f456f.get(i8);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i7, keyEvent);
                }
                char alphabeticShortcut = G ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if ((modifiers & 69647) == ((G ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (G && alphabeticShortcut == '\b' && i7 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList E = E();
        if (this.f461k) {
            Iterator it = this.f473w.iterator();
            boolean z7 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                j jVar = (j) weakReference.get();
                if (jVar == null) {
                    this.f473w.remove(weakReference);
                } else {
                    z7 |= jVar.d();
                }
            }
            if (z7) {
                this.f459i.clear();
                this.f460j.clear();
                int size = E.size();
                for (int i7 = 0; i7 < size; i7++) {
                    g gVar = (g) E.get(i7);
                    if (gVar.l()) {
                        this.f459i.add(gVar);
                    } else {
                        this.f460j.add(gVar);
                    }
                }
            } else {
                this.f459i.clear();
                this.f460j.clear();
                this.f460j.addAll(E());
            }
            this.f461k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i7) {
        int l7 = l(i7);
        if (l7 >= 0) {
            int size = this.f456f.size() - l7;
            int i8 = 0;
            while (true) {
                int i9 = i8 + 1;
                if (i8 >= size || ((g) this.f456f.get(l7)).getGroupId() != i7) {
                    break;
                }
                N(l7, false);
                i8 = i9;
            }
            K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i7) {
        N(o(i7), true);
    }

    public ArrayList s() {
        r();
        return this.f459i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i7, boolean z7, boolean z8) {
        int size = this.f456f.size();
        for (int i8 = 0; i8 < size; i8++) {
            g gVar = (g) this.f456f.get(i8);
            if (gVar.getGroupId() == i7) {
                gVar.t(z8);
                gVar.setCheckable(z7);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z7) {
        this.f475y = z7;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i7, boolean z7) {
        int size = this.f456f.size();
        for (int i8 = 0; i8 < size; i8++) {
            g gVar = (g) this.f456f.get(i8);
            if (gVar.getGroupId() == i7) {
                gVar.setEnabled(z7);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i7, boolean z7) {
        int size = this.f456f.size();
        boolean z8 = false;
        for (int i8 = 0; i8 < size; i8++) {
            g gVar = (g) this.f456f.get(i8);
            if (gVar.getGroupId() == i7 && gVar.y(z7)) {
                z8 = true;
            }
        }
        if (z8) {
            K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z7) {
        this.f453c = z7;
        K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f456f.size();
    }

    protected String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f451a;
    }

    public g v() {
        return this.f474x;
    }

    public Drawable w() {
        return this.f465o;
    }

    public CharSequence x() {
        return this.f464n;
    }

    public View y() {
        return this.f466p;
    }

    public ArrayList z() {
        r();
        return this.f460j;
    }

    @Override // android.view.Menu
    public MenuItem add(int i7) {
        return a(0, 0, 0, this.f452b.getString(i7));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7) {
        return addSubMenu(0, 0, 0, this.f452b.getString(i7));
    }

    @Override // android.view.Menu
    public MenuItem add(int i7, int i8, int i9, CharSequence charSequence) {
        return a(i7, i8, i9, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        g gVar = (g) a(i7, i8, i9, charSequence);
        m mVar = new m(this.f451a, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i7, int i8, int i9, int i10) {
        return a(i7, i8, i9, this.f452b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7, int i8, int i9, int i10) {
        return addSubMenu(i7, i8, i9, this.f452b.getString(i10));
    }

    public e D() {
        return this;
    }
}
