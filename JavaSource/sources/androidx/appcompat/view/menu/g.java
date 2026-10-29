package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.core.view.b;

/* compiled from: MyApplication */
public final class g implements z.b {
    private View A;
    private androidx.core.view.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a, reason: collision with root package name */
    private final int f481a;

    /* renamed from: b, reason: collision with root package name */
    private final int f482b;

    /* renamed from: c, reason: collision with root package name */
    private final int f483c;

    /* renamed from: d, reason: collision with root package name */
    private final int f484d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f485e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f486f;

    /* renamed from: g, reason: collision with root package name */
    private Intent f487g;

    /* renamed from: h, reason: collision with root package name */
    private char f488h;

    /* renamed from: j, reason: collision with root package name */
    private char f490j;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f492l;

    /* renamed from: n, reason: collision with root package name */
    e f494n;

    /* renamed from: o, reason: collision with root package name */
    private m f495o;

    /* renamed from: p, reason: collision with root package name */
    private Runnable f496p;

    /* renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f497q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f498r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f499s;

    /* renamed from: z, reason: collision with root package name */
    private int f506z;

    /* renamed from: i, reason: collision with root package name */
    private int f489i = 4096;

    /* renamed from: k, reason: collision with root package name */
    private int f491k = 4096;

    /* renamed from: m, reason: collision with root package name */
    private int f493m = 0;

    /* renamed from: t, reason: collision with root package name */
    private ColorStateList f500t = null;

    /* renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f501u = null;

    /* renamed from: v, reason: collision with root package name */
    private boolean f502v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f503w = false;

    /* renamed from: x, reason: collision with root package name */
    private boolean f504x = false;

    /* renamed from: y, reason: collision with root package name */
    private int f505y = 16;
    private boolean D = false;

    /* compiled from: MyApplication */
    class a implements b.InterfaceC0031b {
        a() {
        }

        @Override // androidx.core.view.b.InterfaceC0031b
        public void onActionProviderVisibilityChanged(boolean z7) {
            g gVar = g.this;
            gVar.f494n.J(gVar);
        }
    }

    g(e eVar, int i7, int i8, int i9, int i10, CharSequence charSequence, int i11) {
        this.f494n = eVar;
        this.f481a = i8;
        this.f482b = i7;
        this.f483c = i9;
        this.f484d = i10;
        this.f485e = charSequence;
        this.f506z = i11;
    }

    private static void d(StringBuilder sb, int i7, int i8, String str) {
        if ((i7 & i8) == i8) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f504x && (this.f502v || this.f503w)) {
            drawable = androidx.core.graphics.drawable.a.p(drawable).mutate();
            if (this.f502v) {
                androidx.core.graphics.drawable.a.n(drawable, this.f500t);
            }
            if (this.f503w) {
                androidx.core.graphics.drawable.a.o(drawable, this.f501u);
            }
            this.f504x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f494n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f506z & 4) == 4;
    }

    @Override // z.b
    public z.b a(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.g();
        }
        this.A = null;
        this.B = bVar;
        this.f494n.K(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.i(new a());
        }
        return this;
    }

    @Override // z.b
    public androidx.core.view.b b() {
        return this.B;
    }

    public void c() {
        this.f494n.I(this);
    }

    @Override // z.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f506z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f494n.f(this);
        }
        return false;
    }

    @Override // z.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f494n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f484d;
    }

    char g() {
        return this.f494n.G() ? this.f490j : this.f488h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // z.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View c8 = bVar.c(this);
        this.A = c8;
        return c8;
    }

    @Override // z.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f491k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f490j;
    }

    @Override // z.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f498r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f482b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f492l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f493m == 0) {
            return null;
        }
        Drawable b8 = h.a.b(this.f494n.u(), this.f493m);
        this.f493m = 0;
        this.f492l = b8;
        return e(b8);
    }

    @Override // z.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f500t;
    }

    @Override // z.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f501u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f487g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f481a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // z.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f489i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f488h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f483c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f495o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f485e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f486f;
        return charSequence != null ? charSequence : this.f485e;
    }

    @Override // z.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f499s;
    }

    String h() {
        char g8 = g();
        if (g8 == 0) {
            return "";
        }
        Resources resources = this.f494n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f494n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(f.h.f23438k));
        }
        int i7 = this.f494n.G() ? this.f491k : this.f489i;
        d(sb, i7, 65536, resources.getString(f.h.f23434g));
        d(sb, i7, 4096, resources.getString(f.h.f23430c));
        d(sb, i7, 2, resources.getString(f.h.f23429b));
        d(sb, i7, 1, resources.getString(f.h.f23435h));
        d(sb, i7, 4, resources.getString(f.h.f23437j));
        d(sb, i7, 8, resources.getString(f.h.f23433f));
        if (g8 == '\b') {
            sb.append(resources.getString(f.h.f23431d));
        } else if (g8 == '\n') {
            sb.append(resources.getString(f.h.f23432e));
        } else if (g8 != ' ') {
            sb.append(g8);
        } else {
            sb.append(resources.getString(f.h.f23436i));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f495o != null;
    }

    CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.c()) ? getTitle() : getTitleCondensed();
    }

    @Override // z.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f505y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f505y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f505y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        return (bVar == null || !bVar.f()) ? (this.f505y & 8) == 0 : (this.f505y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f506z & 8) != 0) {
            if (this.A == null && (bVar = this.B) != null) {
                this.A = bVar.c(this);
            }
            if (this.A != null) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f497q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f494n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f496p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f487g != null) {
            try {
                this.f494n.u().startActivity(this.f487g);
                return true;
            } catch (ActivityNotFoundException e8) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e8);
            }
        }
        androidx.core.view.b bVar = this.B;
        return bVar != null && bVar.d();
    }

    public boolean l() {
        return (this.f505y & 32) == 32;
    }

    public boolean m() {
        return (this.f505y & 4) != 0;
    }

    public boolean n() {
        return (this.f506z & 1) == 1;
    }

    public boolean o() {
        return (this.f506z & 2) == 2;
    }

    @Override // z.b, android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public z.b setActionView(int i7) {
        Context u7 = this.f494n.u();
        setActionView(LayoutInflater.from(u7).inflate(i7, (ViewGroup) new LinearLayout(u7), false));
        return this;
    }

    @Override // z.b, android.view.MenuItem
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public z.b setActionView(View view) {
        int i7;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i7 = this.f481a) > 0) {
            view.setId(i7);
        }
        this.f494n.I(this);
        return this;
    }

    public void r(boolean z7) {
        this.D = z7;
        this.f494n.K(false);
    }

    void s(boolean z7) {
        int i7 = this.f505y;
        int i8 = (z7 ? 2 : 0) | (i7 & (-3));
        this.f505y = i8;
        if (i7 != i8) {
            this.f494n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8) {
        if (this.f490j == c8) {
            return this;
        }
        this.f490j = Character.toLowerCase(c8);
        this.f494n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z7) {
        int i7 = this.f505y;
        int i8 = (z7 ? 1 : 0) | (i7 & (-2));
        this.f505y = i8;
        if (i7 != i8) {
            this.f494n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z7) {
        if ((this.f505y & 4) != 0) {
            this.f494n.T(this);
            return this;
        }
        s(z7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z7) {
        if (z7) {
            this.f505y |= 16;
        } else {
            this.f505y &= -17;
        }
        this.f494n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f493m = 0;
        this.f492l = drawable;
        this.f504x = true;
        this.f494n.K(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f500t = colorStateList;
        this.f502v = true;
        this.f504x = true;
        this.f494n.K(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f501u = mode;
        this.f503w = true;
        this.f504x = true;
        this.f494n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f487g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c8) {
        if (this.f488h == c8) {
            return this;
        }
        this.f488h = c8;
        this.f494n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f497q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9) {
        this.f488h = c8;
        this.f490j = Character.toLowerCase(c9);
        this.f494n.K(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public void setShowAsAction(int i7) {
        int i8 = i7 & 3;
        if (i8 != 0 && i8 != 1 && i8 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f506z = i7;
        this.f494n.I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f485e = charSequence;
        this.f494n.K(false);
        m mVar = this.f495o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f486f = charSequence;
        this.f494n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z7) {
        if (y(z7)) {
            this.f494n.J(this);
        }
        return this;
    }

    public void t(boolean z7) {
        this.f505y = (z7 ? 4 : 0) | (this.f505y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f485e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z7) {
        if (z7) {
            this.f505y |= 32;
        } else {
            this.f505y &= -33;
        }
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // z.b, android.view.MenuItem
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public z.b setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    public void x(m mVar) {
        this.f495o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z7) {
        int i7 = this.f505y;
        int i8 = (z7 ? 0 : 8) | (i7 & (-9));
        this.f505y = i8;
        return i7 != i8;
    }

    public boolean z() {
        return this.f494n.A();
    }

    @Override // android.view.MenuItem
    public z.b setContentDescription(CharSequence charSequence) {
        this.f498r = charSequence;
        this.f494n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public z.b setTooltipText(CharSequence charSequence) {
        this.f499s = charSequence;
        this.f494n.K(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8, int i7) {
        if (this.f490j == c8 && this.f491k == i7) {
            return this;
        }
        this.f490j = Character.toLowerCase(c8);
        this.f491k = KeyEvent.normalizeMetaState(i7);
        this.f494n.K(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c8, int i7) {
        if (this.f488h == c8 && this.f489i == i7) {
            return this;
        }
        this.f488h = c8;
        this.f489i = KeyEvent.normalizeMetaState(i7);
        this.f494n.K(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9, int i7, int i8) {
        this.f488h = c8;
        this.f489i = KeyEvent.normalizeMetaState(i7);
        this.f490j = Character.toLowerCase(c9);
        this.f491k = KeyEvent.normalizeMetaState(i8);
        this.f494n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i7) {
        this.f492l = null;
        this.f493m = i7;
        this.f504x = true;
        this.f494n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i7) {
        return setTitle(this.f494n.u().getString(i7));
    }
}
