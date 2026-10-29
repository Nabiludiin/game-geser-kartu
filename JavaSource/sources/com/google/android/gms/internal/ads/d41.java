package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.List;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class d41 extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: q, reason: collision with root package name */
    private final Context f6917q;

    /* renamed from: r, reason: collision with root package name */
    private View f6918r;

    private d41(Context context) {
        super(context);
        this.f6917q = context;
    }

    public static d41 a(Context context, View view, c03 c03Var) {
        Resources resources;
        DisplayMetrics displayMetrics;
        d41 d41Var = new d41(context);
        List list = c03Var.f6190u;
        if (!list.isEmpty() && (resources = d41Var.f6917q.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f8 = ((d03) list.get(0)).f6890a;
            float f9 = displayMetrics.density;
            d41Var.setLayoutParams(new FrameLayout.LayoutParams((int) (f8 * f9), (int) (r4.f6891b * f9)));
        }
        d41Var.f6918r = view;
        d41Var.addView(view);
        r2.t.c();
        qm0.b(d41Var, d41Var);
        r2.t.c();
        qm0.a(d41Var, d41Var);
        JSONObject jSONObject = c03Var.f6165h0;
        RelativeLayout relativeLayout = new RelativeLayout(d41Var.f6917q);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            d41Var.b(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            d41Var.b(optJSONObject2, relativeLayout, 12);
        }
        d41Var.addView(relativeLayout);
        return d41Var;
    }

    private final void b(JSONObject jSONObject, RelativeLayout relativeLayout, int i7) {
        TextView textView = new TextView(this.f6917q);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int c8 = c(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, c8, 0, c8);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, c(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i7);
        relativeLayout.addView(textView, layoutParams);
    }

    private final int c(double d8) {
        s2.z.a();
        return w2.g.c(this.f6917q, (int) d8);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.f6918r.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.f6918r.setY(-r0[1]);
    }
}
