package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: MyApplication */
public class a implements z.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f24552a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24553b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24554c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f24555d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f24556e;

    /* renamed from: f, reason: collision with root package name */
    private Intent f24557f;

    /* renamed from: g, reason: collision with root package name */
    private char f24558g;

    /* renamed from: i, reason: collision with root package name */
    private char f24560i;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f24562k;

    /* renamed from: l, reason: collision with root package name */
    private Context f24563l;

    /* renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f24564m;

    /* renamed from: n, reason: collision with root package name */
    private CharSequence f24565n;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f24566o;

    /* renamed from: h, reason: collision with root package name */
    private int f24559h = 4096;

    /* renamed from: j, reason: collision with root package name */
    private int f24561j = 4096;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f24567p = null;

    /* renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f24568q = null;

    /* renamed from: r, reason: collision with root package name */
    private boolean f24569r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f24570s = false;

    /* renamed from: t, reason: collision with root package name */
    private int f24571t = 16;

    public a(Context context, int i7, int i8, int i9, int i10, CharSequence charSequence) {
        this.f24563l = context;
        this.f24552a = i8;
        this.f24553b = i7;
        this.f24554c = i10;
        this.f24555d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f24562k;
        if (drawable != null) {
            if (this.f24569r || this.f24570s) {
                Drawable p7 = androidx.core.graphics.drawable.a.p(drawable);
                this.f24562k = p7;
                Drawable mutate = p7.mutate();
                this.f24562k = mutate;
                if (this.f24569r) {
                    androidx.core.graphics.drawable.a.n(mutate, this.f24567p);
                }
                if (this.f24570s) {
                    androidx.core.graphics.drawable.a.o(this.f24562k, this.f24568q);
                }
            }
        }
    }

    @Override // z.b
    public z.b a(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // z.b
    public androidx.core.view.b b() {
        return null;
    }

    @Override // z.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // z.b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public z.b setActionView(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // z.b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public z.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // z.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // z.b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public z.b setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // z.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // z.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f24561j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f24560i;
    }

    @Override // z.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f24565n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f24553b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f24562k;
    }

    @Override // z.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f24567p;
    }

    @Override // z.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f24568q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f24557f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f24552a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // z.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f24559h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f24558g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f24554c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f24555d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f24556e;
        return charSequence != null ? charSequence : this.f24555d;
    }

    @Override // z.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f24566o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // z.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f24571t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f24571t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f24571t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f24571t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8) {
        this.f24560i = Character.toLowerCase(c8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z7) {
        this.f24571t = (z7 ? 1 : 0) | (this.f24571t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z7) {
        this.f24571t = (z7 ? 2 : 0) | (this.f24571t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z7) {
        this.f24571t = (z7 ? 16 : 0) | (this.f24571t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f24562k = drawable;
        c();
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f24567p = colorStateList;
        this.f24569r = true;
        c();
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f24568q = mode;
        this.f24570s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f24557f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c8) {
        this.f24558g = c8;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f24564m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9) {
        this.f24558g = c8;
        this.f24560i = Character.toLowerCase(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f24555d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f24556e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z7) {
        this.f24571t = (this.f24571t & 8) | (z7 ? 0 : 8);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8, int i7) {
        this.f24560i = Character.toLowerCase(c8);
        this.f24561j = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public z.b setContentDescription(CharSequence charSequence) {
        this.f24565n = charSequence;
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c8, int i7) {
        this.f24558g = c8;
        this.f24559h = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i7) {
        this.f24555d = this.f24563l.getResources().getString(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public z.b setTooltipText(CharSequence charSequence) {
        this.f24566o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i7) {
        this.f24562k = androidx.core.content.a.e(this.f24563l, i7);
        c();
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9, int i7, int i8) {
        this.f24558g = c8;
        this.f24559h = KeyEvent.normalizeMetaState(i7);
        this.f24560i = Character.toLowerCase(c9);
        this.f24561j = KeyEvent.normalizeMetaState(i8);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public void setShowAsAction(int i7) {
    }
}
