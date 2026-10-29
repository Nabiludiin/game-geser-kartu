package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.r1;
import androidx.appcompat.widget.u0;
import androidx.core.view.t;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: MyApplication */
public class g extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    static final Class[] f24283e;

    /* renamed from: f, reason: collision with root package name */
    static final Class[] f24284f;

    /* renamed from: a, reason: collision with root package name */
    final Object[] f24285a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f24286b;

    /* renamed from: c, reason: collision with root package name */
    Context f24287c;

    /* renamed from: d, reason: collision with root package name */
    private Object f24288d;

    /* compiled from: MyApplication */
    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        private static final Class[] f24289c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        private Object f24290a;

        /* renamed from: b, reason: collision with root package name */
        private Method f24291b;

        public a(Object obj, String str) {
            this.f24290a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f24291b = cls.getMethod(str, f24289c);
            } catch (Exception e8) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e8);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f24291b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f24291b.invoke(this.f24290a, menuItem)).booleanValue();
                }
                this.f24291b.invoke(this.f24290a, menuItem);
                return true;
            } catch (Exception e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    /* compiled from: MyApplication */
    private class b {
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a, reason: collision with root package name */
        private Menu f24292a;

        /* renamed from: b, reason: collision with root package name */
        private int f24293b;

        /* renamed from: c, reason: collision with root package name */
        private int f24294c;

        /* renamed from: d, reason: collision with root package name */
        private int f24295d;

        /* renamed from: e, reason: collision with root package name */
        private int f24296e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f24297f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f24298g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f24299h;

        /* renamed from: i, reason: collision with root package name */
        private int f24300i;

        /* renamed from: j, reason: collision with root package name */
        private int f24301j;

        /* renamed from: k, reason: collision with root package name */
        private CharSequence f24302k;

        /* renamed from: l, reason: collision with root package name */
        private CharSequence f24303l;

        /* renamed from: m, reason: collision with root package name */
        private int f24304m;

        /* renamed from: n, reason: collision with root package name */
        private char f24305n;

        /* renamed from: o, reason: collision with root package name */
        private int f24306o;

        /* renamed from: p, reason: collision with root package name */
        private char f24307p;

        /* renamed from: q, reason: collision with root package name */
        private int f24308q;

        /* renamed from: r, reason: collision with root package name */
        private int f24309r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f24310s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f24311t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f24312u;

        /* renamed from: v, reason: collision with root package name */
        private int f24313v;

        /* renamed from: w, reason: collision with root package name */
        private int f24314w;

        /* renamed from: x, reason: collision with root package name */
        private String f24315x;

        /* renamed from: y, reason: collision with root package name */
        private String f24316y;

        /* renamed from: z, reason: collision with root package name */
        private String f24317z;

        public b(Menu menu) {
            this.f24292a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f24287c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e8) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e8);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z7 = false;
            menuItem.setChecked(this.f24310s).setVisible(this.f24311t).setEnabled(this.f24312u).setCheckable(this.f24309r >= 1).setTitleCondensed(this.f24303l).setIcon(this.f24304m);
            int i7 = this.f24313v;
            if (i7 >= 0) {
                menuItem.setShowAsAction(i7);
            }
            if (this.f24317z != null) {
                if (g.this.f24287c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f24317z));
            }
            if (this.f24309r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof l.c) {
                    ((l.c) menuItem).h(true);
                }
            }
            String str = this.f24315x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f24283e, g.this.f24285a));
                z7 = true;
            }
            int i8 = this.f24314w;
            if (i8 > 0) {
                if (z7) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i8);
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                t.a(menuItem, bVar);
            }
            t.c(menuItem, this.B);
            t.g(menuItem, this.C);
            t.b(menuItem, this.f24305n, this.f24306o);
            t.f(menuItem, this.f24307p, this.f24308q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                t.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                t.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f24299h = true;
            i(this.f24292a.add(this.f24293b, this.f24300i, this.f24301j, this.f24302k));
        }

        public SubMenu b() {
            this.f24299h = true;
            SubMenu addSubMenu = this.f24292a.addSubMenu(this.f24293b, this.f24300i, this.f24301j, this.f24302k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f24299h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f24287c.obtainStyledAttributes(attributeSet, f.j.f23516o1);
            this.f24293b = obtainStyledAttributes.getResourceId(f.j.f23526q1, 0);
            this.f24294c = obtainStyledAttributes.getInt(f.j.f23536s1, 0);
            this.f24295d = obtainStyledAttributes.getInt(f.j.f23541t1, 0);
            this.f24296e = obtainStyledAttributes.getInt(f.j.f23546u1, 0);
            this.f24297f = obtainStyledAttributes.getBoolean(f.j.f23531r1, true);
            this.f24298g = obtainStyledAttributes.getBoolean(f.j.f23521p1, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            r1 t7 = r1.t(g.this.f24287c, attributeSet, f.j.f23551v1);
            this.f24300i = t7.m(f.j.f23566y1, 0);
            this.f24301j = (t7.j(f.j.B1, this.f24294c) & (-65536)) | (t7.j(f.j.C1, this.f24295d) & 65535);
            this.f24302k = t7.o(f.j.D1);
            this.f24303l = t7.o(f.j.E1);
            this.f24304m = t7.m(f.j.f23556w1, 0);
            this.f24305n = c(t7.n(f.j.F1));
            this.f24306o = t7.j(f.j.M1, 4096);
            this.f24307p = c(t7.n(f.j.G1));
            this.f24308q = t7.j(f.j.Q1, 4096);
            int i7 = f.j.H1;
            if (t7.r(i7)) {
                this.f24309r = t7.a(i7, false) ? 1 : 0;
            } else {
                this.f24309r = this.f24296e;
            }
            this.f24310s = t7.a(f.j.f23571z1, false);
            this.f24311t = t7.a(f.j.A1, this.f24297f);
            this.f24312u = t7.a(f.j.f23561x1, this.f24298g);
            this.f24313v = t7.j(f.j.R1, -1);
            this.f24317z = t7.n(f.j.I1);
            this.f24314w = t7.m(f.j.J1, 0);
            this.f24315x = t7.n(f.j.L1);
            String n7 = t7.n(f.j.K1);
            this.f24316y = n7;
            boolean z7 = n7 != null;
            if (z7 && this.f24314w == 0 && this.f24315x == null) {
                this.A = (androidx.core.view.b) e(n7, g.f24284f, g.this.f24286b);
            } else {
                if (z7) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = t7.o(f.j.N1);
            this.C = t7.o(f.j.S1);
            int i8 = f.j.P1;
            if (t7.r(i8)) {
                this.E = u0.d(t7.j(i8, -1), this.E);
            } else {
                this.E = null;
            }
            int i9 = f.j.O1;
            if (t7.r(i9)) {
                this.D = t7.c(i9);
            } else {
                this.D = null;
            }
            t7.v();
            this.f24299h = false;
        }

        public void h() {
            this.f24293b = 0;
            this.f24294c = 0;
            this.f24295d = 0;
            this.f24296e = 0;
            this.f24297f = true;
            this.f24298g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f24283e = clsArr;
        f24284f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f24287c = context;
        Object[] objArr = {context};
        this.f24285a = objArr;
        this.f24286b = objArr;
    }

    private Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r15 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r15 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r15.equals(r8) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r15.equals("group") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0.d() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r15 = r0.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r15 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r15.a() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r15.equals("menu") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if (r7 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r15.equals("group") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (r15.equals("item") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        if (r15.equals("menu") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:
    
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b7, code lost:
    
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r6 = false;
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r15 == 1) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
        /*
            r12 = this;
            k.g$b r0 = new k.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r6
            r8 = r5
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r7 = r4
            r8 = r5
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.d()
            if (r15 != 0) goto Lb9
            androidx.core.view.b r15 = r0.A
            if (r15 == 0) goto L82
            boolean r15 = r15.a()
            if (r15 == 0) goto L82
            r0.b()
            goto Lb9
        L82:
            r0.a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = r3
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.b()
            r12.c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = r3
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.g.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    Object b() {
        if (this.f24288d == null) {
            this.f24288d = a(this.f24287c);
        }
        return this.f24288d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i7, Menu menu) {
        if (!(menu instanceof z.a)) {
            super.inflate(i7, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f24287c.getResources().getLayout(i7);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (IOException e8) {
                    throw new InflateException("Error inflating menu XML", e8);
                }
            } catch (XmlPullParserException e9) {
                throw new InflateException("Error inflating menu XML", e9);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
