package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class ab3 implements xa3 {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f4858a = new int[2];

    @Override // com.google.android.gms.internal.ads.xa3
    public final JSONObject a(View view) {
        if (view == null) {
            return hb3.b(0, 0, 0, 0);
        }
        int[] iArr = this.f4858a;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        return hb3.b(iArr[0], iArr[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.xa3
    public final void b(View view, JSONObject jSONObject, wa3 wa3Var, boolean z7, boolean z8) {
        int i7;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z7) {
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    wa3Var.a(viewGroup.getChildAt(i8), this, jSONObject, z8);
                }
                return;
            }
            HashMap hashMap = new HashMap();
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                View childAt = viewGroup.getChildAt(i9);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                ArrayList arrayList3 = (ArrayList) hashMap.get((Float) arrayList2.get(i10));
                int size2 = arrayList3.size();
                int i11 = 0;
                while (true) {
                    i7 = i10 + 1;
                    if (i11 < size2) {
                        wa3Var.a((View) arrayList3.get(i11), this, jSONObject, z8);
                        i11++;
                    }
                }
                i10 = i7;
            }
        }
    }
}
