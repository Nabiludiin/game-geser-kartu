package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: MyApplication */
public final class pb3 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f13781a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f13782b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f13783c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f13784d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet f13785e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet f13786f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f13787g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final HashSet f13788h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    private final Map f13789i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    private boolean f13790j;

    public final HashSet a() {
        return this.f13785e;
    }

    public final HashSet b() {
        return this.f13786f;
    }

    public final String c(String str) {
        return (String) this.f13787g.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        Boolean bool;
        Activity activity;
        ka3 a8 = ka3.a();
        if (a8 != null) {
            for (q93 q93Var : a8.f()) {
                View i7 = q93Var.i();
                if (q93Var.j()) {
                    String h8 = q93Var.h();
                    if (i7 != null) {
                        boolean z7 = false;
                        String str = null;
                        if (Build.VERSION.SDK_INT >= 24) {
                            Context context = i7.getContext();
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    activity = null;
                                    break;
                                } else {
                                    if (context instanceof Activity) {
                                        activity = (Activity) context;
                                        break;
                                    }
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            if (activity != null) {
                                z7 = activity.isInPictureInPictureMode();
                            }
                        }
                        if (z7) {
                            this.f13788h.add(h8);
                        }
                        if (i7.isAttachedToWindow()) {
                            if (i7.hasWindowFocus()) {
                                this.f13789i.remove(i7);
                                bool = Boolean.FALSE;
                            } else {
                                Map map = this.f13789i;
                                if (map.containsKey(i7)) {
                                    bool = (Boolean) map.get(i7);
                                } else {
                                    Boolean bool2 = Boolean.FALSE;
                                    map.put(i7, bool2);
                                    bool = bool2;
                                }
                            }
                            if (!bool.booleanValue() || z7) {
                                HashSet hashSet = new HashSet();
                                View view = i7;
                                while (true) {
                                    if (view == null) {
                                        this.f13784d.addAll(hashSet);
                                        break;
                                    }
                                    String a9 = mb3.a(view);
                                    if (a9 != null) {
                                        str = a9;
                                        break;
                                    } else {
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.f13785e.add(h8);
                            this.f13781a.put(i7, h8);
                            for (na3 na3Var : q93Var.f()) {
                                View view2 = (View) na3Var.a().get();
                                if (view2 != null) {
                                    HashMap hashMap = this.f13782b;
                                    nb3 nb3Var = (nb3) hashMap.get(view2);
                                    if (nb3Var != null) {
                                        nb3Var.a(q93Var.h());
                                    } else {
                                        hashMap.put(view2, new nb3(na3Var, q93Var.h()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f13786f.add(h8);
                            this.f13783c.put(h8, i7);
                            this.f13787g.put(h8, str);
                        }
                    } else {
                        this.f13786f.add(h8);
                        this.f13787g.put(h8, "noAdView");
                    }
                }
            }
        }
    }

    public final void e() {
        this.f13781a.clear();
        this.f13782b.clear();
        this.f13783c.clear();
        this.f13784d.clear();
        this.f13785e.clear();
        this.f13786f.clear();
        this.f13787g.clear();
        this.f13790j = false;
        this.f13788h.clear();
    }

    public final void f() {
        this.f13790j = true;
    }

    public final String g(View view) {
        HashMap hashMap = this.f13781a;
        if (hashMap.size() == 0) {
            return null;
        }
        String str = (String) hashMap.get(view);
        if (str != null) {
            hashMap.remove(view);
        }
        return str;
    }

    public final View h(String str) {
        return (View) this.f13783c.get(str);
    }

    public final nb3 i(View view) {
        HashMap hashMap = this.f13782b;
        nb3 nb3Var = (nb3) hashMap.get(view);
        if (nb3Var != null) {
            hashMap.remove(view);
        }
        return nb3Var;
    }

    public final boolean j(View view) {
        Map map = this.f13789i;
        if (!map.containsKey(view)) {
            return true;
        }
        map.put(view, Boolean.TRUE);
        return false;
    }

    public final boolean k(String str) {
        return this.f13788h.contains(str);
    }

    public final int l(View view) {
        if (this.f13784d.contains(view)) {
            return 1;
        }
        return this.f13790j ? 2 : 3;
    }
}
