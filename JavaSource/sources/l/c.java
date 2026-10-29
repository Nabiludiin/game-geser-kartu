package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.b;
import java.lang.reflect.Method;

/* compiled from: MyApplication */
public class c extends l.b implements MenuItem {

    /* renamed from: d, reason: collision with root package name */
    private final z.b f24575d;

    /* renamed from: e, reason: collision with root package name */
    private Method f24576e;

    /* compiled from: MyApplication */
    private class a extends androidx.core.view.b {

        /* renamed from: d, reason: collision with root package name */
        final ActionProvider f24577d;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f24577d = actionProvider;
        }

        @Override // androidx.core.view.b
        public boolean a() {
            return this.f24577d.hasSubMenu();
        }

        @Override // androidx.core.view.b
        public boolean d() {
            return this.f24577d.onPerformDefaultAction();
        }

        @Override // androidx.core.view.b
        public void e(SubMenu subMenu) {
            this.f24577d.onPrepareSubMenu(c.this.d(subMenu));
        }
    }

    /* compiled from: MyApplication */
    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: f, reason: collision with root package name */
        private b.InterfaceC0031b f24579f;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.b
        public boolean b() {
            return this.f24577d.isVisible();
        }

        @Override // androidx.core.view.b
        public View c(MenuItem menuItem) {
            return this.f24577d.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.b
        public boolean f() {
            return this.f24577d.overridesItemVisibility();
        }

        @Override // androidx.core.view.b
        public void i(b.InterfaceC0031b interfaceC0031b) {
            this.f24579f = interfaceC0031b;
            this.f24577d.setVisibilityListener(interfaceC0031b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z7) {
            b.InterfaceC0031b interfaceC0031b = this.f24579f;
            if (interfaceC0031b != null) {
                interfaceC0031b.onActionProviderVisibilityChanged(z7);
            }
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: l.c$c, reason: collision with other inner class name */
    static class C0104c extends FrameLayout implements k.c {

        /* renamed from: q, reason: collision with root package name */
        final CollapsibleActionView f24581q;

        /* JADX WARN: Multi-variable type inference failed */
        C0104c(View view) {
            super(view.getContext());
            this.f24581q = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f24581q;
        }

        @Override // k.c
        public void onActionViewCollapsed() {
            this.f24581q.onActionViewCollapsed();
        }

        @Override // k.c
        public void onActionViewExpanded() {
            this.f24581q.onActionViewExpanded();
        }
    }

    /* compiled from: MyApplication */
    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f24582a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f24582a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f24582a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f24582a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    /* compiled from: MyApplication */
    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f24584a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f24584a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f24584a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, z.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f24575d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f24575d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f24575d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        androidx.core.view.b b8 = this.f24575d.b();
        if (b8 instanceof a) {
            return ((a) b8).f24577d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f24575d.getActionView();
        return actionView instanceof C0104c ? ((C0104c) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f24575d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f24575d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f24575d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f24575d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f24575d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f24575d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f24575d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f24575d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f24575d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f24575d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f24575d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f24575d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f24575d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f24575d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f24575d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f24575d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f24575d.getTooltipText();
    }

    public void h(boolean z7) {
        try {
            if (this.f24576e == null) {
                this.f24576e = this.f24575d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f24576e.invoke(this.f24575d, Boolean.valueOf(z7));
        } catch (Exception e8) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e8);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f24575d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f24575d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f24575d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f24575d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f24575d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f24575d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f24572a, actionProvider);
        z.b bVar2 = this.f24575d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0104c(view);
        }
        this.f24575d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8) {
        this.f24575d.setAlphabeticShortcut(c8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z7) {
        this.f24575d.setCheckable(z7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z7) {
        this.f24575d.setChecked(z7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f24575d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z7) {
        this.f24575d.setEnabled(z7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f24575d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f24575d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f24575d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f24575d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c8) {
        this.f24575d.setNumericShortcut(c8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f24575d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f24575d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9) {
        this.f24575d.setShortcut(c8, c9);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i7) {
        this.f24575d.setShowAsAction(i7);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i7) {
        this.f24575d.setShowAsActionFlags(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f24575d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f24575d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f24575d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z7) {
        return this.f24575d.setVisible(z7);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8, int i7) {
        this.f24575d.setAlphabeticShortcut(c8, i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i7) {
        this.f24575d.setIcon(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c8, int i7) {
        this.f24575d.setNumericShortcut(c8, i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9, int i7, int i8) {
        this.f24575d.setShortcut(c8, c9, i7, i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i7) {
        this.f24575d.setTitle(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i7) {
        this.f24575d.setActionView(i7);
        View actionView = this.f24575d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f24575d.setActionView(new C0104c(actionView));
        }
        return this;
    }
}
