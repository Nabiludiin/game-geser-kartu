package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class za3 implements xa3 {

    /* renamed from: a, reason: collision with root package name */
    private final xa3 f20104a;

    public za3(xa3 xa3Var) {
        this.f20104a = xa3Var;
    }

    @Override // com.google.android.gms.internal.ads.xa3
    public final JSONObject a(View view) {
        JSONObject b8 = hb3.b(0, 0, 0, 0);
        int b9 = kb3.b();
        int i7 = b9 - 1;
        if (b9 == 0) {
            throw null;
        }
        try {
            b8.put("noOutputDevice", i7 == 0);
            return b8;
        } catch (JSONException e8) {
            ib3.a("Error with setting output device status", e8);
            return b8;
        }
    }

    @Override // com.google.android.gms.internal.ads.xa3
    public final void b(View view, JSONObject jSONObject, wa3 wa3Var, boolean z7, boolean z8) {
        ArrayList arrayList = new ArrayList();
        ka3 a8 = ka3.a();
        if (a8 != null) {
            Collection f8 = a8.f();
            int size = f8.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = f8.iterator();
            while (it.hasNext()) {
                View i7 = ((q93) it.next()).i();
                if (i7 != null && i7.isAttachedToWindow() && i7.isShown()) {
                    View view2 = i7;
                    while (true) {
                        if (view2 == null) {
                            View rootView = i7.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z9 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i8 = size2 - 1;
                                    if (((View) arrayList.get(i8)).getZ() <= z9) {
                                        break;
                                    } else {
                                        size2 = i8;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else if (view2.getAlpha() != 0.0f) {
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i9 = 0; i9 < size3; i9++) {
            wa3Var.a((View) arrayList.get(i9), this.f20104a, jSONObject, z8);
        }
    }
}
