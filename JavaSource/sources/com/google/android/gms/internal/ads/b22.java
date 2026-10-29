package com.google.android.gms.internal.ads;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: MyApplication */
public final class b22 {
    b22() {
    }

    public static final void a(Context context, ViewGroup viewGroup, k2.i iVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout");
        f(linearLayout, -1, -1);
        linearLayout.setGravity(17);
        linearLayout.addView(iVar);
        iVar.setTag("ad_view");
        viewGroup.addView(linearLayout);
    }

    public static final void b(Context context, ViewGroup viewGroup, NativeAd nativeAd) {
        com.google.android.gms.ads.nativead.d dVar = new com.google.android.gms.ads.nativead.d(context);
        dVar.setTag("ad_view_tag");
        f(dVar, -1, -1);
        viewGroup.addView(dVar);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout_tag");
        linearLayout.setOrientation(1);
        f(linearLayout, -1, -1);
        linearLayout.setBackgroundColor(-1);
        dVar.addView(linearLayout);
        Resources h8 = r2.t.l().h();
        linearLayout.addView(c(context, h8 == null ? "Headline" : h8.getString(p2.d.f25092b), "headline_header_tag"));
        View d8 = d(context, iy3.a(nativeAd.b()), "headline_tag");
        dVar.setHeadlineView(d8);
        linearLayout.addView(d8);
        linearLayout.addView(c(context, h8 == null ? "Body" : h8.getString(p2.d.f25091a), "body_header_tag"));
        View d9 = d(context, iy3.a(nativeAd.a()), "body_tag");
        dVar.setBodyView(d9);
        linearLayout.addView(d9);
        linearLayout.addView(c(context, h8 == null ? "Media View" : h8.getString(p2.d.f25093c), "media_view_header_tag"));
        com.google.android.gms.ads.nativead.b bVar = new com.google.android.gms.ads.nativead.b(context);
        bVar.setTag("media_view_tag");
        dVar.setMediaView(bVar);
        linearLayout.addView(bVar);
        dVar.setNativeAd(nativeAd);
    }

    private static TextView c(Context context, String str, String str2) {
        return e(context, str, R.style.TextAppearance.Small, -9210245, 0.0f, str2);
    }

    private static TextView d(Context context, String str, String str2) {
        return e(context, str, R.style.TextAppearance.Medium, -16777216, 12.0f, str2);
    }

    private static TextView e(Context context, String str, int i7, int i8, float f8, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        f(textView, -2, -2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f8, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i7);
        textView.setTextColor(i8);
        textView.setText(str);
        return textView;
    }

    private static void f(View view, int i7, int i8) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i7;
        layoutParams2.width = i8;
        view.setLayoutParams(layoutParams2);
    }
}
