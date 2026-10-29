package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public final class t10 extends RelativeLayout {

    /* renamed from: r, reason: collision with root package name */
    private static final float[] f15938r = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: q, reason: collision with root package name */
    private AnimationDrawable f15939q;

    public t10(Context context, s10 s10Var, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        p3.o.m(s10Var);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f15938r, null, null));
        shapeDrawable.getPaint().setColor(s10Var.c());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(s10Var.b())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(s10Var.b());
            textView.setTextColor(s10Var.e());
            textView.setTextSize(s10Var.k8());
            s2.z.a();
            int c8 = w2.g.c(context, 4);
            s2.z.a();
            textView.setPadding(c8, 0, w2.g.c(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List h8 = s10Var.h();
        if (h8 != null && h8.size() > 1) {
            this.f15939q = new AnimationDrawable();
            Iterator it = h8.iterator();
            while (it.hasNext()) {
                try {
                    this.f15939q.addFrame((Drawable) w3.b.r0(((v10) it.next()).b()), s10Var.l8());
                } catch (Exception e8) {
                    int i7 = v2.n1.f26802b;
                    w2.p.d("Error while getting drawable.", e8);
                }
            }
            imageView.setBackground(this.f15939q);
        } else if (h8.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) w3.b.r0(((v10) h8.get(0)).b()));
            } catch (Exception e9) {
                int i8 = v2.n1.f26802b;
                w2.p.d("Error while getting drawable.", e9);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f15939q;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
